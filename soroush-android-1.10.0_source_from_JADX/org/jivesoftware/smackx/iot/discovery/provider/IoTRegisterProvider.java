package org.jivesoftware.smackx.iot.discovery.provider;

import java.util.ArrayList;
import java.util.Collection;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.discovery.element.IoTRegister;
import org.jivesoftware.smackx.iot.discovery.element.Tag;
import org.jivesoftware.smackx.iot.discovery.element.Tag.Type;
import org.jivesoftware.smackx.iot.element.NodeInfo;
import org.jivesoftware.smackx.iot.parser.NodeInfoParser;
import org.xmlpull.v1.XmlPullParser;

public class IoTRegisterProvider extends IQProvider<IoTRegister> {
    public IoTRegister parse(XmlPullParser xmlPullParser, int i) {
        boolean booleanAttribute = ParserUtils.getBooleanAttribute(xmlPullParser, "selfOwned", false);
        NodeInfo parse = NodeInfoParser.parse(xmlPullParser);
        Collection arrayList = new ArrayList();
        while (xmlPullParser.getDepth() != i) {
            if (xmlPullParser.next() == 2) {
                boolean z;
                Type type;
                String name = xmlPullParser.getName();
                int hashCode = name.hashCode();
                if (hashCode != 109446) {
                    if (hashCode == 114225) {
                        if (name.equals("str")) {
                            z = false;
                            switch (z) {
                                case false:
                                    type = Type.str;
                                    break;
                                case true:
                                    type = Type.num;
                                    break;
                                default:
                                    type = null;
                                    break;
                            }
                            if (type == null) {
                                arrayList.add(new Tag(xmlPullParser.getAttributeValue(null, "name"), type, xmlPullParser.getAttributeValue(null, "value")));
                            }
                        }
                    }
                } else if (name.equals("num")) {
                    z = true;
                    switch (z) {
                        case false:
                            type = Type.str;
                            break;
                        case true:
                            type = Type.num;
                            break;
                        default:
                            type = null;
                            break;
                    }
                    if (type == null) {
                        arrayList.add(new Tag(xmlPullParser.getAttributeValue(null, "name"), type, xmlPullParser.getAttributeValue(null, "value")));
                    }
                }
                z = true;
                switch (z) {
                    case false:
                        type = Type.str;
                        break;
                    case true:
                        type = Type.num;
                        break;
                    default:
                        type = null;
                        break;
                }
                if (type == null) {
                    arrayList.add(new Tag(xmlPullParser.getAttributeValue(null, "name"), type, xmlPullParser.getAttributeValue(null, "value")));
                }
            }
        }
        return new IoTRegister(arrayList, parse, booleanAttribute);
    }
}
