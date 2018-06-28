package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;

public final class C7306g extends C7124f {
    private C7306g(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2, C5354j c5354j3, Object obj, Object obj2, boolean z) {
        super(cls, c1512l, c5354j, c5354jArr, c5354j2, c5354j3, obj, obj2, z);
    }

    private C7306g m19520F() {
        return this.e ? this : new C7306g(this.a, this.j, this.h, this.i, this.f.mo3385d(), this.g.mo3385d(), this.c, this.d, true);
    }

    public static C7306g m19521a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2, C5354j c5354j3) {
        return new C7306g(cls, c1512l, c5354j, c5354jArr, c5354j2, c5354j3, null, null, false);
    }

    private C7306g m19522j(Object obj) {
        return new C7306g(this.a, this.j, this.h, this.i, this.f, this.g, this.c, obj, this.e);
    }

    private C7306g m19523k(Object obj) {
        return new C7306g(this.a, this.j, this.h, this.i, this.f, this.g.mo3380a(obj), this.c, this.d, this.e);
    }

    private C7306g m19524l(Object obj) {
        return new C7306g(this.a, this.j, this.h, this.i, this.f, this.g, obj, this.d, this.e);
    }

    private C7306g m19525m(Object obj) {
        return new C7306g(this.a, this.j, this.h, this.i, this.f, this.g.mo3384c(obj), this.c, this.d, this.e);
    }

    public final /* synthetic */ C7124f mo3552C() {
        return m19520F();
    }

    public final C5354j mo3378a(C5354j c5354j) {
        if (this.g == c5354j) {
            return this;
        }
        return new C7306g(this.a, this.j, this.h, this.i, this.f, c5354j, this.c, this.d, this.e);
    }

    public final C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return new C7306g(cls, c1512l, c5354j, c5354jArr, this.f, this.g, this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3380a(Object obj) {
        return m19522j(obj);
    }

    @Deprecated
    protected final C5354j mo3382b(Class<?> cls) {
        return new C7306g(cls, this.j, this.h, this.i, this.f, this.g, this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3383b(Object obj) {
        return m19523k(obj);
    }

    public final /* synthetic */ C7124f mo3553b(C5354j c5354j) {
        if (c5354j == this.f) {
            return this;
        }
        return new C7306g(this.a, this.j, this.h, this.i, c5354j, this.g, this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3384c(Object obj) {
        return m19524l(obj);
    }

    public final /* synthetic */ C5354j mo3385d() {
        return m19520F();
    }

    public final /* synthetic */ C5354j mo3386d(Object obj) {
        return m19525m(obj);
    }

    public final /* synthetic */ C7124f mo3554e(Object obj) {
        return m19522j(obj);
    }

    public final /* synthetic */ C7124f mo3555f(Object obj) {
        return m19523k(obj);
    }

    public final /* synthetic */ C7124f mo3556g(Object obj) {
        return m19524l(obj);
    }

    public final /* synthetic */ C7124f mo3557h(Object obj) {
        return m19525m(obj);
    }

    public final /* synthetic */ C7124f mo3558i(Object obj) {
        return new C7306g(this.a, this.j, this.h, this.i, this.f.mo3384c(obj), this.g, this.c, this.d, this.e);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[map type; class ");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(", ");
        stringBuilder.append(this.f);
        stringBuilder.append(" -> ");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
