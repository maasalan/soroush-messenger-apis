package p056c.p057a.p063g;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.jivesoftware.smack.util.TLSUtils;
import p056c.C0956y;
import p056c.C5047x;
import p056c.p057a.p065i.C0911c;
import p056c.p057a.p065i.C0913e;
import p056c.p057a.p065i.C5032a;
import p056c.p057a.p065i.C5033b;

public class C0909f {
    private static final Logger f2774a = Logger.getLogger(C5047x.class.getName());
    static final C0909f f2775c;

    static {
        C0909f a = C5028a.m10173a();
        if (a == null) {
            boolean z;
            if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
                z = true;
            } else {
                z = "Conscrypt".equals(Security.getProviders()[0].getName());
            }
            if (z) {
                a = C5029b.m10186b();
                if (a != null) {
                }
            }
            a = C5030c.m10189b();
            if (a == null) {
                a = C5031d.m10192b();
                if (a == null) {
                    a = new C0909f();
                }
            }
        }
        f2775c = a;
    }

    public static List<String> m2215a(List<C0956y> list) {
        List<String> arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0956y c0956y = (C0956y) list.get(i);
            if (c0956y != C0956y.HTTP_1_0) {
                arrayList.add(c0956y.toString());
            }
        }
        return arrayList;
    }

    public static C0909f m2216c() {
        return f2775c;
    }

    public C0911c mo987a(X509TrustManager x509TrustManager) {
        return new C5032a(mo994b(x509TrustManager));
    }

    public Object mo988a(String str) {
        return f2774a.isLoggable(Level.FINE) ? new Throwable(str) : null;
    }

    public String mo989a(SSLSocket sSLSocket) {
        return null;
    }

    public void mo990a(int i, String str, Throwable th) {
        f2774a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void mo991a(String str, Object obj) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = stringBuilder.toString();
        }
        mo990a(5, str, (Throwable) obj);
    }

    public void mo992a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void mo993a(SSLSocket sSLSocket, String str, List<C0956y> list) {
    }

    public C0913e mo994b(X509TrustManager x509TrustManager) {
        return new C5033b(x509TrustManager.getAcceptedIssuers());
    }

    public void mo997b(SSLSocket sSLSocket) {
    }

    public boolean mo995b(String str) {
        return true;
    }

    public SSLContext t_() {
        try {
            return SSLContext.getInstance(TLSUtils.TLS);
        } catch (Throwable e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
