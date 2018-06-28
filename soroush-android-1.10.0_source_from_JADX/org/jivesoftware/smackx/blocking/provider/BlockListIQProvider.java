package org.jivesoftware.smackx.blocking.provider;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.blocking.element.BlockListIQ;
import org.xmlpull.v1.XmlPullParser;

public class BlockListIQProvider extends IQProvider<BlockListIQ> {
    public BlockListIQ parse(XmlPullParser xmlPullParser, int i) {
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
                    list.add(ParserUtils.getJidAttribute(xmlPullParser));
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    BlockListIQ blockListIQ = new BlockListIQ(list);
                    blockListIQ.setType(Type.result);
                    return blockListIQ;
                default:
                    break;
            }
        }
    }
}
