package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.C1798r;
import com.google.android.gms.internal.dz;
import java.util.concurrent.atomic.AtomicBoolean;

public class C1780t {
    private static boolean f5442a = false;
    @Deprecated
    public static final int f5443b = 11720000;
    static final AtomicBoolean f5444c = new AtomicBoolean();
    private static boolean f5445d = false;
    private static boolean f5446e = false;
    private static boolean f5447f = false;
    private static final AtomicBoolean f5448g = new AtomicBoolean();

    @Deprecated
    public static String m4492a(int i) {
        return ConnectionResult.m15868a(i);
    }

    @Deprecated
    public static boolean m4493a(Context context, int i) {
        return i == 18 ? true : i == 1 ? C1780t.m4495a(context, "com.google.android.gms") : false;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean m4494a(Context context, int i, String str) {
        return C1798r.m4542a(context, i, str);
    }

    @android.annotation.TargetApi(21)
    static boolean m4495a(android.content.Context r5, java.lang.String r6) {
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
        r0 = "com.google.android.gms";
        r0 = r6.equals(r0);
        r1 = com.google.android.gms.common.util.C1793m.m4534c();
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0036;
    L_0x000e:
        r1 = r5.getPackageManager();	 Catch:{ Exception -> 0x0035 }
        r1 = r1.getPackageInstaller();	 Catch:{ Exception -> 0x0035 }
        r1 = r1.getAllSessions();	 Catch:{ Exception -> 0x0035 }
        r1 = r1.iterator();
    L_0x001e:
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x0036;
    L_0x0024:
        r4 = r1.next();
        r4 = (android.content.pm.PackageInstaller.SessionInfo) r4;
        r4 = r4.getAppPackageName();
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x001e;
    L_0x0034:
        return r2;
    L_0x0035:
        return r3;
    L_0x0036:
        r1 = r5.getPackageManager();
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = r1.getApplicationInfo(r6, r4);	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r0 == 0) goto L_0x0045;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0042:
        r5 = r6.enabled;	 Catch:{ NameNotFoundException -> 0x0075 }
        return r5;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0045:
        r6 = r6.enabled;	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r6 == 0) goto L_0x0075;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0049:
        r6 = com.google.android.gms.common.util.C1793m.m4532a();	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r6 == 0) goto L_0x0071;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x004f:
        r6 = "user";	 Catch:{ NameNotFoundException -> 0x0075 }
        r6 = r5.getSystemService(r6);	 Catch:{ NameNotFoundException -> 0x0075 }
        r6 = (android.os.UserManager) r6;	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r6.getApplicationRestrictions(r5);	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r5 == 0) goto L_0x0071;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0061:
        r6 = "true";	 Catch:{ NameNotFoundException -> 0x0075 }
        r0 = "restricted_profile";	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r5.getString(r0);	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r6.equals(r5);	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r5 == 0) goto L_0x0071;
    L_0x006f:
        r5 = r2;
        goto L_0x0072;
    L_0x0071:
        r5 = r3;
    L_0x0072:
        if (r5 != 0) goto L_0x0075;
    L_0x0074:
        return r2;
    L_0x0075:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.t.a(android.content.Context, java.lang.String):boolean");
    }

    @Deprecated
    public static boolean m4496b(int i) {
        if (i != 9) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @java.lang.Deprecated
    public static int m4497d(android.content.Context r8) {
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
        r0 = r8.getPackageManager();
        r1 = r8.getResources();	 Catch:{ Throwable -> 0x000e }
        r2 = com.google.android.gms.C1650a.C1645b.common_google_play_services_unknown_issue;	 Catch:{ Throwable -> 0x000e }
        r1.getString(r2);	 Catch:{ Throwable -> 0x000e }
        goto L_0x0015;
    L_0x000e:
        r1 = "GooglePlayServicesUtil";
        r2 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.";
        android.util.Log.e(r1, r2);
    L_0x0015:
        r1 = "com.google.android.gms";
        r2 = r8.getPackageName();
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0076;
    L_0x0021:
        r1 = f5448g;
        r1 = r1.get();
        if (r1 != 0) goto L_0x0076;
    L_0x0029:
        r1 = com.google.android.gms.common.internal.C1769z.m4468b(r8);
        if (r1 != 0) goto L_0x0037;
    L_0x002f:
        r8 = new java.lang.IllegalStateException;
        r0 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />";
        r8.<init>(r0);
        throw r8;
    L_0x0037:
        r2 = f5443b;
        if (r1 == r2) goto L_0x0076;
    L_0x003b:
        r8 = new java.lang.IllegalStateException;
        r0 = f5443b;
        r2 = "com.google.android.gms.version";
        r3 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ";
        r4.append(r3);
        r4.append(r0);
        r0 = " but found ";
        r4.append(r0);
        r4.append(r1);
        r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"";
        r4.append(r0);
        r4.append(r2);
        r0 = "\" android:value=\"@integer/google_play_services_version\" />";
        r4.append(r0);
        r0 = r4.toString();
        r8.<init>(r0);
        throw r8;
    L_0x0076:
        r1 = com.google.android.gms.common.util.C1787g.m4524a(r8);
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x00ae;
    L_0x007e:
        r1 = com.google.android.gms.common.util.C1787g.f5456a;
        if (r1 != 0) goto L_0x00a4;
    L_0x0082:
        r1 = r8.getPackageManager();
        r4 = "android.hardware.type.iot";
        r1 = r1.hasSystemFeature(r4);
        if (r1 != 0) goto L_0x009d;
    L_0x008e:
        r1 = r8.getPackageManager();
        r4 = "android.hardware.type.embedded";
        r1 = r1.hasSystemFeature(r4);
        if (r1 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x009d;
    L_0x009b:
        r1 = r3;
        goto L_0x009e;
    L_0x009d:
        r1 = r2;
    L_0x009e:
        r1 = java.lang.Boolean.valueOf(r1);
        com.google.android.gms.common.util.C1787g.f5456a = r1;
    L_0x00a4:
        r1 = com.google.android.gms.common.util.C1787g.f5456a;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x00ae;
    L_0x00ac:
        r1 = r2;
        goto L_0x00af;
    L_0x00ae:
        r1 = r3;
    L_0x00af:
        r4 = 0;
        r5 = 9;
        if (r1 == 0) goto L_0x00c5;
    L_0x00b4:
        r4 = "com.android.vending";	 Catch:{ NameNotFoundException -> 0x00bd }
        r6 = 8256; // 0x2040 float:1.1569E-41 double:4.079E-320;	 Catch:{ NameNotFoundException -> 0x00bd }
        r4 = r0.getPackageInfo(r4, r6);	 Catch:{ NameNotFoundException -> 0x00bd }
        goto L_0x00c5;
    L_0x00bd:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play Store is missing.";
    L_0x00c1:
        android.util.Log.w(r8, r0);
        return r5;
    L_0x00c5:
        r6 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0142 }
        r7 = 64;	 Catch:{ NameNotFoundException -> 0x0142 }
        r6 = r0.getPackageInfo(r6, r7);	 Catch:{ NameNotFoundException -> 0x0142 }
        com.google.android.gms.common.C1781u.m4504a(r8);
        if (r1 == 0) goto L_0x00ee;
    L_0x00d2:
        r8 = com.google.android.gms.common.C1773p.f5422a;
        r8 = com.google.android.gms.common.C1781u.m4503a(r4, r8);
        if (r8 != 0) goto L_0x00df;
    L_0x00da:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play Store signature invalid.";
        goto L_0x00c1;
    L_0x00df:
        r1 = new com.google.android.gms.common.C6580m[r2];
        r1[r3] = r8;
        r8 = com.google.android.gms.common.C1781u.m4503a(r6, r1);
        if (r8 != 0) goto L_0x00f7;
    L_0x00e9:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play services signature invalid.";
        goto L_0x00c1;
    L_0x00ee:
        r8 = com.google.android.gms.common.C1773p.f5422a;
        r8 = com.google.android.gms.common.C1781u.m4503a(r6, r8);
        if (r8 != 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00e9;
    L_0x00f7:
        r8 = f5443b;
        r8 = r8 / 1000;
        r1 = r6.versionCode;
        r1 = r1 / 1000;
        if (r1 >= r8) goto L_0x0127;
    L_0x0101:
        r8 = "GooglePlayServicesUtil";
        r0 = f5443b;
        r1 = r6.versionCode;
        r2 = 77;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Google Play services out of date.  Requires ";
        r3.append(r2);
        r3.append(r0);
        r0 = " but found ";
        r3.append(r0);
        r3.append(r1);
        r0 = r3.toString();
        android.util.Log.w(r8, r0);
        r8 = 2;
        return r8;
    L_0x0127:
        r8 = r6.applicationInfo;
        if (r8 != 0) goto L_0x013b;
    L_0x012b:
        r8 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0132 }
        r8 = r0.getApplicationInfo(r8, r3);	 Catch:{ NameNotFoundException -> 0x0132 }
        goto L_0x013b;
    L_0x0132:
        r8 = move-exception;
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play services missing when getting application info.";
        android.util.Log.wtf(r0, r1, r8);
        return r2;
    L_0x013b:
        r8 = r8.enabled;
        if (r8 != 0) goto L_0x0141;
    L_0x013f:
        r8 = 3;
        return r8;
    L_0x0141:
        return r3;
    L_0x0142:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play services is missing.";
        android.util.Log.w(r8, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.t.d(android.content.Context):int");
    }

    @Deprecated
    public static void m4498e(Context context) {
        int a = C1771k.m4473b().mo1557a(context);
        if (a != 0) {
            C1771k.m4473b();
            Intent a2 = C1771k.m4471a(context, a, "e");
            StringBuilder stringBuilder = new StringBuilder(57);
            stringBuilder.append("GooglePlayServices not available due to error ");
            stringBuilder.append(a);
            Log.e("GooglePlayServicesUtil", stringBuilder.toString());
            if (a2 == null) {
                throw new C1742c(a);
            }
            throw new C5459d(a, "Google Play Services not available", a2);
        }
    }

    public static boolean m4499f(Context context) {
        if (!f5447f) {
            try {
                PackageInfo b = dz.m4762a(context).m4760b("com.google.android.gms", 64);
                if (b != null) {
                    C1781u.m4504a(context);
                    if (C1781u.m4503a(b, C1773p.f5422a[1]) != null) {
                        f5446e = true;
                        f5447f = true;
                    }
                }
                f5446e = false;
            } catch (Throwable e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } catch (Throwable th) {
                f5447f = true;
            }
            f5447f = true;
        }
        return f5446e || !"user".equals(Build.TYPE);
    }

    public static android.content.res.Resources m4500g(android.content.Context r1) {
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
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x000b }
        r0 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x000b }
        r1 = r1.getResourcesForApplication(r0);	 Catch:{ NameNotFoundException -> 0x000b }
        return r1;
    L_0x000b:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.t.g(android.content.Context):android.content.res.Resources");
    }

    public static android.content.Context m4501h(android.content.Context r2) {
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
        r0 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0008 }
        r1 = 3;	 Catch:{ NameNotFoundException -> 0x0008 }
        r2 = r2.createPackageContext(r0, r1);	 Catch:{ NameNotFoundException -> 0x0008 }
        return r2;
    L_0x0008:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.t.h(android.content.Context):android.content.Context");
    }

    @java.lang.Deprecated
    public static int m4502i(android.content.Context r2) {
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
        r0 = 0;
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x000e }
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x000e }
        r2 = r2.getPackageInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x000e }
        r2 = r2.versionCode;
        return r2;
    L_0x000e:
        r2 = "GooglePlayServicesUtil";
        r1 = "Google Play services is missing.";
        android.util.Log.w(r2, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.t.i(android.content.Context):int");
    }
}
