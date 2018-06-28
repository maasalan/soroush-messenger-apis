package org.jivesoftware.smackx.xdatavalidation.provider;

import java.util.logging.Logger;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.BasicValidateElement;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.ListRange;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.OpenValidateElement;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RegexValidateElement;
import org.xmlpull.v1.XmlPullParser;

public class DataValidationProvider {
    private static final Logger LOGGER = Logger.getLogger(DataValidationProvider.class.getName());

    public static ValidateElement parse(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String attributeValue = xmlPullParser.getAttributeValue("", "datatype");
        RegexValidateElement regexValidateElement = null;
        ListRange listRange = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    switch (name.hashCode()) {
                        case -725250226:
                            if (name.equals(ListRange.ELEMENT)) {
                                obj = 4;
                                break;
                            }
                            break;
                        case 3417674:
                            if (name.equals("open")) {
                                obj = null;
                                break;
                            }
                            break;
                        case 93508654:
                            if (name.equals(BasicValidateElement.METHOD)) {
                                obj = 1;
                                break;
                            }
                            break;
                        case 108280125:
                            if (name.equals(RangeValidateElement.METHOD)) {
                                obj = 2;
                                break;
                            }
                            break;
                        case 108392519:
                            if (name.equals(RegexValidateElement.METHOD)) {
                                obj = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            regexValidateElement = new OpenValidateElement(attributeValue);
                            break;
                        case 1:
                            regexValidateElement = new BasicValidateElement(attributeValue);
                            break;
                        case 2:
                            regexValidateElement = new RangeValidateElement(attributeValue, xmlPullParser.getAttributeValue("", "min"), xmlPullParser.getAttributeValue("", "max"));
                            break;
                        case 3:
                            regexValidateElement = new RegexValidateElement(attributeValue, xmlPullParser.nextText());
                            break;
                        case 4:
                            Long longAttribute = ParserUtils.getLongAttribute(xmlPullParser, "min");
                            Long longAttribute2 = ParserUtils.getLongAttribute(xmlPullParser, "max");
                            if (longAttribute == null) {
                                if (longAttribute2 == null) {
                                    LOGGER.fine("Ignoring list-range element without min or max attribute");
                                    break;
                                }
                            }
                            listRange = new ListRange(longAttribute, longAttribute2);
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    ValidateElement basicValidateElement;
                    if (regexValidateElement == null) {
                        basicValidateElement = new BasicValidateElement(attributeValue);
                    }
                    basicValidateElement.setListRange(listRange);
                    return basicValidateElement;
                default:
                    break;
            }
        }
    }
}
