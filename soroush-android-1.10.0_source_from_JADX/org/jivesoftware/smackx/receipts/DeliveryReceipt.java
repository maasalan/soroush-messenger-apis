package org.jivesoftware.smackx.receipts;

import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.provider.EmbeddedExtensionProvider;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public class DeliveryReceipt implements ExtensionElement {
    public static final String ELEMENT = "received";
    public static final String NAMESPACE = "urn:xmpp:receipts";
    private final String id;

    public static class Provider extends EmbeddedExtensionProvider<DeliveryReceipt> {
        protected DeliveryReceipt createReturnExtension(String str, String str2, Map<String, String> map, List<? extends ExtensionElement> list) {
            return new DeliveryReceipt((String) map.get(MessageCorrectExtension.ID_TAG));
        }
    }

    public DeliveryReceipt(String str) {
        this.id = (String) StringUtils.requireNotNullOrEmpty(str, "id must not be null");
    }

    public static DeliveryReceipt from(Message message) {
        return (DeliveryReceipt) message.getExtension("received", NAMESPACE);
    }

    @Deprecated
    public static DeliveryReceipt getFrom(Message message) {
        return from(message);
    }

    public String getElementName() {
        return "received";
    }

    public String getId() {
        return this.id;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute(MessageCorrectExtension.ID_TAG, this.id);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
