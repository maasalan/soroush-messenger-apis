package org.jivesoftware.smackx.mam.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.mam.element.MamFinIQ;
import org.jivesoftware.smackx.rsm.packet.RSMSet;
import org.jivesoftware.smackx.rsm.provider.RSMSetProvider;
import org.xmlpull.v1.XmlPullParser;

public class MamFinIQProvider extends IQProvider<MamFinIQ> {
    public MamFinIQ parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("", "queryid");
        boolean booleanAttribute = ParserUtils.getBooleanAttribute(xmlPullParser, "complete", false);
        boolean booleanAttribute2 = ParserUtils.getBooleanAttribute(xmlPullParser, "stable", true);
        RSMSet rSMSet = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    if (!xmlPullParser.getName().equals("set")) {
                        break;
                    }
                    rSMSet = (RSMSet) RSMSetProvider.INSTANCE.parse(xmlPullParser);
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return new MamFinIQ(attributeValue, rSMSet, booleanAttribute, booleanAttribute2);
                default:
                    break;
            }
        }
    }
}
