package org.jivesoftware.smackx.chat_markers;

import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smackx.chat_markers.element.ChatMarkersElements;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class ChatMarkersManager extends Manager {
    private static final Map<XMPPConnection, ChatMarkersManager> INSTANCES = new WeakHashMap();

    static class C79171 implements ConnectionCreationListener {
        C79171() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            ChatMarkersManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79171());
    }

    private ChatMarkersManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    public static synchronized ChatMarkersManager getInstanceFor(XMPPConnection xMPPConnection) {
        ChatMarkersManager chatMarkersManager;
        synchronized (ChatMarkersManager.class) {
            chatMarkersManager = (ChatMarkersManager) INSTANCES.get(xMPPConnection);
            if (chatMarkersManager == null) {
                chatMarkersManager = new ChatMarkersManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, chatMarkersManager);
            }
        }
        return chatMarkersManager;
    }

    public final boolean isSupportedByServer() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature(ChatMarkersElements.NAMESPACE);
    }
}
