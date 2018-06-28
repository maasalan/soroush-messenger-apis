package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Stanza;

public final class EmptyToMatcher implements StanzaFilter {
    public static final EmptyToMatcher INSTANCE = new EmptyToMatcher();

    private EmptyToMatcher() {
    }

    public final boolean accept(Stanza stanza) {
        return stanza.getTo() == null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
