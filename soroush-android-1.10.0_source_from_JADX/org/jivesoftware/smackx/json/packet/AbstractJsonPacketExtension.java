package org.jivesoftware.smackx.json.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public abstract class AbstractJsonPacketExtension implements ExtensionElement {
    private final String json;

    protected AbstractJsonPacketExtension(String str) {
        this.json = str;
    }

    public final String getJson() {
        return this.json;
    }

    public final XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.append(this.json);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
