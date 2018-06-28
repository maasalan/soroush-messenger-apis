package org.jivesoftware.smack.filter;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

public final class ToTypeFilter extends AbstractJidTypeFilter {
    public static final ToTypeFilter DOMAIN_BARE_JID = new ToTypeFilter(JidType.domainBare);
    public static final ToTypeFilter DOMAIN_FULL_JID = new ToTypeFilter(JidType.domainFull);
    public static final ToTypeFilter ENTITY_BARE_JID = new ToTypeFilter(JidType.entityBare);
    public static final ToTypeFilter ENTITY_FULL_JID = new ToTypeFilter(JidType.entityFull);
    public static final StanzaFilter ENTITY_FULL_OR_BARE_JID = new OrFilter(ENTITY_FULL_JID, ENTITY_BARE_JID);

    private ToTypeFilter(JidType jidType) {
        super(jidType);
    }

    protected final i getJidToInspect(Stanza stanza) {
        return stanza.getTo();
    }
}
