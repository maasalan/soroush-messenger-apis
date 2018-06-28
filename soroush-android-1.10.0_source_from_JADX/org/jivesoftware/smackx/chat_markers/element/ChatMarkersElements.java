package org.jivesoftware.smackx.chat_markers.element;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public class ChatMarkersElements {
    public static final String NAMESPACE = "urn:xmpp:chat-markers:0";

    public static class AcknowledgedExtension implements ExtensionElement {
        public static final String ELEMENT = "acknowledged";
        private final String id;

        public AcknowledgedExtension(String str) {
            this.id = str;
        }

        public static AcknowledgedExtension from(Message message) {
            return (AcknowledgedExtension) message.getExtension(ELEMENT, ChatMarkersElements.NAMESPACE);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getId() {
            return this.id;
        }

        public String getNamespace() {
            return ChatMarkersElements.NAMESPACE;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(MessageCorrectExtension.ID_TAG, this.id);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class DisplayedExtension implements ExtensionElement {
        public static final String ELEMENT = "displayed";
        private final String id;

        public DisplayedExtension(String str) {
            this.id = str;
        }

        public static DisplayedExtension from(Message message) {
            return (DisplayedExtension) message.getExtension(ELEMENT, ChatMarkersElements.NAMESPACE);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getId() {
            return this.id;
        }

        public String getNamespace() {
            return ChatMarkersElements.NAMESPACE;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(MessageCorrectExtension.ID_TAG, this.id);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class MarkableExtension implements ExtensionElement {
        public static final String ELEMENT = "markable";

        public static MarkableExtension from(Message message) {
            return (MarkableExtension) message.getExtension(ELEMENT, ChatMarkersElements.NAMESPACE);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getNamespace() {
            return ChatMarkersElements.NAMESPACE;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class ReceivedExtension implements ExtensionElement {
        public static final String ELEMENT = "received";
        private final String id;

        public ReceivedExtension(String str) {
            this.id = str;
        }

        public static ReceivedExtension from(Message message) {
            return (ReceivedExtension) message.getExtension("received", ChatMarkersElements.NAMESPACE);
        }

        public String getElementName() {
            return "received";
        }

        public String getId() {
            return this.id;
        }

        public String getNamespace() {
            return ChatMarkersElements.NAMESPACE;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(MessageCorrectExtension.ID_TAG, this.id);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }
}
