package p056c;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p056c.p057a.C0885c;
import p056c.p057a.p065i.C0911c;
import p206d.C2272f;

public final class C0929g {
    public static final C0929g f2884a = new C0929g(new LinkedHashSet(new C0927a().f2879a), null);
    final Set<C0928b> f2885b;
    final C0911c f2886c;

    public static final class C0927a {
        final List<C0928b> f2879a = new ArrayList();
    }

    static final class C0928b {
        final String f2880a;
        final String f2881b;
        final String f2882c;
        final C2272f f2883d;

        public final boolean equals(Object obj) {
            if (obj instanceof C0928b) {
                C0928b c0928b = (C0928b) obj;
                if (this.f2880a.equals(c0928b.f2880a) && this.f2882c.equals(c0928b.f2882c) && this.f2883d.equals(c0928b.f2883d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (31 * (((527 + this.f2880a.hashCode()) * 31) + this.f2882c.hashCode())) + this.f2883d.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f2882c);
            stringBuilder.append(this.f2883d.mo2044b());
            return stringBuilder.toString();
        }
    }

    C0929g(Set<C0928b> set, C0911c c0911c) {
        this.f2885b = set;
        this.f2886c = c0911c;
    }

    private static C2272f m2286a(X509Certificate x509Certificate) {
        return C2272f.m6192a(x509Certificate.getPublicKey().getEncoded()).mo2046d();
    }

    public static String m2287a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder stringBuilder = new StringBuilder("sha256/");
            stringBuilder.append(C0929g.m2286a((X509Certificate) certificate).mo2044b());
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final void m2288a(String str, List<Certificate> list) {
        String str2 = str;
        List emptyList = Collections.emptyList();
        Iterator it = this.f2885b.iterator();
        List list2 = emptyList;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            int indexOf;
            C0928b c0928b = (C0928b) it.next();
            if (c0928b.f2880a.startsWith("*.")) {
                indexOf = str2.indexOf(46);
                if ((str.length() - indexOf) - 1 == c0928b.f2881b.length()) {
                    if (str2.regionMatches(false, indexOf + 1, c0928b.f2881b, 0, c0928b.f2881b.length())) {
                        i = 1;
                    }
                }
            } else {
                i = str2.equals(c0928b.f2881b);
            }
            if (i != 0) {
                if (list2.isEmpty()) {
                    list2 = new ArrayList();
                }
                list2.add(c0928b);
            }
        }
        if (!list2.isEmpty()) {
            int i2;
            StringBuilder stringBuilder;
            emptyList = r0.f2886c != null ? r0.f2886c.mo985a(list, str2) : list;
            int size = emptyList.size();
            for (i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) emptyList.get(i2);
                int size2 = list2.size();
                Object obj = null;
                Object obj2 = obj;
                for (int i3 = 0; i3 < size2; i3++) {
                    C0928b c0928b2 = (C0928b) list2.get(i3);
                    if (c0928b2.f2882c.equals("sha256/")) {
                        if (obj == null) {
                            obj = C0929g.m2286a(x509Certificate);
                        }
                        if (c0928b2.f2883d.equals(obj)) {
                            return;
                        }
                    } else if (c0928b2.f2882c.equals("sha1/")) {
                        if (obj2 == null) {
                            obj2 = C2272f.m6192a(x509Certificate.getPublicKey().getEncoded()).mo2045c();
                        }
                        if (c0928b2.f2883d.equals(obj2)) {
                            return;
                        }
                    } else {
                        stringBuilder = new StringBuilder("unsupported hashAlgorithm: ");
                        stringBuilder.append(c0928b2.f2882c);
                        throw new AssertionError(stringBuilder.toString());
                    }
                }
            }
            stringBuilder = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            i2 = emptyList.size();
            for (int i4 = 0; i4 < i2; i4++) {
                Certificate certificate = (X509Certificate) emptyList.get(i4);
                stringBuilder.append("\n    ");
                stringBuilder.append(C0929g.m2287a(certificate));
                stringBuilder.append(": ");
                stringBuilder.append(certificate.getSubjectDN().getName());
            }
            stringBuilder.append("\n  Pinned certificates for ");
            stringBuilder.append(str2);
            stringBuilder.append(":");
            indexOf = list2.size();
            while (i < indexOf) {
                C0928b c0928b3 = (C0928b) list2.get(i);
                stringBuilder.append("\n    ");
                stringBuilder.append(c0928b3);
                i++;
            }
            throw new SSLPeerUnverifiedException(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0929g) {
            C0929g c0929g = (C0929g) obj;
            if (C0885c.m2103a(this.f2886c, c0929g.f2886c) && this.f2885b.equals(c0929g.f2885b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * (this.f2886c != null ? this.f2886c.hashCode() : 0)) + this.f2885b.hashCode();
    }
}
