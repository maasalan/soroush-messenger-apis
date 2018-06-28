package p050b.p054b.p055a;

import p050b.p054b.C0844q;

public class C6423k extends C4969a implements C0844q {
    protected int f17579d;

    private C6423k(int i, C0833b c0833b) {
        super(c0833b);
        this.f17579d = i;
    }

    C6423k(int i, C0833b c0833b, C4969a c4969a) {
        super(c0833b, c4969a);
        this.f17579d = i;
    }

    public static C6423k m15273a(int i, C0833b c0833b) {
        return new C6423k(i, c0833b);
    }

    public static C6423k m15274b(int i, C0833b c0833b, C0833b c0833b2) {
        return new C6423k(i, c0833b, new C4969a(c0833b2));
    }

    public final void m15275a(int i) {
        this.f17579d = i;
    }

    public void mo885a(C0834v c0834v) {
        c0834v.mo895a(this);
    }

    protected final String mo2672c() {
        StringBuilder stringBuilder = new StringBuilder("op:");
        stringBuilder.append(m15280f());
        return stringBuilder.toString();
    }

    public final int m15278d() {
        return this.f17579d;
    }

    public final void m15279e() {
        mo886b().mo884a(null);
    }

    public final String m15280f() {
        int i = this.f17579d;
        return i < 128 ? String.valueOf((char) i) : (350 > i || i > 371) ? i == 323 ? "instanceof" : String.valueOf(i) : a_[i - 350];
    }
}
