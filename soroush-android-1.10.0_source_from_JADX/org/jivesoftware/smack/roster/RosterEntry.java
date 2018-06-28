package org.jivesoftware.smack.roster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.b.a.a;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.roster.packet.RosterPacket;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemType;

public final class RosterEntry extends Manager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Item item;
    private final Roster roster;

    RosterEntry(Item item, Roster roster, XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.item = item;
        this.roster = roster;
    }

    static Item toRosterItem(RosterEntry rosterEntry) {
        return toRosterItem(rosterEntry, rosterEntry.getName());
    }

    private static Item toRosterItem(RosterEntry rosterEntry, String str) {
        Item item = new Item(rosterEntry.getJid(), str);
        item.setItemType(rosterEntry.getType());
        item.setSubscriptionPending(rosterEntry.isSubscriptionPending());
        item.setApproved(rosterEntry.isApproved());
        for (RosterGroup name : rosterEntry.getGroups()) {
            item.addGroupName(name.getName());
        }
        return item;
    }

    public final boolean canSeeHisPresence() {
        switch (getType()) {
            case both:
            case to:
                return true;
            default:
                return false;
        }
    }

    public final boolean canSeeMyPresence() {
        switch (getType()) {
            case from:
            case both:
                return true;
            default:
                return false;
        }
    }

    public final void cancelSubscription() {
        connection().sendStanza(new Presence(this.item.getJid(), Type.unsubscribed));
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : (obj == null || !(obj instanceof RosterEntry)) ? false : getJid().a(((RosterEntry) obj).getJid());
    }

    public final boolean equalsDeep(Object obj) {
        return this == obj ? true : (obj != null && getClass() == obj.getClass()) ? ((RosterEntry) obj).item.equals(this.item) : false;
    }

    public final List<RosterGroup> getGroups() {
        List<RosterGroup> arrayList = new ArrayList();
        for (RosterGroup rosterGroup : this.roster.getGroups()) {
            if (rosterGroup.contains(this)) {
                arrayList.add(rosterGroup);
            }
        }
        return arrayList;
    }

    public final a getJid() {
        return this.item.getJid();
    }

    public final String getName() {
        return this.item.getName();
    }

    public final ItemType getType() {
        return this.item.getItemType();
    }

    @Deprecated
    public final String getUser() {
        return getJid().toString();
    }

    public final int hashCode() {
        return getJid().hashCode();
    }

    public final boolean isApproved() {
        return this.item.isApproved();
    }

    public final boolean isSubscriptionPending() {
        return this.item.isSubscriptionPending();
    }

    public final synchronized void setName(String str) {
        if (str != null) {
            if (str.equals(getName())) {
                return;
            }
        }
        IQ rosterPacket = new RosterPacket();
        rosterPacket.setType(IQ.Type.set);
        rosterPacket.addRosterItem(toRosterItem(this, str));
        connection().createStanzaCollectorAndSend(rosterPacket).nextResultOrThrow();
        this.item.setName(str);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (getName() != null) {
            stringBuilder.append(getName());
            stringBuilder.append(": ");
        }
        stringBuilder.append(getJid());
        Collection groups = getGroups();
        if (!groups.isEmpty()) {
            stringBuilder.append(" [");
            Iterator it = groups.iterator();
            while (true) {
                stringBuilder.append(((RosterGroup) it.next()).getName());
                if (!it.hasNext()) {
                    break;
                }
                stringBuilder.append(", ");
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    final void updateItem(Item item) {
        this.item = item;
    }
}
