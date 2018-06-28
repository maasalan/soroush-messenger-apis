package p056c;

import java.security.cert.Certificate;
import java.util.List;

public final class C0944r {
    public final C0931h f2986a;
    public final List<Certificate> f2987b;
    private final af f2988c;
    private final List<Certificate> f2989d;

    private C0944r(af afVar, C0931h c0931h, List<Certificate> list, List<Certificate> list2) {
        this.f2988c = afVar;
        this.f2986a = c0931h;
        this.f2987b = list;
        this.f2989d = list2;
    }

    public static p056c.C0944r m2337a(javax.net.ssl.SSLSession r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = r4.getCipherSuite();
        if (r0 != 0) goto L_0x000e;
    L_0x0006:
        r4 = new java.lang.IllegalStateException;
        r0 = "cipherSuite == null";
        r4.<init>(r0);
        throw r4;
    L_0x000e:
        r0 = p056c.C0931h.m2289a(r0);
        r1 = r4.getProtocol();
        if (r1 != 0) goto L_0x0020;
    L_0x0018:
        r4 = new java.lang.IllegalStateException;
        r0 = "tlsVersion == null";
        r4.<init>(r0);
        throw r4;
    L_0x0020:
        r1 = p056c.af.m2273a(r1);
        r2 = r4.getPeerCertificates();	 Catch:{ SSLPeerUnverifiedException -> 0x0029 }
        goto L_0x002a;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        if (r2 == 0) goto L_0x0031;
    L_0x002c:
        r2 = p056c.p057a.C0885c.m2095a(r2);
        goto L_0x0035;
    L_0x0031:
        r2 = java.util.Collections.emptyList();
    L_0x0035:
        r4 = r4.getLocalCertificates();
        if (r4 == 0) goto L_0x0040;
    L_0x003b:
        r4 = p056c.p057a.C0885c.m2095a(r4);
        goto L_0x0044;
    L_0x0040:
        r4 = java.util.Collections.emptyList();
    L_0x0044:
        r3 = new c.r;
        r3.<init>(r1, r0, r2, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.r.a(javax.net.ssl.SSLSession):c.r");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0944r)) {
            return false;
        }
        C0944r c0944r = (C0944r) obj;
        return this.f2988c.equals(c0944r.f2988c) && this.f2986a.equals(c0944r.f2986a) && this.f2987b.equals(c0944r.f2987b) && this.f2989d.equals(c0944r.f2989d);
    }

    public final int hashCode() {
        return (31 * (((((527 + this.f2988c.hashCode()) * 31) + this.f2986a.hashCode()) * 31) + this.f2987b.hashCode())) + this.f2989d.hashCode();
    }
}
