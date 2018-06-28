package com.p111d.p112a.p121c.p138m;

import java.io.InputStream;
import java.nio.ByteBuffer;

public final class C1522e extends InputStream {
    protected final ByteBuffer f4743a;

    public C1522e(ByteBuffer byteBuffer) {
        this.f4743a = byteBuffer;
    }

    public final int available() {
        return this.f4743a.remaining();
    }

    public final int read() {
        return this.f4743a.hasRemaining() ? this.f4743a.get() & 255 : -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f4743a.hasRemaining()) {
            return -1;
        }
        i2 = Math.min(i2, this.f4743a.remaining());
        this.f4743a.get(bArr, i, i2);
        return i2;
    }
}
