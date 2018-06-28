package org.jivesoftware.smack.roster.rosterstore;

import java.util.Collection;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;

public interface RosterStore {
    boolean addEntry(Item item, String str);

    List<Item> getEntries();

    Item getEntry(i iVar);

    String getRosterVersion();

    boolean removeEntry(i iVar, String str);

    boolean resetEntries(Collection<Item> collection, String str);

    void resetStore();
}
