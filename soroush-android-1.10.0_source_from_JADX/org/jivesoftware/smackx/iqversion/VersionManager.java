package org.jivesoftware.smackx.iqversion;

import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.iqversion.packet.Version;

public final class VersionManager extends Manager {
    private static final Map<XMPPConnection, VersionManager> INSTANCES = new WeakHashMap();
    private static boolean autoAppendSmackVersion = true;
    private static Version defaultVersion;
    private Version ourVersion = defaultVersion;

    static class C79361 implements ConnectionCreationListener {
        C79361() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            VersionManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79361());
    }

    private VersionManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(Version.NAMESPACE);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler("query", Version.NAMESPACE, Type.get, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                return VersionManager.this.ourVersion == null ? IQ.createErrorResponse(iq, Condition.not_acceptable) : Version.createResultFor(iq, VersionManager.this.ourVersion);
            }
        });
    }

    private static Version generateVersionFrom(String str, String str2, String str3) {
        if (autoAppendSmackVersion) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" (Smack ");
            stringBuilder.append(SmackConfiguration.getVersion());
            stringBuilder.append(')');
            str = stringBuilder.toString();
        }
        return new Version(str, str2, str3);
    }

    public static synchronized VersionManager getInstanceFor(XMPPConnection xMPPConnection) {
        VersionManager versionManager;
        synchronized (VersionManager.class) {
            versionManager = (VersionManager) INSTANCES.get(xMPPConnection);
            if (versionManager == null) {
                versionManager = new VersionManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, versionManager);
            }
        }
        return versionManager;
    }

    public static void setAutoAppendSmackVersion(boolean z) {
        autoAppendSmackVersion = z;
    }

    public static void setDefaultVersion(String str, String str2) {
        setDefaultVersion(str, str2, null);
    }

    public static void setDefaultVersion(String str, String str2, String str3) {
        defaultVersion = generateVersionFrom(str, str2, str3);
    }

    public final Version getVersion(i iVar) {
        return !isSupported(iVar) ? null : (Version) connection().createStanzaCollectorAndSend(new Version(iVar)).nextResultOrThrow();
    }

    public final boolean isSupported(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, Version.NAMESPACE);
    }

    public final void setVersion(String str, String str2) {
        setVersion(str, str2, null);
    }

    public final void setVersion(String str, String str2, String str3) {
        this.ourVersion = generateVersionFrom(str, str2, str3);
    }

    public final void unsetVersion() {
        this.ourVersion = null;
    }
}
