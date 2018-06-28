package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.ac;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class C1688c {
    private static final Lock f5191a = new ReentrantLock();
    private static C1688c f5192b;
    private final Lock f5193c = new ReentrantLock();
    private final SharedPreferences f5194d;

    private C1688c(Context context) {
        this.f5194d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C1688c m4285a(Context context) {
        ac.m4376a((Object) context);
        f5191a.lock();
        try {
            if (f5192b == null) {
                f5192b = new C1688c(context.getApplicationContext());
            }
            C1688c c1688c = f5192b;
            return c1688c;
        } finally {
            f5191a.unlock();
        }
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount m4286a(java.lang.String r6) {
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
        r5 = this;
        r0 = android.text.TextUtils.isEmpty(r6);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "googleSignInAccount";
        r2 = ":";
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = java.lang.String.valueOf(r6);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r4.append(r0);
        r4.append(r2);
        r4.append(r6);
        r6 = r4.toString();
        r6 = r5.m4287b(r6);
        if (r6 == 0) goto L_0x0043;
    L_0x003e:
        r6 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.m15864a(r6);	 Catch:{ JSONException -> 0x0043 }
        return r6;
    L_0x0043:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.c.a(java.lang.String):com.google.android.gms.auth.api.signin.GoogleSignInAccount");
    }

    public final String m4287b(String str) {
        this.f5193c.lock();
        try {
            str = this.f5194d.getString(str, null);
            return str;
        } finally {
            this.f5193c.unlock();
        }
    }
}
