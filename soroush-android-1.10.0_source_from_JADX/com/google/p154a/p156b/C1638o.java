package com.google.p154a.p156b;

import java.util.Set;

public final class C1638o {
    static int m4207a(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    static boolean m4208a(java.util.Set<?> r4, java.lang.Object r5) {
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
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x001c;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
        r3 = r5.size();	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
        if (r1 != r3) goto L_0x001c;	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
    L_0x0015:
        r4 = r4.containsAll(r5);	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
        if (r4 == 0) goto L_0x001c;
    L_0x001b:
        return r0;
    L_0x001c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.b.o.a(java.util.Set, java.lang.Object):boolean");
    }
}
