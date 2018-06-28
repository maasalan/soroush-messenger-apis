package org.jivesoftware.smackx.hoxt.provider;

import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Ibb;
import org.jivesoftware.smackx.hoxt.packet.HttpMethod;
import org.jivesoftware.smackx.hoxt.packet.HttpOverXmppReq;
import org.jivesoftware.smackx.hoxt.packet.HttpOverXmppReq.Builder;
import org.xmlpull.v1.XmlPullParser;

public class HttpOverXmppReqProvider extends AbstractHttpOverXmppProvider<HttpOverXmppReq> {
    private static final String ATTRIBUTE_MAX_CHUNK_SIZE = "maxChunkSize";
    private static final String ATTRIBUTE_METHOD = "method";
    private static final String ATTRIBUTE_RESOURCE = "resource";

    public HttpOverXmppReq parse(XmlPullParser xmlPullParser, int i) {
        Builder builder = HttpOverXmppReq.builder();
        builder.setResource(xmlPullParser.getAttributeValue("", ATTRIBUTE_RESOURCE));
        builder.setVersion(xmlPullParser.getAttributeValue("", "version"));
        builder.setMethod(HttpMethod.valueOf(xmlPullParser.getAttributeValue("", ATTRIBUTE_METHOD)));
        String attributeValue = xmlPullParser.getAttributeValue("", "sipub");
        String attributeValue2 = xmlPullParser.getAttributeValue("", Ibb.ELEMENT);
        String attributeValue3 = xmlPullParser.getAttributeValue("", "jingle");
        if (attributeValue != null) {
            builder.setSipub(Boolean.valueOf(attributeValue).booleanValue());
        }
        if (attributeValue2 != null) {
            builder.setIbb(Boolean.valueOf(attributeValue2).booleanValue());
        }
        if (attributeValue3 != null) {
            builder.setJingle(Boolean.valueOf(attributeValue3).booleanValue());
        }
        attributeValue = xmlPullParser.getAttributeValue("", ATTRIBUTE_MAX_CHUNK_SIZE);
        if (attributeValue != null) {
            builder.setMaxChunkSize(Integer.parseInt(attributeValue));
        }
        builder.setHeaders(parseHeaders(xmlPullParser));
        builder.setData(parseData(xmlPullParser));
        return builder.build();
    }
}
