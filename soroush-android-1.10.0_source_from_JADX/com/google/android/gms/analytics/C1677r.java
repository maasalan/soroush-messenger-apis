package com.google.android.gms.analytics;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.C5492a;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class C1677r {
    private static volatile C1677r f5163d;
    public final Context f5164a;
    public final C1674a f5165b = new C1674a(this);
    public UncaughtExceptionHandler f5166c;
    private final List<Object> f5167e = new CopyOnWriteArrayList();
    private final C5438m f5168f = new C5438m();
    private volatile C5492a f5169g;

    class C1674a extends ThreadPoolExecutor {
        final /* synthetic */ C1677r f5161a;

        public C1674a(C1677r c1677r) {
            this.f5161a = c1677r;
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new C1675b());
            allowCoreThreadTimeOut(true);
        }

        protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new C1679t(this, runnable, t);
        }
    }

    static class C1675b implements ThreadFactory {
        private static final AtomicInteger f5162a = new AtomicInteger();

        private C1675b() {
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = f5162a.incrementAndGet();
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append("measurement-");
            stringBuilder.append(incrementAndGet);
            return new C1676c(runnable, stringBuilder.toString());
        }
    }

    static class C1676c extends Thread {
        C1676c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    private C1677r(Context context) {
        Object applicationContext = context.getApplicationContext();
        ac.m4376a(applicationContext);
        this.f5164a = applicationContext;
    }

    public static C1677r m4271a(Context context) {
        ac.m4376a((Object) context);
        if (f5163d == null) {
            synchronized (C1677r.class) {
                if (f5163d == null) {
                    f5163d = new C1677r(context);
                }
            }
        }
        return f5163d;
    }

    static /* synthetic */ void m4273a(C1671o c1671o) {
        ac.m4387c("deliver should be called from worker thread");
        ac.m4386b(c1671o.f5149c, "Measurement must be submitted");
        List<C1680u> list = c1671o.f5155i;
        if (!list.isEmpty()) {
            Set hashSet = new HashSet();
            for (C1680u c1680u : list) {
                Uri a = c1680u.mo1537a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    c1680u.mo1538a(c1671o);
                }
            }
        }
    }

    public static void m4275b() {
        if (!(Thread.currentThread() instanceof C1676c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final com.google.android.gms.internal.C5492a m4276a() {
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
        r7 = this;
        r0 = r7.f5169g;
        if (r0 != 0) goto L_0x006c;
    L_0x0004:
        monitor-enter(r7);
        r0 = r7.f5169g;	 Catch:{ all -> 0x0069 }
        if (r0 != 0) goto L_0x0067;	 Catch:{ all -> 0x0069 }
    L_0x0009:
        r0 = new com.google.android.gms.internal.a;	 Catch:{ all -> 0x0069 }
        r0.<init>();	 Catch:{ all -> 0x0069 }
        r1 = r7.f5164a;	 Catch:{ all -> 0x0069 }
        r1 = r1.getPackageManager();	 Catch:{ all -> 0x0069 }
        r2 = r7.f5164a;	 Catch:{ all -> 0x0069 }
        r2 = r2.getPackageName();	 Catch:{ all -> 0x0069 }
        r0.f15174c = r2;	 Catch:{ all -> 0x0069 }
        r3 = r1.getInstallerPackageName(r2);	 Catch:{ all -> 0x0069 }
        r0.f15175d = r3;	 Catch:{ all -> 0x0069 }
        r3 = 0;
        r4 = r7.f5164a;	 Catch:{ NameNotFoundException -> 0x0045 }
        r4 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x0045 }
        r5 = 0;	 Catch:{ NameNotFoundException -> 0x0045 }
        r4 = r1.getPackageInfo(r4, r5);	 Catch:{ NameNotFoundException -> 0x0045 }
        if (r4 == 0) goto L_0x0061;	 Catch:{ NameNotFoundException -> 0x0045 }
    L_0x0030:
        r5 = r4.applicationInfo;	 Catch:{ NameNotFoundException -> 0x0045 }
        r1 = r1.getApplicationLabel(r5);	 Catch:{ NameNotFoundException -> 0x0045 }
        r5 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NameNotFoundException -> 0x0045 }
        if (r5 != 0) goto L_0x0041;	 Catch:{ NameNotFoundException -> 0x0045 }
    L_0x003c:
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0045 }
        r2 = r1;	 Catch:{ NameNotFoundException -> 0x0045 }
    L_0x0041:
        r1 = r4.versionName;	 Catch:{ NameNotFoundException -> 0x0045 }
        r3 = r1;
        goto L_0x0061;
    L_0x0045:
        r1 = "GAv4";	 Catch:{ all -> 0x0069 }
        r4 = "Error retrieving package info: appName set to ";	 Catch:{ all -> 0x0069 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0069 }
        r6 = r5.length();	 Catch:{ all -> 0x0069 }
        if (r6 == 0) goto L_0x0058;	 Catch:{ all -> 0x0069 }
    L_0x0053:
        r4 = r4.concat(r5);	 Catch:{ all -> 0x0069 }
        goto L_0x005e;	 Catch:{ all -> 0x0069 }
    L_0x0058:
        r5 = new java.lang.String;	 Catch:{ all -> 0x0069 }
        r5.<init>(r4);	 Catch:{ all -> 0x0069 }
        r4 = r5;	 Catch:{ all -> 0x0069 }
    L_0x005e:
        android.util.Log.e(r1, r4);	 Catch:{ all -> 0x0069 }
    L_0x0061:
        r0.f15172a = r2;	 Catch:{ all -> 0x0069 }
        r0.f15173b = r3;	 Catch:{ all -> 0x0069 }
        r7.f5169g = r0;	 Catch:{ all -> 0x0069 }
    L_0x0067:
        monitor-exit(r7);	 Catch:{ all -> 0x0069 }
        goto L_0x006c;	 Catch:{ all -> 0x0069 }
    L_0x0069:
        r0 = move-exception;	 Catch:{ all -> 0x0069 }
        monitor-exit(r7);	 Catch:{ all -> 0x0069 }
        throw r0;
    L_0x006c:
        r0 = r7.f5169g;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.r.a():com.google.android.gms.internal.a");
    }

    public final <V> Future<V> m4277a(Callable<V> callable) {
        ac.m4376a((Object) callable);
        if (!(Thread.currentThread() instanceof C1676c)) {
            return this.f5165b.submit(callable);
        }
        Future futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void m4278a(Runnable runnable) {
        ac.m4376a((Object) runnable);
        this.f5165b.submit(runnable);
    }
}
