package com.p111d.p112a.p121c.p138m;

import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class C1523f extends OutputStream {
    protected final ByteBuffer f4744a;

    public C1523f(ByteBuffer byteBuffer) {
        this.f4744a = byteBuffer;
    }

    public final void write(int i) {
        this.f4744a.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f4744a.put(bArr, i, i2);
    }
}
