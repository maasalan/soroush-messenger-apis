package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;
import java.lang.reflect.Array;

public final class C7122a extends C6522k {
    protected final C5354j f20283f;
    protected final Object f20284g;

    private C7122a(C5354j c5354j, C1512l c1512l, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), c1512l, null, null, c5354j.hashCode(), obj2, obj3, z);
        this.f20283f = c5354j;
        this.f20284g = obj;
    }

    public static C7122a m18648a(C5354j c5354j, C1512l c1512l) {
        return new C7122a(c5354j, c1512l, Array.newInstance(c5354j.m11531e(), 0), null, null, false);
    }

    public final C5354j mo3378a(C5354j c5354j) {
        return new C7122a(c5354j, this.j, Array.newInstance(c5354j.m11531e(), 0), this.c, this.d, this.e);
    }

    public final C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return null;
    }

    public final /* synthetic */ C5354j mo3380a(Object obj) {
        if (obj == this.d) {
            return this;
        }
        return new C7122a(this.f20283f, this.j, this.f20284g, this.c, obj, this.e);
    }

    public final StringBuilder mo3381a(StringBuilder stringBuilder) {
        stringBuilder.append('[');
        return this.f20283f.mo3381a(stringBuilder);
    }

    @Deprecated
    protected final C5354j mo3382b(Class<?> cls) {
        throw new UnsupportedOperationException("Can not narrow or widen array types");
    }

    public final /* synthetic */ C5354j mo3383b(Object obj) {
        return obj == this.f20283f.mo2931B() ? this : new C7122a(this.f20283f.mo3380a(obj), this.j, this.f20284g, this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3384c(Object obj) {
        if (obj == this.c) {
            return this;
        }
        return new C7122a(this.f20283f, this.j, this.f20284g, obj, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3385d() {
        return this.e ? this : new C7122a(this.f20283f.mo3385d(), this.j, this.f20284g, this.c, this.d, true);
    }

    public final /* synthetic */ C5354j mo3386d(Object obj) {
        return obj == this.f20283f.mo2930A() ? this : new C7122a(this.f20283f.mo3384c(obj), this.j, this.f20284g, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f20283f.equals(((C7122a) obj).f20283f);
    }

    public final boolean mo3388f() {
        return false;
    }

    public final boolean mo3389g() {
        return true;
    }

    public final boolean mo3390i() {
        return true;
    }

    public final boolean mo3391n() {
        return true;
    }

    public final boolean mo3392s() {
        return this.f20283f.mo3392s();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[array type, component type: ");
        stringBuilder.append(this.f20283f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final C5354j mo3394u() {
        return this.f20283f;
    }
}
