package org.jivesoftware.smackx.amp;

import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public class AMPManager {

    static class C79031 implements ConnectionCreationListener {
        C79031() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            AMPManager.setServiceEnabled(xMPPConnection, true);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79031());
    }

    public static boolean isActionSupported(XMPPConnection xMPPConnection, Action action) {
        StringBuilder stringBuilder = new StringBuilder("http://jabber.org/protocol/amp?action=");
        stringBuilder.append(action.toString());
        return isFeatureSupportedByServer(xMPPConnection, stringBuilder.toString());
    }

    public static boolean isConditionSupported(XMPPConnection xMPPConnection, String str) {
        StringBuilder stringBuilder = new StringBuilder("http://jabber.org/protocol/amp?condition=");
        stringBuilder.append(str);
        return isFeatureSupportedByServer(xMPPConnection, stringBuilder.toString());
    }

    private static boolean isFeatureSupportedByServer(XMPPConnection xMPPConnection, String str) {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).serverSupportsFeature(str);
    }

    public static boolean isServiceEnabled(XMPPConnection xMPPConnection) {
        xMPPConnection.getXMPPServiceDomain();
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).includesFeature(AMPExtension.NAMESPACE);
    }

    public static synchronized void setServiceEnabled(XMPPConnection xMPPConnection, boolean z) {
        synchronized (AMPManager.class) {
            if (isServiceEnabled(xMPPConnection) == z) {
            } else if (z) {
                ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(AMPExtension.NAMESPACE);
            } else {
                ServiceDiscoveryManager.getInstanceFor(xMPPConnection).removeFeature(AMPExtension.NAMESPACE);
            }
        }
    }
}
