package org.jivesoftware.smackx.pubsub.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.pubsub.Subscription;
import org.jivesoftware.smackx.pubsub.Subscription.State;
import org.xmlpull.v1.XmlPullParser;

public class SubscriptionProvider extends ExtensionElementProvider<Subscription> {
    public Subscription parse(XmlPullParser xmlPullParser, int i) {
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, ParserUtils.JID);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, NodeElement.ELEMENT);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "subid");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "subscription");
        boolean z = false;
        if (xmlPullParser.next() == 2 && xmlPullParser.getName().equals("subscribe-options")) {
            int next = xmlPullParser.next();
            if (next == 2 && xmlPullParser.getName().equals("required")) {
                z = true;
            }
            while (next != 3 && !xmlPullParser.getName().equals("subscribe-options")) {
                next = xmlPullParser.next();
            }
        }
        boolean z2 = z;
        while (xmlPullParser.getEventType() != 3) {
            xmlPullParser.next();
        }
        if (attributeValue4 != null) {
            str = State.valueOf(attributeValue4);
        }
        return new Subscription(attributeValue, attributeValue2, attributeValue3, str, z2);
    }
}
