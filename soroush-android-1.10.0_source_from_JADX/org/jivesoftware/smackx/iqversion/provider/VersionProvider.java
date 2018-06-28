package org.jivesoftware.smackx.iqversion.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iqversion.packet.Version;
import org.xmlpull.v1.XmlPullParser;

public class VersionProvider extends IQProvider<Version> {
    public Version parse(XmlPullParser xmlPullParser, int i) {
        String str = null;
        String str2 = null;
        String str3 = str2;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != 3556) {
                        if (hashCode != 3373707) {
                            if (hashCode == 351608024) {
                                if (name.equals("version")) {
                                    obj = 1;
                                }
                            }
                        } else if (name.equals("name")) {
                            obj = null;
                        }
                    } else if (name.equals("os")) {
                        obj = 2;
                    }
                    switch (obj) {
                        case null:
                            str = xmlPullParser.nextText();
                            break;
                        case 1:
                            str2 = xmlPullParser.nextText();
                            break;
                        case 2:
                            str3 = xmlPullParser.nextText();
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        continue;
                    } else if (!xmlPullParser.getName().equals("query")) {
                        break;
                    } else {
                        return (str == null && str2 == null && str3 == null) ? new Version() : new Version(str, str2, str3);
                    }
                default:
                    break;
            }
        }
    }
}
