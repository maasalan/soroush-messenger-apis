package org.jivesoftware.smackx.muc.filter;

import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;

public class MUCUserStatusCodeFilter implements StanzaFilter {
    public static final MUCUserStatusCodeFilter STATUS_110_PRESENCE_TO_SELF = new MUCUserStatusCodeFilter(Status.PRESENCE_TO_SELF_110);
    private final Status status;

    public MUCUserStatusCodeFilter(int i) {
        this(Status.create(Integer.valueOf(i)));
    }

    public MUCUserStatusCodeFilter(Status status) {
        this.status = status;
    }

    public boolean accept(Stanza stanza) {
        MUCUser from = MUCUser.from(stanza);
        return from == null ? false : from.getStatus().contains(this.status);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": status=");
        stringBuilder.append(this.status);
        return stringBuilder.toString();
    }
}
