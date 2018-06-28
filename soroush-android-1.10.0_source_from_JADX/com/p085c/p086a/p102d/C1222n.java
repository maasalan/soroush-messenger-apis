package com.p085c.p086a.p102d;

import com.p085c.p086a.p105g.C1244b;
import com.p085c.p086a.p109i.C1273i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class C1222n {
    public final Set<C1244b> f3857a = Collections.newSetFromMap(new WeakHashMap());
    public final List<C1244b> f3858b = new ArrayList();
    public boolean f3859c;

    public final void m2895a() {
        for (C1244b a : C1273i.m3019a(this.f3857a)) {
            m2896a(a);
        }
        this.f3858b.clear();
    }

    public final boolean m2896a(C1244b c1244b) {
        boolean z = false;
        if (c1244b == null) {
            return false;
        }
        boolean remove = this.f3857a.remove(c1244b);
        if (this.f3858b.remove(c1244b) || remove) {
            z = true;
        }
        if (z) {
            c1244b.mo1236d();
            c1244b.mo1241i();
        }
        return z;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{numRequests=");
        stringBuilder.append(this.f3857a.size());
        stringBuilder.append(", isPaused=");
        stringBuilder.append(this.f3859c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
