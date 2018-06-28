package org.jivesoftware.smackx.httpfileupload.provider;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.httpfileupload.element.Slot;
import org.jivesoftware.smackx.httpfileupload.element.Slot_V0_2;
import org.jivesoftware.smackx.shim.packet.Header;
import org.xmlpull.v1.XmlPullParser;

public class SlotProvider extends IQProvider<Slot> {
    public Slot parse(XmlPullParser xmlPullParser, int i) {
        String namespace = xmlPullParser.getNamespace();
        Map map = null;
        URL url = null;
        URL url2 = url;
        while (true) {
            Object obj = null;
            switch (xmlPullParser.next()) {
                case 2:
                    String requiredNextText;
                    String name = xmlPullParser.getName();
                    int hashCode = name.hashCode();
                    if (hashCode == -1221270899) {
                        if (name.equals(Header.ELEMENT)) {
                            obj = 2;
                            switch (obj) {
                                case null:
                                    url = new URL(xmlPullParser.nextText());
                                    break;
                                case 1:
                                    url2 = new URL(xmlPullParser.nextText());
                                    break;
                                case 2:
                                    name = ParserUtils.getRequiredAttribute(xmlPullParser, "name");
                                    requiredNextText = ParserUtils.getRequiredNextText(xmlPullParser);
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(name, requiredNextText);
                                    break;
                                default:
                                    break;
                            }
                        }
                    } else if (hashCode == 102230) {
                        if (name.equals("get")) {
                            obj = 1;
                            switch (obj) {
                                case null:
                                    url = new URL(xmlPullParser.nextText());
                                    break;
                                case 1:
                                    url2 = new URL(xmlPullParser.nextText());
                                    break;
                                case 2:
                                    name = ParserUtils.getRequiredAttribute(xmlPullParser, "name");
                                    requiredNextText = ParserUtils.getRequiredNextText(xmlPullParser);
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(name, requiredNextText);
                                    break;
                                default:
                                    break;
                            }
                        }
                    } else if (hashCode == 111375) {
                        if (name.equals("put")) {
                            switch (obj) {
                                case null:
                                    url = new URL(xmlPullParser.nextText());
                                    break;
                                case 1:
                                    url2 = new URL(xmlPullParser.nextText());
                                    break;
                                case 2:
                                    name = ParserUtils.getRequiredAttribute(xmlPullParser, "name");
                                    requiredNextText = ParserUtils.getRequiredNextText(xmlPullParser);
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(name, requiredNextText);
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    obj = -1;
                    switch (obj) {
                        case null:
                            url = new URL(xmlPullParser.nextText());
                            break;
                        case 1:
                            url2 = new URL(xmlPullParser.nextText());
                            break;
                        case 2:
                            name = ParserUtils.getRequiredAttribute(xmlPullParser, "name");
                            requiredNextText = ParserUtils.getRequiredNextText(xmlPullParser);
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(name, requiredNextText);
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    int hashCode2 = namespace.hashCode();
                    if (hashCode2 != -1906675379) {
                        if (hashCode2 == -1320418345) {
                            if (namespace.equals("urn:xmpp:http:upload")) {
                                obj = 1;
                                switch (obj) {
                                    case null:
                                        return new Slot(url, url2, map);
                                    case 1:
                                        return new Slot_V0_2(url, url2);
                                    default:
                                        throw new AssertionError();
                                }
                            }
                        }
                    } else if (namespace.equals("urn:xmpp:http:upload:0")) {
                        switch (obj) {
                            case null:
                                return new Slot(url, url2, map);
                            case 1:
                                return new Slot_V0_2(url, url2);
                            default:
                                throw new AssertionError();
                        }
                    }
                    obj = -1;
                    switch (obj) {
                        case null:
                            return new Slot(url, url2, map);
                        case 1:
                            return new Slot_V0_2(url, url2);
                        default:
                            throw new AssertionError();
                    }
                default:
                    break;
            }
        }
    }
}
