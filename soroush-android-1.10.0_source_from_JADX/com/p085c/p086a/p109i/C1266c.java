package com.p085c.p086a.p109i;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class C1266c extends InputStream {
    private static final Queue<C1266c> f3968b = C1273i.m3020a(0);
    public IOException f3969a;
    private InputStream f3970c;

    C1266c() {
    }

    public static C1266c m2995a(InputStream inputStream) {
        C1266c c1266c;
        synchronized (f3968b) {
            c1266c = (C1266c) f3968b.poll();
        }
        if (c1266c == null) {
            c1266c = new C1266c();
        }
        c1266c.f3970c = inputStream;
        return c1266c;
    }

    public final void m2996a() {
        this.f3969a = null;
        this.f3970c = null;
        synchronized (f3968b) {
            f3968b.offer(this);
        }
    }

    public final int available() {
        return this.f3970c.available();
    }

    public final void close() {
        this.f3970c.close();
    }

    public final void mark(int i) {
        this.f3970c.mark(i);
    }

    public final boolean markSupported() {
        return this.f3970c.markSupported();
    }

    public final int read() {
        try {
            return this.f3970c.read();
        } catch (IOException e) {
            this.f3969a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f3970c.read(bArr);
        } catch (IOException e) {
            this.f3969a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f3970c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f3969a = e;
            return -1;
        }
    }

    public final synchronized void reset() {
        this.f3970c.reset();
    }

    public final long skip(long j) {
        try {
            return this.f3970c.skip(j);
        } catch (IOException e) {
            this.f3969a = e;
            return 0;
        }
    }
}
