package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;

public final class C7305e extends C7123d {
    private C7305e(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2, Object obj, Object obj2, boolean z) {
        super(cls, c1512l, c5354j, c5354jArr, c5354j2, obj, obj2, z);
    }

    private C7305e m19501F() {
        return this.e ? this : new C7305e(this.a, this.j, this.h, this.i, this.f.mo3385d(), this.c, this.d, true);
    }

    public static C7305e m19502a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, C5354j c5354j2) {
        return new C7305e(cls, c1512l, c5354j, c5354jArr, c5354j2, null, null, false);
    }

    private C7305e m19503i(Object obj) {
        return new C7305e(this.a, this.j, this.h, this.i, this.f, this.c, obj, this.e);
    }

    private C7305e m19504j(Object obj) {
        return new C7305e(this.a, this.j, this.h, this.i, this.f.mo3380a(obj), this.c, this.d, this.e);
    }

    private C7305e m19505k(Object obj) {
        return new C7305e(this.a, this.j, this.h, this.i, this.f, obj, this.d, this.e);
    }

    private C7305e m19506l(Object obj) {
        return new C7305e(this.a, this.j, this.h, this.i, this.f.mo3384c(obj), this.c, this.d, this.e);
    }

    public final /* synthetic */ C7123d mo3547C() {
        return m19501F();
    }

    public final C5354j mo3378a(C5354j c5354j) {
        if (this.f == c5354j) {
            return this;
        }
        return new C7305e(this.a, this.j, this.h, this.i, c5354j, this.c, this.d, this.e);
    }

    public final C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return new C7305e(cls, c1512l, c5354j, c5354jArr, this.f, this.c, this.d, this.e);
    }

    public final /* synthetic */ C5354j mo3380a(Object obj) {
        return m19503i(obj);
    }

    @Deprecated
    protected final C5354j mo3382b(Class<?> cls) {
        return new C7305e(cls, this.j, this.h, this.i, this.f, null, null, this.e);
    }

    public final /* synthetic */ C5354j mo3383b(Object obj) {
        return m19504j(obj);
    }

    public final /* synthetic */ C5354j mo3384c(Object obj) {
        return m19505k(obj);
    }

    public final /* synthetic */ C5354j mo3385d() {
        return m19501F();
    }

    public final /* synthetic */ C5354j mo3386d(Object obj) {
        return m19506l(obj);
    }

    public final /* synthetic */ C7123d mo3548e(Object obj) {
        return m19503i(obj);
    }

    public final /* synthetic */ C7123d mo3549f(Object obj) {
        return m19504j(obj);
    }

    public final /* synthetic */ C7123d mo3550g(Object obj) {
        return m19505k(obj);
    }

    public final /* synthetic */ C7123d mo3551h(Object obj) {
        return m19506l(obj);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[collection type; class ");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(", contains ");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
