package org.jivesoftware.smackx.hoxt.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Base64;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.ChunkedBase64;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Ibb;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Text;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Xml;
import org.jivesoftware.smackx.shim.packet.HeadersExtension;
import org.jivesoftware.smackx.shim.provider.HeadersProvider;
import org.xmlpull.v1.XmlPullParser;

public abstract class AbstractHttpOverXmppProvider<H extends AbstractHttpOverXmpp> extends IQProvider<H> {
    private static final String ATTRIBUTE_SID = "sid";
    private static final String ATTRIBUTE_STREAM_ID = "streamId";
    static final String ATTRIBUTE_VERSION = "version";
    private static final String ELEMENT_BASE_64 = "base64";
    private static final String ELEMENT_CHUNKED_BASE_64 = "chunkedBase64";
    private static final String ELEMENT_DATA = "data";
    static final String ELEMENT_IBB = "ibb";
    static final String ELEMENT_JINGLE = "jingle";
    static final String ELEMENT_SIPUB = "sipub";
    private static final String ELEMENT_TEXT = "text";
    private static final String ELEMENT_XML = "xml";

    private static void appendXmlAttributes(XmlPullParser xmlPullParser, StringBuilder stringBuilder) {
        int attributeCount = xmlPullParser.getAttributeCount();
        if (attributeCount > 0) {
            for (int i = 0; i < attributeCount; i++) {
                stringBuilder.append(' ');
                stringBuilder.append(xmlPullParser.getAttributeName(i));
                stringBuilder.append("=\"");
                stringBuilder.append(StringUtils.escapeForXml(xmlPullParser.getAttributeValue(i)));
                stringBuilder.append('\"');
            }
        }
    }

