package com.google.android.gms.common.util;

import android.content.Context;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.internal.dz;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C1799s {
    private static final Method f5470a = C1799s.m4546a();
    private static final Method f5471b = C1799s.m4550b();
    private static final Method f5472c = C1799s.m4551c();
    private static final Method f5473d = C1799s.m4552d();
    private static final Method f5474e = C1799s.m4553e();

    private static WorkSource m4543a(int i, String str) {
        WorkSource workSource = new WorkSource();
        if (f5471b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f5471b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
                return workSource;
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return workSource;
            }
        }
        if (f5470a != null) {
            f5470a.invoke(workSource, new Object[]{Integer.valueOf(i)});
        }
        return workSource;
    }

    public static android.os.WorkSource m4544a(android.content.Context r3, java.lang.String r4) {
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
        r0 = 0;
        if (r3 == 0) goto L_0x0055;
    L_0x0003:
        r1 = r3.getPackageManager();
        if (r1 == 0) goto L_0x0055;
    L_0x0009:
        if (r4 != 0) goto L_0x000c;
    L_0x000b:
        return r0;
    L_0x000c:
        r3 = com.google.android.gms.internal.dz.m4762a(r3);	 Catch:{ NameNotFoundException -> 0x003a }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x003a }
        r3 = r3.m4757a(r4, r1);	 Catch:{ NameNotFoundException -> 0x003a }
        if (r3 != 0) goto L_0x0033;
    L_0x0017:
        r3 = "WorkSourceUtil";
        r1 = "Could not get applicationInfo from package: ";
        r4 = java.lang.String.valueOf(r4);
        r2 = r4.length();
        if (r2 == 0) goto L_0x002a;
    L_0x0025:
        r4 = r1.concat(r4);
        goto L_0x002f;
    L_0x002a:
        r4 = new java.lang.String;
        r4.<init>(r1);
    L_0x002f:
        android.util.Log.e(r3, r4);
        return r0;
    L_0x0033:
        r3 = r3.uid;
        r3 = com.google.android.gms.common.util.C1799s.m4543a(r3, r4);
        return r3;
    L_0x003a:
        r3 = "WorkSourceUtil";
        r1 = "Could not find package: ";
        r4 = java.lang.String.valueOf(r4);
        r2 = r4.length();
        if (r2 == 0) goto L_0x004d;
    L_0x0048:
        r4 = r1.concat(r4);
        goto L_0x0052;
    L_0x004d:
        r4 = new java.lang.String;
        r4.<init>(r1);
    L_0x0052:
        android.util.Log.e(r3, r4);
    L_0x0055:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.s.a(android.content.Context, java.lang.String):android.os.WorkSource");
    }

    private static String m4545a(WorkSource workSource, int i) {
        if (f5474e != null) {
            try {
                return (String) f5474e.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    private static java.lang.reflect.Method m4546a() {
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
        r0 = android.os.WorkSource.class;	 Catch:{ Exception -> 0x0011 }
        r1 = "add";	 Catch:{ Exception -> 0x0011 }
        r2 = 1;	 Catch:{ Exception -> 0x0011 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0011 }
        r3 = 0;	 Catch:{ Exception -> 0x0011 }
        r4 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0011 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0011 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ Exception -> 0x0011 }
        return r0;
    L_0x0011:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.s.a():java.lang.reflect.Method");
    }

    public static List<String> m4547a(WorkSource workSource) {
        int i = 0;
        int b = workSource == null ? 0 : C1799s.m4549b(workSource);
        if (b == 0) {
            return Collections.emptyList();
        }
        List<String> arrayList = new ArrayList();
        while (i < b) {
            String a = C1799s.m4545a(workSource, i);
            if (!C1795o.m4538a(a)) {
                arrayList.add(a);
            }
            i++;
        }
        return arrayList;
    }

    public static boolean m4548a(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        return dz.m4762a(context).f5667a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }

    private static int m4549b(WorkSource workSource) {
        if (f5472c != null) {
            try {
                return ((Integer) f5472c.invoke(workSource, new Object[0])).intValue();
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    private static java.lang.reflect.Method m4550b() {
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
        r0 = com.google.android.gms.common.util.C1793m.m4532a();
        if (r0 == 0) goto L_0x001c;
    L_0x0006:
        r0 = android.os.WorkSource.class;	 Catch:{ Exception -> 0x001c }
        r1 = "add";	 Catch:{ Exception -> 0x001c }
        r2 = 2;	 Catch:{ Exception -> 0x001c }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001c }
        r3 = 0;	 Catch:{ Exception -> 0x001c }
        r4 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x001c }
        r2[r3] = r4;	 Catch:{ Exception -> 0x001c }
        r3 = 1;	 Catch:{ Exception -> 0x001c }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x001c }
        r2[r3] = r4;	 Catch:{ Exception -> 0x001c }
        r0 = r0.getMethod(r1, r2);	 Catch:{ Exception -> 0x001c }
        return r0;
    L_0x001c:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.s.b():java.lang.reflect.Method");
    }

    private static java.lang.reflect.Method m4551c() {
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
        r0 = android.os.WorkSource.class;	 Catch:{ Exception -> 0x000c }
        r1 = "size";	 Catch:{ Exception -> 0x000c }
        r2 = 0;	 Catch:{ Exception -> 0x000c }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x000c }
        r0 = r0.getMethod(r1, r2);	 Catch:{ Exception -> 0x000c }
        return r0;
    L_0x000c:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.s.c():java.lang.reflect.Method");
    }

    private static java.lang.reflect.Method m4552d() {
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
        r0 = android.os.WorkSource.class;	 Catch:{ Exception -> 0x0011 }
        r1 = "get";	 Catch:{ Exception -> 0x0011 }
        r2 = 1;	 Catch:{ Exception -> 0x0011 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0011 }
        r3 = 0;	 Catch:{ Exception -> 0x0011 }
        r4 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0011 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0011 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ Exception -> 0x0011 }
        return r0;
    L_0x0011:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.s.d():java.lang.reflect.Method");
    }

    private static java.lang.reflect.Method m4553e() {
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
        r0 = com.google.android.gms.common.util.C1793m.m4532a();
        if (r0 == 0) goto L_0x0017;
    L_0x0006:
        r0 = android.os.WorkSource.class;	 Catch:{ Exception -> 0x0017 }
        r1 = "getName";	 Catch:{ Exception -> 0x0017 }
        r2 = 1;	 Catch:{ Exception -> 0x0017 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0017 }
        r3 = 0;	 Catch:{ Exception -> 0x0017 }
        r4 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0017 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0017 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ Exception -> 0x0017 }
        return r0;
    L_0x0017:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.s.e():java.lang.reflect.Method");
    }
}
