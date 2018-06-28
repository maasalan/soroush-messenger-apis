package com.p085c.p086a.p089c.p098d.p100e;

import com.p085c.p086a.p089c.p092b.C1157p;
import com.p085c.p086a.p089c.p098d.p514c.C5239a;
import com.p085c.p086a.p109i.C1273i;

public final class C6456e extends C5239a<C5244c> implements C1157p {
    public C6456e(C5244c c5244c) {
        super(c5244c);
    }

    public final Class<C5244c> mo1179a() {
        return C5244c.class;
    }

    public final int mo1181c() {
        C1199g c1199g = ((C5244c) this.a).f14580a.f3791b;
        return c1199g.f3793a.mo1104g() + C1273i.m3016a(c1199g.m2850b().getWidth(), c1199g.m2850b().getHeight(), c1199g.m2850b().getConfig());
    }

    public final void mo1182d() {
        ((C5244c) this.a).stop();
        C5244c c5244c = (C5244c) this.a;
        c5244c.f14581b = true;
        C1199g c1199g = c5244c.f14580a.f3791b;
        c1199g.f3795c.clear();
        c1199g.m2852d();
        c1199g.f3797e = false;
        if (c1199g.f3799g != null) {
            c1199g.f3796d.m10954a(c1199g.f3799g);
            c1199g.f3799g = null;
        }
        if (c1199g.f3801i != null) {
            c1199g.f3796d.m10954a(c1199g.f3801i);
            c1199g.f3801i = null;
        }
        c1199g.f3793a.mo1106i();
        c1199g.f3800h = true;
    }

    public final void mo1201e() {
        ((C5244c) this.a).m10858a().prepareToDraw();
    }
}
