package org.jivesoftware.smack.sm.predicates;

import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;

public final class ForEveryMessage implements StanzaFilter {
    public static final ForEveryMessage INSTANCE = new ForEveryMessage();

    private ForEveryMessage() {
    }

    public final boolean accept(Stanza stanza) {
        return stanza instanceof Message;
    }
}
