package org.jivesoftware.smackx.iot.data.element;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public class IoTFieldsExtension implements ExtensionElement {
    public static final String ELEMENT = "fields";
    public static final String NAMESPACE = "urn:xmpp:iot:sensordata";
    private final boolean done;
    private final List<NodeElement> nodes;
    private final int seqNr;

    public IoTFieldsExtension(int i, boolean z, List<NodeElement> list) {
        this.seqNr = i;
        this.done = z;
        this.nodes = Collections.unmodifiableList(list);
    }

    public IoTFieldsExtension(int i, boolean z, NodeElement nodeElement) {
        this(i, z, Collections.singletonList(nodeElement));
    }

    public static IoTFieldsExtension buildFor(int i, boolean z, NodeInfo nodeInfo, List<? extends IoTDataField> list) {
        return new IoTFieldsExtension(i, z, new NodeElement(nodeInfo, new TimestampElement(new Date(), list)));
    }

    public static IoTFieldsExtension from(Message message) {
        return (IoTFieldsExtension) message.getExtension(ELEMENT, "urn:xmpp:iot:sensordata");
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return "urn:xmpp:iot:sensordata";
    }

    public List<NodeElement> getNodes() {
        return this.nodes;
    }

    public int getSequenceNr() {
        return this.seqNr;
    }

    public boolean isDone() {
        return this.done;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute("seqnr", Integer.toString(this.seqNr));
        xmlStringBuilder.attribute("done", this.done);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.append(this.nodes);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
