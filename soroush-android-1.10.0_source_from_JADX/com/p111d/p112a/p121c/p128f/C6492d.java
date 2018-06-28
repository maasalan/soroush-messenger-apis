package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C5354j;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public final class C6492d extends C5328e implements Serializable {
    protected final transient Field f17719a;

    public C6492d(C1463x c1463x, Field field, C5329k c5329k) {
        super(c1463x, c5329k);
        this.f17719a = field;
    }

    public final /* synthetic */ C1449a mo1355a(C5329k c5329k) {
        return new C6492d(this.b, this.f17719a, c5329k);
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement mo1358a() {
        return this.f17719a;
    }

    public final void mo2816a(Object obj, Object obj2) {
        try {
            this.f17719a.set(obj, obj2);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to setValue() for field ");
            stringBuilder.append(m15575h());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    public final Object mo2817b(Object obj) {
        try {
            return this.f17719a.get(obj);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to getValue() for field ");
            stringBuilder.append(m15575h());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    public final String mo1360b() {
        return this.f17719a.getName();
    }

    public final C5354j mo1362c() {
        return this.b.mo1356a(this.f17719a.getGenericType());
    }

    public final Class<?> mo1363d() {
        return this.f17719a.getType();
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && obj.getClass() == getClass() && ((C6492d) obj).f17719a == this.f17719a;
    }

    public final Field m15573f() {
        return this.f17719a;
    }

    public final int m15574g() {
        return this.f17719a.getModifiers();
    }

    public final String m15575h() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f17719a.getDeclaringClass().getName());
        stringBuilder.append("#");
        stringBuilder.append(this.f17719a.getName());
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return this.f17719a.getName().hashCode();
    }

    public final boolean m15576i() {
        return Modifier.isTransient(this.f17719a.getModifiers());
    }

    public final Class<?> mo2818j() {
        return this.f17719a.getDeclaringClass();
    }

    public final Member mo2819k() {
        return this.f17719a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[field ");
        stringBuilder.append(m15575h());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
