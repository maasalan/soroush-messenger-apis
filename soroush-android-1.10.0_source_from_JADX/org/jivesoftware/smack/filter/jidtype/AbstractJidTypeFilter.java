package org.jivesoftware.smack.filter.jidtype;

import org.b.a.i;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.Objects;

public abstract class AbstractJidTypeFilter implements StanzaFilter {
    private final JidType jidType;

    public enum JidType {
        BareJid,
        DomainBareJid,
        DomainFullJid,
        DomainJid,
        EntityBareJid,
        EntityFullJid,
        EntityJid,
        FullJid;

        public final boolean isTypeOf(i iVar) {
            if (iVar == null) {
                return false;
            }
            switch (this) {
                case BareJid:
                    return iVar.j();
                case DomainBareJid:
                    return iVar.h();
                case DomainFullJid:
                    return iVar.i();
                case EntityBareJid:
                    return iVar.f();
                case EntityFullJid:
                    return iVar.g();
                case EntityJid:
                    return iVar.e();
                case FullJid:
                    return iVar.k();
                default:
                    throw new IllegalStateException();
            }
        }
    }

    protected AbstractJidTypeFilter(JidType jidType) {
        this.jidType = (JidType) Objects.requireNonNull(jidType, "jidType must not be null");
    }

    public boolean accept(Stanza stanza) {
        i jidToMatchFrom = getJidToMatchFrom(stanza);
        return jidToMatchFrom == null ? false : this.jidType.isTypeOf(jidToMatchFrom);
    }

    protected abstract i getJidToMatchFrom(Stanza stanza);

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(this.jidType);
        return stringBuilder.toString();
    }
}
