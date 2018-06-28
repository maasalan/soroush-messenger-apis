package com.google.p164b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C5590i extends C1944k implements Iterable<C1944k> {
    private final List<C1944k> f15448a = new ArrayList();

    public final Number mo1751a() {
        if (this.f15448a.size() == 1) {
            return ((C1944k) this.f15448a.get(0)).mo1751a();
        }
        throw new IllegalStateException();
    }

    public final void m12298a(C1944k c1944k) {
        Object obj;
        if (c1944k == null) {
            obj = C5592m.f15449a;
        }
        this.f15448a.add(obj);
    }

    public final String mo1752b() {
        if (this.f15448a.size() == 1) {
            return ((C1944k) this.f15448a.get(0)).mo1752b();
        }
        throw new IllegalStateException();
    }

    public final double mo1753c() {
        if (this.f15448a.size() == 1) {
            return ((C1944k) this.f15448a.get(0)).mo1753c();
        }
        throw new IllegalStateException();
    }

    public final long mo1754d() {
        if (this.f15448a.size() == 1) {
            return ((C1944k) this.f15448a.get(0)).mo1754d();
        }
        throw new IllegalStateException();
    }

    public final int mo1755e() {
        if (this.f15448a.size() == 1) {
            return ((C1944k) this.f15448a.get(0)).mo1755e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C5590i) || !((C5590i) obj).f15448a.equals(this.f15448a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1756f() {
        if (this.f15448a.size() == 1) {
            return ((C1944k) this.f15448a.get(0)).mo1756f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.f15448a.hashCode();
    }

    public final Iterator<C1944k> iterator() {
        return this.f15448a.iterator();
    }
}
