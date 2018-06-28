package p050b.p051a;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Map;

public final class aw extends C0814d {

    public static class C0804c extends RuntimeException {
        public C0804c(String str) {
            super(str);
        }
    }

    public static class C0805g {
        byte[] f2416f;
        int f2417g;

        public C0805g(aw awVar) {
            this(awVar.mo877d());
        }

        public C0805g(byte[] bArr) {
            this.f2416f = bArr;
            this.f2417g = C0817g.m1832a(bArr, 0);
        }

        private int mo846b(int i, int i2) {
            int i3;
            if (i2 < 128) {
                i2 -= 64;
                i3 = i;
            } else {
                i2 = C0817g.m1832a(this.f2416f, i + 1);
                i3 = i + 2;
            }
            int i4 = this.f2416f[i3 + 1] & 255;
            int i5 = 0;
            if (i4 == 7 || i4 == 8) {
                i3 += 2;
                i5 = C0817g.m1832a(this.f2416f, i3);
                mo841a(i4, i5, i3);
            }
            mo842a(i, i2, i4, i5);
            return i3 + 2;
        }

        private int m1762b(int i, int i2, int[] iArr, int[] iArr2) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + 1;
                i = this.f2416f[i] & 255;
                iArr[i3] = i;
                if (i != 7) {
                    if (i == 8) {
                    }
                    i = i4;
                }
                iArr2[i3] = C0817g.m1832a(this.f2416f, i4);
                mo841a(i, iArr2[i3], i4);
                i4 += 2;
                i = i4;
            }
            return i;
        }

        public void mo841a(int i, int i2, int i3) {
        }

        public void mo842a(int i, int i2, int i3, int i4) {
        }

        public void mo843a(int i, int i2, int[] iArr, int[] iArr2) {
        }

        public void mo844a(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        }

        public void a_(int i, int i2) {
        }

        public final void m1767b() {
            int i = this.f2417g;
            int i2 = 2;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = this.f2416f[i2] & 255;
                if (i4 < 64) {
                    a_(i2, i4);
                    i2++;
                } else {
                    if (i4 >= 128) {
                        if (i4 < 247) {
                            throw new C0815e("bad frame_type in StackMapTable");
                        } else if (i4 != 247) {
                            if (i4 < 251) {
                                mo847b(i2, C0817g.m1832a(this.f2416f, i2 + 1), 251 - i4);
                            } else if (i4 == 251) {
                                a_(i2, C0817g.m1832a(this.f2416f, i2 + 1));
                            } else if (i4 < 255) {
                                i4 -= 251;
                                int a = C0817g.m1832a(this.f2416f, i2 + 1);
                                r8 = new int[i4];
                                int[] iArr = new int[i4];
                                int i5 = i2 + 3;
                                for (int i6 = 0; i6 < i4; i6++) {
                                    r12 = this.f2416f[i5] & 255;
                                    r8[i6] = r12;
                                    if (r12 != 7) {
                                        if (r12 != 8) {
                                            iArr[i6] = 0;
                                            i5++;
                                        }
                                    }
                                    int i7 = i5 + 1;
                                    iArr[i6] = C0817g.m1832a(this.f2416f, i7);
                                    mo841a(r12, iArr[i6], i7);
                                    i5 += 3;
                                }
                                mo843a(i2, a, r8, iArr);
                                i2 = i5;
                            } else {
                                int a2 = C0817g.m1832a(this.f2416f, i2 + 1);
                                i4 = C0817g.m1832a(this.f2416f, i2 + 3);
                                int[] iArr2 = new int[i4];
                                r8 = new int[i4];
                                i4 = m1762b(i2 + 5, i4, iArr2, r8);
                                int a3 = C0817g.m1832a(this.f2416f, i4);
                                int[] iArr3 = new int[a3];
                                int[] iArr4 = new int[a3];
                                r12 = m1762b(i4 + 2, a3, iArr3, iArr4);
                                mo844a(i2, a2, iArr2, r8, iArr3, iArr4);
                                i2 = r12;
                            }
                            i2 += 3;
                        }
                    }
                    i2 = mo846b(i2, i4);
                }
            }
        }

        public void mo847b(int i, int i2, int i3) {
        }
    }

    public static class C0806h {
        ByteArrayOutputStream f2418a;
        int f2419b = 0;

        public C0806h(int i) {
            this.f2418a = new ByteArrayOutputStream(i);
            this.f2418a.write(0);
            this.f2418a.write(0);
        }

        private void m1769b(int i) {
            this.f2418a.write((i >>> 8) & 255);
            this.f2418a.write(i & 255);
        }

        private void m1770b(int i, int i2) {
            this.f2418a.write(i);
            if (i == 7 || i == 8) {
                m1769b(i2);
            }
        }

        public final void m1771a(int i) {
            this.f2419b++;
            if (i < 64) {
                this.f2418a.write(i);
                return;
            }
            this.f2418a.write(251);
            m1769b(i);
        }

        public final void m1772a(int i, int i2) {
            this.f2419b++;
            this.f2418a.write(251 - i2);
            m1769b(i);
        }

        public final void m1773a(int i, int i2, int i3) {
            this.f2419b++;
            if (i < 64) {
                this.f2418a.write(i + 64);
            } else {
                this.f2418a.write(247);
                m1769b(i);
            }
            m1770b(i2, i3);
        }

        public final void m1774a(int i, int[] iArr, int[] iArr2) {
            this.f2419b++;
            int length = iArr.length;
            this.f2418a.write(length + 251);
            m1769b(i);
            for (int i2 = 0; i2 < length; i2++) {
                m1770b(iArr[i2], iArr2[i2]);
            }
        }

        public final void m1775a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
            this.f2419b++;
            this.f2418a.write(255);
            m1769b(i);
            i = 0;
            int length = iArr.length;
            m1769b(length);
            for (int i2 = 0; i2 < length; i2++) {
                m1770b(iArr[i2], iArr2[i2]);
            }
            int length2 = iArr3.length;
            m1769b(length2);
            while (i < length2) {
                m1770b(iArr3[i], iArr4[i]);
                i++;
            }
        }

        public final byte[] m1776a() {
            byte[] toByteArray = this.f2418a.toByteArray();
            C0817g.m1833a(this.f2419b, toByteArray, 0);
            return toByteArray;
        }
    }

    static class C4939b extends C0805g {
        int f13757a;
        int f13758b;

        public C4939b(aw awVar, int i, int i2) {
            super(awVar);
            this.f13757a = i;
            this.f13758b = i2;
        }

        public final void mo841a(int i, int i2, int i3) {
            if (i == 8 && this.f13757a <= i2) {
                C0817g.m1833a(i2 + this.f13758b, this.f, i3);
            }
        }
    }

    static class C4940d extends C0805g {
        int f13759a;
        int f13760b;
        int f13761c = 0;
        byte[] f13762d = null;
        boolean f13763e;
        private aw f13764h;

        public C4940d(aw awVar, int i, int i2, boolean z) {
            super(awVar);
            this.f13764h = awVar;
            this.f13759a = i;
            this.f13760b = i2;
            this.f13763e = z;
        }

        static byte[] m9596a(byte[] bArr, int i) {
            int length = bArr.length;
            byte[] bArr2 = new byte[(length + 2)];
            int i2 = 0;
            while (i2 < length) {
                bArr2[(i2 < i ? 0 : 2) + i2] = bArr[i2];
                i2++;
            }
            return bArr2;
        }

        public final void m9597a() {
            m1767b();
            if (this.f13762d != null) {
                this.f13764h.mo875a(this.f13762d);
            }
        }

        public final void mo842a(int i, int i2, int i3, int i4) {
            mo2662b(i, i2, 64, 247);
        }

        public final void mo843a(int i, int i2, int[] iArr, int[] iArr2) {
            mo846b(i, i2);
        }

        public final void mo844a(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
            mo846b(i, i2);
        }

        public final void a_(int i, int i2) {
            mo2662b(i, i2, 0, 251);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void mo846b(int r6, int r7) {
            /*
            r5 = this;
            r0 = r5.f13761c;
            r1 = r0 + r7;
            r2 = 0;
            r3 = 1;
            if (r0 != 0) goto L_0x000a;
        L_0x0008:
            r4 = r2;
            goto L_0x000b;
        L_0x000a:
            r4 = r3;
        L_0x000b:
            r1 = r1 + r4;
            r5.f13761c = r1;
            r1 = r5.f13763e;
            if (r1 == 0) goto L_0x001e;
        L_0x0012:
            r1 = r5.f13759a;
            if (r0 >= r1) goto L_0x0029;
        L_0x0016:
            r0 = r5.f13759a;
            r1 = r5.f13761c;
            if (r0 > r1) goto L_0x0029;
        L_0x001c:
            r2 = r3;
            goto L_0x0029;
        L_0x001e:
            r1 = r5.f13759a;
            if (r0 > r1) goto L_0x0029;
        L_0x0022:
            r0 = r5.f13759a;
            r1 = r5.f13761c;
            if (r0 >= r1) goto L_0x0029;
        L_0x0028:
            goto L_0x001c;
        L_0x0029:
            if (r2 == 0) goto L_0x003b;
        L_0x002b:
            r0 = r5.f13760b;
            r7 = r7 + r0;
            r0 = r5.f;
            r6 = r6 + r3;
            p050b.p051a.C0817g.m1833a(r7, r0, r6);
            r6 = r5.f13761c;
            r7 = r5.f13760b;
            r6 = r6 + r7;
            r5.f13761c = r6;
        L_0x003b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.aw.d.b(int, int):void");
        }

        public final void mo847b(int i, int i2, int i3) {
            mo846b(i, i2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void mo2662b(int r6, int r7, int r8, int r9) {
            /*
            r5 = this;
            r0 = r5.f13761c;
            r1 = r0 + r7;
            r2 = 0;
            r3 = 1;
            if (r0 != 0) goto L_0x000a;
        L_0x0008:
            r4 = r2;
            goto L_0x000b;
        L_0x000a:
            r4 = r3;
        L_0x000b:
            r1 = r1 + r4;
            r5.f13761c = r1;
            r1 = r5.f13763e;
            if (r1 == 0) goto L_0x001e;
        L_0x0012:
            r1 = r5.f13759a;
            if (r0 >= r1) goto L_0x0029;
        L_0x0016:
            r0 = r5.f13759a;
            r1 = r5.f13761c;
            if (r0 > r1) goto L_0x0029;
        L_0x001c:
            r2 = r3;
            goto L_0x0029;
        L_0x001e:
            r1 = r5.f13759a;
            if (r0 > r1) goto L_0x0029;
        L_0x0022:
            r0 = r5.f13759a;
            r1 = r5.f13761c;
            if (r0 >= r1) goto L_0x0029;
        L_0x0028:
            goto L_0x001c;
        L_0x0029:
            if (r2 == 0) goto L_0x0058;
        L_0x002b:
            r0 = r5.f13760b;
            r0 = r0 + r7;
            r1 = r5.f13761c;
            r2 = r5.f13760b;
            r1 = r1 + r2;
            r5.f13761c = r1;
            r1 = 64;
            if (r0 >= r1) goto L_0x0040;
        L_0x0039:
            r7 = r5.f;
            r0 = r0 + r8;
            r8 = (byte) r0;
            r7[r6] = r8;
            return;
        L_0x0040:
            if (r7 >= r1) goto L_0x0052;
        L_0x0042:
            r7 = r5.f;
            r7 = p050b.p051a.aw.C4940d.m9596a(r7, r6);
            r8 = (byte) r9;
            r7[r6] = r8;
            r6 = r6 + r3;
            p050b.p051a.C0817g.m1833a(r0, r7, r6);
            r5.f13762d = r7;
            return;
        L_0x0052:
            r7 = r5.f;
            r6 = r6 + r3;
            p050b.p051a.C0817g.m1833a(r0, r7, r6);
        L_0x0058:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.aw.d.b(int, int, int, int):void");
        }
    }

    static class C4941e extends C0805g {
        C0806h f13765a;

        public C4941e(byte[] bArr) {
            super(bArr);
            this.f13765a = new C0806h(bArr.length);
        }

        protected int mo2660a(int i, int i2) {
            return i2;
        }

        public final void mo842a(int i, int i2, int i3, int i4) {
            this.f13765a.m1773a(i2, i3, mo2660a(i3, i4));
        }

        public final void mo843a(int i, int i2, int[] iArr, int[] iArr2) {
            this.f13765a.m1774a(i2, iArr, mo2661a(iArr, iArr2));
        }

        public final void mo844a(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
            this.f13765a.m1775a(i2, iArr, mo2661a(iArr, iArr2), iArr3, mo2661a(iArr3, iArr4));
        }

        protected int[] mo2661a(int[] iArr, int[] iArr2) {
            return iArr2;
        }

        public final void a_(int i, int i2) {
            this.f13765a.m1771a(i2);
        }

        public final void mo847b(int i, int i2, int i3) {
            this.f13765a.m1772a(i2, i3);
        }
    }

    static class C6406a extends C4941e {
        private C0827p f17554b;
        private C0827p f17555c;
        private Map f17556d;

        public C6406a(C0827p c0827p, byte[] bArr, C0827p c0827p2, Map map) {
            super(bArr);
            this.f17554b = c0827p;
            this.f17555c = c0827p2;
            this.f17556d = map;
        }

        protected final int mo2660a(int i, int i2) {
            return i == 7 ? this.f17554b.m1868a(i2, this.f17555c, this.f17556d) : i2;
        }

        protected final int[] mo2661a(int[] iArr, int[] iArr2) {
            int[] iArr3 = new int[iArr2.length];
            for (int i = 0; i < iArr2.length; i++) {
                if (iArr[i] == 7) {
                    iArr3[i] = this.f17554b.m1868a(iArr2[i], this.f17555c, this.f17556d);
                } else {
                    iArr3[i] = iArr2[i];
                }
            }
            return iArr3;
        }
    }

    static class C6407f extends C4940d {
        C6407f(aw awVar, int i, int i2) {
            super(awVar, i, i2, false);
        }

        final void mo846b(int i, int i2) {
            int i3 = this.c;
            this.c = (i3 + i2) + (i3 == 0 ? 0 : 1);
            if (this.a == this.c) {
                i2 -= this.b;
            } else if (this.a == i3) {
                i2 += this.b;
            } else {
                return;
            }
            C0817g.m1833a(i2, this.f, i + 1);
        }

        final void mo2662b(int i, int i2, int i3, int i4) {
            int i5 = this.c;
            this.c = (i5 + i2) + (i5 == 0 ? 0 : 1);
            if (this.a == this.c) {
                i5 = i2 - this.b;
            } else {
                if (this.a == i5) {
                    i5 = this.b + i2;
                }
            }
            byte[] a;
            if (i2 < 64) {
                if (i5 < 64) {
                    this.f[i] = (byte) (i5 + i3);
                    return;
                }
                a = C4940d.m9596a(this.f, i);
                a[i] = (byte) i4;
                C0817g.m1833a(i5, a, i + 1);
                this.d = a;
            } else if (i5 < 64) {
                a = this.f;
                i4 = i + 2;
                int length = a.length;
                byte[] bArr = new byte[(length - 2)];
                int i6 = 0;
                while (i6 < length) {
                    bArr[i6 - (i6 < i4 ? 0 : 2)] = a[i6];
                    i6++;
                }
                bArr[i] = (byte) (i5 + i3);
                this.d = bArr;
            } else {
                C0817g.m1833a(i5, this.f, i + 1);
            }
        }
    }

    aw(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    public aw(C0827p c0827p, byte[] bArr) {
        super(c0827p, "StackMapTable", bArr);
    }

    public final p050b.p051a.C0814d mo834a(p050b.p051a.C0827p r5, java.util.Map r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
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
        r4 = this;
        r0 = new b.a.aw;	 Catch:{ e -> 0x0018 }
        r1 = new b.a.aw$a;	 Catch:{ e -> 0x0018 }
        r2 = r4.a;	 Catch:{ e -> 0x0018 }
        r3 = r4.c;	 Catch:{ e -> 0x0018 }
        r1.<init>(r2, r3, r5, r6);	 Catch:{ e -> 0x0018 }
        r1.m1767b();	 Catch:{ e -> 0x0018 }
        r6 = r1.f13765a;	 Catch:{ e -> 0x0018 }
        r6 = r6.m1776a();	 Catch:{ e -> 0x0018 }
        r0.<init>(r5, r6);	 Catch:{ e -> 0x0018 }
        return r0;
    L_0x0018:
        r5 = new b.a.aw$c;
        r6 = "bad bytecode. fatal?";
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.aw.a(b.a.p, java.util.Map):b.a.d");
    }

    final void m9611a(int i, int i2, boolean z) {
        new C4939b(this, i, i2).m1767b();
        new C4940d(this, i, i2, z).m9597a();
    }

    final void mo848a(DataOutputStream dataOutputStream) {
        super.mo848a(dataOutputStream);
    }
}
