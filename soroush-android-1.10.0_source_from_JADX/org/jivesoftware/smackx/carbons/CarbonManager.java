package org.jivesoftware.smackx.carbons;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.ExceptionCallback;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.OrFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.carbons.packet.Carbon.Disable;
import org.jivesoftware.smackx.carbons.packet.Carbon.Enable;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension.Direction;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension.Private;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class CarbonManager extends Manager {
    private static final StanzaFilter CARBON_EXTENSION_FILTER;
    private static Map<XMPPConnection, CarbonManager> INSTANCES = new WeakHashMap();
    private final StanzaListener carbonsListener;
    private volatile boolean enabled_state = false;
    private final Set<CarbonCopyReceivedListener> listeners = new CopyOnWriteArraySet();

    static class C79141 implements ConnectionCreationListener {
        C79141() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            CarbonManager.getInstanceFor(xMPPConnection);
        }
    }

    class C79152 implements StanzaListener {
        C79152() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            CarbonExtension from = CarbonExtension.from(message);
            Direction direction = from.getDirection();
            Message message2 = (Message) from.getForwarded().getForwardedStanza();
            for (CarbonCopyReceivedListener onCarbonCopyReceived : CarbonManager.this.listeners) {
                onCarbonCopyReceived.onCarbonCopyReceived(direction, message2, message);
            }
        }
    }

    class C80133 extends AbstractConnectionListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class cls = CarbonManager.class;
        }

        C80133() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (!z) {
                CarbonManager.this.enabled_state = false;
            }
            CarbonManager.this.addCarbonsListener(xMPPConnection);
        }

        public void connectionClosed() {
            CarbonManager.this.enabled_state = false;
            CarbonManager.this.connection().removeSyncStanzaListener(CarbonManager.this.carbonsListener);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79141());
        r2 = new StanzaFilter[2];
        r2[0] = new OrFilter(new StanzaExtensionFilter(Direction.sent.name(), "urn:xmpp:carbons:2"), new StanzaExtensionFilter(Direction.received.name(), "urn:xmpp:carbons:2"));
        r2[1] = StanzaTypeFilter.MESSAGE;
        CARBON_EXTENSION_FILTER = new AndFilter(r2);
    }

    private CarbonManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("urn:xmpp:carbons:2");
        this.carbonsListener = new C79152();
        xMPPConnection.addConnectionListener(new C80133());
        addCarbonsListener(xMPPConnection);
    }

    private void addCarbonsListener(XMPPConnection xMPPConnection) {
        if (xMPPConnection.getUser() != null) {
            xMPPConnection.addSyncStanzaListener(this.carbonsListener, new AndFilter(CARBON_EXTENSION_FILTER, FromMatchesFilter.createBare(r0)));
        }
    }

    private static IQ carbonsEnabledIQ(boolean z) {
        return z ? new Enable() : new Disable();
    }

    @Deprecated
    public static void disableCarbons(Message message) {
        message.addExtension(Private.INSTANCE);
    }

    public static synchronized CarbonManager getInstanceFor(XMPPConnection xMPPConnection) {
        CarbonManager carbonManager;
        synchronized (CarbonManager.class) {
            carbonManager = (CarbonManager) INSTANCES.get(xMPPConnection);
            if (carbonManager == null) {
                carbonManager = new CarbonManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, carbonManager);
            }
        }
        return carbonManager;
    }

    private void sendUseCarbons(final boolean z, ExceptionCallback exceptionCallback) {
        try {
            connection().sendIqWithResponseCallback(carbonsEnabledIQ(z), new StanzaListener() {
                public void processStanza(Stanza stanza) {
                    CarbonManager.this.enabled_state = z;
                }
            }, exceptionCallback);
        } catch (Exception e) {
            if (exceptionCallback != null) {
                exceptionCallback.processException(e);
            }
        }
    }

    public final boolean addCarbonCopyReceivedListener(CarbonCopyReceivedListener carbonCopyReceivedListener) {
        return this.listeners.add(carbonCopyReceivedListener);
    }

    public final void disableCarbons() {
        setCarbonsEnabled(false);
    }

    public final void disableCarbonsAsync(ExceptionCallback exceptionCallback) {
        sendUseCarbons(false, exceptionCallback);
    }

    public final void enableCarbons() {
        setCarbonsEnabled(true);
    }

    public final void enableCarbonsAsync(ExceptionCallback exceptionCallback) {
        sendUseCarbons(true, exceptionCallback);
    }

    public final boolean getCarbonsEnabled() {
        return this.enabled_state;
    }

    public final boolean isSupportedByServer() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature("urn:xmpp:carbons:2");
    }

    public final boolean removeCarbonCopyReceivedListener(CarbonCopyReceivedListener carbonCopyReceivedListener) {
        return this.listeners.remove(carbonCopyReceivedListener);
    }

    @Deprecated
    public final void sendCarbonsEnabled(boolean z) {
        sendUseCarbons(z, null);
    }

    public final synchronized void setCarbonsEnabled(boolean z) {
        if (this.enabled_state != z) {
            connection().createStanzaCollectorAndSend(carbonsEnabledIQ(z)).nextResultOrThrow();
            this.enabled_state = z;
        }
    }
}
