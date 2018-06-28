package org.jivesoftware.smackx.muc.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.muc.packet.MUCAdmin;
import org.xmlpull.v1.XmlPullParser;

public class MUCAdminProvider extends IQProvider<MUCAdmin> {
    public MUCAdmin parse(XmlPullParser xmlPullParser, int i) {
        MUCAdmin mUCAdmin = new MUCAdmin();
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("item")) {
                    mUCAdmin.addItem(MUCParserUtils.parseItem(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                obj = 1;
            }
        }
        return mUCAdmin;
    }
}
