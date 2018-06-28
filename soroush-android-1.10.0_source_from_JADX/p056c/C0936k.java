package p056c;

import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import p056c.p057a.C0885c;

public final class C0936k {
    public static final C0936k f2952a;
    public static final C0936k f2953b = new C0935a(f2952a).m2294a(af.TLS_1_0).m2293a().m2297b();
    public static final C0936k f2954c = new C0935a(false).m2297b();
    private static final C0931h[] f2955h = new C0931h[]{C0931h.aX, C0931h.bb, C0931h.aY, C0931h.bc, C0931h.bi, C0931h.bh, C0931h.aI, C0931h.aJ, C0931h.ag, C0931h.ah, C0931h.f2891E, C0931h.f2895I, C0931h.f2921i};
    final boolean f2956d;
    public final boolean f2957e;
    final String[] f2958f;
    final String[] f2959g;

    public static final class C0935a {
        boolean f2948a;
        String[] f2949b;
        String[] f2950c;
        boolean f2951d;

        public C0935a(C0936k c0936k) {
            this.f2948a = c0936k.f2956d;
            this.f2949b = c0936k.f2958f;
            this.f2950c = c0936k.f2959g;
            this.f2951d = c0936k.f2957e;
        }

        C0935a(boolean z) {
            this.f2948a = z;
        }

        public final C0935a m2293a() {
            if (this.f2948a) {
                this.f2951d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public final C0935a m2294a(af... afVarArr) {
            if (this.f2948a) {
                String[] strArr = new String[afVarArr.length];
                for (int i = 0; i < afVarArr.length; i++) {
                    strArr[i] = afVarArr[i].f2846f;
                }
                return m2296b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final C0935a m2295a(String... strArr) {
            if (!this.f2948a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            } else {
                this.f2949b = (String[]) strArr.clone();
                return this;
            }
        }

        public final C0935a m2296b(String... strArr) {
            if (!this.f2948a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            } else {
                this.f2950c = (String[]) strArr.clone();
                return this;
            }
        }

        public final C0936k m2297b() {
            return new C0936k(this);
        }
    }

    static {
        C0935a c0935a = new C0935a(true);
        C0931h[] c0931hArr = f2955h;
        if (c0935a.f2948a) {
            String[] strArr = new String[c0931hArr.length];
            for (int i = 0; i < c0931hArr.length; i++) {
                strArr[i] = c0931hArr[i].bj;
            }
            f2952a = c0935a.m2295a(strArr).m2294a(af.TLS_1_3, af.TLS_1_2, af.TLS_1_1, af.TLS_1_0).m2293a().m2297b();
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    C0936k(C0935a c0935a) {
        this.f2956d = c0935a.f2948a;
        this.f2958f = c0935a.f2949b;
        this.f2959g = c0935a.f2950c;
        this.f2957e = c0935a.f2951d;
    }

    public final boolean m2298a(SSLSocket sSLSocket) {
        return !this.f2956d ? false : (this.f2959g == null || C0885c.m2108b(C0885c.f2640h, this.f2959g, sSLSocket.getEnabledProtocols())) ? this.f2958f == null || C0885c.m2108b(C0931h.f2913a, this.f2958f, sSLSocket.getEnabledCipherSuites()) : false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0936k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0936k c0936k = (C0936k) obj;
        return this.f2956d != c0936k.f2956d ? false : !this.f2956d || (Arrays.equals(this.f2958f, c0936k.f2958f) && Arrays.equals(this.f2959g, c0936k.f2959g) && this.f2957e == c0936k.f2957e);
    }

    public final int hashCode() {
        return this.f2956d ? (31 * (((527 + Arrays.hashCode(this.f2958f)) * 31) + Arrays.hashCode(this.f2959g))) + (this.f2957e ^ 1) : 17;
    }

    public final String toString() {
        if (!this.f2956d) {
            return "ConnectionSpec()";
        }
        String obj;
        String obj2;
        Object obj3 = null;
        if (this.f2958f != null) {
            obj = (this.f2958f != null ? C0931h.m2290a(this.f2958f) : null).toString();
        } else {
            obj = "[all enabled]";
        }
        if (this.f2959g != null) {
            if (this.f2959g != null) {
                obj3 = af.m2274a(this.f2959g);
            }
            obj2 = obj3.toString();
        } else {
            obj2 = "[all enabled]";
        }
        StringBuilder stringBuilder = new StringBuilder("ConnectionSpec(cipherSuites=");
        stringBuilder.append(obj);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(obj2);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.f2957e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
