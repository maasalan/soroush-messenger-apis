package org.jivesoftware.smackx.delay.provider;

import java.util.Date;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.delay.packet.DelayInformation;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.xmlpull.v1.XmlPullParser;

public abstract class AbstractDelayInformationProvider extends ExtensionElementProvider<DelayInformation> {
    public final DelayInformation parse(XmlPullParser xmlPullParser, int i) {
        String str;
        String attributeValue = xmlPullParser.getAttributeValue("", "stamp");
        String attributeValue2 = xmlPullParser.getAttributeValue("", PrivacyItem.SUBSCRIPTION_FROM);
        if (xmlPullParser.isEmptyElementTag()) {
            xmlPullParser.next();
            str = null;
        } else {
            int next = xmlPullParser.next();
            switch (next) {
                case 3:
                    str = "";
                    break;
                case 4:
                    str = xmlPullParser.getText();
                    xmlPullParser.next();
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unexpected event: ");
                    stringBuilder.append(next);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        }
        try {
            return new DelayInformation(parseDate(attributeValue), attributeValue2, str);
        } catch (Throwable e) {
            throw new SmackException(e);
        }
    }

    protected abstract Date parseDate(String str);
}
