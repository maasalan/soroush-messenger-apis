package p056c.p057a.p061e;

import p056c.p057a.C0885c;
import p206d.C2272f;

public final class C0888c {
    public static final C2272f f2664a = C2272f.m6191a(":");
    public static final C2272f f2665b = C2272f.m6191a(":status");
    public static final C2272f f2666c = C2272f.m6191a(":method");
    public static final C2272f f2667d = C2272f.m6191a(":path");
    public static final C2272f f2668e = C2272f.m6191a(":scheme");
    public static final C2272f f2669f = C2272f.m6191a(":authority");
    public final C2272f f2670g;
    public final C2272f f2671h;
    final int f2672i;

    public C0888c(C2272f c2272f, C2272f c2272f2) {
        this.f2670g = c2272f;
        this.f2671h = c2272f2;
        this.f2672i = (32 + c2272f.mo2050g()) + c2272f2.mo2050g();
    }

    public C0888c(C2272f c2272f, String str) {
        this(c2272f, C2272f.m6191a(str));
    }

    public C0888c(String str, String str2) {
        this(C2272f.m6191a(str), C2272f.m6191a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0888c) {
            C0888c c0888c = (C0888c) obj;
            if (this.f2670g.equals(c0888c.f2670g) && this.f2671h.equals(c0888c.f2671h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * (527 + this.f2670g.hashCode())) + this.f2671h.hashCode();
    }

    public final String toString() {
        return C0885c.m2092a("%s: %s", this.f2670g.mo2040a(), this.f2671h.mo2040a());
    }
}
