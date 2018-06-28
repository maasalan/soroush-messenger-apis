package org.jivesoftware.smackx.address;

import java.util.ArrayList;
import java.util.Collection;
import org.b.a.b;
import org.b.a.e;
import org.b.a.f;
import org.b.a.i;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.FeatureNotSupportedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.address.packet.MultipleAddresses;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Type;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public class MultipleRecipientManager {

    private static class PacketCopy extends Stanza {
        private CharSequence text;

        public PacketCopy(CharSequence charSequence) {
            this.text = charSequence;
        }

        public String toString() {
            return toXML().toString();
        }

        public CharSequence toXML() {
            return this.text;
        }
    }

    private static b getMultipleRecipienServiceAddress(XMPPConnection xMPPConnection) {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).findService(MultipleAddresses.NAMESPACE, true);
    }

    public static MultipleRecipientInfo getMultipleRecipientInfo(Stanza stanza) {
        MultipleAddresses multipleAddresses = (MultipleAddresses) stanza.getExtension(MultipleAddresses.ELEMENT, MultipleAddresses.NAMESPACE);
        return multipleAddresses == null ? null : new MultipleRecipientInfo(multipleAddresses);
    }

    public static void reply(XMPPConnection xMPPConnection, Message message, Message message2) {
        MultipleRecipientInfo multipleRecipientInfo = getMultipleRecipientInfo(message);
        if (multipleRecipientInfo == null) {
            throw new SmackException("Original message does not contain multiple recipient info");
        } else if (multipleRecipientInfo.shouldNotReply()) {
            throw new SmackException("Original message should not be replied");
        } else if (multipleRecipientInfo.getReplyRoom() != null) {
            throw new SmackException("Reply should be sent through a room");
        } else {
            if (message.getThread() != null) {
                message2.setThread(message.getThread());
            }
            Address replyAddress = multipleRecipientInfo.getReplyAddress();
            if (replyAddress == null || replyAddress.getJid() == null) {
                Collection arrayList = new ArrayList(multipleRecipientInfo.getTOAddresses().size());
                Collection arrayList2 = new ArrayList(multipleRecipientInfo.getCCAddresses().size());
                for (Address jid : multipleRecipientInfo.getTOAddresses()) {
                    arrayList.add(jid.getJid());
                }
                for (Address replyAddress2 : multipleRecipientInfo.getCCAddresses()) {
                    arrayList2.add(replyAddress2.getJid());
                }
                if (!(arrayList.contains(message.getFrom()) || arrayList2.contains(message.getFrom()))) {
                    arrayList.add(message.getFrom());
                }
                f user = xMPPConnection.getUser();
                if (!(arrayList.remove(user) || arrayList2.remove(user))) {
                    e b = user.b();
                    arrayList.remove(b);
                    arrayList2.remove(b);
                }
                send(xMPPConnection, message2, arrayList, arrayList2, null, null, null, false);
                return;
            }
            message2.setTo(replyAddress2.getJid());
            xMPPConnection.sendStanza(message2);
        }
    }

    public static void send(XMPPConnection xMPPConnection, Stanza stanza, Collection<? extends i> collection, Collection<? extends i> collection2, Collection<? extends i> collection3) {
        send(xMPPConnection, stanza, collection, collection2, collection3, null, null, false);
    }

    public static void send(XMPPConnection xMPPConnection, Stanza stanza, Collection<? extends i> collection, Collection<? extends i> collection2, Collection<? extends i> collection3, i iVar, i iVar2, boolean z) {
        if (collection != null && collection.size() == 1 && ((collection2 == null || collection2.isEmpty()) && ((collection3 == null || collection3.isEmpty()) && !z && StringUtils.isNullOrEmpty((CharSequence) iVar) && StringUtils.isNullOrEmpty((CharSequence) iVar2)))) {
            Stanza stanza2 = stanza;
            stanza2.setTo((i) collection.iterator().next());
            xMPPConnection.sendStanza(stanza2);
            return;
        }
        stanza2 = stanza;
        b multipleRecipienServiceAddress = getMultipleRecipienServiceAddress(xMPPConnection);
        if (multipleRecipienServiceAddress != null) {
            sendThroughService(xMPPConnection, stanza2, collection, collection2, collection3, iVar, iVar2, z, multipleRecipienServiceAddress);
            return;
        }
        if (!z && iVar == null) {
            if (iVar2 == null) {
                sendToIndividualRecipients(xMPPConnection, stanza2, collection, collection2, collection3);
                return;
            }
        }
        throw new FeatureNotSupportedException("Extended Stanza Addressing");
    }

    private static void sendThroughService(XMPPConnection xMPPConnection, Stanza stanza, Collection<? extends i> collection, Collection<? extends i> collection2, Collection<? extends i> collection3, i iVar, i iVar2, boolean z, b bVar) {
        Stanza stanza2 = stanza;
        ExtensionElement multipleAddresses = new MultipleAddresses();
        if (collection != null) {
            for (i addAddress : collection) {
                ExtensionElement extensionElement = multipleAddresses;
                extensionElement.addAddress(Type.to, addAddress, null, null, false, null);
            }
        }
        if (collection2 != null) {
            for (i addAddress2 : collection2) {
                extensionElement = multipleAddresses;
                extensionElement.addAddress(Type.to, addAddress2, null, null, false, null);
            }
        }
        if (collection3 != null) {
            for (i addAddress22 : collection3) {
                extensionElement = multipleAddresses;
                extensionElement.addAddress(Type.bcc, addAddress22, null, null, false, null);
            }
        }
        if (z) {
            multipleAddresses.setNoReply();
        } else {
            if (iVar != null) {
                multipleAddresses.addAddress(Type.replyto, iVar, null, null, false, null);
            }
            if (iVar2 != null) {
                multipleAddresses.addAddress(Type.replyroom, iVar2, null, null, false, null);
            }
        }
        stanza2.setTo((i) bVar);
        stanza2.addExtension(multipleAddresses);
        xMPPConnection.sendStanza(stanza2);
    }

    private static void sendToIndividualRecipients(XMPPConnection xMPPConnection, Stanza stanza, Collection<? extends i> collection, Collection<? extends i> collection2, Collection<? extends i> collection3) {
        if (collection != null) {
            for (i to : collection) {
                stanza.setTo(to);
                xMPPConnection.sendStanza(new PacketCopy(stanza.toXML()));
            }
        }
        if (collection2 != null) {
            for (i to2 : collection2) {
                stanza.setTo(to2);
                xMPPConnection.sendStanza(new PacketCopy(stanza.toXML()));
            }
        }
        if (collection3 != null) {
            for (i to22 : collection3) {
                stanza.setTo(to22);
                xMPPConnection.sendStanza(new PacketCopy(stanza.toXML()));
            }
        }
    }
}
