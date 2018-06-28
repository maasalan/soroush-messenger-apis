package p050b.p054b.p055a;

import p050b.p054b.C0844q;

public final class C6426r extends C4969a implements C0844q {
    protected int f17583c;

    public C6426r(int i) {
        this(i, null);
    }

    public C6426r(int i, C0833b c0833b) {
        super(c0833b);
        this.f17583c = i;
    }

    public C6426r(int i, C0833b c0833b, C4969a c4969a) {
        super(c0833b, c4969a);
        this.f17583c = i;
    }

    public static C6426r m15289a(C0833b c0833b, C0833b c0833b2) {
        return new C6426r(76, c0833b, new C4969a(c0833b2));
    }

    public static C6426r m15290b(C0833b c0833b, C0833b c0833b2, C0833b c0833b3) {
        return new C6426r(343, c0833b, new C4969a(c0833b2, new C4969a(c0833b3)));
    }

    public final void mo885a(C0834v c0834v) {
        c0834v.mo899a(this);
    }

    protected final String mo2672c() {
        StringBuilder stringBuilder;
        if (this.f17583c < 128) {
            stringBuilder = new StringBuilder("stmnt:");
            stringBuilder.append((char) this.f17583c);
        } else {
            stringBuilder = new StringBuilder("stmnt:");
            stringBuilder.append(this.f17583c);
        }
        return stringBuilder.toString();
    }

    public final int m15293d() {
        return this.f17583c;
    }
}
