package mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation;

import android.content.Context;
import java.io.IOException;
import java.io.PrintStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.C2551a.C2545a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.urls.StickerServiceUrls;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.urls.WebserviceUrls;
import org.jivesoftware.smack.util.TLSUtils;
import p056c.C0951u;
import p056c.C0951u.C0950a;
import p056c.C5047x;
import p056c.C5047x.C0955a;
import p056c.ac;
import p056c.p057a.p063g.C0909f;
import p056c.p066b.C5039a;
import p056c.p066b.C5039a.C0918a;
import p207e.C2317l;
import p207e.C2317l.C2316a;
import p207e.p516a.p517a.C5698a;

public final class C2567b {
    private static C2567b f8377b;
    public WebserviceUrls f8378a;
    private C2317l f8379c;
    private C2317l f8380d;
    private C2317l f8381e;
    private WebserviceUrls f8382f;
    private StickerServiceUrls f8383g;

    private C2567b() {
    }

    private static C0955a m7017a(Context context, C0955a c0955a, boolean z) {
        if (z) {
            try {
                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(C2545a.wslb2));
                PrintStream printStream = System.out;
                StringBuilder stringBuilder = new StringBuilder("ca=");
                stringBuilder.append(((X509Certificate) generateCertificate).getSubjectDN());
                printStream.println(stringBuilder.toString());
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry("ca", generateCertificate);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                SSLContext sslContext = SSLContext.getInstance(TLSUtils.TLS);
                sslContext.init(null, trustManagerFactory.getTrustManagers(), null);
                SSLSocketFactory socketFactory = sslContext.getSocketFactory();
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
                if (socketFactory == null) {
                    throw new NullPointerException("sslSocketFactory == null");
                } else if (x509TrustManager == null) {
                    throw new NullPointerException("trustManager == null");
                } else {
                    c0955a.f3040m = socketFactory;
                    c0955a.f3041n = C0909f.m2216c().mo987a(x509TrustManager);
                    return c0955a;
                }
            } catch (CertificateException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
                return c0955a;
            } catch (KeyStoreException e3) {
                e3.printStackTrace();
                return c0955a;
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
                return c0955a;
            } catch (KeyManagementException e5) {
                e5.printStackTrace();
                return c0955a;
            }
        }
        return c0955a;
    }

    public static C2567b m7018a() {
        if (f8377b == null) {
            f8377b = new C2567b();
        }
        return f8377b;
    }

    private C5047x m7019b(Context context, boolean z) {
        return m7020a(context, z).m2391a();
    }

    public final C0955a m7020a(final Context context, boolean z) {
        C0955a c0955a = new C0955a();
        c0955a.m2389a(10, TimeUnit.SECONDS);
        if (C2480b.f8158a) {
            C0951u c5039a = new C5039a();
            int i = C0918a.f2850d;
            if (i == 0) {
                throw new NullPointerException("level == null. Use Level.NONE instead.");
            }
            c5039a.f14058a = i;
            c0955a.m2390a(c5039a);
        }
        C0955a a = C2567b.m7017a(context, c0955a, z);
        a.m2390a(new C0951u(this) {
            final /* synthetic */ C2567b f15967b;

            public final ac mo947a(C0950a c0950a) {
                return c0950a.mo952a(c0950a.mo951a().m2245a().m2241a("User-Agent", C2492j.m6840a(context)).m2242a());
            }
        });
        return a;
    }

    public final C2317l m7021a(Context context, String str, boolean z) {
        if (z) {
            if (this.f8379c == null) {
                this.f8379c = new C2316a().m6288a(str).m6286a(m7019b(context, z)).m6287a(C5698a.m12742a()).m6289a();
            }
            return this.f8379c;
        }
        if (this.f8381e == null) {
            this.f8381e = new C2316a().m6288a(str).m6286a(m7019b(context, z)).m6287a(C5698a.m12742a()).m6289a();
        }
        return this.f8381e;
    }

    public final WebserviceUrls m7022a(Context context) {
        if (this.f8382f == null) {
            this.f8382f = (WebserviceUrls) m7021a(context, "https://wslb2.soroush-hamrah.ir/", true).m6293a(WebserviceUrls.class);
        }
        return this.f8382f;
    }

    public final StickerServiceUrls m7023b(Context context) {
        if (this.f8383g == null) {
            String str = "https://ws-stickers2.soroush-hamrah.ir/";
            if (this.f8380d == null) {
                this.f8380d = new C2316a().m6288a(str).m6286a(m7019b(context, true)).m6287a(C5698a.m12742a()).m6289a();
            }
            this.f8383g = (StickerServiceUrls) this.f8380d.m6293a(StickerServiceUrls.class);
        }
        return this.f8383g;
    }
}
