package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;

public final class C7125i extends C6522k {
    protected C5354j f20288f;

    public C7125i(Class<?> cls, C1512l c1512l) {
        super(cls, c1512l, null, null, 0, null, null, false);
    }

    public final C5354j mo3378a(C5354j c5354j) {
        return this;
    }

    public final C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return null;
    }

    public final C5354j mo3380a(Object obj) {
        return this;
    }

    public final StringBuilder mo3381a(StringBuilder stringBuilder) {
        return this.f20288f.mo3381a(stringBuilder);
    }

    @Deprecated
    protected final C5354j mo3382b(Class<?> cls) {
        return this;
    }

    public final C5354j mo3383b(Object obj) {
        return this;
    }

    public final void m18711b(C5354j c5354j) {
        if (this.f20288f != null) {
            StringBuilder stringBuilder = new StringBuilder("Trying to re-set self reference; old value = ");
            stringBuilder.append(this.f20288f);
            stringBuilder.append(", new = ");
            stringBuilder.append(c5354j);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f20288f = c5354j;
    }

    public final C5354j mo3384c(Object obj) {
        return this;
    }

    public final C5354j mo3385d() {
        return this;
    }

    public final C5354j mo3386d(Object obj) {
        return this;
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : (obj != null && obj.getClass() == getClass()) ? ((C7125i) obj).f20288f.equals(this.f20288f) : false;
    }

    public final boolean mo3391n() {
        return false;
    }

    public final String toString() {
        return null;
    }
}
