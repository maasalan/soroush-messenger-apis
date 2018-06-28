package com.p085c.p086a.p109i;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class C1269f extends FilterInputStream {
    private int f3976a = Integer.MIN_VALUE;

    public C1269f(InputStream inputStream) {
        super(inputStream);
    }

    private long m3009a(long j) {
        if (this.f3976a == 0) {
            return -1;
        }
        if (this.f3976a != Integer.MIN_VALUE && j > ((long) this.f3976a)) {
            j = (long) this.f3976a;
        }
        return j;
    }

    private void m3010b(long j) {
        if (this.f3976a != Integer.MIN_VALUE && j != -1) {
            this.f3976a = (int) (((long) this.f3976a) - j);
        }
    }

    public final int available() {
        return this.f3976a == Integer.MIN_VALUE ? super.available() : Math.min(this.f3976a, super.available());
    }

    public final void mark(int i) {
        super.mark(i);
        this.f3976a = i;
    }

    public final int read() {
        if (m3009a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m3010b(1);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        i2 = (int) m3009a((long) i2);
        if (i2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, i2);
        m3010b((long) read);
        return read;
    }

    public final void reset() {
        super.reset();
        this.f3976a = Integer.MIN_VALUE;
    }

    public final long skip(long j) {
        j = m3009a(j);
        if (j == -1) {
            return -1;
        }
        j = super.skip(j);
        m3010b(j);
        return j;
    }
}
