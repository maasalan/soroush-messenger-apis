package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C5354j;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

public final class C6498y extends C5328e implements Serializable {
    protected final Class<?> f17727a;
    protected final Class<?> f17728d;
    protected final String f17729e;

    public C6498y(C1463x c1463x, Class<?> cls, String str, Class<?> cls2) {
        super(c1463x, null);
        this.f17727a = cls;
        this.f17728d = cls2;
        this.f17729e = str;
    }

    public final C1449a mo1355a(C5329k c5329k) {
        return this;
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement mo1358a() {
        return null;
    }

    public final void mo2816a(Object obj, Object obj2) {
        StringBuilder stringBuilder = new StringBuilder("Can not set virtual property '");
        stringBuilder.append(this.f17729e);
        stringBuilder.append("'");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final Object mo2817b(Object obj) {
        StringBuilder stringBuilder = new StringBuilder("Can not get virtual property '");
        stringBuilder.append(this.f17729e);
        stringBuilder.append("'");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final String mo1360b() {
        return this.f17729e;
    }

    public final C5354j mo1362c() {
        return this.b.mo1356a(this.f17728d);
    }

    public final Class<?> mo1363d() {
        return this.f17728d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C6498y c6498y = (C6498y) obj;
        return c6498y.f17727a == this.f17727a && c6498y.f17729e.equals(this.f17729e);
    }

    public final int hashCode() {
        return this.f17729e.hashCode();
    }

    public final Class<?> mo2818j() {
        return this.f17727a;
    }

    public final Member mo2819k() {
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[field ");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.f17727a.getName());
        stringBuilder2.append("#");
        stringBuilder2.append(this.f17729e);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
