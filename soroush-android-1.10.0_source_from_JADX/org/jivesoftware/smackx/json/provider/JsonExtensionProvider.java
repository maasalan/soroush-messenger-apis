package org.jivesoftware.smackx.json.provider;

import org.jivesoftware.smackx.json.packet.AbstractJsonPacketExtension;
import org.jivesoftware.smackx.json.packet.JsonPacketExtension;

public class JsonExtensionProvider extends AbstractJsonExtensionProvider {
    public AbstractJsonPacketExtension from(String str) {
        return new JsonPacketExtension(str);
    }
}
