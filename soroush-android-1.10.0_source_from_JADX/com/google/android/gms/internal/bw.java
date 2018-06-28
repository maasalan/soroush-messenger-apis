package com.google.android.gms.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.ac;

public final class bw<T extends Context & bz> {
    private static Boolean f5615c;
    final Handler f5616a = new Handler();
    public final T f5617b;

    public bw(T t) {
        ac.m4376a((Object) t);
        this.f5617b = t;
    }

    public static boolean m4634a(Context context) {
        ac.m4376a((Object) context);
        if (f5615c != null) {
            return f5615c.booleanValue();
        }
        boolean a = ce.m4651a(context, "com.google.android.gms.analytics.AnalyticsService");
        f5615c = Boolean.valueOf(a);
        return a;
    }

    public final int m4635a(android.content.Intent r11, int r12) {
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
        r10 = this;
        r0 = com.google.android.gms.internal.bv.f5612a;	 Catch:{ SecurityException -> 0x0077 }
        monitor-enter(r0);	 Catch:{ SecurityException -> 0x0077 }
        r1 = com.google.android.gms.internal.bv.f5613b;	 Catch:{ all -> 0x0074 }
        if (r1 == 0) goto L_0x0072;	 Catch:{ all -> 0x0074 }
    L_0x0007:
        r2 = r1.f6111a;	 Catch:{ all -> 0x0074 }
        r2 = r2.isHeld();	 Catch:{ all -> 0x0074 }
        if (r2 == 0) goto L_0x0072;	 Catch:{ all -> 0x0074 }
    L_0x000f:
        r6 = r1.m4976a();	 Catch:{ all -> 0x0074 }
        monitor-enter(r1);	 Catch:{ all -> 0x0074 }
        r2 = r1.f6116f;	 Catch:{ all -> 0x006f }
        r9 = 1;	 Catch:{ all -> 0x006f }
        if (r2 == 0) goto L_0x0043;	 Catch:{ all -> 0x006f }
    L_0x0019:
        r2 = r1.f6117g;	 Catch:{ all -> 0x006f }
        r2 = r2.get(r6);	 Catch:{ all -> 0x006f }
        r2 = (java.lang.Integer[]) r2;	 Catch:{ all -> 0x006f }
        r3 = 0;	 Catch:{ all -> 0x006f }
        if (r2 != 0) goto L_0x0025;	 Catch:{ all -> 0x006f }
    L_0x0024:
        goto L_0x0041;	 Catch:{ all -> 0x006f }
    L_0x0025:
        r4 = r2[r3];	 Catch:{ all -> 0x006f }
        r4 = r4.intValue();	 Catch:{ all -> 0x006f }
        if (r4 != r9) goto L_0x0034;	 Catch:{ all -> 0x006f }
    L_0x002d:
        r2 = r1.f6117g;	 Catch:{ all -> 0x006f }
        r2.remove(r6);	 Catch:{ all -> 0x006f }
        r3 = r9;	 Catch:{ all -> 0x006f }
        goto L_0x0041;	 Catch:{ all -> 0x006f }
    L_0x0034:
        r4 = r2[r3];	 Catch:{ all -> 0x006f }
        r4 = r4.intValue();	 Catch:{ all -> 0x006f }
        r4 = r4 - r9;	 Catch:{ all -> 0x006f }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x006f }
        r2[r3] = r4;	 Catch:{ all -> 0x006f }
    L_0x0041:
        if (r3 != 0) goto L_0x004b;	 Catch:{ all -> 0x006f }
    L_0x0043:
        r2 = r1.f6116f;	 Catch:{ all -> 0x006f }
        if (r2 != 0) goto L_0x0068;	 Catch:{ all -> 0x006f }
    L_0x0047:
        r2 = r1.f6118h;	 Catch:{ all -> 0x006f }
        if (r2 != r9) goto L_0x0068;	 Catch:{ all -> 0x006f }
    L_0x004b:
        com.google.android.gms.common.stats.C1779e.m4489a();	 Catch:{ all -> 0x006f }
        r3 = r1.f6115e;	 Catch:{ all -> 0x006f }
        r2 = r1.f6111a;	 Catch:{ all -> 0x006f }
        r4 = com.google.android.gms.common.stats.C1777c.m4488a(r2, r6);	 Catch:{ all -> 0x006f }
        r5 = r1.f6114d;	 Catch:{ all -> 0x006f }
        r7 = r1.f6113c;	 Catch:{ all -> 0x006f }
        r2 = r1.f6112b;	 Catch:{ all -> 0x006f }
        r8 = com.google.android.gms.common.util.C1799s.m4547a(r2);	 Catch:{ all -> 0x006f }
        com.google.android.gms.common.stats.C1779e.m4491a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x006f }
        r2 = r1.f6118h;	 Catch:{ all -> 0x006f }
        r2 = r2 - r9;	 Catch:{ all -> 0x006f }
        r1.f6118h = r2;	 Catch:{ all -> 0x006f }
    L_0x0068:
        monitor-exit(r1);	 Catch:{ all -> 0x006f }
        r1 = r1.f6111a;	 Catch:{ all -> 0x0074 }
        r1.release();	 Catch:{ all -> 0x0074 }
        goto L_0x0072;
    L_0x006f:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x006f }
        throw r2;	 Catch:{ all -> 0x0074 }
    L_0x0072:
        monitor-exit(r0);	 Catch:{ all -> 0x0074 }
        goto L_0x0077;	 Catch:{ all -> 0x0074 }
    L_0x0074:
        r1 = move-exception;	 Catch:{ all -> 0x0074 }
        monitor-exit(r0);	 Catch:{ all -> 0x0074 }
        throw r1;	 Catch:{ SecurityException -> 0x0077 }
    L_0x0077:
        r0 = r10.f5617b;
        r0 = com.google.android.gms.internal.C1827x.m5158a(r0);
        r0 = r0.m5160a();
        r1 = 2;
        if (r11 != 0) goto L_0x008a;
    L_0x0084:
        r11 = "AnalyticsService started with null intent";
        r0.m5153e(r11);
        return r1;
    L_0x008a:
        r11 = r11.getAction();
        r2 = "Local AnalyticsService called. startId, action";
        r3 = java.lang.Integer.valueOf(r12);
        r0.m5141a(r2, r3, r11);
        r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r11 = r0.equals(r11);
        if (r11 == 0) goto L_0x00a7;
    L_0x009f:
        r11 = java.lang.Integer.valueOf(r12);
        r12 = 0;
        r10.m4637a(r11, r12);
    L_0x00a7:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bw.a(android.content.Intent, int):int");
    }

    public final void m4636a() {
        C1827x.m5158a(this.f5617b).m5160a().m5143b("Local AnalyticsService is starting up");
    }

    public final void m4637a(Integer num, JobParameters jobParameters) {
        C1827x a = C1827x.m5158a(this.f5617b);
        a.m5162c().m16766a(new bx(this, num, a, a.m5160a(), jobParameters));
    }

    public final void m4638b() {
        C1827x.m5158a(this.f5617b).m5160a().m5143b("Local AnalyticsService is shutting down");
    }
}
