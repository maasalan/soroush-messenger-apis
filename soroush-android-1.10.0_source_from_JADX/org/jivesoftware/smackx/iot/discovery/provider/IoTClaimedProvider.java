package org.jivesoftware.smackx.iot.discovery.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.discovery.element.IoTClaimed;
import org.jivesoftware.smackx.iot.parser.NodeInfoParser;
import org.xmlpull.v1.XmlPullParser;

public class IoTClaimedProvider extends IQProvider<IoTClaimed> {
    public IoTClaimed parse(XmlPullParser xmlPullParser, int i) {
        return new IoTClaimed(ParserUtils.getJidAttribute(xmlPullParser), NodeInfoParser.parse(xmlPullParser));
    }
}
