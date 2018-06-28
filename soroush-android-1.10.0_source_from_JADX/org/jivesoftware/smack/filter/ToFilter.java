package org.jivesoftware.smack.filter;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

@Deprecated
public class ToFilter implements StanzaFilter {
    private final i to;

    public ToFilter(i iVar) {
        this.to = iVar;
    }

    public boolean accept(Stanza stanza) {
        i to = stanza.getTo();
        return to == null ? false : to.a(this.to);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": to=");
        stringBuilder.append(this.to);
        return stringBuilder.toString();
    }
}
