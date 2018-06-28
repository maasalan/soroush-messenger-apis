package p050b.p054b.p055a;

import p050b.p054b.C0844q;

public final class C6425p extends C4969a implements C0844q {
    protected boolean f17581c;
    protected int f17582d;

    public C6425p(int i, C4969a c4969a, C6419c c6419c) {
        super(null, new C4969a(c4969a));
        this.f17581c = true;
        this.f17582d = i;
        if (c6419c != null) {
            C4969a.m9816a((C4969a) this, (C0833b) c6419c);
        }
    }

    public C6425p(C4969a c4969a, C4969a c4969a2) {
        super(c4969a, new C4969a(c4969a2));
        this.f17581c = false;
        this.f17582d = 307;
    }

    public static C6425p m15282a(C4969a c4969a, C4969a c4969a2, C6419c c6419c) {
        C4969a c6425p = new C6425p(c4969a, c4969a2);
        c6425p.f17581c = true;
        if (c6419c != null) {
            C4969a.m9816a(c6425p, (C0833b) c6419c);
        }
        return c6425p;
    }

    public final void mo885a(C0834v c0834v) {
        c0834v.mo908a(this);
    }

    protected final String mo2672c() {
        return this.f17581c ? "new[]" : "new";
    }

    public final boolean m15285d() {
        return this.f17581c;
    }

    public final int m15286e() {
        return this.f17582d;
    }

    public final C4969a m15287f() {
        return (C4969a) mo886b().mo883a();
    }

    public final C6419c m15288g() {
        C0833b b = mo886b().mo886b();
        return b == null ? null : (C6419c) b.mo883a();
    }
}
