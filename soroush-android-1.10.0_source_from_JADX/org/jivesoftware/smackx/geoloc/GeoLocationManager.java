package org.jivesoftware.smackx.geoloc;

import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.geoloc.packet.GeoLocation;

public final class GeoLocationManager extends Manager {
    private static final Map<XMPPConnection, GeoLocationManager> INSTANCES = new WeakHashMap();

    static class C79221 implements ConnectionCreationListener {
        C79221() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            GeoLocationManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79221());
    }

    public GeoLocationManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    public static synchronized GeoLocationManager getInstanceFor(XMPPConnection xMPPConnection) {
        GeoLocationManager geoLocationManager;
        synchronized (GeoLocationManager.class) {
            geoLocationManager = (GeoLocationManager) INSTANCES.get(xMPPConnection);
            if (geoLocationManager == null) {
                geoLocationManager = new GeoLocationManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, geoLocationManager);
            }
        }
        return geoLocationManager;
    }

    public static boolean isGeoLocationMessage(Message message) {
        return GeoLocation.from(message) != null;
    }

    public final void sendGeoLocationToJid(GeoLocation geoLocation, i iVar) {
        XMPPConnection connection = connection();
        Stanza message = new Message(iVar);
        message.addExtension(geoLocation);
        connection.sendStanza(message);
    }
}
