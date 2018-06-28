package com.google.firebase.perf;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.perf.metrics.Trace;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class C2096a {
    private static volatile C2096a f7050c;
    public final Map<String, String> f7051a = new ConcurrentHashMap();
    public boolean f7052b = true;

    private C2096a() {
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
        r3 = this;
        r3.<init>();
        r0 = new java.util.concurrent.ConcurrentHashMap;
        r0.<init>();
        r3.f7051a = r0;
        r0 = 1;
        r3.f7052b = r0;
        r0 = 0;
        com.google.firebase.C2053a.m5590c();	 Catch:{ IllegalStateException -> 0x0026 }
        r1 = com.google.firebase.C2053a.m5590c();
        r1 = r1.m5597a();
        r2 = "FirebasePerfSharedPrefs";
        r0 = r1.getSharedPreferences(r2, r0);
        r0 = com.google.firebase.perf.C2096a.m5729a(r1, r0);
        r3.f7052b = r0;
        return;
    L_0x0026:
        r3.f7052b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.a.<init>():void");
    }

    public static C2096a m5726a() {
        if (f7050c == null) {
            synchronized (C2096a.class) {
                if (f7050c == null) {
                    f7050c = new C2096a();
                }
            }
        }
        return f7050c;
    }

    public static Trace m5727a(String str) {
        return Trace.m16936a(str);
    }

    private static boolean m5728a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_collection_enabled", true);
        } catch (Exception e) {
            String str = "isEnabled";
            String str2 = "No perf enable meta data found ";
            String valueOf = String.valueOf(e.getMessage());
            Log.d(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            return true;
        }
    }

    private static boolean m5729a(Context context, SharedPreferences sharedPreferences) {
        if (C2096a.m5730b(context)) {
            return false;
        }
        try {
            if (sharedPreferences.contains("isEnabled")) {
                return sharedPreferences.getBoolean("isEnabled", true);
            }
        } catch (ClassCastException e) {
            String str = "FirebasePerformance";
            String str2 = "Unable to access enable value: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        return C2096a.m5728a(context);
    }

    private static boolean m5730b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_collection_deactivated", false);
        } catch (Exception e) {
            String str = "isEnabled";
            String str2 = "No perf enable meta data found ";
            String valueOf = String.valueOf(e.getMessage());
            Log.d(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            return false;
        }
    }
}
