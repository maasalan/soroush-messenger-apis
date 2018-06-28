package org.jivesoftware.smackx.xdatavalidation;

import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;

public class XDataValidationManager {

    static class C79671 implements ConnectionCreationListener {
        C79671() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(ValidateElement.NAMESPACE);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79671());
    }
}
