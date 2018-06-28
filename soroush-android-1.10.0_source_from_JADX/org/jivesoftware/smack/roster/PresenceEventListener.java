package org.jivesoftware.smack.roster;

import org.b.a.a;
import org.b.a.h;
import org.b.a.i;
import org.jivesoftware.smack.packet.Presence;

public interface PresenceEventListener {
    void presenceAvailable(h hVar, Presence presence);

    void presenceError(i iVar, Presence presence);

    void presenceSubscribed(a aVar, Presence presence);

    void presenceUnavailable(h hVar, Presence presence);

    void presenceUnsubscribed(a aVar, Presence presence);
}
