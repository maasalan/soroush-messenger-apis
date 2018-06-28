package com.google.p173d.p193g.p194a;

import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1966b;

final class C2026a {
    final C1966b f6796a;
    C2037j f6797b;
    C2032g f6798c;
    boolean f6799d;

    C2026a(C1966b c1966b) {
        int i = c1966b.f6574b;
        if (i >= 21) {
            if ((i & 3) == 1) {
                this.f6796a = c1966b;
                return;
            }
        }
        throw C5615f.m12347a();
    }

    private int m5536a(int i, int i2, int i3) {
        return this.f6799d ? this.f6796a.m5416a(i2, i) : this.f6796a.m5416a(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    final C2032g m5537a() {
        if (this.f6798c != null) {
            return this.f6798c;
        }
        int i = 0;
        int i2 = 0;
        int i3 = i2;
        while (i2 < 6) {
            i3 = m5536a(i2, 8, i3);
            i2++;
        }
        i2 = m5536a(8, 7, m5536a(8, 8, m5536a(7, 8, i3)));
        for (i3 = 5; i3 >= 0; i3--) {
            i2 = m5536a(8, i3, i2);
        }
        i3 = this.f6796a.f6574b;
        int i4 = i3 - 7;
        for (int i5 = i3 - 1; i5 >= i4; i5--) {
            i = m5536a(8, i5, i);
        }
        for (i4 = i3 - 8; i4 < i3; i4++) {
            i = m5536a(i4, 8, i);
        }
        this.f6798c = C2032g.m5553b(i2, i);
        if (this.f6798c != null) {
            return this.f6798c;
        }
        throw C5615f.m12347a();
    }

    final C2037j m5538b() {
        if (this.f6797b != null) {
            return this.f6797b;
        }
        int i = this.f6796a.f6574b;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return C2037j.m5558b(i2);
        }
        int i3;
        i2 = i - 11;
        int i4 = 5;
        int i5 = 0;
        int i6 = 0;
        for (i3 = 5; i3 >= 0; i3--) {
            for (int i7 = i - 9; i7 >= i2; i7--) {
                i6 = m5536a(i7, i3, i6);
            }
        }
        C2037j c = C2037j.m5560c(i6);
        if (c == null || c.m5561a() != i) {
            while (i4 >= 0) {
                for (i3 = i - 9; i3 >= i2; i3--) {
                    i5 = m5536a(i4, i3, i5);
                }
                i4--;
            }
            C2037j c2 = C2037j.m5560c(i5);
            if (c2 == null || c2.m5561a() != i) {
                throw C5615f.m12347a();
            }
            this.f6797b = c2;
            return c2;
        }
        this.f6797b = c;
        return c;
    }
}
