package org.jivesoftware.smackx.mam.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.forward.packet.Forwarded;
import org.jivesoftware.smackx.forward.provider.ForwardedProvider;
import org.jivesoftware.smackx.mam.element.MamElements.MamResultExtension;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.xmlpull.v1.XmlPullParser;

public class MamResultProvider extends ExtensionElementProvider<MamResultExtension> {
    public MamResultExtension parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("", "queryid");
        String attributeValue2 = xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG);
        Forwarded forwarded = null;
        while (true) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            switch (next) {
                case 2:
                    Object obj = -1;
                    if (name.hashCode() == 2097807908) {
                        if (name.equals(Forwarded.ELEMENT)) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        forwarded = (Forwarded) ForwardedProvider.INSTANCE.parse(xmlPullParser);
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return new MamResultExtension(attributeValue, attributeValue2, forwarded);
                default:
                    break;
            }
        }
    }
}
