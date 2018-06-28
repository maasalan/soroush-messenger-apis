package com.google.p173d.p185e.p186a.p187a.p188a;

import com.google.p173d.p177b.C1961a;

abstract class C6596i extends C5606h {
    C6596i(C1961a c1961a) {
        super(c1961a);
    }

    protected abstract int mo3419a(int i);

    protected abstract void mo3420a(StringBuilder stringBuilder, int i);

    final void m16898b(StringBuilder stringBuilder, int i, int i2) {
        i = this.f6681b.m5472a(i, i2);
        mo3420a(stringBuilder, i);
        i = mo3419a(i);
        i2 = 100000;
        for (int i3 = 0; i3 < 5; i3++) {
            if (i / i2 == 0) {
                stringBuilder.append('0');
            }
            i2 /= 10;
        }
        stringBuilder.append(i);
    }
}
