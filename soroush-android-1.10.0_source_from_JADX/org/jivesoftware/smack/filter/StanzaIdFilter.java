package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;

public class StanzaIdFilter implements StanzaFilter {
    private final String stanzaId;

    public StanzaIdFilter(String str) {
        this.stanzaId = (String) StringUtils.requireNotNullOrEmpty(str, "Stanza ID must not be null or empty.");
    }

    public StanzaIdFilter(Stanza stanza) {
        this(stanza.getStanzaId());
    }

    public boolean accept(Stanza stanza) {
        return this.stanzaId.equals(stanza.getStanzaId());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": id=");
        stringBuilder.append(this.stanzaId);
        return stringBuilder.toString();
    }
}
