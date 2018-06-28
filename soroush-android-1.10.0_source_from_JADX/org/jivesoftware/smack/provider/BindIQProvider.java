package org.jivesoftware.smack.provider;

import org.b.a.b.d;
import org.jivesoftware.smack.packet.Bind;
import org.jivesoftware.smack.util.ParserUtils;
import org.xmlpull.v1.XmlPullParser;

public class BindIQProvider extends IQProvider<Bind> {
    public Bind parse(XmlPullParser xmlPullParser, int i) {
        Bind bind = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -341064690) {
                        if (hashCode == 105221) {
                            if (name.equals(ParserUtils.JID)) {
                                obj = 1;
                            }
                        }
                    } else if (name.equals("resource")) {
                        obj = null;
                    }
                    switch (obj) {
                        case null:
                            bind = Bind.newSet(d.a(xmlPullParser.nextText()));
                            break;
                        case 1:
                            bind = Bind.newResult(org.b.a.a.d.d(xmlPullParser.nextText()));
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return bind;
                default:
                    break;
            }
        }
    }
}
