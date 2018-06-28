package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C1793m;

public final class dy {
    public Context f5667a;

    public dy(Context context) {
        this.f5667a = context;
    }

    public final int m4756a(String str) {
        return this.f5667a.checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo m4757a(String str, int i) {
        return this.f5667a.getPackageManager().getApplicationInfo(str, i);
    }

    public final boolean m4758a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return dx.m4755a(this.f5667a);
        }
        if (C1793m.m4535d()) {
            String nameForUid = this.f5667a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f5667a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    @android.annotation.TargetApi(19)
    public final boolean m4759a(int r5, java.lang.String r6) {
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
        r4 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 0;
        r2 = 1;
        r3 = 19;
        if (r0 < r3) goto L_0x000a;
    L_0x0008:
        r0 = r2;
        goto L_0x000b;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        if (r0 == 0) goto L_0x001c;
    L_0x000d:
        r0 = r4.f5667a;	 Catch:{ SecurityException -> 0x001b }
        r3 = "appops";	 Catch:{ SecurityException -> 0x001b }
        r0 = r0.getSystemService(r3);	 Catch:{ SecurityException -> 0x001b }
        r0 = (android.app.AppOpsManager) r0;	 Catch:{ SecurityException -> 0x001b }
        r0.checkPackage(r5, r6);	 Catch:{ SecurityException -> 0x001b }
        return r2;
    L_0x001b:
        return r1;
    L_0x001c:
        r0 = r4.f5667a;
        r0 = r0.getPackageManager();
        r5 = r0.getPackagesForUid(r5);
        if (r6 == 0) goto L_0x003a;
    L_0x0028:
        if (r5 == 0) goto L_0x003a;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r3 = r5.length;
        if (r0 >= r3) goto L_0x003a;
    L_0x002e:
        r3 = r5[r0];
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0037;
    L_0x0036:
        return r2;
    L_0x0037:
        r0 = r0 + 1;
        goto L_0x002b;
    L_0x003a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.dy.a(int, java.lang.String):boolean");
    }

    public final PackageInfo m4760b(String str, int i) {
        return this.f5667a.getPackageManager().getPackageInfo(str, i);
    }

    public final CharSequence m4761b(String str) {
        return this.f5667a.getPackageManager().getApplicationLabel(this.f5667a.getPackageManager().getApplicationInfo(str, 0));
    }
}
