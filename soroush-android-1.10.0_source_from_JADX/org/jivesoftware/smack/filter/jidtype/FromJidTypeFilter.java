package org.jivesoftware.smack.filter.jidtype;

import org.b.a.i;
import org.jivesoftware.smack.filter.jidtype.AbstractJidTypeFilter.JidType;
import org.jivesoftware.smack.packet.Stanza;

public class FromJidTypeFilter extends AbstractJidTypeFilter {
    public FromJidTypeFilter(JidType jidType) {
        super(jidType);
    }

    protected i getJidToMatchFrom(Stanza stanza) {
        return stanza.getFrom();
    }
}
