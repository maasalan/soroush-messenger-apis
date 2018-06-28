package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.common.C1749h;
import com.google.android.gms.common.C1780t;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.nw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class AdvertisingIdClient {
    private C1749h f5115a;
    private nw f5116b;
    private boolean f5117c;
    private Object f5118d = new Object();
    private C1651a f5119e;
    private final Context f5120f;
    private boolean f5121g;
    private long f5122h;

    public static final class Info {
        private final String f5109a;
        private final boolean f5110b;

        public Info(String str, boolean z) {
            this.f5109a = str;
            this.f5110b = z;
        }

        public final String getId() {
            return this.f5109a;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.f5110b;
        }

        public final String toString() {
            String str = this.f5109a;
            boolean z = this.f5110b;
            StringBuilder stringBuilder = new StringBuilder(7 + String.valueOf(str).length());
            stringBuilder.append("{");
            stringBuilder.append(str);
            stringBuilder.append("}");
            stringBuilder.append(z);
            return stringBuilder.toString();
        }
    }

    static class C1651a extends Thread {
        CountDownLatch f5111a = new CountDownLatch(1);
        boolean f5112b = false;
        private WeakReference<AdvertisingIdClient> f5113c;
        private long f5114d;

        public C1651a(AdvertisingIdClient advertisingIdClient, long j) {
            this.f5113c = new WeakReference(advertisingIdClient);
            this.f5114d = j;
            start();
        }

        private final void m4235a() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f5113c.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.m4241a();
                this.f5112b = true;
            }
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r4 = this;
            r0 = r4.f5111a;	 Catch:{ InterruptedException -> 0x0010 }
            r1 = r4.f5114d;	 Catch:{ InterruptedException -> 0x0010 }
            r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0010 }
            r0 = r0.await(r1, r3);	 Catch:{ InterruptedException -> 0x0010 }
            if (r0 != 0) goto L_0x000f;	 Catch:{ InterruptedException -> 0x0010 }
        L_0x000c:
            r4.m4235a();	 Catch:{ InterruptedException -> 0x0010 }
        L_0x000f:
            return;
        L_0x0010:
            r4.m4235a();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.a.run():void");
        }
    }

    private AdvertisingIdClient(Context context, boolean z, boolean z2) {
        ac.m4376a((Object) context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.f5120f = context;
        this.f5117c = false;
        this.f5122h = -1;
        this.f5121g = z2;
    }

    private static com.google.android.gms.common.C1749h m4236a(android.content.Context r3, boolean r4) {
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
        r0 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x004f }
        r1 = "com.android.vending";	 Catch:{ NameNotFoundException -> 0x004f }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x004f }
        r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x004f }
        r0 = com.google.android.gms.common.C1771k.m4473b();
        r0 = r0.mo1557a(r3);
        if (r0 == 0) goto L_0x001f;
    L_0x0014:
        r1 = 2;
        if (r0 == r1) goto L_0x001f;
    L_0x0017:
        r3 = new java.io.IOException;
        r4 = "Google Play services not available";
        r3.<init>(r4);
        throw r3;
    L_0x001f:
        if (r4 == 0) goto L_0x0024;
    L_0x0021:
        r4 = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
        goto L_0x0026;
    L_0x0024:
        r4 = "com.google.android.gms.ads.identifier.service.START";
    L_0x0026:
        r0 = new com.google.android.gms.common.h;
        r0.<init>();
        r1 = new android.content.Intent;
        r1.<init>(r4);
        r4 = "com.google.android.gms";
        r1.setPackage(r4);
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ Throwable -> 0x0048 }
        r4 = 1;	 Catch:{ Throwable -> 0x0048 }
        r3 = com.google.android.gms.common.stats.C1775a.m4487b(r3, r1, r0, r4);	 Catch:{ Throwable -> 0x0048 }
        if (r3 == 0) goto L_0x0040;
    L_0x003f:
        return r0;
    L_0x0040:
        r3 = new java.io.IOException;
        r4 = "Connection failure";
        r3.<init>(r4);
        throw r3;
    L_0x0048:
        r3 = move-exception;
        r4 = new java.io.IOException;
        r4.<init>(r3);
        throw r4;
    L_0x004f:
        r3 = new com.google.android.gms.common.c;
        r4 = 9;
        r3.<init>(r4);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.a(android.content.Context, boolean):com.google.android.gms.common.h");
    }

    private static com.google.android.gms.internal.nw m4237a(com.google.android.gms.common.C1749h r3) {
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
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r1 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread";	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        com.google.android.gms.common.internal.ac.m4387c(r1);	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r1 = r3.f5312a;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        if (r1 == 0) goto L_0x0013;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
    L_0x000b:
        r3 = new java.lang.IllegalStateException;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r0 = "Cannot call get on this connection more than once";	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r3.<init>(r0);	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        throw r3;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
    L_0x0013:
        r1 = 1;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r3.f5312a = r1;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r3 = r3.f5313b;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r3 = r3.poll(r1, r0);	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r3 = (android.os.IBinder) r3;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        if (r3 != 0) goto L_0x002a;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
    L_0x0022:
        r3 = new java.util.concurrent.TimeoutException;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r0 = "Timed out waiting for the service connection";	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        r3.<init>(r0);	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        throw r3;	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
    L_0x002a:
        r3 = com.google.android.gms.internal.nx.m12028a(r3);	 Catch:{ InterruptedException -> 0x0036, Throwable -> 0x002f }
        return r3;
    L_0x002f:
        r3 = move-exception;
        r0 = new java.io.IOException;
        r0.<init>(r3);
        throw r0;
    L_0x0036:
        r3 = new java.io.IOException;
        r0 = "Interrupted exception";
        r3.<init>(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.a(com.google.android.gms.common.h):com.google.android.gms.internal.nw");
    }

    private static boolean m4238a(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        Map hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (info != null) {
            hashMap.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (!(str == null || str.isEmpty())) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C1652a(hashMap).start();
        return true;
    }

    private final void m4239b() {
        ac.m4387c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5117c) {
                m4241a();
            }
            this.f5115a = m4236a(this.f5120f, this.f5121g);
            this.f5116b = m4237a(this.f5115a);
            this.f5117c = true;
        }
    }

    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info m4240c() {
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
        r7 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        com.google.android.gms.common.internal.ac.m4387c(r0);
        monitor-enter(r7);
        r0 = r7.f5117c;	 Catch:{ all -> 0x0091 }
        if (r0 != 0) goto L_0x003c;	 Catch:{ all -> 0x0091 }
    L_0x000a:
        r0 = r7.f5118d;	 Catch:{ all -> 0x0091 }
        monitor-enter(r0);	 Catch:{ all -> 0x0091 }
        r1 = r7.f5119e;	 Catch:{ all -> 0x0039 }
        if (r1 == 0) goto L_0x0031;	 Catch:{ all -> 0x0039 }
    L_0x0011:
        r1 = r7.f5119e;	 Catch:{ all -> 0x0039 }
        r1 = r1.f5112b;	 Catch:{ all -> 0x0039 }
        if (r1 != 0) goto L_0x0018;	 Catch:{ all -> 0x0039 }
    L_0x0017:
        goto L_0x0031;	 Catch:{ all -> 0x0039 }
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        r7.m4239b();	 Catch:{ Exception -> 0x0028 }
        r0 = r7.f5117c;	 Catch:{ all -> 0x0091 }
        if (r0 != 0) goto L_0x003c;	 Catch:{ all -> 0x0091 }
    L_0x0020:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0091 }
        r1 = "AdvertisingIdClient cannot reconnect.";	 Catch:{ all -> 0x0091 }
        r0.<init>(r1);	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x0028:
        r0 = move-exception;	 Catch:{ all -> 0x0091 }
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0091 }
        r2 = "AdvertisingIdClient cannot reconnect.";	 Catch:{ all -> 0x0091 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0091 }
        throw r1;	 Catch:{ all -> 0x0091 }
    L_0x0031:
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0039 }
        r2 = "AdvertisingIdClient is not connected.";	 Catch:{ all -> 0x0039 }
        r1.<init>(r2);	 Catch:{ all -> 0x0039 }
        throw r1;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r1 = move-exception;	 Catch:{ all -> 0x0039 }
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        throw r1;	 Catch:{ all -> 0x0091 }
    L_0x003c:
        r0 = r7.f5115a;	 Catch:{ all -> 0x0091 }
        com.google.android.gms.common.internal.ac.m4376a(r0);	 Catch:{ all -> 0x0091 }
        r0 = r7.f5116b;	 Catch:{ all -> 0x0091 }
        com.google.android.gms.common.internal.ac.m4376a(r0);	 Catch:{ all -> 0x0091 }
        r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;	 Catch:{ RemoteException -> 0x0081 }
        r1 = r7.f5116b;	 Catch:{ RemoteException -> 0x0081 }
        r1 = r1.mo1665a();	 Catch:{ RemoteException -> 0x0081 }
        r2 = r7.f5116b;	 Catch:{ RemoteException -> 0x0081 }
        r2 = r2.mo1666b();	 Catch:{ RemoteException -> 0x0081 }
        r0.<init>(r1, r2);	 Catch:{ RemoteException -> 0x0081 }
        monitor-exit(r7);	 Catch:{ all -> 0x0091 }
        r1 = r7.f5118d;
        monitor-enter(r1);
        r2 = r7.f5119e;	 Catch:{ all -> 0x007e }
        if (r2 == 0) goto L_0x006b;	 Catch:{ all -> 0x007e }
    L_0x005f:
        r2 = r7.f5119e;	 Catch:{ all -> 0x007e }
        r2 = r2.f5111a;	 Catch:{ all -> 0x007e }
        r2.countDown();	 Catch:{ all -> 0x007e }
        r2 = r7.f5119e;	 Catch:{ InterruptedException -> 0x006b }
        r2.join();	 Catch:{ InterruptedException -> 0x006b }
    L_0x006b:
        r2 = r7.f5122h;	 Catch:{ all -> 0x007e }
        r4 = 0;	 Catch:{ all -> 0x007e }
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x007e }
        if (r6 <= 0) goto L_0x007c;	 Catch:{ all -> 0x007e }
    L_0x0073:
        r2 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$a;	 Catch:{ all -> 0x007e }
        r3 = r7.f5122h;	 Catch:{ all -> 0x007e }
        r2.<init>(r7, r3);	 Catch:{ all -> 0x007e }
        r7.f5119e = r2;	 Catch:{ all -> 0x007e }
    L_0x007c:
        monitor-exit(r1);	 Catch:{ all -> 0x007e }
        return r0;	 Catch:{ all -> 0x007e }
    L_0x007e:
        r0 = move-exception;	 Catch:{ all -> 0x007e }
        monitor-exit(r1);	 Catch:{ all -> 0x007e }
        throw r0;
    L_0x0081:
        r0 = move-exception;
        r1 = "AdvertisingIdClient";	 Catch:{ all -> 0x0091 }
        r2 = "GMS remote exception ";	 Catch:{ all -> 0x0091 }
        android.util.Log.i(r1, r2, r0);	 Catch:{ all -> 0x0091 }
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0091 }
        r1 = "Remote exception";	 Catch:{ all -> 0x0091 }
        r0.<init>(r1);	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x0091:
        r0 = move-exception;	 Catch:{ all -> 0x0091 }
        monitor-exit(r7);	 Catch:{ all -> 0x0091 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.c():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public static Info getAdvertisingIdInfo(Context context) {
        C1655d c1655d = new C1655d(context);
        boolean a = c1655d.m4245a("gads:ad_id_app_context:enabled");
        float b = c1655d.m4246b("gads:ad_id_app_context:ping_ratio");
        boolean a2 = c1655d.m4245a("gads:ad_id_use_shared_preference:enabled");
        String a3 = c1655d.m4244a("gads:ad_id_use_shared_preference:experiment_id", "");
        boolean a4 = c1655d.m4245a("com.google.android.gms.ads.identifier.service.PERSISTENT_START");
        if (a2) {
            C1653b a5 = C1653b.m4242a(context);
            Context h = C1780t.m4501h(a5.f5125a);
            Info info = null;
            if (h != null) {
                SharedPreferences sharedPreferences = h.getSharedPreferences("adid_settings", 0);
                if (sharedPreferences != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (sharedPreferences.contains("adid_key")) {
                        if (sharedPreferences.contains("enable_limit_ad_tracking")) {
                            info = new Info(sharedPreferences.getString("adid_key", ""), sharedPreferences.getBoolean("enable_limit_ad_tracking", false));
                        }
                    }
                    a5.m4243a(info, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                    if (info != null) {
                        return info;
                    }
                }
            }
            a5.m4243a(null, false, -1);
            if (info != null) {
                return info;
            }
        }
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, a, a4);
        try {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            advertisingIdClient.m4239b();
            Info c = advertisingIdClient.m4240c();
            m4238a(c, a, b, SystemClock.elapsedRealtime() - elapsedRealtime2, a3, null);
            advertisingIdClient.m4241a();
            return c;
        } catch (Throwable th) {
            advertisingIdClient.m4241a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4241a() {
        /*
        r3 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        com.google.android.gms.common.internal.ac.m4387c(r0);
        monitor-enter(r3);
        r0 = r3.f5120f;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0030;
    L_0x000a:
        r0 = r3.f5115a;	 Catch:{ all -> 0x0032 }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0030;
    L_0x000f:
        r0 = r3.f5117c;	 Catch:{ Throwable -> 0x001e }
        if (r0 == 0) goto L_0x0026;
    L_0x0013:
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ Throwable -> 0x001e }
        r0 = r3.f5120f;	 Catch:{ Throwable -> 0x001e }
        r1 = r3.f5115a;	 Catch:{ Throwable -> 0x001e }
        r0.unbindService(r1);	 Catch:{ Throwable -> 0x001e }
        goto L_0x0026;
    L_0x001e:
        r0 = move-exception;
        r1 = "AdvertisingIdClient";
        r2 = "AdvertisingIdClient unbindService failed.";
        android.util.Log.i(r1, r2, r0);	 Catch:{ all -> 0x0032 }
    L_0x0026:
        r0 = 0;
        r3.f5117c = r0;	 Catch:{ all -> 0x0032 }
        r0 = 0;
        r3.f5116b = r0;	 Catch:{ all -> 0x0032 }
        r3.f5115a = r0;	 Catch:{ all -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0030:
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.a():void");
    }

    protected void finalize() {
        m4241a();
        super.finalize();
    }
}
