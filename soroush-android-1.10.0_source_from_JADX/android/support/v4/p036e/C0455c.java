package android.support.v4.p036e;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import java.util.concurrent.Callable;

public final class C0455c {
    final Object f1583a = new Object();
    HandlerThread f1584b;
    Handler f1585c;
    final int f1586d;
    private int f1587e;
    private Callback f1588f = new C04501(this);
    private final int f1589g;
    private final String f1590h;

    class C04501 implements Callback {
        final /* synthetic */ C0455c f1570a;

        C04501(C0455c c0455c) {
            this.f1570a = c0455c;
        }

        public final boolean handleMessage(android.os.Message r7) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0046 in {2, 8, 11, 18, 19, 23} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r6 = this;
            r0 = r7.what;
            r1 = 1;
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x0007;
                default: goto L_0x0006;
            };
        L_0x0006:
            return r1;
        L_0x0007:
            r0 = r6.f1570a;
            r7 = r7.obj;
            r7 = (java.lang.Runnable) r7;
            r7.run();
            r7 = r0.f1583a;
            monitor-enter(r7);
            r2 = r0.f1585c;	 Catch:{ all -> 0x0029 }
            r3 = 0;	 Catch:{ all -> 0x0029 }
            r2.removeMessages(r3);	 Catch:{ all -> 0x0029 }
            r2 = r0.f1585c;	 Catch:{ all -> 0x0029 }
            r4 = r0.f1585c;	 Catch:{ all -> 0x0029 }
            r3 = r4.obtainMessage(r3);	 Catch:{ all -> 0x0029 }
            r0 = r0.f1586d;	 Catch:{ all -> 0x0029 }
            r4 = (long) r0;	 Catch:{ all -> 0x0029 }
            r2.sendMessageDelayed(r3, r4);	 Catch:{ all -> 0x0029 }
            monitor-exit(r7);	 Catch:{ all -> 0x0029 }
            return r1;	 Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception;	 Catch:{ all -> 0x0029 }
            monitor-exit(r7);	 Catch:{ all -> 0x0029 }
            throw r0;
        L_0x002c:
            r7 = r6.f1570a;
            r0 = r7.f1583a;
            monitor-enter(r0);
            r2 = r7.f1585c;	 Catch:{ all -> 0x0047 }
            r2 = r2.hasMessages(r1);	 Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x003b;	 Catch:{ all -> 0x0047 }
        L_0x0039:
            monitor-exit(r0);	 Catch:{ all -> 0x0047 }
            return r1;	 Catch:{ all -> 0x0047 }
        L_0x003b:
            r2 = r7.f1584b;	 Catch:{ all -> 0x0047 }
            r2.quit();	 Catch:{ all -> 0x0047 }
            r2 = 0;	 Catch:{ all -> 0x0047 }
            r7.f1584b = r2;	 Catch:{ all -> 0x0047 }
            r7.f1585c = r2;	 Catch:{ all -> 0x0047 }
            goto L_0x0039;	 Catch:{ all -> 0x0047 }
            return r1;	 Catch:{ all -> 0x0047 }
        L_0x0047:
            r7 = move-exception;	 Catch:{ all -> 0x0047 }
            monitor-exit(r0);	 Catch:{ all -> 0x0047 }
            throw r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.c.1.handleMessage(android.os.Message):boolean");
        }
    }

    class C04522 implements Runnable {
        final /* synthetic */ Callable f1573a;
        final /* synthetic */ Handler f1574b;
        final /* synthetic */ C0454a f1575c;
        final /* synthetic */ C0455c f1576d;

        C04522(C0455c c0455c, Callable callable, Handler handler, C0454a c0454a) {
            this.f1576d = c0455c;
            this.f1573a = callable;
            this.f1574b = handler;
            this.f1575c = c0454a;
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
            r3 = this;
            r0 = r3.f1573a;	 Catch:{ Exception -> 0x0007 }
            r0 = r0.call();	 Catch:{ Exception -> 0x0007 }
            goto L_0x0008;
        L_0x0007:
            r0 = 0;
        L_0x0008:
            r1 = r3.f1574b;
            r2 = new android.support.v4.e.c$2$1;
            r2.<init>(r3, r0);
            r1.post(r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.c.2.run():void");
        }
    }

    public interface C0454a<T> {
        void mo294a(T t);
    }

    public C0455c(String str) {
        this.f1590h = str;
        this.f1589g = 10;
        this.f1586d = 10000;
        this.f1587e = 0;
    }

    public final <T> T m955a(java.util.concurrent.Callable<T> r13, int r14) {
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
        r12 = this;
        r7 = new java.util.concurrent.locks.ReentrantLock;
        r7.<init>();
        r8 = r7.newCondition();
        r9 = new java.util.concurrent.atomic.AtomicReference;
        r9.<init>();
        r10 = new java.util.concurrent.atomic.AtomicBoolean;
        r0 = 1;
        r10.<init>(r0);
        r11 = new android.support.v4.e.c$3;
        r0 = r11;
        r1 = r12;
        r2 = r9;
        r3 = r13;
        r4 = r7;
        r5 = r10;
        r6 = r8;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r12.m956a(r11);
        r7.lock();
        r13 = r10.get();	 Catch:{ all -> 0x005c }
        if (r13 != 0) goto L_0x0034;	 Catch:{ all -> 0x005c }
    L_0x002c:
        r13 = r9.get();	 Catch:{ all -> 0x005c }
        r7.unlock();
        return r13;
    L_0x0034:
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x005c }
        r0 = (long) r14;	 Catch:{ all -> 0x005c }
        r13 = r13.toNanos(r0);	 Catch:{ all -> 0x005c }
    L_0x003b:
        r0 = r8.awaitNanos(r13);	 Catch:{ InterruptedException -> 0x0040 }
        r13 = r0;
    L_0x0040:
        r0 = r10.get();	 Catch:{ all -> 0x005c }
        if (r0 != 0) goto L_0x004e;	 Catch:{ all -> 0x005c }
    L_0x0046:
        r13 = r9.get();	 Catch:{ all -> 0x005c }
        r7.unlock();
        return r13;
    L_0x004e:
        r0 = 0;
        r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x003b;
    L_0x0054:
        r13 = new java.lang.InterruptedException;	 Catch:{ all -> 0x005c }
        r14 = "timeout";	 Catch:{ all -> 0x005c }
        r13.<init>(r14);	 Catch:{ all -> 0x005c }
        throw r13;	 Catch:{ all -> 0x005c }
    L_0x005c:
        r13 = move-exception;
        r7.unlock();
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.c.a(java.util.concurrent.Callable, int):T");
    }

    final void m956a(Runnable runnable) {
        synchronized (this.f1583a) {
            if (this.f1584b == null) {
                this.f1584b = new HandlerThread(this.f1590h, this.f1589g);
                this.f1584b.start();
                this.f1585c = new Handler(this.f1584b.getLooper(), this.f1588f);
                this.f1587e++;
            }
            this.f1585c.removeMessages(0);
            this.f1585c.sendMessage(this.f1585c.obtainMessage(1, runnable));
        }
    }
}
