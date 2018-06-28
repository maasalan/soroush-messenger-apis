package org.jivesoftware.smack.sasl;

import javax.net.ssl.SSLSession;
import javax.security.auth.callback.CallbackHandler;
import org.b.a.b;
import org.b.a.e;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.AuthMechanism;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.Response;
import org.jivesoftware.smack.util.StringTransformer;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.Base64;

public abstract class SASLMechanism implements Comparable<SASLMechanism> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String CRAMMD5 = "CRAM-MD5";
    public static final String DIGESTMD5 = "DIGEST-MD5";
    public static final String EXTERNAL = "EXTERNAL";
    public static final String GSSAPI = "GSSAPI";
    public static final String PLAIN = "PLAIN";
    private static StringTransformer saslPrepTransformer;
    protected String authenticationId;
    protected e authorizationId;
    protected XMPPConnection connection;
    protected ConnectionConfiguration connectionConfiguration;
    protected String host;
    protected String password;
    protected b serviceName;
    protected SSLSession sslSession;

    private final void authenticate() {
        byte[] authenticationText = getAuthenticationText();
        String encodeToString = (authenticationText == null || authenticationText.length <= 0) ? "=" : Base64.encodeToString(authenticationText);
        this.connection.sendNonza(new AuthMechanism(getName(), encodeToString));
    }

    protected static String saslPrep(String str) {
        StringTransformer stringTransformer = saslPrepTransformer;
        return stringTransformer != null ? stringTransformer.transform(str) : str;
    }

    public static void setSaslPrepTransformer(StringTransformer stringTransformer) {
        saslPrepTransformer = stringTransformer;
    }

    protected static byte[] toBytes(String str) {
        return StringUtils.toBytes(str);
    }

    public final void authenticate(String str, String str2, b bVar, String str3, e eVar, SSLSession sSLSession) {
        this.authenticationId = str;
        this.host = str2;
        this.serviceName = bVar;
        this.password = str3;
        this.authorizationId = eVar;
        this.sslSession = sSLSession;
        authenticateInternal();
        authenticate();
    }

    public void authenticate(String str, b bVar, CallbackHandler callbackHandler, e eVar, SSLSession sSLSession) {
        this.host = str;
        this.serviceName = bVar;
        this.authorizationId = eVar;
        this.sslSession = sSLSession;
        authenticateInternal(callbackHandler);
        authenticate();
    }

    protected void authenticateInternal() {
    }

    public abstract void authenticateInternal(CallbackHandler callbackHandler);

    public boolean authzidSupported() {
        return false;
    }

    public final void challengeReceived(String str, boolean z) {
        if (str != null && str.equals("=")) {
            str = "";
        }
        byte[] evaluateChallenge = evaluateChallenge(Base64.decode(str));
        if (!z) {
            this.connection.sendNonza(evaluateChallenge == null ? new Response() : new Response(Base64.encodeToString(evaluateChallenge)));
        }
    }

    public abstract void checkIfSuccessfulOrThrow();

    public final int compareTo(SASLMechanism sASLMechanism) {
        return Integer.valueOf(getPriority()).compareTo(Integer.valueOf(sASLMechanism.getPriority()));
    }

    public byte[] evaluateChallenge(byte[] bArr) {
        return null;
    }

    public abstract byte[] getAuthenticationText();

    public abstract String getName();

    public abstract int getPriority();

    public SASLMechanism instanceForAuthentication(XMPPConnection xMPPConnection, ConnectionConfiguration connectionConfiguration) {
        SASLMechanism newInstance = newInstance();
        newInstance.connection = xMPPConnection;
        newInstance.connectionConfiguration = connectionConfiguration;
        return newInstance;
    }

    public abstract SASLMechanism newInstance();
}
