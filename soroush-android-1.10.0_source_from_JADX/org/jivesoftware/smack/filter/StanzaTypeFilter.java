package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;

public final class StanzaTypeFilter implements StanzaFilter {
    public static final StanzaTypeFilter IQ = new StanzaTypeFilter(IQ.class);
    public static final StanzaTypeFilter MESSAGE = new StanzaTypeFilter(Message.class);
    public static final StanzaTypeFilter PRESENCE = new StanzaTypeFilter(Presence.class);
    private final Class<? extends Stanza> packetType;

    public StanzaTypeFilter(Class<? extends Stanza> cls) {
        this.packetType = cls;
    }

    public final boolean accept(Stanza stanza) {
        return this.packetType.isInstance(stanza);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(this.packetType.getSimpleName());
        return stringBuilder.toString();
    }
}
