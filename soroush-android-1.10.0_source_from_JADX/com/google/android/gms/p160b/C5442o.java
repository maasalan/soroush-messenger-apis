package com.google.android.gms.p160b;

import com.google.android.gms.common.internal.ac;
import java.util.concurrent.Executor;

public final class C5442o<TResult> extends C1692d<TResult> {
    private final Object f15103a = new Object();
    private final C1700m<TResult> f15104b = new C1700m();
    private boolean f15105c;
    private TResult f15106d;
    private Exception f15107e;

    private final void m11739e() {
        ac.m4382a(this.f15105c ^ 1, (Object) "Task is already complete");
    }

    private final void m11740f() {
        synchronized (this.f15103a) {
            if (this.f15105c) {
                this.f15104b.m4301a((C1692d) this);
                return;
            }
        }
    }

    public final C1692d<TResult> mo1540a(Executor executor, C1689a c1689a) {
        this.f15104b.m4302a(new C5440h(executor, c1689a));
        m11740f();
        return this;
    }

    public final C1692d<TResult> mo1541a(Executor executor, C1690b<? super TResult> c1690b) {
        this.f15104b.m4302a(new C5441j(executor, c1690b));
        m11740f();
        return this;
    }

    public final void m11743a(Exception exception) {
        ac.m4377a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.f15103a) {
            m11739e();
            this.f15105c = true;
            this.f15107e = exception;
        }
        this.f15104b.m4301a((C1692d) this);
    }

    public final void m11744a(TResult tResult) {
        synchronized (this.f15103a) {
            m11739e();
            this.f15105c = true;
            this.f15106d = tResult;
        }
        this.f15104b.m4301a((C1692d) this);
    }

    public final boolean mo1542a() {
        boolean z;
        synchronized (this.f15103a) {
            z = this.f15105c;
        }
        return z;
    }

    public final boolean mo1543b() {
        boolean z;
        synchronized (this.f15103a) {
            z = this.f15105c && this.f15107e == null;
        }
        return z;
    }

    public final boolean m11747b(Exception exception) {
        ac.m4377a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.f15103a) {
            if (this.f15105c) {
                return false;
            }
            this.f15105c = true;
            this.f15107e = exception;
            this.f15104b.m4301a((C1692d) this);
            return true;
        }
    }

    public final boolean m11748b(TResult tResult) {
        synchronized (this.f15103a) {
            if (this.f15105c) {
                return false;
            }
            this.f15105c = true;
            this.f15106d = tResult;
            this.f15104b.m4301a((C1692d) this);
            return true;
        }
    }

    public final TResult mo1544c() {
        TResult tResult;
        synchronized (this.f15103a) {
            ac.m4382a(this.f15105c, (Object) "Task is not yet complete");
            if (this.f15107e != null) {
                throw new C1691c(this.f15107e);
            }
            tResult = this.f15106d;
        }
        return tResult;
    }

    public final Exception mo1545d() {
        Exception exception;
        synchronized (this.f15103a) {
            exception = this.f15107e;
        }
        return exception;
    }
}
