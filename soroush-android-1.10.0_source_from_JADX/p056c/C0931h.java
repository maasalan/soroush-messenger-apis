package p056c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class C0931h {
    public static final C0931h f2887A = C0931h.m2289a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    public static final C0931h f2888B = C0931h.m2289a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    public static final C0931h f2889C = C0931h.m2289a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    public static final C0931h f2890D = C0931h.m2289a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
    public static final C0931h f2891E = C0931h.m2289a("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final C0931h f2892F = C0931h.m2289a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    public static final C0931h f2893G = C0931h.m2289a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    public static final C0931h f2894H = C0931h.m2289a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
    public static final C0931h f2895I = C0931h.m2289a("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final C0931h f2896J = C0931h.m2289a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    public static final C0931h f2897K = C0931h.m2289a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    public static final C0931h f2898L = C0931h.m2289a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    public static final C0931h f2899M = C0931h.m2289a("TLS_RSA_WITH_NULL_SHA256");
    public static final C0931h f2900N = C0931h.m2289a("TLS_RSA_WITH_AES_128_CBC_SHA256");
    public static final C0931h f2901O = C0931h.m2289a("TLS_RSA_WITH_AES_256_CBC_SHA256");
    public static final C0931h f2902P = C0931h.m2289a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    public static final C0931h f2903Q = C0931h.m2289a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final C0931h f2904R = C0931h.m2289a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    public static final C0931h f2905S = C0931h.m2289a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final C0931h f2906T = C0931h.m2289a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final C0931h f2907U = C0931h.m2289a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    public static final C0931h f2908V = C0931h.m2289a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    public static final C0931h f2909W = C0931h.m2289a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    public static final C0931h f2910X = C0931h.m2289a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    public static final C0931h f2911Y = C0931h.m2289a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final C0931h f2912Z = C0931h.m2289a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    static final Comparator<String> f2913a = new C09301();
    public static final C0931h aA = C0931h.m2289a("TLS_ECDH_RSA_WITH_NULL_SHA");
    public static final C0931h aB = C0931h.m2289a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    public static final C0931h aC = C0931h.m2289a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h aD = C0931h.m2289a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    public static final C0931h aE = C0931h.m2289a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    public static final C0931h aF = C0931h.m2289a("TLS_ECDHE_RSA_WITH_NULL_SHA");
    public static final C0931h aG = C0931h.m2289a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    public static final C0931h aH = C0931h.m2289a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h aI = C0931h.m2289a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final C0931h aJ = C0931h.m2289a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final C0931h aK = C0931h.m2289a("TLS_ECDH_anon_WITH_NULL_SHA");
    public static final C0931h aL = C0931h.m2289a("TLS_ECDH_anon_WITH_RC4_128_SHA");
    public static final C0931h aM = C0931h.m2289a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h aN = C0931h.m2289a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    public static final C0931h aO = C0931h.m2289a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    public static final C0931h aP = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final C0931h aQ = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final C0931h aR = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final C0931h aS = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final C0931h aT = C0931h.m2289a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final C0931h aU = C0931h.m2289a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    public static final C0931h aV = C0931h.m2289a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    public static final C0931h aW = C0931h.m2289a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    public static final C0931h aX = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final C0931h aY = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final C0931h aZ = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final C0931h aa = C0931h.m2289a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final C0931h ab = C0931h.m2289a("TLS_PSK_WITH_RC4_128_SHA");
    public static final C0931h ac = C0931h.m2289a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h ad = C0931h.m2289a("TLS_PSK_WITH_AES_128_CBC_SHA");
    public static final C0931h ae = C0931h.m2289a("TLS_PSK_WITH_AES_256_CBC_SHA");
    public static final C0931h af = C0931h.m2289a("TLS_RSA_WITH_SEED_CBC_SHA");
    public static final C0931h ag = C0931h.m2289a("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final C0931h ah = C0931h.m2289a("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final C0931h ai = C0931h.m2289a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final C0931h aj = C0931h.m2289a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final C0931h ak = C0931h.m2289a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    public static final C0931h al = C0931h.m2289a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    public static final C0931h am = C0931h.m2289a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    public static final C0931h an = C0931h.m2289a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    public static final C0931h ao = C0931h.m2289a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    public static final C0931h ap = C0931h.m2289a("TLS_FALLBACK_SCSV");
    public static final C0931h aq = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    public static final C0931h ar = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    public static final C0931h as = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h at = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    public static final C0931h au = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    public static final C0931h av = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    public static final C0931h aw = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    public static final C0931h ax = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h ay = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final C0931h az = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final C0931h f2914b = C0931h.m2289a("SSL_RSA_WITH_NULL_MD5");
    public static final C0931h ba = C0931h.m2289a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final C0931h bb = C0931h.m2289a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final C0931h bc = C0931h.m2289a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final C0931h bd = C0931h.m2289a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    public static final C0931h be = C0931h.m2289a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    public static final C0931h bf = C0931h.m2289a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    public static final C0931h bg = C0931h.m2289a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    public static final C0931h bh = C0931h.m2289a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final C0931h bi = C0931h.m2289a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    private static final Map<String, C0931h> bk = new TreeMap(f2913a);
    public static final C0931h f2915c = C0931h.m2289a("SSL_RSA_WITH_NULL_SHA");
    public static final C0931h f2916d = C0931h.m2289a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    public static final C0931h f2917e = C0931h.m2289a("SSL_RSA_WITH_RC4_128_MD5");
    public static final C0931h f2918f = C0931h.m2289a("SSL_RSA_WITH_RC4_128_SHA");
    public static final C0931h f2919g = C0931h.m2289a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final C0931h f2920h = C0931h.m2289a("SSL_RSA_WITH_DES_CBC_SHA");
    public static final C0931h f2921i = C0931h.m2289a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h f2922j = C0931h.m2289a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    public static final C0931h f2923k = C0931h.m2289a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    public static final C0931h f2924l = C0931h.m2289a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h f2925m = C0931h.m2289a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final C0931h f2926n = C0931h.m2289a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    public static final C0931h f2927o = C0931h.m2289a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h f2928p = C0931h.m2289a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    public static final C0931h f2929q = C0931h.m2289a("SSL_DH_anon_WITH_RC4_128_MD5");
    public static final C0931h f2930r = C0931h.m2289a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    public static final C0931h f2931s = C0931h.m2289a("SSL_DH_anon_WITH_DES_CBC_SHA");
    public static final C0931h f2932t = C0931h.m2289a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h f2933u = C0931h.m2289a("TLS_KRB5_WITH_DES_CBC_SHA");
    public static final C0931h f2934v = C0931h.m2289a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    public static final C0931h f2935w = C0931h.m2289a("TLS_KRB5_WITH_RC4_128_SHA");
    public static final C0931h f2936x = C0931h.m2289a("TLS_KRB5_WITH_DES_CBC_MD5");
    public static final C0931h f2937y = C0931h.m2289a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    public static final C0931h f2938z = C0931h.m2289a("TLS_KRB5_WITH_RC4_128_MD5");
    final String bj;

    class C09301 implements Comparator<String> {
        C09301() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                } else {
                    i++;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            return length != length2 ? length < length2 ? -1 : 1 : 0;
        }
    }

    private C0931h(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.bj = str;
    }

    public static synchronized C0931h m2289a(String str) {
        C0931h c0931h;
        synchronized (C0931h.class) {
            c0931h = (C0931h) bk.get(str);
            if (c0931h == null) {
                c0931h = new C0931h(str);
                bk.put(str, c0931h);
            }
        }
        return c0931h;
    }

    static List<C0931h> m2290a(String... strArr) {
        List arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C0931h.m2289a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return this.bj;
    }
}
