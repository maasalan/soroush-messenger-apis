package org.jivesoftware.smack;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.callback.CallbackHandler;
import org.b.a.b;
import org.b.a.b.d;
import org.b.a.e;
import org.jivesoftware.smack.proxy.ProxyInfo;
import org.jivesoftware.smack.sasl.core.SASLAnonymous;
import org.jivesoftware.smack.util.CollectionUtil;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public abstract class ConnectionConfiguration {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final boolean allowNullOrEmptyUsername;
    private final e authzid;
    private final CallbackHandler callbackHandler;
    private final SSLContext customSSLContext;
    private final X509TrustManager customX509TrustManager;
    private final boolean debuggerEnabled;
    private final DnssecMode dnssecMode;
    private final String[] enabledSSLCiphers;
    private final String[] enabledSSLProtocols;
    private final Set<String> enabledSaslMechanisms;
    protected final String groupHostName;
    protected final String host;
    protected final InetAddress hostAddress;
    private final HostnameVerifier hostnameVerifier;
    private final String keystorePath;
    private final String keystoreType;
    private final boolean legacySessionDisabled;
    private final String password;
    private final String pkcs11Library;
    protected final int port;
    protected final ProxyInfo proxy;
    private final d resource;
    private final SecurityMode securityMode;
    private final boolean sendPresence;
    private final SocketFactory socketFactory;
    private final CharSequence username;
    protected final b xmppServiceDomain;

    public static abstract class Builder<B extends Builder<B, C>, C extends ConnectionConfiguration> {
        private boolean allowEmptyOrNullUsername = false;
        private e authzid;
        private CallbackHandler callbackHandler;
        private SSLContext customSSLContext;
        private X509TrustManager customX509TrustManager;
        private boolean debuggerEnabled = SmackConfiguration.DEBUG;
        private DnssecMode dnssecMode = DnssecMode.disabled;
        private String[] enabledSSLCiphers;
        private String[] enabledSSLProtocols;
        private Set<String> enabledSaslMechanisms;
        private String groupHostName;
        private String host;
        private InetAddress hostAddress;
        private HostnameVerifier hostnameVerifier;
        private String keystorePath = System.getProperty("javax.net.ssl.keyStore");
        private String keystoreType = "jks";
        private boolean legacySessionDisabled = false;
        private String password;
        private String pkcs11Library = "pkcs11.config";
        private int port = 5222;
        private ProxyInfo proxy;
        private d resource;
        private boolean saslMechanismsSealed;
        private SecurityMode securityMode = SecurityMode.ifpossible;
        private boolean sendPresence = true;
        private SocketFactory socketFactory;
        private CharSequence username;
        private b xmppServiceDomain;

        protected Builder() {
        }

        private void throwIfEnabledSaslMechanismsSet() {
            if (this.enabledSaslMechanisms != null) {
                throw new IllegalStateException("Enabled SASL mechanisms found");
            }
        }

        public B addEnabledSaslMechanism(String str) {
            return addEnabledSaslMechanism(Arrays.asList(new String[]{(String) StringUtils.requireNotNullOrEmpty(str, "saslMechanism must not be null or empty")}));
        }

        public B addEnabledSaslMechanism(Collection<String> collection) {
            if (this.saslMechanismsSealed) {
                throw new IllegalStateException("The enabled SASL mechanisms are sealed, you can not add new ones");
            }
            CollectionUtil.requireNotEmpty(collection, "saslMechanisms");
            Set blacklistedSASLMechanisms = SASLAuthentication.getBlacklistedSASLMechanisms();
            for (String str : collection) {
                StringBuilder stringBuilder;
                if (!SASLAuthentication.isSaslMechanismRegistered(str)) {
                    stringBuilder = new StringBuilder("SASL ");
                    stringBuilder.append(str);
                    stringBuilder.append(" is not avaiable. Consider registering it with Smack");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (blacklistedSASLMechanisms.contains(str)) {
                    stringBuilder = new StringBuilder("SALS ");
                    stringBuilder.append(str);
                    stringBuilder.append(" is blacklisted.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            if (this.enabledSaslMechanisms == null) {
                this.enabledSaslMechanisms = new HashSet(collection.size());
            }
            this.enabledSaslMechanisms.addAll(collection);
            return getThis();
        }

        public B allowEmptyOrNullUsernames() {
            this.allowEmptyOrNullUsername = true;
            return getThis();
        }

        public abstract C build();

        protected abstract B getThis();

        public B performSaslAnonymousAuthentication() {
            if (SASLAuthentication.isSaslMechanismRegistered(SASLAnonymous.NAME)) {
                throwIfEnabledSaslMechanismsSet();
                allowEmptyOrNullUsernames();
                addEnabledSaslMechanism(SASLAnonymous.NAME);
                this.saslMechanismsSealed = true;
                return getThis();
            }
            throw new IllegalArgumentException("SASL ANONYMOUS is not registered");
        }

        public B performSaslExternalAuthentication(SSLContext sSLContext) {
            if (SASLAuthentication.isSaslMechanismRegistered("EXTERNAL")) {
                setCustomSSLContext(sSLContext);
                throwIfEnabledSaslMechanismsSet();
                allowEmptyOrNullUsernames();
                setSecurityMode(SecurityMode.required);
                addEnabledSaslMechanism("EXTERNAL");
                this.saslMechanismsSealed = true;
                return getThis();
            }
            throw new IllegalArgumentException("SASL EXTERNAL is not registered");
        }

        public B setAuthzid(e eVar) {
            this.authzid = eVar;
            return getThis();
        }

        public B setCallbackHandler(CallbackHandler callbackHandler) {
            this.callbackHandler = callbackHandler;
            return getThis();
        }

        public B setCustomSSLContext(SSLContext sSLContext) {
            this.customSSLContext = (SSLContext) Objects.requireNonNull(sSLContext, "The SSLContext must not be null");
            return getThis();
        }

        public B setCustomX509TrustManager(X509TrustManager x509TrustManager) {
            this.customX509TrustManager = x509TrustManager;
            return getThis();
        }

        public B setDebuggerEnabled(boolean z) {
            this.debuggerEnabled = z;
            return getThis();
        }

        public B setDnssecMode(DnssecMode dnssecMode) {
            this.dnssecMode = (DnssecMode) Objects.requireNonNull(dnssecMode, "DNSSEC mode must not be null");
            return getThis();
        }

        public B setEnabledSSLCiphers(String[] strArr) {
            this.enabledSSLCiphers = strArr;
            return getThis();
        }

        public B setEnabledSSLProtocols(String[] strArr) {
            this.enabledSSLProtocols = strArr;
            return getThis();
        }

        public B setGroupHostName(String str) {
            this.groupHostName = str;
            return getThis();
        }

        public B setHost(String str) {
            this.host = str;
            return getThis();
        }

        public B setHostAddress(InetAddress inetAddress) {
            this.hostAddress = inetAddress;
            return getThis();
        }

        public B setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.hostnameVerifier = hostnameVerifier;
            return getThis();
        }

        public B setKeystorePath(String str) {
            this.keystorePath = str;
            return getThis();
        }

        public B setKeystoreType(String str) {
            this.keystoreType = str;
            return getThis();
        }

        @Deprecated
        public B setLegacySessionDisabled(boolean z) {
            this.legacySessionDisabled = z;
            return getThis();
        }

        public B setPKCS11Library(String str) {
            this.pkcs11Library = str;
            return getThis();
        }

        public B setPort(int i) {
            if (i >= 0) {
                if (i <= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                    this.port = i;
                    return getThis();
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Port must be a 16-bit unsiged integer (i.e. between 0-65535. Port was: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public B setProxyInfo(ProxyInfo proxyInfo) {
            this.proxy = proxyInfo;
            return getThis();
        }

        public B setResource(CharSequence charSequence) {
            Objects.requireNonNull(charSequence, "resource must not be null");
            return setResource(d.a(charSequence.toString()));
        }

        public B setResource(d dVar) {
            this.resource = dVar;
            return getThis();
        }

        public B setSecurityMode(SecurityMode securityMode) {
            this.securityMode = securityMode;
            return getThis();
        }

        public B setSendPresence(boolean z) {
            this.sendPresence = z;
            return getThis();
        }

        @Deprecated
        public B setServiceName(b bVar) {
            return setXmppDomain(bVar);
        }

        public B setSocketFactory(SocketFactory socketFactory) {
            this.socketFactory = socketFactory;
            return getThis();
        }

        public B setUsernameAndPassword(CharSequence charSequence, String str) {
            this.username = charSequence;
            this.password = str;
            return getThis();
        }

        public B setXmppDomain(String str) {
            this.xmppServiceDomain = org.b.a.a.d.e(str);
            return getThis();
        }

        public B setXmppDomain(b bVar) {
            this.xmppServiceDomain = bVar;
            return getThis();
        }
    }

    public enum DnssecMode {
        disabled,
        needsDnssec,
        needsDnssecAndDane
    }

    public enum SecurityMode {
        required,
        ifpossible,
        disabled
    }

    static {
        SmackConfiguration.getVersion();
    }

    protected ConnectionConfiguration(Builder<?, ?> builder) {
        this.authzid = builder.authzid;
        this.username = builder.username;
        this.password = builder.password;
        this.callbackHandler = builder.callbackHandler;
        this.resource = builder.resource;
        this.xmppServiceDomain = builder.xmppServiceDomain;
        this.groupHostName = builder.groupHostName;
        if (this.xmppServiceDomain == null) {
            throw new IllegalArgumentException("Must define the XMPP domain");
        }
        this.hostAddress = builder.hostAddress;
        this.host = builder.host;
        this.port = builder.port;
        this.proxy = builder.proxy;
        this.socketFactory = builder.socketFactory;
        this.dnssecMode = builder.dnssecMode;
        this.customX509TrustManager = builder.customX509TrustManager;
        this.securityMode = builder.securityMode;
        this.keystoreType = builder.keystoreType;
        this.keystorePath = builder.keystorePath;
        this.pkcs11Library = builder.pkcs11Library;
        this.customSSLContext = builder.customSSLContext;
        this.enabledSSLProtocols = builder.enabledSSLProtocols;
        this.enabledSSLCiphers = builder.enabledSSLCiphers;
        this.hostnameVerifier = builder.hostnameVerifier;
        this.sendPresence = builder.sendPresence;
        this.legacySessionDisabled = builder.legacySessionDisabled;
        this.debuggerEnabled = builder.debuggerEnabled;
        this.allowNullOrEmptyUsername = builder.allowEmptyOrNullUsername;
        this.enabledSaslMechanisms = builder.enabledSaslMechanisms;
        if (this.dnssecMode != DnssecMode.disabled && this.customSSLContext != null) {
            throw new IllegalStateException("You can not use a custom SSL context with DNSSEC enabled");
        }
    }

    public e getAuthzid() {
        return this.authzid;
    }

    public CallbackHandler getCallbackHandler() {
        return this.callbackHandler;
    }

    public SSLContext getCustomSSLContext() {
        return this.customSSLContext;
    }

    public X509TrustManager getCustomX509TrustManager() {
        return this.customX509TrustManager;
    }

    public DnssecMode getDnssecMode() {
        return this.dnssecMode;
    }

    public String[] getEnabledSSLCiphers() {
        return this.enabledSSLCiphers;
    }

    public String[] getEnabledSSLProtocols() {
        return this.enabledSSLProtocols;
    }

    public Set<String> getEnabledSaslMechanisms() {
        return Collections.unmodifiableSet(this.enabledSaslMechanisms);
    }

    public String getGroupHostName() {
        return this.groupHostName;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier != null ? this.hostnameVerifier : SmackConfiguration.getDefaultHostnameVerifier();
    }

    public String getKeystorePath() {
        return this.keystorePath;
    }

    public String getKeystoreType() {
        return this.keystoreType;
    }

    public String getPKCS11Library() {
        return this.pkcs11Library;
    }

    public String getPassword() {
        return this.password;
    }

    public ProxyInfo getProxyInfo() {
        return this.proxy;
    }

    public d getResource() {
        return this.resource;
    }

    public SecurityMode getSecurityMode() {
        return this.securityMode;
    }

    @Deprecated
    public b getServiceName() {
        return this.xmppServiceDomain;
    }

    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    public CharSequence getUsername() {
        return this.username;
    }

    public b getXMPPServiceDomain() {
        return this.xmppServiceDomain;
    }

    public boolean isCompressionEnabled() {
        return false;
    }

    public boolean isDebuggerEnabled() {
        return this.debuggerEnabled;
    }

    public boolean isEnabledSaslMechanism(String str) {
        return this.enabledSaslMechanisms == null ? !SASLAuthentication.getBlacklistedSASLMechanisms().contains(str) : this.enabledSaslMechanisms.contains(str);
    }

    @Deprecated
    public boolean isLegacySessionDisabled() {
        return this.legacySessionDisabled;
    }

    public boolean isSendPresence() {
        return this.sendPresence;
    }
}
