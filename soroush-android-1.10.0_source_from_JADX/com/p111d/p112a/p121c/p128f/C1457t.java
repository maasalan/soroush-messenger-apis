package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.ah;
import com.p111d.p112a.p113a.ai;
import com.p111d.p112a.p121c.C1549v;

public final class C1457t {
    protected final C1549v f4555a;
    protected final Class<? extends af<?>> f4556b;
    protected final Class<? extends ah> f4557c;
    protected final Class<?> f4558d;
    protected final boolean f4559e;

    public C1457t(C1549v c1549v, Class<?> cls, Class<? extends af<?>> cls2, Class<? extends ah> cls3) {
        this(c1549v, cls, cls2, false, cls3);
    }

    private C1457t(C1549v c1549v, Class<?> cls, Class<? extends af<?>> cls2, boolean z, Class<? extends ah> cls3) {
        Class cls4;
        this.f4555a = c1549v;
        this.f4558d = cls;
        this.f4556b = cls2;
        this.f4559e = z;
        if (cls3 == null) {
            cls4 = ai.class;
        }
        this.f4557c = cls4;
    }

    public final C1457t m3704a(boolean z) {
        if (this.f4559e == z) {
            return this;
        }
        return new C1457t(this.f4555a, this.f4558d, this.f4556b, z, this.f4557c);
    }

    public final C1549v m3705a() {
        return this.f4555a;
    }

    public final Class<?> m3706b() {
        return this.f4558d;
    }

    public final Class<? extends af<?>> m3707c() {
        return this.f4556b;
    }

    public final Class<? extends ah> m3708d() {
        return this.f4557c;
    }

    public final boolean m3709e() {
        return this.f4559e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ObjectIdInfo: propName=");
        stringBuilder.append(this.f4555a);
        stringBuilder.append(", scope=");
        stringBuilder.append(this.f4558d == null ? "null" : this.f4558d.getName());
        stringBuilder.append(", generatorType=");
        stringBuilder.append(this.f4556b == null ? "null" : this.f4556b.getName());
        stringBuilder.append(", alwaysAsId=");
        stringBuilder.append(this.f4559e);
        return stringBuilder.toString();
    }
}
