package org.jivesoftware.smack.roster;

import org.b.a.i;
import org.jivesoftware.smack.packet.Presence;

public interface SubscribeListener {

    public enum SubscribeAnswer {
        Approve,
        Deny
    }

    SubscribeAnswer processSubscribe(i iVar, Presence presence);
}
