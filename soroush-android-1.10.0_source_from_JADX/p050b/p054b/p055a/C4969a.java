package p050b.p054b.p055a;

public class C4969a extends C0833b {
    public C0833b f13818a;
    public C4969a f13819b;

    public C4969a(C0833b c0833b) {
        this.f13818a = c0833b;
        this.f13819b = null;
    }

    public C4969a(C0833b c0833b, C4969a c4969a) {
        this.f13818a = c0833b;
        this.f13819b = c4969a;
    }

    public static int m9814a(C4969a c4969a) {
        int i = 0;
        if (c4969a == null) {
            return 0;
        }
        while (c4969a != null) {
            c4969a = c4969a.f13819b;
            i++;
        }
        return i;
    }

    public static C4969a m9815a(C4969a c4969a, C4969a c4969a2) {
        if (c4969a == null) {
            return c4969a2;
        }
        C4969a c4969a3 = c4969a;
        while (c4969a3.f13819b != null) {
            c4969a3 = c4969a3.f13819b;
        }
        c4969a3.f13819b = c4969a2;
        return c4969a;
    }

    public static C4969a m9816a(C4969a c4969a, C0833b c0833b) {
        return C4969a.m9815a(c4969a, new C4969a(c0833b));
    }

    public static C4969a m9817a(C0833b c0833b, C0833b c0833b2, C0833b c0833b3) {
        return new C4969a(c0833b, new C4969a(c0833b2, new C4969a(c0833b3)));
    }

    public final C0833b mo883a() {
        return this.f13818a;
    }

    public final void mo884a(C0833b c0833b) {
        this.f13818a = c0833b;
    }

    public void mo885a(C0834v c0834v) {
        c0834v.mo902e();
    }

    public final C0833b mo886b() {
        return this.f13819b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(<");
        stringBuffer.append(mo2672c());
        stringBuffer.append('>');
        for (C4969a c4969a = this; c4969a != null; c4969a = c4969a.f13819b) {
            stringBuffer.append(' ');
            C0833b c0833b = c4969a.f13818a;
            stringBuffer.append(c0833b == null ? "<null>" : c0833b.toString());
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
