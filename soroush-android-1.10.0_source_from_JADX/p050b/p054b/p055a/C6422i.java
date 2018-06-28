package p050b.p054b.p055a;

import p050b.p054b.C0844q;

public final class C6422i extends C4969a implements C0844q {
    protected int f17575c;
    protected int f17576d;
    protected int f17577e;
    protected String f17578f;

    public C6422i(int i, int i2) {
        super(null);
        this.f17575c = i;
        this.f17576d = i2;
        this.f17577e = -1;
        this.f17578f = null;
    }

    public C6422i(int i, String str, int i2, int i3, C4975t c4975t) {
        super(null);
        this.f17575c = i;
        this.f17576d = i2;
        this.f17577e = i3;
        this.f17578f = str;
        mo884a((C0833b) c4975t);
        C4969a.m9816a((C4969a) this, null);
    }

    public C6422i(C4969a c4969a, int i) {
        super(null);
        this.f17575c = 307;
        this.f17576d = i;
        this.f17577e = -1;
        this.f17578f = C6422i.m15261a(c4969a, '/');
    }

    public static String m15261a(C4969a c4969a, char c) {
        if (c4969a == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        C6422i.m15262a(stringBuffer, c4969a, c);
        return stringBuffer.toString();
    }

    private static void m15262a(StringBuffer stringBuffer, C4969a c4969a, char c) {
        while (true) {
            C0833b c0833b = c4969a.f13818a;
            if (c0833b instanceof C4975t) {
                stringBuffer.append(((C4975t) c0833b).m9844d());
            } else if (c0833b instanceof C4969a) {
                C6422i.m15262a(stringBuffer, (C4969a) c0833b, c);
            }
            c4969a = c4969a.f13819b;
            if (c4969a != null) {
                stringBuffer.append(c);
            } else {
                return;
            }
        }
    }

    public final C6422i m15263a(C4975t c4975t, int i, C0833b c0833b) {
        C4969a c6422i = new C6422i(this.f17575c, this.f17576d + i);
        c6422i.f17578f = this.f17578f;
        c6422i.mo884a((C0833b) c4975t);
        C4969a.m9816a(c6422i, c0833b);
        return c6422i;
    }

    public final void m15264a(int i) {
        this.f17576d += i;
    }

    public final void mo885a(C0834v c0834v) {
        c0834v.mo893a(this);
    }

    public final void m15266a(String str) {
        this.f17578f = str;
    }

    public final void m15267b(int i) {
        this.f17577e = i;
    }

    public final String mo2672c() {
        return "decl";
    }

    public final int m15269d() {
        return this.f17575c;
    }

    public final int m15270e() {
        return this.f17576d;
    }

    public final String m15271f() {
        return this.f17578f;
    }

    public final int m15272g() {
        return this.f17577e;
    }
}
