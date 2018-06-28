package org.jivesoftware.smackx.push_notifications;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.push_notifications.element.DisablePushNotificationsIQ;
import org.jivesoftware.smackx.push_notifications.element.EnablePushNotificationsIQ;

public final class PushNotificationsManager extends Manager {
    private static final Map<XMPPConnection, PushNotificationsManager> INSTANCES = new WeakHashMap();

    static class C79581 implements ConnectionCreationListener {
        C79581() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            PushNotificationsManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79581());
    }

    private PushNotificationsManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    private boolean changePushNotificationsStatus(IQ iq) {
        return ((IQ) connection().createStanzaCollectorAndSend(iq).nextResultOrThrow()).getType() != Type.error;
    }

    public static synchronized PushNotificationsManager getInstanceFor(XMPPConnection xMPPConnection) {
        PushNotificationsManager pushNotificationsManager;
        synchronized (PushNotificationsManager.class) {
            pushNotificationsManager = (PushNotificationsManager) INSTANCES.get(xMPPConnection);
            if (pushNotificationsManager == null) {
                pushNotificationsManager = new PushNotificationsManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, pushNotificationsManager);
            }
        }
        return pushNotificationsManager;
    }

    public final boolean disable(i iVar, String str) {
        return changePushNotificationsStatus(new DisablePushNotificationsIQ(iVar, str));
    }

    public final boolean disableAll(i iVar) {
        return disable(iVar, null);
    }

    public final boolean enable(i iVar, String str) {
        return enable(iVar, str, null);
    }

    public final boolean enable(i iVar, String str, HashMap<String, String> hashMap) {
        return changePushNotificationsStatus(new EnablePushNotificationsIQ(iVar, str, hashMap));
    }

    public final boolean isSupportedByServer() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature("urn:xmpp:push:0");
    }
}
