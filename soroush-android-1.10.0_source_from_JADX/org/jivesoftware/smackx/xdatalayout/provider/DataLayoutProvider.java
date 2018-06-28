package org.jivesoftware.smackx.xdatalayout.provider;

import java.util.List;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout.DataFormLayoutElement;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout.Fieldref;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout.Reportedref;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout.Section;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout.Text;
import org.xmlpull.v1.XmlPullParser;

public class DataLayoutProvider {
    public static DataLayout parse(XmlPullParser xmlPullParser) {
        DataLayout dataLayout = new DataLayout(xmlPullParser.getAttributeValue("", "label"));
        parseLayout(dataLayout.getPageLayout(), xmlPullParser);
        return dataLayout;
    }

    private static Fieldref parseFieldref(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        Fieldref fieldref = new Fieldref(xmlPullParser.getAttributeValue("", "var"));
        while (true) {
            if (xmlPullParser.next() == 3) {
                if (xmlPullParser.getDepth() == depth) {
                    return fieldref;
                }
            }
        }
    }

    private static void parseLayout(List<DataFormLayoutElement> list, XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    Object text;
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -928989863) {
                        if (hashCode != -241484064) {
                            if (hashCode != 3556653) {
                                if (hashCode == 1970241253) {
                                    if (name.equals(Section.ELEMENT)) {
                                        obj = 1;
                                    }
                                }
                            } else if (name.equals("text")) {
                                obj = null;
                            }
                        } else if (name.equals(Reportedref.ELEMENT)) {
                            obj = 3;
                        }
                    } else if (name.equals(Fieldref.ELEMENT)) {
                        obj = 2;
                    }
                    switch (obj) {
                        case null:
                            text = new Text(xmlPullParser.nextText());
                            break;
                        case 1:
                            text = parseSection(xmlPullParser);
                            break;
                        case 2:
                            text = parseFieldref(xmlPullParser);
                            break;
                        case 3:
                            text = new Reportedref();
                            break;
                        default:
                            continue;
                    }
                    list.add(text);
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

    private static Section parseSection(XmlPullParser xmlPullParser) {
        Section section = new Section(xmlPullParser.getAttributeValue("", "label"));
        parseLayout(section.getSectionLayout(), xmlPullParser);
        return section;
    }
}
