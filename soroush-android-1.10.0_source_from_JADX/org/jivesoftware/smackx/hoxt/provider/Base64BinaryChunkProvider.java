package org.jivesoftware.smackx.hoxt.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.hoxt.packet.Base64BinaryChunk;
import org.xmlpull.v1.XmlPullParser;

public class Base64BinaryChunkProvider extends ExtensionElementProvider<Base64BinaryChunk> {
    public Base64BinaryChunk parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("", Base64BinaryChunk.ATTRIBUTE_STREAM_ID);
        String attributeValue2 = xmlPullParser.getAttributeValue("", Base64BinaryChunk.ATTRIBUTE_NR);
        String attributeValue3 = xmlPullParser.getAttributeValue("", Base64BinaryChunk.ATTRIBUTE_LAST);
        int parseInt = Integer.parseInt(attributeValue2);
        Object obj = null;
        boolean parseBoolean = attributeValue3 != null ? Boolean.parseBoolean(attributeValue3) : false;
        String str = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getName().equals(Base64BinaryChunk.ELEMENT_CHUNK)) {
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
        return new Base64BinaryChunk(str, attributeValue, parseInt, parseBoolean);
    }
}
