package p206d;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class C5687j implements C2278s {
    private int f15626a = 0;
    private final C5683e f15627b;
    private final Inflater f15628c;
    private final C5688k f15629d;
    private final CRC32 f15630e = new CRC32();

    public C5687j(C2278s c2278s) {
        if (c2278s == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f15628c = new Inflater(true);
        this.f15627b = C2273l.m6209a(c2278s);
        this.f15629d = new C5688k(this.f15627b, this.f15628c);
    }

    private void m12708a(C6623c c6623c, long j, long j2) {
        C2275o c2275o = c6623c.f18883a;
        while (j >= ((long) (c2275o.f7565c - c2275o.f7564b))) {
            long j3 = j - ((long) (c2275o.f7565c - c2275o.f7564b));
            c2275o = c2275o.f7568f;
            j = j3;
        }
        while (j2 > 0) {
            int i = (int) (((long) c2275o.f7564b) + j);
            int min = (int) Math.min((long) (c2275o.f7565c - i), j2);
            this.f15630e.update(c2275o.f7563a, i, min);
            j3 = j2 - ((long) min);
            c2275o = c2275o.f7568f;
            j = 0;
            j2 = j3;
        }
    }

    private static void m12709a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    public final long mo944a(C6623c c6623c, long j) {
        C5687j c5687j = this;
        C6623c c6623c2 = c6623c;
        long j2 = j;
        if (j2 < 0) {
            StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
            stringBuilder.append(j2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j2 == 0) {
            return 0;
        } else {
            if (c5687j.f15626a == 0) {
                long q;
                c5687j.f15627b.mo3122a(10);
                byte c = c5687j.f15627b.mo3124b().m17039c(3);
                int i = ((c >> 1) & 1) == 1 ? 1 : 0;
                if (i != 0) {
                    m12708a(c5687j.f15627b.mo3124b(), 0, 10);
                }
                C5687j.m12709a("ID1ID2", 8075, c5687j.f15627b.mo3138g());
                c5687j.f15627b.mo3142h(8);
                if (((c >> 2) & 1) == 1) {
                    long j3;
                    c5687j.f15627b.mo3122a(2);
                    if (i != 0) {
                        m12708a(c5687j.f15627b.mo3124b(), 0, 2);
                    }
                    long i2 = (long) c5687j.f15627b.mo3124b().mo3143i();
                    c5687j.f15627b.mo3122a(i2);
                    if (i != 0) {
                        j3 = i2;
                        m12708a(c5687j.f15627b.mo3124b(), 0, i2);
                    } else {
                        j3 = i2;
                    }
                    c5687j.f15627b.mo3142h(j3);
                }
                if (((c >> 3) & 1) == 1) {
                    q = c5687j.f15627b.mo3150q();
                    if (q == -1) {
                        throw new EOFException();
                    }
                    if (i != 0) {
                        m12708a(c5687j.f15627b.mo3124b(), 0, q + 1);
                    }
                    c5687j.f15627b.mo3142h(q + 1);
                }
                if (((c >> 4) & 1) == 1) {
                    q = c5687j.f15627b.mo3150q();
                    if (q == -1) {
                        throw new EOFException();
                    }
                    if (i != 0) {
                        m12708a(c5687j.f15627b.mo3124b(), 0, q + 1);
                    }
                    c5687j.f15627b.mo3142h(q + 1);
                }
                if (i != 0) {
                    C5687j.m12709a("FHCRC", c5687j.f15627b.mo3143i(), (short) ((int) c5687j.f15630e.getValue()));
                    c5687j.f15630e.reset();
                }
                c5687j.f15626a = 1;
            }
            if (c5687j.f15626a == 1) {
                long j4 = c6623c2.f18884b;
                j2 = c5687j.f15629d.mo944a(c6623c2, j2);
                if (j2 != -1) {
                    m12708a(c6623c2, j4, j2);
                    return j2;
                }
                c5687j.f15626a = 2;
            }
            if (c5687j.f15626a == 2) {
                C5687j.m12709a("CRC", c5687j.f15627b.mo3144j(), (int) c5687j.f15630e.getValue());
                C5687j.m12709a("ISIZE", c5687j.f15627b.mo3144j(), (int) c5687j.f15628c.getBytesWritten());
                c5687j.f15626a = 3;
                if (!c5687j.f15627b.mo3131c()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final C2279t mo945a() {
        return this.f15627b.mo945a();
    }

    public final void close() {
        this.f15629d.close();
    }
}
