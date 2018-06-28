package org.jivesoftware.smackx.iot.discovery.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.discovery.element.IoTDisowned;
import org.jivesoftware.smackx.iot.parser.NodeInfoParser;
import org.xmlpull.v1.XmlPullParser;

public class IoTDisownedProvider extends IQProvider<IoTDisowned> {
    public IoTDisowned parse(XmlPullParser xmlPullParser, int i) {
        return new IoTDisowned(NodeInfoParser.parse(xmlPullParser));
    }
}
