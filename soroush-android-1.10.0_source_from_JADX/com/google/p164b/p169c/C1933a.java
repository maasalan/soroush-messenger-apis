package com.google.p164b.p169c;

import com.google.p164b.p166b.C1914a;
import com.google.p164b.p166b.C1918b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class C1933a<T> {
    public final Class<? super T> f6422a;
    public final Type f6423b;
    final int f6424c;

    protected C1933a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        this.f6423b = C1918b.m5253a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f6422a = C1918b.m5259b(this.f6423b);
        this.f6424c = this.f6423b.hashCode();
    }

    private C1933a(Type type) {
        this.f6423b = C1918b.m5253a((Type) C1914a.m5250a((Object) type));
        this.f6422a = C1918b.m5259b(this.f6423b);
        this.f6424c = this.f6423b.hashCode();
    }

    public static <T> C1933a<T> m5290a(Class<T> cls) {
        return new C1933a(cls);
    }

    public static C1933a<?> m5291a(Type type) {
        return new C1933a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1933a) && C1918b.m5258a(this.f6423b, ((C1933a) obj).f6423b);
    }

    public final int hashCode() {
        return this.f6424c;
    }

    public final String toString() {
        return C1918b.m5262c(this.f6423b);
    }
}
