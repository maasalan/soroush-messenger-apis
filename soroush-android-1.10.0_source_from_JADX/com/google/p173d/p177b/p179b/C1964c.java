package com.google.p173d.p177b.p179b;

public final class C1964c {
    private final C1962a f6572a;

    public C1964c(C1962a c1962a) {
        this.f6572a = c1962a;
    }

    private int[] m5411a(C1963b c1963b) {
        int i = 0;
        int i2 = 1;
        int length = c1963b.f6571b.length - 1;
        if (length == 1) {
            return new int[]{c1963b.m5405a(1)};
        }
        int[] iArr = new int[length];
        while (i2 < this.f6572a.f6566l && i < length) {
            if (c1963b.m5408b(i2) == 0) {
                iArr[i] = this.f6572a.m5403b(i2);
                i++;
            }
            i2++;
        }
        if (i == length) {
            return iArr;
        }
        throw new C1965d("Error locator degree does not match number of roots");
    }

    private int[] m5412a(C1963b c1963b, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int b = this.f6572a.m5403b(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int c = this.f6572a.m5404c(iArr[i3], b);
                    i2 = this.f6572a.m5404c(i2, (c & 1) == 0 ? c | 1 : c & -2);
                }
            }
            iArr2[i] = this.f6572a.m5404c(c1963b.m5408b(b), this.f6572a.m5403b(i2));
            if (this.f6572a.f6567m != 0) {
                iArr2[i] = this.f6572a.m5404c(iArr2[i], b);
            }
        }
        return iArr2;
    }

    public final void m5413a(int[] iArr, int i) {
        int[] iArr2 = iArr;
        int i2 = i;
        C1963b c1963b = new C1963b(this.f6572a, iArr2);
        int[] iArr3 = new int[i2];
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = r0.f6572a.f6567m + i4;
            int b = c1963b.m5408b(r0.f6572a.f6563i[i5]);
            iArr3[(i2 - 1) - i4] = b;
            if (b != 0) {
                i3 = 0;
            }
        }
        if (i3 == 0) {
            C1963b c1963b2;
            C1963b a;
            c1963b = new C1963b(r0.f6572a, iArr3);
            C1963b a2 = r0.f6572a.m5402a(i2, 1);
            if (a2.f6571b.length - 1 >= c1963b.f6571b.length - 1) {
                c1963b2 = a2;
                a2 = c1963b;
                c1963b = c1963b2;
            }
            C1963b c1963b3 = r0.f6572a.f6564j;
            C1963b c1963b4 = r0.f6572a.f6565k;
            while (true) {
                c1963b2 = a2;
                a2 = c1963b;
                c1963b = c1963b2;
                if (c1963b.f6571b.length - 1 < i2 / 2) {
                    break;
                } else if (c1963b.m5407a()) {
                    throw new C1965d("r_{i-1} was zero");
                } else {
                    C1963b c1963b5 = r0.f6572a.f6564j;
                    i5 = r0.f6572a.m5403b(c1963b.m5405a(c1963b.f6571b.length - 1));
                    while (a2.f6571b.length - 1 >= c1963b.f6571b.length - 1 && !a2.m5407a()) {
                        int length = (a2.f6571b.length - 1) - (c1963b.f6571b.length - 1);
                        int c = r0.f6572a.m5404c(a2.m5405a(a2.f6571b.length - 1), i5);
                        c1963b5 = c1963b5.m5406a(r0.f6572a.m5402a(length, c));
                        if (length < 0) {
                            throw new IllegalArgumentException();
                        }
                        C1963b c1963b6;
                        if (c == 0) {
                            c1963b6 = c1963b.f6570a.f6564j;
                        } else {
                            int length2 = c1963b.f6571b.length;
                            int[] iArr4 = new int[(length + length2)];
                            for (int i6 = 0; i6 < length2; i6++) {
                                iArr4[i6] = c1963b.f6570a.m5404c(c1963b.f6571b[i6], c);
                            }
                            c1963b6 = new C1963b(c1963b.f6570a, iArr4);
                        }
                        a2 = a2.m5406a(c1963b6);
                    }
                    a = c1963b5.m5409b(c1963b4).m5406a(c1963b3);
                    if (a2.f6571b.length - 1 >= c1963b.f6571b.length - 1) {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                    }
                    c1963b3 = c1963b4;
                    c1963b4 = a;
                }
            }
            int i7 = 0;
            i2 = c1963b4.m5405a(0);
            if (i2 == 0) {
                throw new C1965d("sigmaTilde(0) was zero");
            }
            i2 = r0.f6572a.m5403b(i2);
            a = c1963b4.m5410c(i2);
            C1963b c2 = c1963b.m5410c(i2);
            C1963b[] c1963bArr = new C1963b[]{a, c2};
            c2 = c1963bArr[0];
            c1963b = c1963bArr[1];
            int[] a3 = m5411a(c2);
            int[] a4 = m5412a(c1963b, a3);
            while (i7 < a3.length) {
                int length3 = (iArr2.length - 1) - r0.f6572a.m5401a(a3[i7]);
                if (length3 < 0) {
                    throw new C1965d("Bad error location");
                }
                iArr2[length3] = C1962a.m5400b(iArr2[length3], a4[i7]);
                i7++;
            }
        }
    }
}
