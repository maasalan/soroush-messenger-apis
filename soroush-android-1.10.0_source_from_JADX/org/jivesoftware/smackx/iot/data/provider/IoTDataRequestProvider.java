package org.jivesoftware.smackx.iot.data.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.IoTDataRequest;
import org.xmlpull.v1.XmlPullParser;

public class IoTDataRequestProvider extends IQProvider<IoTDataRequest> {
    public IoTDataRequest parse(XmlPullParser xmlPullParser, int i) {
        return new IoTDataRequest(ParserUtils.getIntegerAttributeOrThrow(xmlPullParser, "seqnr", "IoT data request without sequence number"), ParserUtils.getBooleanAttribute(xmlPullParser, "momentary", false));
    }
}
