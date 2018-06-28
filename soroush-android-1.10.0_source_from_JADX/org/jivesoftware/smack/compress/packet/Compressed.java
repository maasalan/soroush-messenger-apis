package org.jivesoftware.smack.compress.packet;

import org.jivesoftware.smack.packet.Nonza;

public final class Compressed implements Nonza {
    public static final String ELEMENT = "compressed";
    public static final Compressed INSTANCE = new Compressed();
    public static final String NAMESPACE = "http://jabber.org/protocol/compress";

    private Compressed() {
    }

    public final String getElementName() {
        return ELEMENT;
    }

    public final String getNamespace() {
        return "http://jabber.org/protocol/compress";
    }

    public final String toXML() {
        return "<compressed xmlns='http://jabber.org/protocol/compress'/>";
    }
}
