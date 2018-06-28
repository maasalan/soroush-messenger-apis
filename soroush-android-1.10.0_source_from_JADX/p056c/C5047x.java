package p056c;

import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p056c.C0925e.C0924a;
import p056c.C0936k.C0935a;
import p056c.C0942p.C0941a;
import p056c.C0946s.C0945a;
import p056c.ac.C0916a;
import p056c.p057a.C0866a;
import p056c.p057a.C0885c;
import p056c.p057a.p058a.C0865e;
import p056c.p057a.p059b.C0868d;
import p056c.p057a.p059b.C0873g;
import p056c.p057a.p059b.C4998c;
import p056c.p057a.p063g.C0909f;
import p056c.p057a.p065i.C0911c;
import p056c.p057a.p065i.C0912d;

public class C5047x implements C0924a, Cloneable {
    static final List<C0956y> f14077a = C0885c.m2095a(C0956y.HTTP_2, C0956y.HTTP_1_1);
    static final List<C0936k> f14078b = C0885c.m2095a(C0936k.f2952a, C0936k.f2954c);
    final int f14079A;
    final int f14080B;
    public final int f14081C;
    final C0939n f14082c;
    public final Proxy f14083d;
    public final List<C0956y> f14084e;
    public final List<C0936k> f14085f;
    final List<C0951u> f14086g;
    final List<C0951u> f14087h;
    final C0941a f14088i;
    public final ProxySelector f14089j;
    public final C0938m f14090k;
    final C0921c f14091l;
    final C0865e f14092m;
    public final SocketFactory f14093n;
    public final SSLSocketFactory f14094o;
    final C0911c f14095p;
    public final HostnameVerifier f14096q;
    public final C0929g f14097r;
    public final C0920b f14098s;
    public final C0920b f14099t;
    public final C0934j f14100u;
    public final C0940o f14101v;
    public final boolean f14102w;
    public final boolean f14103x;
    public final boolean f14104y;
    final int f14105z;

    public static final class C0955a {
        int f3027A = 0;
        C0939n f3028a = new C0939n();
        Proxy f3029b;
        List<C0956y> f3030c = C5047x.f14077a;
        List<C0936k> f3031d = C5047x.f14078b;
        final List<C0951u> f3032e = new ArrayList();
        final List<C0951u> f3033f = new ArrayList();
        C0941a f3034g = C0942p.m2316a(C0942p.f2982a);
        ProxySelector f3035h = ProxySelector.getDefault();
        C0938m f3036i = C0938m.f2973a;
        C0921c f3037j;
        C0865e f3038k;
        SocketFactory f3039l = SocketFactory.getDefault();
        public SSLSocketFactory f3040m;
        public C0911c f3041n;
        HostnameVerifier f3042o = C0912d.f2784a;
        C0929g f3043p = C0929g.f2884a;
        C0920b f3044q = C0920b.f2853a;
        C0920b f3045r = C0920b.f2853a;
        C0934j f3046s = new C0934j();
        C0940o f3047t = C0940o.f2981a;
        boolean f3048u = true;
        boolean f3049v = true;
        public boolean f3050w = true;
        int f3051x = 10000;
        public int f3052y = 10000;
        public int f3053z = 10000;

        public final C0955a m2389a(long j, TimeUnit timeUnit) {
            this.f3051x = C0885c.m2087a("timeout", j, timeUnit);
            return this;
        }

        public final C0955a m2390a(C0951u c0951u) {
            this.f3032e.add(c0951u);
            return this;
        }

        public final C5047x m2391a() {
            return new C5047x(this);
        }
    }

    class C50461 extends C0866a {
        C50461() {
        }

        public final int mo1007a(C0916a c0916a) {
            return c0916a.f2809c;
        }

        public final C4998c mo1008a(C0934j c0934j, C0914a c0914a, C0873g c0873g, ae aeVar) {
            if (C0934j.f2941g || Thread.holdsLock(c0934j)) {
                for (C4998c c4998c : c0934j.f2944d) {
                    if (c4998c.m10093a(c0914a, aeVar)) {
                        c0873g.m2057a(c4998c, true);
                        return c4998c;
                    }
                }
                return null;
            }
            throw new AssertionError();
        }

