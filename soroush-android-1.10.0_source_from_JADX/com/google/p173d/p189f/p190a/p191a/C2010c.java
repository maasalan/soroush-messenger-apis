package com.google.p173d.p189f.p190a.p191a;

public final class C2010c {
    public final C2009b f6741a;
    public final int[] f6742b;

    public C2010c(C2009b c2009b, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f6741a = c2009b;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f6742b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f6742b = new int[]{0};
            return;
        }
        this.f6742b = new int[(length - i)];
        System.arraycopy(iArr, i, this.f6742b, 0, this.f6742b.length);
    }

    public final int m5491a(int i) {
        return this.f6742b[(this.f6742b.length - 1) - i];
    }

    public final C2010c m5492a(C2010c c2010c) {
        if (!this.f6741a.equals(c2010c.f6741a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (m5493a()) {
            return c2010c;
        } else {
            if (c2010c.m5493a()) {
                return this;
            }
            int[] iArr = this.f6742b;
            Object obj = c2010c.f6742b;
            if (iArr.length > obj.length) {
                Object obj2 = iArr;
                iArr = obj;
                obj = obj2;
            }
            Object obj3 = new int[obj.length];
            int length = obj.length - iArr.length;
            System.arraycopy(obj, 0, obj3, 0, length);
            for (int i = length; i < obj.length; i++) {
                obj3[i] = this.f6741a.m5488b(iArr[i - length], obj[i]);
            }
            return new C2010c(this.f6741a, obj3);
        }
    }

    public final boolean m5493a() {
        return this.f6742b[0] == 0;
    }

    public final int m5494b(int i) {
        int i2 = 0;
        if (i == 0) {
            return m5491a(0);
        }
        int i3 = 1;
        int i4;
        if (i == 1) {
            int[] iArr = this.f6742b;
            i3 = iArr.length;
            i4 = 0;
            while (i2 < i3) {
                i4 = this.f6741a.m5488b(i4, iArr[i2]);
                i2++;
            }
            return i4;
        }
        i2 = this.f6742b[0];
        i4 = this.f6742b.length;
        while (i3 < i4) {
            i2 = this.f6741a.m5488b(this.f6741a.m5490d(i, i2), this.f6742b[i3]);
            i3++;
        }
        return i2;
    }

    public final C2010c m5495b() {
        int length = this.f6742b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f6741a.m5489c(0, this.f6742b[i]);
        }
        return new C2010c(this.f6741a, iArr);
    }

    public final C2010c m5496b(C2010c c2010c) {
        if (this.f6741a.equals(c2010c.f6741a)) {
            return c2010c.m5493a() ? this : m5492a(c2010c.m5495b());
        } else {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
    }

    public final C2010c m5497c(int i) {
        if (i == 0) {
            return this.f6741a.f6738d;
        }
        if (i == 1) {
            return this;
        }
        int length = this.f6742b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f6741a.m5490d(this.f6742b[i2], i);
        }
        return new C2010c(this.f6741a, iArr);
    }

    public final C2010c m5498c(C2010c c2010c) {
        if (this.f6741a.equals(c2010c.f6741a)) {
            if (!m5493a()) {
                if (!c2010c.m5493a()) {
                    int[] iArr = this.f6742b;
                    int length = iArr.length;
                    int[] iArr2 = c2010c.f6742b;
                    int length2 = iArr2.length;
                    int[] iArr3 = new int[((length + length2) - 1)];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr3[i4] = this.f6741a.m5488b(iArr3[i4], this.f6741a.m5490d(i2, iArr2[i3]));
                        }
                    }
                    return new C2010c(this.f6741a, iArr3);
                }
            }
            return this.f6741a.f6738d;
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(8 * (this.f6742b.length - 1));
        for (int length = this.f6742b.length - 1; length >= 0; length--) {
            int a = m5491a(length);
            if (a != 0) {
                if (a < 0) {
                    stringBuilder.append(" - ");
                    a = -a;
                } else if (stringBuilder.length() > 0) {
                    stringBuilder.append(" + ");
                }
                if (length == 0 || a != 1) {
                    stringBuilder.append(a);
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
