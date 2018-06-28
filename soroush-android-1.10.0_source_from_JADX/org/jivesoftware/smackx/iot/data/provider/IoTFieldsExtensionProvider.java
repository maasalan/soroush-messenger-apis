package org.jivesoftware.smackx.iot.data.provider;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import org.b.c.a;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.IoTDataField.BooleanField;
import org.jivesoftware.smackx.iot.data.element.IoTDataField.IntField;
import org.jivesoftware.smackx.iot.data.element.IoTFieldsExtension;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.iot.data.element.TimestampElement;
import org.jivesoftware.smackx.iot.element.NodeInfo;
import org.jivesoftware.smackx.iot.parser.NodeInfoParser;
import org.xmlpull.v1.XmlPullParser;

public class IoTFieldsExtensionProvider extends ExtensionElementProvider<IoTFieldsExtension> {
    private static final Logger LOGGER = Logger.getLogger(IoTFieldsExtensionProvider.class.getName());

    public IoTFieldsExtension parse(XmlPullParser xmlPullParser, int i) {
        int integerAttributeOrThrow = ParserUtils.getIntegerAttributeOrThrow(xmlPullParser, "seqnr", "IoT data request <accepted/> without sequence number");
        boolean booleanAttribute = ParserUtils.getBooleanAttribute(xmlPullParser, "done", false);
        List arrayList = new ArrayList();
        while (true) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            switch (next) {
                case 2:
                    boolean z = true;
                    if (name.hashCode() == 3386882) {
                        if (name.equals(NodeElement.ELEMENT)) {
                            z = false;
                        }
                    }
                    if (!z) {
                        arrayList.add(parseNode(xmlPullParser));
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return new IoTFieldsExtension(integerAttributeOrThrow, booleanAttribute, arrayList);
                default:
                    break;
            }
        }
    }

    public NodeElement parseNode(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        NodeInfo parse = NodeInfoParser.parse(xmlPullParser);
        List arrayList = new ArrayList();
        while (true) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            switch (next) {
                case 2:
                    Object obj = -1;
                    if (name.hashCode() == 55126294) {
                        if (name.equals(TimestampElement.ELEMENT)) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        arrayList.add(parseTimestampElement(xmlPullParser));
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new NodeElement(parse, arrayList);
                default:
                    break;
            }
        }
    }

    public TimestampElement parseTimestampElement(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        Date b = a.b(xmlPullParser.getAttributeValue(null, "value"));
        List arrayList = new ArrayList();
        while (true) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            switch (next) {
                case 2:
                    Object intField;
                    String attributeValue = xmlPullParser.getAttributeValue(null, "name");
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != 104431) {
                        if (hashCode == 64711720) {
                            if (name.equals("boolean")) {
                                obj = 1;
                            }
                        }
                    } else if (name.equals("int")) {
                        obj = null;
                    }
                    switch (obj) {
                        case null:
                            intField = new IntField(attributeValue, Integer.parseInt(attributeValue2));
                            break;
                        case 1:
                            intField = new BooleanField(attributeValue, Boolean.parseBoolean(attributeValue2));
                            break;
                        default:
                            Logger logger = LOGGER;
                            StringBuilder stringBuilder = new StringBuilder("IoT Data field type '");
                            stringBuilder.append(name);
                            stringBuilder.append("' not implement yet. Ignoring.");
                            logger.warning(stringBuilder.toString());
                            intField = null;
                            break;
                    }
                    if (intField == null) {
                        break;
                    }
                    arrayList.add(intField);
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new TimestampElement(b, arrayList);
                default:
                    break;
            }
        }
    }
}
