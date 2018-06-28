package com.google.p173d;

import com.google.p173d.p177b.C1966b;

public final class C1987c {
    public final C1974b f6674a;
    private C1966b f6675b;

    public C1987c(C1974b c1974b) {
        if (c1974b == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f6674a = c1974b;
    }

    public final int m5456a() {
        return this.f6674a.f6636a.f6869b;
    }

    public final C1966b m5457b() {
        if (this.f6675b == null) {
            this.f6675b = this.f6674a.mo1762a();
        }
        return this.f6675b;
    }

    public final java.lang.String toString() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = r1.m5457b();	 Catch:{ j -> 0x0009 }
        r0 = r0.toString();	 Catch:{ j -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.toString():java.lang.String");
    }
}
