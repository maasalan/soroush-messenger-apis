package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class C4956l extends C0814d implements ar {
    public int f13798d;
    public int f13799e;
    public C0829w f13800f;
    ArrayList f13801g;

    static class C0820a {
        C0820a f2462a;
        int f2463b;
        int f2464c;

        C0820a() {
        }
    }

    public static class C0821b extends RuntimeException {
        public C0821b(String str) {
            super(str);
        }
    }

    public C4956l(C0827p c0827p, int i, int i2, byte[] bArr, C0829w c0829w) {
        super(c0827p, "Code");
        this.f13798d = i;
        this.f13799e = i2;
        this.c = bArr;
        this.f13800f = c0829w;
        this.f13801g = new ArrayList();
    }

    C4956l(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, null);
        dataInputStream.readInt();
        this.f13798d = dataInputStream.readUnsignedShort();
        this.f13799e = dataInputStream.readUnsignedShort();
        this.c = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(this.c);
        this.f13800f = new C0829w(c0827p, dataInputStream);
        this.f13801g = new ArrayList();
        i = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < i; i2++) {
            this.f13801g.add(C0814d.m1820a(c0827p, dataInputStream));
        }
    }

    private C4956l(C0827p c0827p, C4956l c4956l, Map map) {
        super(c0827p, "Code");
        this.f13798d = c4956l.f13798d;
        this.f13799e = c4956l.f13799e;
        C0829w c0829w = c4956l.f13800f;
        C0829w c0829w2 = new C0829w(c0827p);
        C0827p c0827p2 = c0829w.f2484a;
        int size = c0829w.f2485b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0830x c0830x = (C0830x) c0829w.f2485b.get(i2);
            c0829w2.m1909a(c0830x.f2486a, c0830x.f2487b, c0830x.f2488c, c0827p2.m1868a(c0830x.f2489d, c0827p, map));
        }
        this.f13800f = c0829w2;
        this.f13801g = new ArrayList();
        List list = c4956l.f13801g;
        int size2 = list.size();
        while (i < size2) {
            this.f13801g.add(((C0814d) list.get(i)).mo834a(c0827p, map));
            i++;
        }
        c0829w = this.f13800f;
        size = c4956l.c.length;
        byte[] bArr = new byte[size];
        this.c = bArr;
        C0820a a = C4956l.m9751a(c4956l.c, size, c4956l.m1829b(), bArr, c0827p, map);
        if (a != null) {
            bArr = C4961m.m9783a(bArr, c0829w, this, a);
        }
        this.c = bArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p050b.p051a.C4956l.C0820a m9751a(byte[] r15, int r16, p050b.p051a.C0827p r17, byte[] r18, p050b.p051a.C0827p r19, java.util.Map r20) {
        /*
        r6 = r15;
        r7 = 0;
        r0 = 0;
        r8 = r16;
        r10 = r0;
        r9 = r7;
    L_0x0007:
        if (r9 >= r8) goto L_0x00be;
    L_0x0009:
        r11 = p050b.p051a.C4961m.m9778a(r6, r9);
        r0 = r6[r9];
        r18[r9] = r0;
        r0 = r0 & 255;
        r1 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        if (r0 == r1) goto L_0x0035;
    L_0x0017:
        r1 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        if (r0 == r1) goto L_0x0098;
    L_0x001b:
        switch(r0) {
            case 18: goto L_0x006f;
            case 19: goto L_0x0035;
            case 20: goto L_0x0035;
            default: goto L_0x001e;
        };
    L_0x001e:
        switch(r0) {
            case 178: goto L_0x0035;
            case 179: goto L_0x0035;
            case 180: goto L_0x0035;
            case 181: goto L_0x0035;
            case 182: goto L_0x0035;
            case 183: goto L_0x0035;
            case 184: goto L_0x0035;
            case 185: goto L_0x0054;
            case 186: goto L_0x003d;
            case 187: goto L_0x0035;
            default: goto L_0x0021;
        };
    L_0x0021:
        switch(r0) {
            case 192: goto L_0x0035;
            case 193: goto L_0x0035;
            default: goto L_0x0024;
        };
    L_0x0024:
        r9 = r9 + 1;
        if (r9 >= r11) goto L_0x002d;
    L_0x0028:
        r0 = r6[r9];
        r18[r9] = r0;
        goto L_0x0024;
    L_0x002d:
        r12 = r17;
        r13 = r19;
        r14 = r20;
        goto L_0x00bb;
    L_0x0035:
        r12 = r17;
        r13 = r19;
        r14 = r20;
        goto L_0x00b0;
    L_0x003d:
        r0 = r9 + 1;
        r1 = r6;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        p050b.p051a.C4956l.m9752a(r0, r1, r2, r3, r4, r5);
        r0 = r9 + 3;
        r18[r0] = r7;
        r9 = r9 + 4;
        r18[r9] = r7;
        goto L_0x002d;
    L_0x0054:
        r0 = r9 + 1;
        r1 = r6;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        p050b.p051a.C4956l.m9752a(r0, r1, r2, r3, r4, r5);
        r0 = r9 + 3;
        r1 = r6[r0];
        r18[r0] = r1;
        r9 = r9 + 4;
        r0 = r6[r9];
        r18[r9] = r0;
        goto L_0x002d;
    L_0x006f:
        r0 = r9 + 1;
        r1 = r6[r0];
        r1 = r1 & 255;
        r12 = r17;
        r13 = r19;
        r14 = r20;
        r1 = r12.m1868a(r1, r13, r14);
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r1 >= r2) goto L_0x0087;
    L_0x0083:
        r1 = (byte) r1;
        r18[r0] = r1;
        goto L_0x00bb;
    L_0x0087:
        r18[r9] = r7;
        r18[r0] = r7;
        r0 = new b.a.l$a;
        r0.<init>();
        r0.f2463b = r9;
        r0.f2464c = r1;
        r0.f2462a = r10;
        r10 = r0;
        goto L_0x00bb;
    L_0x0098:
        r12 = r17;
        r13 = r19;
        r14 = r20;
        r0 = r9 + 1;
        r1 = r6;
        r2 = r12;
        r3 = r18;
        r4 = r13;
        r5 = r14;
        p050b.p051a.C4956l.m9752a(r0, r1, r2, r3, r4, r5);
        r9 = r9 + 3;
        r0 = r6[r9];
        r18[r9] = r0;
        goto L_0x00bb;
    L_0x00b0:
        r0 = r9 + 1;
        r1 = r6;
        r2 = r12;
        r3 = r18;
        r4 = r13;
        r5 = r14;
        p050b.p051a.C4956l.m9752a(r0, r1, r2, r3, r4, r5);
    L_0x00bb:
        r9 = r11;
        goto L_0x0007;
    L_0x00be:
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.l.a(byte[], int, b.a.p, byte[], b.a.p, java.util.Map):b.a.l$a");
    }

    private static void m9752a(int i, byte[] bArr, C0827p c0827p, byte[] bArr2, C0827p c0827p2, Map map) {
        int i2 = i + 1;
        int a = c0827p.m1868a((bArr[i2] & 255) | ((bArr[i] & 255) << 8), c0827p2, map);
        bArr2[i] = (byte) (a >> 8);
        bArr2[i2] = (byte) a;
    }

    public final p050b.p051a.C0814d mo834a(p050b.p051a.C0827p r2, java.util.Map r3) {
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
        r1 = this;
        r0 = new b.a.l;	 Catch:{ e -> 0x0006 }
        r0.<init>(r2, r1, r3);	 Catch:{ e -> 0x0006 }
        return r0;
    L_0x0006:
        r2 = new b.a.l$b;
        r3 = "bad bytecode. fatal?";
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.l.a(b.a.p, java.util.Map):b.a.d");
    }

    public final C0814d m9754a(String str) {
        return C0814d.m1821a(this.f13801g, str);
    }

    final void mo848a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeInt(mo876c() - 6);
        dataOutputStream.writeShort(this.f13798d);
        dataOutputStream.writeShort(this.f13799e);
        dataOutputStream.writeInt(this.c.length);
        dataOutputStream.write(this.c);
        C0829w c0829w = this.f13800f;
        int size = c0829w.f2485b.size();
        dataOutputStream.writeShort(size);
        for (int i = 0; i < size; i++) {
            C0830x c0830x = (C0830x) c0829w.f2485b.get(i);
            dataOutputStream.writeShort(c0830x.f2486a);
            dataOutputStream.writeShort(c0830x.f2487b);
            dataOutputStream.writeShort(c0830x.f2488c);
            dataOutputStream.writeShort(c0830x.f2489d);
        }
        dataOutputStream.writeShort(this.f13801g.size());
        C0814d.m1823a(this.f13801g, dataOutputStream);
    }

    public final void mo875a(byte[] bArr) {
        throw new UnsupportedOperationException("CodeAttribute.set()");
    }

    final void m9757b(byte[] bArr) {
        super.mo875a(bArr);
    }

    public final int mo876c() {
        int i = 0;
        int length = (18 + this.c.length) + (this.f13800f.f2485b.size() * 8);
        ArrayList arrayList = this.f13801g;
        int i2 = 0;
        while (i < arrayList.size()) {
            i2 += ((C0814d) arrayList.get(i)).mo876c();
            i++;
        }
        return length + i2;
    }

    public final byte[] mo877d() {
        throw new UnsupportedOperationException("CodeAttribute.get()");
    }

    public final C4961m m9760e() {
        return new C4961m(this);
    }
}
