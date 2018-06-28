package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C5354j;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class C7087f extends C6494i implements Serializable {
    protected final transient Method f20199a;
    protected Class<?>[] f20200d;

    public C7087f(C1463x c1463x, Method method, C5329k c5329k, C5329k[] c5329kArr) {
        super(c1463x, c5329k, c5329kArr);
        if (method == null) {
            throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
        }
        this.f20199a = method;
    }

    public final /* synthetic */ C1449a mo1355a(C5329k c5329k) {
        return new C7087f(this.b, this.f20199a, c5329k, this.e);
    }

    public final C7087f m18484a(Method method) {
        return new C7087f(this.b, method, this.c, this.e);
    }

    public final C5354j mo3352a(int i) {
        Type[] genericParameterTypes = this.f20199a.getGenericParameterTypes();
        return i >= genericParameterTypes.length ? null : this.b.mo1356a(genericParameterTypes[i]);
    }

    public final Object mo3353a(Object obj) {
        return this.f20199a.invoke(null, new Object[]{obj});
    }

    public final Object mo3354a(Object[] objArr) {
        return this.f20199a.invoke(null, objArr);
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement mo1358a() {
        return this.f20199a;
    }

    public final void mo2816a(Object obj, Object obj2) {
        StringBuilder stringBuilder;
        try {
            this.f20199a.invoke(obj, new Object[]{obj2});
        } catch (Throwable e) {
            stringBuilder = new StringBuilder("Failed to setValue() with method ");
            stringBuilder.append(m18501n());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder("Failed to setValue() with method ");
            stringBuilder.append(m18501n());
            stringBuilder.append(": ");
            stringBuilder.append(e2.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        }
    }

    public final Object mo2817b(Object obj) {
        StringBuilder stringBuilder;
        try {
            return this.f20199a.invoke(obj, new Object[0]);
        } catch (Throwable e) {
            stringBuilder = new StringBuilder("Failed to getValue() with method ");
            stringBuilder.append(m18501n());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder("Failed to getValue() with method ");
            stringBuilder.append(m18501n());
            stringBuilder.append(": ");
            stringBuilder.append(e2.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        }
    }

    public final String mo1360b() {
        return this.f20199a.getName();
    }

    public final C5354j mo1362c() {
        return this.b.mo1356a(this.f20199a.getGenericReturnType());
    }

    public final Class<?> mo1363d() {
        return this.f20199a.getReturnType();
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && obj.getClass() == getClass() && ((C7087f) obj).f20199a == this.f20199a;
    }

    public final Method m18494f() {
        return this.f20199a;
    }

    public final int mo3355g() {
        return m18502o().length;
    }

    public final Class<?> mo3356h() {
        Class[] o = m18502o();
        return o.length <= 0 ? null : o[0];
    }

    public final int hashCode() {
        return this.f20199a.getName().hashCode();
    }

    public final Object mo3357i() {
        return this.f20199a.invoke(null, new Object[0]);
    }

    public final Class<?> mo2818j() {
        return this.f20199a.getDeclaringClass();
    }

    public final /* bridge */ /* synthetic */ Member mo2819k() {
        return this.f20199a;
    }

    public final Method m18500m() {
        return this.f20199a;
    }

    public final String m18501n() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20199a.getDeclaringClass().getName());
        stringBuilder.append("#");
        stringBuilder.append(this.f20199a.getName());
        stringBuilder.append("(");
        stringBuilder.append(m18502o().length);
        stringBuilder.append(" params)");
        return stringBuilder.toString();
    }

    public final Class<?>[] m18502o() {
        if (this.f20200d == null) {
            this.f20200d = this.f20199a.getParameterTypes();
        }
        return this.f20200d;
    }

    public final Class<?> m18503p() {
        return this.f20199a.getReturnType();
    }

    public final boolean m18504q() {
        Class returnType = this.f20199a.getReturnType();
        return (returnType == Void.TYPE || returnType == Void.class) ? false : true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[method ");
        stringBuilder.append(m18501n());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
