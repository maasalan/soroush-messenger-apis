package p056c.p057a.p065i;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class C5032a extends C0911c {
    private final C0913e f14046a;

    public C5032a(C0913e c0913e) {
        this.f14046a = c0913e;
    }

    private static boolean m10196a(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r2.getIssuerDN();
        r1 = r3.getSubjectDN();
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r3 = r3.getPublicKey();	 Catch:{ GeneralSecurityException -> 0x0019 }
        r2.verify(r3);	 Catch:{ GeneralSecurityException -> 0x0019 }
        r2 = 1;
        return r2;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.i.a.a(java.security.cert.X509Certificate, java.security.cert.X509Certificate):boolean");
    }

    public final List<Certificate> mo985a(List<Certificate> list, String str) {
        Deque arrayDeque = new ArrayDeque(list);
        list = new ArrayList();
        list.add(arrayDeque.removeFirst());
        int i = 0;
        int i2 = 0;
        while (i < 9) {
            X509Certificate x509Certificate = (X509Certificate) list.get(list.size() - 1);
            X509Certificate a = this.f14046a.mo986a(x509Certificate);
            if (a != null) {
                if (list.size() > 1 || !x509Certificate.equals(a)) {
                    list.add(a);
                }
                if (C5032a.m10196a(a, a)) {
                    return list;
                }
                i2 = 1;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    a = (X509Certificate) it.next();
                    if (C5032a.m10196a(x509Certificate, a)) {
                        it.remove();
                        list.add(a);
                    }
                }
                if (i2 != 0) {
                    return list;
                }
                StringBuilder stringBuilder = new StringBuilder("Failed to find a trusted cert that signed ");
                stringBuilder.append(x509Certificate);
                throw new SSLPeerUnverifiedException(stringBuilder.toString());
            }
            i++;
        }
        StringBuilder stringBuilder2 = new StringBuilder("Certificate chain too long: ");
        stringBuilder2.append(list);
        throw new SSLPeerUnverifiedException(stringBuilder2.toString());
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : (obj instanceof C5032a) && ((C5032a) obj).f14046a.equals(this.f14046a);
    }

    public final int hashCode() {
        return this.f14046a.hashCode();
    }
}
