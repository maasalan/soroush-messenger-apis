package com.google.p173d.p189f.p190a.p191a;

import com.google.p173d.C5605d;

public final class C2008a {
    public final C2009b f6734a = C2009b.f6735a;

    public final int[] m5484a(C2010c c2010c) {
        int i = 1;
        int i2 = 0;
        int length = c2010c.f6742b.length - 1;
        int[] iArr = new int[length];
        while (i < this.f6734a.f6740f && i2 < length) {
            if (c2010c.m5494b(i) == 0) {
                iArr[i2] = this.f6734a.m5486a(i);
                i2++;
            }
            i++;
        }
        if (i2 == length) {
            return iArr;
        }
        throw C5605d.m12328a();
    }

    public final int[] m5485a(C2010c c2010c, C2010c c2010c2, int[] iArr) {
        int i = 1;
        int length = c2010c2.f6742b.length - 1;
        int[] iArr2 = new int[length];
        while (i <= length) {
            iArr2[length - i] = this.f6734a.m5490d(i, c2010c2.m5491a(i));
            i++;
        }
        c2010c2 = new C2010c(this.f6734a, iArr2);
        i = iArr.length;
        iArr2 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int a = this.f6734a.m5486a(iArr[i2]);
            iArr2[i2] = this.f6734a.m5490d(this.f6734a.m5489c(0, c2010c.m5494b(a)), this.f6734a.m5486a(c2010c2.m5494b(a)));
        }
        return iArr2;
    }
}
