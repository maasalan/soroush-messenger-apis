package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.CancellationSignal;

public final class C0507a {
    private boolean f1731a;
    private Object f1732b;
    private boolean f1733c;

    public final boolean m1114a() {
        boolean z;
        synchronized (this) {
            z = this.f1731a;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1115b() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f1731a;	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r4);	 Catch:{ all -> 0x0035 }
        return;
    L_0x0007:
        r0 = 1;
        r4.f1731a = r0;	 Catch:{ all -> 0x0035 }
        r4.f1733c = r0;	 Catch:{ all -> 0x0035 }
        r0 = r4.f1732b;	 Catch:{ all -> 0x0035 }
        monitor-exit(r4);	 Catch:{ all -> 0x0035 }
        r1 = 0;
        if (r0 == 0) goto L_0x002a;
    L_0x0012:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x001e }
        r3 = 16;
        if (r2 < r3) goto L_0x002a;
    L_0x0018:
        r0 = (android.os.CancellationSignal) r0;	 Catch:{ all -> 0x001e }
        r0.cancel();	 Catch:{ all -> 0x001e }
        goto L_0x002a;
    L_0x001e:
        r0 = move-exception;
        monitor-enter(r4);
        r4.f1733c = r1;	 Catch:{ all -> 0x0027 }
        r4.notifyAll();	 Catch:{ all -> 0x0027 }
        monitor-exit(r4);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        monitor-enter(r4);
        r4.f1733c = r1;	 Catch:{ all -> 0x0032 }
        r4.notifyAll();	 Catch:{ all -> 0x0032 }
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        throw r0;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0035 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.os.a.b():void");
    }

    public final Object m1116c() {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Object obj;
        synchronized (this) {
            if (this.f1732b == null) {
                this.f1732b = new CancellationSignal();
                if (this.f1731a) {
                    ((CancellationSignal) this.f1732b).cancel();
                }
            }
            obj = this.f1732b;
        }
        return obj;
    }
}
