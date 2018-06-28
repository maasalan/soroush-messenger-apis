package org.jivesoftware.smackx.push_notifications.element;

import org.b.a.i;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.pubsub.Affiliation;

public class PushNotificationsElements {
    public static final String NAMESPACE = "urn:xmpp:push:0";

    public static class RemoteDisablingExtension implements ExtensionElement {
        public static final String ELEMENT = "pubsub";
        public static final String NAMESPACE = "http://jabber.org/protocol/pubsub";
        private final String node;
        private final i userJid;

        public RemoteDisablingExtension(String str, i iVar) {
            this.node = str;
            this.userJid = iVar;
        }

        public static RemoteDisablingExtension from(Message message) {
            return (RemoteDisablingExtension) message.getExtension("pubsub", "http://jabber.org/protocol/pubsub");
        }

        public String getElementName() {
            return "pubsub";
        }

        public String getNamespace() {
            return "http://jabber.org/protocol/pubsub";
        }

        public String getNode() {
            return this.node;
        }

        public i getUserJid() {
            return this.userJid;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(NodeElement.ELEMENT, this.node);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.halfOpenElement(Affiliation.ELEMENT);
            xmlStringBuilder.attribute(ParserUtils.JID, this.userJid);
            xmlStringBuilder.attribute(Affiliation.ELEMENT, PrivacyItem.SUBSCRIPTION_NONE);
            xmlStringBuilder.closeEmptyElement();
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }
}
