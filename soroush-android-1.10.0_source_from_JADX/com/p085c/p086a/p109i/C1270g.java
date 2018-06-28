package com.p085c.p086a.p109i;

public final class C1270g {
    private Class<?> f3977a;
    private Class<?> f3978b;
    private Class<?> f3979c;

    public C1270g(Class<?> cls, Class<?> cls2) {
        m3011a(cls, cls2, null);
    }

    public C1270g(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m3011a(cls, cls2, cls3);
    }

    public final void m3011a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3977a = cls;
        this.f3978b = cls2;
        this.f3979c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1270g c1270g = (C1270g) obj;
        return this.f3977a.equals(c1270g.f3977a) && this.f3978b.equals(c1270g.f3978b) && C1273i.m3023a(this.f3979c, c1270g.f3979c);
    }

    public final int hashCode() {
        return (31 * ((this.f3977a.hashCode() * 31) + this.f3978b.hashCode())) + (this.f3979c != null ? this.f3979c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiClassKey{first=");
        stringBuilder.append(this.f3977a);
        stringBuilder.append(", second=");
        stringBuilder.append(this.f3978b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
