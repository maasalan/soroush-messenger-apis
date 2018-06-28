package org.jivesoftware.smackx.iot.discovery.provider;

import org.b.a.i;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.discovery.element.IoTRemove;
import org.jivesoftware.smackx.iot.parser.NodeInfoParser;
import org.xmlpull.v1.XmlPullParser;

public class IoTRemoveProvider extends IQProvider<IoTRemove> {
    public IoTRemove parse(XmlPullParser xmlPullParser, int i) {
        i jidAttribute = ParserUtils.getJidAttribute(xmlPullParser);
        if (!jidAttribute.k()) {
            return new IoTRemove(jidAttribute.m(), NodeInfoParser.parse(xmlPullParser));
        }
        throw new SmackException("JID must be without resourcepart");
    }
}
