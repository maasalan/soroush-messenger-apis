package org.jivesoftware.smackx.iot.control.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.control.element.IoTSetResponse;
import org.xmlpull.v1.XmlPullParser;

public class IoTSetResponseProvider extends IQProvider<IoTSetResponse> {
    public IoTSetResponse parse(XmlPullParser xmlPullParser, int i) {
        return new IoTSetResponse();
    }
}
