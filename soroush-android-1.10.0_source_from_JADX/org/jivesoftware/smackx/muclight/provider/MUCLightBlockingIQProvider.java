package org.jivesoftware.smackx.muclight.provider;

import java.util.HashMap;
import org.b.a.a.d;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;
import org.jivesoftware.smackx.muclight.element.MUCLightBlockingIQ;
import org.xmlpull.v1.XmlPullParser;

public class MUCLightBlockingIQProvider extends IQProvider<MUCLightBlockingIQ> {
    private HashMap<i, Boolean> parseBlocking(XmlPullParser xmlPullParser, HashMap<i, Boolean> hashMap) {
        Object a;
        boolean z;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        String attributeValue = xmlPullParser.getAttributeValue("", Action.ATTRIBUTE_NAME);
        if (attributeValue.equals("deny")) {
            a = d.a(xmlPullParser.nextText());
            z = false;
        } else if (!attributeValue.equals("allow")) {
            return hashMap;
        } else {
            a = d.a(xmlPullParser.nextText());
            z = true;
        }
        hashMap.put(a, Boolean.valueOf(z));
        return hashMap;
    }

    public MUCLightBlockingIQ parse(XmlPullParser xmlPullParser, int i) {
        HashMap hashMap = null;
        HashMap hashMap2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("room")) {
                    hashMap = parseBlocking(xmlPullParser, hashMap);
                }
                if (xmlPullParser.getName().equals("user")) {
                    hashMap2 = parseBlocking(xmlPullParser, hashMap2);
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == i) {
                MUCLightBlockingIQ mUCLightBlockingIQ = new MUCLightBlockingIQ(hashMap, hashMap2);
                mUCLightBlockingIQ.setType(Type.result);
                return mUCLightBlockingIQ;
            }
        }
    }
}
