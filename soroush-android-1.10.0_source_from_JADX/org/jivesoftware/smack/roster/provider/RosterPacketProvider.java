package org.jivesoftware.smack.roster.provider;

import org.b.a.a.d;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.roster.packet.RosterPacket;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemType;
import org.jivesoftware.smack.roster.packet.RosterVer;
import org.jivesoftware.smack.util.ParserUtils;
import org.xmlpull.v1.XmlPullParser;

public class RosterPacketProvider extends IQProvider<RosterPacket> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final RosterPacketProvider INSTANCE = new RosterPacketProvider();

    public static Item parseItem(XmlPullParser xmlPullParser) {
        ParserUtils.assertAtStartTag(xmlPullParser, "item");
        int depth = xmlPullParser.getDepth();
        String attributeValue = xmlPullParser.getAttributeValue("", ParserUtils.JID);
        Item item = new Item(d.b(attributeValue), xmlPullParser.getAttributeValue("", "name"));
        item.setSubscriptionPending("subscribe".equals(xmlPullParser.getAttributeValue("", "ask")));
        item.setItemType(ItemType.fromString(xmlPullParser.getAttributeValue("", "subscription")));
        item.setApproved(ParserUtils.getBooleanAttribute(xmlPullParser, "approved", false));
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    attributeValue = xmlPullParser.getName();
                    boolean z = true;
                    if (attributeValue.hashCode() == 98629247) {
                        if (attributeValue.equals(Item.GROUP)) {
                            z = false;
                        }
                    }
                    if (!z) {
                        attributeValue = xmlPullParser.nextText();
                        if (attributeValue != null && attributeValue.trim().length() > 0) {
                            item.addGroupName(attributeValue);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    ParserUtils.assertAtEndTag(xmlPullParser);
                    return item;
                default:
                    break;
            }
        }
    }

    public RosterPacket parse(XmlPullParser xmlPullParser, int i) {
        RosterPacket rosterPacket = new RosterPacket();
        rosterPacket.setVersion(xmlPullParser.getAttributeValue("", RosterVer.ELEMENT));
        while (true) {
            Object obj = null;
            String name;
            switch (xmlPullParser.next()) {
                case 2:
                    name = xmlPullParser.getName();
                    if (name.hashCode() == 3242771) {
                        if (name.equals("item")) {
                            if (obj != null) {
                                rosterPacket.addRosterItem(parseItem(xmlPullParser));
                                break;
                            }
                            break;
                        }
                    }
                    obj = -1;
                    if (obj != null) {
                        rosterPacket.addRosterItem(parseItem(xmlPullParser));
                    }
                case 3:
                    name = xmlPullParser.getName();
                    if (name.hashCode() == 107944136) {
                        if (name.equals("query")) {
                            if (obj == null) {
                                break;
                            } else if (xmlPullParser.getDepth() == i) {
                                break;
                            } else {
                                return rosterPacket;
                            }
                        }
                    }
                    obj = -1;
                    if (obj == null) {
                        if (xmlPullParser.getDepth() == i) {
                            return rosterPacket;
                        }
                    }
                default:
                    break;
            }
        }
    }
}
