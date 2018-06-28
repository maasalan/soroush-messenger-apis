package com.p085c.p086a.p089c.p092b;

import android.support.v4.p038g.C0480k.C0479a;
import com.p085c.p086a.p109i.p110a.C1262a;
import com.p085c.p086a.p109i.p110a.C1262a.C1259a;
import com.p085c.p086a.p109i.p110a.C1262a.C1260c;
import com.p085c.p086a.p109i.p110a.C1263b;
import com.p085c.p086a.p109i.p110a.C1263b.C5282a;

final class C5154r<Z> implements C1159s<Z>, C1260c {
    private static final C0479a<C5154r<?>> f14442a = C1262a.m2983a(20, new C51531());
    private final C1263b f14443b = new C5282a();
    private C1159s<Z> f14444c;
    private boolean f14445d;
    private boolean f14446e;

    static class C51531 implements C1259a<C5154r<?>> {
        C51531() {
        }

        public final /* synthetic */ Object mo1156a() {
            return new C5154r();
        }
    }

    C5154r() {
    }

    static <Z> C5154r<Z> m10626a(C1159s<Z> c1159s) {
        C5154r<Z> c5154r = (C5154r) f14442a.mo308a();
        c5154r.f14446e = false;
        c5154r.f14445d = true;
        c5154r.f14444c = c1159s;
        return c5154r;
    }

    public final Class<Z> mo1179a() {
        return this.f14444c.mo1179a();
    }

    public final Z mo1180b() {
        return this.f14444c.mo1180b();
    }

    public final C1263b b_() {
        return this.f14443b;
    }

    public final int mo1181c() {
        return this.f14444c.mo1181c();
    }

    public final synchronized void mo1182d() {
        this.f14443b.mo1247a();
        this.f14446e = true;
        if (!this.f14445d) {
            this.f14444c.mo1182d();
            this.f14444c = null;
            f14442a.mo309a(this);
        }
    }

    public final synchronized void m10631e() {
        this.f14443b.mo1247a();
        if (this.f14445d) {
            this.f14445d = false;
            if (this.f14446e) {
                mo1182d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
