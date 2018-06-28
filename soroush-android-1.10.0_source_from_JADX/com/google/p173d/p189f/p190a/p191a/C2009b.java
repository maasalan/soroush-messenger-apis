package com.google.p173d.p189f.p190a.p191a;

public final class C2009b {
    public static final C2009b f6735a = new C2009b();
    public final int[] f6736b = new int[929];
    public final int[] f6737c = new int[929];
    public final C2010c f6738d;
    public final C2010c f6739e;
    final int f6740f = 929;

    private C2009b() {
        int i = 1;
        for (int i2 = 0; i2 < 929; i2++) {
            this.f6736b[i2] = i;
            i = (i * 3) % 929;
        }
        for (int i3 = 0; i3 < 928; i3++) {
            this.f6737c[this.f6736b[i3]] = i3;
        }
        this.f6738d = new C2010c(this, new int[]{0});
        this.f6739e = new C2010c(this, new int[]{1});
    }

    public final int m5486a(int i) {
        if (i != 0) {
            return this.f6736b[(this.f6740f - this.f6737c[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public final C2010c m5487a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f6738d;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C2010c(this, iArr);
        }
    }

    final int m5488b(int i, int i2) {
        return (i + i2) % this.f6740f;
    }

    public final int m5489c(int i, int i2) {
        return ((this.f6740f + i) - i2) % this.f6740f;
    }

    public final int m5490d(int i, int i2) {
        if (i != 0) {
            if (i2 != 0) {
                return this.f6736b[(this.f6737c[i] + this.f6737c[i2]) % (this.f6740f - 1)];
            }
        }
        return 0;
    }
}
