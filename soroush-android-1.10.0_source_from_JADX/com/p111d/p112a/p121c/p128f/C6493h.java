package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C5354j;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class C6493h extends C5328e {
    protected final C6494i f17720a;
    protected final C5354j f17721d;
    protected final int f17722e;

    public C6493h(C6494i c6494i, C5354j c5354j, C5329k c5329k, int i) {
        super(c6494i == null ? null : c6494i.m11287l(), c5329k);
        this.f17720a = c6494i;
        this.f17721d = c5354j;
        this.f17722e = i;
    }

    public final /* bridge */ /* synthetic */ C1449a mo1355a(C5329k c5329k) {
        return c5329k == this.c ? this : this.f17720a.m15591a(this.f17722e, c5329k);
    }

    public final AnnotatedElement mo1358a() {
        return null;
    }

    public final void mo2816a(Object obj, Object obj2) {
        StringBuilder stringBuilder = new StringBuilder("Cannot call setValue() on constructor parameter of ");
        stringBuilder.append(this.f17720a.mo2818j().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final Object mo2817b(Object obj) {
        StringBuilder stringBuilder = new StringBuilder("Cannot call getValue() on constructor parameter of ");
        stringBuilder.append(this.f17720a.mo2818j().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final String mo1360b() {
        return "";
    }

    public final C5354j mo1362c() {
        return this.b.mo1356a(this.f17721d);
    }

    public final Class<?> mo1363d() {
        return this.f17721d.m11531e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C6493h c6493h = (C6493h) obj;
        return c6493h.f17720a.equals(this.f17720a) && c6493h.f17722e == this.f17722e;
    }

    public final Type m15586f() {
        return this.f17721d;
    }

    public final C6494i m15587g() {
        return this.f17720a;
    }

    public final int m15588h() {
        return this.f17722e;
    }

    public final int hashCode() {
        return this.f17720a.hashCode() + this.f17722e;
    }

    public final Class<?> mo2818j() {
        return this.f17720a.mo2818j();
    }

    public final Member mo2819k() {
        return this.f17720a.mo2819k();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[parameter #");
        stringBuilder.append(this.f17722e);
        stringBuilder.append(", annotations: ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
