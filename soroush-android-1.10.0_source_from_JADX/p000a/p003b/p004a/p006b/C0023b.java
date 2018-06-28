package p000a.p003b.p004a.p006b;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import p000a.p003b.p004a.C0021a;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0044e;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C0076k;
import p000a.p003b.p004a.C0076k.C0069a;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p006b.C0022a.C4627a;
import p000a.p003b.p004a.p006b.C0022a.C4628b;
import p000a.p003b.p004a.p007c.C0034g;
import p000a.p003b.p004a.p007c.C4631b;
import p000a.p003b.p004a.p007c.C6317a;
import p000a.p003b.p004a.p014i.C4668t;

public class C0023b {
    private static final Logger f87a = Logger.getLogger(C0023b.class.getName());
    private final C0021a f88b;

    public C0023b() {
        this(new C6317a());
    }

    private C0023b(C0021a c0021a) {
        this.f88b = c0021a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m33a(java.security.cert.X509Certificate r4, p000a.p003b.p004a.p014i.C4668t r5, java.lang.String r6) {
        /*
        r0 = r5.f12849a;
        r1 = 3;
        r2 = 1;
        r3 = 0;
        if (r0 == r2) goto L_0x0027;
    L_0x0007:
        if (r0 == r1) goto L_0x0027;
    L_0x0009:
        r4 = f87a;
        r0 = new java.lang.StringBuilder;
        r1 = "TLSA certificate usage ";
        r0.<init>(r1);
        r5 = r5.f12849a;
    L_0x0014:
        r0.append(r5);
        r5 = " not supported while verifying ";
        r0.append(r5);
        r0.append(r6);
        r5 = r0.toString();
        r4.warning(r5);
        return r3;
    L_0x0027:
        r0 = r5.f12850b;
        switch(r0) {
            case 0: goto L_0x0041;
            case 1: goto L_0x0038;
            default: goto L_0x002c;
        };
    L_0x002c:
        r4 = f87a;
        r0 = new java.lang.StringBuilder;
        r1 = "TLSA selector ";
        r0.<init>(r1);
        r5 = r5.f12850b;
        goto L_0x0014;
    L_0x0038:
        r4 = r4.getPublicKey();
        r4 = r4.getEncoded();
        goto L_0x0045;
    L_0x0041:
        r4 = r4.getEncoded();
    L_0x0045:
        r0 = r5.f12851c;
        switch(r0) {
            case 0: goto L_0x007e;
            case 1: goto L_0x006a;
            case 2: goto L_0x0056;
            default: goto L_0x004a;
        };
    L_0x004a:
        r4 = f87a;
        r0 = new java.lang.StringBuilder;
        r1 = "TLSA matching type ";
        r0.<init>(r1);
        r5 = r5.f12851c;
        goto L_0x0014;
    L_0x0056:
        r6 = "SHA-512";
        r6 = java.security.MessageDigest.getInstance(r6);	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        r4 = r6.digest(r4);	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        goto L_0x007e;
    L_0x0061:
        r4 = move-exception;
        r5 = new java.security.cert.CertificateException;
        r6 = "Verification using TLSA failed: could not SHA-512 for matching";
        r5.<init>(r6, r4);
        throw r5;
    L_0x006a:
        r6 = "SHA-256";
        r6 = java.security.MessageDigest.getInstance(r6);	 Catch:{ NoSuchAlgorithmException -> 0x0075 }
        r4 = r6.digest(r4);	 Catch:{ NoSuchAlgorithmException -> 0x0075 }
        goto L_0x007e;
    L_0x0075:
        r4 = move-exception;
        r5 = new java.security.cert.CertificateException;
        r6 = "Verification using TLSA failed: could not SHA-256 for matching";
        r5.<init>(r6, r4);
        throw r5;
    L_0x007e:
        r6 = r5.f12852d;
        r6 = java.util.Arrays.equals(r6, r4);
        if (r6 != 0) goto L_0x008c;
    L_0x0086:
        r6 = new a.b.a.b.a$a;
        r6.<init>(r5, r4);
        throw r6;
    L_0x008c:
        r4 = r5.f12849a;
        if (r4 != r1) goto L_0x0091;
    L_0x0090:
        return r2;
    L_0x0091:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a.b.b.a(java.security.cert.X509Certificate, a.b.a.i.t, java.lang.String):boolean");
    }

    private boolean m34a(X509Certificate[] x509CertificateArr, String str, int i) {
        StringBuilder stringBuilder = new StringBuilder("_");
        stringBuilder.append(i);
        stringBuilder.append("._tcp.");
        stringBuilder.append(str);
        C0044e a = C0044e.m73a(stringBuilder.toString());
        try {
            C0041d a2 = this.f88b.mo2469a(new C0065j(a, C0070b.TLSA, C0069a.IN, (byte) 0));
            if (a2.f161i) {
                List linkedList = new LinkedList();
                boolean z = false;
                for (C0076k c0076k : a2.f164l) {
                    if (c0076k.f341b == C0070b.TLSA && c0076k.f340a.equals(a)) {
                        try {
                            z |= C0023b.m33a(x509CertificateArr[0], (C4668t) c0076k.f345f, str);
                        } catch (C4627a e) {
                            linkedList.add(e);
                        }
                        if (z) {
                            break;
                        }
                    }
                }
                if (z || linkedList.isEmpty()) {
                    return z;
                }
                throw new C4628b(linkedList);
            }
            String str2 = "Got TLSA response from DNS server, but was not signed properly.";
            if (a2 instanceof C4631b) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(" Reasons:");
                str2 = stringBuilder2.toString();
                for (C0034g c0034g : ((C4631b) a2).f12738r) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(" ");
                    stringBuilder.append(c0034g);
                    str2 = stringBuilder.toString();
                }
            }
            f87a.info(str2);
            return false;
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    private static X509Certificate[] m35a(javax.security.cert.X509Certificate[] x509CertificateArr) {
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i = 0; i < x509CertificateArr.length; i++) {
            try {
                x509CertificateArr2[i] = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(x509CertificateArr[i].getEncoded()));
            } catch (Throwable e) {
                f87a.log(Level.WARNING, "Could not convert", e);
            }
        }
        return x509CertificateArr2;
    }

    public final boolean m36a(SSLSession sSLSession) {
        try {
            return m34a(C0023b.m35a(sSLSession.getPeerCertificateChain()), sSLSession.getPeerHost(), sSLSession.getPeerPort());
        } catch (Throwable e) {
            throw new CertificateException("Peer not verified", e);
        }
    }
}
