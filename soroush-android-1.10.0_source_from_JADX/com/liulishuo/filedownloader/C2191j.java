package com.liulishuo.filedownloader;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.liulishuo.filedownloader.p205h.C2175b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public final class C2191j {
    static int f7270d = 10;
    static int f7271e = 5;
    final Executor f7272a;
    final LinkedBlockingQueue<C2220s> f7273b;
    final Object f7274c;
    private final Handler f7275f;
    private final ArrayList<C2220s> f7276g;

    class C21881 implements Runnable {
        final /* synthetic */ C2220s f7267a;
        final /* synthetic */ C2191j f7268b;

        C21881(C2191j c2191j, C2220s c2220s) {
            this.f7268b = c2191j;
            this.f7267a = c2220s;
        }

        public final void run() {
            this.f7267a.mo1944b();
        }
    }

    private static final class C2189a {
        private static final C2191j f7269a = new C2191j();
    }

    private static class C2190b implements Callback {
        private C2190b() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((C2220s) message.obj).mo1944b();
                return true;
            }
            if (message.what == 2) {
                ArrayList arrayList = (ArrayList) message.obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2220s) it.next()).mo1944b();
                }
                arrayList.clear();
                C2191j.m6037a().m6041b();
            }
            return true;
        }
    }

    private C2191j() {
        this.f7272a = C2175b.m5967a(5, "BlockCompleted");
        this.f7274c = new Object();
        this.f7276g = new ArrayList();
        this.f7275f = new Handler(Looper.getMainLooper(), new C2190b());
        this.f7273b = new LinkedBlockingQueue();
    }

    public static C2191j m6037a() {
        return C2189a.f7269a;
    }

    public static boolean m6039c() {
        return f7270d > 0;
    }

    final void m6040a(C2220s c2220s) {
        this.f7275f.sendMessage(this.f7275f.obtainMessage(1, c2220s));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m6041b() {
        /*
        r6 = this;
        r0 = r6.f7274c;
        monitor-enter(r0);
        r1 = r6.f7276g;	 Catch:{ all -> 0x0056 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0056 }
        if (r1 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x0056 }
        return;
    L_0x000d:
        r1 = r6.f7273b;	 Catch:{ all -> 0x0056 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0056 }
        if (r1 == 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r0);	 Catch:{ all -> 0x0056 }
        return;
    L_0x0017:
        r1 = com.liulishuo.filedownloader.C2191j.m6039c();	 Catch:{ all -> 0x0056 }
        r2 = 0;
        if (r1 != 0) goto L_0x0027;
    L_0x001e:
        r1 = r6.f7273b;	 Catch:{ all -> 0x0056 }
        r3 = r6.f7276g;	 Catch:{ all -> 0x0056 }
        r1.drainTo(r3);	 Catch:{ all -> 0x0056 }
        r1 = r2;
        goto L_0x0045;
    L_0x0027:
        r1 = f7270d;	 Catch:{ all -> 0x0056 }
        r3 = r6.f7273b;	 Catch:{ all -> 0x0056 }
        r3 = r3.size();	 Catch:{ all -> 0x0056 }
        r4 = f7271e;	 Catch:{ all -> 0x0056 }
        r3 = java.lang.Math.min(r3, r4);	 Catch:{ all -> 0x0056 }
    L_0x0035:
        if (r2 >= r3) goto L_0x0045;
    L_0x0037:
        r4 = r6.f7276g;	 Catch:{ all -> 0x0056 }
        r5 = r6.f7273b;	 Catch:{ all -> 0x0056 }
        r5 = r5.remove();	 Catch:{ all -> 0x0056 }
        r4.add(r5);	 Catch:{ all -> 0x0056 }
        r2 = r2 + 1;
        goto L_0x0035;
    L_0x0045:
        monitor-exit(r0);	 Catch:{ all -> 0x0056 }
        r0 = r6.f7275f;
        r2 = r6.f7275f;
        r3 = 2;
        r4 = r6.f7276g;
        r2 = r2.obtainMessage(r3, r4);
        r3 = (long) r1;
        r0.sendMessageDelayed(r2, r3);
        return;
    L_0x0056:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0056 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.j.b():void");
    }
}
