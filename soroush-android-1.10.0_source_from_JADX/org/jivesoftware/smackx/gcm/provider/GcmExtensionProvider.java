package org.jivesoftware.smackx.gcm.provider;

import org.jivesoftware.smackx.gcm.packet.GcmPacketExtension;
import org.jivesoftware.smackx.json.packet.AbstractJsonPacketExtension;
import org.jivesoftware.smackx.json.provider.AbstractJsonExtensionProvider;

public class GcmExtensionProvider extends AbstractJsonExtensionProvider {
    public AbstractJsonPacketExtension from(String str) {
        return new GcmPacketExtension(str);
    }
}
