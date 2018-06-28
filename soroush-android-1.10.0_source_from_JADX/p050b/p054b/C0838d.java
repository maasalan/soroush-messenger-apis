package p050b.p054b;

import p050b.C0851i;
import p050b.C0857v;
import p050b.C0858w;
import p050b.C4988h;
import p050b.C4993s;
import p050b.C6430k;
import p050b.C6431n;
import p050b.p051a.C4954i;
import p050b.p054b.p055a.C6426r;

public final class C0838d {
    C7033e f2504a;
    C0842n f2505b;
    private C4954i f2506c;

    public C0838d(C4954i c4954i, C0851i c0851i) {
        this.f2504a = new C7033e(c4954i, c0851i, c0851i.mo911a());
        this.f2505b = new C0842n();
        this.f2506c = c4954i;
    }

    public C0838d(C0851i c0851i) {
        this(new C4954i(c0851i.mo930h().f2451c, 0), c0851i);
    }

    public final int m1948a(C0851i[] c0851iArr, boolean z) {
        return this.f2504a.m18166a(c0851iArr, z, "$", "$args", "$$", this.f2505b);
    }

    public final C4954i m1949a(C4988h c4988h, String str) {
        try {
            C0851i d;
            m1948a(c4988h.h_(), C0857v.m2017a(c4988h.mo919b()));
            if (c4988h instanceof C6431n) {
                this.f2504a.m15327a((C6431n) c4988h);
                d = ((C6431n) c4988h).m10025d();
            } else {
                d = C0851i.f2544l;
            }
            this.f2504a.f20050p = d;
            C7033e c7033e = this.f2504a;
            c7033e.f20051q = d;
            c7033e.f20052r = "$r";
            c7033e.f20053s = null;
            int i = 1;
            boolean z = false;
            boolean z2 = d == C0851i.f2544l;
            if (str == null) {
                int i2;
                C4954i c4954i = this.f2506c;
                if (d instanceof C4993s) {
                    i2 = ((C4993s) d).f13900q;
                    i = i2 == 175 ? 14 : i2 == 174 ? 11 : i2 == 173 ? 9 : i2 == 177 ? 0 : 3;
                } else {
                    i2 = 176;
                }
                if (i != 0) {
                    c4954i.m9728e(i);
                }
                c4954i.m9728e(i2);
            } else {
                C4983l c4983l = new C4983l(new C4978h(str));
                C6426r a = c4983l.m9970a(new C0842n(this.f2505b));
                if ((c4983l.f13867a.m9921a(0) >= 0 ? 1 : false) != 0) {
                    throw new C0837c("the method/constructor body must be surrounded by {}");
                }
                if (c4988h instanceof C6430k) {
                    z = ((C6430k) c4988h).m15337h() ^ 1;
                }
                this.f2504a.m9896a(a, z, z2);
            }
            return this.f2506c;
        } catch (C0858w e) {
            throw new C0837c(e.toString());
        }
    }
}
