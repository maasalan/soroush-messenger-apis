package mobi.mmdt.ott.provider.p380b;

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

abstract class C2951b<Params, Progress, Result> {
    private static final ThreadFactory f9169a = new C29441();
    private static final BlockingQueue<Runnable> f9170b = new LinkedBlockingQueue(10);
    public static final Executor f9171c;
    private static C2948b f9172g;
    private static volatile Executor f9173h;
    final C2950d<Params, Result> f9174d = new C60122(this);
    final FutureTask<Result> f9175e = new FutureTask<Result>(this, this.f9174d) {
        final /* synthetic */ C2951b f9160a;

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
            r1 = r3.f9160a;	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            mobi.mmdt.ott.provider.p380b.C2951b.m7341b(r1, r0);	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            return;
        L_0x000a:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occurred while executing doInBackground()";
            r1.<init>(r2, r0);
            throw r1;
        L_0x0013:
            r0 = r3.f9160a;
            r1 = 0;
            mobi.mmdt.ott.provider.p380b.C2951b.m7341b(r0, r1);
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
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.provider.b.b.3.done():void");
        }
    };
    volatile int f9176f = C2949c.f9164a;
    private final AtomicBoolean f9177i = new AtomicBoolean();

    static class C29441 implements ThreadFactory {
        private final AtomicInteger f9159a = new AtomicInteger(1);

        C29441() {
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder("ModernAsyncTask #");
            stringBuilder.append(this.f9159a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    static /* synthetic */ class C29464 {
        static final /* synthetic */ int[] f9161a = new int[C2949c.m7337a().length];

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
            r0 = mobi.mmdt.ott.provider.p380b.C2951b.C2949c.m7337a();
            r0 = r0.length;
            r0 = new int[r0];
            f9161a = r0;
            r0 = 1;
            r1 = f9161a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.provider.p380b.C2951b.C2949c.f9165b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f9161a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.provider.p380b.C2951b.C2949c.f9166c;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.provider.b.b.4.<clinit>():void");
        }
    }

    private static class C2947a<Data> {
        final C2951b f9162a;
        final Data[] f9163b;

        C2947a(C2951b c2951b, Data... dataArr) {
            this.f9162a = c2951b;
            this.f9163b = dataArr;
        }
    }

    private static class C2948b extends Handler {
        public C2948b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C2947a c2947a = (C2947a) message.obj;
            switch (message.what) {
                case 1:
                    C2951b.m7344c(c2947a.f9162a, c2947a.f9163b[0]);
                    return;
                case 2:
                    C2951b.m7340b();
                    return;
                default:
                    return;
            }
        }
    }

    public enum C2949c {
        ;
        
        public static final int f9164a = 1;
        public static final int f9165b = 2;
        public static final int f9166c = 3;

        static {
            f9167d = new int[]{f9164a, f9165b, f9166c};
        }

        public static int[] m7337a() {
            return (int[]) f9167d.clone();
        }
    }

    private static abstract class C2950d<Params, Result> implements Callable<Result> {
        Params[] f9168b;

        private C2950d() {
        }
    }

    class C60122 extends C2950d<Params, Result> {
        final /* synthetic */ C2951b f16184a;

        C60122(C2951b c2951b) {
            this.f16184a = c2951b;
            super();
        }

        public final Result call() {
            this.f16184a.f9177i.set(true);
            Process.setThreadPriority(10);
            return this.f16184a.m7343c(this.f16184a.mo2220a());
        }
    }

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f9170b, f9169a);
        f9171c = threadPoolExecutor;
        f9173h = threadPoolExecutor;
    }

    protected static void m7340b() {
    }

    static /* synthetic */ void m7341b(C2951b c2951b, Object obj) {
        if (!c2951b.f9177i.get()) {
            c2951b.m7343c(obj);
        }
    }

    private static Handler m7342c() {
        Handler handler;
        synchronized (C2951b.class) {
            if (f9172g == null) {
                f9172g = new C2948b();
            }
            handler = f9172g;
        }
        return handler;
    }

    private Result m7343c(Result result) {
        C2951b.m7342c().obtainMessage(1, new C2947a(this, result)).sendToTarget();
        return result;
    }

    static /* synthetic */ void m7344c(C2951b c2951b, Object obj) {
        if (c2951b.f9175e.isCancelled()) {
            c2951b.mo2222b(obj);
        } else {
            c2951b.mo2221a(obj);
        }
        c2951b.f9176f = C2949c.f9166c;
    }

    protected abstract Result mo2220a();

    protected void mo2221a(Result result) {
    }

    protected void mo2222b(Result result) {
    }
}
