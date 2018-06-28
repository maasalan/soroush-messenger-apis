package com.google.p173d.p185e.p186a.p187a.p188a;

import com.google.p173d.C5615f;

final class C5610p extends C1995q {
    final int f15469a;
    final int f15470b;

    C5610p(int i, int i2, int i3) {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0) {
            if (i3 <= 10) {
                this.f15469a = i2;
                this.f15470b = i3;
                return;
            }
        }
        throw C5615f.m12347a();
    }

    final boolean m12333a() {
        return this.f15470b == 10;
    }
}
