package com.google.p173d.p177b.p178a;

import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1966b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C1960b {
    private final C1966b f6546a;
    private final int f6547b;
    private final int f6548c;
    private final int f6549d;
    private final int f6550e;
    private final int f6551f;
    private final int f6552g;

    public C1960b(C1966b c1966b) {
        this(c1966b, 10, c1966b.f6573a / 2, c1966b.f6574b / 2);
    }

    public C1960b(C1966b c1966b, int i, int i2, int i3) {
        this.f6546a = c1966b;
        this.f6547b = c1966b.f6574b;
        this.f6548c = c1966b.f6573a;
        i /= 2;
        this.f6549d = i2 - i;
        this.f6550e = i2 + i;
        this.f6552g = i3 - i;
        this.f6551f = i3 + i;
        if (this.f6552g >= 0 && this.f6549d >= 0 && this.f6551f < this.f6547b) {
            if (this.f6550e < this.f6548c) {
                return;
            }
        }
        throw C5629j.m12369a();
    }

    private C2049p m5390a(float f, float f2, float f3, float f4) {
        int a = C1959a.m5388a(C1959a.m5386a(f, f2, f3, f4));
        float f5 = (float) a;
        f3 = (f3 - f) / f5;
        f4 = (f4 - f2) / f5;
        for (int i = 0; i < a; i++) {
            float f6 = (float) i;
            int a2 = C1959a.m5388a((f6 * f3) + f);
            int a3 = C1959a.m5388a((f6 * f4) + f2);
            if (this.f6546a.m5416a(a2, a3)) {
                return new C2049p((float) a2, (float) a3);
            }
        }
        return null;
    }

    private boolean m5391a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f6546a.m5416a(i, i3)) {
                    return true;
                }
                i++;
            }
        } else {
            while (i <= i2) {
                if (this.f6546a.m5416a(i3, i)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final C2049p[] m5392a() {
        int i = this.f6549d;
        int i2 = this.f6550e;
        int i3 = this.f6552g;
        int i4 = this.f6551f;
        int i5 = i;
        boolean z = false;
        boolean z2 = z;
        boolean z3 = z2;
        boolean z4 = z3;
        boolean z5 = z4;
        boolean z6 = true;
        while (z6) {
            boolean z7 = false;
            z6 = true;
            while (true) {
                if ((z6 || !z) && i2 < this.f6548c) {
                    z6 = m5391a(i3, i4, i2, false);
                    if (z6) {
                        i2++;
                        z = true;
                        z7 = z;
                    } else if (!z) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f6548c) {
                z6 = true;
                while (true) {
                    if ((z6 || !z2) && i4 < this.f6547b) {
                        z6 = m5391a(i5, i2, i4, true);
                        if (z6) {
                            i4++;
                            z2 = true;
                            z7 = z2;
                        } else if (!z2) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f6547b) {
                    z6 = true;
                    while (true) {
                        if ((z6 || !z3) && i5 >= 0) {
                            z6 = m5391a(i3, i4, i5, false);
                            if (z6) {
                                i5--;
                                z3 = true;
                                z7 = z3;
                            } else if (!z3) {
                                i5--;
                            }
                        }
                    }
                    if (i5 >= 0) {
                        z6 = true;
                        while (true) {
                            if ((z6 || !z5) && i3 >= 0) {
                                z6 = m5391a(i5, i2, i3, true);
                                if (z6) {
                                    i3--;
                                    z5 = true;
                                    z7 = z5;
                                } else if (!z5) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z4 = true;
                            }
                            z6 = z7;
                        }
                    }
                }
            }
            z6 = true;
            break;
        }
        z6 = false;
        if (z6 || !r10) {
            throw C5629j.m12369a();
        }
        i = i2 - i5;
        C2049p c2049p = null;
        int i6 = 1;
        C2049p c2049p2 = null;
        while (c2049p2 == null && i6 < i) {
            c2049p2 = m5390a((float) i5, (float) (i4 - i6), (float) (i5 + i6), (float) i4);
            i6++;
        }
        if (c2049p2 == null) {
            throw C5629j.m12369a();
        }
        int i7 = 1;
        C2049p c2049p3 = null;
        while (c2049p3 == null && i7 < i) {
            c2049p3 = m5390a((float) i5, (float) (i3 + i7), (float) (i5 + i7), (float) i3);
            i7++;
        }
        if (c2049p3 == null) {
            throw C5629j.m12369a();
        }
        i7 = 1;
        C2049p c2049p4 = null;
        while (c2049p4 == null && i7 < i) {
            c2049p4 = m5390a((float) i2, (float) (i3 + i7), (float) (i2 - i7), (float) i3);
            i7++;
        }
        if (c2049p4 == null) {
            throw C5629j.m12369a();
        }
        i3 = 1;
        while (c2049p == null && i3 < i) {
            c2049p = m5390a((float) i2, (float) (i4 - i3), (float) (i2 - i3), (float) i4);
            i3++;
        }
        if (c2049p == null) {
            throw C5629j.m12369a();
        }
        float f = c2049p.f6891a;
        float f2 = c2049p.f6892b;
        float f3 = c2049p2.f6891a;
        float f4 = c2049p2.f6892b;
        float f5 = c2049p4.f6891a;
        float f6 = c2049p4.f6892b;
        float f7 = c2049p3.f6891a;
        float f8 = c2049p3.f6892b;
        if (f < ((float) this.f6548c) / 2.0f) {
            return new C2049p[]{new C2049p(f7 - BallPulseIndicator.SCALE, f8 + BallPulseIndicator.SCALE), new C2049p(f3 + BallPulseIndicator.SCALE, f4 + BallPulseIndicator.SCALE), new C2049p(f5 - BallPulseIndicator.SCALE, f6 - BallPulseIndicator.SCALE), new C2049p(f + BallPulseIndicator.SCALE, f2 - BallPulseIndicator.SCALE)};
        }
        return new C2049p[]{new C2049p(f7 + BallPulseIndicator.SCALE, f8 + BallPulseIndicator.SCALE), new C2049p(f3 + BallPulseIndicator.SCALE, f4 - BallPulseIndicator.SCALE), new C2049p(f5 - BallPulseIndicator.SCALE, f6 + BallPulseIndicator.SCALE), new C2049p(f - BallPulseIndicator.SCALE, f2 - BallPulseIndicator.SCALE)};
    }
}
