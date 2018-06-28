package org.jivesoftware.smackx.disco.provider;

import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Xml;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class DiscoverInfoProvider extends IQProvider<DiscoverInfo> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public DiscoverInfo parse(XmlPullParser xmlPullParser, int i) {
        Stanza discoverInfo = new DiscoverInfo();
        String str = "";
        String str2 = "";
        discoverInfo.setNode(xmlPullParser.getAttributeValue("", NodeElement.ELEMENT));
        String str3 = "";
        String str4 = "";
        String str5 = "";
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (xmlPullParser.getNamespace().equals(DiscoverInfo.NAMESPACE)) {
                    Object obj2 = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -979207434) {
                        if (hashCode == -135761730) {
                            if (name.equals("identity")) {
                                obj2 = null;
                            }
                        }
                    } else if (name.equals("feature")) {
                        obj2 = 1;
                    }
                    switch (obj2) {
                        case null:
                            str5 = xmlPullParser.getAttributeValue("", "category");
                            str4 = xmlPullParser.getAttributeValue("", "name");
                            str = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
                            str2 = xmlPullParser.getAttributeValue(xmlPullParser.getNamespace(Xml.ELEMENT), "lang");
                            break;
                        case 1:
                            str3 = xmlPullParser.getAttributeValue("", "var");
                            break;
                        default:
                            break;
                    }
                }
                PacketParserUtils.addExtensionElement(discoverInfo, xmlPullParser);
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("identity")) {
                    discoverInfo.addIdentity(new Identity(str5, str, str4, str2));
                }
                if (xmlPullParser.getName().equals("feature")) {
                    discoverInfo.addFeature(str3);
                }
                if (xmlPullParser.getName().equals("query")) {
                    obj = 1;
                }
            }
        }
        return discoverInfo;
    }
}
