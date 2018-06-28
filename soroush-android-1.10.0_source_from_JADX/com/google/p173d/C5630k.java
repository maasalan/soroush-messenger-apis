package com.google.p173d;

public final class C5630k extends C2044h {
    private final byte[] f15484c;
    private final int f15485d;
    private final int f15486e;
    private final int f15487f;
    private final int f15488g;

    public C5630k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 <= i) {
            if (i6 + i4 <= i2) {
                this.f15484c = bArr;
                this.f15485d = i;
                this.f15486e = i2;
                this.f15487f = i3;
                this.f15488g = i4;
                return;
            }
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    public final byte[] mo1767a() {
        int i = this.f6868a;
        int i2 = this.f6869b;
        if (i == this.f15485d && i2 == this.f15486e) {
            return this.f15484c;
        }
        int i3 = i * i2;
        Object obj = new byte[i3];
        int i4 = (this.f15488g * this.f15485d) + this.f15487f;
        int i5 = 0;
        if (i == this.f15485d) {
            System.arraycopy(this.f15484c, i4, obj, 0, i3);
            return obj;
        }
        while (i5 < i2) {
            System.arraycopy(this.f15484c, i4, obj, i5 * i, i);
            i4 += this.f15485d;
            i5++;
        }
        return obj;
    }

    public final byte[] mo1768a(int i, byte[] bArr) {
        if (i >= 0) {
            if (i < this.f6869b) {
                Object obj;
                int i2 = this.f6868a;
                if (bArr == null || bArr.length < i2) {
                    obj = new byte[i2];
                }
                System.arraycopy(this.f15484c, ((i + this.f15488g) * this.f15485d) + this.f15487f, obj, 0, i2);
                return obj;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Requested row is outside the image: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
