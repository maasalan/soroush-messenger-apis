package org.jivesoftware.smackx.gcm.packet;

import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.json.packet.AbstractJsonPacketExtension;

public class GcmPacketExtension extends AbstractJsonPacketExtension {
    public static final String ELEMENT = "gcm";
    public static final String NAMESPACE = "google:mobile:data";

    public GcmPacketExtension(String str) {
        super(str);
    }

    public static GcmPacketExtension from(Stanza stanza) {
        return (GcmPacketExtension) stanza.getExtension(ELEMENT, NAMESPACE);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }
}
