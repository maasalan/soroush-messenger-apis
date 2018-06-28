package p050b.p051a.p053b;

import java.util.ArrayList;
import p050b.C0848e;
import p050b.p051a.C0815e;
import p050b.p051a.C0817g;
import p050b.p051a.C0827p;
import p050b.p051a.C4956l;
import p050b.p051a.an;
import p050b.p051a.av.C0803e;
import p050b.p051a.p053b.C0810a.C0807a;
import p050b.p051a.p053b.C0811d.C4944a;
import p050b.p051a.p053b.C0811d.C4945d;
import p050b.p051a.p053b.C0811d.C4946e;

public final class C6408b extends C4943c {
    private C6408b(C6408b c6408b) {
        super(c6408b);
    }

    private C6408b(C0848e c0848e, an anVar, C4956l c4956l) {
        C0827p c0827p = anVar.f2404a;
        int i = c4956l.f13798d;
        int i2 = c4956l.f13799e;
        String d = anVar.m1750d();
        int indexOf = d.indexOf(41);
        if (indexOf >= 0) {
            int i3 = indexOf + 1;
            char charAt = d.charAt(i3);
            if (charAt == '[') {
                d = d.substring(i3);
            } else if (charAt == 'L') {
                d = d.substring(indexOf + 2, d.length() - 1).replace('/', '.');
            }
            super(c0848e, c0827p, i, i2, d);
        }
        d = "java.lang.Object";
        super(c0848e, c0827p, i, i2, d);
    }

