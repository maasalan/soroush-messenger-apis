package com.google.p173d.p189f.p190a;

import com.google.p173d.C2049p;
import java.util.Formatter;

final class C2018f {
    final C2011a f6775a;
    final C2019g[] f6776b = new C2019g[(this.f6778d + 2)];
    C2013c f6777c;
    final int f6778d;

    C2018f(C2011a c2011a, C2013c c2013c) {
        this.f6775a = c2011a;
        this.f6778d = c2011a.f6743a;
        this.f6777c = c2013c;
    }

    static int m5514a(int i, int i2, C2014d c2014d) {
        if (c2014d == null) {
            return i2;
        }
        if (!c2014d.m5503a()) {
            if (c2014d.m5504a(i)) {
                c2014d.f6762e = i;
                return 0;
            }
            i2++;
        }
        return i2;
    }

    final void m5515a(C2019g c2019g) {
        if (c2019g != null) {
            C5613h c5613h = (C5613h) c2019g;
            C2011a c2011a = this.f6775a;
            C2014d[] c2014dArr = c5613h.f6780b;
            for (C2014d c2014d : c5613h.f6780b) {
                if (c2014d != null) {
                    c2014d.m5505b();
                }
            }
            c5613h.m12342a(c2014dArr, c2011a);
            C2013c c2013c = c5613h.f6779a;
            C2049p c2049p = c5613h.f15473c ? c2013c.f6750b : c2013c.f6752d;
            C2049p c2049p2 = c5613h.f15473c ? c2013c.f6751c : c2013c.f6753e;
            int b = c5613h.m5518b((int) c2049p.f6892b);
            int b2 = c5613h.m5518b((int) c2049p2.f6892b);
            int i = -1;
            int i2 = 0;
            int i3 = 1;
            while (b < b2) {
                if (c2014dArr[b] != null) {
                    C2014d c2014d2 = c2014dArr[b];
                    int i4 = c2014d2.f6762e - i;
                    if (i4 == 0) {
                        i2++;
                    } else {
                        if (i4 == 1) {
                            i3 = Math.max(i3, i2);
                            i = c2014d2.f6762e;
                        } else {
                            if (i4 >= 0 && c2014d2.f6762e < c2011a.f6747e) {
                                if (i4 <= b) {
                                    if (i3 > 2) {
                                        i4 *= i3 - 2;
                                    }
                                    Object obj = i4 >= b ? 1 : null;
                                    for (int i5 = 1; i5 <= i4 && obj == null; i5++) {
                                        obj = c2014dArr[b - i5] != null ? 1 : null;
                                    }
                                    if (obj != null) {
                                        c2014dArr[b] = null;
                                    } else {
                                        i = c2014d2.f6762e;
                                    }
                                }
                            }
                            c2014dArr[b] = null;
                        }
                        i2 = 1;
                    }
                }
                b++;
            }
        }
    }

    public final String toString() {
        C2019g c2019g = this.f6776b[0];
        if (c2019g == null) {
            c2019g = this.f6776b[this.f6778d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < c2019g.f6780b.length; i++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f6778d + 2; i2++) {
                if (this.f6776b[i2] != null) {
                    if (this.f6776b[i2].f6780b[i] != null) {
                        formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(this.f6776b[i2].f6780b[i].f6762e), Integer.valueOf(this.f6776b[i2].f6780b[i].f6761d)});
                    }
                }
                formatter.format("    |   ", new Object[0]);
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
