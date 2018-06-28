package org.jivesoftware.smack.roster;

import java.util.Collection;
import org.b.a.i;
import org.jivesoftware.smack.packet.Presence;

public abstract class AbstractRosterListener implements RosterListener {
    public void entriesAdded(Collection<i> collection) {
    }

    public void entriesDeleted(Collection<i> collection) {
    }

    public void entriesUpdated(Collection<i> collection) {
    }

    public void presenceChanged(Presence presence) {
    }
}
