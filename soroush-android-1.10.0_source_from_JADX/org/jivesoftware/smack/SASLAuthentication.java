package org.jivesoftware.smack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.security.auth.callback.CallbackHandler;
import org.b.a.b;
import org.b.a.e;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.packet.Mechanisms;
import org.jivesoftware.smack.sasl.SASLErrorException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.sasl.core.ScramSha1PlusMechanism;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.SASLFailure;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.Success;

public final class SASLAuthentication {
    private static final Set<String> BLACKLISTED_MECHANISMS = new HashSet();
    private static final Logger LOGGER = Logger.getLogger(SASLAuthentication.class.getName());
    private static final List<SASLMechanism> REGISTERED_MECHANISMS = new ArrayList();
    private boolean authenticationSuccessful;
    private final ConnectionConfiguration configuration;
    private final AbstractXMPPConnection connection;
    private SASLMechanism currentMechanism = null;
    private Exception saslException;

    static {
        blacklistSASLMechanism(ScramSha1PlusMechanism.NAME);
    }

    SASLAuthentication(AbstractXMPPConnection abstractXMPPConnection, ConnectionConfiguration connectionConfiguration) {
        this.configuration = connectionConfiguration;
        this.connection = abstractXMPPConnection;
        init();
    }

    public static boolean blacklistSASLMechanism(String str) {
        boolean add;
        synchronized (BLACKLISTED_MECHANISMS) {
            add = BLACKLISTED_MECHANISMS.add(str);
        }
        return add;
    }

    public static Set<String> getBlacklistedSASLMechanisms() {
        return Collections.unmodifiableSet(BLACKLISTED_MECHANISMS);
    }

    public static Map<String, String> getRegisterdSASLMechanisms() {
        Map<String, String> hashMap = new HashMap();
        synchronized (REGISTERED_MECHANISMS) {
            for (SASLMechanism sASLMechanism : REGISTERED_MECHANISMS) {
                hashMap.put(sASLMechanism.getClass().getName(), sASLMechanism.getName());
            }
        }
        return hashMap;
    }

    private List<String> getServerMechanisms() {
        Mechanisms mechanisms = (Mechanisms) this.connection.getFeature(Mechanisms.ELEMENT, "urn:ietf:params:xml:ns:xmpp-sasl");
        return mechanisms == null ? Collections.emptyList() : mechanisms.getMechanisms();
    }

