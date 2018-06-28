package com.google.p173d.p189f.p190a;

import java.util.Formatter;

class C2019g {
    final C2013c f6779a;
    final C2014d[] f6780b;

    C2019g(C2013c c2013c) {
        this.f6779a = new C2013c(c2013c);
        this.f6780b = new C2014d[((c2013c.f6757i - c2013c.f6756h) + 1)];
    }

    final C2014d m5516a(int i) {
        C2014d c = m5519c(i);
        if (c != null) {
            return c;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            C2014d c2014d;
            int b = m5518b(i) - i2;
            if (b >= 0) {
                c2014d = this.f6780b[b];
                if (c2014d != null) {
                    return c2014d;
                }
            }
            b = m5518b(i) + i2;
            if (b < this.f6780b.length) {
                c2014d = this.f6780b[b];
                if (c2014d != null) {
                    return c2014d;
                }
            }
        }
        return null;
    }

    final void m5517a(int i, C2014d c2014d) {
        this.f6780b[m5518b(i)] = c2014d;
    }

    final int m5518b(int i) {
        return i - this.f6779a.f6756h;
    }

    final C2014d m5519c(int i) {
        return this.f6780b[m5518b(i)];
    }

    public String toString() {
        Formatter formatter = new Formatter();
        C2014d[] c2014dArr = this.f6780b;
        int length = c2014dArr.length;
        int i = 0;
        int i2 = i;
        while (i < length) {
            C2014d c2014d = c2014dArr[i];
            if (c2014d == null) {
                Object[] objArr = new Object[1];
                int i3 = i2 + 1;
                objArr[0] = Integer.valueOf(i2);
                formatter.format("%3d:    |   %n", objArr);
                i2 = i3;
            } else {
                r9 = new Object[3];
                int i4 = i2 + 1;
                r9[0] = Integer.valueOf(i2);
                r9[1] = Integer.valueOf(c2014d.f6762e);
                r9[2] = Integer.valueOf(c2014d.f6761d);
                formatter.format("%3d: %3d|%3d%n", r9);
                i2 = i4;
            }
            i++;
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
