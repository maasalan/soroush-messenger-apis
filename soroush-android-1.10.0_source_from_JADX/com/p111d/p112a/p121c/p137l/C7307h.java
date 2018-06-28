package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p114b.p119f.C1365a;
import com.p111d.p112a.p121c.C5354j;

public final class C7307h extends C7126j {
    protected final C5354j f21048f;

    private C7307h(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2, Object obj, Object obj2, boolean z) {
        super(cls, c1512l, c5354j, c5354jArr, c5354j2.hashCode(), obj, obj2, z);
        this.f21048f = c5354j2;
    }

    private C7307h m19541E() {
        return this.e ? this : new C7307h(this.a, this.j, this.h, this.i, this.f21048f.mo3385d(), this.c, this.d, true);
    }

    public static C7307h m19542a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2) {
        return new C7307h(cls, c1512l, c5354j, c5354jArr, c5354j2, null, null, false);
    }

    private C7307h m19543h(Object obj) {
        if (obj == this.d) {
            return this;
        }
        return new C7307h(this.a, this.j, this.h, this.i, this.f21048f, this.c, obj, this.e);
    }

    private C7307h m19544i(Object obj) {
        if (obj == this.c) {
            return this;
        }
        return new C7307h(this.a, this.j, this.h, this.i, this.f21048f, obj, this.d, this.e);
    }

    private C7307h m19545j(Object obj) {
        return obj == this.f21048f.mo2930A() ? this : new C7307h(this.a, this.j, this.h, this.i, this.f21048f.mo3384c(obj), this.c, this.d, this.e);
    }

    public final /* synthetic */ C7126j mo3559C() {
        return m19541E();
    }

    protected final String mo3395D() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.getName());
        stringBuilder.append('<');
        stringBuilder.append(this.f21048f.mo2933c());
        return stringBuilder.toString();
    }

    public final C5354j mo3378a(C5354j c5354j) {
        if (this.f21048f == c5354j) {
            return this;
        }
        return new C7307h(this.a, this.j, this.h, this.i, c5354j, this.c, this.d, this.e);
    }

    public final C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return new C7307h(cls, this.j, c5354j, c5354jArr, this.f21048f, this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3380a(Object obj) {
        return m19543h(obj);
    }

    public final StringBuilder mo3381a(StringBuilder stringBuilder) {
        C6522k.m15724a(this.a, stringBuilder);
        stringBuilder.append('<');
        stringBuilder = this.f21048f.mo3381a(stringBuilder);
        stringBuilder.append(';');
        return stringBuilder;
    }

    public final boolean mo3560a() {
        return true;
    }

    public final /* bridge */ /* synthetic */ C1365a mo1458b() {
        return this.f21048f;
    }

    @Deprecated
    protected final C5354j mo3382b(Class<?> cls) {
        return new C7307h(cls, this.j, this.h, this.i, this.f21048f, this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3383b(Object obj) {
        return obj == this.f21048f.mo2931B() ? this : new C7307h(this.a, this.j, this.h, this.i, this.f21048f.mo3380a(obj), this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3384c(Object obj) {
        return m19544i(obj);
    }

    public final /* synthetic */ C5354j mo3385d() {
        return m19541E();
    }

    public final /* synthetic */ C5354j mo3386d(Object obj) {
        return m19545j(obj);
    }

    public final /* synthetic */ C7126j mo3561e(Object obj) {
        return m19545j(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C7307h c7307h = (C7307h) obj;
        return c7307h.a != this.a ? false : this.f21048f.equals(c7307h.f21048f);
    }

    public final /* synthetic */ C7126j mo3562f(Object obj) {
        return m19544i(obj);
    }

    public final /* synthetic */ C7126j mo3563g(Object obj) {
        return m19543h(obj);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("[reference type, class ");
        stringBuilder.append(mo3395D());
        stringBuilder.append('<');
        stringBuilder.append(this.f21048f);
        stringBuilder.append('>');
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final C5354j mo3394u() {
        return this.f21048f;
    }

    public final C5354j mo3564v() {
        return this.f21048f;
    }
}
