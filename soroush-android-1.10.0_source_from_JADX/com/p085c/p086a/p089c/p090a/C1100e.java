package com.p085c.p086a.p089c.p090a;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class C1100e extends FilterInputStream {
    private static final byte[] f3593a = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
    private static final int f3594b = 29;
    private static final int f3595c = 31;
    private final byte f3596d;
    private int f3597e;

    public C1100e(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1) {
            if (i <= 8) {
                this.f3596d = (byte) i;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot add invalid orientation: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i;
        if (this.f3597e >= 2) {
            if (this.f3597e <= f3595c) {
                i = this.f3597e == f3595c ? this.f3596d : f3593a[this.f3597e - 2] & 255;
                if (i != -1) {
                    this.f3597e++;
                }
                return i;
            }
        }
        i = super.read();
        if (i != -1) {
            this.f3597e++;
        }
        return i;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        if (this.f3597e > f3595c) {
            read = super.read(bArr, i, i2);
        } else if (this.f3597e == f3595c) {
            bArr[i] = this.f3596d;
            read = 1;
        } else if (this.f3597e < 2) {
            read = super.read(bArr, i, 2 - this.f3597e);
        } else {
            i2 = Math.min(f3595c - this.f3597e, i2);
            System.arraycopy(f3593a, this.f3597e - 2, bArr, i, i2);
            read = i2;
        }
        if (read > 0) {
            this.f3597e += read;
        }
        return read;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) {
        j = super.skip(j);
        if (j > 0) {
            this.f3597e = (int) (((long) this.f3597e) + j);
        }
        return j;
    }
}
