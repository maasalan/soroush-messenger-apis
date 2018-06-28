package org.jivesoftware.smackx.muc.provider;

import org.b.a.e;
import org.b.a.g;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.muc.packet.Destroy;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Decline;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.xmlpull.v1.XmlPullParser;

public class MUCUserProvider extends ExtensionElementProvider<MUCUser> {
    private static Decline parseDecline(XmlPullParser xmlPullParser) {
        e bareJidAttribute = ParserUtils.getBareJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_TO);
        e bareJidAttribute2 = ParserUtils.getBareJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_FROM);
        String str = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("reason")) {
                    str = xmlPullParser.nextText();
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getName().equals(Decline.ELEMENT)) {
                return new Decline(str, bareJidAttribute2, bareJidAttribute);
            }
        }
    }

    private static Invite parseInvite(XmlPullParser xmlPullParser) {
        e bareJidAttribute = ParserUtils.getBareJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_TO);
        g entityJidAttribute = ParserUtils.getEntityJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_FROM);
        String str = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("reason")) {
                    str = xmlPullParser.nextText();
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getName().equals(Invite.ELEMENT)) {
                return new Invite(str, entityJidAttribute, bareJidAttribute);
            }
        }
    }

    public MUCUser parse(XmlPullParser xmlPullParser, int i) {
        MUCUser mUCUser = new MUCUser();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    switch (name.hashCode()) {
                        case -1183699191:
                            if (name.equals(Invite.ELEMENT)) {
                                obj = null;
                                break;
                            }
                            break;
                        case -892481550:
                            if (name.equals(Status.ELEMENT)) {
                                obj = 3;
                                break;
                            }
                            break;
                        case 3242771:
                            if (name.equals("item")) {
                                obj = 1;
                                break;
                            }
                            break;
                        case 1216985755:
                            if (name.equals("password")) {
                                obj = 2;
                                break;
                            }
                            break;
                        case 1542349558:
                            if (name.equals(Decline.ELEMENT)) {
                                obj = 4;
                                break;
                            }
                            break;
                        case 1557372922:
                            if (name.equals(Destroy.ELEMENT)) {
                                obj = 5;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            mUCUser.setInvite(parseInvite(xmlPullParser));
                            break;
                        case 1:
                            mUCUser.setItem(MUCParserUtils.parseItem(xmlPullParser));
                            break;
                        case 2:
                            mUCUser.setPassword(xmlPullParser.nextText());
                            break;
                        case 3:
                            mUCUser.addStatusCode(Status.create(xmlPullParser.getAttributeValue("", XHTMLText.CODE)));
                            break;
                        case 4:
                            mUCUser.setDecline(parseDecline(xmlPullParser));
                            break;
                        case 5:
                            mUCUser.setDestroy(MUCParserUtils.parseDestroy(xmlPullParser));
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return mUCUser;
                default:
                    break;
            }
        }
    }
}
