package org.jivesoftware.smack.roster;

import java.util.Collection;
import org.b.a.i;
import org.jivesoftware.smack.packet.Presence;

public interface RosterListener {
    void entriesAdded(Collection<i> collection);

    void entriesDeleted(Collection<i> collection);

    void entriesUpdated(Collection<i> collection);

    void presenceChanged(Presence presence);
}
