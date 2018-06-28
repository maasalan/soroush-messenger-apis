package org.jivesoftware.smackx.pubsub;

import java.util.Arrays;
import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;

public class EventElement implements EmbeddedPacketExtension {
    public static final String ELEMENT = "event";
    public static final String NAMESPACE = PubSubNamespace.EVENT.getXmlns();
    private NodeExtension ext;
    private EventElementType type;

    public EventElement(EventElementType eventElementType, NodeExtension nodeExtension) {
        this.type = eventElementType;
        this.ext = nodeExtension;
    }

    public static EventElement from(Stanza stanza) {
        return (EventElement) stanza.getExtension(ELEMENT, NAMESPACE);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public NodeExtension getEvent() {
        return this.ext;
    }

    public EventElementType getEventType() {
        return this.type;
    }

    public List<ExtensionElement> getExtensions() {
        return Arrays.asList(new ExtensionElement[]{getEvent()});
    }

    public String getNamespace() {
        return PubSubNamespace.EVENT.getXmlns();
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.append(this.ext.toXML());
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
