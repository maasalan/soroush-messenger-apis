package org.jivesoftware.smackx.muclight.provider;

import java.util.HashMap;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.muclight.MUCLightRoomConfiguration;
import org.jivesoftware.smackx.muclight.element.MUCLightConfigurationIQ;
import org.xmlpull.v1.XmlPullParser;

public class MUCLightConfigurationIQProvider extends IQProvider<MUCLightConfigurationIQ> {
    public MUCLightConfigurationIQ parse(XmlPullParser xmlPullParser, int i) {
        String str = null;
        String str2 = null;
        HashMap hashMap = str2;
        String str3 = hashMap;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("version")) {
                    str3 = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().equals("roomname")) {
                    str = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().equals("subject")) {
                    str2 = xmlPullParser.nextText();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == i) {
                return new MUCLightConfigurationIQ(str3, new MUCLightRoomConfiguration(str, str2, hashMap));
            }
        }
    }
}
