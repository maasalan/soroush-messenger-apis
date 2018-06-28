package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;
import java.util.Map;

public class C7124f extends C6522k {
    protected final C5354j f20286f;
    protected final C5354j f20287g;

    protected C7124f(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2, C5354j c5354j3, Object obj, Object obj2, boolean z) {
        super(cls, c1512l, c5354j, c5354jArr, c5354j2.hashCode() ^ c5354j3.hashCode(), obj, obj2, z);
        this.f20286f = c5354j2;
        this.f20287g = c5354j3;
    }

    public C7124f mo3552C() {
        return this.e ? this : new C7124f(this.a, this.j, this.h, this.i, this.f20286f, this.f20287g.mo3385d(), this.c, this.d, true);
    }

    protected final String mo3395D() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.getName());
        if (this.f20286f != null) {
            stringBuilder.append('<');
            stringBuilder.append(this.f20286f.mo2933c());
            stringBuilder.append(',');
            stringBuilder.append(this.f20287g.mo2933c());
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    public final boolean m18685E() {
        return Map.class.isAssignableFrom(this.a);
    }

    public C5354j mo3378a(C5354j c5354j) {
        if (this.f20287g == c5354j) {
            return this;
        }
        return new C7124f(this.a, this.j, this.h, this.i, this.f20286f, c5354j, this.c, this.d, this.e);
    }

    public C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return new C7124f(cls, c1512l, c5354j, c5354jArr, this.f20286f, this.f20287g, this.c, this.d, this.e);
    }

    public /* synthetic */ C5354j mo3380a(Object obj) {
        return mo3554e(obj);
    }

    public final StringBuilder mo3381a(StringBuilder stringBuilder) {
        C6522k.m15724a(this.a, stringBuilder);
        stringBuilder.append('<');
        this.f20286f.mo3381a(stringBuilder);
        this.f20287g.mo3381a(stringBuilder);
        stringBuilder.append(">;");
        return stringBuilder;
    }

    @Deprecated
    protected C5354j mo3382b(Class<?> cls) {
        return new C7124f(cls, this.j, this.h, this.i, this.f20286f, this.f20287g, this.c, this.d, this.e);
    }

    public /* synthetic */ C5354j mo3383b(Object obj) {
        return mo3555f(obj);
    }

    public C7124f mo3553b(C5354j c5354j) {
        if (c5354j == this.f20286f) {
            return this;
        }
        return new C7124f(this.a, this.j, this.h, this.i, c5354j, this.f20287g, this.c, this.d, this.e);
    }

    public /* synthetic */ C5354j mo3384c(Object obj) {
        return mo3556g(obj);
    }

    public /* synthetic */ C5354j mo3385d() {
        return mo3552C();
    }

    public /* synthetic */ C5354j mo3386d(Object obj) {
        return mo3557h(obj);
    }

    public C7124f mo3554e(Object obj) {
        return new C7124f(this.a, this.j, this.h, this.i, this.f20286f, this.f20287g, this.c, obj, this.e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C7124f c7124f = (C7124f) obj;
        return this.a == c7124f.a && this.f20286f.equals(c7124f.f20286f) && this.f20287g.equals(c7124f.f20287g);
    }

    public C7124f mo3555f(Object obj) {
        return new C7124f(this.a, this.j, this.h, this.i, this.f20286f, this.f20287g.mo3380a(obj), this.c, this.d, this.e);
    }

    public C7124f mo3556g(Object obj) {
        return new C7124f(this.a, this.j, this.h, this.i, this.f20286f, this.f20287g, obj, this.d, this.e);
    }

    public C7124f mo3557h(Object obj) {
        return new C7124f(this.a, this.j, this.h, this.i, this.f20286f, this.f20287g.mo3384c(obj), this.c, this.d, this.e);
    }

    public C7124f mo3558i(Object obj) {
        return new C7124f(this.a, this.j, this.h, this.i, this.f20286f.mo3384c(obj), this.f20287g, this.c, this.d, this.e);
    }

    public final boolean mo3391n() {
        return true;
    }

    public final boolean mo3397p() {
        return true;
    }

    public final C5354j mo3398t() {
        return this.f20286f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[map-like type; class ");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(", ");
        stringBuilder.append(this.f20286f);
        stringBuilder.append(" -> ");
        stringBuilder.append(this.f20287g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final C5354j mo3394u() {
        return this.f20287g;
    }
}
