package org.jivesoftware.smackx.pep;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.b.a.e;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.jidtype.AbstractJidTypeFilter.JidType;
import org.jivesoftware.smack.filter.jidtype.FromJidTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.pubsub.EventElement;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PubSubFeature;
import org.jivesoftware.smackx.pubsub.PubSubManager;
import org.jivesoftware.smackx.pubsub.filter.EventExtensionFilter;

public final class PEPManager extends Manager {
    private static final StanzaFilter FROM_BARE_JID_WITH_EVENT_EXTENSION_FILTER = new AndFilter(new FromJidTypeFilter(JidType.BareJid), EventExtensionFilter.INSTANCE);
    private static final Map<XMPPConnection, PEPManager> INSTANCES = new WeakHashMap();
    private static final PubSubFeature[] REQUIRED_FEATURES = new PubSubFeature[]{PubSubFeature.auto_create, PubSubFeature.auto_subscribe, PubSubFeature.filtered_notifications};
    private final Set<PEPListener> pepListeners = new CopyOnWriteArraySet();

    class C79491 implements StanzaListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class cls = PEPManager.class;
        }

        C79491() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            EventElement from = EventElement.from(stanza);
            e n = message.getFrom().n();
            for (PEPListener eventReceived : PEPManager.this.pepListeners) {
                eventReceived.eventReceived(n, from, message);
            }
        }
    }

    private PEPManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addSyncStanzaListener(new C79491(), FROM_BARE_JID_WITH_EVENT_EXTENSION_FILTER);
    }

    public static synchronized PEPManager getInstanceFor(XMPPConnection xMPPConnection) {
        PEPManager pEPManager;
        synchronized (PEPManager.class) {
            pEPManager = (PEPManager) INSTANCES.get(xMPPConnection);
            if (pEPManager == null) {
                pEPManager = new PEPManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, pEPManager);
            }
        }
        return pEPManager;
    }

    public final boolean addPEPListener(PEPListener pEPListener) {
        return this.pepListeners.add(pEPListener);
    }

    public final boolean isSupported() {
        XMPPConnection connection = connection();
        return ServiceDiscoveryManager.getInstanceFor(connection).supportsFeatures(connection.getUser().m(), REQUIRED_FEATURES);
    }

    public final void publish(Item item, String str) {
        XMPPConnection connection = connection();
        ((LeafNode) PubSubManager.getInstance(connection, connection.getUser().b()).getNode(str)).publish(item);
    }

    public final boolean removePEPListener(PEPListener pEPListener) {
        return this.pepListeners.remove(pEPListener);
    }
}
