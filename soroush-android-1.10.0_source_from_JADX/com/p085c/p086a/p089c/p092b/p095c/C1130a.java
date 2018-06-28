package com.p085c.p086a.p089c.p092b.p095c;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class C1130a extends ThreadPoolExecutor {
    private static final long f3642b = TimeUnit.SECONDS.toMillis(10);
    private final boolean f3643a;

    private static final class C1128a implements ThreadFactory {
        final C1129b f3633a;
        final boolean f3634b;
        private final String f3635c;
        private int f3636d;

        C1128a(String str, C1129b c1129b, boolean z) {
            this.f3635c = str;
            this.f3633a = c1129b;
            this.f3634b = z;
        }

        public final synchronized Thread newThread(Runnable runnable) {
            Thread c11271;
            StringBuilder stringBuilder = new StringBuilder("glide-");
            stringBuilder.append(this.f3635c);
            stringBuilder.append("-thread-");
            stringBuilder.append(this.f3636d);
            c11271 = new Thread(this, runnable, stringBuilder.toString()) {
                final /* synthetic */ C1128a f3632a;

                public final void run() {
                    Process.setThreadPriority(9);
                    if (this.f3632a.f3634b) {
                        StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        this.f3632a.f3633a.mo1161a(th);
                    }
                }
            };
            this.f3636d++;
            return c11271;
        }
    }

    public enum C1129b {
        IGNORE;
        
        public static final C1129b f3640d = null;

        static {
            f3640d = f3638b;
        }

        protected void mo1161a(Throwable th) {
        }
    }

    private C1130a(int i, int i2, long j, String str, C1129b c1129b, boolean z, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, TimeUnit.MILLISECONDS, blockingQueue, new C1128a(str, c1129b, z));
        this.f3643a = false;
    }

    private C1130a(int i, int i2, String str, C1129b c1129b, boolean z) {
        this(i, i2, 0, str, c1129b, z, new PriorityBlockingQueue());
    }

    private C1130a(int i, String str, C1129b c1129b, boolean z) {
        this(i, i, str, c1129b, z);
    }

    public static C1130a m2727a() {
        return new C1130a(1, "disk-cache", C1129b.f3640d, true);
    }

    private <T> java.util.concurrent.Future<T> m2728a(java.util.concurrent.Future<T> r3) {
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
        r2 = this;
        r0 = r2.f3643a;
        if (r0 == 0) goto L_0x002d;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        r1 = r3.isDone();	 Catch:{ all -> 0x0022 }
        if (r1 != 0) goto L_0x0018;
    L_0x000b:
        r3.get();	 Catch:{ ExecutionException -> 0x0011, InterruptedException -> 0x000f }
        goto L_0x0005;
    L_0x000f:
        r0 = 1;
        goto L_0x0005;
    L_0x0011:
        r3 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0022 }
        r1.<init>(r3);	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0022 }
    L_0x0018:
        if (r0 == 0) goto L_0x002d;
    L_0x001a:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return r3;
    L_0x0022:
        r3 = move-exception;
        if (r0 == 0) goto L_0x002c;
    L_0x0025:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x002c:
        throw r3;
    L_0x002d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.b.c.a.a(java.util.concurrent.Future):java.util.concurrent.Future<T>");
    }

    public static C1130a m2729b() {
        return new C1130a(C1130a.m2731d(), "source", C1129b.f3640d, false);
    }

    public static C1130a m2730c() {
        return new C1130a(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, f3642b, "source-unlimited", C1129b.f3640d, false, new SynchronousQueue());
    }

    private static int m2731d() {
        File[] listFiles;
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File file = new File("/sys/devices/system/cpu/");
            final Pattern compile = Pattern.compile("cpu[0-9]+");
            listFiles = file.listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return compile.matcher(str).matches();
                }
            });
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        return Math.min(4, Math.max(Math.max(1, Runtime.getRuntime().availableProcessors()), listFiles != null ? listFiles.length : 0));
    }

    public final void execute(Runnable runnable) {
        if (this.f3643a) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }

    public final Future<?> submit(Runnable runnable) {
        return m2728a(super.submit(runnable));
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return m2728a(super.submit(runnable, t));
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return m2728a(super.submit(callable));
    }
}
