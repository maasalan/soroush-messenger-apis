package org.jivesoftware.smackx.disco.provider;

import org.b.a.i;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.xmlpull.v1.XmlPullParser;

public class DiscoverItemsProvider extends IQProvider<DiscoverItems> {
    public DiscoverItems parse(XmlPullParser xmlPullParser, int i) {
        DiscoverItems discoverItems = new DiscoverItems();
        String str = "";
        String str2 = "";
        String str3 = "";
        discoverItems.setNode(xmlPullParser.getAttributeValue("", NodeElement.ELEMENT));
        Object obj = null;
        i iVar = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 2 && "item".equals(xmlPullParser.getName())) {
                iVar = ParserUtils.getJidAttribute(xmlPullParser);
                str = xmlPullParser.getAttributeValue("", "name");
                str3 = xmlPullParser.getAttributeValue("", NodeElement.ELEMENT);
                str2 = xmlPullParser.getAttributeValue("", Action.ATTRIBUTE_NAME);
            } else if (next == 3 && "item".equals(xmlPullParser.getName())) {
                Item item = new Item(iVar);
                item.setName(str);
                item.setNode(str3);
                item.setAction(str2);
                discoverItems.addItem(item);
            } else if (next == 3 && "query".equals(xmlPullParser.getName())) {
                obj = 1;
            }
        }
        return discoverItems;
    }
}
