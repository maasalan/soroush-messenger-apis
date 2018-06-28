package org.jivesoftware.smackx.pubsub.provider;

import org.b.a.a;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.pubsub.Affiliation;
import org.jivesoftware.smackx.pubsub.Affiliation.Type;
import org.xmlpull.v1.XmlPullParser;

public class AffiliationProvider extends ExtensionElementProvider<Affiliation> {
    public Affiliation parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, NodeElement.ELEMENT);
        a bareJidAttribute = ParserUtils.getBareJidAttribute(xmlPullParser);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, Affiliation.ELEMENT);
        Type valueOf = attributeValue2 != null ? Type.valueOf(attributeValue2) : null;
        if (attributeValue != null && bareJidAttribute == null) {
            return new Affiliation(attributeValue, valueOf);
        }
        if (attributeValue == null && bareJidAttribute != null) {
            return new Affiliation(bareJidAttribute, valueOf, null);
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid affililation. Either one of 'node' or 'jid' must be set. Node: ");
        stringBuilder.append(attributeValue);
        stringBuilder.append(". Jid: ");
        stringBuilder.append(bareJidAttribute);
        stringBuilder.append('.');
        throw new SmackException(stringBuilder.toString());
    }
}
