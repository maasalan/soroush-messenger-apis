package com.google.p173d.p193g.p195b;

import com.google.p173d.C2050q;
import com.google.p173d.p177b.C1966b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2042e {
    public final C1966b f6860a;
    public final List<C5626d> f6861b = new ArrayList();
    public boolean f6862c;
    private final int[] f6863d = new int[5];
    private final C2050q f6864e;

    private static final class C2040a implements Serializable, Comparator<C5626d> {
        private final float f6858a;

        private C2040a(float f) {
            this.f6858a = f;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C5626d c5626d = (C5626d) obj;
            C5626d c5626d2 = (C5626d) obj2;
            if (c5626d2.f15479d != c5626d.f15479d) {
                return c5626d2.f15479d - c5626d.f15479d;
            }
            float abs = Math.abs(c5626d2.f15478c - this.f6858a);
            float abs2 = Math.abs(c5626d.f15478c - this.f6858a);
            return abs < abs2 ? 1 : abs == abs2 ? 0 : -1;
        }
    }

    private static final class C2041b implements Serializable, Comparator<C5626d> {
        private final float f6859a;

        private C2041b(float f) {
            this.f6859a = f;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C5626d c5626d = (C5626d) obj;
            float abs = Math.abs(((C5626d) obj2).f15478c - this.f6859a);
            float abs2 = Math.abs(c5626d.f15478c - this.f6859a);
            return abs < abs2 ? -1 : abs == abs2 ? 0 : 1;
        }
    }

    public C2042e(C1966b c1966b, C2050q c2050q) {
        this.f6860a = c1966b;
        this.f6864e = c2050q;
    }

    private static float m5569a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    public static boolean m5570a(int[] iArr) {
        int i = 0;
        int i2 = i;
        while (i < 5) {
            int i3 = iArr[i];
            if (i3 == 0) {
                return false;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 7) {
            return false;
        }
        float f = ((float) i2) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((3.0f * f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    private int[] m5571b() {
        this.f6863d[0] = 0;
        this.f6863d[1] = 0;
        this.f6863d[2] = 0;
        this.f6863d[3] = 0;
        this.f6863d[4] = 0;
        return this.f6863d;
    }

    public final boolean m5572a() {
        int size = this.f6861b.size();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        for (C5626d c5626d : this.f6861b) {
            if (c5626d.f15479d >= 2) {
                i++;
                f2 += c5626d.f15478c;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C5626d c5626d2 : this.f6861b) {
            f += Math.abs(c5626d2.f15478c - f3);
        }
        return f <= 0.05f * f2;
    }

    public final boolean m5573a(int[] iArr, int i, int i2, boolean z) {
        float a;
        int i3;
        int i4;
        int[] b;
        int i5;
        int i6;
        float a2;
        int i7;
        int[] b2;
        int i8;
        int i9;
        boolean z2;
        float f;
        C5626d c5626d;
        float abs;
        boolean z3;
        float f2;
        boolean z4;
        int[] iArr2 = iArr;
        int i10 = (((iArr2[0] + iArr2[1]) + iArr2[2]) + iArr2[3]) + iArr2[4];
        int a3 = (int) C2042e.m5569a(iArr2, i2);
        int i11 = iArr2[2];
        C1966b c1966b = this.f6860a;
        int i12 = c1966b.f6574b;
        int[] b3 = m5571b();
        int i13 = i;
        while (i13 >= 0 && c1966b.m5416a(a3, i13)) {
            b3[2] = b3[2] + 1;
            i13--;
        }
        if (i13 >= 0) {
            while (i13 >= 0 && !c1966b.m5416a(a3, i13) && b3[1] <= i11) {
                b3[1] = b3[1] + 1;
                i13--;
            }
            if (i13 >= 0) {
                if (b3[1] <= i11) {
                    while (i13 >= 0 && c1966b.m5416a(a3, i13) && b3[0] <= i11) {
                        b3[0] = b3[0] + 1;
                        i13--;
                    }
                    if (b3[0] <= i11) {
                        i13 = i + 1;
                        while (i13 < i12 && c1966b.m5416a(a3, i13)) {
                            b3[2] = b3[2] + 1;
                            i13++;
                        }
                        if (i13 != i12) {
                            while (i13 < i12 && !c1966b.m5416a(a3, i13) && b3[3] < i11) {
                                b3[3] = b3[3] + 1;
                                i13++;
                            }
                            if (i13 != i12) {
                                if (b3[3] < i11) {
                                    while (i13 < i12 && c1966b.m5416a(a3, i13) && b3[4] < i11) {
                                        b3[4] = b3[4] + 1;
                                        i13++;
                                    }
                                    if (b3[4] < i11) {
                                        if (Math.abs(((((b3[0] + b3[1]) + b3[2]) + b3[3]) + b3[4]) - i10) * 5 < 2 * i10) {
                                            if (C2042e.m5570a(b3)) {
                                                a = C2042e.m5569a(b3, i13);
                                                if (!Float.isNaN(a)) {
                                                    i11 = (int) a;
                                                    i3 = iArr2[2];
                                                    C1966b c1966b2 = r0.f6860a;
                                                    i4 = c1966b2.f6573a;
                                                    b = m5571b();
                                                    i5 = a3;
                                                    while (i5 >= 0 && c1966b2.m5416a(i5, i11)) {
                                                        b[2] = b[2] + 1;
                                                        i5--;
                                                    }
                                                    if (i5 >= 0) {
                                                        while (i5 >= 0 && !c1966b2.m5416a(i5, i11) && b[1] <= i3) {
                                                            b[1] = b[1] + 1;
                                                            i5--;
                                                        }
                                                        if (i5 >= 0) {
                                                            if (b[1] > i3) {
                                                                while (i5 >= 0 && c1966b2.m5416a(i5, i11) && b[0] <= i3) {
                                                                    b[0] = b[0] + 1;
                                                                    i5--;
                                                                }
                                                                if (b[0] > i3) {
                                                                    a3++;
                                                                    while (a3 < i4 && c1966b2.m5416a(a3, i11)) {
                                                                        b[2] = b[2] + 1;
                                                                        a3++;
                                                                    }
                                                                    if (a3 == i4) {
                                                                        while (a3 < i4 && !c1966b2.m5416a(a3, i11) && b[3] < i3) {
                                                                            b[3] = b[3] + 1;
                                                                            a3++;
                                                                        }
                                                                        if (a3 != i4) {
                                                                            if (b[3] >= i3) {
                                                                                while (a3 < i4 && c1966b2.m5416a(a3, i11)) {
                                                                                    i6 = 4;
                                                                                    if (b[4] < i3) {
                                                                                        break;
                                                                                    }
                                                                                    b[4] = b[4] + 1;
                                                                                    a3++;
                                                                                }
                                                                                i6 = 4;
                                                                                if (b[i6] >= i3) {
                                                                                    if (5 * Math.abs(((((b[0] + b[1]) + b[2]) + b[3]) + b[i6]) - i10) >= i10) {
                                                                                        if (C2042e.m5570a(b)) {
                                                                                            a2 = C2042e.m5569a(b, a3);
                                                                                            if (!Float.isNaN(a2)) {
                                                                                                if (z) {
                                                                                                    a3 = (int) a2;
                                                                                                    i7 = iArr2[2];
                                                                                                    b2 = m5571b();
                                                                                                    i12 = 0;
                                                                                                    while (i11 >= i12 && a3 >= i12 && r0.f6860a.m5416a(a3 - i12, i11 - i12)) {
                                                                                                        b2[2] = b2[2] + 1;
                                                                                                        i12++;
                                                                                                    }
                                                                                                    if (i11 >= i12) {
                                                                                                        if (a3 >= i12) {
                                                                                                            while (i11 >= i12 && a3 >= i12 && !r0.f6860a.m5416a(a3 - i12, i11 - i12) && b2[1] <= i7) {
                                                                                                                b2[1] = b2[1] + 1;
                                                                                                                i12++;
                                                                                                            }
                                                                                                            if (i11 >= i12 && a3 >= i12) {
                                                                                                                if (b2[1] <= i7) {
                                                                                                                    while (i11 >= i12 && a3 >= i12 && r0.f6860a.m5416a(a3 - i12, i11 - i12) && b2[0] <= i7) {
                                                                                                                        b2[0] = b2[0] + 1;
                                                                                                                        i12++;
                                                                                                                    }
                                                                                                                    if (b2[0] <= i7) {
                                                                                                                        i12 = r0.f6860a.f6574b;
                                                                                                                        i4 = r0.f6860a.f6573a;
                                                                                                                        i13 = 1;
                                                                                                                        while (true) {
                                                                                                                            i5 = i11 + i13;
                                                                                                                            if (i5 >= i12) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i8 = a3 + i13;
                                                                                                                            if (i8 >= i4 || !r0.f6860a.m5416a(i8, i5)) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            b2[2] = b2[2] + 1;
                                                                                                                            i13++;
                                                                                                                        }
                                                                                                                        if (i5 < i12) {
                                                                                                                            if (a3 + i13 < i4) {
                                                                                                                                while (true) {
                                                                                                                                    i8 = i11 + i13;
                                                                                                                                    if (i8 >= i12) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i9 = a3 + i13;
                                                                                                                                    if (i9 >= i4 || r0.f6860a.m5416a(i9, i8)) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i9 = 3;
                                                                                                                                    if (b2[3] >= i7) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    b2[3] = b2[3] + 1;
                                                                                                                                    i13++;
                                                                                                                                }
                                                                                                                                i9 = 3;
                                                                                                                                if (i8 < i12 && a3 + i13 < i4) {
                                                                                                                                    if (b2[i9] < i7) {
                                                                                                                                        while (true) {
                                                                                                                                            i8 = i11 + i13;
                                                                                                                                            if (i8 >= i12) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i9 = a3 + i13;
                                                                                                                                            if (i9 >= i4 || !r0.f6860a.m5416a(i9, i8)) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i8 = 4;
                                                                                                                                            if (b2[4] >= i7) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            b2[4] = b2[4] + 1;
                                                                                                                                            i13++;
                                                                                                                                        }
                                                                                                                                        i8 = 4;
                                                                                                                                        if (b2[i8] < i7 && Math.abs(((((b2[0] + b2[1]) + b2[2]) + b2[3]) + b2[i8]) - i10) < 2 * i10 && C2042e.m5570a(b2)) {
                                                                                                                                            z2 = true;
                                                                                                                                            if (!z2) {
                                                                                                                                                return false;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    z2 = false;
                                                                                                    if (!z2) {
                                                                                                        return false;
                                                                                                    }
                                                                                                }
                                                                                                f = ((float) i10) / 7.0f;
                                                                                                for (i8 = 0; i8 < r0.f6861b.size(); i8++) {
                                                                                                    c5626d = (C5626d) r0.f6861b.get(i8);
                                                                                                    if (Math.abs(a - c5626d.f6892b) <= f && Math.abs(a2 - c5626d.f6891a) <= f) {
                                                                                                        abs = Math.abs(f - c5626d.f15478c);
                                                                                                        if (abs <= BallPulseIndicator.SCALE || abs <= c5626d.f15478c) {
                                                                                                            z3 = true;
                                                                                                            if (z3) {
                                                                                                                i9 = c5626d.f15479d + 1;
                                                                                                                f2 = (float) i9;
                                                                                                                r0.f6861b.set(i8, new C5626d(((((float) c5626d.f15479d) * c5626d.f6891a) + a2) / f2, ((((float) c5626d.f15479d) * c5626d.f6892b) + a) / f2, ((((float) c5626d.f15479d) * c5626d.f15478c) + f) / f2, i9));
                                                                                                                z4 = true;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    z3 = false;
                                                                                                    if (z3) {
                                                                                                        i9 = c5626d.f15479d + 1;
                                                                                                        f2 = (float) i9;
                                                                                                        r0.f6861b.set(i8, new C5626d(((((float) c5626d.f15479d) * c5626d.f6891a) + a2) / f2, ((((float) c5626d.f15479d) * c5626d.f6892b) + a) / f2, ((((float) c5626d.f15479d) * c5626d.f15478c) + f) / f2, i9));
                                                                                                        z4 = true;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                z4 = false;
                                                                                                if (!z4) {
                                                                                                    r0.f6861b.add(new C5626d(a2, a, f));
                                                                                                }
                                                                                                return true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    a2 = Float.NaN;
                                                    if (Float.isNaN(a2)) {
                                                        if (z) {
                                                            a3 = (int) a2;
                                                            i7 = iArr2[2];
                                                            b2 = m5571b();
                                                            i12 = 0;
                                                            while (i11 >= i12) {
                                                                b2[2] = b2[2] + 1;
                                                                i12++;
                                                            }
                                                            if (i11 >= i12) {
                                                                if (a3 >= i12) {
                                                                    while (i11 >= i12) {
                                                                        b2[1] = b2[1] + 1;
                                                                        i12++;
                                                                    }
                                                                    if (b2[1] <= i7) {
                                                                        while (i11 >= i12) {
                                                                            b2[0] = b2[0] + 1;
                                                                            i12++;
                                                                        }
                                                                        if (b2[0] <= i7) {
                                                                            i12 = r0.f6860a.f6574b;
                                                                            i4 = r0.f6860a.f6573a;
                                                                            i13 = 1;
                                                                            while (true) {
                                                                                i5 = i11 + i13;
                                                                                if (i5 >= i12) {
                                                                                    break;
                                                                                }
                                                                                i8 = a3 + i13;
                                                                                b2[2] = b2[2] + 1;
                                                                                i13++;
                                                                            }
                                                                            if (i5 < i12) {
                                                                                if (a3 + i13 < i4) {
                                                                                    while (true) {
                                                                                        i8 = i11 + i13;
                                                                                        if (i8 >= i12) {
                                                                                            break;
                                                                                        }
                                                                                        i9 = a3 + i13;
                                                                                        i9 = 3;
                                                                                        if (b2[3] >= i7) {
                                                                                            break;
                                                                                        }
                                                                                        b2[3] = b2[3] + 1;
                                                                                        i13++;
                                                                                    }
                                                                                    i9 = 3;
                                                                                    if (b2[i9] < i7) {
                                                                                        while (true) {
                                                                                            i8 = i11 + i13;
                                                                                            if (i8 >= i12) {
                                                                                                break;
                                                                                            }
                                                                                            i9 = a3 + i13;
                                                                                            i8 = 4;
                                                                                            if (b2[4] >= i7) {
                                                                                                break;
                                                                                            }
                                                                                            b2[4] = b2[4] + 1;
                                                                                            i13++;
                                                                                        }
                                                                                        i8 = 4;
                                                                                        z2 = true;
                                                                                        if (!z2) {
                                                                                            return false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z2 = false;
                                                            if (!z2) {
                                                                return false;
                                                            }
                                                        }
                                                        f = ((float) i10) / 7.0f;
                                                        for (i8 = 0; i8 < r0.f6861b.size(); i8++) {
                                                            c5626d = (C5626d) r0.f6861b.get(i8);
                                                            abs = Math.abs(f - c5626d.f15478c);
                                                            z3 = true;
                                                            if (z3) {
                                                                i9 = c5626d.f15479d + 1;
                                                                f2 = (float) i9;
                                                                r0.f6861b.set(i8, new C5626d(((((float) c5626d.f15479d) * c5626d.f6891a) + a2) / f2, ((((float) c5626d.f15479d) * c5626d.f6892b) + a) / f2, ((((float) c5626d.f15479d) * c5626d.f15478c) + f) / f2, i9));
                                                                z4 = true;
                                                                break;
                                                            }
                                                        }
                                                        z4 = false;
                                                        if (z4) {
                                                            r0.f6861b.add(new C5626d(a2, a, f));
                                                        }
                                                        return true;
                                                    }
                                                }
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a = Float.NaN;
        if (Float.isNaN(a)) {
            i11 = (int) a;
            i3 = iArr2[2];
            C1966b c1966b22 = r0.f6860a;
            i4 = c1966b22.f6573a;
            b = m5571b();
            i5 = a3;
            while (i5 >= 0) {
                b[2] = b[2] + 1;
                i5--;
            }
            if (i5 >= 0) {
                while (i5 >= 0) {
                    b[1] = b[1] + 1;
                    i5--;
                }
                if (i5 >= 0) {
                    if (b[1] > i3) {
                        while (i5 >= 0) {
                            b[0] = b[0] + 1;
                            i5--;
                        }
                        if (b[0] > i3) {
                            a3++;
                            while (a3 < i4) {
                                b[2] = b[2] + 1;
                                a3++;
                            }
                            if (a3 == i4) {
                                while (a3 < i4) {
                                    b[3] = b[3] + 1;
                                    a3++;
                                }
                                if (a3 != i4) {
                                    if (b[3] >= i3) {
                                        while (a3 < i4) {
                                            i6 = 4;
                                            if (b[4] < i3) {
                                                break;
                                            }
                                            b[4] = b[4] + 1;
                                            a3++;
                                        }
                                        i6 = 4;
                                        if (b[i6] >= i3) {
                                            if (5 * Math.abs(((((b[0] + b[1]) + b[2]) + b[3]) + b[i6]) - i10) >= i10) {
                                                if (C2042e.m5570a(b)) {
                                                    a2 = C2042e.m5569a(b, a3);
                                                    if (Float.isNaN(a2)) {
                                                        if (z) {
                                                            a3 = (int) a2;
                                                            i7 = iArr2[2];
                                                            b2 = m5571b();
                                                            i12 = 0;
                                                            while (i11 >= i12) {
                                                                b2[2] = b2[2] + 1;
                                                                i12++;
                                                            }
                                                            if (i11 >= i12) {
                                                                if (a3 >= i12) {
                                                                    while (i11 >= i12) {
                                                                        b2[1] = b2[1] + 1;
                                                                        i12++;
                                                                    }
                                                                    if (b2[1] <= i7) {
                                                                        while (i11 >= i12) {
                                                                            b2[0] = b2[0] + 1;
                                                                            i12++;
                                                                        }
                                                                        if (b2[0] <= i7) {
                                                                            i12 = r0.f6860a.f6574b;
                                                                            i4 = r0.f6860a.f6573a;
                                                                            i13 = 1;
                                                                            while (true) {
                                                                                i5 = i11 + i13;
                                                                                if (i5 >= i12) {
                                                                                    break;
                                                                                }
                                                                                i8 = a3 + i13;
                                                                                b2[2] = b2[2] + 1;
                                                                                i13++;
                                                                            }
                                                                            if (i5 < i12) {
                                                                                if (a3 + i13 < i4) {
                                                                                    while (true) {
                                                                                        i8 = i11 + i13;
                                                                                        if (i8 >= i12) {
                                                                                            break;
                                                                                        }
                                                                                        i9 = a3 + i13;
                                                                                        i9 = 3;
                                                                                        if (b2[3] >= i7) {
                                                                                            break;
                                                                                        }
                                                                                        b2[3] = b2[3] + 1;
                                                                                        i13++;
                                                                                    }
                                                                                    i9 = 3;
                                                                                    if (b2[i9] < i7) {
                                                                                        while (true) {
                                                                                            i8 = i11 + i13;
                                                                                            if (i8 >= i12) {
                                                                                                break;
                                                                                            }
                                                                                            i9 = a3 + i13;
                                                                                            i8 = 4;
                                                                                            if (b2[4] >= i7) {
                                                                                                break;
                                                                                            }
                                                                                            b2[4] = b2[4] + 1;
                                                                                            i13++;
                                                                                        }
                                                                                        i8 = 4;
                                                                                        z2 = true;
                                                                                        if (!z2) {
                                                                                            return false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z2 = false;
                                                            if (!z2) {
                                                                return false;
                                                            }
                                                        }
                                                        f = ((float) i10) / 7.0f;
                                                        for (i8 = 0; i8 < r0.f6861b.size(); i8++) {
                                                            c5626d = (C5626d) r0.f6861b.get(i8);
                                                            abs = Math.abs(f - c5626d.f15478c);
                                                            z3 = true;
                                                            if (z3) {
                                                                i9 = c5626d.f15479d + 1;
                                                                f2 = (float) i9;
                                                                r0.f6861b.set(i8, new C5626d(((((float) c5626d.f15479d) * c5626d.f6891a) + a2) / f2, ((((float) c5626d.f15479d) * c5626d.f6892b) + a) / f2, ((((float) c5626d.f15479d) * c5626d.f15478c) + f) / f2, i9));
                                                                z4 = true;
                                                                break;
                                                            }
                                                        }
                                                        z4 = false;
                                                        if (z4) {
                                                            r0.f6861b.add(new C5626d(a2, a, f));
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a2 = Float.NaN;
            if (Float.isNaN(a2)) {
                if (z) {
                    a3 = (int) a2;
                    i7 = iArr2[2];
                    b2 = m5571b();
                    i12 = 0;
                    while (i11 >= i12) {
                        b2[2] = b2[2] + 1;
                        i12++;
                    }
                    if (i11 >= i12) {
                        if (a3 >= i12) {
                            while (i11 >= i12) {
                                b2[1] = b2[1] + 1;
                                i12++;
                            }
                            if (b2[1] <= i7) {
                                while (i11 >= i12) {
                                    b2[0] = b2[0] + 1;
                                    i12++;
                                }
                                if (b2[0] <= i7) {
                                    i12 = r0.f6860a.f6574b;
                                    i4 = r0.f6860a.f6573a;
                                    i13 = 1;
                                    while (true) {
                                        i5 = i11 + i13;
                                        if (i5 >= i12) {
                                            break;
                                        }
                                        i8 = a3 + i13;
                                        b2[2] = b2[2] + 1;
                                        i13++;
                                    }
                                    if (i5 < i12) {
                                        if (a3 + i13 < i4) {
                                            while (true) {
                                                i8 = i11 + i13;
                                                if (i8 >= i12) {
                                                    break;
                                                }
                                                i9 = a3 + i13;
                                                i9 = 3;
                                                if (b2[3] >= i7) {
                                                    break;
                                                }
                                                b2[3] = b2[3] + 1;
                                                i13++;
                                            }
                                            i9 = 3;
                                            if (b2[i9] < i7) {
                                                while (true) {
                                                    i8 = i11 + i13;
                                                    if (i8 >= i12) {
                                                        break;
                                                    }
                                                    i9 = a3 + i13;
                                                    i8 = 4;
                                                    if (b2[4] >= i7) {
                                                        break;
                                                    }
                                                    b2[4] = b2[4] + 1;
                                                    i13++;
                                                }
                                                i8 = 4;
                                                z2 = true;
                                                if (!z2) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        return false;
                    }
                }
                f = ((float) i10) / 7.0f;
                for (i8 = 0; i8 < r0.f6861b.size(); i8++) {
                    c5626d = (C5626d) r0.f6861b.get(i8);
                    abs = Math.abs(f - c5626d.f15478c);
                    z3 = true;
                    if (z3) {
                        i9 = c5626d.f15479d + 1;
                        f2 = (float) i9;
                        r0.f6861b.set(i8, new C5626d(((((float) c5626d.f15479d) * c5626d.f6891a) + a2) / f2, ((((float) c5626d.f15479d) * c5626d.f6892b) + a) / f2, ((((float) c5626d.f15479d) * c5626d.f15478c) + f) / f2, i9));
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
                if (z4) {
                    r0.f6861b.add(new C5626d(a2, a, f));
                }
                return true;
            }
        }
        return false;
    }
}