    private static Base64 parseBase64(XmlPullParser xmlPullParser) {
        String str = null;
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getName().equals("base64")) {
                    obj = 1;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("unexpected end tag of: ");
                    stringBuilder.append(xmlPullParser.getName());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else if (next == 4) {
                str = xmlPullParser.getText();
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("unexpected eventType: ");
                stringBuilder2.append(next);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        return new Base64(str);
    }

    private static ChunkedBase64 parseChunkedBase64(XmlPullParser xmlPullParser) {
        ChunkedBase64 chunkedBase64 = new ChunkedBase64(xmlPullParser.getAttributeValue("", "streamId"));
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            StringBuilder stringBuilder;
            if (next != 3) {
                stringBuilder = new StringBuilder("unexpected event type: ");
                stringBuilder.append(next);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (xmlPullParser.getName().equals("chunkedBase64")) {
                obj = 1;
            } else {
                stringBuilder = new StringBuilder("unexpected end tag: ");
                stringBuilder.append(xmlPullParser.getName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return chunkedBase64;
    }

    private static Ibb parseIbb(XmlPullParser xmlPullParser) {
        Ibb ibb = new Ibb(xmlPullParser.getAttributeValue("", ATTRIBUTE_SID));
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            StringBuilder stringBuilder;
            if (next != 3) {
                stringBuilder = new StringBuilder("unexpected event type: ");
                stringBuilder.append(next);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (xmlPullParser.getName().equals("ibb")) {
                obj = 1;
            } else {
                stringBuilder = new StringBuilder("unexpected end tag: ");
                stringBuilder.append(xmlPullParser.getName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return ibb;
    }

    private static Text parseText(XmlPullParser xmlPullParser) {
        String str = null;
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getName().equals("text")) {
                    obj = 1;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("unexpected end tag of: ");
                    stringBuilder.append(xmlPullParser.getName());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else if (next == 4) {
                str = xmlPullParser.getText();
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("unexpected eventType: ");
                stringBuilder2.append(next);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        return new Text(str);
    }

    private static Xml parseXml(XmlPullParser xmlPullParser) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = null;
        while (true) {
            Object obj2 = 1;
            while (obj == null) {
                int next = xmlPullParser.next();
                if (next == 3 && xmlPullParser.getName().equals("xml")) {
                    obj = 1;
                } else if (next == 2) {
                    if (obj2 == null) {
                        stringBuilder.append('>');
                    }
                    stringBuilder.append('<');
                    stringBuilder.append(xmlPullParser.getName());
                    appendXmlAttributes(xmlPullParser, stringBuilder);
                    obj2 = null;
                } else if (next == 3) {
                    if (obj2 != null) {
                        stringBuilder.append("</");
                        stringBuilder.append(xmlPullParser.getName());
                        stringBuilder.append('>');
                    } else {
                        stringBuilder.append("/>");
                    }
                } else if (next == 4) {
                    if (obj2 == null) {
                        stringBuilder.append('>');
                        obj2 = 1;
                    }
                    stringBuilder.append(StringUtils.escapeForXmlText(xmlPullParser.getText()));
                } else {
                    stringBuilder = new StringBuilder("unexpected eventType: ");
                    stringBuilder.append(next);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            return new Xml(stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Data parseData(org.xmlpull.v1.XmlPullParser r9) {
        /*
        r8 = this;
        r0 = r9.getEventType();
        r1 = 0;
        r2 = 2;
        if (r0 != r2) goto L_0x00c8;
    L_0x0008:
        r0 = 0;
        r3 = r1;
        r1 = r0;
    L_0x000b:
        if (r1 != 0) goto L_0x00c3;
    L_0x000d:
        r4 = r9.next();
        r5 = 1;
        r6 = 3;
        if (r4 != r2) goto L_0x00b2;
    L_0x0015:
        r3 = r9.getName();
        r4 = -1;
        r7 = r3.hashCode();
        switch(r7) {
            case -1396204209: goto L_0x005e;
            case -1159928143: goto L_0x0054;
            case 104041: goto L_0x004a;
            case 118807: goto L_0x0040;
            case 3556653: goto L_0x0036;
            case 109444327: goto L_0x002c;
            case 1970784315: goto L_0x0022;
            default: goto L_0x0021;
        };
    L_0x0021:
        goto L_0x0068;
    L_0x0022:
        r5 = "chunkedBase64";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0068;
    L_0x002a:
        r3 = r2;
        goto L_0x0069;
    L_0x002c:
        r5 = "sipub";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0068;
    L_0x0034:
        r3 = 5;
        goto L_0x0069;
    L_0x0036:
        r5 = "text";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0068;
    L_0x003e:
        r3 = r0;
        goto L_0x0069;
    L_0x0040:
        r5 = "xml";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0068;
    L_0x0048:
        r3 = r6;
        goto L_0x0069;
    L_0x004a:
        r5 = "ibb";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0068;
    L_0x0052:
        r3 = 4;
        goto L_0x0069;
    L_0x0054:
        r5 = "jingle";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0068;
    L_0x005c:
        r3 = 6;
        goto L_0x0069;
    L_0x005e:
        r6 = "base64";
        r3 = r3.equals(r6);
        if (r3 == 0) goto L_0x0068;
    L_0x0066:
        r3 = r5;
        goto L_0x0069;
    L_0x0068:
        r3 = r4;
    L_0x0069:
        switch(r3) {
            case 0: goto L_0x00ac;
            case 1: goto L_0x00a6;
            case 2: goto L_0x00a0;
            case 3: goto L_0x009a;
            case 4: goto L_0x0094;
            case 5: goto L_0x008c;
            case 6: goto L_0x0084;
            default: goto L_0x006c;
        };
    L_0x006c:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "unsupported child tag: ";
        r1.<init>(r2);
        r9 = r9.getName();
        r1.append(r9);
        r9 = r1.toString();
        r0.<init>(r9);
        throw r0;
    L_0x0084:
        r9 = new java.lang.UnsupportedOperationException;
        r0 = "jingle is not supported yet";
        r9.<init>(r0);
        throw r9;
    L_0x008c:
        r9 = new java.lang.UnsupportedOperationException;
        r0 = "sipub is not supported yet";
        r9.<init>(r0);
        throw r9;
    L_0x0094:
        r3 = parseIbb(r9);
        goto L_0x000b;
    L_0x009a:
        r3 = parseXml(r9);
        goto L_0x000b;
    L_0x00a0:
        r3 = parseChunkedBase64(r9);
        goto L_0x000b;
    L_0x00a6:
        r3 = parseBase64(r9);
        goto L_0x000b;
    L_0x00ac:
        r3 = parseText(r9);
        goto L_0x000b;
    L_0x00b2:
        if (r4 != r6) goto L_0x000b;
    L_0x00b4:
        r4 = r9.getName();
        r6 = "data";
        r4 = r4.equals(r6);
        if (r4 == 0) goto L_0x000b;
    L_0x00c0:
        r1 = r5;
        goto L_0x000b;
    L_0x00c3:
        r1 = new org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp$Data;
        r1.<init>(r3);
    L_0x00c8:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.hoxt.provider.AbstractHttpOverXmppProvider.parseData(org.xmlpull.v1.XmlPullParser):org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp$Data");
    }

    protected HeadersExtension parseHeaders(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() != 2 || !xmlPullParser.getName().equals(HeadersExtension.ELEMENT)) {
            return null;
        }
        HeadersExtension headersExtension = (HeadersExtension) HeadersProvider.INSTANCE.parse(xmlPullParser);
        xmlPullParser.next();
        return headersExtension;
    }
}
