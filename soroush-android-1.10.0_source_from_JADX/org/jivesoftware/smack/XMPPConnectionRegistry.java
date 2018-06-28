package org.jivesoftware.smack;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class XMPPConnectionRegistry {
    private static final Set<ConnectionCreationListener> connectionEstablishedListeners = new CopyOnWriteArraySet();

    public static void addConnectionCreationListener(ConnectionCreationListener connectionCreationListener) {
        connectionEstablishedListeners.add(connectionCreationListener);
    }

    protected static Collection<ConnectionCreationListener> getConnectionCreationListeners() {
        return Collections.unmodifiableCollection(connectionEstablishedListeners);
    }

    public static void removeConnectionCreationListener(ConnectionCreationListener connectionCreationListener) {
        connectionEstablishedListeners.remove(connectionCreationListener);
    }
}
