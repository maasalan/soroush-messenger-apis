package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1943j;
import com.google.p164b.C1946q;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.p165a.C1903b;
import com.google.p164b.p166b.C1919c;
import com.google.p164b.p169c.C1933a;

public final class C5537d implements C1949u {
    private final C1919c f15331a;

    public C5537d(C1919c c1919c) {
        this.f15331a = c1919c;
    }

    static C1948t<?> m12110a(C1919c c1919c, C1940f c1940f, C1933a<?> c1933a, C1903b c1903b) {
        C1948t<?> c1948t;
        Object a = c1919c.m5267a(C1933a.m5290a(c1903b.m5234a())).mo1748a();
        if (a instanceof C1948t) {
            c1948t = (C1948t) a;
        } else if (a instanceof C1949u) {
            c1948t = ((C1949u) a).mo1713a(c1940f, c1933a);
        } else {
            boolean z = a instanceof C1946q;
            if (!z) {
                if (!(a instanceof C1943j)) {
                    StringBuilder stringBuilder = new StringBuilder("Invalid attempt to bind an instance of ");
                    stringBuilder.append(a.getClass().getName());
                    stringBuilder.append(" as a @JsonAdapter for ");
                    stringBuilder.append(c1933a.toString());
                    stringBuilder.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            C1943j c1943j = null;
            C1946q c1946q = z ? (C1946q) a : null;
            if (a instanceof C1943j) {
                c1943j = (C1943j) a;
            }
            c1948t = new C5551l(c1946q, c1943j, c1940f, c1933a);
        }
        return (c1948t == null || !c1903b.m5235b()) ? c1948t : c1948t.m5363a();
    }

    public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
        C1903b c1903b = (C1903b) c1933a.f6422a.getAnnotation(C1903b.class);
        return c1903b == null ? null : C5537d.m12110a(this.f15331a, c1940f, c1933a, c1903b);
    }
}
