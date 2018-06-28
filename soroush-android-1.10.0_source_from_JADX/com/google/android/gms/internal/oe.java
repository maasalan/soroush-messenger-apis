package com.google.android.gms.internal;

public final class oe implements Cloneable {
    static final of f6243a = new of();
    int[] f6244b;
    of[] f6245c;
    int f6246d;
    private boolean f6247e;

    oe() {
        this(10);
    }

    private oe(int i) {
        this.f6247e = false;
        i = m5102a(i);
        this.f6244b = new int[i];
        this.f6245c = new of[i];
        this.f6246d = 0;
    }

    static int m5102a(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    public final boolean m5103a() {
        return this.f6246d == 0;
    }

    final int m5104b(int i) {
        int i2 = this.f6246d - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f6244b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f6246d;
        oe oeVar = new oe(i);
        int i2 = 0;
        System.arraycopy(this.f6244b, 0, oeVar.f6244b, 0, i);
        while (i2 < i) {
            if (this.f6245c[i2] != null) {
                oeVar.f6245c[i2] = (of) this.f6245c[i2].clone();
            }
            i2++;
        }
        oeVar.f6246d = i;
        return oeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        if (this.f6246d != oeVar.f6246d) {
            return false;
        }
        boolean z;
        int[] iArr = this.f6244b;
        int[] iArr2 = oeVar.f6244b;
        int i = this.f6246d;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            boolean z2;
            of[] ofVarArr = this.f6245c;
            of[] ofVarArr2 = oeVar.f6245c;
            int i3 = this.f6246d;
            for (i = 0; i < i3; i++) {
                if (!ofVarArr[i].equals(ofVarArr2[i])) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f6246d; i2++) {
            i = (((i * 31) + this.f6244b[i2]) * 31) + this.f6245c[i2].hashCode();
        }
        return i;
    }
}
