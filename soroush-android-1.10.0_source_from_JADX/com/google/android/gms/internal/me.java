package com.google.android.gms.internal;

import android.content.Context;
import com.google.firebase.crash.FirebaseCrash.C2058a;

public final class me extends mb {
    private final Throwable f15290c;
    private final ml f15291d;

    public me(Context context, C2058a c2058a, Throwable th, ml mlVar) {
        super(context, c2058a);
        this.f15290c = th;
        this.f15291d = mlVar;
    }

    protected final String mo1653a() {
        return "Failed to report uncaught exception";
    }

    protected final void mo1654a(com.google.android.gms.internal.mg r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f15291d;
        if (r0 == 0) goto L_0x001c;
    L_0x0004:
        r0 = r4.f15291d;
        r1 = 1;
        r2 = java.lang.System.currentTimeMillis();
        r0.m4998a(r1, r2);
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0014 }
        goto L_0x001c;
    L_0x0014:
        r5 = "FirebaseCrash";
        r0 = "Failed to wait for analytics event to be logged";
        android.util.Log.w(r5, r0);
        return;
    L_0x001c:
        r0 = r4.f15290c;
        r0 = com.google.android.gms.p158a.C6566m.m15848a(r0);
        r5.mo1661b(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.me.a(com.google.android.gms.internal.mg):void");
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
