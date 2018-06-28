package p206d;

import java.nio.ByteBuffer;

final class C6625m implements C5682d {
    public final C6623c f18886a = new C6623c();
    public final C2277r f18887b;
    boolean f18888c;

    C6625m(C2277r c2277r) {
        if (c2277r == null) {
            throw new NullPointerException("sink == null");
        }
        this.f18887b = c2277r;
    }

    public final C2279t mo960a() {
        return this.f18887b.mo960a();
    }

    public final void a_(C6623c c6623c, long j) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.a_(c6623c, j);
        mo3151s();
    }

    public final C6623c mo3124b() {
        return this.f18886a;
    }

    public final C5682d mo3125b(String str) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17026a(str);
        return mo3151s();
    }

    public final C5682d mo3128c(C2272f c2272f) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17025a(c2272f);
        return mo3151s();
    }

    public final C5682d mo3129c(byte[] bArr) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17034b(bArr);
        return mo3151s();
    }

    public final C5682d mo3130c(byte[] bArr, int i, int i2) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17035b(bArr, i, i2);
        return mo3151s();
    }

    public final void close() {
        if (!this.f18888c) {
            Throwable th = null;
            try {
                if (this.f18886a.f18884b > 0) {
                    this.f18887b.a_(this.f18886a, this.f18886a.f18884b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f18887b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f18888c = true;
            if (th != null) {
                C2280u.m6236a(th);
            }
        }
    }

    public final C5682d mo3136f(int i) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17045d(i);
        return mo3151s();
    }

    public final void flush() {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        if (this.f18886a.f18884b > 0) {
            this.f18887b.a_(this.f18886a, this.f18886a.f18884b);
        }
        this.f18887b.flush();
    }

    public final C5682d mo3137g(int i) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17040c(i);
        return mo3151s();
    }

    public final C5682d mo3141h(int i) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17033b(i);
        return mo3151s();
    }

    public final boolean isOpen() {
        return !this.f18888c;
    }

    public final C5682d mo3146k(long j) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17063j(j);
        return mo3151s();
    }

    public final C5682d mo3147l(long j) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        this.f18886a.m17060i(j);
        return mo3151s();
    }

    public final C5682d mo3151s() {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        long e = this.f18886a.m17048e();
        if (e > 0) {
            this.f18887b.a_(this.f18886a, e);
        }
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.f18887b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (this.f18888c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f18886a.write(byteBuffer);
        mo3151s();
        return write;
    }
}
