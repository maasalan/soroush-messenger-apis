package org.jivesoftware.smackx.json.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.json.packet.AbstractJsonPacketExtension;
import org.xmlpull.v1.XmlPullParser;

public abstract class AbstractJsonExtensionProvider extends ExtensionElementProvider<AbstractJsonPacketExtension> {
    public abstract AbstractJsonPacketExtension from(String str);

    public AbstractJsonPacketExtension parse(XmlPullParser xmlPullParser, int i) {
        return from(PacketParserUtils.parseElementText(xmlPullParser));
    }
}
