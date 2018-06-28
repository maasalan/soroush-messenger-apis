package com.p067a.p070b.p071a;

import java.io.ByteArrayOutputStream;

public final class C0975j extends ByteArrayOutputStream {
    private final C0968b f3142a;

    public C0975j(C0968b c0968b, int i) {
        this.f3142a = c0968b;
        this.buf = this.f3142a.m2424a(Math.max(i, 256));
    }

    private void m2433a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f3142a.m2424a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f3142a.m2423a(this.buf);
            this.buf = a;
        }
    }

    public final void close() {
        this.f3142a.m2423a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f3142a.m2423a(this.buf);
    }

    public final synchronized void write(int i) {
        m2433a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m2433a(i2);
        super.write(bArr, i, i2);
    }
}
