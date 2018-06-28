package org.jivesoftware.smackx.privacy.provider;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;
import org.jivesoftware.smackx.csi.packet.ClientStateIndication.Active;
import org.jivesoftware.smackx.privacy.packet.Privacy;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem.Type;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class PrivacyProvider extends IQProvider<Privacy> {
    private static PrivacyItem parseItem(XmlPullParser xmlPullParser) {
        boolean z;
        StringBuilder stringBuilder;
        PrivacyItem privacyItem;
        PrivacyItem privacyItem2;
        String attributeValue = xmlPullParser.getAttributeValue("", Action.ATTRIBUTE_NAME);
        long longValue = ParserUtils.getLongAttribute(xmlPullParser, "order").longValue();
        String attributeValue2 = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
        int hashCode = attributeValue.hashCode();
        boolean z2 = false;
        if (hashCode != 3079692) {
            if (hashCode == 92906313) {
                if (attributeValue.equals("allow")) {
                    z = false;
                    switch (z) {
                        case false:
                            z2 = true;
                            break;
                        case true:
                            break;
                        default:
                            stringBuilder = new StringBuilder("Unkown action value '");
                            stringBuilder.append(attributeValue);
                            stringBuilder.append("'");
                            throw new SmackException(stringBuilder.toString());
                    }
                    if (attributeValue2 != null) {
                        privacyItem = new PrivacyItem(Type.valueOf(attributeValue2), xmlPullParser.getAttributeValue("", "value"), z2, longValue);
                    } else {
                        privacyItem2 = new PrivacyItem(z2, longValue);
                    }
                    parseItemChildElements(xmlPullParser, privacyItem2);
                    return privacyItem2;
                }
            }
        } else if (attributeValue.equals("deny")) {
            z = true;
            switch (z) {
                case false:
                    z2 = true;
                    break;
                case true:
                    break;
                default:
                    stringBuilder = new StringBuilder("Unkown action value '");
                    stringBuilder.append(attributeValue);
                    stringBuilder.append("'");
                    throw new SmackException(stringBuilder.toString());
            }
            if (attributeValue2 != null) {
                privacyItem2 = new PrivacyItem(z2, longValue);
            } else {
                privacyItem = new PrivacyItem(Type.valueOf(attributeValue2), xmlPullParser.getAttributeValue("", "value"), z2, longValue);
            }
            parseItemChildElements(xmlPullParser, privacyItem2);
            return privacyItem2;
        }
        z = true;
        switch (z) {
            case false:
                z2 = true;
                break;
            case true:
                break;
            default:
                stringBuilder = new StringBuilder("Unkown action value '");
                stringBuilder.append(attributeValue);
                stringBuilder.append("'");
                throw new SmackException(stringBuilder.toString());
        }
        if (attributeValue2 != null) {
            privacyItem = new PrivacyItem(Type.valueOf(attributeValue2), xmlPullParser.getAttributeValue("", "value"), z2, longValue);
        } else {
            privacyItem2 = new PrivacyItem(z2, longValue);
        }
        parseItemChildElements(xmlPullParser, privacyItem2);
        return privacyItem2;
    }

    private static void parseItemChildElements(XmlPullParser xmlPullParser, PrivacyItem privacyItem) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    boolean z = true;
                    int hashCode = name.hashCode();
                    if (hashCode != -1240091849) {
                        if (hashCode != 3368) {
                            if (hashCode != 211864444) {
                                if (hashCode == 954925063) {
                                    if (name.equals(Message.ELEMENT)) {
                                        z = true;
                                    }
                                }
                            } else if (name.equals("presence-out")) {
                                z = true;
                            }
                        } else if (name.equals(IQ.IQ_ELEMENT)) {
                            z = false;
                        }
                    } else if (name.equals("presence-in")) {
                        z = true;
                    }
                    switch (z) {
                        case false:
                            privacyItem.setFilterIQ(true);
                            break;
                        case true:
                            privacyItem.setFilterMessage(true);
                            break;
                        case true:
                            privacyItem.setFilterPresenceIn(true);
                            break;
                        case true:
                            privacyItem.setFilterPresenceOut(true);
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return;
                default:
                    break;
            }
        }
    }

    private static void parseList(XmlPullParser xmlPullParser, Privacy privacy) {
        String attributeValue = xmlPullParser.getAttributeValue("", "name");
        List arrayList = new ArrayList();
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("item")) {
                    arrayList.add(parseItem(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("list")) {
                obj = 1;
            }
        }
        privacy.setPrivacyList(attributeValue, arrayList);
    }

    public Privacy parse(XmlPullParser xmlPullParser, int i) {
        Privacy privacy = new Privacy();
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String attributeValue;
                if (xmlPullParser.getName().equals(Active.ELEMENT)) {
                    attributeValue = xmlPullParser.getAttributeValue("", "name");
                    if (attributeValue == null) {
                        privacy.setDeclineActiveList(true);
                    } else {
                        privacy.setActiveName(attributeValue);
                    }
                } else if (xmlPullParser.getName().equals("default")) {
                    attributeValue = xmlPullParser.getAttributeValue("", "name");
                    if (attributeValue == null) {
                        privacy.setDeclineDefaultList(true);
                    } else {
                        privacy.setDefaultName(attributeValue);
                    }
                } else if (xmlPullParser.getName().equals("list")) {
                    parseList(xmlPullParser, privacy);
                }
            } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                z = true;
            }
        }
        return privacy;
    }
}
