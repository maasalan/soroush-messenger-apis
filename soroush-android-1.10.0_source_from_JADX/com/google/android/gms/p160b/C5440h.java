package com.google.android.gms.p160b;

import java.util.concurrent.Executor;

final class C5440h<TResult> implements C1699l<TResult> {
    final Object f15097a = new Object();
    C1689a f15098b;
    private final Executor f15099c;

    public C5440h(Executor executor, C1689a c1689a) {
        this.f15099c = executor;
        this.f15098b = c1689a;
    }

    public final void mo1539a(C1692d<TResult> c1692d) {
        if (!c1692d.mo1543b()) {
            synchronized (this.f15097a) {
                if (this.f15098b == null) {
                    return;
                }
                this.f15099c.execute(new C1697i(this, c1692d));
            }
        }
    }
}