        public final C0868d mo1009a(C0934j c0934j) {
            return c0934j.f2945e;
        }

        public final Socket mo1010a(C0934j c0934j, C0914a c0914a, C0873g c0873g) {
            if (C0934j.f2941g || Thread.holdsLock(c0934j)) {
                for (C4998c c4998c : c0934j.f2944d) {
                    if (c4998c.m10093a(c0914a, null) && c4998c.m10096b() && c4998c != c0873g.m2060b()) {
                        if (C0873g.f2608k || Thread.holdsLock(c0873g.f2612d)) {
                            if (c0873g.f2618j == null) {
                                if (c0873g.f2616h.f13921k.size() == 1) {
                                    Reference reference = (Reference) c0873g.f2616h.f13921k.get(0);
                                    Socket a = c0873g.m2056a(true, false, false);
                                    c0873g.f2616h = c4998c;
                                    c4998c.f13921k.add(reference);
                                    return a;
                                }
                            }
                            throw new IllegalStateException();
                        }
                        throw new AssertionError();
                    }
                }
                return null;
            }
            throw new AssertionError();
        }

        public final void mo1011a(C0936k c0936k, SSLSocket sSLSocket, boolean z) {
            String[] a = c0936k.f2958f != null ? C0885c.m2104a(C0931h.f2913a, sSLSocket.getEnabledCipherSuites(), c0936k.f2958f) : sSLSocket.getEnabledCipherSuites();
            String[] a2 = c0936k.f2959g != null ? C0885c.m2104a(C0885c.f2640h, sSLSocket.getEnabledProtocols(), c0936k.f2959g) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            int a3 = C0885c.m2088a(C0931h.f2913a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
            if (z && a3 != -1) {
                a = C0885c.m2105a(a, supportedCipherSuites[a3]);
            }
            c0936k = new C0935a(c0936k).m2295a(a).m2296b(a2).m2297b();
            if (c0936k.f2959g != null) {
                sSLSocket.setEnabledProtocols(c0936k.f2959g);
            }
            if (c0936k.f2958f != null) {
                sSLSocket.setEnabledCipherSuites(c0936k.f2958f);
            }
        }

        public final void mo1012a(C0945a c0945a, String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                c0945a.m2342b(str.substring(0, indexOf), str.substring(indexOf + 1));
            } else if (str.startsWith(":")) {
                c0945a.m2342b("", str.substring(1));
            } else {
                c0945a.m2342b("", str);
            }
        }

        public final void mo1013a(C0945a c0945a, String str, String str2) {
            c0945a.m2342b(str, str2);
        }

        public final boolean mo1014a(C0914a c0914a, C0914a c0914a2) {
            return c0914a.m2236a(c0914a2);
        }

        public final boolean mo1015a(C0934j c0934j, C4998c c4998c) {
            if (C0934j.f2941g || Thread.holdsLock(c0934j)) {
                if (!c4998c.f13918h) {
                    if (c0934j.f2942b != 0) {
                        c0934j.notifyAll();
                        return false;
                    }
                }
                c0934j.f2944d.remove(c4998c);
                return true;
            }
            throw new AssertionError();
        }

        public final void mo1016b(C0934j c0934j, C4998c c4998c) {
            if (C0934j.f2941g || Thread.holdsLock(c0934j)) {
                if (!c0934j.f2946f) {
                    c0934j.f2946f = true;
                    C0934j.f2940a.execute(c0934j.f2943c);
                }
                c0934j.f2944d.add(c4998c);
                return;
            }
            throw new AssertionError();
        }
    }

    static {
        C0866a.f2589a = new C50461();
    }

    public C5047x() {
        this(new C0955a());
    }

