package com.google.p164b;

import com.google.p164b.p166b.C1927g;

public final class C5593n extends C1944k {
    public final C1927g<String, C1944k> f15450a = new C1927g();

    public final void m12304a(String str, C1944k c1944k) {
        Object obj;
        if (c1944k == null) {
            obj = C5592m.f15449a;
        }
        this.f15450a.put(str, obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C5593n) || !((C5593n) obj).f15450a.equals(this.f15450a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f15450a.hashCode();
    }
}
