package org.jivesoftware.smackx.pubsub.packet;

import java.util.Locale;
import org.jivesoftware.smackx.pubsub.EventElement;

public enum PubSubNamespace {
    BASIC(null),
    ERROR("errors"),
    EVENT(EventElement.ELEMENT),
    OWNER("owner");
    
    private final String fragment;
    private final String fullNamespace;

    private PubSubNamespace(String str) {
        this.fragment = str;
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder("http://jabber.org/protocol/pubsub#");
            stringBuilder.append(str);
            r1 = stringBuilder.toString();
        } else {
            r1 = "http://jabber.org/protocol/pubsub";
        }
        this.fullNamespace = r1;
    }

    public static PubSubNamespace valueOfFromXmlns(String str) {
        return str.lastIndexOf(35) != -1 ? valueOf(str.substring(str.lastIndexOf(35) + 1).toUpperCase(Locale.US)) : BASIC;
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getXmlns() {
        return this.fullNamespace;
    }
}
