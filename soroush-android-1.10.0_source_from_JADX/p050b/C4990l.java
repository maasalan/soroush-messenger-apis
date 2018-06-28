package p050b;

import org.msgpack.util.TemplatePrecompiler;
import p050b.p051a.C0827p;
import p050b.p051a.C0828s;
import p050b.p051a.C0831z;
import p050b.p051a.ax;

public final class C4990l extends C0853m {
    protected C0831z f13892a;

    public static abstract class C0852a {
        abstract int m2009a();

        abstract int m2010b();
    }

    C4990l(C0831z c0831z, C0851i c0851i) {
        super(c0851i);
        this.f13892a = c0831z;
    }

    public final C0831z m10060a() {
        return this.f13892a;
    }

    protected final void mo918a(StringBuffer stringBuffer) {
        stringBuffer.append(' ');
        stringBuffer.append(this.f13892a.m1913a());
        stringBuffer.append(' ');
        stringBuffer.append(this.f13892a.m1914b());
    }

    public final int mo919b() {
        return this.f13892a.f2491b;
    }

    public final C0851i mo940c() {
        return super.mo940c();
    }

    public final C0851i m10064d() {
        return C0828s.m1905c(this.f13892a.m1914b(), this.c.mo911a());
    }

    public final String mo920e() {
        return this.f13892a.m1914b();
    }

    public final Object m10066f() {
        int c = this.f13892a.m1915c();
        if (c == 0) {
            return null;
        }
        C0827p c0827p = this.f13892a.f2490a;
        switch (c0827p.m1878b(c)) {
            case 3:
                c = c0827p.m1888f(c);
                if (!"Z".equals(this.f13892a.m1914b())) {
                    return new Integer(c);
                }
                return new Boolean(c != 0);
            case 4:
                return new Float(c0827p.m1889g(c));
            case 5:
                return new Long(c0827p.m1890h(c));
            case 6:
                return new Double(c0827p.m1891i(c));
            case 8:
                return c0827p.m1892j(((ax) c0827p.m1875a(c)).f13766a);
            default:
                StringBuilder stringBuilder = new StringBuilder("bad tag: ");
                stringBuilder.append(c0827p.m1878b(c));
                stringBuilder.append(" at ");
                stringBuilder.append(c);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final String mo941i() {
        return this.f13892a.m1913a();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo940c().m1999m());
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(this.f13892a.m1913a());
        stringBuilder.append(":");
        stringBuilder.append(this.f13892a.m1914b());
        return stringBuilder.toString();
    }
}
