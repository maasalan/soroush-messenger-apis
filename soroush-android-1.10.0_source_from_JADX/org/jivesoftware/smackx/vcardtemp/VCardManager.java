package org.jivesoftware.smackx.vcardtemp;

import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.e;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.id.StanzaIdUtil;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.vcardtemp.packet.VCard;

public final class VCardManager extends Manager {
    public static final String ELEMENT = "vCard";
    private static final Map<XMPPConnection, VCardManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "vcard-temp";

    static class C79641 implements ConnectionCreationListener {
        C79641() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            VCardManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79641());
    }

    private VCardManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("vcard-temp");
    }

    public static synchronized VCardManager getInstanceFor(XMPPConnection xMPPConnection) {
        VCardManager vCardManager;
        synchronized (VCardManager.class) {
            vCardManager = (VCardManager) INSTANCES.get(xMPPConnection);
            if (vCardManager == null) {
                vCardManager = new VCardManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, vCardManager);
            }
        }
        return vCardManager;
    }

    @Deprecated
    public static boolean isSupported(i iVar, XMPPConnection xMPPConnection) {
        return getInstanceFor(xMPPConnection).isSupported(iVar);
    }

    public final boolean isSupported(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, "vcard-temp");
    }

    public final VCard loadVCard() {
        return loadVCard(null);
    }

    public final VCard loadVCard(e eVar) {
        IQ vCard = new VCard();
        vCard.setTo((i) eVar);
        return (VCard) connection().createStanzaCollectorAndSend(vCard).nextResultOrThrow();
    }

    public final void saveVCard(VCard vCard) {
        vCard.setTo(null);
        vCard.setType(Type.set);
        vCard.setStanzaId(StanzaIdUtil.newStanzaId());
        connection().createStanzaCollectorAndSend(vCard).nextResultOrThrow();
    }
}
