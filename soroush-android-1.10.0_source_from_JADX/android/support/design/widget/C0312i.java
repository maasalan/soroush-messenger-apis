package android.support.design.widget;

import java.lang.reflect.Method;

final class C0312i {
    private static Method f1216a;
    private static boolean f1217b;

    static boolean m612a(android.graphics.drawable.DrawableContainer r6, android.graphics.drawable.Drawable.ConstantState r7) {
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
        r0 = f1217b;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0023;
    L_0x0006:
        r0 = android.graphics.drawable.DrawableContainer.class;	 Catch:{ NoSuchMethodException -> 0x001a }
        r3 = "setConstantState";	 Catch:{ NoSuchMethodException -> 0x001a }
        r4 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001a }
        r5 = android.graphics.drawable.DrawableContainer.DrawableContainerState.class;	 Catch:{ NoSuchMethodException -> 0x001a }
        r4[r1] = r5;	 Catch:{ NoSuchMethodException -> 0x001a }
        r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x001a }
        f1216a = r0;	 Catch:{ NoSuchMethodException -> 0x001a }
        r0.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x001a }
        goto L_0x0021;
    L_0x001a:
        r0 = "DrawableUtils";
        r3 = "Could not fetch setConstantState(). Oh well.";
        android.util.Log.e(r0, r3);
    L_0x0021:
        f1217b = r2;
    L_0x0023:
        r0 = f1216a;
        if (r0 == 0) goto L_0x0038;
    L_0x0027:
        r0 = f1216a;	 Catch:{ Exception -> 0x0031 }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0031 }
        r3[r1] = r7;	 Catch:{ Exception -> 0x0031 }
        r0.invoke(r6, r3);	 Catch:{ Exception -> 0x0031 }
        return r2;
    L_0x0031:
        r6 = "DrawableUtils";
        r7 = "Could not invoke setConstantState(). Oh well.";
        android.util.Log.e(r6, r7);
    L_0x0038:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.i.a(android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable$ConstantState):boolean");
    }
}
