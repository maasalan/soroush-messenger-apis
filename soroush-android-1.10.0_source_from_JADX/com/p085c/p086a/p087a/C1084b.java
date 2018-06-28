package com.p085c.p086a.p087a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class C1084b implements Closeable {
    final Charset f3550a;
    int f3551b;
    private final InputStream f3552c;
    private byte[] f3553d;
    private int f3554e;

    public C1084b(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private C1084b(InputStream inputStream, Charset charset, byte b) {
        if (inputStream != null) {
            if (charset != null) {
                if (charset.equals(C1085c.f3555a)) {
                    this.f3552c = inputStream;
                    this.f3550a = charset;
                    this.f3553d = new byte[8192];
                    return;
                }
                throw new IllegalArgumentException("Unsupported encoding");
            }
        }
        throw new NullPointerException();
    }

    private void m2628b() {
        int read = this.f3552c.read(this.f3553d, 0, this.f3553d.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f3554e = 0;
        this.f3551b = read;
    }

    public final String m2629a() {
        synchronized (this.f3552c) {
            if (this.f3553d == null) {
                throw new IOException("LineReader is closed");
            }
            int i;
            if (this.f3554e >= this.f3551b) {
                m2628b();
            }
            for (int i2 = this.f3554e; i2 != this.f3551b; i2++) {
                if (this.f3553d[i2] == (byte) 10) {
                    int i3;
                    String str;
                    if (i2 != this.f3554e) {
                        i3 = i2 - 1;
                        if (this.f3553d[i3] == (byte) 13) {
                            str = new String(this.f3553d, this.f3554e, i3 - this.f3554e, this.f3550a.name());
                            this.f3554e = i2 + 1;
                            return str;
                        }
                    }
                    i3 = i2;
                    str = new String(this.f3553d, this.f3554e, i3 - this.f3554e, this.f3550a.name());
                    this.f3554e = i2 + 1;
                    return str;
                }
            }
            ByteArrayOutputStream c10831 = new ByteArrayOutputStream(this, (this.f3551b - this.f3554e) + 80) {
                final /* synthetic */ C1084b f3549a;

                public final String toString() {
                    int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
                    try {
                        return new String(this.buf, 0, i, this.f3549a.f3550a.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1:
            while (true) {
                c10831.write(this.f3553d, this.f3554e, this.f3551b - this.f3554e);
                this.f3551b = -1;
                m2628b();
                i = this.f3554e;
                while (i != this.f3551b) {
                    if (this.f3553d[i] == (byte) 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f3554e) {
                c10831.write(this.f3553d, this.f3554e, i - this.f3554e);
            }
            this.f3554e = i + 1;
            String byteArrayOutputStream = c10831.toString();
            return byteArrayOutputStream;
        }
    }

    public final void close() {
        synchronized (this.f3552c) {
            if (this.f3553d != null) {
                this.f3553d = null;
                this.f3552c.close();
            }
        }
    }
}
