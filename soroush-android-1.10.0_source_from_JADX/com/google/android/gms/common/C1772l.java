package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C1768w;
import com.google.android.gms.common.internal.C5474x;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p158a.C6566m;

final class C1772l {
    private static C1768w f5419a;
    private static final Object f5420b = new Object();
    private static Context f5421c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m4480a(android.content.Context r2) {
        /*
        r0 = com.google.android.gms.common.C1772l.class;
        monitor-enter(r0);
        r1 = f5421c;	 Catch:{ all -> 0x001a }
        if (r1 != 0) goto L_0x0011;
    L_0x0007:
        if (r2 == 0) goto L_0x0018;
    L_0x0009:
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x001a }
        f5421c = r2;	 Catch:{ all -> 0x001a }
        monitor-exit(r0);
        return;
    L_0x0011:
        r2 = "GoogleCertificates";
        r1 = "GoogleCertificates has been initialized already";
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x001a }
    L_0x0018:
        monitor-exit(r0);
        return;
    L_0x001a:
        r2 = move-exception;
        monitor-exit(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.l.a(android.content.Context):void");
    }

    private static boolean m4481a() {
        if (f5419a != null) {
            return true;
        }
        ac.m4376a(f5421c);
        synchronized (f5420b) {
            if (f5419a == null) {
                try {
                    f5419a = C5474x.m11824a(DynamiteModule.m4558a(f5421c, DynamiteModule.f5478c, "com.google.android.gms.googlecertificates").m4567a("com.google.android.gms.common.GoogleCertificatesImpl"));
                } catch (Throwable e) {
                    Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", e);
                    return false;
                }
            }
        }
        return true;
    }

    static boolean m4482a(String str, C6580m c6580m) {
        return C1772l.m4483a(str, c6580m, false);
    }

    private static boolean m4483a(String str, C6580m c6580m, boolean z) {
        if (!C1772l.m4481a()) {
            return false;
        }
        ac.m4376a(f5421c);
        try {
            return f5419a.mo1574a(new zzm(str, c6580m, z), C6566m.m15848a(f5421c.getPackageManager()));
        } catch (Throwable e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    static boolean m4484b(String str, C6580m c6580m) {
        return C1772l.m4483a(str, c6580m, true);
    }
}
