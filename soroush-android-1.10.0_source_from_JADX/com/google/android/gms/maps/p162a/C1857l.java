package com.google.android.gms.maps.p162a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1742c;
import com.google.android.gms.common.C5462e;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.C1877e;
import com.google.android.gms.p158a.C6566m;

public class C1857l {
    private static final String f6307a = "l";
    private static Context f6308b;
    private static C1858m f6309c;

    public static C1858m m5198a(Context context) {
        ac.m4376a((Object) context);
        if (f6309c != null) {
            return f6309c;
        }
        int a = C5462e.m11799a(context);
        if (a != 0) {
            throw new C1742c(a);
        }
        C1858m c1858m;
        Log.i(f6307a, "Making Creator dynamically");
        IBinder iBinder = (IBinder) C1857l.m5200a(C1857l.m5201b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
        if (iBinder == null) {
            c1858m = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            c1858m = queryLocalInterface instanceof C1858m ? (C1858m) queryLocalInterface : new C5515n(iBinder);
        }
        f6309c = c1858m;
        try {
            f6309c.mo1678a(C6566m.m15848a(C1857l.m5201b(context).getResources()), C5462e.f15146a);
            return f6309c;
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    private static <T> T m5199a(java.lang.Class<?> r3) {
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
        r0 = r3.newInstance();	 Catch:{ InstantiationException -> 0x0025, IllegalAccessException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.lang.IllegalStateException;
        r1 = "Unable to call the default constructor of ";
        r3 = r3.getName();
        r3 = java.lang.String.valueOf(r3);
        r2 = r3.length();
        if (r2 == 0) goto L_0x001c;
    L_0x0017:
        r3 = r1.concat(r3);
        goto L_0x0021;
    L_0x001c:
        r3 = new java.lang.String;
        r3.<init>(r1);
    L_0x0021:
        r0.<init>(r3);
        throw r0;
    L_0x0025:
        r0 = new java.lang.IllegalStateException;
        r1 = "Unable to instantiate the dynamic class ";
        r3 = r3.getName();
        r3 = java.lang.String.valueOf(r3);
        r2 = r3.length();
        if (r2 == 0) goto L_0x003c;
    L_0x0037:
        r3 = r1.concat(r3);
        goto L_0x0041;
    L_0x003c:
        r3 = new java.lang.String;
        r3.<init>(r1);
    L_0x0041:
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.a.l.a(java.lang.Class):T");
    }

    private static <T> T m5200a(java.lang.ClassLoader r2, java.lang.String r3) {
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
        r2 = com.google.android.gms.common.internal.ac.m4376a(r2);	 Catch:{ ClassNotFoundException -> 0x000f }
        r2 = (java.lang.ClassLoader) r2;	 Catch:{ ClassNotFoundException -> 0x000f }
        r2 = r2.loadClass(r3);	 Catch:{ ClassNotFoundException -> 0x000f }
        r2 = com.google.android.gms.maps.p162a.C1857l.m5199a(r2);	 Catch:{ ClassNotFoundException -> 0x000f }
        return r2;
    L_0x000f:
        r2 = new java.lang.IllegalStateException;
        r0 = "Unable to find dynamic class ";
        r3 = java.lang.String.valueOf(r3);
        r1 = r3.length();
        if (r1 == 0) goto L_0x0022;
    L_0x001d:
        r3 = r0.concat(r3);
        goto L_0x0027;
    L_0x0022:
        r3 = new java.lang.String;
        r3.<init>(r0);
    L_0x0027:
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.a.l.a(java.lang.ClassLoader, java.lang.String):T");
    }

    private static Context m5201b(Context context) {
        if (f6308b != null) {
            return f6308b;
        }
        context = C1857l.m5202c(context);
        f6308b = context;
        return context;
    }

    private static Context m5202c(Context context) {
        try {
            return DynamiteModule.m4558a(context, DynamiteModule.f5476a, "com.google.android.gms.maps_dynamite").f5488f;
        } catch (Throwable th) {
            Log.e(f6307a, "Failed to load maps module, use legacy", th);
            return C5462e.m11801c(context);
        }
    }
}
