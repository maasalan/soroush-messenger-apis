package org.jivesoftware.smackx.muclight.provider;

import java.util.HashMap;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.ConfigurationsChangeExtension;
import org.xmlpull.v1.XmlPullParser;

public class MUCLightConfigurationsChangeProvider extends ExtensionElementProvider<ConfigurationsChangeExtension> {
    public ConfigurationsChangeExtension parse(XmlPullParser xmlPullParser, int i) {
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        HashMap hashMap = str4;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("prev-version")) {
                    str = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().equals("version")) {
                    str2 = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().equals("roomname")) {
                    str3 = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().equals("subject")) {
                    str4 = xmlPullParser.nextText();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == i) {
                return new ConfigurationsChangeExtension(str, str2, str3, str4, hashMap);
            }
        }
    }
}
