package com.felipecsl.asymmetricgridview.library;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.util.ArrayDeque;
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

public abstract class C1597b<Params, Progress, Result> {
    public static final Executor f4942a = new ThreadPoolExecutor(f4945h, f4946i, 1, TimeUnit.SECONDS, f4948k, f4947j);
    public static final Executor f4943b = new C1594c();
    private static final int f4944g;
    private static final int f4945h;
    private static final int f4946i = ((f4944g * 2) + 1);
    private static final ThreadFactory f4947j = new C15881();
    private static final BlockingQueue<Runnable> f4948k = new LinkedBlockingQueue(128);
    private static final C1592b f4949l = new C1592b();
    private static volatile Executor f4950m = f4943b;
    public final C1596e<Params, Result> f4951c = new C53932(this);
    public final FutureTask<Result> f4952d = new FutureTask<Result>(this, this.f4951c) {
        final /* synthetic */ C1597b f4929a;

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
            r0 = r3.f4929a;	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            r1 = r3.get();	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            com.felipecsl.asymmetricgridview.library.C1597b.m4126b(r0, r1);	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            return;
        L_0x000a:
            r0 = r3.f4929a;
            r1 = 0;
            com.felipecsl.asymmetricgridview.library.C1597b.m4126b(r0, r1);
            return;
        L_0x0011:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occured while executing doInBackground()";
            r0 = r0.getCause();
            r1.<init>(r2, r0);
            throw r1;
        L_0x001e:
            r0 = move-exception;
            r1 = "AsyncTaskCompat";
            android.util.Log.w(r1, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.felipecsl.asymmetricgridview.library.b.3.done():void");
        }
    };
    public volatile int f4953e = C1595d.f4937a;
    public final AtomicBoolean f4954f = new AtomicBoolean();
    private final AtomicBoolean f4955n = new AtomicBoolean();

    static class C15881 implements ThreadFactory {
        private final AtomicInteger f4928a = new AtomicInteger(1);

        C15881() {
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder("AsyncTaskCompat #");
            stringBuilder.append(this.f4928a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    static /* synthetic */ class C15904 {
        public static final /* synthetic */ int[] f4930a = new int[C1595d.m4121a().length];

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
            r0 = com.felipecsl.asymmetricgridview.library.C1597b.C1595d.m4121a();
            r0 = r0.length;
            r0 = new int[r0];
            f4930a = r0;
            r0 = 1;
            r1 = f4930a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = com.felipecsl.asymmetricgridview.library.C1597b.C1595d.f4938b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f4930a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = com.felipecsl.asymmetricgridview.library.C1597b.C1595d.f4939c;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.felipecsl.asymmetricgridview.library.b.4.<clinit>():void");
        }
    }

    private static class C1591a<Data> {
        final C1597b f4931a;
        final Data[] f4932b;

        C1591a(C1597b c1597b, Data... dataArr) {
            this.f4931a = c1597b;
            this.f4932b = dataArr;
        }
    }

    private static class C1592b extends Handler {
        private C1592b() {
        }

        public final void handleMessage(Message message) {
            C1591a c1591a = (C1591a) message.obj;
            switch (message.what) {
                case 1:
                    C1597b.m4127c(c1591a.f4931a, c1591a.f4932b[0]);
                    return;
                case 2:
                    C1597b.m4124a();
                    return;
                default:
                    return;
            }
        }
    }

    @TargetApi(9)
    private static class C1594c implements Executor {
        final ArrayDeque<Runnable> f4935a;
        Runnable f4936b;

        private C1594c() {
            this.f4935a = new ArrayDeque();
        }

        protected final synchronized void m4120a() {
            Runnable runnable = (Runnable) this.f4935a.poll();
            this.f4936b = runnable;
            if (runnable != null) {
                C1597b.f4942a.execute(this.f4936b);
            }
        }

        public final synchronized void execute(final Runnable runnable) {
            this.f4935a.offer(new Runnable(this) {
                final /* synthetic */ C1594c f4934b;

                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        this.f4934b.m4120a();
                    }
                }
            });
            if (this.f4936b == null) {
                m4120a();
            }
        }
    }

    public enum C1595d {
        ;
        
        public static final int f4937a = 1;
        public static final int f4938b = 2;
        public static final int f4939c = 3;

        static {
            f4940d = new int[]{f4937a, f4938b, f4939c};
        }

        public static int[] m4121a() {
            return (int[]) f4940d.clone();
        }
    }

    private static abstract class C1596e<Params, Result> implements Callable<Result> {
        public Params[] f4941b;

        private C1596e() {
        }
    }

    class C53932 extends C1596e<Params, Result> {
        final /* synthetic */ C1597b f15009a;

        C53932(C1597b c1597b) {
            this.f15009a = c1597b;
            super();
        }

        public final Result call() {
            this.f15009a.f4955n.set(true);
            Process.setThreadPriority(10);
            return this.f15009a.m4125b(this.f15009a.mo1501a(this.b));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f4944g = availableProcessors;
        f4945h = availableProcessors + 1;
    }

    protected static void m4124a() {
    }

    private Result m4125b(Result result) {
        f4949l.obtainMessage(1, new C1591a(this, result)).sendToTarget();
        return result;
    }

    static /* synthetic */ void m4126b(C1597b c1597b, Object obj) {
        if (!c1597b.f4955n.get()) {
            c1597b.m4125b(obj);
        }
    }

    static /* synthetic */ void m4127c(C1597b c1597b, Object obj) {
        if (!c1597b.f4954f.get()) {
            c1597b.mo1502a(obj);
        }
        c1597b.f4953e = C1595d.f4939c;
    }

    public abstract Result mo1501a(Params... paramsArr);

    public void mo1502a(Result result) {
    }
}
