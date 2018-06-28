package p050b.p054b.p055a;

import p050b.p054b.C0844q;

public class C6420g extends C4969a implements C0844q {
    protected int f17573c;
    protected int f17574d;

    public C6420g(int i, int i2, C0833b c0833b) {
        super(null, new C4969a(c0833b));
        this.f17573c = i;
        this.f17574d = i2;
    }

    public C6420g(C4969a c4969a, int i, C0833b c0833b) {
        super(c4969a, new C4969a(c0833b));
        this.f17573c = 307;
        this.f17574d = i;
    }

    public void mo885a(C0834v c0834v) {
        c0834v.mo891a(this);
    }

    public String mo2672c() {
        StringBuilder stringBuilder = new StringBuilder("cast:");
        stringBuilder.append(this.f17573c);
        stringBuilder.append(":");
        stringBuilder.append(this.f17574d);
        return stringBuilder.toString();
    }

    public final int m15256d() {
        return this.f17573c;
    }

    public final int m15257e() {
        return this.f17574d;
    }
}
