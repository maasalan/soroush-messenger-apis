package p056c.p057a.p061e;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p056c.p057a.C0885c;
import p056c.p057a.p061e.C0891d.C0890b;
import p206d.C5682d;
import p206d.C6623c;

public final class C0899j implements Closeable {
    private static final Logger f2746c = Logger.getLogger(C0892e.class.getName());
    int f2747a = 16384;
    final C0890b f2748b = new C0890b(this.f2751f);
    private final C5682d f2749d;
    private final boolean f2750e;
    private final C6623c f2751f = new C6623c();
    private boolean f2752g;

    C0899j(C5682d c5682d, boolean z) {
        this.f2749d = c5682d;
        this.f2750e = z;
    }

    private void m2180a(int i, int i2, byte b, byte b2) {
        if (f2746c.isLoggable(Level.FINE)) {
            f2746c.fine(C0892e.m2133a(false, i, i2, b, b2));
        }
        if (i2 > this.f2747a) {
            throw C0892e.m2132a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f2747a), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) != 0) {
            throw C0892e.m2132a("reserved bit set: %s", Integer.valueOf(i));
        } else {
            C5682d c5682d = this.f2749d;
            c5682d.mo3141h((i2 >>> 16) & 255);
            c5682d.mo3141h((i2 >>> 8) & 255);
            c5682d.mo3141h(i2 & 255);
            this.f2749d.mo3141h(b & 255);
            this.f2749d.mo3141h(b2 & 255);
            this.f2749d.mo3136f(i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
    }

    private void m2181b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f2747a, j);
            long j2 = (long) min;
            long j3 = j - j2;
            m2180a(i, min, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
            this.f2749d.a_(this.f2751f, j2);
            j = j3;
        }
    }

    public final synchronized void m2182a() {
        if (this.f2752g) {
            throw new IOException("closed");
        } else if (this.f2750e) {
            if (f2746c.isLoggable(Level.FINE)) {
                f2746c.fine(C0885c.m2092a(">> CONNECTION %s", C0892e.f2693a.mo2047e()));
            }
            this.f2749d.mo3129c(C0892e.f2693a.mo2051h());
            this.f2749d.flush();
        }
    }

    public final synchronized void m2183a(int i, long j) {
        if (this.f2752g) {
            throw new IOException("closed");
        }
        if (j != 0) {
            if (j <= 2147483647L) {
                m2180a(i, 4, (byte) 8, (byte) 0);
                this.f2749d.mo3136f((int) j);
                this.f2749d.flush();
            }
        }
        throw C0892e.m2132a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
    }

    public final synchronized void m2184a(int i, C0887b c0887b) {
        if (this.f2752g) {
            throw new IOException("closed");
        } else if (c0887b.f2663l == -1) {
            throw new IllegalArgumentException();
        } else {
            m2180a(i, 4, (byte) 3, (byte) 0);
            this.f2749d.mo3136f(c0887b.f2663l);
            this.f2749d.flush();
        }
    }

    public final synchronized void m2185a(int i, C0887b c0887b, byte[] bArr) {
        if (this.f2752g) {
            throw new IOException("closed");
        } else if (c0887b.f2663l == -1) {
            throw C0892e.m2132a("errorCode.httpCode == -1", new Object[0]);
        } else {
            m2180a(0, 8 + bArr.length, (byte) 7, (byte) 0);
            this.f2749d.mo3136f(i);
            this.f2749d.mo3136f(c0887b.f2663l);
            if (bArr.length > 0) {
                this.f2749d.mo3129c(bArr);
            }
            this.f2749d.flush();
        }
    }

    public final synchronized void m2186a(C0903m c0903m) {
        if (this.f2752g) {
            throw new IOException("closed");
        }
        int i = this.f2747a;
        if ((32 & c0903m.f2761a) != 0) {
            i = c0903m.f2762b[5];
        }
        this.f2747a = i;
        if (c0903m.m2200a() != -1) {
            this.f2748b.m2129a(c0903m.m2200a());
        }
        m2180a(0, 0, (byte) 4, (byte) 1);
        this.f2749d.flush();
    }

    public final synchronized void m2187a(boolean z, int i, int i2) {
        if (this.f2752g) {
            throw new IOException("closed");
        }
        m2180a(0, 8, (byte) 6, (byte) z);
        this.f2749d.mo3136f(i);
        this.f2749d.mo3136f(i2);
        this.f2749d.flush();
    }

    public final synchronized void m2188a(boolean z, int i, C6623c c6623c, int i2) {
        if (this.f2752g) {
            throw new IOException("closed");
        }
        m2180a(i, i2, (byte) 0, (byte) z);
        if (i2 > 0) {
            this.f2749d.a_(c6623c, (long) i2);
        }
    }

    public final synchronized void m2189a(boolean z, int i, List<C0888c> list) {
        if (this.f2752g) {
            throw new IOException("closed");
        } else if (this.f2752g) {
            throw new IOException("closed");
        } else {
            this.f2748b.m2130a((List) list);
            long j = this.f2751f.f18884b;
            int min = (int) Math.min((long) this.f2747a, j);
            long j2 = (long) min;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m2180a(i, min, (byte) 1, b);
            this.f2749d.a_(this.f2751f, j2);
            if (j > j2) {
                m2181b(i, j - j2);
            }
        }
    }

    public final synchronized void m2190b() {
        if (this.f2752g) {
            throw new IOException("closed");
        }
        this.f2749d.flush();
    }

    public final synchronized void m2191b(C0903m c0903m) {
        if (this.f2752g) {
            throw new IOException("closed");
        }
        int i = (byte) 0;
        m2180a(0, Integer.bitCount(c0903m.f2761a) * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (c0903m.m2202a(i)) {
                int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                this.f2749d.mo3137g(i2);
                this.f2749d.mo3136f(c0903m.f2762b[i]);
            }
            i++;
        }
        this.f2749d.flush();
    }

    public final synchronized void close() {
        this.f2752g = true;
        this.f2749d.close();
    }
}
