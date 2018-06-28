package cn.iwgang.countdownview;

import android.os.Handler;
import android.os.SystemClock;

public abstract class C0961c {
    private final long f3122a;
    final long f3123b;
    long f3124c;
    boolean f3125d = false;
    boolean f3126e = false;
    private Handler f3127f = new C09601(this);

    class C09601 extends Handler {
        final /* synthetic */ C0961c f3121a;

        C09601(C0961c c0961c) {
            this.f3121a = c0961c;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r9) {
            /*
            r8 = this;
            r9 = r8.f3121a;
            monitor-enter(r9);
            r0 = r8.f3121a;	 Catch:{ all -> 0x0053 }
            r0 = r0.f3125d;	 Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x0051;
        L_0x0009:
            r0 = r8.f3121a;	 Catch:{ all -> 0x0053 }
            r0 = r0.f3126e;	 Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0010;
        L_0x000f:
            goto L_0x0051;
        L_0x0010:
            r0 = r8.f3121a;	 Catch:{ all -> 0x0053 }
            r0 = r0.f3124c;	 Catch:{ all -> 0x0053 }
            r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0053 }
            r4 = r0 - r2;
            r0 = 0;
            r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
            if (r2 > 0) goto L_0x0026;
        L_0x0020:
            r0 = r8.f3121a;	 Catch:{ all -> 0x0053 }
            r0.mo1022a();	 Catch:{ all -> 0x0053 }
            goto L_0x004f;
        L_0x0026:
            r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0053 }
            r6 = r8.f3121a;	 Catch:{ all -> 0x0053 }
            r6.mo1023a(r4);	 Catch:{ all -> 0x0053 }
            r4 = r8.f3121a;	 Catch:{ all -> 0x0053 }
            r4 = r4.f3123b;	 Catch:{ all -> 0x0053 }
            r6 = r2 + r4;
            r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0053 }
            r4 = r6 - r2;
        L_0x003b:
            r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
            if (r2 >= 0) goto L_0x0047;
        L_0x003f:
            r2 = r8.f3121a;	 Catch:{ all -> 0x0053 }
            r2 = r2.f3123b;	 Catch:{ all -> 0x0053 }
            r6 = r4 + r2;
            r4 = r6;
            goto L_0x003b;
        L_0x0047:
            r0 = 1;
            r0 = r8.obtainMessage(r0);	 Catch:{ all -> 0x0053 }
            r8.sendMessageDelayed(r0, r4);	 Catch:{ all -> 0x0053 }
        L_0x004f:
            monitor-exit(r9);	 Catch:{ all -> 0x0053 }
            return;
        L_0x0051:
            monitor-exit(r9);	 Catch:{ all -> 0x0053 }
            return;
        L_0x0053:
            r0 = move-exception;
            monitor-exit(r9);	 Catch:{ all -> 0x0053 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.iwgang.countdownview.c.1.handleMessage(android.os.Message):void");
        }
    }

    public C0961c(long j, long j2) {
        if (j2 > 1000) {
            j += 15;
        }
        this.f3122a = j;
        this.f3123b = j2;
    }

    private synchronized C0961c m2413b(long j) {
        this.f3125d = false;
        if (j <= 0) {
            mo1022a();
            return this;
        }
        this.f3124c = SystemClock.elapsedRealtime() + j;
        this.f3127f.sendMessage(this.f3127f.obtainMessage(1));
        return this;
    }

    public abstract void mo1022a();

    public abstract void mo1023a(long j);

    public final synchronized void m2416b() {
        m2413b(this.f3122a);
    }

    public final synchronized void m2417c() {
        this.f3125d = true;
        this.f3127f.removeMessages(1);
    }
}
