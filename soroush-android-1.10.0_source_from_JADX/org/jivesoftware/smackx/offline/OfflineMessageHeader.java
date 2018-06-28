package org.jivesoftware.smackx.offline;

import org.b.a.i;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;

public class OfflineMessageHeader {
    private String jid;
    private String stamp;
    private i user;

    public OfflineMessageHeader(Item item) {
        this.user = item.getEntityID();
        this.jid = item.getName();
        this.stamp = item.getNode();
    }

    public String getJid() {
        return this.jid;
    }

    public String getStamp() {
        return this.stamp;
    }

    public i getUser() {
        return this.user;
    }
}
