package org.jivesoftware.smackx.time;

import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.time.packet.Time;

public final class EntityTimeManager extends Manager {
    private static final Map<XMPPConnection, EntityTimeManager> INSTANCES = new WeakHashMap();
    private static boolean autoEnable = true;
    private boolean enabled = false;

    static class C79631 implements ConnectionCreationListener {
        C79631() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            EntityTimeManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79631());
    }

    private EntityTimeManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        if (autoEnable) {
            enable();
        }
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(Time.ELEMENT, Time.NAMESPACE, Type.get, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                return EntityTimeManager.this.enabled ? Time.createResponse(iq) : IQ.createErrorResponse(iq, Condition.not_acceptable);
            }
        });
    }

    public static synchronized EntityTimeManager getInstanceFor(XMPPConnection xMPPConnection) {
        EntityTimeManager entityTimeManager;
        synchronized (EntityTimeManager.class) {
            entityTimeManager = (EntityTimeManager) INSTANCES.get(xMPPConnection);
            if (entityTimeManager == null) {
                entityTimeManager = new EntityTimeManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, entityTimeManager);
            }
        }
        return entityTimeManager;
    }

    public static void setAutoEnable(boolean z) {
        autoEnable = z;
    }

    public final synchronized void disable() {
        if (this.enabled) {
            ServiceDiscoveryManager.getInstanceFor(connection()).removeFeature(Time.NAMESPACE);
            this.enabled = false;
        }
    }

    public final synchronized void enable() {
        if (!this.enabled) {
            ServiceDiscoveryManager.getInstanceFor(connection()).addFeature(Time.NAMESPACE);
            this.enabled = true;
        }
    }

    public final Time getTime(i iVar) {
        if (!isTimeSupported(iVar)) {
            return null;
        }
        IQ time = new Time();
        time.setTo(iVar);
        return (Time) connection().createStanzaCollectorAndSend(time).nextResultOrThrow();
    }

    public final boolean isTimeSupported(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, Time.NAMESPACE);
    }
}
