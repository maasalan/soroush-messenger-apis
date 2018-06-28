package org.jivesoftware.smackx.iot.provisioning.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.provisioning.element.Unfriend;
import org.xmlpull.v1.XmlPullParser;

public class UnfriendProvider extends ExtensionElementProvider<Unfriend> {
    public Unfriend parse(XmlPullParser xmlPullParser, int i) {
        return new Unfriend(ParserUtils.getBareJidAttribute(xmlPullParser));
    }
}
