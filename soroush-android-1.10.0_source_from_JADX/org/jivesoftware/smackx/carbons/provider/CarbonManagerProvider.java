package org.jivesoftware.smackx.carbons.provider;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension.Direction;
import org.jivesoftware.smackx.forward.packet.Forwarded;
import org.jivesoftware.smackx.forward.provider.ForwardedProvider;
import org.xmlpull.v1.XmlPullParser;

public class CarbonManagerProvider extends ExtensionElementProvider<CarbonExtension> {
    private static final ForwardedProvider FORWARDED_PROVIDER = new ForwardedProvider();

    public CarbonExtension parse(XmlPullParser xmlPullParser, int i) {
        Direction valueOf = Direction.valueOf(xmlPullParser.getName());
        Forwarded forwarded = null;
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 2 && xmlPullParser.getName().equals(Forwarded.ELEMENT)) {
                forwarded = (Forwarded) FORWARDED_PROVIDER.parse(xmlPullParser);
            } else if (next == 3 && valueOf == Direction.valueOf(xmlPullParser.getName())) {
                obj = 1;
            }
        }
        if (forwarded != null) {
            return new CarbonExtension(valueOf, forwarded);
        }
        throw new SmackException("sent/received must contain exactly one <forwarded> tag");
    }
}
