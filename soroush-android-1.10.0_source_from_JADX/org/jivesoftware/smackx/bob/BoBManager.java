package org.jivesoftware.smackx.bob;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.b.a.i;
import org.b.c.a.c;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.SHA1;
import org.jivesoftware.smackx.bob.element.BoBIQ;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class BoBManager extends Manager {
    private static final c<BoBHash, BoBData> BOB_CACHE = new c(128);
    private static final Map<XMPPConnection, BoBManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "urn:xmpp:bob";
    private final Map<BoBHash, BoBInfo> bobs = new ConcurrentHashMap();

    static class C79051 implements ConnectionCreationListener {
        C79051() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            BoBManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79051());
    }

    private BoBManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("urn:xmpp:bob");
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler("data", "urn:xmpp:bob", Type.get, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                BoBIQ boBIQ = (BoBIQ) iq;
                BoBInfo boBInfo = (BoBInfo) BoBManager.this.bobs.get(boBIQ.getBoBHash());
                if (boBInfo == null) {
                    return null;
                }
                IQ boBIQ2 = new BoBIQ(boBIQ.getBoBHash(), boBInfo.getData());
                boBIQ2.setType(Type.result);
                boBIQ2.setTo(boBIQ.getFrom());
                return boBIQ2;
            }
        });
    }

    public static synchronized BoBManager getInstanceFor(XMPPConnection xMPPConnection) {
        BoBManager boBManager;
        synchronized (BoBManager.class) {
            boBManager = (BoBManager) INSTANCES.get(xMPPConnection);
            if (boBManager == null) {
                boBManager = new BoBManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, boBManager);
            }
        }
        return boBManager;
    }

    public final BoBInfo addBoB(BoBData boBData) {
        BoBHash boBHash = new BoBHash("sha1", SHA1.hex(boBData.getContent()));
        BoBInfo boBInfo = new BoBInfo(Collections.unmodifiableSet(Collections.singleton(boBHash)), boBData);
        this.bobs.put(boBHash, boBInfo);
        return boBInfo;
    }

    public final boolean isSupportedByServer() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature("urn:xmpp:bob");
    }

    public final BoBInfo removeBoB(BoBHash boBHash) {
        BoBInfo boBInfo = (BoBInfo) this.bobs.remove(boBHash);
        if (boBInfo == null) {
            return null;
        }
        for (BoBHash remove : boBInfo.getHashes()) {
            this.bobs.remove(remove);
        }
        return boBInfo;
    }

    public final BoBData requestBoB(i iVar, BoBHash boBHash) {
        BoBData boBData = (BoBData) BOB_CACHE.get(boBHash);
        if (boBData != null) {
            return boBData;
        }
        IQ boBIQ = new BoBIQ(boBHash);
        boBIQ.setType(Type.get);
        boBIQ.setTo(iVar);
        BoBData boBData2 = ((BoBIQ) getAuthenticatedConnectionOrThrow().createStanzaCollectorAndSend(boBIQ).nextResultOrThrow()).getBoBData();
        BOB_CACHE.put(boBHash, boBData2);
        return boBData2;
    }
}
