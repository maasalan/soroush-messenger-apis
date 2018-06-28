package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.p119f.C1365a;
import com.p111d.p112a.p121c.p137l.C1512l;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class C5354j extends C1365a implements Serializable, Type {
    protected final Class<?> f14912a;
    protected final int f14913b;
    protected final Object f14914c;
    protected final Object f14915d;
    protected final boolean f14916e;

    protected C5354j(Class<?> cls, int i, Object obj, Object obj2, boolean z) {
        this.f14912a = cls;
        this.f14913b = cls.getName().hashCode() + i;
        this.f14914c = obj;
        this.f14915d = obj2;
        this.f14916e = z;
    }

    public <T> T mo2930A() {
        return this.f14914c;
    }

    public <T> T mo2931B() {
        return this.f14915d;
    }

    public abstract C5354j mo2932a(int i);

    public abstract C5354j mo3378a(C5354j c5354j);

    @Deprecated
    public final C5354j m11518a(Class<?> cls) {
        if (cls == this.f14912a) {
            return this;
        }
        C5354j b = mo3382b((Class) cls);
        if (this.f14914c != b.mo2930A()) {
            b = b.mo3384c(this.f14914c);
        }
        if (this.f14915d != b.mo2931B()) {
            b = b.mo3380a(this.f14915d);
        }
        return b;
    }

    public abstract C5354j mo3379a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr);

    public abstract C5354j mo3380a(Object obj);

    public abstract StringBuilder mo3381a(StringBuilder stringBuilder);

    public /* synthetic */ C1365a mo1458b() {
        return mo3564v();
    }

    @Deprecated
    public abstract C5354j mo3382b(Class<?> cls);

    public abstract C5354j mo3383b(Object obj);

    public abstract C5354j mo3384c(Object obj);

    public final boolean m11526c(Class<?> cls) {
        return this.f14912a == cls;
    }

    public abstract C5354j mo3385d();

    public abstract C5354j mo3386d(Object obj);

    public final boolean m11529d(Class<?> cls) {
        if (this.f14912a != cls) {
            if (!cls.isAssignableFrom(this.f14912a)) {
                return false;
            }
        }
        return true;
    }

    public abstract C5354j mo2934e(Class<?> cls);

    public final Class<?> m11531e() {
        return this.f14912a;
    }

    public abstract boolean equals(Object obj);

    public boolean mo3388f() {
        return Modifier.isAbstract(this.f14912a.getModifiers());
    }

    public boolean mo3389g() {
        return (this.f14912a.getModifiers() & 1536) == 0 ? true : this.f14912a.isPrimitive();
    }

    public final boolean m11534h() {
        return Throwable.class.isAssignableFrom(this.f14912a);
    }

    public final int hashCode() {
        return this.f14913b;
    }

    public boolean mo3390i() {
        return false;
    }

    public final boolean m11536j() {
        return this.f14912a.isEnum();
    }

    public final boolean m11537k() {
        return this.f14912a.isInterface();
    }

    public final boolean m11538l() {
        return this.f14912a.isPrimitive();
    }

    public final boolean m11539m() {
        return Modifier.isFinal(this.f14912a.getModifiers());
    }

    public abstract boolean mo3391n();

    public boolean mo3396o() {
        return false;
    }

    public boolean mo3397p() {
        return false;
    }

    public final boolean m11543q() {
        return this.f14912a == Object.class;
    }

    public final boolean m11544r() {
        return this.f14916e;
    }

    public boolean mo3392s() {
        return mo2935w() > 0;
    }

    public C5354j mo3398t() {
        return null;
    }

    public abstract String toString();

    public C5354j mo3394u() {
        return null;
    }

    public C5354j mo3564v() {
        return null;
    }

    public abstract int mo2935w();

    public abstract C1512l mo2936x();

    public abstract C5354j mo2937y();

    public abstract List<C5354j> mo2938z();
}
