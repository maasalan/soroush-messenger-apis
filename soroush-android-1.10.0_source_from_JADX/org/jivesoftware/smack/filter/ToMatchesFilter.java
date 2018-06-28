package org.jivesoftware.smack.filter;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

public final class ToMatchesFilter extends AbstractFromToMatchesFilter {
    public static final ToMatchesFilter MATCH_NO_TO_SET = create(null);

    public ToMatchesFilter(i iVar, boolean z) {
        super(iVar, z);
    }

    public static ToMatchesFilter create(i iVar) {
        return new ToMatchesFilter(iVar, iVar != null ? iVar.j() : false);
    }

    public static ToMatchesFilter createBare(i iVar) {
        return new ToMatchesFilter(iVar, true);
    }

    public static ToMatchesFilter createFull(i iVar) {
        return new ToMatchesFilter(iVar, false);
    }

    protected final i getAddressToCompare(Stanza stanza) {
        return stanza.getTo();
    }
}
