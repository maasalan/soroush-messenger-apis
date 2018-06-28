package p050b.p051a;

import java.util.ArrayList;
import org.msgpack.core.MessagePack.Code;
import p050b.p051a.C4956l.C0820a;
import p050b.p051a.av.C4938c;
import p050b.p051a.aw.C6407f;

public final class C4961m implements ar {
    private static final int[] f13811f = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 0, 0, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 5, 5, 3, 2, 3, 1, 1, 3, 3, 1, 1, 0, 4, 3, 3, 5, 5};
    protected C4956l f13812a;
    protected byte[] f13813b;
    protected int f13814c;
    protected int f13815d;
    protected int f13816e;

    static class C0822a extends Exception {
        C0822a() {
        }
    }

    static abstract class C0823b {
        int f2465a;
        int f2466b;

        C0823b(int i) {
            this.f2466b = i;
            this.f2465a = i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m1852a(int r1, int r2, int r3, int r4, boolean r5) {
            /*
            r0 = r1 + r2;
            if (r1 >= r3) goto L_0x000c;
        L_0x0004:
            if (r3 < r0) goto L_0x000a;
        L_0x0006:
            if (r5 == 0) goto L_0x001e;
        L_0x0008:
            if (r3 != r0) goto L_0x001e;
        L_0x000a:
            r2 = r2 + r4;
            return r2;
        L_0x000c:
            if (r1 != r3) goto L_0x0017;
        L_0x000e:
            if (r0 >= r3) goto L_0x0012;
        L_0x0010:
            if (r5 != 0) goto L_0x001d;
        L_0x0012:
            if (r3 >= r0) goto L_0x001e;
        L_0x0014:
            if (r5 != 0) goto L_0x001e;
        L_0x0016:
            goto L_0x000a;
        L_0x0017:
            if (r0 < r3) goto L_0x001d;
        L_0x0019:
            if (r5 != 0) goto L_0x001e;
        L_0x001b:
            if (r3 != r0) goto L_0x001e;
        L_0x001d:
            r2 = r2 - r4;
        L_0x001e:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.m.b.a(int, int, int, int, boolean):int");
        }

        abstract int mo878a(int i, byte[] bArr, int i2, byte[] bArr2);

        void mo879a(int i, int i2, boolean z) {
            if (i < this.f2465a || (i == this.f2465a && z)) {
                this.f2465a += i2;
            }
        }

        boolean mo880a() {
            return false;
        }

        int mo882b() {
            return 0;
        }

        int mo881c() {
            return 0;
        }
    }

    public static class C0824d {
        public int f2467a;
        public int f2468b;
    }

    static class C0825j {
        int f2469a;
        int f2470b;
        int f2471c;
        C0829w f2472d;
        ag f2473e;
        ah f2474f;
        ah f2475g;
        aw f2476h;
        av f2477i;

        C0825j(int i, int i2, int i3, C0829w c0829w, C4956l c4956l) {
            this.f2469a = i;
            this.f2471c = i2;
            this.f2470b = i3;
            this.f2472d = c0829w;
            this.f2473e = (ag) c4956l.m9754a("LineNumberTable");
            this.f2474f = (ah) c4956l.m9754a("LocalVariableTable");
            this.f2475g = (ah) c4956l.m9754a("LocalVariableTypeTable");
            this.f2476h = (aw) c4956l.m9754a("StackMapTable");
            this.f2477i = (av) c4956l.m9754a("StackMap");
        }

        final void m1858a(int i, int i2, boolean z) {
            if (i < this.f2469a || (i == this.f2469a && z)) {
                this.f2469a += i2;
            }
            if (i < this.f2471c || (i == this.f2471c && z)) {
                this.f2471c += i2;
            }
            if (i < this.f2470b || (i == this.f2470b && z)) {
                this.f2470b += i2;
            }
            this.f2472d.m1910a(i, i2, z);
            if (this.f2473e != null) {
                this.f2473e.m9551a(i, i2, z);
            }
            if (this.f2474f != null) {
                this.f2474f.m9554a(i, i2, z);
            }
            if (this.f2475g != null) {
                this.f2475g.m9554a(i, i2, z);
            }
            if (this.f2476h != null) {
                this.f2476h.m9611a(i, i2, z);
            }
            if (this.f2477i != null) {
                this.f2477i.m9594a(i, i2, z);
            }
        }
    }

    static abstract class C4957c extends C0823b {
        int f13802c;
        int f13803d = 0;

        C4957c(int i, int i2) {
            super(i);
            this.f13802c = i2;
        }

        final int mo878a(int i, byte[] bArr, int i2, byte[] bArr2) {
            if (this.f13803d == 2) {
                mo2669b(i, bArr, i2, bArr2);
            } else {
                bArr2[i2] = bArr[i];
                C0817g.m1833a(this.f13802c, bArr2, i2 + 1);
            }
            return 3;
        }

        final void mo879a(int i, int i2, boolean z) {
            this.f13802c = C0823b.m1852a(this.a, this.f13802c, i, i2, z);
            super.mo879a(i, i2, z);
            if (this.f13803d != 0) {
                return;
            }
            if (this.f13802c < -32768 || 32767 < this.f13802c) {
                this.f13803d = 1;
            }
        }

        final boolean mo880a() {
            if (this.f13803d != 1) {
                return false;
            }
            this.f13803d = 2;
            return true;
        }

        abstract void mo2669b(int i, byte[] bArr, int i2, byte[] bArr2);

        abstract int mo881c();
    }

    static class C4958g extends C0823b {
        int f13804c;

        C4958g(int i, int i2) {
            super(i);
            this.f13804c = i2;
        }

        final int mo878a(int i, byte[] bArr, int i2, byte[] bArr2) {
            bArr2[i2] = bArr[i];
            C0817g.m1835b(this.f13804c, bArr2, i2 + 1);
            return 5;
        }

        final void mo879a(int i, int i2, boolean z) {
            this.f13804c = C0823b.m1852a(this.a, this.f13804c, i, i2, z);
            super.mo879a(i, i2, z);
        }
    }

    static class C4959h extends C0823b {
        int f13805c;
        boolean f13806d = true;

        C4959h(int i, int i2) {
            super(i);
            this.f13805c = i2;
        }

        final int mo878a(int i, byte[] bArr, int i2, byte[] bArr2) {
            bArr2[i2] = (byte) 19;
            C0817g.m1833a(this.f13805c, bArr2, i2 + 1);
            return 2;
        }

        final boolean mo880a() {
            if (!this.f13806d) {
                return false;
            }
            this.f13806d = false;
            return true;
        }

        final int mo881c() {
            return 1;
        }
    }

    static abstract class C4960k extends C0823b {
        int f13807d;
        int f13808e;
        int[] f13809f;
        C0825j f13810g;

        C4960k(int i, int i2, int[] iArr, C0825j c0825j) {
            super(i);
            this.f13807d = 3 - (i & 3);
            this.f13808e = i2;
            this.f13809f = iArr;
            this.f13810g = c0825j;
        }

        abstract int mo2670a(int i, byte[] bArr);

        final int mo878a(int i, byte[] bArr, int i2, byte[] bArr2) {
            int i3 = 3 - (this.a & 3);
            int i4 = this.f13807d - i3;
            int d = ((3 - (this.b & 3)) + 5) + mo2671d();
            if (i4 > 0) {
                C0825j c0825j = this.f13810g;
                int i5 = this.a + d;
                if (c0825j.f2476h != null) {
                    new C6407f(c0825j.f2476h, i5, i4).m9597a();
                }
                if (c0825j.f2477i != null) {
                    new C4938c(c0825j.f2477i, i5, i4).mo837a();
                }
                if (this.f13808e == d) {
                    this.f13808e -= i4;
                }
                for (int i6 = 0; i6 < this.f13809f.length; i6++) {
                    if (this.f13809f[i6] == d) {
                        int[] iArr = this.f13809f;
                        iArr[i6] = iArr[i6] - i4;
                    }
                }
            }
            d = i2 + 1;
            bArr2[i2] = bArr[i];
            while (true) {
                i = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                int i7 = d + 1;
                bArr2[d] = (byte) 0;
                i3 = i;
                d = i7;
            }
            C0817g.m1835b(this.f13808e, bArr2, d);
            i = mo2670a(d + 4, bArr2);
            d += i + 4;
            while (true) {
                i7 = i4 - 1;
                if (i4 <= 0) {
                    return (5 + (3 - (this.b & 3))) + i;
                }
                i2 = d + 1;
                bArr2[d] = (byte) 0;
                i4 = i7;
                d = i2;
            }
        }

        final void mo879a(int i, int i2, boolean z) {
            int i3 = this.a;
            this.f13808e = C0823b.m1852a(i3, this.f13808e, i, i2, z);
            int length = this.f13809f.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.f13809f[i4] = C0823b.m1852a(i3, this.f13809f[i4], i, i2, z);
            }
            super.mo879a(i, i2, z);
        }

        final int mo882b() {
            int i = 3 - (this.a & 3);
            if (i <= this.f13807d) {
                return 0;
            }
            int i2 = i - this.f13807d;
            this.f13807d = i;
            return i2;
        }

        final int mo881c() {
            return this.f13807d - (3 - (this.b & 3));
        }

        abstract int mo2671d();
    }

    static class C6415e extends C4957c {
        C6415e(int i, int i2) {
            super(i, i2);
        }

        final void mo2669b(int i, byte[] bArr, int i2, byte[] bArr2) {
            i = bArr[i] & 255;
            int i3 = 199;
            if (i != 198) {
                i3 = i == 199 ? 198 : ((i + -153) & 1) == 0 ? i + 1 : i - 1;
            }
            bArr2[i2] = (byte) i3;
            bArr2[i2 + 1] = (byte) 0;
            bArr2[i2 + 2] = (byte) 8;
            bArr2[i2 + 3] = Code.EXT16;
            C0817g.m1835b(this.c - 3, bArr2, i2 + 4);
        }

        final int mo881c() {
            return this.d == 2 ? 5 : 0;
        }
    }

    static class C6416f extends C4957c {
        C6416f(int i, int i2) {
            super(i, i2);
        }

        final void mo2669b(int i, byte[] bArr, int i2, byte[] bArr2) {
            bArr2[i2] = (byte) ((bArr[i] & 255) == 167 ? 200 : 201);
            C0817g.m1835b(this.c, bArr2, i2 + 1);
        }

        final int mo881c() {
            return this.d == 2 ? 2 : 0;
        }
    }

    static class C6417i extends C4960k {
        int[] f17570c;

        C6417i(int i, int i2, int[] iArr, int[] iArr2, C0825j c0825j) {
            super(i, i2, iArr2, c0825j);
            this.f17570c = iArr;
        }

        final int mo2670a(int i, byte[] bArr) {
            int length = this.f17570c.length;
            C0817g.m1835b(length, bArr, i);
            i += 4;
            for (int i2 = 0; i2 < length; i2++) {
                C0817g.m1835b(this.f17570c[i2], bArr, i);
                C0817g.m1835b(this.f[i2], bArr, i + 4);
                i += 8;
            }
            return 4 + (8 * length);
        }

        final int mo2671d() {
            return 4 + (8 * this.f17570c.length);
        }
    }

    static class C6418l extends C4960k {
        int f17571c;
        int f17572h;

        C6418l(int i, int i2, int i3, int i4, int[] iArr, C0825j c0825j) {
            super(i, i2, iArr, c0825j);
            this.f17571c = i3;
            this.f17572h = i4;
        }

        final int mo2670a(int i, byte[] bArr) {
            C0817g.m1835b(this.f17571c, bArr, i);
            C0817g.m1835b(this.f17572h, bArr, i + 4);
            i += 8;
            for (int b : this.f) {
                C0817g.m1835b(b, bArr, i);
                i += 4;
            }
            return 8 + (4 * r0);
        }

        final int mo2671d() {
            return 8 + (4 * this.f.length);
        }
    }

    protected C4961m(C4956l c4956l) {
        this.f13812a = c4956l;
        this.f13813b = c4956l.c;
        m9787a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9777a(int r1, int r2, int r3, int r4) {
        /*
        r0 = r1 + r2;
        if (r1 >= r3) goto L_0x000a;
    L_0x0004:
        if (r3 < r0) goto L_0x0008;
    L_0x0006:
        if (r3 != r0) goto L_0x0012;
    L_0x0008:
        r2 = r2 + r4;
        return r2;
    L_0x000a:
        if (r1 != r3) goto L_0x000f;
    L_0x000c:
        if (r0 >= r3) goto L_0x0012;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        if (r0 >= r3) goto L_0x0012;
    L_0x0011:
        r2 = r2 - r4;
    L_0x0012:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.m.a(int, int, int, int):int");
    }

    static int m9778a(byte[] r3, int r4) {
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
        r0 = r3[r4];	 Catch:{ IndexOutOfBoundsException -> 0x004d }
        r0 = r0 & 255;
        r1 = f13811f;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r1 = r1[r0];	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        if (r1 <= 0) goto L_0x000c;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x000a:
        r4 = r4 + r1;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        return r4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x000c:
        r1 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        if (r0 != r1) goto L_0x001e;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x0010:
        r1 = r4 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r3 = r3[r1];	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r0 = -124; // 0xffffffffffffff84 float:NaN double:NaN;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        if (r3 != r0) goto L_0x001b;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x0018:
        r4 = r4 + 6;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        return r4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x001b:
        r4 = r4 + 4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        return r4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x001e:
        r4 = r4 & -4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r4 = r4 + 8;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r1 = 171; // 0xab float:2.4E-43 double:8.45E-322;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        if (r0 != r1) goto L_0x0030;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x0026:
        r3 = p050b.p051a.C0817g.m1834b(r3, r4);	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r3 = r3 * 8;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r4 = r4 + r3;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r4 = r4 + 4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        return r4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x0030:
        r1 = 170; // 0xaa float:2.38E-43 double:8.4E-322;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        if (r0 != r1) goto L_0x0047;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
    L_0x0034:
        r1 = p050b.p051a.C0817g.m1834b(r3, r4);	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r2 = r4 + 4;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r3 = p050b.p051a.C0817g.m1834b(r3, r2);	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        r3 = r3 - r1;
        r3 = r3 + 1;
        r3 = r3 * 4;
        r4 = r4 + r3;
        r4 = r4 + 8;
        return r4;
    L_0x0047:
        r3 = new b.a.e;
        r3.<init>(r0);
        throw r3;
    L_0x004d:
        r3 = new b.a.e;
        r4 = "invalid opcode address";
        r3.<init>(r4);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.m.a(byte[], int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9779a(byte[] r1, int r2, byte[] r3, int r4, int r5) {
        /*
        r5 = r5 - r4;
        switch(r5) {
            case 1: goto L_0x0023;
            case 2: goto L_0x0019;
            case 3: goto L_0x000f;
            case 4: goto L_0x0005;
            default: goto L_0x0004;
        };
    L_0x0004:
        return r2;
    L_0x0005:
        r5 = r2 + 1;
        r0 = r4 + 1;
        r4 = r3[r4];
        r1[r2] = r4;
        r2 = r5;
        r4 = r0;
    L_0x000f:
        r5 = r2 + 1;
        r0 = r4 + 1;
        r4 = r3[r4];
        r1[r2] = r4;
        r2 = r5;
        r4 = r0;
    L_0x0019:
        r5 = r2 + 1;
        r0 = r4 + 1;
        r4 = r3[r4];
        r1[r2] = r4;
        r2 = r5;
        r4 = r0;
    L_0x0023:
        r5 = r2 + 1;
        r3 = r3[r4];
        r1[r2] = r3;
        r2 = r5;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.m.a(byte[], int, byte[], int, int):int");
    }

    private static ArrayList m9780a(byte[] bArr, int i, C0825j c0825j) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < i) {
            int b;
            Object c6415e;
            int a = C4961m.m9778a(bArr, i2);
            int i3 = bArr[i2] & 255;
            if ((153 > i3 || i3 > 168) && i3 != 198) {
                if (i3 != 199) {
                    if (i3 != 200) {
                        if (i3 != 201) {
                            int b2;
                            if (i3 == 170) {
                                i3 = (i2 & -4) + 4;
                                b = C0817g.m1834b(bArr, i3);
                                b2 = C0817g.m1834b(bArr, i3 + 4);
                                int b3 = C0817g.m1834b(bArr, i3 + 8);
                                int i4 = (b3 - b2) + 1;
                                int[] iArr = new int[i4];
                                int i5 = i3 + 12;
                                for (i3 = 0; i3 < i4; i3++) {
                                    iArr[i3] = C0817g.m1834b(bArr, i5);
                                    i5 += 4;
                                }
                                arrayList.add(new C6418l(i2, b, b2, b3, iArr, c0825j));
                            } else if (i3 == 171) {
                                i3 = (i2 & -4) + 4;
                                b = C0817g.m1834b(bArr, i3);
                                b2 = C0817g.m1834b(bArr, i3 + 4);
                                int[] iArr2 = new int[b2];
                                int[] iArr3 = new int[b2];
                                int i6 = i3 + 8;
                                for (i3 = 0; i3 < b2; i3++) {
                                    iArr2[i3] = C0817g.m1834b(bArr, i6);
                                    iArr3[i3] = C0817g.m1834b(bArr, i6 + 4);
                                    i6 += 8;
                                }
                                arrayList.add(new C6417i(i2, b, iArr2, iArr3, c0825j));
                            }
                            i2 = a;
                        }
                    }
                    arrayList.add(new C4958g(i2, C0817g.m1834b(bArr, i2 + 1)));
                    i2 = a;
                }
            }
            b = (bArr[i2 + 1] << 8) | (bArr[i2 + 2] & 255);
            if (i3 != 167) {
                if (i3 != 168) {
                    c6415e = new C6415e(i2, b);
                    arrayList.add(c6415e);
                    i2 = a;
                }
            }
            c6415e = new C6416f(i2, b);
            arrayList.add(c6415e);
            i2 = a;
        }
        return arrayList;
    }

    private static byte[] m9781a(byte[] r1, int r2, int r3, p050b.p051a.C0829w r4, p050b.p051a.C4956l r5) {
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
        if (r3 > 0) goto L_0x0003;
    L_0x0002:
        return r1;
    L_0x0003:
        r0 = p050b.p051a.C4961m.m9784b(r1, r2, r3, r4, r5);	 Catch:{ a -> 0x0008 }
        return r0;
    L_0x0008:
        r3 = r3 + 3;
        r3 = r3 & -4;
        r1 = p050b.p051a.C4961m.m9784b(r1, r2, r3, r4, r5);	 Catch:{ a -> 0x0011 }
        return r1;
    L_0x0011:
        r1 = new java.lang.RuntimeException;
        r2 = "fatal error?";
        r1.<init>(r2);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.m.a(byte[], int, int, b.a.w, b.a.l):byte[]");
    }

    private static byte[] m9782a(byte[] r10, int r11, int r12, boolean r13, java.util.ArrayList r14, p050b.p051a.C4961m.C0825j r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = r14.size();
        r1 = 0;
        if (r12 <= 0) goto L_0x0019;
    L_0x0007:
        r15.m1858a(r11, r12, r13);
        r2 = r1;
    L_0x000b:
        if (r2 >= r0) goto L_0x0019;
    L_0x000d:
        r3 = r14.get(r2);
        r3 = (p050b.p051a.C4961m.C0823b) r3;
        r3.mo879a(r11, r12, r13);
        r2 = r2 + 1;
        goto L_0x000b;
    L_0x0019:
        r13 = 1;
        r2 = r13;
    L_0x001b:
        if (r2 == 0) goto L_0x004b;
    L_0x001d:
        r2 = r1;
        r3 = r2;
    L_0x001f:
        if (r2 >= r0) goto L_0x0049;
    L_0x0021:
        r4 = r14.get(r2);
        r4 = (p050b.p051a.C4961m.C0823b) r4;
        r5 = r4.mo880a();
        if (r5 == 0) goto L_0x0046;
    L_0x002d:
        r3 = r4.f2465a;
        r4 = r4.mo881c();
        r15.m1858a(r3, r4, r1);
        r5 = r1;
    L_0x0037:
        if (r5 >= r0) goto L_0x0045;
    L_0x0039:
        r6 = r14.get(r5);
        r6 = (p050b.p051a.C4961m.C0823b) r6;
        r6.mo879a(r3, r4, r1);
        r5 = r5 + 1;
        goto L_0x0037;
    L_0x0045:
        r3 = r13;
    L_0x0046:
        r2 = r2 + 1;
        goto L_0x001f;
    L_0x0049:
        r2 = r3;
        goto L_0x001b;
    L_0x004b:
        r3 = r2;
        r2 = r1;
    L_0x004d:
        if (r2 >= r0) goto L_0x0073;
    L_0x004f:
        r4 = r14.get(r2);
        r4 = (p050b.p051a.C4961m.C0823b) r4;
        r5 = r4.mo882b();
        if (r5 <= 0) goto L_0x0070;
    L_0x005b:
        r3 = r4.f2465a;
        r15.m1858a(r3, r5, r1);
        r4 = r1;
    L_0x0061:
        if (r4 >= r0) goto L_0x006f;
    L_0x0063:
        r6 = r14.get(r4);
        r6 = (p050b.p051a.C4961m.C0823b) r6;
        r6.mo879a(r3, r5, r1);
        r4 = r4 + 1;
        goto L_0x0061;
    L_0x006f:
        r3 = r13;
    L_0x0070:
        r2 = r2 + 1;
        goto L_0x004d;
    L_0x0073:
        if (r3 != 0) goto L_0x0049;
    L_0x0075:
        r13 = r14.size();
        r15 = r10.length;
        r15 = r15 + r12;
        r0 = r15;
        r15 = r1;
    L_0x007d:
        if (r15 >= r13) goto L_0x008d;
    L_0x007f:
        r2 = r14.get(r15);
        r2 = (p050b.p051a.C4961m.C0823b) r2;
        r2 = r2.mo881c();
        r0 = r0 + r2;
        r15 = r15 + 1;
        goto L_0x007d;
    L_0x008d:
        r15 = new byte[r0];
        r0 = 0;
        r2 = r10.length;
        if (r13 <= 0) goto L_0x00a1;
    L_0x0093:
        r3 = r14.get(r1);
        r3 = (p050b.p051a.C4961m.C0823b) r3;
        r4 = r3.f2466b;
        r7 = r1;
        r6 = r3;
        r5 = r4;
        r3 = r7;
        r4 = r3;
        goto L_0x00a6;
    L_0x00a1:
        r6 = r0;
        r3 = r1;
        r4 = r3;
        r7 = r4;
    L_0x00a5:
        r5 = r2;
    L_0x00a6:
        if (r3 >= r2) goto L_0x00dc;
    L_0x00a8:
        if (r3 != r11) goto L_0x00b4;
    L_0x00aa:
        r8 = r4 + r12;
    L_0x00ac:
        if (r4 >= r8) goto L_0x00b4;
    L_0x00ae:
        r9 = r4 + 1;
        r15[r4] = r1;
        r4 = r9;
        goto L_0x00ac;
    L_0x00b4:
        if (r3 == r5) goto L_0x00c1;
    L_0x00b6:
        r8 = r4 + 1;
        r9 = r3 + 1;
        r3 = r10[r3];
        r15[r4] = r3;
        r4 = r8;
        r3 = r9;
        goto L_0x00a6;
    L_0x00c1:
        r5 = r6.mo878a(r3, r10, r4, r15);
        r3 = r3 + r5;
        r6 = r6.mo881c();
        r5 = r5 + r6;
        r4 = r4 + r5;
        r7 = r7 + 1;
        if (r7 >= r13) goto L_0x00da;
    L_0x00d0:
        r5 = r14.get(r7);
        r6 = r5;
        r6 = (p050b.p051a.C4961m.C0823b) r6;
        r5 = r6.f2466b;
        goto L_0x00a6;
    L_0x00da:
        r6 = r0;
        goto L_0x00a5;
    L_0x00dc:
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.m.a(byte[], int, int, boolean, java.util.ArrayList, b.a.m$j):byte[]");
    }

    static byte[] m9783a(byte[] bArr, C0829w c0829w, C4956l c4956l, C0820a c0820a) {
        C0825j c0825j = new C0825j(0, 0, 0, c0829w, c4956l);
        ArrayList a = C4961m.m9780a(bArr, bArr.length, c0825j);
        while (c0820a != null) {
            int i = c0820a.f2463b;
            C4959h c4959h = new C4959h(i, c0820a.f2464c);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i < ((C0823b) a.get(i2)).f2466b) {
                    a.add(i2, c4959h);
                    break;
                }
            }
            a.add(c4959h);
            c0820a = c0820a.f2462a;
        }
        return C4961m.m9782a(bArr, 0, 0, false, a, c0825j);
    }

    private static byte[] m9784b(byte[] bArr, int i, int i2, C0829w c0829w, C4956l c4956l) {
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + i2)];
        int i3 = 0;
        int i4 = i3;
        while (i3 < length) {
            int i5;
            int i6;
            int i7;
            if (i3 == i) {
                i5 = i4 + i2;
                while (i4 < i5) {
                    i6 = i4 + 1;
                    bArr2[i4] = (byte) 0;
                    i4 = i6;
                }
            }
            i5 = C4961m.m9778a(bArr, i3);
            i6 = bArr[i3] & 255;
            if ((153 > i6 || i6 > 168) && i6 != 198) {
                if (i6 != 199) {
                    if (i6 != 200) {
                        if (i6 != 201) {
                            if (i6 == 170) {
                                if (i3 == i4 || (i2 & 3) == 0) {
                                    i6 = (i3 & -4) + 4;
                                    i4 = C4961m.m9779a(bArr2, i4, bArr, i3, i6);
                                    C0817g.m1835b(C4961m.m9777a(i3, C0817g.m1834b(bArr, i6), i, i2), bArr2, i4);
                                    int b = C0817g.m1834b(bArr, i6 + 4);
                                    C0817g.m1835b(b, bArr2, i4 + 4);
                                    int b2 = C0817g.m1834b(bArr, i6 + 8);
                                    C0817g.m1835b(b2, bArr2, i4 + 8);
                                    i4 += 12;
                                    i6 += 12;
                                    b2 = (((b2 - b) + 1) * 4) + i6;
                                    while (i6 < b2) {
                                        C0817g.m1835b(C4961m.m9777a(i3, C0817g.m1834b(bArr, i6), i, i2), bArr2, i4);
                                        i4 += 4;
                                        i6 += 4;
                                    }
                                } else {
                                    throw new C0822a();
                                }
                            } else if (i6 != 171) {
                                while (i3 < i5) {
                                    i7 = i4 + 1;
                                    i6 = i3 + 1;
                                    bArr2[i4] = bArr[i3];
                                    i4 = i7;
                                    i3 = i6;
                                }
                            } else if (i3 == i4 || (i2 & 3) == 0) {
                                i7 = (i3 & -4) + 4;
                                i4 = C4961m.m9779a(bArr2, i4, bArr, i3, i7);
                                C0817g.m1835b(C4961m.m9777a(i3, C0817g.m1834b(bArr, i7), i, i2), bArr2, i4);
                                i6 = C0817g.m1834b(bArr, i7 + 4);
                                C0817g.m1835b(i6, bArr2, i4 + 4);
                                i4 += 8;
                                i7 += 8;
                                i6 = (i6 * 8) + i7;
                                while (i7 < i6) {
                                    bArr2[i4] = bArr[i7];
                                    bArr2[i4 + 1] = bArr[i7 + 1];
                                    bArr2[i4 + 2] = bArr[i7 + 2];
                                    bArr2[i4 + 3] = bArr[i7 + 3];
                                    C0817g.m1835b(C4961m.m9777a(i3, C0817g.m1834b(bArr, i7 + 4), i, i2), bArr2, i4 + 4);
                                    i4 += 8;
                                    i7 += 8;
                                }
                            } else {
                                throw new C0822a();
                            }
                            i3 = i5;
                        }
                    }
                    i7 = C4961m.m9777a(i3, C0817g.m1834b(bArr, i3 + 1), i, i2);
                    i6 = i4 + 1;
                    bArr2[i4] = bArr[i3];
                    C0817g.m1835b(i7, bArr2, i6);
                    i4 = i6 + 4;
                    i3 = i5;
                }
            }
            i7 = C4961m.m9777a(i3, (bArr[i3 + 1] << 8) | (bArr[i3 + 2] & 255), i, i2);
            bArr2[i4] = bArr[i3];
            C0817g.m1833a(i7, bArr2, i4 + 1);
            i4 += 3;
            i3 = i5;
        }
        c0829w.m1910a(i, i2, true);
        ag agVar = (ag) c4956l.m9754a("LineNumberTable");
        if (agVar != null) {
            agVar.m9551a(i, i2, true);
        }
        ah ahVar = (ah) c4956l.m9754a("LocalVariableTable");
        if (ahVar != null) {
            ahVar.m9554a(i, i2, true);
        }
        ahVar = (ah) c4956l.m9754a("LocalVariableTypeTable");
        if (ahVar != null) {
            ahVar.m9554a(i, i2, true);
        }
        aw awVar = (aw) c4956l.m9754a("StackMapTable");
        if (awVar != null) {
            awVar.m9611a(i, i2, true);
        }
        av avVar = (av) c4956l.m9754a("StackMap");
        if (avVar != null) {
            avVar.m9594a(i, i2, true);
        }
        return bArr2;
    }

    public final int m9785a(int i) {
        return this.f13813b[i] & 255;
    }

    public final int m9786a(byte[] bArr) {
        int i = this.f13815d;
        int length = bArr.length;
        if (length > 0) {
            int i2;
            C0824d c0824d = new C0824d();
            int i3 = 0;
            if (length <= 0) {
                c0824d.f2467a = i;
                c0824d.f2468b = 0;
            } else {
                byte[] bArr2;
                if (this.f13813b.length + length > 32767) {
                    bArr2 = this.f13813b;
                    C0829w c0829w = this.f13812a.f13800f;
                    C4956l c4956l = this.f13812a;
                    if (length > 0) {
                        C0825j c0825j = new C0825j(this.f13815d, this.f13816e, i, c0829w, c4956l);
                        bArr2 = C4961m.m9782a(bArr2, i, length, true, C4961m.m9780a(bArr2, bArr2.length, c0825j), c0825j);
                        this.f13815d = c0825j.f2469a;
                        this.f13816e = c0825j.f2471c;
                        c0824d.f2467a = c0825j.f2470b - length;
                        c0824d.f2468b = length;
                    }
                } else {
                    i2 = this.f13815d;
                    bArr2 = C4961m.m9781a(this.f13813b, i, length, this.f13812a.f13800f, this.f13812a);
                    int length2 = bArr2.length - this.f13813b.length;
                    c0824d.f2467a = i;
                    c0824d.f2468b = length2;
                    if (i2 >= i) {
                        this.f13815d = i2 + length2;
                    }
                    if (this.f13816e > i || this.f13816e == i) {
                        this.f13816e += length2;
                    }
                }
                this.f13812a.m9757b(bArr2);
                this.f13813b = bArr2;
                this.f13814c = this.f13813b.length;
            }
            i = c0824d.f2467a;
            i2 = i;
            while (i3 < length) {
                int i4 = i2 + 1;
                this.f13813b[i2] = bArr[i3];
                i3++;
                i2 = i4;
            }
        }
        return i;
    }

    public final void m9787a() {
        this.f13816e = 0;
        this.f13815d = 0;
        this.f13814c = this.f13813b.length;
    }

    public final void m9788a(C0829w c0829w, int i) {
        C0829w c0829w2 = this.f13812a.f13800f;
        int size = c0829w.f2485b.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0830x c0830x = (C0830x) c0829w.f2485b.get(size);
                int i2 = c0830x.f2486a + i;
                int i3 = c0830x.f2487b + i;
                int i4 = c0830x.f2488c + i;
                int i5 = c0830x.f2489d;
                if (i2 < i3) {
                    c0829w2.f2485b.add(0, new C0830x(i2, i3, i4, i5));
                }
            } else {
                return;
            }
        }
    }

    public final int m9789b(int i) {
        byte[] bArr = this.f13813b;
        return (bArr[i + 1] & 255) | (bArr[i] << 8);
    }

    public final void m9790b() {
        this.f13815d = 0;
    }

    public final int m9791c() {
        return this.f13813b.length;
    }

    public final int m9792c(int i) {
        return C0817g.m1834b(this.f13813b, i);
    }

    public final int m9793d(int i) {
        m9787a();
        C0827p b = this.f13812a.m1829b();
        String a = this.f13812a.m1829b().m1876a();
        boolean z = false;
        int i2 = 0;
        while (m9794d()) {
            int e = m9795e();
            int a2 = m9785a(e);
            if (a2 == 187) {
                i2++;
            } else if (a2 == 183) {
                a2 = C0817g.m1832a(this.f13813b, e + 1);
                ap apVar = (ap) b.m1875a(a2);
                String str = null;
                if (apVar != null) {
                    aq aqVar = (aq) b.m1875a(apVar.c);
                    if (aqVar != null) {
                        str = b.m1892j(aqVar.f13745a);
                    }
                }
                if (str.equals("<init>")) {
                    i2--;
                    if (i2 < 0) {
                        if (i < 0) {
                            return e;
                        }
                        boolean equals = b.m1887e(a2).equals(a);
                        if (i > 0) {
                            z = true;
                        }
                        if (equals == z) {
                            return e;
                        }
                        m9787a();
                        return -1;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        m9787a();
        return -1;
    }

    public final boolean m9794d() {
        return this.f13815d < this.f13814c;
    }

    public final int m9795e() {
        int i = this.f13815d;
        this.f13815d = C4961m.m9778a(this.f13813b, i);
        return i;
    }

    public final int m9796f() {
        return m9793d(0);
    }
}
