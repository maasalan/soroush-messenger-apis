package org.jivesoftware.smackx.hoxt;

import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public class HOXTManager {
    public static final String NAMESPACE = "urn:xmpp:http";

    static class C79231 implements ConnectionCreationListener {
        C79231() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("urn:xmpp:http");
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79231());
    }

    public static boolean isSupported(i iVar, XMPPConnection xMPPConnection) {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).supportsFeature(iVar, "urn:xmpp:http");
    }
}
