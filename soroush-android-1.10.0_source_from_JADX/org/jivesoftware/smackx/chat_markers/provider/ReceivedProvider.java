package org.jivesoftware.smackx.chat_markers.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.chat_markers.element.ChatMarkersElements.ReceivedExtension;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.xmlpull.v1.XmlPullParser;

public class ReceivedProvider extends ExtensionElementProvider<ReceivedExtension> {
    public ReceivedExtension parse(XmlPullParser xmlPullParser, int i) {
        return new ReceivedExtension(xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG));
    }
}
