package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;

public class C7126j extends C6522k {
    protected C7126j(Class<?> cls) {
        this(cls, C1512l.m3899a(), null, null);
    }

    protected C7126j(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        this(cls, c1512l, c5354j, c5354jArr, null, null, false);
    }

    protected C7126j(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, c1512l, c5354j, c5354jArr, i, obj, obj2, z);
    }

    private C7126j(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, Object obj, Object obj2, boolean z) {
        super(cls, c1512l, c5354j, c5354jArr, 0, obj, obj2, z);
    }

    public static C7126j m18716f(Class<?> cls) {
        return new C7126j(cls, null, null, null, null, null, false);
    }

    public C7126j mo3559C() {
        return this.e ? this : new C7126j(this.a, this.j, this.h, this.i, this.c, this.d, true);
    }

    protected String mo3395D() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.getName());
        int length = this.j.f4701b.length;
        if (length > 0) {
            stringBuilder.append('<');
            for (int i = 0; i < length; i++) {
                C5354j a = mo2932a(i);
                if (i > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(a.mo2933c());
            }
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    public C5354j mo3378a(C5354j c5354j) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContentType()");
    }

    public C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return null;
    }

    public /* synthetic */ C5354j mo3380a(Object obj) {
        return mo3563g(obj);
    }

    public StringBuilder mo3381a(StringBuilder stringBuilder) {
        C6522k.m15724a(this.a, stringBuilder);
        int length = this.j.f4701b.length;
        if (length > 0) {
            stringBuilder.append('<');
            for (int i = 0; i < length; i++) {
                stringBuilder = mo2932a(i).mo3381a(stringBuilder);
            }
            stringBuilder.append('>');
        }
        stringBuilder.append(';');
        return stringBuilder;
    }

    @Deprecated
    protected C5354j mo3382b(Class<?> cls) {
        if (this.a == cls) {
            return this;
        }
        return new C7126j(cls, this.j, this, this.i, this.c, this.d, this.e);
    }

    public C5354j mo3383b(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
    }

    public /* synthetic */ C5354j mo3384c(Object obj) {
        return mo3562f(obj);
    }

    public /* synthetic */ C5354j mo3385d() {
        return mo3559C();
    }

    public /* synthetic */ C5354j mo3386d(Object obj) {
        return mo3561e(obj);
    }

    public C7126j mo3561e(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C7126j c7126j = (C7126j) obj;
        return c7126j.a != this.a ? false : this.j.equals(c7126j.j);
    }

    public C7126j mo3562f(Object obj) {
        if (obj == this.c) {
            return this;
        }
        return new C7126j(this.a, this.j, this.h, this.i, obj, this.d, this.e);
    }

    public C7126j mo3563g(Object obj) {
        if (this.d == obj) {
            return this;
        }
        return new C7126j(this.a, this.j, this.h, this.i, this.c, obj, this.e);
    }

    public final boolean mo3391n() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("[simple type, class ");
        stringBuilder.append(mo3395D());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
