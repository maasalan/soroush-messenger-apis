package p206d;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.Inflater;

public final class C5688k implements C2278s {
    private final C5683e f15631a;
    private final Inflater f15632b;
    private int f15633c;
    private boolean f15634d;

    C5688k(C5683e c5683e, Inflater inflater) {
        if (c5683e == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f15631a = c5683e;
            this.f15632b = inflater;
        }
    }

    private void m12712b() {
        if (this.f15633c != 0) {
            int remaining = this.f15633c - this.f15632b.getRemaining();
            this.f15633c -= remaining;
            this.f15631a.mo3142h((long) remaining);
        }
    }

    public final long mo944a(C6623c c6623c, long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f15634d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            int i;
            do {
                C2275o c2275o;
                i = 0;
                if (this.f15632b.needsInput()) {
                    m12712b();
                    if (this.f15632b.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.f15631a.mo3131c()) {
                        i = 1;
                    } else {
                        c2275o = this.f15631a.mo3124b().f18883a;
                        this.f15633c = c2275o.f7565c - c2275o.f7564b;
                        this.f15632b.setInput(c2275o.f7563a, c2275o.f7564b, this.f15633c);
                    }
                }
                try {
                    c2275o = c6623c.m17049e(1);
                    int inflate = this.f15632b.inflate(c2275o.f7563a, c2275o.f7565c, (int) Math.min(j, (long) (8192 - c2275o.f7565c)));
                    if (inflate > 0) {
                        c2275o.f7565c += inflate;
                        long j2 = (long) inflate;
                        c6623c.f18884b += j2;
                        return j2;
                    }
                    if (!this.f15632b.finished()) {
                        if (this.f15632b.needsDictionary()) {
                        }
                    }
                    m12712b();
                    if (c2275o.f7564b == c2275o.f7565c) {
                        c6623c.f18883a = c2275o.m6222b();
                        C2276p.m6224a(c2275o);
                    }
                    return -1;
                } catch (Throwable e) {
                    throw new IOException(e);
                }
            } while (i == 0);
            throw new EOFException("source exhausted prematurely");
        }
    }

    public final C2279t mo945a() {
        return this.f15631a.mo945a();
    }

    public final void close() {
        if (!this.f15634d) {
            this.f15632b.end();
            this.f15634d = true;
            this.f15631a.close();
        }
    }
}
