package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;

public class StanzaExtensionFilter implements StanzaFilter {
    private final String elementName;
    private final String namespace;

    public StanzaExtensionFilter(String str) {
        this(null, str);
    }

    public StanzaExtensionFilter(String str, String str2) {
        StringUtils.requireNotNullOrEmpty(str2, "namespace must not be null or empty");
        this.elementName = str;
        this.namespace = str2;
    }

    public StanzaExtensionFilter(ExtensionElement extensionElement) {
        this(extensionElement.getElementName(), extensionElement.getNamespace());
    }

    public boolean accept(Stanza stanza) {
        return stanza.hasExtension(this.elementName, this.namespace);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": element=");
        stringBuilder.append(this.elementName);
        stringBuilder.append(" namespace=");
        stringBuilder.append(this.namespace);
        return stringBuilder.toString();
    }
}
