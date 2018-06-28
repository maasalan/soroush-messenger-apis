package org.jivesoftware.smackx.muc;

import org.b.a.b.d;
import org.b.a.i;
import org.jivesoftware.smackx.muc.packet.MUCItem;

public class Affiliate {
    private final MUCAffiliation affiliation;
    private final i jid;
    private final d nick;
    private final MUCRole role;

    Affiliate(MUCItem mUCItem) {
        this.jid = mUCItem.getJid();
        this.affiliation = mUCItem.getAffiliation();
        this.role = mUCItem.getRole();
        this.nick = mUCItem.getNick();
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
}
