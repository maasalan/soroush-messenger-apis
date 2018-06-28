package com.p072b.p073a.p074a.p079f;

import com.p072b.p073a.p074a.p078e.C1028b;
import java.util.concurrent.atomic.AtomicInteger;

public class C1039j {
    private static final AtomicInteger f3358a = new AtomicInteger(0);
    public C1033b f3359e = null;
    public C1033b f3360f = null;
    public final String f3361g;
    public final C1034c f3362h;

    public C1039j(C1034c c1034c, String str) {
        this.f3362h = c1034c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(f3358a.incrementAndGet());
        this.f3361g = stringBuilder.toString();
    }

    protected void mo1082a(C1033b c1033b) {
        Object[] objArr = new Object[]{this.f3361g, c1033b};
        C1028b.m2507b();
        if (this.f3360f == null) {
            this.f3359e = c1033b;
        } else {
            this.f3360f.f3338b = c1033b;
        }
        this.f3360f = c1033b;
    }

    public void mo1083b() {
        while (this.f3359e != null) {
            C1033b c1033b = this.f3359e;
            this.f3359e = c1033b.f3338b;
            this.f3362h.m2519a(c1033b);
        }
        this.f3360f = null;
    }

    final C1033b m2526c() {
        C1033b c1033b = this.f3359e;
        Object[] objArr = new Object[]{this.f3361g, c1033b};
        C1028b.m2507b();
        if (c1033b != null) {
            this.f3359e = c1033b.f3338b;
            if (this.f3360f == c1033b) {
                this.f3360f = null;
            }
        }
        return c1033b;
    }
}
