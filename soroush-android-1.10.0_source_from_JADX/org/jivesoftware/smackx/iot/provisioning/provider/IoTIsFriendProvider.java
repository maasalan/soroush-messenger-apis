package org.jivesoftware.smackx.iot.provisioning.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.provisioning.element.IoTIsFriend;
import org.xmlpull.v1.XmlPullParser;

public class IoTIsFriendProvider extends IQProvider<IoTIsFriend> {
    public IoTIsFriend parse(XmlPullParser xmlPullParser, int i) {
        return new IoTIsFriend(ParserUtils.getJidAttribute(xmlPullParser));
    }
}
