package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p116c.C1352h;
import com.p111d.p112a.p121c.aa;

public final class C7572i extends C7414n {
    private static final C7572i[] f23128b = new C7572i[12];
    protected final int f23129a;

    static {
        for (int i = 0; i < 12; i++) {
            f23128b[i] = new C7572i(-1 + i);
        }
    }

    private C7572i(int i) {
        this.f23129a = i;
    }

    public static C7572i m20709a(int i) {
        if (i <= 10) {
            if (i >= -1) {
                return f23128b[i - -1];
            }
        }
        return new C7572i(i);
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeNumber(this.f23129a);
    }

    public final String mo3532b() {
        return C1352h.m3241a(this.f23129a);
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && (obj instanceof C7572i) && ((C7572i) obj).f23129a == this.f23129a;
    }

    public final int hashCode() {
        return this.f23129a;
    }
}
