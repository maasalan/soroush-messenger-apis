package org.jivesoftware.smackx.xdata;

import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class XDataManager extends Manager {
    private static final Map<XMPPConnection, XDataManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "jabber:x:data";

    static class C79651 implements ConnectionCreationListener {
        C79651() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            XDataManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79651());
    }

    private XDataManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("jabber:x:data");
    }

    public static synchronized XDataManager getInstanceFor(XMPPConnection xMPPConnection) {
        XDataManager xDataManager;
        synchronized (XDataManager.class) {
            xDataManager = (XDataManager) INSTANCES.get(xMPPConnection);
            if (xDataManager == null) {
                xDataManager = new XDataManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, xDataManager);
            }
        }
        return xDataManager;
    }

    public final boolean isSupported(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, "jabber:x:data");
    }
}
