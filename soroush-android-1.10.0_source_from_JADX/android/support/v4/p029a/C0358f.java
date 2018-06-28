package android.support.v4.p029a;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class C0358f<Params, Progress, Result> {
    private static final ThreadFactory f1320a = new C03511();
    private static final BlockingQueue<Runnable> f1321b = new LinkedBlockingQueue(10);
    public static final Executor f1322c;
    private static C0355b f1323h;
    private static volatile Executor f1324i;
    final C0357d<Params, Result> f1325d = new C47652(this);
    final FutureTask<Result> f1326e = new FutureTask<Result>(this, this.f1325d) {
        final /* synthetic */ C0358f f1311a;

        protected final void done() {
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
            r3 = this;
            r0 = r3.get();	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            r1 = r3.f1311a;	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            r1.m714c(r0);	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            return;
        L_0x000a:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occurred while executing doInBackground()";
            r1.<init>(r2, r0);
            throw r1;
        L_0x0013:
            r0 = r3.f1311a;
            r1 = 0;
            r0.m714c(r1);
            return;
        L_0x001a:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occurred while executing doInBackground()";
            r0 = r0.getCause();
            r1.<init>(r2, r0);
            throw r1;
        L_0x0027:
            r0 = move-exception;
            r1 = "AsyncTask";
            android.util.Log.w(r1, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.f.3.done():void");
        }
    };
    volatile int f1327f = C0356c.f1315a;
    final AtomicBoolean f1328g = new AtomicBoolean();
    private final AtomicBoolean f1329j = new AtomicBoolean();

    static class C03511 implements ThreadFactory {
        private final AtomicInteger f1310a = new AtomicInteger(1);

        C03511() {
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder("ModernAsyncTask #");
            stringBuilder.append(this.f1310a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    static /* synthetic */ class C03534 {
        static final /* synthetic */ int[] f1312a = new int[C0356c.m706a().length];

        static {
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
            r0 = android.support.v4.p029a.C0358f.C0356c.m706a();
            r0 = r0.length;
            r0 = new int[r0];
            f1312a = r0;
            r0 = 1;
            r1 = f1312a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = android.support.v4.p029a.C0358f.C0356c.f1316b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f1312a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = android.support.v4.p029a.C0358f.C0356c.f1317c;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.f.4.<clinit>():void");
        }
    }

    private static class C0354a<Data> {
        final C0358f f1313a;
        final Data[] f1314b;

        C0354a(C0358f c0358f, Data... dataArr) {
            this.f1313a = c0358f;
            this.f1314b = dataArr;
        }
    }

    private static class C0355b extends Handler {
        public C0355b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C0354a c0354a = (C0354a) message.obj;
            switch (message.what) {
                case 1:
                    c0354a.f1313a.m716e(c0354a.f1314b[0]);
                    return;
                case 2:
                    C0358f.m709b();
                    return;
                default:
                    return;
            }
        }
    }

    public enum C0356c {
        ;
        
        public static final int f1315a = 1;
        public static final int f1316b = 2;
        public static final int f1317c = 3;

        static {
            f1318d = new int[]{f1315a, f1316b, f1317c};
        }

        public static int[] m706a() {
            return (int[]) f1318d.clone();
        }
    }

    private static abstract class C0357d<Params, Result> implements Callable<Result> {
        Params[] f1319b;

        C0357d() {
        }
    }

    class C47652 extends C0357d<Params, Result> {
        final /* synthetic */ C0358f f13169a;

        C47652(C0358f c0358f) {
            this.f13169a = c0358f;
        }

        public final Result call() {
            Throwable th;
            Throwable th2;
            this.f13169a.f1329j.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Result a = this.f13169a.mo215a();
                try {
                    Binder.flushPendingCommands();
                    this.f13169a.m715d(a);
                    return a;
                } catch (Throwable th3) {
                    th2 = th3;
                    obj = a;
                    this.f13169a.m715d(obj);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                this.f13169a.f1328g.set(true);
                throw th;
            }
        }
    }

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f1321b, f1320a);
        f1322c = threadPoolExecutor;
        f1324i = threadPoolExecutor;
    }

    protected static void m709b() {
    }

    private static Handler m710c() {
        Handler handler;
        synchronized (C0358f.class) {
            if (f1323h == null) {
                f1323h = new C0355b();
            }
            handler = f1323h;
        }
        return handler;
    }

    protected abstract Result mo215a();

    protected void mo216a(Result result) {
    }

    protected void mo217b(Result result) {
    }

    final void m714c(Result result) {
        if (!this.f1329j.get()) {
            m715d(result);
        }
    }

    final Result m715d(Result result) {
        C0358f.m710c().obtainMessage(1, new C0354a(this, result)).sendToTarget();
        return result;
    }

    final void m716e(Result result) {
        if (this.f1328g.get()) {
            mo217b((Object) result);
        } else {
            mo216a((Object) result);
        }
        this.f1327f = C0356c.f1317c;
    }
}
