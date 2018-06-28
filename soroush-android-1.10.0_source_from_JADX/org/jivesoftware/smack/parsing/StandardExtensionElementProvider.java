package org.jivesoftware.smack.parsing;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jivesoftware.smack.packet.StandardExtensionElement;
import org.jivesoftware.smack.packet.StandardExtensionElement.Builder;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.StringUtils;
import org.xmlpull.v1.XmlPullParser;

public class StandardExtensionElementProvider extends ExtensionElementProvider<StandardExtensionElement> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static StandardExtensionElementProvider INSTANCE = new StandardExtensionElementProvider();

    public StandardExtensionElement parse(XmlPullParser xmlPullParser, int i) {
        Builder builder = StandardExtensionElement.builder(xmlPullParser.getName(), xmlPullParser.getNamespace());
        int namespaceCount = xmlPullParser.getNamespaceCount(i);
        int attributeCount = xmlPullParser.getAttributeCount();
        Map linkedHashMap = new LinkedHashMap(namespaceCount + attributeCount);
        int i2 = 0;
        for (int i3 = 0; i3 < namespaceCount; i3++) {
            String namespacePrefix = xmlPullParser.getNamespacePrefix(i3);
            if (namespacePrefix != null) {
                String namespaceUri = xmlPullParser.getNamespaceUri(i3);
                StringBuilder stringBuilder = new StringBuilder("xmlns:");
                stringBuilder.append(namespacePrefix);
                linkedHashMap.put(stringBuilder.toString(), namespaceUri);
            }
        }
        while (i2 < attributeCount) {
            CharSequence attributePrefix = xmlPullParser.getAttributePrefix(i2);
            Object attributeName = xmlPullParser.getAttributeName(i2);
            namespacePrefix = xmlPullParser.getAttributeValue(i2);
            if (!StringUtils.isNullOrEmpty(attributePrefix)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(attributePrefix);
                stringBuilder2.append(':');
                stringBuilder2.append(attributeName);
                attributeName = stringBuilder2.toString();
            }
            linkedHashMap.put(attributeName, namespacePrefix);
            i2++;
        }
        builder.addAttributes(linkedHashMap);
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    builder.addElement(parse(xmlPullParser, xmlPullParser.getDepth()));
                    break;
                case 3:
                    if (i != xmlPullParser.getDepth()) {
                        break;
                    }
                    ParserUtils.assertAtEndTag(xmlPullParser);
                    return builder.build();
                case 4:
                    builder.setText(xmlPullParser.getText());
                    break;
                default:
                    break;
            }
        }
    }
}
