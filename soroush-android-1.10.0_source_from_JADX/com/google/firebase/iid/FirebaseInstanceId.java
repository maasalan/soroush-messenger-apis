package com.google.firebase.iid;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.p038g.C4813a;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.C2053a;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseInstanceId {
    private static final long f6936d = TimeUnit.HOURS.toSeconds(8);
    private static Map<String, FirebaseInstanceId> f6937e = new C4813a();
    private static C2079o f6938f;
    private static ScheduledThreadPoolExecutor f6939g;
    final C2053a f6940a;
    final C2078n f6941b;
    final String f6942c;
    private boolean f6943h = false;

    private FirebaseInstanceId(C2053a c2053a, C2078n c2078n) {
        this.f6940a = c2053a;
        this.f6941b = c2078n;
        String str = this.f6940a.m5598b().f6913c;
        if (str == null) {
            str = this.f6940a.m5598b().f6912b;
            if (str.startsWith("1:")) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    str = split[1];
                    if (str.isEmpty()) {
                    }
                }
                str = null;
            }
        }
        this.f6942c = str;
        if (this.f6942c == null) {
            throw new IllegalStateException("IID failing to initialize, FirebaseApp is missing project ID");
        }
        C2068d e = m5622e();
        if (e == null || e.m5652b(C2078n.f6994c) || f6938f.m5676a() != null) {
            m5619b();
        }
    }

    static int m5607a(Context context) {
        return m5608a(context, context.getPackageName());
    }

    static int m5608a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(23 + String.valueOf(valueOf).length());
            stringBuilder.append("Failed to find package ");
            stringBuilder.append(valueOf);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return 0;
        }
    }

    public static FirebaseInstanceId m5609a() {
        return getInstance(C2053a.m5590c());
    }

    static java.lang.String m5610a(java.security.KeyPair r4) {
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
        r4 = r4.getPublic();
        r4 = r4.getEncoded();
        r0 = "SHA1";	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r4 = r0.digest(r4);	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r0 = 0;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r1 = r4[r0];	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r3 = 15;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r1 = r1 & r3;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r2 = r2 + r1;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r1 = (byte) r2;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r4[r0] = r1;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r1 = 8;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r2 = 11;	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        r4 = android.util.Base64.encodeToString(r4, r0, r1, r2);	 Catch:{ NoSuchAlgorithmException -> 0x0027 }
        return r4;
    L_0x0027:
        r4 = "FirebaseInstanceId";
        r0 = "Unexpected error, device missing required algorithms";
        android.util.Log.w(r4, r0);
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a(java.security.KeyPair):java.lang.String");
    }

    static String m5611a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static void m5612a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f6939g == null) {
                f6939g = new ScheduledThreadPoolExecutor(1);
            }
            f6939g.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    static String m5613b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(38 + String.valueOf(valueOf).length());
            stringBuilder.append("Never happens: can't find own package ");
            stringBuilder.append(valueOf);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    static C2079o m5614f() {
        return f6938f;
    }

    static boolean m5615g() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            if (VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", 3)) {
                return false;
            }
        }
        return true;
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(C2053a c2053a) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) f6937e.get(c2053a.m5598b().f6912b);
            if (firebaseInstanceId == null) {
                C2078n a = C2078n.m5667a(c2053a.m5597a());
                if (f6938f == null) {
                    f6938f = new C2079o(C2078n.m5669b());
                }
                FirebaseInstanceId firebaseInstanceId2 = new FirebaseInstanceId(c2053a, a);
                f6937e.put(c2053a.m5598b().f6912b, firebaseInstanceId2);
                firebaseInstanceId = firebaseInstanceId2;
            }
        }
        return firebaseInstanceId;
    }

    final synchronized void m5616a(long j) {
        m5612a(new C2069e(this, Math.min(Math.max(30, j << 1), f6936d)), j);
        this.f6943h = true;
    }

    final void m5617a(Bundle bundle) {
        bundle.putString("gmp_app_id", this.f6940a.m5598b().f6912b);
    }

    final synchronized void m5618a(boolean z) {
        this.f6943h = z;
    }

    final synchronized void m5619b() {
        if (!this.f6943h) {
            m5616a(0);
        }
    }

    public final String m5620c() {
        return m5610a(this.f6941b.m5672a());
    }

    public final String m5621d() {
        C2068d e = m5622e();
        if (e == null || e.m5652b(C2078n.f6994c)) {
            m5619b();
        }
        return e != null ? e.f6963a : null;
    }

    final C2068d m5622e() {
        return C2078n.m5669b().m5641a("", this.f6942c, "*");
    }
}
