package org.jivesoftware.smackx.xdatalayout;

import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;

public class XDataLayoutManager {

    static class C79661 implements ConnectionCreationListener {
        C79661() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(DataLayout.NAMESPACE);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79661());
    }
}
