package p206d;

import com.p111d.p112a.p114b.p539a.C6464a;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.jivesoftware.smack.roster.Roster;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C6623c implements C5682d, C5683e, Cloneable, ByteChannel {
    private static final byte[] f18882c = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    C2275o f18883a;
    public long f18884b;

    class C22701 extends OutputStream {
        final /* synthetic */ C6623c f7554a;

        public C22701(C6623c c6623c) {
            this.f7554a = c6623c;
        }

        public final void close() {
        }

        public final void flush() {
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7554a);
            stringBuilder.append(".outputStream()");
            return stringBuilder.toString();
        }

        public final void write(int i) {
            this.f7554a.m17033b((byte) i);
        }

        public final void write(byte[] bArr, int i, int i2) {
            this.f7554a.m17035b(bArr, i, i2);
        }
    }

    class C22712 extends InputStream {
        final /* synthetic */ C6623c f7555a;

        C22712(C6623c c6623c) {
            this.f7555a = c6623c;
        }

        public final int available() {
            return (int) Math.min(this.f7555a.f18884b, 2147483647L);
        }

        public final void close() {
        }

        public final int read() {
            return this.f7555a.f18884b > 0 ? this.f7555a.mo3135f() & 255 : -1;
        }

        public final int read(byte[] bArr, int i, int i2) {
            return this.f7555a.m17018a(bArr, i, i2);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7555a);
            stringBuilder.append(".inputStream()");
            return stringBuilder.toString();
        }
    }

    private String m17016a(long j, Charset charset) {
        C2280u.m6235a(this.f18884b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j == 0) {
            return "";
        } else {
            C2275o c2275o = this.f18883a;
            if (((long) c2275o.f7564b) + j > ((long) c2275o.f7565c)) {
                return new String(mo3139g(j), charset);
            }
            String str = new String(c2275o.f7563a, c2275o.f7564b, (int) j, charset);
            c2275o.f7564b = (int) (((long) c2275o.f7564b) + j);
            this.f18884b -= j;
            if (c2275o.f7564b == c2275o.f7565c) {
                this.f18883a = c2275o.m6222b();
                C2276p.m6224a(c2275o);
            }
            return str;
        }
    }

    private String m17017m(long j) {
        return m17016a(j, C2280u.f7576a);
    }

    public final int m17018a(byte[] bArr, int i, int i2) {
        C2280u.m6235a((long) bArr.length, (long) i, (long) i2);
        C2275o c2275o = this.f18883a;
        if (c2275o == null) {
            return -1;
        }
        i2 = Math.min(i2, c2275o.f7565c - c2275o.f7564b);
        System.arraycopy(c2275o.f7563a, c2275o.f7564b, bArr, i, i2);
        c2275o.f7564b += i2;
        this.f18884b -= (long) i2;
        if (c2275o.f7564b == c2275o.f7565c) {
            this.f18883a = c2275o.m6222b();
            C2276p.m6224a(c2275o);
        }
        return i2;
    }

    public final long m17019a(byte b, long j, long j2) {
        C6623c c6623c = this;
        long j3 = 0;
        if (j >= 0) {
            if (j2 >= j) {
                long j4 = j2 > c6623c.f18884b ? c6623c.f18884b : j2;
                if (j == j4) {
                    return -1;
                }
                C2275o c2275o = c6623c.f18883a;
                if (c2275o == null) {
                    return -1;
                }
                if (c6623c.f18884b - j >= j) {
                    while (true) {
                        long j5 = j3 + ((long) (c2275o.f7565c - c2275o.f7564b));
                        if (j5 >= j) {
                            break;
                        }
                        c2275o = c2275o.f7568f;
                        j3 = j5;
                    }
                } else {
                    j3 = c6623c.f18884b;
                    while (j3 > j) {
                        c2275o = c2275o.f7569g;
                        j3 -= (long) (c2275o.f7565c - c2275o.f7564b);
                    }
                }
                long j6 = j;
                while (j3 < j4) {
                    byte[] bArr = c2275o.f7563a;
                    int min = (int) Math.min((long) c2275o.f7565c, (((long) c2275o.f7564b) + j4) - j3);
                    for (int i = (int) ((((long) c2275o.f7564b) + j6) - j3); i < min; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - c2275o.f7564b)) + j3;
                        }
                    }
                    byte b2 = b;
                    long j7 = j3 + ((long) (c2275o.f7565c - c2275o.f7564b));
                    c2275o = c2275o.f7568f;
                    j6 = j7;
                    j3 = j6;
                }
                return -1;
            }
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(c6623c.f18884b), Long.valueOf(j), Long.valueOf(j2)}));
    }

    public final long mo944a(C6623c c6623c, long j) {
        if (c6623c == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f18884b == 0) {
            return -1;
        } else {
            if (j > this.f18884b) {
                j = this.f18884b;
            }
            c6623c.a_(this, j);
            return j;
        }
    }

    public final long mo3120a(C2277r c2277r) {
        long j = this.f18884b;
        if (j > 0) {
            c2277r.a_(this, j);
        }
        return j;
    }

    public final long m17022a(C2278s c2278s) {
        if (c2278s == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a = c2278s.mo944a(this, IjkMediaMeta.AV_CH_TOP_FRONT_CENTER);
            if (a == -1) {
                return j;
            }
            j += a;
        }
    }

    public final p206d.C6623c m17023a(int r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0047 in {3, 6, 7, 15, 16, 17, 20, 23} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r4 >= r0) goto L_0x0008;
    L_0x0004:
        r3.m17033b(r4);
        return r3;
    L_0x0008:
        r1 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r2 = 63;
        if (r4 >= r1) goto L_0x0018;
    L_0x000e:
        r1 = r4 >> 6;
        r1 = r1 | 192;
    L_0x0012:
        r3.m17033b(r1);
        r4 = r4 & r2;
        r4 = r4 | r0;
        goto L_0x0004;
    L_0x0018:
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r4 >= r1) goto L_0x0036;
    L_0x001c:
        r1 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r1) goto L_0x002a;
    L_0x0021:
        r1 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r4 > r1) goto L_0x002a;
    L_0x0026:
        r3.m17033b(r2);
        return r3;
    L_0x002a:
        r1 = r4 >> 12;
        r1 = r1 | 224;
    L_0x002e:
        r3.m17033b(r1);
        r1 = r4 >> 6;
        r1 = r1 & r2;
        r1 = r1 | r0;
        goto L_0x0012;
    L_0x0036:
        r1 = 1114111; // 0x10ffff float:1.561202E-39 double:5.50444E-318;
        if (r4 > r1) goto L_0x0048;
    L_0x003b:
        r1 = r4 >> 18;
        r1 = r1 | 240;
        r3.m17033b(r1);
        r1 = r4 >> 12;
        r1 = r1 & r2;
        r1 = r1 | r0;
        goto L_0x002e;
        return r3;
    L_0x0048:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Unexpected code point: ";
        r1.<init>(r2);
        r4 = java.lang.Integer.toHexString(r4);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.c.a(int):d.c");
    }

    public final C6623c m17024a(C6623c c6623c, long j, long j2) {
        if (c6623c == null) {
            throw new IllegalArgumentException("out == null");
        }
        C2280u.m6235a(this.f18884b, j, j2);
        if (j2 == 0) {
            return this;
        }
        c6623c.f18884b += j2;
        C2275o c2275o = this.f18883a;
        while (j >= ((long) (c2275o.f7565c - c2275o.f7564b))) {
            long j3 = j - ((long) (c2275o.f7565c - c2275o.f7564b));
            c2275o = c2275o.f7568f;
            j = j3;
        }
        while (j2 > 0) {
            C2275o a = c2275o.m6219a();
            a.f7564b = (int) (((long) a.f7564b) + j);
            a.f7565c = Math.min(a.f7564b + ((int) j2), a.f7565c);
            if (c6623c.f18883a == null) {
                a.f7569g = a;
                a.f7568f = a;
                c6623c.f18883a = a;
            } else {
                c6623c.f18883a.f7569g.m6220a(a);
            }
            long j4 = j2 - ((long) (a.f7565c - a.f7564b));
            c2275o = c2275o.f7568f;
            j = 0;
            j2 = j4;
        }
        return this;
    }

    public final C6623c m17025a(C2272f c2272f) {
        if (c2272f == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c2272f.mo2041a(this);
        return this;
    }

    public final C6623c m17026a(String str) {
        return m17027a(str, 0, str.length());
    }

    public final C6623c m17027a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder("beginIndex < 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 < i) {
            r0 = new StringBuilder("endIndex < beginIndex: ");
            r0.append(i2);
            r0.append(" < ");
            r0.append(i);
            throw new IllegalArgumentException(r0.toString());
        } else if (i2 > str.length()) {
            r0 = new StringBuilder("endIndex > string.length: ");
            r0.append(i2);
            r0.append(" > ");
            r0.append(str.length());
            throw new IllegalArgumentException(r0.toString());
        } else {
            while (i < i2) {
                char charAt = str.charAt(i);
                int i3;
                int min;
                if (charAt < '') {
                    C2275o e = m17049e(1);
                    byte[] bArr = e.f7563a;
                    i3 = e.f7565c - i;
                    min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (true) {
                        i = i4;
                        if (i >= min) {
                            break;
                        }
                        charAt = str.charAt(i);
                        if (charAt >= '') {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                    }
                    i3 = (i3 + i) - e.f7565c;
                    e.f7565c += i3;
                    this.f18884b += (long) i3;
                } else {
                    int i5;
                    if (charAt < 'ࠀ') {
                        i5 = (charAt >> 6) | 192;
                    } else {
                        if (charAt >= '?') {
                            if (charAt <= '?') {
                                i3 = i + 1;
                                min = i3 < i2 ? str.charAt(i3) : 0;
                                if (charAt <= '?' && min >= C6464a.SURR2_FIRST) {
                                    if (min <= C6464a.SURR2_LAST) {
                                        i5 = 65536 + (((charAt & -55297) << 10) | (-56321 & min));
                                        m17033b((i5 >> 18) | 240);
                                        m17033b(((i5 >> 12) & 63) | 128);
                                        m17033b(((i5 >> 6) & 63) | 128);
                                        m17033b((i5 & 63) | 128);
                                        i += 2;
                                    }
                                }
                                m17033b(63);
                                i = i3;
                            }
                        }
                        m17033b((charAt >> 12) | 224);
                        i5 = ((charAt >> 6) & 63) | 128;
                    }
                    m17033b(i5);
                    m17033b((charAt & 63) | 128);
                    i++;
                }
            }
            return this;
        }
    }

    public final C2279t mo945a() {
        return C2279t.f7572c;
    }

    public final String mo3121a(Charset charset) {
        try {
            return m17016a(this.f18884b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void mo3122a(long j) {
        if (this.f18884b < j) {
            throw new EOFException();
        }
    }

    public final void mo3123a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = m17018a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    public final void a_(C6623c c6623c, long j) {
        if (c6623c == null) {
            throw new IllegalArgumentException("source == null");
        } else if (c6623c == this) {
            throw new IllegalArgumentException("source == this");
        } else {
            C2280u.m6235a(c6623c.f18884b, 0, j);
            while (j > 0) {
                C2275o c2275o;
                int i = 0;
                if (j < ((long) (c6623c.f18883a.f7565c - c6623c.f18883a.f7564b))) {
                    c2275o = this.f18883a != null ? this.f18883a.f7569g : null;
                    if (c2275o != null && c2275o.f7567e) {
                        if ((j + ((long) c2275o.f7565c)) - ((long) (c2275o.f7566d ? 0 : c2275o.f7564b)) <= IjkMediaMeta.AV_CH_TOP_FRONT_CENTER) {
                            c6623c.f18883a.m6221a(c2275o, (int) j);
                            c6623c.f18884b -= j;
                            this.f18884b += j;
                            return;
                        }
                    }
                    c2275o = c6623c.f18883a;
                    int i2 = (int) j;
                    if (i2 > 0) {
                        if (i2 <= c2275o.f7565c - c2275o.f7564b) {
                            C2275o a;
                            if (i2 >= Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
                                a = c2275o.m6219a();
                            } else {
                                a = C2276p.m6223a();
                                System.arraycopy(c2275o.f7563a, c2275o.f7564b, a.f7563a, 0, i2);
                            }
                            a.f7565c = a.f7564b + i2;
                            c2275o.f7564b += i2;
                            c2275o.f7569g.m6220a(a);
                            c6623c.f18883a = a;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                c2275o = c6623c.f18883a;
                long j2 = (long) (c2275o.f7565c - c2275o.f7564b);
                c6623c.f18883a = c2275o.m6222b();
                if (this.f18883a == null) {
                    this.f18883a = c2275o;
                    C2275o c2275o2 = this.f18883a;
                    c2275o = this.f18883a;
                    C2275o c2275o3 = this.f18883a;
                    c2275o.f7569g = c2275o3;
                    c2275o2.f7568f = c2275o3;
                } else {
                    c2275o = this.f18883a.f7569g.m6220a(c2275o);
                    if (c2275o.f7569g == c2275o) {
                        throw new IllegalStateException();
                    } else if (c2275o.f7569g.f7567e) {
                        int i3 = c2275o.f7565c - c2275o.f7564b;
                        int i4 = 8192 - c2275o.f7569g.f7565c;
                        if (!c2275o.f7569g.f7566d) {
                            i = c2275o.f7569g.f7564b;
                        }
                        if (i3 <= i4 + i) {
                            c2275o.m6221a(c2275o.f7569g, i3);
                            c2275o.m6222b();
                            C2276p.m6224a(c2275o);
                        }
                    }
                }
                c6623c.f18884b -= j2;
                this.f18884b += j2;
                j -= j2;
            }
        }
    }

    public final C6623c mo3124b() {
        return this;
    }

    public final C6623c m17033b(int i) {
        C2275o e = m17049e(1);
        byte[] bArr = e.f7563a;
        int i2 = e.f7565c;
        e.f7565c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f18884b++;
        return this;
    }

    public final C6623c m17034b(byte[] bArr) {
        if (bArr != null) {
            return m17035b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final C6623c m17035b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = (long) i2;
        C2280u.m6235a((long) bArr.length, (long) i, j);
        i2 += i;
        while (i < i2) {
            C2275o e = m17049e(1);
            int min = Math.min(i2 - i, 8192 - e.f7565c);
            System.arraycopy(bArr, i, e.f7563a, e.f7565c, min);
            i += min;
            e.f7565c += min;
        }
        this.f18884b += j;
        return this;
    }

    public final /* synthetic */ C5682d mo3125b(String str) {
        return m17026a(str);
    }

    public final boolean mo3126b(long j) {
        return this.f18884b >= j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3127b(p206d.C2272f r11) {
        /*
        r10 = this;
        r0 = r11.mo2050g();
        r1 = 0;
        if (r0 < 0) goto L_0x0032;
    L_0x0007:
        r2 = r10.f18884b;
        r4 = 0;
        r6 = r2 - r4;
        r2 = (long) r0;
        r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r8 < 0) goto L_0x0032;
    L_0x0012:
        r2 = r11.mo2050g();
        r2 = r2 - r1;
        if (r2 >= r0) goto L_0x001a;
    L_0x0019:
        return r1;
    L_0x001a:
        r2 = r1;
    L_0x001b:
        if (r2 >= r0) goto L_0x0030;
    L_0x001d:
        r6 = (long) r2;
        r8 = r4 + r6;
        r3 = r10.m17039c(r8);
        r6 = r1 + r2;
        r6 = r11.mo2038a(r6);
        if (r3 == r6) goto L_0x002d;
    L_0x002c:
        return r1;
    L_0x002d:
        r2 = r2 + 1;
        goto L_0x001b;
    L_0x0030:
        r11 = 1;
        return r11;
    L_0x0032:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.c.b(d.f):boolean");
    }

    public final byte m17039c(long j) {
        C2280u.m6235a(this.f18884b, j, 1);
        if (this.f18884b - j > j) {
            C2275o c2275o = this.f18883a;
            while (true) {
                long j2 = (long) (c2275o.f7565c - c2275o.f7564b);
                if (j < j2) {
                    return c2275o.f7563a[c2275o.f7564b + ((int) j)];
                }
                long j3 = j - j2;
                c2275o = c2275o.f7568f;
                j = j3;
            }
        } else {
            long j4 = j - this.f18884b;
            C2275o c2275o2 = this.f18883a.f7569g;
            while (true) {
                long j5 = j4 + ((long) (c2275o2.f7565c - c2275o2.f7564b));
                if (j5 >= 0) {
                    return c2275o2.f7563a[c2275o2.f7564b + ((int) j5)];
                }
                c2275o2 = c2275o2.f7569g;
                j4 = j5;
            }
        }
    }

    public final C6623c m17040c(int i) {
        C2275o e = m17049e(2);
        byte[] bArr = e.f7563a;
        int i2 = e.f7565c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.f7565c = i2;
        this.f18884b += 2;
        return this;
    }

    public final /* synthetic */ C5682d mo3128c(C2272f c2272f) {
        return m17025a(c2272f);
    }

    public final /* synthetic */ C5682d mo3129c(byte[] bArr) {
        return m17034b(bArr);
    }

    public final /* synthetic */ C5682d mo3130c(byte[] bArr, int i, int i2) {
        return m17035b(bArr, i, i2);
    }

    public final boolean mo3131c() {
        return this.f18884b == 0;
    }

    public final /* synthetic */ Object clone() {
        return m17073r();
    }

    public final void close() {
    }

    public final C6623c m17045d(int i) {
        C2275o e = m17049e(4);
        byte[] bArr = e.f7563a;
        int i2 = e.f7565c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.f7565c = i2;
        this.f18884b += 4;
        return this;
    }

    public final C2272f mo3132d(long j) {
        return new C2272f(mo3139g(j));
    }

    public final InputStream mo3133d() {
        return new C22712(this);
    }

    public final long m17048e() {
        long j = this.f18884b;
        if (j == 0) {
            return 0;
        }
        C2275o c2275o = this.f18883a.f7569g;
        if (c2275o.f7565c < 8192 && c2275o.f7567e) {
            j -= (long) (c2275o.f7565c - c2275o.f7564b);
        }
        return j;
    }

    final C2275o m17049e(int i) {
        if (i > 0) {
            if (i <= 8192) {
                C2275o c2275o;
                if (this.f18883a == null) {
                    this.f18883a = C2276p.m6223a();
                    C2275o c2275o2 = this.f18883a;
                    C2275o c2275o3 = this.f18883a;
                    c2275o = this.f18883a;
                    c2275o3.f7569g = c2275o;
                    c2275o2.f7568f = c2275o;
                    return c2275o;
                }
                c2275o = this.f18883a.f7569g;
                if (c2275o.f7565c + i > 8192 || !c2275o.f7567e) {
                    c2275o = c2275o.m6220a(C2276p.m6223a());
                }
                return c2275o;
            }
        }
        throw new IllegalArgumentException();
    }

    public final String mo3134e(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("limit < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j + 1;
        }
        long a = m17019a((byte) 10, 0, j2);
        if (a != -1) {
            return m17053f(a);
        }
        if (j2 < this.f18884b && m17039c(j2 - 1) == (byte) 13 && m17039c(j2) == (byte) 10) {
            return m17053f(j2);
        }
        C6623c c6623c = new C6623c();
        m17024a(c6623c, 0, Math.min(32, this.f18884b));
        stringBuilder = new StringBuilder("\\n not found: limit=");
        stringBuilder.append(Math.min(this.f18884b, j));
        stringBuilder.append(" content=");
        stringBuilder.append(c6623c.m17067l().mo2047e());
        stringBuilder.append('…');
        throw new EOFException(stringBuilder.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6623c)) {
            return false;
        }
        C6623c c6623c = (C6623c) obj;
        if (this.f18884b != c6623c.f18884b) {
            return false;
        }
        long j = 0;
        if (this.f18884b == 0) {
            return true;
        }
        C2275o c2275o = this.f18883a;
        C2275o c2275o2 = c6623c.f18883a;
        int i = c2275o.f7564b;
        int i2 = c2275o2.f7564b;
        while (j < this.f18884b) {
            long min = (long) Math.min(c2275o.f7565c - i, c2275o2.f7565c - i2);
            int i3 = i2;
            i2 = i;
            i = 0;
            while (((long) i) < min) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (c2275o.f7563a[i2] != c2275o2.f7563a[i3]) {
                    return false;
                }
                i++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == c2275o.f7565c) {
                c2275o = c2275o.f7568f;
                i = c2275o.f7564b;
            } else {
                i = i2;
            }
            if (i3 == c2275o2.f7565c) {
                c2275o2 = c2275o2.f7568f;
                i2 = c2275o2.f7564b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    public final byte mo3135f() {
        if (this.f18884b == 0) {
            throw new IllegalStateException("size == 0");
        }
        C2275o c2275o = this.f18883a;
        int i = c2275o.f7564b;
        int i2 = c2275o.f7565c;
        int i3 = i + 1;
        byte b = c2275o.f7563a[i];
        this.f18884b--;
        if (i3 == i2) {
            this.f18883a = c2275o.m6222b();
            C2276p.m6224a(c2275o);
            return b;
        }
        c2275o.f7564b = i3;
        return b;
    }

    public final /* synthetic */ C5682d mo3136f(int i) {
        return m17045d(i);
    }

    final String m17053f(long j) {
        String m;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (m17039c(j3) == (byte) 13) {
                m = m17017m(j3);
                j2 = 2;
                mo3142h(j2);
                return m;
            }
        }
        m = m17017m(j);
        mo3142h(j2);
        return m;
    }

    public final void flush() {
    }

    public final /* synthetic */ C5682d mo3137g(int i) {
        return m17040c(i);
    }

    public final short mo3138g() {
        if (this.f18884b < 2) {
            StringBuilder stringBuilder = new StringBuilder("size < 2: ");
            stringBuilder.append(this.f18884b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        C2275o c2275o = this.f18883a;
        int i = c2275o.f7564b;
        int i2 = c2275o.f7565c;
        if (i2 - i < 2) {
            return (short) (((mo3135f() & 255) << 8) | (mo3135f() & 255));
        }
        byte[] bArr = c2275o.f7563a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f18884b -= 2;
        if (i4 == i2) {
            this.f18883a = c2275o.m6222b();
            C2276p.m6224a(c2275o);
        } else {
            c2275o.f7564b = i4;
        }
        return (short) i;
    }

    public final byte[] mo3139g(long j) {
        C2280u.m6235a(this.f18884b, 0, j);
        if (j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        byte[] bArr = new byte[((int) j)];
        mo3123a(bArr);
        return bArr;
    }

    public final int mo3140h() {
        if (this.f18884b < 4) {
            StringBuilder stringBuilder = new StringBuilder("size < 4: ");
            stringBuilder.append(this.f18884b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        C2275o c2275o = this.f18883a;
        int i = c2275o.f7564b;
        int i2 = c2275o.f7565c;
        if (i2 - i < 4) {
            return ((((mo3135f() & 255) << 24) | ((mo3135f() & 255) << 16)) | ((mo3135f() & 255) << 8)) | (mo3135f() & 255);
        }
        byte[] bArr = c2275o.f7563a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        i3 = i4 + 1;
        i |= (bArr[i4] & 255) << 8;
        i4 = i3 + 1;
        i |= bArr[i3] & 255;
        this.f18884b -= 4;
        if (i4 == i2) {
            this.f18883a = c2275o.m6222b();
            C2276p.m6224a(c2275o);
            return i;
        }
        c2275o.f7564b = i4;
        return i;
    }

    public final /* synthetic */ C5682d mo3141h(int i) {
        return m17033b(i);
    }

    public final void mo3142h(long j) {
        while (j > 0) {
            if (this.f18883a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, (long) (this.f18883a.f7565c - this.f18883a.f7564b));
            long j2 = (long) min;
            this.f18884b -= j2;
            long j3 = j - j2;
            C2275o c2275o = this.f18883a;
            c2275o.f7564b += min;
            if (this.f18883a.f7564b == this.f18883a.f7565c) {
                c2275o = this.f18883a;
                this.f18883a = c2275o.m6222b();
                C2276p.m6224a(c2275o);
            }
            j = j3;
        }
    }

    public final int hashCode() {
        C2275o c2275o = this.f18883a;
        if (c2275o == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = c2275o.f7564b; i2 < c2275o.f7565c; i2++) {
                i = c2275o.f7563a[i2] + (31 * i);
            }
            c2275o = c2275o.f7568f;
        } while (c2275o != this.f18883a);
        return i;
    }

    public final C6623c m17060i(long j) {
        if (j == 0) {
            return m17033b(48);
        }
        int i = 0;
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return m17026a("-9223372036854775808");
            }
            i = 1;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (i != 0) {
            i2++;
        }
        C2275o e = m17049e(i2);
        byte[] bArr = e.f7563a;
        int i3 = e.f7565c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f18882c[(int) (j % 10)];
            j /= 10;
        }
        if (i != 0) {
            bArr[i3 - 1] = (byte) 45;
        }
        e.f7565c += i2;
        this.f18884b += (long) i2;
        return this;
    }

    public final short mo3143i() {
        return C2280u.m6234a(mo3138g());
    }

    public final boolean isOpen() {
        return true;
    }

    public final int mo3144j() {
        return C2280u.m6233a(mo3140h());
    }

    public final C6623c m17063j(long j) {
        if (j == 0) {
            return m17033b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2275o e = m17049e(numberOfTrailingZeros);
        byte[] bArr = e.f7563a;
        int i = e.f7565c;
        for (int i2 = (e.f7565c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f18882c[(int) (j & 15)];
            j >>>= 4;
        }
        e.f7565c += numberOfTrailingZeros;
        this.f18884b += (long) numberOfTrailingZeros;
        return this;
    }

    public final long mo3145k() {
        if (this.f18884b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        int i2 = 0;
        long j = 0;
        do {
            C2275o c2275o = r0.f18883a;
            byte[] bArr = c2275o.f7563a;
            int i3 = c2275o.f7564b;
            int i4 = c2275o.f7565c;
            while (i3 < i4) {
                int i5;
                int i6 = bArr[i3];
                if (i6 < (byte) 48 || i6 > (byte) 57) {
                    if (i6 >= (byte) 97 && i6 <= (byte) 102) {
                        i5 = i6 - 97;
                    } else if (i6 < (byte) 65 || i6 > (byte) 70) {
                        if (i != 0) {
                            i2 = 1;
                            if (i3 != i4) {
                                r0.f18883a = c2275o.m6222b();
                                C2276p.m6224a(c2275o);
                            } else {
                                c2275o.f7564b = i3;
                            }
                            if (i2 == 0) {
                                break;
                            }
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                            stringBuilder.append(Integer.toHexString(i6));
                            throw new NumberFormatException(stringBuilder.toString());
                        }
                    } else {
                        i5 = i6 - 65;
                    }
                    i5 += 10;
                } else {
                    i5 = i6 - 48;
                }
                if ((j & -1152921504606846976L) != 0) {
                    C6623c b = new C6623c().m17063j(j).m17033b(i6);
                    StringBuilder stringBuilder2 = new StringBuilder("Number too large: ");
                    stringBuilder2.append(b.m17068m());
                    throw new NumberFormatException(stringBuilder2.toString());
                }
                i3++;
                i++;
                j = (j << 4) | ((long) i5);
            }
            if (i3 != i4) {
                c2275o.f7564b = i3;
            } else {
                r0.f18883a = c2275o.m6222b();
                C2276p.m6224a(c2275o);
            }
            if (i2 == 0) {
                break;
            }
        } while (r0.f18883a != null);
        r0.f18884b -= (long) i;
        return j;
    }

    public final /* synthetic */ C5682d mo3146k(long j) {
        return m17063j(j);
    }

    public final /* synthetic */ C5682d mo3147l(long j) {
        return m17060i(j);
    }

    public final C2272f m17067l() {
        return new C2272f(mo3149o());
    }

    public final String m17068m() {
        try {
            return m17016a(this.f18884b, C2280u.f7576a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String mo3148n() {
        return mo3134e(Long.MAX_VALUE);
    }

    public final byte[] mo3149o() {
        try {
            return mo3139g(this.f18884b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void m17071p() {
        try {
            mo3142h(this.f18884b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final long mo3150q() {
        return m17019a((byte) 0, 0, Long.MAX_VALUE);
    }

    public final C6623c m17073r() {
        C6623c c6623c = new C6623c();
        if (this.f18884b == 0) {
            return c6623c;
        }
        c6623c.f18883a = this.f18883a.m6219a();
        C2275o c2275o = c6623c.f18883a;
        C2275o c2275o2 = c6623c.f18883a;
        C2275o c2275o3 = c6623c.f18883a;
        c2275o2.f7569g = c2275o3;
        c2275o.f7568f = c2275o3;
        c2275o = this.f18883a;
        while (true) {
            c2275o = c2275o.f7568f;
            if (c2275o != this.f18883a) {
                c6623c.f18883a.f7569g.m6220a(c2275o.m6219a());
            } else {
                c6623c.f18884b = this.f18884b;
                return c6623c;
            }
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        C2275o c2275o = this.f18883a;
        if (c2275o == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c2275o.f7565c - c2275o.f7564b);
        byteBuffer.put(c2275o.f7563a, c2275o.f7564b, min);
        c2275o.f7564b += min;
        this.f18884b -= (long) min;
        if (c2275o.f7564b == c2275o.f7565c) {
            this.f18883a = c2275o.m6222b();
            C2276p.m6224a(c2275o);
        }
        return min;
    }

    public final /* bridge */ /* synthetic */ C5682d mo3151s() {
        return this;
    }

    public final String toString() {
        if (this.f18884b > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder("size > Integer.MAX_VALUE: ");
            stringBuilder.append(this.f18884b);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i = (int) this.f18884b;
        return (i == 0 ? C2272f.f7557b : new C5691q(this, i)).toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C2275o e = m17049e(1);
            int min = Math.min(i, 8192 - e.f7565c);
            byteBuffer.get(e.f7563a, e.f7565c, min);
            i -= min;
            e.f7565c += min;
        }
        this.f18884b += (long) remaining;
        return remaining;
    }
}
