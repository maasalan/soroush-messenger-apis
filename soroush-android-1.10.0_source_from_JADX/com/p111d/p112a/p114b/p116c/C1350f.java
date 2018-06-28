package com.p111d.p112a.p114b.p116c;

import java.io.InputStream;

public final class C1350f extends InputStream {
    private final C1347c f4203a;
    private final InputStream f4204b;
    private byte[] f4205c;
    private int f4206d;
    private final int f4207e;

    public C1350f(C1347c c1347c, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f4203a = c1347c;
        this.f4204b = inputStream;
        this.f4205c = bArr;
        this.f4206d = i;
        this.f4207e = i2;
    }

    private void m3221a() {
        byte[] bArr = this.f4205c;
        if (bArr != null) {
            this.f4205c = null;
            if (this.f4203a != null) {
                this.f4203a.m3196a(bArr);
            }
        }
    }

    public final int available() {
        return this.f4205c != null ? this.f4207e - this.f4206d : this.f4204b.available();
    }

    public final void close() {
        m3221a();
        this.f4204b.close();
    }

    public final void mark(int i) {
        if (this.f4205c == null) {
            this.f4204b.mark(i);
        }
    }

    public final boolean markSupported() {
        return this.f4205c == null && this.f4204b.markSupported();
    }

    public final int read() {
        if (this.f4205c == null) {
            return this.f4204b.read();
        }
        byte[] bArr = this.f4205c;
        int i = this.f4206d;
        this.f4206d = i + 1;
        int i2 = bArr[i] & 255;
        if (this.f4206d >= this.f4207e) {
            m3221a();
        }
        return i2;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f4205c == null) {
            return this.f4204b.read(bArr, i, i2);
        }
        int i3 = this.f4207e - this.f4206d;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this.f4205c, this.f4206d, bArr, i, i2);
        this.f4206d += i2;
        if (this.f4206d >= this.f4207e) {
            m3221a();
        }
        return i2;
    }

    public final void reset() {
        if (this.f4205c == null) {
            this.f4204b.reset();
        }
    }

    public final long skip(long j) {
        long j2;
        if (this.f4205c != null) {
            long j3 = (long) (this.f4207e - this.f4206d);
            if (j3 > j) {
                this.f4206d += (int) j;
                return j;
            }
            m3221a();
            j2 = 0 + j3;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.f4204b.skip(j) : j2;
    }
}
