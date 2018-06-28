package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v4.view.C0571r;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

public class ViewUtils {
    private static final String TAG = "ViewUtils";
    private static Method sComputeFitSystemWindowsMethod;

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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 18;
        if (r0 < r1) goto L_0x0030;
    L_0x0006:
        r0 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r1 = "computeFitSystemWindows";	 Catch:{ NoSuchMethodException -> 0x0029 }
        r2 = 2;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0029 }
        r3 = 0;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r4 = android.graphics.Rect.class;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r3 = android.graphics.Rect.class;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r4 = 1;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r2[r4] = r3;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0029 }
        sComputeFitSystemWindowsMethod = r0;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r0 = r0.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0029 }
        if (r0 != 0) goto L_0x0028;	 Catch:{ NoSuchMethodException -> 0x0029 }
    L_0x0023:
        r0 = sComputeFitSystemWindowsMethod;	 Catch:{ NoSuchMethodException -> 0x0029 }
        r0.setAccessible(r4);	 Catch:{ NoSuchMethodException -> 0x0029 }
    L_0x0028:
        return;
    L_0x0029:
        r0 = "ViewUtils";
        r1 = "Could not find method computeFitSystemWindows. Oh well.";
        android.util.Log.d(r0, r1);
    L_0x0030:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ViewUtils.<clinit>():void");
    }

    private ViewUtils() {
    }

    public static void computeFitSystemWindows(View view, Rect rect, Rect rect2) {
        if (sComputeFitSystemWindowsMethod != null) {
            try {
                sComputeFitSystemWindowsMethod.invoke(view, new Object[]{rect, rect2});
            } catch (Throwable e) {
                Log.d(TAG, "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static boolean isLayoutRtl(View view) {
        return C0571r.m1369h(view) == 1;
    }

    public static void makeOptionalFitsSystemWindows(android.view.View r4) {
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
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x003c;
    L_0x0006:
        r0 = r4.getClass();	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        r1 = "makeOptionalFitsSystemWindows";	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        r2 = 0;	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        r3 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        r0 = r0.getMethod(r1, r3);	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        r1 = r0.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        if (r1 != 0) goto L_0x001d;	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
    L_0x0019:
        r1 = 1;	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
    L_0x001d:
        r1 = new java.lang.Object[r2];	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        r0.invoke(r4, r1);	 Catch:{ NoSuchMethodException -> 0x0035, InvocationTargetException -> 0x002c, IllegalAccessException -> 0x0023 }
        return;
    L_0x0023:
        r4 = move-exception;
        r0 = "ViewUtils";
        r1 = "Could not invoke makeOptionalFitsSystemWindows";
        android.util.Log.d(r0, r1, r4);
        return;
    L_0x002c:
        r4 = move-exception;
        r0 = "ViewUtils";
        r1 = "Could not invoke makeOptionalFitsSystemWindows";
        android.util.Log.d(r0, r1, r4);
        return;
    L_0x0035:
        r4 = "ViewUtils";
        r0 = "Could not find method makeOptionalFitsSystemWindows. Oh well...";
        android.util.Log.d(r4, r0);
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ViewUtils.makeOptionalFitsSystemWindows(android.view.View):void");
    }
}
