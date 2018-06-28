package p000a.p003b.p004a.p006b;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class C0024c implements X509TrustManager {
    public CertificateException f89a;
    private final X509TrustManager f90b;

    public C0024c(X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            x509TrustManager = C0024c.m37a();
        }
        this.f90b = x509TrustManager;
    }

    private static X509TrustManager m37a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            for (TrustManager trustManager : instance.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            return null;
        } catch (Throwable e) {
            throw new RuntimeException("X.509 not supported.", e);
        }
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        try {
            this.f90b.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            this.f89a = e;
        }
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        try {
            this.f90b.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            this.f89a = e;
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.f90b.getAcceptedIssuers();
    }
}
