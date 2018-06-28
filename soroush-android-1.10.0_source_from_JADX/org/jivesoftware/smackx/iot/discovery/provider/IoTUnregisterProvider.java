package org.jivesoftware.smackx.iot.discovery.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.discovery.element.IoTUnregister;
import org.jivesoftware.smackx.iot.parser.NodeInfoParser;
import org.xmlpull.v1.XmlPullParser;

public class IoTUnregisterProvider extends IQProvider<IoTUnregister> {
    public IoTUnregister parse(XmlPullParser xmlPullParser, int i) {
        return new IoTUnregister(NodeInfoParser.parse(xmlPullParser));
    }
}
