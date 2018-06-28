package org.jivesoftware.smackx.muc;

import org.b.a.e;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;

public class HostedRoom {
    private final e jid;
    private final String name;

    public HostedRoom(Item item) {
        this.jid = (e) Objects.requireNonNull(item.getEntityID().n(), "The discovered item must be an entity bare JID");
        this.name = item.getName();
    }

    public e getJid() {
        return this.jid;
    }

    public String getName() {
        return this.name;
    }
}
