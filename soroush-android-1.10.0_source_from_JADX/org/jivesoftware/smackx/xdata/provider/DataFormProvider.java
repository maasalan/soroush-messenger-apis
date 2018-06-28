package org.jivesoftware.smackx.xdata.provider;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Option;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Item;
import org.jivesoftware.smackx.xdata.packet.DataForm.ReportedData;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import org.jivesoftware.smackx.xdatavalidation.provider.DataValidationProvider;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class DataFormProvider extends ExtensionElementProvider<DataForm> {
    public static final DataFormProvider INSTANCE = new DataFormProvider();

    private static FormField parseField(XmlPullParser xmlPullParser) {
        FormField formField;
        int depth = xmlPullParser.getDepth();
        String attributeValue = xmlPullParser.getAttributeValue("", "var");
        Type fromString = Type.fromString(xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE));
        if (fromString == Type.fixed) {
            formField = new FormField();
        } else {
            FormField formField2 = new FormField(attributeValue);
            formField2.setType(fromString);
            formField = formField2;
        }
        formField.setLabel(xmlPullParser.getAttributeValue("", "label"));
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    boolean z = true;
                    switch (name.hashCode()) {
                        case -1421272810:
                            if (name.equals(ValidateElement.ELEMENT)) {
                                z = true;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (name.equals(Option.ELEMENT)) {
                                z = true;
                                break;
                            }
                            break;
                        case -393139297:
                            if (name.equals("required")) {
                                z = true;
                                break;
                            }
                            break;
                        case 3079825:
                            if (name.equals("desc")) {
                                z = false;
                                break;
                            }
                            break;
                        case 111972721:
                            if (name.equals("value")) {
                                z = true;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (z) {
                        case false:
                            formField.setDescription(xmlPullParser.nextText());
                            break;
                        case true:
                            formField.addValue(xmlPullParser.nextText());
                            break;
                        case true:
                            formField.setRequired(true);
                            break;
                        case true:
                            formField.addOption(parseOption(xmlPullParser));
                            break;
                        case true:
                            if (!namespace.equals(ValidateElement.NAMESPACE)) {
                                break;
                            }
                            formField.setValidateElement(DataValidationProvider.parse(xmlPullParser));
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return formField;
                default:
                    break;
            }
        }
    }

    private static Item parseItem(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        List arrayList = new ArrayList();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    if (name.hashCode() == 97427706) {
                        if (name.equals(FormField.ELEMENT)) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        arrayList.add(parseField(xmlPullParser));
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new Item(arrayList);
                default:
                    break;
            }
        }
    }

    private static Option parseOption(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String attributeValue = xmlPullParser.getAttributeValue("", "label");
        Option option = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    if (name.hashCode() == 111972721) {
                        if (name.equals("value")) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        option = new Option(attributeValue, xmlPullParser.nextText());
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return option;
                default:
                    break;
            }
        }
    }

    private static ReportedData parseReported(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        List arrayList = new ArrayList();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    if (name.hashCode() == 97427706) {
                        if (name.equals(FormField.ELEMENT)) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        arrayList.add(parseField(xmlPullParser));
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new ReportedData(arrayList);
                default:
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.xdata.packet.DataForm parse(org.xmlpull.v1.XmlPullParser r6, int r7) {
        /*
        r5 = this;
        r0 = "";
        r1 = "type";
        r0 = r6.getAttributeValue(r0, r1);
        r0 = org.jivesoftware.smackx.xdata.packet.DataForm.Type.fromString(r0);
        r1 = new org.jivesoftware.smackx.xdata.packet.DataForm;
        r1.<init>(r0);
    L_0x0011:
        r0 = r6.next();
        switch(r0) {
            case 2: goto L_0x0021;
            case 3: goto L_0x0019;
            default: goto L_0x0018;
        };
    L_0x0018:
        goto L_0x0011;
    L_0x0019:
        r0 = r6.getDepth();
        if (r0 == r7) goto L_0x0020;
    L_0x001f:
        goto L_0x0011;
    L_0x0020:
        return r1;
    L_0x0021:
        r0 = r6.getName();
        r2 = r6.getNamespace();
        r3 = -1;
        r4 = r0.hashCode();
        switch(r4) {
            case -427039533: goto L_0x006e;
            case 3242771: goto L_0x0064;
            case 3433103: goto L_0x005a;
            case 97427706: goto L_0x0050;
            case 107944136: goto L_0x0046;
            case 110371416: goto L_0x003c;
            case 757376421: goto L_0x0032;
            default: goto L_0x0031;
        };
    L_0x0031:
        goto L_0x0077;
    L_0x0032:
        r4 = "instructions";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0077;
    L_0x003a:
        r3 = 0;
        goto L_0x0077;
    L_0x003c:
        r4 = "title";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0077;
    L_0x0044:
        r3 = 1;
        goto L_0x0077;
    L_0x0046:
        r4 = "query";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0077;
    L_0x004e:
        r3 = 5;
        goto L_0x0077;
    L_0x0050:
        r4 = "field";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0077;
    L_0x0058:
        r3 = 2;
        goto L_0x0077;
    L_0x005a:
        r4 = "page";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0077;
    L_0x0062:
        r3 = 6;
        goto L_0x0077;
    L_0x0064:
        r4 = "item";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0077;
    L_0x006c:
        r3 = 3;
        goto L_0x0077;
    L_0x006e:
        r4 = "reported";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0077;
    L_0x0076:
        r3 = 4;
    L_0x0077:
        switch(r3) {
            case 0: goto L_0x00bf;
            case 1: goto L_0x00b6;
            case 2: goto L_0x00ad;
            case 3: goto L_0x00a4;
            case 4: goto L_0x009b;
            case 5: goto L_0x0088;
            case 6: goto L_0x007b;
            default: goto L_0x007a;
        };
    L_0x007a:
        goto L_0x0011;
    L_0x007b:
        r0 = "http://jabber.org/protocol/xdata-layout";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0011;
    L_0x0083:
        r0 = org.jivesoftware.smackx.xdatalayout.provider.DataLayoutProvider.parse(r6);
        goto L_0x0096;
    L_0x0088:
        r0 = "jabber:iq:roster";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0011;
    L_0x0090:
        r0 = org.jivesoftware.smack.roster.provider.RosterPacketProvider.INSTANCE;
        r0 = r0.parse(r6);
    L_0x0096:
        r1.addExtensionElement(r0);
        goto L_0x0011;
    L_0x009b:
        r0 = parseReported(r6);
        r1.setReportedData(r0);
        goto L_0x0011;
    L_0x00a4:
        r0 = parseItem(r6);
        r1.addItem(r0);
        goto L_0x0011;
    L_0x00ad:
        r0 = parseField(r6);
        r1.addField(r0);
        goto L_0x0011;
    L_0x00b6:
        r0 = r6.nextText();
        r1.setTitle(r0);
        goto L_0x0011;
    L_0x00bf:
        r0 = r6.nextText();
        r1.addInstruction(r0);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdata.provider.DataFormProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.xdata.packet.DataForm");
    }
}
