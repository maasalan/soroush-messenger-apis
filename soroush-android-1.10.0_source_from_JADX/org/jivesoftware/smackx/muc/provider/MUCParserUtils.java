package org.jivesoftware.smackx.muc.provider;

import org.b.a.b.d;
import org.b.a.e;
import org.b.a.i;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.muc.MUCAffiliation;
import org.jivesoftware.smackx.muc.MUCRole;
import org.jivesoftware.smackx.muc.packet.Destroy;
import org.jivesoftware.smackx.muc.packet.MUCItem;
import org.jivesoftware.smackx.nick.packet.Nick;
import org.jivesoftware.smackx.pubsub.Affiliation;
import org.xmlpull.v1.XmlPullParser;

public class MUCParserUtils {
    public static Destroy parseDestroy(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        e bareJidAttribute = ParserUtils.getBareJidAttribute(xmlPullParser);
        String str = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    if (name.hashCode() == -934964668) {
                        if (name.equals("reason")) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        str = xmlPullParser.nextText();
                        break;
                    }
                    break;
                case 3:
                    if (depth != xmlPullParser.getDepth()) {
                        break;
                    }
                    return new Destroy(bareJidAttribute, str);
                default:
                    break;
            }
        }
    }

    public static MUCItem parseItem(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        MUCAffiliation fromString = MUCAffiliation.fromString(xmlPullParser.getAttributeValue("", Affiliation.ELEMENT));
        d resourcepartAttribute = ParserUtils.getResourcepartAttribute(xmlPullParser, Nick.ELEMENT_NAME);
        MUCRole fromString2 = MUCRole.fromString(xmlPullParser.getAttributeValue("", "role"));
        i jidAttribute = ParserUtils.getJidAttribute(xmlPullParser);
        i iVar = null;
        String str = iVar;
        d dVar = str;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -934964668) {
                        if (hashCode == 92645877) {
                            if (name.equals("actor")) {
                                obj = null;
                            }
                        }
                    } else if (name.equals("reason")) {
                        obj = 1;
                    }
                    switch (obj) {
                        case null:
                            iVar = ParserUtils.getJidAttribute(xmlPullParser);
                            name = xmlPullParser.getAttributeValue("", Nick.ELEMENT_NAME);
                            if (name == null) {
                                break;
                            }
                            dVar = d.a(name);
                            break;
                        case 1:
                            str = xmlPullParser.nextText();
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new MUCItem(fromString, fromString2, iVar, str, jidAttribute, resourcepartAttribute, dVar);
                default:
                    break;
            }
        }
    }
}
