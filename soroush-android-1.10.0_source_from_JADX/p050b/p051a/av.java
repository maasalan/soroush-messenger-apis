package p050b.p051a;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.Map;

public final class av extends C0814d {

    public static class C0802d {
        byte[] f2414e;

        public C0802d(av avVar) {
            this.f2414e = avVar.mo877d();
        }

        public int mo835a(int i, int i2, int i3) {
            return mo836a(i, i2, i3, true);
        }

        public int mo836a(int i, int i2, int i3, boolean z) {
            for (i2 = 0; i2 < i3; i2++) {
                byte b = this.f2414e[i];
                if (b == (byte) 7) {
                    mo839a(i, C0817g.m1832a(this.f2414e, i + 1));
                } else if (b == (byte) 8) {
                    mo840b(i, C0817g.m1832a(this.f2414e, i + 1));
                } else {
                    mo838a(i, b);
                    i++;
                }
                i += 3;
            }
            return i;
        }

        public void mo837a() {
            int a = C0817g.m1832a(this.f2414e, 0);
            int i = 2;
            for (int i2 = 0; i2 < a; i2++) {
                int a2 = C0817g.m1832a(this.f2414e, i);
                i = mo835a(i + 4, a2, C0817g.m1832a(this.f2414e, i + 2));
                i = mo836a(i + 2, a2, C0817g.m1832a(this.f2414e, i), false);
            }
        }

        public void mo838a(int i, byte b) {
        }

        public void mo839a(int i, int i2) {
        }

        public void mo840b(int i, int i2) {
        }
    }

    public static class C0803e {
        public ByteArrayOutputStream f2415a = new ByteArrayOutputStream();

        public final void m1760a(int i) {
            this.f2415a.write((i >>> 8) & 255);
            this.f2415a.write(i & 255);
        }
    }

    static class C4936a extends C0802d {
        byte[] f13748a = new byte[this.e.length];
        C0827p f13749b;
        C0827p f13750c;
        Map f13751d;

        C4936a(av avVar, C0827p c0827p, Map map) {
            super(avVar);
            this.f13749b = avVar.m1829b();
            this.f13750c = c0827p;
            this.f13751d = map;
        }

        public final int mo835a(int i, int i2, int i3) {
            C0817g.m1833a(i2, this.f13748a, i - 4);
            return super.mo835a(i, i2, i3);
        }

        public final int mo836a(int i, int i2, int i3, boolean z) {
            C0817g.m1833a(i3, this.f13748a, i - 2);
            return super.mo836a(i, i2, i3, z);
        }

        public final void mo837a() {
            C0817g.m1833a(C0817g.m1832a(this.e, 0), this.f13748a, 0);
            super.mo837a();
        }

        public final void mo838a(int i, byte b) {
            this.f13748a[i] = b;
        }

        public final void mo839a(int i, int i2) {
            this.f13748a[i] = (byte) 7;
            C0817g.m1833a(this.f13749b.m1868a(i2, this.f13750c, this.f13751d), this.f13748a, i + 1);
        }

        public final void mo840b(int i, int i2) {
            this.f13748a[i] = (byte) 8;
            C0817g.m1833a(i2, this.f13748a, i + 1);
        }
    }

    static class C4937b extends C0802d {
        private int f13752a;
        private int f13753b;
        private boolean f13754c;

        public C4937b(av avVar, int i, int i2, boolean z) {
            super(avVar);
            this.f13752a = i;
            this.f13753b = i2;
            this.f13754c = z;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo835a(int r4, int r5, int r6) {
            /*
            r3 = this;
            r0 = r3.f13754c;
            if (r0 == 0) goto L_0x0009;
        L_0x0004:
            r0 = r3.f13752a;
            if (r0 > r5) goto L_0x0017;
        L_0x0008:
            goto L_0x000d;
        L_0x0009:
            r0 = r3.f13752a;
            if (r0 >= r5) goto L_0x0017;
        L_0x000d:
            r0 = r3.f13753b;
            r0 = r0 + r5;
            r1 = r3.e;
            r2 = r4 + -4;
            p050b.p051a.C0817g.m1833a(r0, r1, r2);
        L_0x0017:
            r4 = super.mo835a(r4, r5, r6);
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.av.b.a(int, int, int):int");
        }

        public final void mo840b(int i, int i2) {
            if (this.f13752a <= i2) {
                C0817g.m1833a(i2 + this.f13753b, this.e, i + 1);
            }
        }
    }

    static class C4938c extends C0802d {
        private int f13755a;
        private int f13756b;

        public C4938c(av avVar, int i, int i2) {
            super(avVar);
            this.f13755a = i;
            this.f13756b = i2;
        }

        public final int mo835a(int i, int i2, int i3) {
            int i4;
            if (this.f13755a == i + i2) {
                i4 = i2 - this.f13756b;
            } else {
                if (this.f13755a == i) {
                    i4 = this.f13756b + i2;
                }
                return super.mo835a(i, i2, i3);
            }
            C0817g.m1833a(i4, this.e, i - 4);
            return super.mo835a(i, i2, i3);
        }
    }

    av(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    public av(C0827p c0827p, byte[] bArr) {
        super(c0827p, "StackMap", bArr);
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        C4936a c4936a = new C4936a(this, c0827p, map);
        c4936a.mo837a();
        return new av(c4936a.f13750c, c4936a.f13748a);
    }

    final void m9594a(int i, int i2, boolean z) {
        new C4937b(this, i, i2, z).mo837a();
    }
}
