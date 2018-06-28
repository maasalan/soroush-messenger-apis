package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1943j;
import com.google.p164b.C1946q;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.C5592m;
import com.google.p164b.p166b.C1930j;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1937c;

public final class C5551l<T> extends C1948t<T> {
    final C1940f f15368a;
    private final C1946q<T> f15369b;
    private final C1943j<T> f15370c;
    private final C1933a<T> f15371d;
    private final C1949u f15372e;
    private final C1912a f15373f = new C1912a();
    private C1948t<T> f15374g;

    private final class C1912a {
        final /* synthetic */ C5551l f6333a;

        private C1912a(C5551l c5551l) {
            this.f6333a = c5551l;
        }
    }

    public C5551l(C1946q<T> c1946q, C1943j<T> c1943j, C1940f c1940f, C1933a<T> c1933a) {
        this.f15369b = c1946q;
        this.f15370c = c1943j;
        this.f15368a = c1940f;
        this.f15371d = c1933a;
        this.f15372e = null;
    }

    private C1948t<T> m12170b() {
        C1948t<T> c1948t = this.f15374g;
        if (c1948t != null) {
            return c1948t;
        }
        c1948t = this.f15368a.m5348a(this.f15372e, this.f15371d);
        this.f15374g = c1948t;
        return c1948t;
    }

    public final T mo1711a(C1935a c1935a) {
        return this.f15370c == null ? m12170b().mo1711a(c1935a) : C1930j.m5283a(c1935a) instanceof C5592m ? null : this.f15370c.m5353a();
    }

    public final void mo1712a(C1937c c1937c, T t) {
        if (this.f15369b == null) {
            m12170b().mo1712a(c1937c, t);
        } else if (t == null) {
            c1937c.mo1743e();
        } else {
            C1930j.m5284a(this.f15369b.m5361a(), c1937c);
        }
    }
}
