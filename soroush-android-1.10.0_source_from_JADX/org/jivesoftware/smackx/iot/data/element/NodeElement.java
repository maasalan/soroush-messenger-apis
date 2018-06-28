package org.jivesoftware.smackx.iot.data.element;

import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public class NodeElement implements NamedElement {
    public static final String ELEMENT = "node";
    private final NodeInfo nodeInfo;
    private final List<TimestampElement> timestampElements;

    public NodeElement(NodeInfo nodeInfo, List<TimestampElement> list) {
        this.nodeInfo = nodeInfo;
        this.timestampElements = Collections.unmodifiableList(list);
    }

    public NodeElement(NodeInfo nodeInfo, TimestampElement timestampElement) {
        this(nodeInfo, Collections.singletonList(timestampElement));
    }

    public String getElementName() {
        return ELEMENT;
    }

    public List<TimestampElement> getTimestampElements() {
        return this.timestampElements;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        this.nodeInfo.appendTo(xmlStringBuilder);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.append(this.timestampElements);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
