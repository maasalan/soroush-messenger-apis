package org.jivesoftware.smackx.address.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.address.packet.MultipleAddresses;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Type;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MultipleAddressesProvider extends ExtensionElementProvider<MultipleAddresses> {
    public MultipleAddresses parse(XmlPullParser xmlPullParser, int i) {
        MultipleAddresses multipleAddresses = new MultipleAddresses();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    if (name.hashCode() == -1147692044) {
                        if (name.equals(Address.ELEMENT)) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        multipleAddresses.addAddress(Type.valueOf(xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE)), ParserUtils.getJidAttribute(xmlPullParser, ParserUtils.JID), xmlPullParser.getAttributeValue("", NodeElement.ELEMENT), xmlPullParser.getAttributeValue("", "desc"), "true".equals(xmlPullParser.getAttributeValue("", "delivered")), xmlPullParser.getAttributeValue("", "uri"));
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return multipleAddresses;
                default:
                    break;
            }
        }
    }
}
