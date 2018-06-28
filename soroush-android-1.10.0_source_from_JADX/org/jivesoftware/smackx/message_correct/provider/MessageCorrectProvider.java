package org.jivesoftware.smackx.message_correct.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.xmlpull.v1.XmlPullParser;

public class MessageCorrectProvider extends ExtensionElementProvider<MessageCorrectExtension> {
    public MessageCorrectExtension parse(XmlPullParser xmlPullParser, int i) {
        return new MessageCorrectExtension(xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG));
    }
}
