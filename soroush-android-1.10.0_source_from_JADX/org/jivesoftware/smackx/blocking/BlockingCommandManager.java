package org.jivesoftware.smackx.blocking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.b.a.i;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.blocking.element.BlockContactsIQ;
import org.jivesoftware.smackx.blocking.element.BlockListIQ;
import org.jivesoftware.smackx.blocking.element.UnblockContactsIQ;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class BlockingCommandManager extends Manager {
    private static final Map<XMPPConnection, BlockingCommandManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "urn:xmpp:blocking";
    private final Set<AllJidsUnblockedListener> allJidsUnblockedListeners = new CopyOnWriteArraySet();
    private volatile List<i> blockListCached;
    private final Set<JidsBlockedListener> jidsBlockedListeners = new CopyOnWriteArraySet();
    private final Set<JidsUnblockedListener> jidsUnblockedListeners = new CopyOnWriteArraySet();

    static class C79041 implements ConnectionCreationListener {
        C79041() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            BlockingCommandManager.getInstanceFor(xMPPConnection);
        }
    }

    class C80084 extends AbstractConnectionListener {
        C80084() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (!z) {
                BlockingCommandManager.this.blockListCached = null;
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79041());
    }

    private BlockingCommandManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(BlockContactsIQ.ELEMENT, "urn:xmpp:blocking", Type.set, Mode.sync) {
            public IQ handleIQRequest(IQ iq) {
                BlockContactsIQ blockContactsIQ = (BlockContactsIQ) iq;
                if (BlockingCommandManager.this.blockListCached == null) {
                    BlockingCommandManager.this.blockListCached = new ArrayList();
                }
                Object jids = blockContactsIQ.getJids();
                BlockingCommandManager.this.blockListCached.addAll(jids);
                for (JidsBlockedListener onJidsBlocked : BlockingCommandManager.this.jidsBlockedListeners) {
                    onJidsBlocked.onJidsBlocked(jids);
                }
                return IQ.createResultIQ(blockContactsIQ);
            }
        });
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(UnblockContactsIQ.ELEMENT, "urn:xmpp:blocking", Type.set, Mode.sync) {
            public IQ handleIQRequest(IQ iq) {
                UnblockContactsIQ unblockContactsIQ = (UnblockContactsIQ) iq;
                if (BlockingCommandManager.this.blockListCached == null) {
                    BlockingCommandManager.this.blockListCached = new ArrayList();
                }
                Object jids = unblockContactsIQ.getJids();
                if (jids == null) {
                    BlockingCommandManager.this.blockListCached.clear();
                    for (AllJidsUnblockedListener onAllJidsUnblocked : BlockingCommandManager.this.allJidsUnblockedListeners) {
                        onAllJidsUnblocked.onAllJidsUnblocked();
                    }
                } else {
                    BlockingCommandManager.this.blockListCached.removeAll(jids);
                    for (JidsUnblockedListener onJidsUnblocked : BlockingCommandManager.this.jidsUnblockedListeners) {
                        onJidsUnblocked.onJidsUnblocked(jids);
                    }
                }
                return IQ.createResultIQ(unblockContactsIQ);
            }
        });
        xMPPConnection.addConnectionListener(new C80084());
    }

    public static synchronized BlockingCommandManager getInstanceFor(XMPPConnection xMPPConnection) {
        BlockingCommandManager blockingCommandManager;
        synchronized (BlockingCommandManager.class) {
            blockingCommandManager = (BlockingCommandManager) INSTANCES.get(xMPPConnection);
            if (blockingCommandManager == null) {
                blockingCommandManager = new BlockingCommandManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, blockingCommandManager);
            }
        }
        return blockingCommandManager;
    }

    public final void addAllJidsUnblockedListener(AllJidsUnblockedListener allJidsUnblockedListener) {
        this.allJidsUnblockedListeners.add(allJidsUnblockedListener);
    }

    public final void addJidsBlockedListener(JidsBlockedListener jidsBlockedListener) {
        this.jidsBlockedListeners.add(jidsBlockedListener);
    }

    public final void addJidsUnblockedListener(JidsUnblockedListener jidsUnblockedListener) {
        this.jidsUnblockedListeners.add(jidsUnblockedListener);
    }

    public final void blockContacts(List<i> list) {
        connection().createStanzaCollectorAndSend(new BlockContactsIQ(list)).nextResultOrThrow();
    }

    public final List<i> getBlockList() {
        if (this.blockListCached == null) {
            this.blockListCached = ((BlockListIQ) connection().createStanzaCollectorAndSend(new BlockListIQ()).nextResultOrThrow()).getBlockedJidsCopy();
        }
        return Collections.unmodifiableList(this.blockListCached);
    }

    public final boolean isSupportedByServer() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature("urn:xmpp:blocking");
    }

    public final void removeAllJidsUnblockedListener(AllJidsUnblockedListener allJidsUnblockedListener) {
        this.allJidsUnblockedListeners.remove(allJidsUnblockedListener);
    }

    public final void removeJidsBlockedListener(JidsBlockedListener jidsBlockedListener) {
        this.jidsBlockedListeners.remove(jidsBlockedListener);
    }

    public final void removeJidsUnblockedListener(JidsUnblockedListener jidsUnblockedListener) {
        this.jidsUnblockedListeners.remove(jidsUnblockedListener);
    }

    public final void unblockAll() {
        connection().createStanzaCollectorAndSend(new UnblockContactsIQ()).nextResultOrThrow();
    }

    public final void unblockContacts(List<i> list) {
        connection().createStanzaCollectorAndSend(new UnblockContactsIQ(list)).nextResultOrThrow();
    }
}
