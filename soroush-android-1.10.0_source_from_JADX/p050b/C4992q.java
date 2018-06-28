package p050b;

import p050b.p051a.C0819j;
import p050b.p051a.C0828s;
import p050b.p051a.C4954i;

public final class C4992q extends C0855r {
    public static C6430k m10074a(C0851i[] c0851iArr, C0851i[] c0851iArr2, C0851i c0851i) {
        try {
            int i;
            C6430k c6430k = new C6430k(c0851iArr, c0851i);
            c6430k.m10023a(c0851iArr2);
            C0819j h = c0851i.mo930h();
            int i2 = h.f2454f;
            int i3 = 0;
            C4954i c4954i = new C4954i(h.f2451c, 0);
            if (c0851iArr != null) {
                C0851i c0851i2 = C0851i.f2543k;
                C0851i c0851i3 = C0851i.f2541i;
                i = 1;
                for (C0851i c0851i4 : c0851iArr) {
                    if (c0851i4 != c0851i2) {
                        if (c0851i4 != c0851i3) {
                            i++;
                        }
                    }
                    i += 2;
                }
            } else {
                i = 1;
            }
            c4954i.f13794f = i;
            c4954i.m9735h(0);
            if (c0851iArr != null) {
                int i4 = 0;
                while (i3 < c0851iArr.length) {
                    i4 += c4954i.m9694a(i4 + 1, c0851iArr[i3]);
                    i3++;
                }
                i3 = i4;
            }
            i3++;
            c4954i.m9702a(i2, "<init>", C0828s.m1896a(C0851i.f2544l, c0851iArr));
            c4954i.mo869a(177);
            c4954i.f13793e = i3;
            c6430k.m10019a().m1746a(c4954i.m9696a());
            return c6430k;
        } catch (C0858w e) {
            throw new C0832a(e);
        }
    }
}
