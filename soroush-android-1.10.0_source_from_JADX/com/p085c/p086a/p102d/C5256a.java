package com.p085c.p086a.p102d;

import com.p085c.p086a.p109i.C1273i;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

final class C5256a implements C1216h {
    private final Set<C1217i> f14602a = Collections.newSetFromMap(new WeakHashMap());
    private boolean f14603b;
    private boolean f14604c;

    C5256a() {
    }

    final void m10878a() {
        this.f14603b = true;
        for (C1217i b : C1273i.m3019a(this.f14602a)) {
            b.mo1227b();
        }
    }

    public final void mo1223a(C1217i c1217i) {
        this.f14602a.add(c1217i);
        if (this.f14604c) {
            c1217i.mo1229d();
        } else if (this.f14603b) {
            c1217i.mo1227b();
        } else {
            c1217i.mo1228c();
        }
    }

    final void m10880b() {
        this.f14603b = false;
        for (C1217i c : C1273i.m3019a(this.f14602a)) {
            c.mo1228c();
        }
    }

    public final void mo1224b(C1217i c1217i) {
        this.f14602a.remove(c1217i);
    }

    final void m10882c() {
        this.f14604c = true;
        for (C1217i d : C1273i.m3019a(this.f14602a)) {
            d.mo1229d();
        }
    }
}
