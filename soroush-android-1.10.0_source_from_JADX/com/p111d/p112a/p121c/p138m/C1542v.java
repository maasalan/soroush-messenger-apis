package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p121c.C5354j;

public final class C1542v {
    protected int f4814a;
    protected Class<?> f4815b;
    protected C5354j f4816c;
    protected boolean f4817d;

    public C1542v(C5354j c5354j, boolean z) {
        this.f4816c = c5354j;
        this.f4815b = null;
        this.f4817d = z;
        this.f4814a = z ? c5354j.hashCode() - 2 : c5354j.hashCode() - 1;
    }

    public C1542v(Class<?> cls, boolean z) {
        this.f4815b = cls;
        this.f4816c = null;
        this.f4817d = z;
        this.f4814a = z ? C1542v.m4041a(cls) : cls.getName().hashCode();
    }

    public static final int m4041a(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public final boolean m4042a() {
        return this.f4817d;
    }

    public final Class<?> m4043b() {
        return this.f4815b;
    }

    public final C5354j m4044c() {
        return this.f4816c;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        C1542v c1542v = (C1542v) obj;
        return c1542v.f4817d == this.f4817d ? this.f4815b != null ? c1542v.f4815b == this.f4815b : this.f4816c.equals(c1542v.f4816c) : false;
    }

    public final int hashCode() {
        return this.f4814a;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        if (this.f4815b != null) {
            stringBuilder = new StringBuilder("{class: ");
            stringBuilder.append(this.f4815b.getName());
        } else {
            stringBuilder = new StringBuilder("{type: ");
            stringBuilder.append(this.f4816c);
        }
        stringBuilder.append(", typed? ");
        stringBuilder.append(this.f4817d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
