package org.jivesoftware.smackx.blocking.provider;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.blocking.element.BlockContactsIQ;
import org.xmlpull.v1.XmlPullParser;

public class BlockContactsIQProvider extends IQProvider<BlockContactsIQ> {
    public BlockContactsIQ parse(XmlPullParser xmlPullParser, int i) {
        List arrayList = new ArrayList();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    if (!xmlPullParser.getName().equals("item")) {
                        break;
                    }
                    arrayList.add(ParserUtils.getJidAttribute(xmlPullParser));
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return new BlockContactsIQ(arrayList);
                default:
                    break;
            }
        }
    }
}
