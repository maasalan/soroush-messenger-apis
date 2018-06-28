package org.jivesoftware.smack.filter;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

public abstract class AbstractJidTypeFilter implements StanzaFilter {
    private final JidType jidType;

    protected enum JidType {
        entityFull,
        entityBare,
        domainFull,
        domainBare
    }

    protected AbstractJidTypeFilter(JidType jidType) {
        this.jidType = jidType;
    }

    public final boolean accept(Stanza stanza) {
        i from = stanza.getFrom();
        if (from == null) {
            return false;
        }
        switch (this.jidType) {
            case entityFull:
                return from.g();
            case entityBare:
                return from.f();
            case domainFull:
                return from.i();
            case domainBare:
                return from.h();
            default:
                throw new AssertionError();
        }
    }

    protected abstract i getJidToInspect(Stanza stanza);
}
