package com.google.p173d.p180c.p182b;

import com.google.p173d.C2049p;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.C1971i;
import com.google.p173d.p177b.p178a.C1959a;
import com.google.p173d.p177b.p178a.C1960b;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

public final class C1986a {
    public final C1966b f6672a;
    public final C1960b f6673b;

    private static final class C1984a {
        public final C2049p f6669a;
        public final C2049p f6670b;
        public final int f6671c;

        private C1984a(C2049p c2049p, C2049p c2049p2, int i) {
            this.f6669a = c2049p;
            this.f6670b = c2049p2;
            this.f6671c = i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f6669a);
            stringBuilder.append("/");
            stringBuilder.append(this.f6670b);
            stringBuilder.append('/');
            stringBuilder.append(this.f6671c);
            return stringBuilder.toString();
        }
    }

    private static final class C1985b implements Serializable, Comparator<C1984a> {
        private C1985b() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C1984a) obj).f6671c - ((C1984a) obj2).f6671c;
        }
    }

    public C1986a(C1966b c1966b) {
        this.f6672a = c1966b;
        this.f6673b = new C1960b(c1966b);
    }

    public static int m5451a(C2049p c2049p, C2049p c2049p2) {
        return C1959a.m5388a(C2049p.m5583a(c2049p, c2049p2));
    }

    public static C1966b m5452a(C1966b c1966b, C2049p c2049p, C2049p c2049p2, C2049p c2049p3, C2049p c2049p4, int i, int i2) {
        C2049p c2049p5 = c2049p;
        C2049p c2049p6 = c2049p2;
        C2049p c2049p7 = c2049p3;
        C2049p c2049p8 = c2049p4;
        C1971i a = C1971i.m5426a();
        int i3 = i;
        float f = ((float) i3) - 0.5f;
        int i4 = i2;
        float f2 = ((float) i4) - 0.5f;
        float f3 = c2049p5.f6891a;
        float f4 = c2049p5.f6892b;
        float f5 = c2049p8.f6891a;
        float f6 = c2049p8.f6892b;
        float f7 = c2049p7.f6891a;
        float f8 = c2049p7.f6892b;
        float f9 = c2049p6.f6891a;
        return a.mo1759a(c1966b, i3, i4, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, f3, f4, f5, f6, f7, f8, f9, c2049p6.f6892b);
    }

    public static void m5453a(Map<C2049p, Integer> map, C2049p c2049p) {
        Integer num = (Integer) map.get(c2049p);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(c2049p, Integer.valueOf(i));
    }

    public final boolean m5454a(C2049p c2049p) {
        return c2049p.f6891a >= 0.0f && c2049p.f6891a < ((float) this.f6672a.f6573a) && c2049p.f6892b > 0.0f && c2049p.f6892b < ((float) this.f6672a.f6574b);
    }

    public final C1984a m5455b(C2049p c2049p, C2049p c2049p2) {
        C1986a c1986a = this;
        C2049p c2049p3 = c2049p;
        C2049p c2049p4 = c2049p2;
        int i = (int) c2049p3.f6891a;
        int i2 = (int) c2049p3.f6892b;
        int i3 = (int) c2049p4.f6891a;
        int i4 = (int) c2049p4.f6892b;
        Object obj = Math.abs(i4 - i2) > Math.abs(i3 - i) ? 1 : null;
        if (obj != null) {
            int i5 = i2;
            i2 = i;
            i = i5;
            int i6 = i4;
            i4 = i3;
            i3 = i6;
        }
        int abs = Math.abs(i3 - i);
        int abs2 = Math.abs(i4 - i2);
        int i7 = (-abs) / 2;
        int i8 = -1;
        int i9 = i2 < i4 ? 1 : -1;
        if (i < i3) {
            i8 = 1;
        }
        boolean a = c1986a.f6672a.m5416a(obj != null ? i2 : i, obj != null ? i : i2);
        int i10 = 0;
        while (i != i3) {
            int i11;
            C1966b c1966b = c1986a.f6672a;
            int i12 = obj != null ? i2 : i;
            if (obj != null) {
                i11 = i3;
                i3 = i;
            } else {
                i11 = i3;
                i3 = i2;
            }
            boolean a2 = c1966b.m5416a(i12, i3);
            if (a2 != a) {
                i10++;
                a = a2;
            }
            i7 += abs2;
            if (i7 > 0) {
                if (i2 == i4) {
                    break;
                }
                i2 += i9;
                i7 -= abs;
            }
            i += i8;
            i3 = i11;
            c1986a = this;
        }
        return new C1984a(c2049p3, c2049p4, i10);
    }
}
