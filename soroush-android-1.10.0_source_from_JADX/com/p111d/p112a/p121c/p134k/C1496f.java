package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p134k.p135a.C1483i;
import java.util.List;

public final class C1496f {
    private static final C7119d[] f4662i = new C7119d[0];
    protected final C1445c f4663a;
    protected C7128y f4664b;
    protected List<C7119d> f4665c;
    protected C7119d[] f4666d;
    protected C5355a f4667e;
    protected Object f4668f;
    protected C5328e f4669g;
    protected C1483i f4670h;

    public C1496f(C1445c c1445c) {
        this.f4663a = c1445c;
    }

    public final C1445c m3846a() {
        return this.f4663a;
    }

    public final void m3847a(C5328e c5328e) {
        if (this.f4669g != null) {
            StringBuilder stringBuilder = new StringBuilder("Multiple type ids specified with ");
            stringBuilder.append(this.f4669g);
            stringBuilder.append(" and ");
            stringBuilder.append(c5328e);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4669g = c5328e;
    }

    public final void m3848a(C1483i c1483i) {
        this.f4670h = c1483i;
    }

    public final void m3849a(C5355a c5355a) {
        this.f4667e = c5355a;
    }

    protected final void m3850a(C7128y c7128y) {
        this.f4664b = c7128y;
    }

    public final void m3851a(Object obj) {
        this.f4668f = obj;
    }

    public final void m3852a(List<C7119d> list) {
        this.f4665c = list;
    }

    public final void m3853a(C7119d[] c7119dArr) {
        this.f4666d = c7119dArr;
    }

    public final List<C7119d> m3854b() {
        return this.f4665c;
    }

    public final C5355a m3855c() {
        return this.f4667e;
    }

    public final Object m3856d() {
        return this.f4668f;
    }

    public final C5328e m3857e() {
        return this.f4669g;
    }

    public final C1483i m3858f() {
        return this.f4670h;
    }

    public final C1545o<?> m3859g() {
        if (this.f4665c != null) {
            if (!this.f4665c.isEmpty()) {
                C7119d[] c7119dArr = (C7119d[]) this.f4665c.toArray(new C7119d[this.f4665c.size()]);
                return new C7120e(this.f4663a.m3615a(), this, c7119dArr, this.f4666d);
            }
        }
        if (this.f4667e == null && this.f4670h == null) {
            return null;
        }
        c7119dArr = f4662i;
        return new C7120e(this.f4663a.m3615a(), this, c7119dArr, this.f4666d);
    }

    public final C7120e m3860h() {
        return C7120e.m18642a(this.f4663a.m3615a());
    }
}
