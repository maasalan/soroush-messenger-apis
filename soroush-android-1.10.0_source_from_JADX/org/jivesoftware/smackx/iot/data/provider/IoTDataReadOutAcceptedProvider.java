package org.jivesoftware.smackx.iot.data.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.IoTDataReadOutAccepted;
import org.xmlpull.v1.XmlPullParser;

public class IoTDataReadOutAcceptedProvider extends IQProvider<IoTDataReadOutAccepted> {
    public IoTDataReadOutAccepted parse(XmlPullParser xmlPullParser, int i) {
        return new IoTDataReadOutAccepted(ParserUtils.getIntegerAttributeOrThrow(xmlPullParser, "seqnr", "IoT data request <accepted/> without sequence number"), ParserUtils.getBooleanAttribute(xmlPullParser, "queued", false));
    }
}
