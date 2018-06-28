package org.jivesoftware.smack.sm.predicates;

import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;

public final class ForEveryStanza implements StanzaFilter {
    public static final ForEveryStanza INSTANCE = new ForEveryStanza();

    private ForEveryStanza() {
    }

    public final boolean accept(Stanza stanza) {
        return true;
    }
}
