package com.google.p173d.p177b.p179b;

final class C1963b {
    final C1962a f6570a;
    final int[] f6571b;

    C1963b(C1962a c1962a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f6570a = c1962a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f6571b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f6571b = new int[]{0};
            return;
        }
        this.f6571b = new int[(length - i)];
        System.arraycopy(iArr, i, this.f6571b, 0, this.f6571b.length);
    }

    final int m5405a(int i) {
        return this.f6571b[(this.f6571b.length - 1) - i];
    }

    final C1963b m5406a(C1963b c1963b) {
        if (!this.f6570a.equals(c1963b.f6570a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (m5407a()) {
            return c1963b;
        } else {
            if (c1963b.m5407a()) {
                return this;
            }
            int[] iArr = this.f6571b;
            Object obj = c1963b.f6571b;
            if (iArr.length > obj.length) {
                Object obj2 = iArr;
                iArr = obj;
                obj = obj2;
            }
            Object obj3 = new int[obj.length];
            int length = obj.length - iArr.length;
            System.arraycopy(obj, 0, obj3, 0, length);
            for (int i = length; i < obj.length; i++) {
                obj3[i] = C1962a.m5400b(iArr[i - length], obj[i]);
            }
            return new C1963b(this.f6570a, obj3);
        }
    }

    final boolean m5407a() {
        return this.f6571b[0] == 0;
    }

    final int m5408b(int i) {
        int i2 = 0;
        if (i == 0) {
            return m5405a(0);
        }
        int i3 = 1;
        int i4;
        if (i == 1) {
            int[] iArr = this.f6571b;
            i3 = iArr.length;
            i4 = 0;
            while (i2 < i3) {
                i4 = C1962a.m5400b(i4, iArr[i2]);
                i2++;
            }
            return i4;
        }
        i2 = this.f6571b[0];
        i4 = this.f6571b.length;
        while (i3 < i4) {
            i2 = C1962a.m5400b(this.f6570a.m5404c(i, i2), this.f6571b[i3]);
            i3++;
        }
        return i2;
    }

    final C1963b m5409b(C1963b c1963b) {
        if (this.f6570a.equals(c1963b.f6570a)) {
            if (!m5407a()) {
                if (!c1963b.m5407a()) {
                    int[] iArr = this.f6571b;
                    int length = iArr.length;
                    int[] iArr2 = c1963b.f6571b;
                    int length2 = iArr2.length;
                    int[] iArr3 = new int[((length + length2) - 1)];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr3[i4] = C1962a.m5400b(iArr3[i4], this.f6570a.m5404c(i2, iArr2[i3]));
                        }
                    }
                    return new C1963b(this.f6570a, iArr3);
                }
            }
            return this.f6570a.f6564j;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    final C1963b m5410c(int i) {
        if (i == 0) {
            return this.f6570a.f6564j;
        }
        if (i == 1) {
            return this;
        }
        int length = this.f6571b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f6570a.m5404c(this.f6571b[i2], i);
        }
        return new C1963b(this.f6570a, iArr);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(8 * (this.f6571b.length - 1));
        for (int length = this.f6571b.length - 1; length >= 0; length--) {
            int a = m5405a(length);
            if (a != 0) {
                if (a < 0) {
                    stringBuilder.append(" - ");
                    a = -a;
                } else if (stringBuilder.length() > 0) {
                    stringBuilder.append(" + ");
                }
                if (length == 0 || a != 1) {
                    char c;
                    a = this.f6570a.m5401a(a);
                    if (a == 0) {
                        c = '1';
                    } else if (a == 1) {
                        c = 'a';
                    } else {
                        stringBuilder.append("a^");
                        stringBuilder.append(a);
                    }
                    stringBuilder.append(c);
                }
                if (length != 0) {
                    if (length == 1) {
                        stringBuilder.append('x');
                    } else {
                        stringBuilder.append("x^");
                        stringBuilder.append(length);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
