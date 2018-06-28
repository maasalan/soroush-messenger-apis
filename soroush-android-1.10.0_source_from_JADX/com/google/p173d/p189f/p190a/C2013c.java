package com.google.p173d.p189f.p190a;

import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1966b;

final class C2013c {
    C1966b f6749a;
    C2049p f6750b;
    C2049p f6751c;
    C2049p f6752d;
    C2049p f6753e;
    int f6754f;
    int f6755g;
    int f6756h;
    int f6757i;

    C2013c(C1966b c1966b, C2049p c2049p, C2049p c2049p2, C2049p c2049p3, C2049p c2049p4) {
        if (!(c2049p == null && c2049p3 == null) && (!(c2049p2 == null && c2049p4 == null) && ((c2049p == null || c2049p2 != null) && (c2049p3 == null || c2049p4 != null)))) {
            m5501a(c1966b, c2049p, c2049p2, c2049p3, c2049p4);
            return;
        }
        throw C5629j.m12369a();
    }

    C2013c(C2013c c2013c) {
        m5501a(c2013c.f6749a, c2013c.f6750b, c2013c.f6751c, c2013c.f6752d, c2013c.f6753e);
    }

    private void m5501a(C1966b c1966b, C2049p c2049p, C2049p c2049p2, C2049p c2049p3, C2049p c2049p4) {
        this.f6749a = c1966b;
        this.f6750b = c2049p;
        this.f6751c = c2049p2;
        this.f6752d = c2049p3;
        this.f6753e = c2049p4;
        m5502a();
    }

    final void m5502a() {
        if (this.f6750b == null) {
            this.f6750b = new C2049p(0.0f, this.f6752d.f6892b);
            this.f6751c = new C2049p(0.0f, this.f6753e.f6892b);
        } else if (this.f6752d == null) {
            this.f6752d = new C2049p((float) (this.f6749a.f6573a - 1), this.f6750b.f6892b);
            this.f6753e = new C2049p((float) (this.f6749a.f6573a - 1), this.f6751c.f6892b);
        }
        this.f6754f = (int) Math.min(this.f6750b.f6891a, this.f6751c.f6891a);
        this.f6755g = (int) Math.max(this.f6752d.f6891a, this.f6753e.f6891a);
        this.f6756h = (int) Math.min(this.f6750b.f6892b, this.f6752d.f6892b);
        this.f6757i = (int) Math.max(this.f6751c.f6892b, this.f6753e.f6892b);
    }
}
