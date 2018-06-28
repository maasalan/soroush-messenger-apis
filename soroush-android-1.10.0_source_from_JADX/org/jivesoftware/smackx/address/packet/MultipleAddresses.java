package org.jivesoftware.smackx.address.packet;

import java.util.ArrayList;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MultipleAddresses implements ExtensionElement {
    public static final String ELEMENT = "addresses";
    public static final String NAMESPACE = "http://jabber.org/protocol/address";
    private List<Address> addresses = new ArrayList();

    public enum Type {
        bcc,
        cc,
        noreply,
        replyroom,
        replyto,
        to,
        ofrom
    }

    public static final class Address implements NamedElement {
        public static final String ELEMENT = "address";
        private boolean delivered;
        private String description;
        private i jid;
        private String node;
        private final Type type;
        private String uri;

        private Address(Type type) {
            this.type = type;
        }

        private void setDelivered(boolean z) {
            this.delivered = z;
        }

        private void setDescription(String str) {
            this.description = str;
        }

        private void setJid(i iVar) {
            this.jid = iVar;
        }

        private void setNode(String str) {
            this.node = str;
        }

        private void setUri(String str) {
            this.uri = str;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getElementName() {
            return ELEMENT;
        }

        public final i getJid() {
            return this.jid;
        }

        public final String getNode() {
            return this.node;
        }

        public final Type getType() {
            return this.type;
        }

        public final String getUri() {
            return this.uri;
        }

        public final boolean isDelivered() {
            return this.delivered;
        }

        public final XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement((NamedElement) this).attribute(IjkMediaMeta.IJKM_KEY_TYPE, this.type);
            xmlStringBuilder.optAttribute(ParserUtils.JID, this.jid);
            xmlStringBuilder.optAttribute(NodeElement.ELEMENT, this.node);
            xmlStringBuilder.optAttribute("desc", this.description);
            if (this.description != null && this.description.trim().length() > 0) {
                xmlStringBuilder.append((CharSequence) " desc=\"");
                xmlStringBuilder.append(this.description).append('\"');
            }
            xmlStringBuilder.optBooleanAttribute("delivered", this.delivered);
            xmlStringBuilder.optAttribute("uri", this.uri);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public void addAddress(Type type, i iVar, String str, String str2, boolean z, String str3) {
        Address address = new Address(type);
        address.setJid(iVar);
        address.setNode(str);
        address.setDescription(str2);
        address.setDelivered(z);
        address.setUri(str3);
        this.addresses.add(address);
    }

    public List<Address> getAddressesOfType(Type type) {
        List<Address> arrayList = new ArrayList(this.addresses.size());
        for (Address address : this.addresses) {
            if (address.getType().equals(type)) {
                arrayList.add(address);
            }
        }
        return arrayList;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public void setNoReply() {
        this.addresses.add(new Address(Type.noreply));
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        for (Address toXML : this.addresses) {
            xmlStringBuilder.append(toXML.toXML());
        }
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