    C5047x(C0955a c0955a) {
        C0911c a;
        C0929g c0929g;
        Object obj;
        StringBuilder stringBuilder;
        this.f14082c = c0955a.f3028a;
        this.f14083d = c0955a.f3029b;
        this.f14084e = c0955a.f3030c;
        this.f14085f = c0955a.f3031d;
        this.f14086g = C0885c.m2094a(c0955a.f3032e);
        this.f14087h = C0885c.m2094a(c0955a.f3033f);
        this.f14088i = c0955a.f3034g;
        this.f14089j = c0955a.f3035h;
        this.f14090k = c0955a.f3036i;
        this.f14091l = c0955a.f3037j;
        this.f14092m = c0955a.f3038k;
        this.f14093n = c0955a.f3039l;
        loop0:
        while (true) {
            Object obj2 = null;
            for (C0936k c0936k : this.f14085f) {
                if (obj2 != null || c0936k.f2956d) {
                    obj2 = 1;
                }
            }
            break loop0;
        }
        if (c0955a.f3040m == null) {
            if (obj2 != null) {
                X509TrustManager a2 = C5047x.m10236a();
                this.f14094o = C5047x.m10235a(a2);
                a = C0909f.m2216c().mo987a(a2);
                this.f14095p = a;
                this.f14096q = c0955a.f3042o;
                c0929g = c0955a.f3043p;
                obj = this.f14095p;
                if (C0885c.m2103a(c0929g.f2886c, obj)) {
                    c0929g = new C0929g(c0929g.f2885b, obj);
                }
                this.f14097r = c0929g;
                this.f14098s = c0955a.f3044q;
                this.f14099t = c0955a.f3045r;
                this.f14100u = c0955a.f3046s;
                this.f14101v = c0955a.f3047t;
                this.f14102w = c0955a.f3048u;
                this.f14103x = c0955a.f3049v;
                this.f14104y = c0955a.f3050w;
                this.f14105z = c0955a.f3051x;
                this.f14079A = c0955a.f3052y;
                this.f14080B = c0955a.f3053z;
                this.f14081C = c0955a.f3027A;
                if (this.f14086g.contains(null)) {
                    stringBuilder = new StringBuilder("Null interceptor: ");
                    stringBuilder.append(this.f14086g);
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (this.f14087h.contains(null)) {
                    stringBuilder = new StringBuilder("Null network interceptor: ");
                    stringBuilder.append(this.f14087h);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        this.f14094o = c0955a.f3040m;
        a = c0955a.f3041n;
        this.f14095p = a;
        this.f14096q = c0955a.f3042o;
        c0929g = c0955a.f3043p;
        obj = this.f14095p;
        if (C0885c.m2103a(c0929g.f2886c, obj)) {
            c0929g = new C0929g(c0929g.f2885b, obj);
        }
        this.f14097r = c0929g;
        this.f14098s = c0955a.f3044q;
        this.f14099t = c0955a.f3045r;
        this.f14100u = c0955a.f3046s;
        this.f14101v = c0955a.f3047t;
        this.f14102w = c0955a.f3048u;
        this.f14103x = c0955a.f3049v;
        this.f14104y = c0955a.f3050w;
        this.f14105z = c0955a.f3051x;
        this.f14079A = c0955a.f3052y;
        this.f14080B = c0955a.f3053z;
        this.f14081C = c0955a.f3027A;
        if (this.f14086g.contains(null)) {
            stringBuilder = new StringBuilder("Null interceptor: ");
            stringBuilder.append(this.f14086g);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f14087h.contains(null)) {
            stringBuilder = new StringBuilder("Null network interceptor: ");
            stringBuilder.append(this.f14087h);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static SSLSocketFactory m10235a(X509TrustManager x509TrustManager) {
        try {
            SSLContext t_ = C0909f.m2216c().t_();
            t_.init(null, new TrustManager[]{x509TrustManager}, null);
            return t_.getSocketFactory();
        } catch (Exception e) {
            throw C0885c.m2089a("No System TLS", e);
        }
    }

    private static X509TrustManager m10236a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                if (trustManagers[0] instanceof X509TrustManager) {
                    return (X509TrustManager) trustManagers[0];
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Unexpected default trust managers:");
            stringBuilder.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(stringBuilder.toString());
        } catch (Exception e) {
            throw C0885c.m2089a("No System TLS", e);
        }
    }

    public final C0925e mo1017a(aa aaVar) {
        return C5049z.m10240a(this, aaVar, false);
    }
}
