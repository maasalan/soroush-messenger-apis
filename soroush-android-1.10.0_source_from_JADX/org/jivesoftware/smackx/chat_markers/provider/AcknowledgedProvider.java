package org.jivesoftware.smackx.chat_markers.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.chat_markers.element.ChatMarkersElements.AcknowledgedExtension;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.xmlpull.v1.XmlPullParser;

public class AcknowledgedProvider extends ExtensionElementProvider<AcknowledgedExtension> {
    public AcknowledgedExtension parse(XmlPullParser xmlPullParser, int i) {
        return new AcknowledgedExtension(xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG));
    }
}
