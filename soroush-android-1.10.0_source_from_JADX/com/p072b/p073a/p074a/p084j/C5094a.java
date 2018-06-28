package com.p072b.p073a.p074a.p084j;

import com.p072b.p073a.p074a.p078e.C1028b;
import java.util.concurrent.TimeUnit;

public final class C5094a implements C1065b {
    final long f14223a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    final long f14224b = System.nanoTime();

    public C5094a() {
        C1028b.m2507b();
    }

    public final long mo1091a() {
        return (System.nanoTime() - this.f14224b) + this.f14223a;
    }

    public final void mo1092a(Object obj) {
        obj.wait();
    }

    public final void mo1093a(Object obj, long j) {
        long a = mo1091a();
        if (a > j) {
            obj.wait(1);
        } else {
            TimeUnit.NANOSECONDS.timedWait(obj, j - a);
        }
    }

    public final void mo1094b(Object obj) {
        obj.notifyAll();
    }
}
