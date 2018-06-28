package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.ah;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.C6488s;
import java.io.Serializable;

public final class C1416l implements Serializable {
    protected final C5354j f4475a;
    public final C1549v f4476b;
    public final af<?> f4477c;
    public final ah f4478d;
    protected final C1507k<Object> f4479e;
    public final C6488s f4480f;

    private C1416l(C5354j c5354j, C1549v c1549v, af<?> afVar, C1507k<?> c1507k, C6488s c6488s, ah ahVar) {
        this.f4475a = c5354j;
        this.f4476b = c1549v;
        this.f4477c = afVar;
        this.f4478d = ahVar;
        this.f4479e = c1507k;
        this.f4480f = c6488s;
    }

    public static C1416l m3490a(C5354j c5354j, C1549v c1549v, af<?> afVar, C1507k<?> c1507k, C6488s c6488s, ah ahVar) {
        return new C1416l(c5354j, c1549v, afVar, c1507k, c6488s, ahVar);
    }

    public final C1507k<Object> m3491a() {
        return this.f4479e;
    }

    public final Object m3492a(C5303j c5303j, C5347g c5347g) {
        return this.f4479e.mo1304a(c5303j, c5347g);
    }

    public final C5354j m3493b() {
        return this.f4475a;
    }
}
