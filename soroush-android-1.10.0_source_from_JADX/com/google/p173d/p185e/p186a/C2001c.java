package com.google.p173d.p185e.p186a;

import com.google.p173d.C2049p;

public final class C2001c {
    public final int f6708a;
    public final int[] f6709b;
    public final C2049p[] f6710c;

    public C2001c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f6708a = i;
        this.f6709b = iArr;
        r1 = new C2049p[2];
        float f = (float) i4;
        r1[0] = new C2049p((float) i2, f);
        r1[1] = new C2049p((float) i3, f);
        this.f6710c = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2001c)) {
            return false;
        }
        return this.f6708a == ((C2001c) obj).f6708a;
    }

    public final int hashCode() {
        return this.f6708a;
    }
}
