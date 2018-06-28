package p056c.p057a.p065i;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class C5033b implements C0913e {
    private final Map<X500Principal, Set<X509Certificate>> f14047a = new LinkedHashMap();

    public C5033b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f14047a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f14047a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public final java.security.cert.X509Certificate mo986a(java.security.cert.X509Certificate r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.getIssuerX500Principal();
        r1 = r4.f14047a;
        r0 = r1.get(r0);
        r0 = (java.util.Set) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r0 = r0.iterator();
    L_0x0014:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0028;
    L_0x001a:
        r2 = r0.next();
        r2 = (java.security.cert.X509Certificate) r2;
        r3 = r2.getPublicKey();
        r5.verify(r3);	 Catch:{ Exception -> 0x0014 }
        return r2;
    L_0x0028:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.i.b.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : (obj instanceof C5033b) && ((C5033b) obj).f14047a.equals(this.f14047a);
    }

    public final int hashCode() {
        return this.f14047a.hashCode();
    }
}
