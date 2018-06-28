package com.p085c.p086a.p089c.p092b.p093a;

import com.p085c.p086a.p109i.C1273i;
import java.util.Queue;

abstract class C1105d<T extends C1111l> {
    private final Queue<T> f3604a = C1273i.m3020a(20);

    C1105d() {
    }

    protected abstract T mo1119a();

    public final void m2684a(T t) {
        if (this.f3604a.size() < 20) {
            this.f3604a.offer(t);
        }
    }

    protected final T m2685b() {
        C1111l c1111l = (C1111l) this.f3604a.poll();
        return c1111l == null ? mo1119a() : c1111l;
    }
}
