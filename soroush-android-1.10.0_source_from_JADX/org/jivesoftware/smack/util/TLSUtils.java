package org.jivesoftware.smack.util;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.jivesoftware.smack.ConnectionConfiguration.Builder;
import org.jivesoftware.smack.SmackException.SecurityNotPossibleException;

public class TLSUtils {
    private static final HostnameVerifier DOES_NOT_VERIFY_VERIFIER = new C77711();
    public static final String PROTO_SSL3 = "SSLv3";
    public static final String PROTO_TLSV1 = "TLSv1";
    public static final String PROTO_TLSV1_1 = "TLSv1.1";
    public static final String PROTO_TLSV1_2 = "TLSv1.2";
    public static final String SSL = "SSL";
    public static final String TLS = "TLS";

    static class C77711 implements HostnameVerifier {
        C77711() {
        }

        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static class AcceptAllTrustManager implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static <B extends Builder<B, ?>> B acceptAllCertificates(B b) {
        SSLContext instance = SSLContext.getInstance(TLS);
        instance.init(null, new TrustManager[]{new AcceptAllTrustManager()}, new SecureRandom());
        b.setCustomSSLContext(instance);
        return b;
    }

    public static <B extends Builder<B, ?>> B disableHostnameVerificationForTlsCertificates(B b) {
        b.setHostnameVerifier(DOES_NOT_VERIFY_VERIFIER);
        return b;
    }

    public static byte[] getChannelBindingTlsServerEndPoint(SSLSession sSLSession) {
        MessageDigest instance;
        int i = 0;
        Certificate certificate = sSLSession.getPeerCertificates()[0];
        String algorithm = certificate.getPublicKey().getAlgorithm();
        int hashCode = algorithm.hashCode();
        if (hashCode != 76158) {
            if (hashCode == 78861104) {
                if (algorithm.equals(StringUtils.SHA1)) {
                    i = 1;
                    switch (i) {
                        case 0:
                        case 1:
                            algorithm = "SHA-256";
                            break;
                        default:
                            break;
                    }
                    instance = MessageDigest.getInstance(algorithm);
                    instance.update(certificate.getEncoded());
                    return instance.digest();
                }
            }
        } else if (algorithm.equals(StringUtils.MD5)) {
            switch (i) {
                case 0:
                case 1:
                    algorithm = "SHA-256";
                    break;
                default:
                    break;
            }
            instance = MessageDigest.getInstance(algorithm);
            instance.update(certificate.getEncoded());
            return instance.digest();
        }
        i = -1;
        switch (i) {
            case 0:
            case 1:
                algorithm = "SHA-256";
                break;
            default:
                break;
        }
        instance = MessageDigest.getInstance(algorithm);
        instance.update(certificate.getEncoded());
        return instance.digest();
    }

    public static void setEnabledProtocolsAndCiphers(SSLSocket sSLSocket, String[] strArr, String[] strArr2) {
        Collection hashSet;
        if (strArr != null) {
            Collection hashSet2 = new HashSet(Arrays.asList(strArr));
            hashSet = new HashSet(Arrays.asList(sSLSocket.getSupportedProtocols()));
            Set hashSet3 = new HashSet(hashSet);
            hashSet3.retainAll(hashSet2);
            if (hashSet3.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder("Request to enable SSL/TLS protocols '");
                stringBuilder.append(StringUtils.collectionToString(hashSet2));
                stringBuilder.append("', but only '");
                stringBuilder.append(StringUtils.collectionToString(hashSet));
                stringBuilder.append("' are supported.");
                throw new SecurityNotPossibleException(stringBuilder.toString());
            }
            sSLSocket.setEnabledProtocols((String[]) hashSet3.toArray(new String[hashSet3.size()]));
        }
        if (strArr2 != null) {
            hashSet = new HashSet(Arrays.asList(strArr2));
            Collection hashSet4 = new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            Set hashSet5 = new HashSet(hashSet4);
            hashSet5.retainAll(hashSet);
            if (hashSet5.isEmpty()) {
                StringBuilder stringBuilder2 = new StringBuilder("Request to enable SSL/TLS ciphers '");
                stringBuilder2.append(StringUtils.collectionToString(hashSet));
                stringBuilder2.append("', but only '");
                stringBuilder2.append(StringUtils.collectionToString(hashSet4));
                stringBuilder2.append("' are supported.");
                throw new SecurityNotPossibleException(stringBuilder2.toString());
            }
            sSLSocket.setEnabledCipherSuites((String[]) hashSet5.toArray(new String[hashSet5.size()]));
        }
    }

    public static <B extends Builder<B, ?>> B setSSLv3AndTLSOnly(B b) {
        b.setEnabledSSLProtocols(new String[]{PROTO_TLSV1_2, PROTO_TLSV1_1, PROTO_TLSV1, PROTO_SSL3});
        return b;
    }

    public static <B extends Builder<B, ?>> B setTLSOnly(B b) {
        b.setEnabledSSLProtocols(new String[]{PROTO_TLSV1_2, PROTO_TLSV1_1, PROTO_TLSV1});
        return b;
    }
}
