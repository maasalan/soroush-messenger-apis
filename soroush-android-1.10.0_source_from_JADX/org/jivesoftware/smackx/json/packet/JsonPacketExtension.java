package org.jivesoftware.smackx.json.packet;

import org.jivesoftware.smack.packet.Stanza;

public class JsonPacketExtension extends AbstractJsonPacketExtension {
    public static final String ELEMENT = "json";
    public static final String NAMESPACE = "urn:xmpp:json:0";

    public JsonPacketExtension(String str) {
        super(str);
    }

    public static JsonPacketExtension from(Stanza stanza) {
        return (JsonPacketExtension) stanza.getExtension(ELEMENT, NAMESPACE);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }
}
