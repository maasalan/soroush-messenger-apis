package com.google.p173d.p193g;

import com.google.p173d.C1958a;
import com.google.p173d.C1987c;
import com.google.p173d.C2007e;
import com.google.p173d.C2045l;
import com.google.p173d.C2047n;
import com.google.p173d.C2048o;
import com.google.p173d.C2049p;
import com.google.p173d.C2050q;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.C1969e;
import com.google.p173d.p177b.C1970g;
import com.google.p173d.p193g.p194a.C2030e;
import com.google.p173d.p193g.p194a.C2034i;
import com.google.p173d.p193g.p195b.C2039c;
import com.google.p173d.p193g.p195b.C2042e;
import com.google.p173d.p193g.p195b.C2042e.C2040a;
import com.google.p173d.p193g.p195b.C2042e.C2041b;
import com.google.p173d.p193g.p195b.C2043f;
import com.google.p173d.p193g.p195b.C5626d;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class C5624a implements C2045l {
    private static final C2049p[] f15475a = new C2049p[0];
    private final C2030e f15476b = new C2030e();

    public final C2047n mo1757a(C1987c c1987c, Map<C2007e, ?> map) {
        C2049p[] c2049pArr;
        C1969e a;
        C2047n c2047n;
        List list;
        String str;
        C5624a c5624a = this;
        Map map2 = map;
        int i = 3;
        int i2 = 0;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        if (map2 == null || !map2.containsKey(C2007e.PURE_BARCODE)) {
            int i9;
            C2039c c2039c = new C2039c(c1987c.m5457b());
            c2039c.f6857b = map2 == null ? null : (C2050q) map2.get(C2007e.NEED_RESULT_POINT_CALLBACK);
            C2042e c2042e = new C2042e(c2039c.f6856a, c2039c.f6857b);
            boolean z = map2 != null && map2.containsKey(C2007e.TRY_HARDER);
            boolean z2 = map2 != null && map2.containsKey(C2007e.PURE_BARCODE);
            i3 = c2042e.f6860a.f6574b;
            i4 = c2042e.f6860a.f6573a;
            i5 = (3 * i3) / 228;
            if (i5 < 3 || z) {
                i5 = 3;
            }
            int[] iArr = new int[5];
            i6 = i5 - 1;
            i7 = i5;
            boolean z3 = false;
            while (i6 < i3 && !z3) {
                iArr[i2] = i2;
                iArr[1] = i2;
                iArr[2] = i2;
                iArr[i] = i2;
                i8 = 4;
                iArr[4] = i2;
                boolean z4 = z3;
                int i10 = i7;
                i7 = i2;
                i5 = i6;
                i6 = i7;
                while (i6 < i4) {
                    if (c2042e.f6860a.m5416a(i6, i5)) {
                        if ((i7 & 1) == 1) {
                            i7++;
                        }
                        iArr[i7] = iArr[i7] + 1;
                        i9 = i8;
                    } else if ((i7 & 1) != 0) {
                        i9 = i8;
                        iArr[i7] = iArr[i7] + 1;
                    } else if (i7 != i8) {
                        i9 = i8;
                        i = i7 + 1;
                        iArr[i] = iArr[i] + 1;
                        i7 = i;
                    } else if (!C2042e.m5570a(iArr)) {
                        i9 = i8;
                        r19 = i2;
                        i2 = i;
                        i = r19;
                        iArr[i] = iArr[2];
                        iArr[1] = iArr[i2];
                        iArr[2] = iArr[i9];
                        iArr[i2] = 1;
                        iArr[i9] = i;
                        i7 = 3;
                    } else if (c2042e.m5573a(iArr, i5, i6, z2)) {
                        int i11;
                        if (c2042e.f6862c) {
                            z4 = c2042e.m5572a();
                            i = i2;
                            i11 = 2;
                        } else {
                            if (c2042e.f6861b.size() > 1) {
                                C2049p c2049p = null;
                                for (C2049p c2049p2 : c2042e.f6861b) {
                                    if (c2049p2.f15479d >= 2) {
                                        if (c2049p != null) {
                                            c2042e.f6862c = true;
                                            i11 = 2;
                                            i2 = ((int) (Math.abs(c2049p.f6891a - c2049p2.f6891a) - Math.abs(c2049p.f6892b - c2049p2.f6892b))) / 2;
                                            break;
                                        }
                                        c2049p = c2049p2;
                                    }
                                }
                            }
                            i11 = 2;
                            i2 = 0;
                            if (i2 > iArr[i11]) {
                                i5 += (i2 - iArr[i11]) - 2;
                                i6 = i4 - 1;
                            }
                            i = 0;
                        }
                        iArr[i] = i;
                        iArr[1] = i;
                        iArr[i11] = i;
                        iArr[3] = i;
                        i9 = 4;
                        iArr[4] = i;
                        i7 = i;
                        i10 = i11;
                    } else {
                        i9 = i8;
                        r19 = i2;
                        i2 = i;
                        i = r19;
                        iArr[i] = iArr[2];
                        iArr[1] = iArr[i2];
                        iArr[2] = iArr[i9];
                        iArr[i2] = 1;
                        iArr[i9] = i;
                        i7 = i2;
                    }
                    i6++;
                    i8 = i9;
                    i = 3;
                    i2 = 0;
                }
                if (C2042e.m5570a(iArr) && c2042e.m5573a(iArr, i5, i4, z2)) {
                    i2 = iArr[0];
                    if (c2042e.f6862c) {
                        z4 = c2042e.m5572a();
                    }
                    i7 = i2;
                } else {
                    i7 = i10;
                }
                i6 = i5 + i7;
                z3 = z4;
                i = 3;
                i2 = 0;
            }
            int size = c2042e.f6861b.size();
            if (size < 3) {
                throw C5629j.m12369a();
            }
            float f2 = 0.0f;
            if (size > 3) {
                float f3 = 0.0f;
                float f4 = f3;
                for (C5626d c5626d : c2042e.f6861b) {
                    float f5 = c5626d.f15478c;
                    f3 += f5;
                    f4 += f5 * f5;
                }
                f = (float) size;
                f3 /= f;
                f = (float) Math.sqrt((double) ((f4 / f) - (f3 * f3)));
                Collections.sort(c2042e.f6861b, new C2041b(f3));
                f = Math.max(0.2f * f3, f);
                i = 0;
                while (i < c2042e.f6861b.size() && c2042e.f6861b.size() > 3) {
                    if (Math.abs(((C5626d) c2042e.f6861b.get(i)).f15478c - f3) > f) {
                        c2042e.f6861b.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (c2042e.f6861b.size() > 3) {
                for (C5626d c5626d2 : c2042e.f6861b) {
                    f2 += c5626d2.f15478c;
                }
                i9 = 0;
                Collections.sort(c2042e.f6861b, new C2040a(f2 / ((float) c2042e.f6861b.size())));
                i2 = 3;
                c2042e.f6861b.subList(3, c2042e.f6861b.size()).clear();
            } else {
                i2 = 3;
                i9 = 0;
            }
            c2049pArr = new C5626d[i2];
            c2049pArr[i9] = (C5626d) c2042e.f6861b.get(i9);
            c2049pArr[1] = (C5626d) c2042e.f6861b.get(1);
            c2049pArr[2] = (C5626d) c2042e.f6861b.get(2);
            C2049p.m5584a(c2049pArr);
            C1970g a2 = c2039c.m5568a(new C2043f(c2049pArr));
            a = c5624a.f15476b.m5550a(a2.f6622d, map2);
            c2049pArr = a2.f6623e;
        } else {
            C1966b b = c1987c.m5457b();
            int[] a3 = b.m5417a();
            int[] b2 = b.m5420b();
            if (a3 != null) {
                if (b2 != null) {
                    int i12 = b.f6574b;
                    i3 = b.f6573a;
                    i4 = a3[0];
                    i5 = a3[1];
                    i7 = 1;
                    i8 = 0;
                    while (i4 < i3 && i5 < i12) {
                        if (i7 != b.m5416a(i4, i5)) {
                            i8++;
                            if (i8 == 5) {
                                break;
                            }
                            i7 ^= 1;
                        }
                        i4++;
                        i5++;
                    }
                    if (i4 != i3) {
                        if (i5 != i12) {
                            f = ((float) (i4 - a3[0])) / 7.0f;
                            int i13 = a3[1];
                            i12 = b2[1];
                            int i14 = a3[0];
                            i6 = b2[0];
                            if (i14 < i6) {
                                if (i13 < i12) {
                                    i3 = i12 - i13;
                                    if (i3 != i6 - i14) {
                                        i6 = i14 + i3;
                                        if (i6 >= b.f6573a) {
                                            throw C5629j.m12369a();
                                        }
                                    }
                                    i4 = Math.round(((float) ((i6 - i14) + 1)) / f);
                                    i3 = Math.round(((float) (i3 + 1)) / f);
                                    if (i4 > 0) {
                                        if (i3 > 0) {
                                            if (i3 != i4) {
                                                throw C5629j.m12369a();
                                            }
                                            i5 = (int) (f / 2.0f);
                                            i13 += i5;
                                            i14 += i5;
                                            i7 = (((int) (((float) (i4 - 1)) * f)) + i14) - i6;
                                            if (i7 > 0) {
                                                if (i7 > i5) {
                                                    throw C5629j.m12369a();
                                                }
                                                i14 -= i7;
                                            }
                                            i6 = (((int) (((float) (i3 - 1)) * f)) + i13) - i12;
                                            if (i6 > 0) {
                                                if (i6 > i5) {
                                                    throw C5629j.m12369a();
                                                }
                                                i13 -= i6;
                                            }
                                            C1966b c1966b = new C1966b(i4, i3);
                                            for (i12 = 0; i12 < i3; i12++) {
                                                i5 = ((int) (((float) i12) * f)) + i13;
                                                for (i7 = 0; i7 < i4; i7++) {
                                                    if (b.m5416a(((int) (((float) i7) * f)) + i14, i5)) {
                                                        c1966b.m5418b(i7, i12);
                                                    }
                                                }
                                            }
                                            a = c5624a.f15476b.m5550a(c1966b, map2);
                                            c2049pArr = f15475a;
                                        }
                                    }
                                    throw C5629j.m12369a();
                                }
                            }
                            throw C5629j.m12369a();
                        }
                    }
                    throw C5629j.m12369a();
                }
            }
            throw C5629j.m12369a();
        }
        if ((a.f6619h instanceof C2034i) && ((C2034i) a.f6619h).f6836a && c2049pArr != null) {
            if (c2049pArr.length >= 3) {
                i = 0;
                C2049p c2049p3 = c2049pArr[0];
                c2049pArr[0] = c2049pArr[2];
                c2049pArr[2] = c2049p3;
                c2047n = new C2047n(a.f6614c, a.f6612a, c2049pArr, C1958a.QR_CODE);
                list = a.f6615d;
                if (list != null) {
                    c2047n.m5581a(C2048o.BYTE_SEGMENTS, list);
                }
                str = a.f6616e;
                if (str != null) {
                    c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
                }
                if (a.f6620i >= 0 && a.f6621j >= 0) {
                    i = 1;
                }
                if (i != 0) {
                    c2047n.m5581a(C2048o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(a.f6621j));
                    c2047n.m5581a(C2048o.STRUCTURED_APPEND_PARITY, Integer.valueOf(a.f6620i));
                }
                return c2047n;
            }
        }
        i = 0;
        c2047n = new C2047n(a.f6614c, a.f6612a, c2049pArr, C1958a.QR_CODE);
        list = a.f6615d;
        if (list != null) {
            c2047n.m5581a(C2048o.BYTE_SEGMENTS, list);
        }
        str = a.f6616e;
        if (str != null) {
            c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
        }
        i = 1;
        if (i != 0) {
            c2047n.m5581a(C2048o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(a.f6621j));
            c2047n.m5581a(C2048o.STRUCTURED_APPEND_PARITY, Integer.valueOf(a.f6620i));
        }
        return c2047n;
    }

    public final void mo1758a() {
    }
}
