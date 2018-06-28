package org.jivesoftware.smackx.blocking.provider;

import java.util.ArrayList;
import java.util.List;
import org.b.a.a.d;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.blocking.element.UnblockContactsIQ;
import org.xmlpull.v1.XmlPullParser;

public class UnblockContactsIQProvider extends IQProvider<UnblockContactsIQ> {
    public UnblockContactsIQ parse(XmlPullParser xmlPullParser, int i) {
        List list = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    if (!xmlPullParser.getName().equals("item")) {
                        break;
                    }
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(d.a(xmlPullParser.getAttributeValue("", ParserUtils.JID)));
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return new UnblockContactsIQ(list);
                default:
                    break;
            }
        }
    }
}
