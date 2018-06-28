package p056c;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p056c.p057a.C0885c;
import p206d.C2272f;
import p206d.C5682d;
import p206d.C6623c;

public final class C5045w extends ab {
    public static final C0952v f14064a = C0952v.m2385a("multipart/mixed");
    public static final C0952v f14065b = C0952v.m2385a("multipart/alternative");
    public static final C0952v f14066c = C0952v.m2385a("multipart/digest");
    public static final C0952v f14067d = C0952v.m2385a("multipart/parallel");
    public static final C0952v f14068e = C0952v.m2385a("multipart/form-data");
    private static final byte[] f14069f = new byte[]{(byte) 58, (byte) 32};
    private static final byte[] f14070g = new byte[]{(byte) 13, (byte) 10};
    private static final byte[] f14071h = new byte[]{(byte) 45, (byte) 45};
    private final C2272f f14072i;
    private final C0952v f14073j;
    private final C0952v f14074k;
    private final List<C0954b> f14075l;
    private long f14076m = -1;

    public static final class C0953a {
        public final C2272f f3022a;
        public C0952v f3023b;
        public final List<C0954b> f3024c;

        public C0953a() {
            this(UUID.randomUUID().toString());
        }

        private C0953a(String str) {
            this.f3023b = C5045w.f14064a;
            this.f3024c = new ArrayList();
            this.f3022a = C2272f.m6191a(str);
        }

        public final C0953a m2387a(C0954b c0954b) {
            if (c0954b == null) {
                throw new NullPointerException("part == null");
            }
            this.f3024c.add(c0954b);
            return this;
        }
    }

    public static final class C0954b {
        final C0946s f3025a;
        final ab f3026b;

        private C0954b(C0946s c0946s, ab abVar) {
            this.f3025a = c0946s;
            this.f3026b = abVar;
        }

        public static C0954b m2388a(C0946s c0946s, ab abVar) {
            if (abVar == null) {
                throw new NullPointerException("body == null");
            } else if (c0946s != null && c0946s.m2346a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (c0946s == null || c0946s.m2346a("Content-Length") == null) {
                return new C0954b(c0946s, abVar);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }
    }

    public C5045w(C2272f c2272f, C0952v c0952v, List<C0954b> list) {
        this.f14072i = c2272f;
        this.f14073j = c0952v;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0952v);
        stringBuilder.append("; boundary=");
        stringBuilder.append(c2272f.mo2040a());
        this.f14074k = C0952v.m2385a(stringBuilder.toString());
        this.f14075l = C0885c.m2094a((List) list);
    }

    private long m10221a(C5682d c5682d, boolean z) {
        C6623c c6623c;
        if (z) {
            c5682d = new C6623c();
            c6623c = c5682d;
        } else {
            c6623c = null;
        }
        int size = this.f14075l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0954b c0954b = (C0954b) this.f14075l.get(i);
            C0946s c0946s = c0954b.f3025a;
            ab abVar = c0954b.f3026b;
            c5682d.mo3129c(f14071h);
            c5682d.mo3128c(this.f14072i);
            c5682d.mo3129c(f14070g);
            if (c0946s != null) {
                int length = c0946s.f2991a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    c5682d.mo3125b(c0946s.m2345a(i2)).mo3129c(f14069f).mo3125b(c0946s.m2347b(i2)).mo3129c(f14070g);
                }
            }
            C0952v a = abVar.mo998a();
            if (a != null) {
                c5682d.mo3125b("Content-Type: ").mo3125b(a.toString()).mo3129c(f14070g);
            }
            long b = abVar.mo1000b();
            if (b != -1) {
                c5682d.mo3125b("Content-Length: ").mo3147l(b).mo3129c(f14070g);
            } else if (z) {
                c6623c.m17071p();
                return -1;
            }
            c5682d.mo3129c(f14070g);
            if (z) {
                j += b;
            } else {
                abVar.mo999a(c5682d);
            }
            c5682d.mo3129c(f14070g);
        }
        c5682d.mo3129c(f14071h);
        c5682d.mo3128c(this.f14072i);
        c5682d.mo3129c(f14071h);
        c5682d.mo3129c(f14070g);
        if (!z) {
            return j;
        }
        long j2 = j + c6623c.f18884b;
        c6623c.m17071p();
        return j2;
    }

    public final C0952v mo998a() {
        return this.f14074k;
    }

    public final void mo999a(C5682d c5682d) {
        m10221a(c5682d, false);
    }

    public final long mo1000b() {
        long j = this.f14076m;
        if (j != -1) {
            return j;
        }
        j = m10221a(null, true);
        this.f14076m = j;
        return j;
    }
}
