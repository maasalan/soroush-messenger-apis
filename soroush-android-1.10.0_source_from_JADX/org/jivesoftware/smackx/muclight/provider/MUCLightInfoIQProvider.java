package org.jivesoftware.smackx.muclight.provider;

import java.util.HashMap;
import org.b.a.a.d;
import org.b.a.i;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.MUCLightRoomConfiguration;
import org.jivesoftware.smackx.muclight.element.MUCLightInfoIQ;
import org.jivesoftware.smackx.pubsub.Affiliation;
import org.xmlpull.v1.XmlPullParser;

public class MUCLightInfoIQProvider extends IQProvider<MUCLightInfoIQ> {
    private HashMap<i, MUCLightAffiliation> iterateOccupants(XmlPullParser xmlPullParser) {
        HashMap<i, MUCLightAffiliation> hashMap = new HashMap();
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("user")) {
                    hashMap.put(d.a(xmlPullParser.nextText()), MUCLightAffiliation.fromString(xmlPullParser.getAttributeValue("", Affiliation.ELEMENT)));
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == depth) {
                return hashMap;
            }
        }
    }

    public MUCLightInfoIQ parse(XmlPullParser xmlPullParser, int i) {
        String str = null;
        HashMap hashMap = new HashMap();
        String str2 = null;
        String str3 = str2;
        HashMap hashMap2 = str3;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("version")) {
                    str = xmlPullParser.nextText();
                }
                if (xmlPullParser.getName().equals("configuration")) {
                    next = xmlPullParser.getDepth();
                    while (true) {
                        int next2 = xmlPullParser.next();
                        if (next2 != 2) {
                            if (next2 == 3 && xmlPullParser.getDepth() == next) {
                                break;
                            }
                        } else if (xmlPullParser.getName().equals("roomname")) {
                            str2 = xmlPullParser.nextText();
                        } else if (xmlPullParser.getName().equals("subject")) {
                            str3 = xmlPullParser.nextText();
                        } else {
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            hashMap2.put(xmlPullParser.getName(), xmlPullParser.nextText());
                        }
                    }
                }
                if (xmlPullParser.getName().equals("occupants")) {
                    hashMap = iterateOccupants(xmlPullParser);
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == i) {
                return new MUCLightInfoIQ(str, new MUCLightRoomConfiguration(str2, str3, hashMap2), hashMap);
            }
        }
    }
}
