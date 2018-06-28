package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class gm extends hq {
    private static final AtomicLong f18176k = new AtomicLong(Long.MIN_VALUE);
    private ExecutorService f18177a;
    private gq f18178b;
    private gq f18179c;
    private final PriorityBlockingQueue<gp<?>> f18180d = new PriorityBlockingQueue();
    private final BlockingQueue<gp<?>> f18181e = new LinkedBlockingQueue();
    private final UncaughtExceptionHandler f18182f = new go(this, "Thread death: Uncaught exception on worker thread");
    private final UncaughtExceptionHandler f18183g = new go(this, "Thread death: Uncaught exception on network thread");
    private final Object f18184h = new Object();
    private final Semaphore f18185i = new Semaphore(2);
    private volatile boolean f18186j;

    gm(gr grVar) {
        super(grVar);
    }

    private final void m16325a(gp<?> gpVar) {
        synchronized (this.f18184h) {
            this.f18180d.add(gpVar);
            if (this.f18178b == null) {
                this.f18178b = new gq(this, "Measurement Worker", this.f18180d);
                this.f18178b.setUncaughtExceptionHandler(this.f18182f);
                this.f18178b.start();
            } else {
                this.f18178b.m4864a();
            }
        }
    }

    public static boolean m16332y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    final ExecutorService m16333A() {
        ExecutorService executorService;
        synchronized (this.f18184h) {
            if (this.f18177a == null) {
                this.f18177a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f18177a;
        }
        return executorService;
    }

    public final <V> Future<V> m16334a(Callable<V> callable) {
        m11975L();
        ac.m4376a((Object) callable);
        gp gpVar = new gp(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f18178b) {
            if (!this.f18180d.isEmpty()) {
                mo1623t().f18136c.m4846a("Callable skipped the worker queue.");
            }
            gpVar.run();
            return gpVar;
        }
        m16325a(gpVar);
        return gpVar;
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final void m16336a(Runnable runnable) {
        m11975L();
        ac.m4376a((Object) runnable);
        m16325a(new gp(this, runnable, "Task exception on worker thread"));
    }

    public final <V> Future<V> m16337b(Callable<V> callable) {
        m11975L();
        ac.m4376a((Object) callable);
        gp gpVar = new gp(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f18178b) {
            gpVar.run();
            return gpVar;
        }
        m16325a(gpVar);
        return gpVar;
    }

    public final void mo1605b() {
        if (Thread.currentThread() != this.f18179c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void m16339b(Runnable runnable) {
        m11975L();
        ac.m4376a((Object) runnable);
        gp gpVar = new gp(this, runnable, "Task exception on network thread");
        synchronized (this.f18184h) {
            this.f18181e.add(gpVar);
            if (this.f18179c == null) {
                this.f18179c = new gq(this, "Measurement Network", this.f18181e);
                this.f18179c.setUncaughtExceptionHandler(this.f18183g);
                this.f18179c.start();
            } else {
                this.f18179c.m4864a();
            }
        }
    }

    public final void mo1606c() {
        if (Thread.currentThread() != this.f18178b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return false;
    }

    public final boolean m16361z() {
        return Thread.currentThread() == this.f18178b;
    }
}
