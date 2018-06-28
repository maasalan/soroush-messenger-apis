package p206d;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C6626n implements C5683e {
    public final C6623c f18889a = new C6623c();
    public final C2278s f18890b;
    boolean f18891c;

    class C22741 extends InputStream {
        final /* synthetic */ C6626n f7562a;

        C22741(C6626n c6626n) {
            this.f7562a = c6626n;
        }

        public final int available() {
            if (!this.f7562a.f18891c) {
                return (int) Math.min(this.f7562a.f18889a.f18884b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.f7562a.close();
        }

        public final int read() {
            if (!this.f7562a.f18891c) {
                return (this.f7562a.f18889a.f18884b == 0 && this.f7562a.f18890b.mo944a(this.f7562a.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1) ? -1 : this.f7562a.f18889a.mo3135f() & 255;
            } else {
                throw new IOException("closed");
            }
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (this.f7562a.f18891c) {
                throw new IOException("closed");
            }
            C2280u.m6235a((long) bArr.length, (long) i, (long) i2);
            return (this.f7562a.f18889a.f18884b == 0 && this.f7562a.f18890b.mo944a(this.f7562a.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1) ? -1 : this.f7562a.f18889a.m17018a(bArr, i, i2);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7562a);
            stringBuilder.append(".inputStream()");
            return stringBuilder.toString();
        }
    }

    C6626n(C2278s c2278s) {
        if (c2278s == null) {
            throw new NullPointerException("source == null");
        }
        this.f18890b = c2278s;
    }

    private long m17089a(byte b, long j, long j2) {
        if (this.f18891c) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(0), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a = this.f18889a.m17019a(b, j, j2);
                if (a != -1) {
                    return a;
                }
                a = this.f18889a.f18884b;
                if (a >= j2 || this.f18890b.mo944a(this.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1) {
                    return -1;
                }
                j = Math.max(j, a);
            }
            return -1;
        }
    }

    public final long mo944a(C6623c c6623c, long j) {
        if (c6623c == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f18891c) {
            throw new IllegalStateException("closed");
        } else if (this.f18889a.f18884b == 0 && this.f18890b.mo944a(this.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1) {
            return -1;
        } else {
            return this.f18889a.mo944a(c6623c, Math.min(j, this.f18889a.f18884b));
        }
    }

    public final long mo3120a(C2277r c2277r) {
        long j = 0;
        while (this.f18890b.mo944a(this.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) != -1) {
            long e = this.f18889a.m17048e();
            if (e > 0) {
                long j2 = j + e;
                c2277r.a_(this.f18889a, e);
                j = j2;
            }
        }
        if (this.f18889a.f18884b <= 0) {
            return j;
        }
        e = j + this.f18889a.f18884b;
        c2277r.a_(this.f18889a, this.f18889a.f18884b);
        return e;
    }

    public final C2279t mo945a() {
        return this.f18890b.mo945a();
    }

    public final String mo3121a(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f18889a.m17022a(this.f18890b);
        return this.f18889a.mo3121a(charset);
    }

    public final void mo3122a(long j) {
        if (!mo3126b(j)) {
            throw new EOFException();
        }
    }

    public final void mo3123a(byte[] bArr) {
        try {
            mo3122a((long) bArr.length);
            this.f18889a.mo3123a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f18889a.f18884b > 0) {
                int a = this.f18889a.m17018a(bArr, i, (int) this.f18889a.f18884b);
                if (a == -1) {
                    throw new AssertionError();
                }
                i += a;
            }
            throw e;
        }
    }

    public final C6623c mo3124b() {
        return this.f18889a;
    }

    public final boolean mo3126b(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f18891c) {
            throw new IllegalStateException("closed");
        } else {
            while (this.f18889a.f18884b < j) {
                if (this.f18890b.mo944a(this.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean mo3127b(C2272f c2272f) {
        int g = c2272f.mo2050g();
        if (this.f18891c) {
            throw new IllegalStateException("closed");
        } else if (g < 0 || c2272f.mo2050g() - 0 < g) {
            return false;
        } else {
            int i = 0;
            while (i < g) {
                long j = 0 + ((long) i);
                if (!mo3126b(j + 1) || this.f18889a.m17039c(j) != c2272f.mo2038a(0 + i)) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public final boolean mo3131c() {
        if (!this.f18891c) {
            return this.f18889a.mo3131c() && this.f18890b.mo944a(this.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void close() {
        if (!this.f18891c) {
            this.f18891c = true;
            this.f18890b.close();
            this.f18889a.m17071p();
        }
    }

    public final C2272f mo3132d(long j) {
        mo3122a(j);
        return this.f18889a.mo3132d(j);
    }

    public final InputStream mo3133d() {
        return new C22741(this);
    }

    public final String mo3134e(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("limit < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a = m17089a((byte) 10, 0, j2);
        if (a != -1) {
            return this.f18889a.m17053f(a);
        }
        if (j2 < Long.MAX_VALUE && mo3126b(j2) && this.f18889a.m17039c(j2 - 1) == (byte) 13 && mo3126b(j2 + 1) && this.f18889a.m17039c(j2) == (byte) 10) {
            return this.f18889a.m17053f(j2);
        }
        C6623c c6623c = new C6623c();
        this.f18889a.m17024a(c6623c, 0, Math.min(32, this.f18889a.f18884b));
        stringBuilder = new StringBuilder("\\n not found: limit=");
        stringBuilder.append(Math.min(this.f18889a.f18884b, j));
        stringBuilder.append(" content=");
        stringBuilder.append(c6623c.m17067l().mo2047e());
        stringBuilder.append('…');
        throw new EOFException(stringBuilder.toString());
    }

    public final byte mo3135f() {
        mo3122a(1);
        return this.f18889a.mo3135f();
    }

    public final short mo3138g() {
        mo3122a(2);
        return this.f18889a.mo3138g();
    }

    public final byte[] mo3139g(long j) {
        mo3122a(j);
        return this.f18889a.mo3139g(j);
    }

    public final int mo3140h() {
        mo3122a(4);
        return this.f18889a.mo3140h();
    }

    public final void mo3142h(long j) {
        if (this.f18891c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f18889a.f18884b == 0 && this.f18890b.mo944a(this.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f18889a.f18884b);
            this.f18889a.mo3142h(min);
            j -= min;
        }
    }

    public final short mo3143i() {
        mo3122a(2);
        return C2280u.m6234a(this.f18889a.mo3138g());
    }

    public final boolean isOpen() {
        return !this.f18891c;
    }

    public final int mo3144j() {
        mo3122a(4);
        return C2280u.m6233a(this.f18889a.mo3140h());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo3145k() {
        /*
        r6 = this;
        r0 = 1;
        r6.mo3122a(r0);
        r0 = 0;
        r1 = r0;
    L_0x0007:
        r2 = r1 + 1;
        r3 = (long) r2;
        r3 = r6.mo3126b(r3);
        if (r3 == 0) goto L_0x0049;
    L_0x0010:
        r3 = r6.f18889a;
        r4 = (long) r1;
        r3 = r3.m17039c(r4);
        r4 = 48;
        if (r3 < r4) goto L_0x001f;
    L_0x001b:
        r4 = 57;
        if (r3 <= r4) goto L_0x0030;
    L_0x001f:
        r4 = 97;
        if (r3 < r4) goto L_0x0027;
    L_0x0023:
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r3 <= r4) goto L_0x0030;
    L_0x0027:
        r4 = 65;
        if (r3 < r4) goto L_0x0032;
    L_0x002b:
        r4 = 70;
        if (r3 <= r4) goto L_0x0030;
    L_0x002f:
        goto L_0x0032;
    L_0x0030:
        r1 = r2;
        goto L_0x0007;
    L_0x0032:
        if (r1 != 0) goto L_0x0049;
    L_0x0034:
        r1 = new java.lang.NumberFormatException;
        r2 = "Expected leading [0-9a-fA-F] character but was %#x";
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r3 = java.lang.Byte.valueOf(r3);
        r4[r0] = r3;
        r0 = java.lang.String.format(r2, r4);
        r1.<init>(r0);
        throw r1;
    L_0x0049:
        r0 = r6.f18889a;
        r0 = r0.mo3145k();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n.k():long");
    }

    public final String mo3148n() {
        return mo3134e(Long.MAX_VALUE);
    }

    public final byte[] mo3149o() {
        this.f18889a.m17022a(this.f18890b);
        return this.f18889a.mo3149o();
    }

    public final long mo3150q() {
        return m17089a((byte) 0, 0, Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        return (this.f18889a.f18884b == 0 && this.f18890b.mo944a(this.f18889a, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) == -1) ? -1 : this.f18889a.read(byteBuffer);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.f18890b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
