package org.jivesoftware.smackx.muclight.provider;

import java.util.HashMap;
import org.b.a.a.d;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.element.MUCLightAffiliationsIQ;
import org.jivesoftware.smackx.pubsub.Affiliation;
import org.xmlpull.v1.XmlPullParser;

public class MUCLightAffiliationsIQProvider extends IQProvider<MUCLightAffiliationsIQ> {
    public MUCLightAffiliationsIQ parse(XmlPullParser xmlPullParser, int i) {
        HashMap hashMap = new HashMap();
        String str = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("version")) {
                    str = xmlPullParser.nextText();
                }
                if (xmlPullParser.getName().equals("user")) {
                    hashMap.put(d.a(xmlPullParser.nextText()), MUCLightAffiliation.fromString(xmlPullParser.getAttributeValue("", Affiliation.ELEMENT)));
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == i) {
                return new MUCLightAffiliationsIQ(str, hashMap);
            }
        }
    }
}
