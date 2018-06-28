package p056c;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import p056c.C0949t.C0948a;
import p056c.p057a.C0885c;

public final class C0914a {
    public final C0949t f2785a;
    public final C0940o f2786b;
    public final SocketFactory f2787c;
    public final C0920b f2788d;
    public final List<C0956y> f2789e;
    public final List<C0936k> f2790f;
    public final ProxySelector f2791g;
    public final Proxy f2792h;
    public final SSLSocketFactory f2793i;
    public final HostnameVerifier f2794j;
    public final C0929g f2795k;

    public C0914a(String str, int i, C0940o c0940o, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0929g c0929g, C0920b c0920b, Proxy proxy, List<C0956y> list, List<C0936k> list2, ProxySelector proxySelector) {
        C0948a c0948a = new C0948a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            str2 = "https";
        } else {
            StringBuilder stringBuilder = new StringBuilder("unexpected scheme: ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        c0948a.f2998a = str2;
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        str2 = C0948a.m2348a(str, 0, str.length());
        if (str2 == null) {
            StringBuilder stringBuilder2 = new StringBuilder("unexpected host: ");
            stringBuilder2.append(str);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        c0948a.f3001d = str2;
        if (i > 0) {
            if (i <= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                c0948a.f3002e = i;
                this.f2785a = c0948a.m2355b();
                if (c0940o == null) {
                    throw new NullPointerException("dns == null");
                }
                this.f2786b = c0940o;
                if (socketFactory == null) {
                    throw new NullPointerException("socketFactory == null");
                }
                this.f2787c = socketFactory;
                if (c0920b == null) {
                    throw new NullPointerException("proxyAuthenticator == null");
                }
                this.f2788d = c0920b;
                if (list == null) {
                    throw new NullPointerException("protocols == null");
                }
                this.f2789e = C0885c.m2094a((List) list);
                if (list2 == null) {
                    throw new NullPointerException("connectionSpecs == null");
                }
                this.f2790f = C0885c.m2094a((List) list2);
                if (proxySelector == null) {
                    throw new NullPointerException("proxySelector == null");
                }
                this.f2791g = proxySelector;
                this.f2792h = proxy;
                this.f2793i = sSLSocketFactory;
                this.f2794j = hostnameVerifier;
                this.f2795k = c0929g;
                return;
            }
        }
        stringBuilder2 = new StringBuilder("unexpected port: ");
        stringBuilder2.append(i);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    final boolean m2236a(C0914a c0914a) {
        return this.f2786b.equals(c0914a.f2786b) && this.f2788d.equals(c0914a.f2788d) && this.f2789e.equals(c0914a.f2789e) && this.f2790f.equals(c0914a.f2790f) && this.f2791g.equals(c0914a.f2791g) && C0885c.m2103a(this.f2792h, c0914a.f2792h) && C0885c.m2103a(this.f2793i, c0914a.f2793i) && C0885c.m2103a(this.f2794j, c0914a.f2794j) && C0885c.m2103a(this.f2795k, c0914a.f2795k) && this.f2785a.f3009c == c0914a.f2785a.f3009c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0914a) {
            C0914a c0914a = (C0914a) obj;
            if (this.f2785a.equals(c0914a.f2785a) && m2236a(c0914a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = 31 * (((((((((((((((((527 + this.f2785a.hashCode()) * 31) + this.f2786b.hashCode()) * 31) + this.f2788d.hashCode()) * 31) + this.f2789e.hashCode()) * 31) + this.f2790f.hashCode()) * 31) + this.f2791g.hashCode()) * 31) + (this.f2792h != null ? this.f2792h.hashCode() : 0)) * 31) + (this.f2793i != null ? this.f2793i.hashCode() : 0)) * 31) + (this.f2794j != null ? this.f2794j.hashCode() : 0));
        if (this.f2795k != null) {
            i = this.f2795k.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Object obj;
        StringBuilder stringBuilder = new StringBuilder("Address{");
        stringBuilder.append(this.f2785a.f3008b);
        stringBuilder.append(":");
        stringBuilder.append(this.f2785a.f3009c);
        if (this.f2792h != null) {
            stringBuilder.append(", proxy=");
            obj = this.f2792h;
        } else {
            stringBuilder.append(", proxySelector=");
            obj = this.f2791g;
        }
        stringBuilder.append(obj);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
