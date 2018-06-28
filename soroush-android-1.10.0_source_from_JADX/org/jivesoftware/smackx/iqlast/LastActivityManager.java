package org.jivesoftware.smackx.iqlast;

import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Mode;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.iqlast.packet.LastActivity;

public final class LastActivityManager extends Manager {
    private static boolean enabledPerDefault = true;
    private static final Map<XMPPConnection, LastActivityManager> instances = new WeakHashMap();
    private boolean enabled = false;
    private volatile long lastMessageSent;

    static class C79321 implements ConnectionCreationListener {
        C79321() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            LastActivityManager.getInstanceFor(xMPPConnection);
        }
    }

    class C79332 implements StanzaListener {
        C79332() {
        }

        public void processStanza(Stanza stanza) {
            Mode mode = ((Presence) stanza).getMode();
            if (mode != null) {
                switch (mode) {
                    case available:
                    case chat:
                        LastActivityManager.this.resetIdleTime();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    class C79343 implements StanzaListener {
        C79343() {
        }

        public void processStanza(Stanza stanza) {
            if (((Message) stanza).getType() != Type.error) {
                LastActivityManager.this.resetIdleTime();
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79321());
    }

    private LastActivityManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addPacketSendingListener(new C79332(), StanzaTypeFilter.PRESENCE);
        xMPPConnection.addPacketSendingListener(new C79343(), StanzaTypeFilter.MESSAGE);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler("query", LastActivity.NAMESPACE, IQ.Type.get, IQRequestHandler.Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                if (!LastActivityManager.this.enabled) {
                    return IQ.createErrorResponse(iq, Condition.not_acceptable);
                }
                IQ lastActivity = new LastActivity();
                lastActivity.setType(IQ.Type.result);
                lastActivity.setTo(iq.getFrom());
                lastActivity.setFrom(iq.getTo());
                lastActivity.setStanzaId(iq.getStanzaId());
                lastActivity.setLastActivity(LastActivityManager.this.getIdleTime());
                return lastActivity;
            }
        });
        if (enabledPerDefault) {
            enable();
        }
        resetIdleTime();
        instances.put(xMPPConnection, this);
    }

    private long getIdleTime() {
        return (System.currentTimeMillis() - this.lastMessageSent) / 1000;
    }

    public static synchronized LastActivityManager getInstanceFor(XMPPConnection xMPPConnection) {
        LastActivityManager lastActivityManager;
        synchronized (LastActivityManager.class) {
            lastActivityManager = (LastActivityManager) instances.get(xMPPConnection);
            if (lastActivityManager == null) {
                lastActivityManager = new LastActivityManager(xMPPConnection);
            }
        }
        return lastActivityManager;
    }

    private void resetIdleTime() {
        this.lastMessageSent = System.currentTimeMillis();
    }

    public static void setEnabledPerDefault(boolean z) {
        enabledPerDefault = z;
    }

    public final synchronized void disable() {
        ServiceDiscoveryManager.getInstanceFor(connection()).removeFeature(LastActivity.NAMESPACE);
        this.enabled = false;
    }

    public final synchronized void enable() {
        ServiceDiscoveryManager.getInstanceFor(connection()).addFeature(LastActivity.NAMESPACE);
        this.enabled = true;
    }

    public final LastActivity getLastActivity(i iVar) {
        return (LastActivity) connection().createStanzaCollectorAndSend(new LastActivity(iVar)).nextResultOrThrow();
    }

    public final boolean isLastActivitySupported(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, LastActivity.NAMESPACE);
    }
}
