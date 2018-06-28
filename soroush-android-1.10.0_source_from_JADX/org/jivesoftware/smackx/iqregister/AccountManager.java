package org.jivesoftware.smackx.iqregister;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.b.a.b.b;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.StanzaIdFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.iqregister.packet.Registration;
import org.jivesoftware.smackx.iqregister.packet.Registration.Feature;

public final class AccountManager extends Manager {
    private static final Map<XMPPConnection, AccountManager> INSTANCES = new WeakHashMap();
    private static boolean allowSensitiveOperationOverInsecureConnectionDefault = false;
    private boolean accountCreationSupported = false;
    private boolean allowSensitiveOperationOverInsecureConnection = allowSensitiveOperationOverInsecureConnectionDefault;
    private Registration info = null;

    private AccountManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    private StanzaCollector createStanzaCollectorAndSend(IQ iq) {
        return connection().createStanzaCollectorAndSend(new StanzaIdFilter(iq.getStanzaId()), iq);
    }

    public static synchronized AccountManager getInstance(XMPPConnection xMPPConnection) {
        AccountManager accountManager;
        synchronized (AccountManager.class) {
            accountManager = (AccountManager) INSTANCES.get(xMPPConnection);
            if (accountManager == null) {
                accountManager = new AccountManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, accountManager);
            }
        }
        return accountManager;
    }

    private synchronized void getRegistrationInfo() {
        IQ registration = new Registration();
        registration.setTo(connection().getXMPPServiceDomain());
        this.info = (Registration) createStanzaCollectorAndSend(registration).nextResultOrThrow();
    }

    public static void sensitiveOperationOverInsecureConnectionDefault(boolean z) {
        allowSensitiveOperationOverInsecureConnectionDefault = z;
    }

    public final void changePassword(String str) {
        if (connection().isSecureConnection() || this.allowSensitiveOperationOverInsecureConnection) {
            Map hashMap = new HashMap();
            hashMap.put("username", connection().getUser().a().toString());
            hashMap.put("password", str);
            IQ registration = new Registration(hashMap);
            registration.setType(Type.set);
            registration.setTo(connection().getXMPPServiceDomain());
            createStanzaCollectorAndSend(registration).nextResultOrThrow();
            return;
        }
        throw new IllegalStateException("Changing password over insecure connection.");
    }

    public final void createAccount(b bVar, String str) {
        Map hashMap = new HashMap();
        for (String put : getAccountAttributes()) {
            hashMap.put(put, "");
        }
        createAccount(bVar, str, hashMap);
    }

    public final void createAccount(b bVar, String str, Map<String, String> map) {
        if (!connection().isSecureConnection() && !this.allowSensitiveOperationOverInsecureConnection) {
            throw new IllegalStateException("Creating account over insecure connection");
        } else if (bVar == null) {
            throw new IllegalArgumentException("Username must not be null");
        } else if (StringUtils.isNullOrEmpty((CharSequence) str)) {
            throw new IllegalArgumentException("Password must not be null");
        } else {
            map.put("username", bVar.toString());
            map.put("password", str);
            IQ registration = new Registration(map);
            registration.setType(Type.set);
            registration.setTo(connection().getXMPPServiceDomain());
            createStanzaCollectorAndSend(registration).nextResultOrThrow();
        }
    }

    public final void deleteAccount() {
        Map hashMap = new HashMap();
        hashMap.put("remove", "");
        IQ registration = new Registration(hashMap);
        registration.setType(Type.set);
        registration.setTo(connection().getXMPPServiceDomain());
        createStanzaCollectorAndSend(registration).nextResultOrThrow();
    }

    public final String getAccountAttribute(String str) {
        if (this.info == null) {
            getRegistrationInfo();
        }
        return (String) this.info.getAttributes().get(str);
    }

    public final Set<String> getAccountAttributes() {
        if (this.info == null) {
            getRegistrationInfo();
        }
        Map attributes = this.info.getAttributes();
        return attributes != null ? Collections.unmodifiableSet(attributes.keySet()) : Collections.emptySet();
    }

    public final String getAccountInstructions() {
        if (this.info == null) {
            getRegistrationInfo();
        }
        return this.info.getInstructions();
    }

    public final boolean isSupported() {
        XMPPConnection connection = connection();
        return connection.getFeature("register", Feature.NAMESPACE) != null ? true : connection.isAuthenticated() ? ServiceDiscoveryManager.getInstanceFor(connection).serverSupportsFeature(Registration.NAMESPACE) : false;
    }

    public final void sensitiveOperationOverInsecureConnection(boolean z) {
        this.allowSensitiveOperationOverInsecureConnection = z;
    }

    final void setSupportsAccountCreation(boolean z) {
        this.accountCreationSupported = z;
    }

    public final boolean supportsAccountCreation() {
        boolean z = true;
        if (this.accountCreationSupported) {
            return true;
        }
        if (this.info == null) {
            getRegistrationInfo();
            if (this.info.getType() == Type.error) {
                z = false;
            }
            this.accountCreationSupported = z;
        }
        return this.accountCreationSupported;
    }
}
