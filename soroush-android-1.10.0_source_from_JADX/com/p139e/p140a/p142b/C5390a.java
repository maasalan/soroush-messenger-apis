package com.p139e.p140a.p142b;

import com.p139e.p140a.C1569b;
import java.util.ArrayList;
import java.util.List;

public abstract class C5390a implements C1568c {
    protected C1567b f14996a;
    protected List<C1569b> f14997b;

    protected static int m11637a(float f, float f2) {
        return Math.max(1, (int) ((3.063052912151454d / Math.asin((double) (f2 / f))) + 0.5d));
    }

    public final C1567b mo1494a() {
        if (this.f14996a == null) {
            this.f14996a = new C1567b();
        }
        return this.f14996a;
    }

    public final void mo1495a(C1567b c1567b) {
        this.f14996a = c1567b;
        this.f14997b = new ArrayList();
    }

    public final List<C1569b> mo1496b() {
        return this.f14997b;
    }

    protected final int m11641c() {
        return Math.round(this.f14996a.f4873e * 255.0f);
    }
}
