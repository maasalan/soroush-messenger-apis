package com.p111d.p112a.p121c.p131i;

import java.io.Serializable;

public final class C1472a implements Serializable {
    protected final Class<?> f4612a;
    protected final int f4613b;
    protected String f4614c;

    public C1472a(Class<?> cls) {
        this(cls, null);
    }

    public C1472a(Class<?> cls, String str) {
        this.f4612a = cls;
        this.f4613b = cls.getName().hashCode();
        if (str == null || str.length() == 0) {
            str = null;
        }
        this.f4614c = str;
    }

    public final Class<?> m3762a() {
        return this.f4612a;
    }

    public final String m3763b() {
        return this.f4614c;
    }

    public final boolean m3764c() {
        return this.f4614c != null;
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && obj.getClass() == getClass() && this.f4612a == ((C1472a) obj).f4612a;
    }

    public final int hashCode() {
        return this.f4613b;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("[NamedType, class ");
        stringBuilder.append(this.f4612a.getName());
        stringBuilder.append(", name: ");
        if (this.f4614c == null) {
            str = "null";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("'");
            stringBuilder2.append(this.f4614c);
            stringBuilder2.append("'");
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
