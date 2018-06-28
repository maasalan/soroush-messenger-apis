package p050b.p051a;

import java.io.DataInputStream;
import java.util.ArrayList;
import p050b.C0848e;
import p050b.p051a.p053b.C6408b;

public final class an {
    public static boolean f2403g = false;
    public C0827p f2404a;
    public int f2405b;
    int f2406c;
    String f2407d;
    int f2408e;
    public ArrayList f2409f;

    private an(C0827p c0827p) {
        this.f2404a = c0827p;
        this.f2409f = null;
    }

    an(C0827p c0827p, DataInputStream dataInputStream) {
        this(c0827p);
        this.f2405b = dataInputStream.readUnsignedShort();
        this.f2406c = dataInputStream.readUnsignedShort();
        this.f2408e = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f2409f = new ArrayList();
        for (int i = 0; i < readUnsignedShort; i++) {
            this.f2409f.add(C0814d.m1820a(this.f2404a, dataInputStream));
        }
    }

    public an(C0827p c0827p, String str, String str2) {
        this(c0827p);
        this.f2405b = 0;
        this.f2406c = c0827p.m1883c(str);
        this.f2407d = str;
        this.f2408e = this.f2404a.m1883c(str2);
    }

    public final C0814d m1743a(String str) {
        return C0814d.m1821a(this.f2409f, str);
    }

    public final String m1744a() {
        if (this.f2407d == null) {
            this.f2407d = this.f2404a.m1892j(this.f2406c);
        }
        return this.f2407d;
    }

    public final void m1745a(C0814d c0814d) {
        if (this.f2409f == null) {
            this.f2409f = new ArrayList();
        }
        C0814d.m1824b(this.f2409f, c0814d.m1826a());
        this.f2409f.add(c0814d);
    }

    public final void m1746a(C4956l c4956l) {
        C0814d.m1824b(this.f2409f, "Code");
        if (this.f2409f == null) {
            this.f2409f = new ArrayList();
        }
        this.f2409f.add(c4956l);
    }

    public final void m1747a(C0848e c0848e, C0819j c0819j) {
        C4956l f;
        if (c0819j.f2449a >= 50) {
            f = m1752f();
            if (f != null) {
                aw a = C6408b.m15172a(c0848e, this);
                C0814d.m1824b(f.f13801g, "StackMapTable");
                if (a != null) {
                    f.f13801g.add(a);
                }
            }
        }
        if (f2403g) {
            f = m1752f();
            if (f != null) {
                av b = C6408b.m15186b(c0848e, this);
                C0814d.m1824b(f.f13801g, "StackMap");
                if (b != null) {
                    f.f13801g.add(b);
                }
            }
        }
    }

    public final boolean m1748b() {
        return m1744a().equals("<init>");
    }

    public final boolean m1749c() {
        return m1744a().equals("<clinit>");
    }

    public final String m1750d() {
        return this.f2404a.m1892j(this.f2408e);
    }

    public final C4968y m1751e() {
        return (C4968y) C0814d.m1821a(this.f2409f, "Exceptions");
    }

    public final C4956l m1752f() {
        return (C4956l) C0814d.m1821a(this.f2409f, "Code");
    }

    public final void m1753g() {
        C0814d.m1824b(this.f2409f, "Exceptions");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m1744a());
        stringBuilder.append(" ");
        stringBuilder.append(m1750d());
        return stringBuilder.toString();
    }
}
