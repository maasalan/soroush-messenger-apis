package com.google.android.gms.p158a;

import java.util.Iterator;

final class C5426d implements C1649n<T> {
    private /* synthetic */ C1646c f15072a;

    C5426d(C1646c c1646c) {
        this.f15072a = c1646c;
    }

    public final void mo1529a(T t) {
        this.f15072a.f5103a = t;
        Iterator it = this.f15072a.f5105c.iterator();
        while (it.hasNext()) {
            ((C1648k) it.next()).mo1531b();
        }
        this.f15072a.f5105c.clear();
        this.f15072a.f5104b = null;
    }
}
