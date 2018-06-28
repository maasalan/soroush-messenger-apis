package com.p085c.p086a.p105g;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.p085c.p086a.p105g.p106a.C1239g;
import com.p085c.p086a.p105g.p107b.C1242b;
import com.p085c.p086a.p109i.C1273i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class C7040d<R> implements C6462a<R>, Runnable {
    private static final C1246a f20066a = new C1246a();
    private final Handler f20067b;
    private final int f20068c;
    private final int f20069d;
    private final boolean f20070e;
    private final C1246a f20071f;
    private R f20072g;
    private C1244b f20073h;
    private boolean f20074i;
    private boolean f20075j;
    private boolean f20076k;

    static class C1246a {
        C1246a() {
        }
    }

    public C7040d(Handler handler) {
        this(handler, f20066a);
    }

    private C7040d(Handler handler, C1246a c1246a) {
        this.f20067b = handler;
        this.f20068c = 256;
        this.f20069d = 256;
        this.f20070e = true;
        this.f20071f = c1246a;
    }

    private synchronized R m18189a(Long l) {
        if (this.f20070e && !isDone()) {
            C1273i.m3024b();
        }
        if (this.f20074i) {
            throw new CancellationException();
        } else if (this.f20076k) {
            throw new ExecutionException(new IllegalStateException("Load failed"));
        } else if (this.f20075j) {
            return this.f20072g;
        } else {
            long j = 0;
            if (l != null) {
                if (l.longValue() > 0) {
                    j = l.longValue();
                }
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                } else if (this.f20076k) {
                    throw new ExecutionException(new IllegalStateException("Load failed"));
                } else if (this.f20074i) {
                    throw new CancellationException();
                } else if (this.f20075j) {
                    throw new TimeoutException();
                } else {
                    return this.f20072g;
                }
            }
            wait(j);
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f20076k) {
                throw new ExecutionException(new IllegalStateException("Load failed"));
            } else if (this.f20074i) {
                throw new CancellationException();
            } else if (this.f20075j) {
                return this.f20072g;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public final C1244b mo2698a() {
        return this.f20073h;
    }

    public final void mo2699a(Drawable drawable) {
    }

    public final void mo3318a(C1239g c1239g) {
        c1239g.mo1232a(this.f20068c, this.f20069d);
    }

    public final void mo2700a(C1244b c1244b) {
        this.f20073h = c1244b;
    }

    public final synchronized void mo3320a(R r, C1242b<? super R> c1242b) {
        this.f20075j = true;
        this.f20072g = r;
        notifyAll();
    }

    public final void mo1227b() {
    }

    public final void mo2701b(Drawable drawable) {
    }

    public final void mo3319b(C1239g c1239g) {
    }

    public final void mo1228c() {
    }

    public final synchronized void mo2702c(Drawable drawable) {
        this.f20076k = true;
        notifyAll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean cancel(boolean r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.isDone();	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        r2 = 0;
        monitor-exit(r1);
        return r2;
    L_0x000a:
        r0 = 1;
        r1.f20074i = r0;	 Catch:{ all -> 0x0019 }
        r1.notifyAll();	 Catch:{ all -> 0x0019 }
        if (r2 == 0) goto L_0x0017;
    L_0x0012:
        r2 = r1.f20067b;	 Catch:{ all -> 0x0019 }
        r2.post(r1);	 Catch:{ all -> 0x0019 }
    L_0x0017:
        monitor-exit(r1);
        return r0;
    L_0x0019:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.g.d.cancel(boolean):boolean");
    }

    public final void mo1229d() {
    }

    public final R get() {
        try {
            return m18189a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final R get(long j, TimeUnit timeUnit) {
        return m18189a(Long.valueOf(timeUnit.toMillis(j)));
    }

    public final synchronized boolean isCancelled() {
        return this.f20074i;
    }

    public final synchronized boolean isDone() {
        boolean z;
        if (!this.f20074i) {
            if (!this.f20075j) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final void run() {
        if (this.f20073h != null) {
            this.f20073h.mo1236d();
            this.f20073h = null;
        }
    }
}
