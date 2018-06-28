package org.jivesoftware.smackx.vcardtemp.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.vcardtemp.packet.VCard;
import org.xmlpull.v1.XmlPullParser;

public class VCardProvider extends IQProvider<VCard> {
    private static final String[] ADR = new String[]{"POSTAL", "PARCEL", "DOM", "INTL", "PREF", "POBOX", "EXTADR", "STREET", "LOCALITY", "REGION", "PCODE", "CTRY", "FF"};
    private static final String[] TEL = new String[]{"VOICE", "FAX", "PAGER", "MSG", "CELL", "VIDEO", "BBS", "MODEM", "ISDN", "PCS", "PREF"};

    private static void parseAddress(XmlPullParser xmlPullParser, VCard vCard) {
        int depth = xmlPullParser.getDepth();
        Object obj = 1;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    if (!"HOME".equals(name)) {
                        for (String equals : ADR) {
                            if (equals.equals(name)) {
                                if (obj != null) {
                                    vCard.setAddressFieldWork(name, xmlPullParser.nextText());
                                } else {
                                    vCard.setAddressFieldHome(name, xmlPullParser.nextText());
                                }
                            }
                        }
                        break;
                    }
                    obj = null;
                    break;
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

    private static void parseEmail(XmlPullParser xmlPullParser, VCard vCard) {
        int depth = xmlPullParser.getDepth();
        Object obj = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj2 = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -1782700506) {
                        if (hashCode == 2670353) {
                            if (name.equals("WORK")) {
                                obj2 = null;
                            }
                        }
                    } else if (name.equals("USERID")) {
                        obj2 = 1;
                    }
                    switch (obj2) {
                        case null:
                            obj = 1;
                            break;
                        case 1:
                            if (obj == null) {
                                vCard.setEmailHome(xmlPullParser.nextText());
                                break;
                            } else {
                                vCard.setEmailWork(xmlPullParser.nextText());
                                break;
                            }
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

    private static void parseName(XmlPullParser xmlPullParser, VCard vCard) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    switch (name.hashCode()) {
                        case -2021012075:
                            if (name.equals("MIDDLE")) {
                                obj = 2;
                                break;
                            }
                            break;
                        case -1926781294:
                            if (name.equals("PREFIX")) {
                                obj = 3;
                                break;
                            }
                            break;
                        case -1838093487:
                            if (name.equals("SUFFIX")) {
                                obj = 4;
                                break;
                            }
                            break;
                        case 67829597:
                            if (name.equals("GIVEN")) {
                                obj = 1;
                                break;
                            }
                            break;
                        case 2066435940:
                            if (name.equals("FAMILY")) {
                                obj = null;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            vCard.setLastName(xmlPullParser.nextText());
                            break;
                        case 1:
                            vCard.setFirstName(xmlPullParser.nextText());
                            break;
                        case 2:
                            vCard.setMiddleName(xmlPullParser.nextText());
                            break;
                        case 3:
                            vCard.setPrefix(xmlPullParser.nextText());
                            break;
                        case 4:
                            vCard.setSuffix(xmlPullParser.nextText());
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

    private static void parseOrg(XmlPullParser xmlPullParser, VCard vCard) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -486104241) {
                        if (hashCode == -485883320) {
                            if (name.equals("ORGUNIT")) {
                                obj = 1;
                            }
                        }
                    } else if (name.equals("ORGNAME")) {
                        obj = null;
                    }
                    switch (obj) {
                        case null:
                            vCard.setOrganization(xmlPullParser.nextText());
                            break;
                        case 1:
                            vCard.setOrganizationUnit(xmlPullParser.nextText());
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

    private static void parsePhoto(XmlPullParser xmlPullParser, VCard vCard) {
        int depth = xmlPullParser.getDepth();
        String str = null;
        String str2 = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != 2590522) {
                        if (hashCode == 1959349434) {
                            if (name.equals("BINVAL")) {
                                obj = null;
                            }
                        }
                    } else if (name.equals("TYPE")) {
                        obj = 1;
                    }
                    switch (obj) {
                        case null:
                            str = xmlPullParser.nextText();
                            break;
                        case 1:
                            str2 = xmlPullParser.nextText();
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    } else if (str != null && str2 != null) {
                        vCard.setAvatar(str, str2);
                        return;
                    } else {
                        return;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private static void parseTel(XmlPullParser xmlPullParser, VCard vCard) {
        int depth = xmlPullParser.getDepth();
        Object obj = 1;
        CharSequence charSequence = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    if (!"HOME".equals(name)) {
                        if (!"NUMBER".equals(name)) {
                            CharSequence charSequence2 = charSequence;
                            for (String equals : TEL) {
                                if (equals.equals(name)) {
                                    charSequence2 = name;
                                }
                            }
                            charSequence = charSequence2;
                            break;
                        }
                        if (StringUtils.isNullOrEmpty(charSequence)) {
                            charSequence = "VOICE";
                        }
                        if (obj == null) {
                            vCard.setPhoneHome(charSequence, xmlPullParser.nextText());
                            break;
                        } else {
                            vCard.setPhoneWork(charSequence, xmlPullParser.nextText());
                            break;
                        }
                    }
                    obj = null;
                    break;
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

    public VCard parse(XmlPullParser xmlPullParser, int i) {
        VCard vCard = new VCard();
        String str = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    str = xmlPullParser.getName();
                    Object obj = -1;
                    switch (str.hashCode()) {
                        case -370243905:
                            if (str.equals("JABBERID")) {
                                obj = 6;
                                break;
                            }
                            break;
                        case 78:
                            if (str.equals("N")) {
                                obj = null;
                                break;
                            }
                            break;
                        case 64655:
                            if (str.equals("ADR")) {
                                obj = 3;
                                break;
                            }
                            break;
                        case 78532:
                            if (str.equals("ORG")) {
                                obj = 1;
                                break;
                            }
                            break;
                        case 82939:
                            if (str.equals("TEL")) {
                                obj = 2;
                                break;
                            }
                            break;
                        case 66081660:
                            if (str.equals("EMAIL")) {
                                obj = 4;
                                break;
                            }
                            break;
                        case 76105234:
                            if (str.equals("PHOTO")) {
                                obj = 7;
                                break;
                            }
                            break;
                        case 853317742:
                            if (str.equals("NICKNAME")) {
                                obj = 5;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            parseName(xmlPullParser, vCard);
                            break;
                        case 1:
                            parseOrg(xmlPullParser, vCard);
                            break;
                        case 2:
                            parseTel(xmlPullParser, vCard);
                            break;
                        case 3:
                            parseAddress(xmlPullParser, vCard);
                            break;
                        case 4:
                            parseEmail(xmlPullParser, vCard);
                            break;
                        case 5:
                            vCard.setNickName(xmlPullParser.nextText());
                            break;
                        case 6:
                            vCard.setJabberId(xmlPullParser.nextText());
                            break;
                        case 7:
                            parsePhoto(xmlPullParser, vCard);
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return vCard;
                case 4:
                    if (i + 1 != xmlPullParser.getDepth()) {
                        break;
                    }
                    vCard.setField(str, xmlPullParser.getText());
                    break;
                default:
                    break;
            }
        }
    }
}
