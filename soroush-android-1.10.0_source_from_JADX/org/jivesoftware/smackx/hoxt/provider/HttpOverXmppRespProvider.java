package org.jivesoftware.smackx.hoxt.provider;

import org.jivesoftware.smackx.hoxt.packet.HttpOverXmppResp;
import org.jivesoftware.smackx.hoxt.packet.HttpOverXmppResp.Builder;
import org.jivesoftware.smackx.shim.packet.HeadersExtension;
import org.xmlpull.v1.XmlPullParser;

public class HttpOverXmppRespProvider extends AbstractHttpOverXmppProvider<HttpOverXmppResp> {
    private static final String ATTRIBUTE_STATUS_CODE = "statusCode";
    private static final String ATTRIBUTE_STATUS_MESSAGE = "statusMessage";

    public HttpOverXmppResp parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("", "version");
        String attributeValue2 = xmlPullParser.getAttributeValue("", ATTRIBUTE_STATUS_MESSAGE);
        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue("", ATTRIBUTE_STATUS_CODE));
        HeadersExtension parseHeaders = parseHeaders(xmlPullParser);
        return ((Builder) ((Builder) ((Builder) HttpOverXmppResp.builder().setHeaders(parseHeaders)).setData(parseData(xmlPullParser))).setStatusCode(parseInt).setStatusMessage(attributeValue2).setVersion(attributeValue)).build();
    }
}
