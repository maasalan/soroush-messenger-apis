package org.jivesoftware.smackx.csi;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smackx.csi.packet.ClientStateIndication;
import org.jivesoftware.smackx.csi.packet.ClientStateIndication.Active;
import org.jivesoftware.smackx.csi.packet.ClientStateIndication.Feature;
import org.jivesoftware.smackx.csi.packet.ClientStateIndication.Inactive;

public class ClientStateIndicationManager {
    public static void active(XMPPConnection xMPPConnection) {
        throwIaeIfNotSupported(xMPPConnection);
        xMPPConnection.sendNonza(Active.INSTANCE);
    }

    public static void inactive(XMPPConnection xMPPConnection) {
        throwIaeIfNotSupported(xMPPConnection);
        xMPPConnection.sendNonza(Inactive.INSTANCE);
    }

    public static boolean isSupported(XMPPConnection xMPPConnection) {
        return xMPPConnection.hasFeature(Feature.ELEMENT, ClientStateIndication.NAMESPACE);
    }

    private static void throwIaeIfNotSupported(XMPPConnection xMPPConnection) {
        if (!isSupported(xMPPConnection)) {
            throw new IllegalArgumentException("Client State Indication not supported by server");
        }
    }
}
