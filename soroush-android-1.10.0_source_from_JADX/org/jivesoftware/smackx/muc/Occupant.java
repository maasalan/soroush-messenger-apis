package org.jivesoftware.smackx.muc;

import java.util.logging.Logger;
import org.b.a.b.d;
import org.b.a.f;
import org.b.a.i;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smackx.muc.packet.MUCItem;
import org.jivesoftware.smackx.muc.packet.MUCUser;

public class Occupant {
    private static final Logger LOGGER = Logger.getLogger(Occupant.class.getName());
    private final MUCAffiliation affiliation;
    private final i jid;
    private final d nick;
    private final MUCRole role;

    Occupant(Presence presence) {
        d dVar;
        MUCItem item = ((MUCUser) presence.getExtension("x", MUCUser.NAMESPACE)).getItem();
        this.jid = item.getJid();
        this.affiliation = item.getAffiliation();
        this.role = item.getRole();
        f p = presence.getFrom().p();
        if (p == null) {
            Logger logger = LOGGER;
            StringBuilder stringBuilder = new StringBuilder("Occupant presence without resource: ");
            stringBuilder.append(presence.getFrom());
            logger.warning(stringBuilder.toString());
            dVar = null;
        } else {
            dVar = p.c();
        }
        this.nick = dVar;
    }

    Occupant(MUCItem mUCItem) {
        this.jid = mUCItem.getJid();
        this.affiliation = mUCItem.getAffiliation();
        this.role = mUCItem.getRole();
        this.nick = mUCItem.getNick();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Occupant)) {
            return false;
        }
        return this.jid.a(((Occupant) obj).jid);
    }

    public MUCAffiliation getAffiliation() {
        return this.affiliation;
    }

    public i getJid() {
        return this.jid;
    }

    public d getNick() {
        return this.nick;
    }

    public MUCRole getRole() {
        return this.role;
    }

    public int hashCode() {
        return (17 * ((((this.affiliation.hashCode() * 17) + this.role.hashCode()) * 17) + this.jid.hashCode())) + (this.nick != null ? this.nick.hashCode() : 0);
    }
}
