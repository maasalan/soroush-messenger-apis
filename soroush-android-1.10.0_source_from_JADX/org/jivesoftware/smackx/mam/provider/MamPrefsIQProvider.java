package org.jivesoftware.smackx.mam.provider;

import java.util.ArrayList;
import java.util.List;
import org.b.a.a.d;
import org.b.a.i;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.mam.element.MamPrefsIQ;
import org.jivesoftware.smackx.mam.element.MamPrefsIQ.DefaultBehavior;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MamPrefsIQProvider extends IQProvider<MamPrefsIQ> {
    private static List<i> iterateJids(XmlPullParser xmlPullParser) {
        List arrayList = new ArrayList();
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            switch (next) {
                case 2:
                    Object obj = -1;
                    if (name.hashCode() == 105221) {
                        if (name.equals(ParserUtils.JID)) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        xmlPullParser.next();
                        arrayList.add(d.a(xmlPullParser.getText()));
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return arrayList;
                default:
                    break;
            }
        }
    }

    public MamPrefsIQ parse(XmlPullParser xmlPullParser, int i) {
        xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
        String attributeValue = xmlPullParser.getAttributeValue("", "default");
        List list = null;
        DefaultBehavior valueOf = attributeValue != null ? DefaultBehavior.valueOf(attributeValue) : null;
        List list2 = null;
        while (true) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            switch (next) {
                case 2:
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -1414557169) {
                        if (hashCode == 104712844) {
                            if (name.equals("never")) {
                                obj = 1;
                            }
                        }
                    } else if (name.equals("always")) {
                        obj = null;
                    }
                    switch (obj) {
                        case null:
                            list = iterateJids(xmlPullParser);
                            break;
                        case 1:
                            list2 = iterateJids(xmlPullParser);
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return new MamPrefsIQ(list, list2, valueOf);
                default:
                    break;
            }
        }
    }
}
