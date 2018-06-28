package org.jivesoftware.smackx.iot.parser;

import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.iot.element.NodeInfo;
import org.xmlpull.v1.XmlPullParser;

public class NodeInfoParser {
    public static NodeInfo parse(XmlPullParser xmlPullParser) {
        CharSequence attributeValue = xmlPullParser.getAttributeValue(null, "nodeId");
        CharSequence attributeValue2 = xmlPullParser.getAttributeValue(null, "sourceId");
        CharSequence attributeValue3 = xmlPullParser.getAttributeValue(null, "cacheType");
        return (StringUtils.isNullOrEmpty(attributeValue) && StringUtils.isNullOrEmpty(attributeValue2) && StringUtils.isNullOrEmpty(attributeValue3)) ? NodeInfo.EMPTY : new NodeInfo(attributeValue, attributeValue2, attributeValue3);
    }
}
