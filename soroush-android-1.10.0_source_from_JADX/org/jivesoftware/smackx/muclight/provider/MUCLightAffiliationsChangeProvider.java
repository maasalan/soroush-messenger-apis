package org.jivesoftware.smackx.muclight.provider;

import java.util.HashMap;
import org.b.a.a.d;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.AffiliationsChangeExtension;
import org.jivesoftware.smackx.pubsub.Affiliation;
import org.xmlpull.v1.XmlPullParser;

public class MUCLightAffiliationsChangeProvider extends ExtensionElementProvider<AffiliationsChangeExtension> {
    public AffiliationsChangeExtension parse(XmlPullParser xmlPullParser, int i) {
        HashMap hashMap = new HashMap();
        String str = null;
        String str2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("prev-version")) {
                    str = xmlPullParser.nextText();
                }
                if (xmlPullParser.getName().equals("version")) {
                    str2 = xmlPullParser.nextText();
                }
                if (xmlPullParser.getName().equals("user")) {
                    hashMap.put(d.a(xmlPullParser.nextText()), MUCLightAffiliation.fromString(xmlPullParser.getAttributeValue("", Affiliation.ELEMENT)));
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == i) {
                return new AffiliationsChangeExtension(hashMap, str, str2);
            }
        }
    }
}
