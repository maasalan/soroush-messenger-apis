package org.jivesoftware.smackx.iot.discovery.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.discovery.element.IoTRemoved;
import org.jivesoftware.smackx.iot.parser.NodeInfoParser;
import org.xmlpull.v1.XmlPullParser;

public class IoTRemovedProvider extends IQProvider<IoTRemoved> {
    public IoTRemoved parse(XmlPullParser xmlPullParser, int i) {
        return new IoTRemoved(NodeInfoParser.parse(xmlPullParser));
    }
}
