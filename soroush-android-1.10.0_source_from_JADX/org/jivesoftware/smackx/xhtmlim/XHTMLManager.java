package org.jivesoftware.smackx.xhtmlim;

import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.xhtmlim.packet.XHTMLExtension;

public class XHTMLManager {

    static class C79681 implements ConnectionCreationListener {
        C79681() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            XHTMLManager.setServiceEnabled(xMPPConnection, true);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79681());
    }

    public static void addBody(Message message, XHTMLText xHTMLText) {
        XHTMLExtension from = XHTMLExtension.from(message);
        if (from == null) {
            from = new XHTMLExtension();
            message.addExtension(from);
        }
        from.addBody(xHTMLText.toXML());
    }

    public static List<CharSequence> getBodies(Message message) {
        XHTMLExtension from = XHTMLExtension.from(message);
        return from != null ? from.getBodies() : null;
    }

    public static boolean isServiceEnabled(XMPPConnection xMPPConnection) {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).includesFeature(XHTMLExtension.NAMESPACE);
    }

    public static boolean isServiceEnabled(XMPPConnection xMPPConnection, i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).supportsFeature(iVar, XHTMLExtension.NAMESPACE);
    }

    public static boolean isXHTMLMessage(Message message) {
        return message.getExtension(XHTMLExtension.ELEMENT, XHTMLExtension.NAMESPACE) != null;
    }

    public static synchronized void setServiceEnabled(XMPPConnection xMPPConnection, boolean z) {
        synchronized (XHTMLManager.class) {
            if (isServiceEnabled(xMPPConnection) == z) {
            } else if (z) {
                ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(XHTMLExtension.NAMESPACE);
            } else {
                ServiceDiscoveryManager.getInstanceFor(xMPPConnection).removeFeature(XHTMLExtension.NAMESPACE);
            }
        }
    }
}
