package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C5354j;
import java.lang.annotation.Annotation;

public abstract class C6494i extends C5328e {
    protected final C5329k[] f17723e;

    protected C6494i(C1463x c1463x, C5329k c5329k, C5329k[] c5329kArr) {
        super(c1463x, c5329k);
        this.f17723e = c5329kArr;
    }

    protected final C6493h m15591a(int i, C5329k c5329k) {
        this.f17723e[i] = c5329k;
        return m15596b(i);
    }

    public abstract C5354j mo3352a(int i);

    public abstract Object mo3353a(Object obj);

    public abstract Object mo3354a(Object[] objArr);

    public final void m15595a(int i, Annotation annotation) {
        C5329k c5329k = this.f17723e[i];
        if (c5329k == null) {
            c5329k = new C5329k();
            this.f17723e[i] = c5329k;
        }
        c5329k.m11295b(annotation);
    }

    public final C6493h m15596b(int i) {
        C5354j a = mo3352a(i);
        C5329k c5329k = (this.f17723e == null || i < 0 || i >= this.f17723e.length) ? null : this.f17723e[i];
        return new C6493h(this, a, c5329k, i);
    }

    public abstract int mo3355g();

    public abstract Class<?> mo3356h();

    public abstract Object mo3357i();
}
