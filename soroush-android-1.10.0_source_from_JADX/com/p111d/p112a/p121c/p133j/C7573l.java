package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p116c.C1352h;
import com.p111d.p112a.p121c.aa;

public final class C7573l extends C7414n {
    protected final long f23130a;

    private C7573l(long j) {
        this.f23130a = j;
    }

    public static C7573l m20712a(long j) {
        return new C7573l(j);
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeNumber(this.f23130a);
    }

    public final String mo3532b() {
        return C1352h.m3242a(this.f23130a);
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && (obj instanceof C7573l) && ((C7573l) obj).f23130a == this.f23130a;
    }

    public final int hashCode() {
        return ((int) this.f23130a) ^ ((int) (this.f23130a >> 32));
    }
}