    private static int m15171a(int i, C0811d[] c0811dArr, C0811d[] c0811dArr2) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            C0811d a = C6408b.m15175a(c0811dArr, i, i3);
            c0811dArr2[i3] = a.mo853b();
            if (a != g) {
                i2 = i3 + 1;
            }
        }
        return i2 + 1;
    }

    public static p050b.p051a.aw m15172a(p050b.C0848e r18, p050b.p051a.an r19) {
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
        r1 = r19;
        r2 = r19.m1752f();
        r3 = 0;
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r3;
    L_0x000a:
        r4 = p050b.p051a.p053b.C4948f.m9662a(r1, r2);	 Catch:{ b -> 0x012a }
        if (r4 != 0) goto L_0x0011;
    L_0x0010:
        return r3;
    L_0x0011:
        r3 = new b.a.b.b;
        r5 = r18;
        r3.<init>(r5, r1, r2);
        r2 = r2.c;	 Catch:{ e -> 0x0122 }
        r3.m15182a(r4, r2);	 Catch:{ e -> 0x0122 }
        r1 = new b.a.aw$h;
        r2 = 32;
        r1.<init>(r2);
        r2 = 0;
        r11 = r4.length;
        r5 = r4[r2];
        r6 = r5.b;
        r7 = r5.c;
        if (r7 <= 0) goto L_0x0033;
    L_0x002e:
        r1.m1771a(r2);
        r6 = r6 + -1;
    L_0x0033:
        r13 = 1;
    L_0x0034:
        if (r13 >= r11) goto L_0x0116;
    L_0x0036:
        r14 = r4[r13];
        r7 = r13 + -1;
        r7 = r4[r7];
        r7 = p050b.p051a.p053b.C6408b.m15183a(r14, r7);
        if (r7 == 0) goto L_0x00f7;
    L_0x0042:
        r14.m9665b();
        r7 = r5.f13778h;
        r8 = r5.f13779i;
        r9 = r14.f13778h;
        r10 = r14.f13779i;
        r15 = r9 - r7;
        if (r15 <= 0) goto L_0x0053;
    L_0x0051:
        r2 = r7;
        goto L_0x0054;
    L_0x0053:
        r2 = r9;
    L_0x0054:
        r12 = 0;
    L_0x0055:
        if (r12 >= r2) goto L_0x006e;
    L_0x0057:
        r16 = r4;
        r4 = r8[r12];
        r17 = r11;
        r11 = r10[r12];
        r4 = r4.mo851a(r11);
        if (r4 != 0) goto L_0x0067;
    L_0x0065:
        r4 = 0;
        goto L_0x0073;
    L_0x0067:
        r12 = r12 + 1;
        r4 = r16;
        r11 = r17;
        goto L_0x0055;
    L_0x006e:
        r16 = r4;
        r17 = r11;
        r4 = 1;
    L_0x0073:
        if (r4 == 0) goto L_0x0082;
    L_0x0075:
        if (r15 <= 0) goto L_0x007c;
    L_0x0077:
        r2 = p050b.p051a.p053b.C6408b.m15185b(r10, r2, r9);
        goto L_0x0084;
    L_0x007c:
        r2 = p050b.p051a.p053b.C6408b.m15185b(r8, r2, r7);
        r2 = -r2;
        goto L_0x0084;
    L_0x0082:
        r2 = -100;
    L_0x0084:
        r4 = r14.f13777g;
        if (r4 != 0) goto L_0x00b1;
    L_0x0088:
        if (r2 != 0) goto L_0x008f;
    L_0x008a:
        r1.m1771a(r6);
    L_0x008d:
        r11 = 0;
        goto L_0x00f3;
    L_0x008f:
        if (r2 >= 0) goto L_0x0099;
    L_0x0091:
        r7 = -3;
        if (r2 < r7) goto L_0x0099;
    L_0x0094:
        r2 = -r2;
        r1.m1772a(r6, r2);
        goto L_0x008d;
    L_0x0099:
        if (r2 <= 0) goto L_0x00da;
    L_0x009b:
        r7 = 3;
        if (r2 > r7) goto L_0x00da;
    L_0x009e:
        r2 = new int[r2];
        r4 = r14.f13778h;
        r7 = r5.f13778h;
        r4 = r4 - r7;
        r5 = r5.f13778h;
        r7 = r14.f13779i;
        r4 = r3.m15184a(r4, r5, r2, r7);
        r1.m1774a(r6, r4, r2);
        goto L_0x008d;
    L_0x00b1:
        r5 = 1;
        if (r4 != r5) goto L_0x00c9;
    L_0x00b4:
        if (r2 != 0) goto L_0x00c9;
    L_0x00b6:
        r2 = r14.f13780j;
        r4 = 0;
        r2 = r2[r4];
    L_0x00bb:
        r4 = r2.mo849a();
        r5 = r3.b;
        r2 = r2.mo850a(r5);
        r1.m1773a(r6, r4, r2);
        goto L_0x008d;
    L_0x00c9:
        r5 = 2;
        if (r4 != r5) goto L_0x00da;
    L_0x00cc:
        if (r2 != 0) goto L_0x00da;
    L_0x00ce:
        r2 = r14.f13780j;
        r5 = 0;
        r2 = r2[r5];
        r5 = r2.mo855d();
        if (r5 == 0) goto L_0x00da;
    L_0x00d9:
        goto L_0x00bb;
    L_0x00da:
        r10 = new int[r4];
        r2 = r14.f13780j;
        r11 = 0;
        r9 = r3.m15184a(r4, r11, r10, r2);
        r2 = r14.f13778h;
        r8 = new int[r2];
        r2 = r14.f13778h;
        r4 = r14.f13779i;
        r7 = r3.m15184a(r2, r11, r8, r4);
        r5 = r1;
        r5.m1775a(r6, r7, r8, r9, r10);
    L_0x00f3:
        r2 = r14.b;
        r4 = 1;
        goto L_0x0106;
    L_0x00f7:
        r16 = r4;
        r17 = r11;
        r4 = 1;
        r11 = r2;
        r2 = r14.c;
        if (r2 != 0) goto L_0x010a;
    L_0x0101:
        r1.m1771a(r6);
        r2 = r14.b;
    L_0x0106:
        r2 = r2 - r4;
        r6 = r2;
        r5 = r14;
        goto L_0x010d;
    L_0x010a:
        r2 = r14.b;
        r6 = r6 + r2;
    L_0x010d:
        r13 = r13 + 1;
        r2 = r11;
        r4 = r16;
        r11 = r17;
        goto L_0x0034;
    L_0x0116:
        r2 = r3.b;
        r3 = new b.a.aw;
        r1 = r1.m1776a();
        r3.<init>(r2, r1);
        return r3;
    L_0x0122:
        r0 = move-exception;
        r2 = r0;
        r3 = new b.a.e;
        r3.<init>(r1, r2);
        throw r3;
    L_0x012a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.b.b.a(b.e, b.a.an):b.a.aw");
    }

    private C4946e m15173a(int i) {
        return new C4946e(i == 0 ? "java.lang.Throwable" : this.b.m1884c(i));
    }

    private static C0811d m15174a(C0811d c0811d, C0811d c0811d2) {
        if (c0811d == c0811d2 || (c0811d2 instanceof C4946e) || (c0811d2 instanceof C4945d)) {
            return c0811d2;
        }
        if (c0811d2 instanceof C4944a) {
            ((C4944a) c0811d2).mo2664b(c0811d);
            return c0811d2;
        }
        throw new RuntimeException("fatal: this should never happen");
    }

    private static C0811d m15175a(C0811d[] c0811dArr, int i, int i2) {
        C0811d c0811d = c0811dArr[i2];
        if (c0811d.mo855d()) {
            i2++;
            if (i2 < i && c0811dArr[i2] != g) {
                return g;
            }
        }
        return c0811d;
    }

    private static void m15176a(C0803e c0803e, C0827p c0827p, C0811d[] c0811dArr, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = i3;
        while (i3 < i) {
            C0811d c0811d = c0811dArr[i3];
            if (c0811d != null && c0811d.mo855d()) {
                i4++;
                i3++;
            }
            i3++;
        }
        c0803e.m1760a(i - i4);
        while (i2 < i) {
            C0811d c0811d2 = c0811dArr[i2];
            i4 = c0811d2.mo849a();
            int a = c0811d2.mo850a(c0827p);
            c0803e.f2415a.write(i4);
            if (i4 == 7 || i4 == 8) {
                c0803e.m1760a(a);
            }
            if (c0811d2.mo855d()) {
                i2++;
            }
            i2++;
        }
    }

    private void m15177a(C4948f c4948f, int i) {
        C0811d[] a = C0811d.m1791a(this.e.length);
        a[0] = m15173a(i).mo853b();
        m15178a(c4948f, 1, a);
    }

    private void m15178a(C4948f c4948f, int i, C0811d[] c0811dArr) {
        int length = this.f.length;
        C0811d[] a = C0811d.m1791a(length);
        length = C6408b.m15171a(length, this.f, a);
        c4948f.f13777g = i;
        c4948f.f13780j = c0811dArr;
        c4948f.f13778h = length;
        c4948f.f13779i = a;
    }

    private void m15179a(C4948f c4948f, boolean z) {
        int i = 0;
        int length = this.f.length;
        for (int i2 = 0; i2 < length; i2++) {
            c4948f.f13779i[i2] = C6408b.m15174a(C6408b.m15175a(this.f, length, i2), c4948f.f13779i[i2]);
        }
        if (z) {
            int i3 = this.d;
            while (i < i3) {
                c4948f.f13780j[i] = C6408b.m15174a(this.e[i], c4948f.f13780j[i]);
                i++;
            }
        }
    }

    private void m15180a(byte[] bArr, C0807a c0807a) {
        while (c0807a != null) {
            C4948f c4948f = (C4948f) c0807a.f2421b;
            if (c4948f.m9664a()) {
                m15179a(c4948f, false);
                if (c4948f.f13777g <= 0) {
                    StringBuilder stringBuilder = new StringBuilder("bad catch clause: ");
                    stringBuilder.append(c0807a.f2422c);
                    throw new C0815e(stringBuilder.toString());
                }
                c4948f.f13780j[0] = C6408b.m15174a(m15173a(c0807a.f2422c), c4948f.f13780j[0]);
            } else {
                m15177a(c4948f, c0807a.f2422c);
                new C6408b(this).m15181a(bArr, c4948f);
            }
            c0807a = c0807a.f2420a;
        }
    }

    private void m15181a(byte[] bArr, C4948f c4948f) {
        C6408b.m15187b(c4948f.f13777g, c4948f.f13780j, this.e);
        this.d = c4948f.f13777g;
        C6408b.m15187b(c4948f.f13779i.length, c4948f.f13779i, this.f);
        m15180a(bArr, c4948f.f);
        int i = c4948f.a;
        int i2 = c4948f.b + i;
        while (i < i2) {
            i += m9638a(i, bArr);
        }
        m15180a(bArr, c4948f.f);
        if (c4948f.d != null) {
            for (C0810a c0810a : c4948f.d) {
                C4948f c4948f2 = (C4948f) c0810a;
                if (c4948f2.m9664a()) {
                    m15179a(c4948f2, true);
                } else {
                    C0811d[] a = C0811d.m1791a(this.e.length);
                    int i3 = this.d;
                    C6408b.m15171a(i3, this.e, a);
                    m15178a(c4948f2, i3, a);
                    new C6408b(this).m15181a(bArr, c4948f2);
                }
            }
        }
    }

    private void m15182a(C4948f[] c4948fArr, byte[] bArr) {
        int i;
        int length;
        C4948f c4948f;
        m15181a(bArr, c4948fArr[0]);
        for (C4948f c4948f2 : c4948fArr) {
            if (!c4948f2.m9664a()) {
                m15188b(bArr, c4948f2);
                C0807a c0807a = c4948f2.f;
                if (c0807a != null) {
                    c4948f = (C4948f) c0807a.f2421b;
                    if (!c4948f.m9664a()) {
                        m15177a(c4948f, c0807a.f2422c);
                        m15188b(bArr, c4948f);
                        c4948f.c = 1;
                    }
                }
            }
        }
        try {
            ArrayList arrayList = new ArrayList();
            length = c4948fArr.length;
            i = 0;
            int i2 = i;
            while (i < length) {
                c4948f = c4948fArr[i];
                if (c4948f.m9664a()) {
                    int i3;
                    int i4 = i2;
                    for (C0811d a : c4948f.f13779i) {
                        i4 = a.mo2663a(arrayList, i4, this.a);
                    }
                    i2 = c4948f.f13777g;
                    for (i3 = 0; i3 < i2; i3++) {
                        i4 = c4948f.f13780j[i3].mo2663a(arrayList, i4, this.a);
                    }
                    i2 = i4;
                }
                i++;
            }
        } catch (Throwable e) {
            throw new C0815e("failed to resolve types", e);
        }
    }

    private static boolean m15183a(C4948f c4948f, C4948f c4948f2) {
        int i = c4948f.c;
        return i > 1 ? true : i <= 0 ? false : c4948f2.e;
    }

    private int[] m15184a(int i, int i2, int[] iArr, C0811d[] c0811dArr) {
        int b = C6408b.m15185b(c0811dArr, i2, i2 + i);
        C0827p c0827p = this.b;
        int[] iArr2 = new int[b];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C0811d c0811d = c0811dArr[i2 + i3];
            iArr2[i4] = c0811d.mo849a();
            iArr[i4] = c0811d.mo850a(c0827p);
            if (c0811d.mo855d()) {
                i3++;
            }
            i4++;
            i3++;
        }
        return iArr2;
    }

    private static int m15185b(C0811d[] c0811dArr, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            i3++;
            if (c0811dArr[i].mo855d()) {
                i4++;
            }
            i = i4;
        }
        return i3;
    }

    public static p050b.p051a.av m15186b(p050b.C0848e r9, p050b.p051a.an r10) {
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
        r0 = r10.m1752f();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = p050b.p051a.p053b.C4948f.m9662a(r10, r0);	 Catch:{ b -> 0x0083 }
        if (r2 != 0) goto L_0x000f;
    L_0x000e:
        return r1;
    L_0x000f:
        r3 = new b.a.b.b;
        r3.<init>(r9, r10, r0);
        r9 = r0.c;	 Catch:{ e -> 0x007c }
        r3.m15182a(r2, r9);	 Catch:{ e -> 0x007c }
        r9 = r10.f2404a;
        r10 = new b.a.av$e;
        r10.<init>();
        r0 = 0;
        r3 = 1;
        r4 = r2.length;
        r5 = new boolean[r4];
        r6 = r2[r0];
        r6 = r6.c;
        if (r6 <= 0) goto L_0x002d;
    L_0x002b:
        r6 = r3;
        goto L_0x002e;
    L_0x002d:
        r6 = r0;
    L_0x002e:
        r5[r0] = r6;
        r6 = r5[r0];
    L_0x0032:
        if (r3 >= r4) goto L_0x004a;
    L_0x0034:
        r7 = r2[r3];
        r8 = r3 + -1;
        r8 = r2[r8];
        r8 = p050b.p051a.p053b.C6408b.m15183a(r7, r8);
        r5[r3] = r8;
        if (r8 == 0) goto L_0x0047;
    L_0x0042:
        r7.m9665b();
        r6 = r6 + 1;
    L_0x0047:
        r3 = r3 + 1;
        goto L_0x0032;
    L_0x004a:
        if (r6 != 0) goto L_0x004d;
    L_0x004c:
        return r1;
    L_0x004d:
        r10.m1760a(r6);
    L_0x0050:
        if (r0 >= r4) goto L_0x0070;
    L_0x0052:
        r1 = r5[r0];
        if (r1 == 0) goto L_0x006d;
    L_0x0056:
        r1 = r2[r0];
        r1 = r1.a;
        r3 = r2[r0];
        r10.m1760a(r1);
        r1 = r3.f13779i;
        r6 = r3.f13778h;
        p050b.p051a.p053b.C6408b.m15176a(r10, r9, r1, r6);
        r1 = r3.f13780j;
        r3 = r3.f13777g;
        p050b.p051a.p053b.C6408b.m15176a(r10, r9, r1, r3);
    L_0x006d:
        r0 = r0 + 1;
        goto L_0x0050;
    L_0x0070:
        r0 = new b.a.av;
        r10 = r10.f2415a;
        r10 = r10.toByteArray();
        r0.<init>(r9, r10);
        return r0;
    L_0x007c:
        r9 = move-exception;
        r0 = new b.a.e;
        r0.<init>(r10, r9);
        throw r0;
    L_0x0083:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.b.b.b(b.e, b.a.an):b.a.av");
    }

    private static void m15187b(int i, C0811d[] c0811dArr, C0811d[] c0811dArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            c0811dArr2[i2] = c0811dArr[i2];
        }
    }

    private void m15188b(byte[] bArr, C4948f c4948f) {
        int i = c4948f.a;
        int i2 = c4948f.b - 3;
        if (i2 < 0) {
            if (i2 == -1) {
                bArr[i] = (byte) 0;
            }
            bArr[(i + c4948f.b) - 1] = (byte) -65;
            c4948f.c = 1;
            m15177a(c4948f, 0);
            return;
        }
        c4948f.c = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = (byte) 0;
        }
        i += i2;
        bArr[i] = (byte) -89;
        C0817g.m1833a(-i2, bArr, i + 1);
    }
}
