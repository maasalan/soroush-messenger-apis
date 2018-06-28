package org.jivesoftware.smack.filter;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

public final class FromTypeFilter extends AbstractJidTypeFilter {
    public static final FromTypeFilter DOMAIN_BARE_JID = new FromTypeFilter(JidType.domainBare);
    public static final FromTypeFilter DOMAIN_FULL_JID = new FromTypeFilter(JidType.domainFull);
    public static final FromTypeFilter ENTITY_BARE_JID = new FromTypeFilter(JidType.entityBare);
    public static final FromTypeFilter ENTITY_FULL_JID = new FromTypeFilter(JidType.entityFull);

    private FromTypeFilter(JidType jidType) {
        super(jidType);
    }

    protected final i getJidToInspect(Stanza stanza) {
        return stanza.getFrom();
    }
}
