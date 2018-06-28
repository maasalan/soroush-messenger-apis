package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C5354j;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class C7086c extends C6494i {
    protected final Constructor<?> f20198a;

    public C7086c(C1463x c1463x, Constructor<?> constructor, C5329k c5329k, C5329k[] c5329kArr) {
        super(c1463x, c5329k, c5329kArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.f20198a = constructor;
    }

    public final /* synthetic */ C1449a mo1355a(C5329k c5329k) {
        return new C7086c(this.b, this.f20198a, c5329k, this.e);
    }

    public final C5354j mo3352a(int i) {
        Type[] genericParameterTypes = this.f20198a.getGenericParameterTypes();
        return i >= genericParameterTypes.length ? null : this.b.mo1356a(genericParameterTypes[i]);
    }

    public final Object mo3353a(Object obj) {
        return this.f20198a.newInstance(new Object[]{obj});
    }

    public final Object mo3354a(Object[] objArr) {
        return this.f20198a.newInstance(objArr);
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement mo1358a() {
        return this.f20198a;
    }

    public final void mo2816a(Object obj, Object obj2) {
        StringBuilder stringBuilder = new StringBuilder("Cannot call setValue() on constructor of ");
        stringBuilder.append(this.f20198a.getDeclaringClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final Object mo2817b(Object obj) {
        StringBuilder stringBuilder = new StringBuilder("Cannot call getValue() on constructor of ");
        stringBuilder.append(this.f20198a.getDeclaringClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final String mo1360b() {
        return this.f20198a.getName();
    }

    public final C5354j mo1362c() {
        return this.b.mo1356a(this.f20198a.getDeclaringClass());
    }

    public final Class<?> mo1363d() {
        return this.f20198a.getDeclaringClass();
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && obj.getClass() == getClass() && ((C7086c) obj).f20198a == this.f20198a;
    }

    public final Constructor<?> m18477f() {
        return this.f20198a;
    }

    public final int mo3355g() {
        return this.f20198a.getParameterTypes().length;
    }

    public final Class<?> mo3356h() {
        Class[] parameterTypes = this.f20198a.getParameterTypes();
        return parameterTypes.length <= 0 ? null : parameterTypes[0];
    }

    public final int hashCode() {
        return this.f20198a.getName().hashCode();
    }

    public final Object mo3357i() {
        return this.f20198a.newInstance(new Object[0]);
    }

    public final Class<?> mo2818j() {
        return this.f20198a.getDeclaringClass();
    }

    public final Member mo2819k() {
        return this.f20198a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[constructor for ");
        stringBuilder.append(this.f20198a.getName());
        stringBuilder.append(", annotations: ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
