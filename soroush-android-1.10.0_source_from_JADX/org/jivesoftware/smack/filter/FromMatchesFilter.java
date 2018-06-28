package org.jivesoftware.smack.filter;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

public final class FromMatchesFilter extends AbstractFromToMatchesFilter {
    public static final FromMatchesFilter MATCH_NO_FROM_SET = create(null);

    public FromMatchesFilter(i iVar, boolean z) {
        super(iVar, z);
    }

    public static FromMatchesFilter create(i iVar) {
        return new FromMatchesFilter(iVar, iVar != null ? iVar.j() : false);
    }

    public static FromMatchesFilter createBare(i iVar) {
        return new FromMatchesFilter(iVar, true);
    }

    public static FromMatchesFilter createFull(i iVar) {
        return new FromMatchesFilter(iVar, false);
    }

    protected final i getAddressToCompare(Stanza stanza) {
        return stanza.getFrom();
    }
}
