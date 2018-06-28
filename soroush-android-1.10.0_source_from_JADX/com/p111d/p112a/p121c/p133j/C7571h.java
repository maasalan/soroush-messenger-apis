package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p116c.C1352h;
import com.p111d.p112a.p121c.aa;

public final class C7571h extends C7414n {
    protected final double f23127a;

    private C7571h(double d) {
        this.f23127a = d;
    }

    public static C7571h m20706a(double d) {
        return new C7571h(d);
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeNumber(this.f23127a);
    }

    public final String mo3532b() {
        return C1352h.m3240a(this.f23127a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C7571h)) {
            if (Double.compare(this.f23127a, ((C7571h) obj).f23127a) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f23127a);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }
}
