package com.p085c.p086a.p109i;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class C1265b extends FilterInputStream {
    private final long f3966a;
    private int f3967b;

    private C1265b(InputStream inputStream, long j) {
        super(inputStream);
        this.f3966a = j;
    }

    private int m2993a(int i) {
        if (i >= 0) {
            this.f3967b += i;
            return i;
        } else if (this.f3966a - ((long) this.f3967b) <= 0) {
            return i;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Failed to read all expected data, expected: ");
            stringBuilder.append(this.f3966a);
            stringBuilder.append(", but read: ");
            stringBuilder.append(this.f3967b);
            throw new IOException(stringBuilder.toString());
        }
    }

    public static InputStream m2994a(InputStream inputStream, long j) {
        return new C1265b(inputStream, j);
    }

    public final synchronized int available() {
        return (int) Math.max(this.f3966a - ((long) this.f3967b), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        m2993a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        return m2993a(super.read(bArr, i, i2));
    }
}
