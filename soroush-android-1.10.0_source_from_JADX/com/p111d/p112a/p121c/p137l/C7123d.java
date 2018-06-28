package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;
import java.util.Collection;

public class C7123d extends C6522k {
    protected final C5354j f20285f;

    protected C7123d(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2, Object obj, Object obj2, boolean z) {
        super(cls, c1512l, c5354j, c5354jArr, c5354j2.hashCode(), obj, obj2, z);
        this.f20285f = c5354j2;
    }

    public C7123d mo3547C() {
        return this.e ? this : new C7123d(this.a, this.j, this.h, this.i, this.f20285f.mo3385d(), this.c, this.d, true);
    }

    protected final String mo3395D() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.getName());
        if (this.f20285f != null) {
            stringBuilder.append('<');
            stringBuilder.append(this.f20285f.mo2933c());
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    public final boolean m18666E() {
        return Collection.class.isAssignableFrom(this.a);
    }

    public C5354j mo3378a(C5354j c5354j) {
        if (this.f20285f == c5354j) {
            return this;
        }
        return new C7123d(this.a, this.j, this.h, this.i, c5354j, this.c, this.d, this.e);
    }

    public C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return new C7123d(cls, c1512l, c5354j, c5354jArr, this.f20285f, this.c, this.d, this.e);
    }

    public /* synthetic */ C5354j mo3380a(Object obj) {
        return mo3548e(obj);
    }

    public final StringBuilder mo3381a(StringBuilder stringBuilder) {
        C6522k.m15724a(this.a, stringBuilder);
        stringBuilder.append('<');
        this.f20285f.mo3381a(stringBuilder);
        stringBuilder.append(">;");
        return stringBuilder;
    }

    @Deprecated
    protected C5354j mo3382b(Class<?> cls) {
        return new C7123d(cls, this.j, this.h, this.i, this.f20285f, this.c, this.d, this.e);
    }

    public /* synthetic */ C5354j mo3383b(Object obj) {
        return mo3549f(obj);
    }

    public /* synthetic */ C5354j mo3384c(Object obj) {
        return mo3550g(obj);
    }

    public /* synthetic */ C5354j mo3385d() {
        return mo3547C();
    }

    public /* synthetic */ C5354j mo3386d(Object obj) {
        return mo3551h(obj);
    }

    public C7123d mo3548e(Object obj) {
        return new C7123d(this.a, this.j, this.h, this.i, this.f20285f, this.c, obj, this.e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C7123d c7123d = (C7123d) obj;
        return this.a == c7123d.a && this.f20285f.equals(c7123d.f20285f);
    }

    public C7123d mo3549f(Object obj) {
        return new C7123d(this.a, this.j, this.h, this.i, this.f20285f.mo3380a(obj), this.c, this.d, this.e);
    }

    public C7123d mo3550g(Object obj) {
        return new C7123d(this.a, this.j, this.h, this.i, this.f20285f, obj, this.d, this.e);
    }

    public C7123d mo3551h(Object obj) {
        return new C7123d(this.a, this.j, this.h, this.i, this.f20285f.mo3384c(obj), this.c, this.d, this.e);
    }

    public final boolean mo3391n() {
        return true;
    }

    public final boolean mo3396o() {
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[collection-like type; class ");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(", contains ");
        stringBuilder.append(this.f20285f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final C5354j mo3394u() {
        return this.f20285f;
    }
}
