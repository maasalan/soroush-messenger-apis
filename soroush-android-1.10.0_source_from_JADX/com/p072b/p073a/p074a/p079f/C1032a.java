package com.p072b.p073a.p074a.p079f;

import com.p072b.p073a.p074a.p078e.C1028b;

public final class C1032a {
    public C1033b f3335a = null;
    public final C1034c f3336b;

    C1032a(C1034c c1034c) {
        this.f3336b = c1034c;
    }

    final Long m2515a(long j, C1036e c1036e) {
        new Object[1][0] = Long.valueOf(j);
        C1028b.m2507b();
        while (this.f3335a != null && this.f3335a.f3339c <= j) {
            C1033b c1033b = this.f3335a;
            this.f3335a = c1033b.f3338b;
            c1033b.f3338b = null;
            c1036e.mo1082a(c1033b);
        }
        if (this.f3335a == null) {
            return null;
        }
        new Object[1][0] = Long.valueOf(this.f3335a.f3339c - j);
        C1028b.m2507b();
        return Long.valueOf(this.f3335a.f3339c);
    }

    public final void m2516a(C1033b c1033b, long j) {
        Object[] objArr = new Object[]{c1033b, Long.valueOf(j)};
        C1028b.m2507b();
        c1033b.f3339c = j;
        if (this.f3335a == null) {
            this.f3335a = c1033b;
            return;
        }
        C1033b c1033b2 = null;
        C1033b c1033b3 = this.f3335a;
        while (true) {
            C1033b c1033b4 = c1033b3;
            c1033b3 = c1033b2;
            c1033b2 = c1033b4;
            if (c1033b2 != null && c1033b2.f3339c <= j) {
                c1033b3 = c1033b2.f3338b;
            } else if (c1033b3 != null) {
                c1033b.f3338b = this.f3335a;
                this.f3335a = c1033b;
            } else {
                c1033b3.f3338b = c1033b;
                c1033b.f3338b = c1033b2;
                return;
            }
        }
        if (c1033b3 != null) {
            c1033b3.f3338b = c1033b;
            c1033b.f3338b = c1033b2;
            return;
        }
        c1033b.f3338b = this.f3335a;
        this.f3335a = c1033b;
    }
}
