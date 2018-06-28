package com.google.android.gms.p160b;

import java.util.concurrent.Executor;

final class C5441j<TResult> implements C1699l<TResult> {
    final Object f15100a = new Object();
    C1690b<? super TResult> f15101b;
    private final Executor f15102c;

    public C5441j(Executor executor, C1690b<? super TResult> c1690b) {
        this.f15102c = executor;
        this.f15101b = c1690b;
    }

    public final void mo1539a(C1692d<TResult> c1692d) {
        if (c1692d.mo1543b()) {
            synchronized (this.f15100a) {
                if (this.f15101b == null) {
                    return;
                }
                this.f15102c.execute(new C1698k(this, c1692d));
            }
        }
    }
}
