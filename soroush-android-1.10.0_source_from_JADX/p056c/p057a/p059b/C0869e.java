package p056c.p057a.p059b;

import java.io.IOException;
import java.lang.reflect.Method;

public final class C0869e extends RuntimeException {
    private static final Method f2595b;
    public IOException f2596a;

    static {
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
        r0 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0011 }
        r1 = "addSuppressed";	 Catch:{ Exception -> 0x0011 }
        r2 = 1;	 Catch:{ Exception -> 0x0011 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0011 }
        r3 = 0;	 Catch:{ Exception -> 0x0011 }
        r4 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0011 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0011 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ Exception -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        f2595b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.e.<clinit>():void");
    }

    public C0869e(IOException iOException) {
        super(iOException);
        this.f2596a = iOException;
    }

    static void m2044a(java.io.IOException r3, java.io.IOException r4) {
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
        r0 = f2595b;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = f2595b;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1 = 1;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r2 = 0;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1[r2] = r4;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r0.invoke(r3, r1);	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.e.a(java.io.IOException, java.io.IOException):void");
    }
}
