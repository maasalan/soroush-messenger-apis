package com.google.android.gms.analytics;

import java.util.Iterator;

public final class C1678s implements Runnable {
    private /* synthetic */ C1671o f5170a;
    private /* synthetic */ C1677r f5171b;

    public C1678s(C1677r c1677r, C1671o c1671o) {
        this.f5171b = c1677r;
        this.f5170a = c1671o;
    }

    public final void run() {
        this.f5170a.f5147a.mo1535a(this.f5170a);
        Iterator it = this.f5171b.f5167e.iterator();
        while (it.hasNext()) {
            it.next();
        }
        C1677r.m4273a(this.f5170a);
    }
}
