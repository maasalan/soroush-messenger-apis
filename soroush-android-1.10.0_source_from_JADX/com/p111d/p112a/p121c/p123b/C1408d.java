package com.p111d.p112a.p121c.p123b;

import com.p111d.p112a.p121c.C1402a;
import com.p111d.p112a.p121c.p124c.C1432g;
import com.p111d.p112a.p121c.p124c.C1438o;
import com.p111d.p112a.p121c.p124c.C1439p;
import com.p111d.p112a.p121c.p124c.C1444w;
import com.p111d.p112a.p121c.p124c.p126b.C5323z;
import com.p111d.p112a.p121c.p138m.C1520c;
import java.io.Serializable;

public final class C1408d implements Serializable {
    protected static final C1438o[] f4434a = new C1438o[0];
    protected static final C1432g[] f4435b = new C1432g[0];
    protected static final C1402a[] f4436c = new C1402a[0];
    protected static final C1444w[] f4437d = new C1444w[0];
    protected static final C1439p[] f4438e = new C1439p[]{new C5323z()};
    protected final C1438o[] f4439f;
    protected final C1439p[] f4440g;
    protected final C1432g[] f4441h;
    protected final C1402a[] f4442i;
    protected final C1444w[] f4443j;

    public C1408d() {
        this((byte) 0);
    }

    private C1408d(byte b) {
        this.f4439f = f4434a;
        this.f4440g = f4438e;
        this.f4441h = f4435b;
        this.f4442i = f4436c;
        this.f4443j = f4437d;
    }

    public final boolean m3432a() {
        return this.f4440g.length > 0;
    }

    public final boolean m3433b() {
        return this.f4441h.length > 0;
    }

    public final boolean m3434c() {
        return this.f4442i.length > 0;
    }

    public final boolean m3435d() {
        return this.f4443j.length > 0;
    }

    public final Iterable<C1438o> m3436e() {
        return new C1520c(this.f4439f);
    }

    public final Iterable<C1439p> m3437f() {
        return new C1520c(this.f4440g);
    }

    public final Iterable<C1432g> m3438g() {
        return new C1520c(this.f4441h);
    }

    public final Iterable<C1402a> m3439h() {
        return new C1520c(this.f4442i);
    }

    public final Iterable<C1444w> m3440i() {
        return new C1520c(this.f4443j);
    }
}
