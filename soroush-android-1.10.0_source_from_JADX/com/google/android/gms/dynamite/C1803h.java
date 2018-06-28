package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class C1803h extends PathClassLoader {
    C1803h(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    protected final java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) {
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
        r0 = "java.";
        r0 = r2.startsWith(r0);
        if (r0 != 0) goto L_0x0015;
    L_0x0008:
        r0 = "android.";
        r0 = r2.startsWith(r0);
        if (r0 != 0) goto L_0x0015;
    L_0x0010:
        r0 = r1.findClass(r2);	 Catch:{ ClassNotFoundException -> 0x0015 }
        return r0;
    L_0x0015:
        r2 = super.loadClass(r2, r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.h.loadClass(java.lang.String, boolean):java.lang.Class<?>");
    }
}
