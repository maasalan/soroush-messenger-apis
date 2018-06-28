package p056c;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p056c.p057a.C0885c;
import p206d.C5682d;
import p206d.C6623c;

public final class C5044q extends ab {
    private static final C0952v f14061a = C0952v.m2385a("application/x-www-form-urlencoded");
    private final List<String> f14062b;
    private final List<String> f14063c;

    public static final class C0943a {
        public final List<String> f2983a;
        public final List<String> f2984b;
        public final Charset f2985c;

        public C0943a() {
            this((byte) 0);
        }

        private C0943a(byte b) {
            this.f2983a = new ArrayList();
            this.f2984b = new ArrayList();
            this.f2985c = null;
        }
    }

    public C5044q(List<String> list, List<String> list2) {
        this.f14062b = C0885c.m2094a((List) list);
        this.f14063c = C0885c.m2094a((List) list2);
    }

    private long m10217a(C5682d c5682d, boolean z) {
        C6623c c6623c = z ? new C6623c() : c5682d.mo3124b();
        int size = this.f14062b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c6623c.m17033b(38);
            }
            c6623c.m17026a((String) this.f14062b.get(i));
            c6623c.m17033b(61);
            c6623c.m17026a((String) this.f14063c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = c6623c.f18884b;
        c6623c.m17071p();
        return j;
    }

    public final C0952v mo998a() {
        return f14061a;
    }

    public final void mo999a(C5682d c5682d) {
        m10217a(c5682d, false);
    }

    public final long mo1000b() {
        return m10217a(null, true);
    }
}
