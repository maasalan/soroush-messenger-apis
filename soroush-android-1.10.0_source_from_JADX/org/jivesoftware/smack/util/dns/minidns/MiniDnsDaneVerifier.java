package org.jivesoftware.smack.util.dns.minidns;

import a.b.a.b.b;
import a.b.a.b.c;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.jivesoftware.smack.util.dns.SmackDaneVerifier;

public class MiniDnsDaneVerifier implements SmackDaneVerifier {
    private static final Logger LOGGER = Logger.getLogger(MiniDnsDaneVerifier.class.getName());
    private static final b VERIFIER = new b();
    private c expectingTrustManager;

    MiniDnsDaneVerifier() {
    }

    public void finish(SSLSocket sSLSocket) {
        b bVar = VERIFIER;
        if (!sSLSocket.isConnected()) {
            throw new IllegalStateException("Socket not yet connected.");
        } else if (!bVar.a(sSLSocket.getSession())) {
            if ((this.expectingTrustManager.a != null ? 1 : null) != null) {
                try {
                    sSLSocket.close();
                } catch (Throwable e) {
                    LOGGER.log(Level.FINER, "Closing TLS socket failed", e);
                }
                c cVar = this.expectingTrustManager;
                CertificateException certificateException = cVar.a;
                cVar.a = null;
                throw certificateException;
            }
        }
    }

    public void init(SSLContext sSLContext, KeyManager[] keyManagerArr, X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        if (this.expectingTrustManager != null) {
            throw new IllegalStateException("DaneProvider was initialized before. Use newInstance() instead.");
        }
        this.expectingTrustManager = new c(x509TrustManager);
        sSLContext.init(keyManagerArr, new TrustManager[]{this.expectingTrustManager}, secureRandom);
    }
}
