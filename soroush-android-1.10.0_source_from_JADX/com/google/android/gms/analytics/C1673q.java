package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1673q<T extends C1673q> {
    private final List<Object> f5158a = new ArrayList();
    public final C1677r f5159h;
    protected final C1671o f5160i;

    protected C1673q(C1677r c1677r, C1785d c1785d) {
        ac.m4376a((Object) c1677r);
        this.f5159h = c1677r;
        C1671o c1671o = new C1671o(this, c1785d);
        c1671o.f5153g = true;
        this.f5160i = c1671o;
    }

    protected void mo1535a(C1671o c1671o) {
    }

    public C1671o mo1536c() {
        C1671o a = this.f5160i.m4260a();
        m4270d();
        return a;
    }

    protected final void m4270d() {
        Iterator it = this.f5158a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