    public static boolean isSaslMechanismRegistered(String str) {
        synchronized (REGISTERED_MECHANISMS) {
            for (SASLMechanism name : REGISTERED_MECHANISMS) {
                if (name.getName().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void registerSASLMechanism(SASLMechanism sASLMechanism) {
        synchronized (REGISTERED_MECHANISMS) {
            REGISTERED_MECHANISMS.add(sASLMechanism);
            Collections.sort(REGISTERED_MECHANISMS);
        }
    }

    private SASLMechanism selectMechanism(e eVar) {
        List serverMechanisms = getServerMechanisms();
        if (serverMechanisms.isEmpty()) {
            LOGGER.warning("Server did not report any SASL mechanisms");
        }
        for (SASLMechanism sASLMechanism : REGISTERED_MECHANISMS) {
            String name = sASLMechanism.getName();
            synchronized (BLACKLISTED_MECHANISMS) {
                if (BLACKLISTED_MECHANISMS.contains(name)) {
                } else {
                    if (!this.configuration.isEnabledSaslMechanism(name)) {
                        continue;
                    } else if (eVar != null && !sASLMechanism.authzidSupported()) {
                        Logger logger = LOGGER;
                        StringBuilder stringBuilder = new StringBuilder("Skipping ");
                        stringBuilder.append(sASLMechanism);
                        stringBuilder.append(" because authzid is required by not supported by this SASL mechanism");
                        logger.fine(stringBuilder.toString());
                    } else if (serverMechanisms.contains(name)) {
                        return sASLMechanism.instanceForAuthentication(this.connection, this.configuration);
                    }
                }
            }
        }
        synchronized (BLACKLISTED_MECHANISMS) {
            StringBuilder stringBuilder2 = new StringBuilder("No supported and enabled SASL Mechanism provided by server. Server announced mechanisms: ");
            stringBuilder2.append(serverMechanisms);
            stringBuilder2.append(". Registerd SASL mechanisms with Smack: ");
            stringBuilder2.append(REGISTERED_MECHANISMS);
            stringBuilder2.append(". Enabled SASL mechansisms for this connection: ");
            stringBuilder2.append(this.configuration.getEnabledSaslMechanisms());
            stringBuilder2.append(". Blacklisted SASL mechanisms: ");
            stringBuilder2.append(BLACKLISTED_MECHANISMS);
            stringBuilder2.append('.');
            throw new SmackException(stringBuilder2.toString());
        }
    }

    public static boolean unBlacklistSASLMechanism(String str) {
        boolean remove;
        synchronized (BLACKLISTED_MECHANISMS) {
            remove = BLACKLISTED_MECHANISMS.remove(str);
        }
        return remove;
    }

    public static boolean unregisterSASLMechanism(String str) {
        synchronized (REGISTERED_MECHANISMS) {
            Iterator it = REGISTERED_MECHANISMS.iterator();
            while (it.hasNext()) {
                if (((SASLMechanism) it.next()).getClass().getName().equals(str)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void authenticate(String str, String str2, e eVar, SSLSession sSLSession) {
        this.currentMechanism = selectMechanism(eVar);
        CallbackHandler callbackHandler = this.configuration.getCallbackHandler();
        String host = this.connection.getHost();
        b xMPPServiceDomain = this.connection.getXMPPServiceDomain();
        synchronized (this) {
            if (callbackHandler != null) {
                try {
                    this.currentMechanism.authenticate(host, xMPPServiceDomain, callbackHandler, eVar, sSLSession);
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                    }
                }
            } else {
                this.currentMechanism.authenticate(str, host, xMPPServiceDomain, str2, eVar, sSLSession);
            }
            long currentTimeMillis = System.currentTimeMillis() + this.connection.getReplyTimeout();
            while (!this.authenticationSuccessful && this.saslException == null) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 >= currentTimeMillis) {
                    break;
                }
                wait(currentTimeMillis - currentTimeMillis2);
            }
        }
        if (this.saslException != null) {
            if (this.saslException instanceof SmackException) {
                throw ((SmackException) this.saslException);
            } else if (this.saslException instanceof SASLErrorException) {
                throw ((SASLErrorException) this.saslException);
            } else {
                throw new IllegalStateException("Unexpected exception type", this.saslException);
            }
        } else if (!this.authenticationSuccessful) {
            throw NoResponseException.newWith(this.connection, "successful SASL authentication");
        }
    }

    public final void authenticated(Success success) {
        if (success.getData() != null) {
            challengeReceived(success.getData(), true);
        }
        this.currentMechanism.checkIfSuccessfulOrThrow();
        this.authenticationSuccessful = true;
        synchronized (this) {
            notify();
        }
    }

    public final void authenticationFailed(Exception exception) {
        this.saslException = exception;
        synchronized (this) {
            notify();
        }
    }

    public final void authenticationFailed(SASLFailure sASLFailure) {
        authenticationFailed(new SASLErrorException(this.currentMechanism.getName(), sASLFailure));
    }

    public final boolean authenticationSuccessful() {
        return this.authenticationSuccessful;
    }

    public final void challengeReceived(String str) {
        challengeReceived(str, false);
    }

    public final void challengeReceived(String str, boolean z) {
        try {
            this.currentMechanism.challengeReceived(str, z);
        } catch (Exception e) {
            authenticationFailed(e);
            throw e;
        }
    }

    final String getNameOfLastUsedSaslMechansism() {
        SASLMechanism sASLMechanism = this.currentMechanism;
        return sASLMechanism == null ? null : sASLMechanism.getName();
    }

    final void init() {
        this.authenticationSuccessful = false;
        this.saslException = null;
    }
}
