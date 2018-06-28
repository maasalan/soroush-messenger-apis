package org.jivesoftware.smack.filter;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

public abstract class AbstractFromToMatchesFilter implements StanzaFilter {
    private final i address;
    private final boolean ignoreResourcepart;

    protected AbstractFromToMatchesFilter(i iVar, boolean z) {
        if (iVar != null && z) {
            iVar = iVar.m();
        }
        this.address = iVar;
        this.ignoreResourcepart = z;
    }

    public final boolean accept(Stanza stanza) {
        i addressToCompare = getAddressToCompare(stanza);
        if (addressToCompare == null) {
            return this.address == null;
        } else {
            if (this.ignoreResourcepart) {
                addressToCompare = addressToCompare.m();
            }
            return addressToCompare.a(this.address);
        }
    }

    protected abstract i getAddressToCompare(Stanza stanza);

    public final String toString() {
        String str = this.ignoreResourcepart ? "ignoreResourcepart" : "full";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" (");
        stringBuilder.append(str);
        stringBuilder.append("): ");
        stringBuilder.append(this.address);
        return stringBuilder.toString();
    }
}
