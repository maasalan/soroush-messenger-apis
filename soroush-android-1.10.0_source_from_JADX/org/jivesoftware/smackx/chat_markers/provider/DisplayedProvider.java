package org.jivesoftware.smackx.chat_markers.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.chat_markers.element.ChatMarkersElements.DisplayedExtension;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.xmlpull.v1.XmlPullParser;

public class DisplayedProvider extends ExtensionElementProvider<DisplayedExtension> {
    public DisplayedExtension parse(XmlPullParser xmlPullParser, int i) {
        return new DisplayedExtension(xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG));
    }
}
