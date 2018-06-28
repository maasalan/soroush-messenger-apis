package com.p085c.p086a.p105g.p106a;

import com.p085c.p086a.p109i.C1273i;

public abstract class C7038f<Z> extends C6461a<Z> {
    private final int f20060a;
    private final int f20061b;

    public C7038f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C7038f(int i, int i2) {
        this.f20060a = i;
        this.f20061b = i2;
    }

    public final void mo3318a(C1239g c1239g) {
        if (C1273i.m3022a(this.f20060a, this.f20061b)) {
            c1239g.mo1232a(this.f20060a, this.f20061b);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(this.f20060a);
        stringBuilder.append(" and height: ");
        stringBuilder.append(this.f20061b);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void mo3319b(C1239g c1239g) {
    }
}
