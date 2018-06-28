package org.jivesoftware.smackx.caps.provider;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.roster.packet.RosterVer;
import org.jivesoftware.smackx.caps.packet.CapsExtension;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.xmlpull.v1.XmlPullParser;

public class CapsExtensionProvider extends ExtensionElementProvider<CapsExtension> {
    public CapsExtension parse(XmlPullParser xmlPullParser, int i) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equalsIgnoreCase("c")) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "hash");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, RosterVer.ELEMENT);
            String attributeValue3 = xmlPullParser.getAttributeValue(null, NodeElement.ELEMENT);
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 3) {
                if (xmlPullParser.getName().equalsIgnoreCase("c")) {
                    if (attributeValue != null && attributeValue2 != null && attributeValue3 != null) {
                        return new CapsExtension(attributeValue3, attributeValue2, attributeValue);
                    }
                    StringBuilder stringBuilder = new StringBuilder("Caps element with missing attributes. Attributes: hash=");
                    stringBuilder.append(attributeValue);
                    stringBuilder.append(" version=");
                    stringBuilder.append(attributeValue2);
                    stringBuilder.append(" node=");
                    stringBuilder.append(attributeValue3);
                    throw new SmackException(stringBuilder.toString());
                }
            }
            throw new SmackException("Malformed nested Caps element");
        }
        throw new SmackException("Malformed Caps element");
    }
}
