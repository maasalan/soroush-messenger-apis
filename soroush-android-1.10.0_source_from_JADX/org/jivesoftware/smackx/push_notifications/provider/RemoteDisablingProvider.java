package org.jivesoftware.smackx.push_notifications.provider;

import org.b.a.a.d;
import org.b.a.i;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.pubsub.Affiliation;
import org.jivesoftware.smackx.push_notifications.element.PushNotificationsElements.RemoteDisablingExtension;
import org.xmlpull.v1.XmlPullParser;

public class RemoteDisablingProvider extends ExtensionElementProvider<RemoteDisablingExtension> {
    public RemoteDisablingExtension parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("", NodeElement.ELEMENT);
        i iVar = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals(Affiliation.ELEMENT)) {
                    iVar = d.a(xmlPullParser.getAttributeValue("", ParserUtils.JID));
                    String attributeValue2 = xmlPullParser.getAttributeValue("", Affiliation.ELEMENT);
                    if (attributeValue2 == null || !attributeValue2.equals(PrivacyItem.SUBSCRIPTION_NONE)) {
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getDepth() == i) {
                return new RemoteDisablingExtension(attributeValue, iVar);
            }
        }
        return null;
    }
}
