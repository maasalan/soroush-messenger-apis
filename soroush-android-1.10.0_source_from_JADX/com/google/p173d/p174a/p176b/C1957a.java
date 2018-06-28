package com.google.p173d.p174a.p176b;

import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p174a.C5599a;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.C1971i;
import com.google.p173d.p177b.p178a.C1959a;

public final class C1957a {
    private static final int[] f6521g = new int[]{3808, 476, 2107, 1799};
    private final C1966b f6522a;
    private boolean f6523b;
    private int f6524c;
    private int f6525d;
    private int f6526e;
    private int f6527f;

    static final class C1956a {
        final int f6519a;
        final int f6520b;

        C1956a(int i, int i2) {
            this.f6519a = i;
            this.f6520b = i2;
        }

        final C2049p m5374a() {
            return new C2049p((float) this.f6519a, (float) this.f6520b);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(this.f6519a);
            stringBuilder.append(' ');
            stringBuilder.append(this.f6520b);
            stringBuilder.append('>');
            return stringBuilder.toString();
        }
    }

    public C1957a(C1966b c1966b) {
        this.f6522a = c1966b;
    }

    private static int m5375a(long r5, boolean r7) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 4;
        if (r7 == 0) goto L_0x0006;
    L_0x0003:
        r7 = 7;
        r1 = 2;
        goto L_0x0009;
    L_0x0006:
        r7 = 10;
        r1 = r0;
    L_0x0009:
        r2 = r7 - r1;
        r3 = new int[r7];
        r7 = r7 + -1;
    L_0x000f:
        if (r7 < 0) goto L_0x001a;
    L_0x0011:
        r4 = (int) r5;
        r4 = r4 & 15;
        r3[r7] = r4;
        r5 = r5 >> r0;
        r7 = r7 + -1;
        goto L_0x000f;
    L_0x001a:
        r5 = new com.google.d.b.b.c;	 Catch:{ d -> 0x0031 }
        r6 = com.google.p173d.p177b.p179b.C1962a.f6558d;	 Catch:{ d -> 0x0031 }
        r5.<init>(r6);	 Catch:{ d -> 0x0031 }
        r5.m5413a(r3, r2);	 Catch:{ d -> 0x0031 }
        r5 = 0;
        r6 = r5;
    L_0x0026:
        if (r5 >= r1) goto L_0x0030;
    L_0x0028:
        r6 = r6 << 4;
        r7 = r3[r5];
        r6 = r6 + r7;
        r5 = r5 + 1;
        goto L_0x0026;
    L_0x0030:
        return r6;
    L_0x0031:
        r5 = com.google.p173d.C5629j.m12369a();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.b.a.a(long, boolean):int");
    }

    private int m5376a(C1956a c1956a, C1956a c1956a2) {
        float b = C1957a.m5383b(c1956a, c1956a2);
        float f = ((float) (c1956a2.f6519a - c1956a.f6519a)) / b;
        float f2 = ((float) (c1956a2.f6520b - c1956a.f6520b)) / b;
        float f3 = (float) c1956a.f6519a;
        float f4 = (float) c1956a.f6520b;
        boolean a = this.f6522a.m5416a(c1956a.f6519a, c1956a.f6520b);
        int ceil = (int) Math.ceil((double) b);
        boolean z = false;
        float f5 = f4;
        int i = 0;
        f4 = f3;
        for (int i2 = i; i2 < ceil; i2++) {
            f4 += f;
            f5 += f2;
            if (this.f6522a.m5416a(C1959a.m5388a(f4), C1959a.m5388a(f5)) != a) {
                i++;
            }
        }
        f2 = ((float) i) / b;
        if (f2 > 0.1f && f2 < 0.9f) {
            return 0;
        }
        if (f2 <= 0.1f) {
            z = true;
        }
        return z == a ? 1 : -1;
    }

    private int m5377a(C2049p c2049p, C2049p c2049p2, int i) {
        float a = C1959a.m5386a(c2049p.f6891a, c2049p.f6892b, c2049p2.f6891a, c2049p2.f6892b);
        float f = a / ((float) i);
        float f2 = c2049p.f6891a;
        float f3 = c2049p.f6892b;
        float f4 = ((c2049p2.f6891a - c2049p.f6891a) * f) / a;
        f = (f * (c2049p2.f6892b - c2049p.f6892b)) / a;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f5 = (float) i2;
            if (this.f6522a.m5416a(C1959a.m5388a((f5 * f4) + f2), C1959a.m5388a((f5 * f) + f3))) {
                i3 |= 1 << ((i - i2) - 1);
            }
            i2++;
        }
        return i3;
    }

    private com.google.p173d.p174a.p176b.C1957a.C1956a m5378a() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r12 = this;
        r0 = 3;
        r1 = 2;
        r2 = -1;
        r3 = 1;
        r4 = 0;
        r5 = new com.google.d.b.a.b;	 Catch:{ j -> 0x0019 }
        r6 = r12.f6522a;	 Catch:{ j -> 0x0019 }
        r5.<init>(r6);	 Catch:{ j -> 0x0019 }
        r5 = r5.m5392a();	 Catch:{ j -> 0x0019 }
        r6 = r5[r4];	 Catch:{ j -> 0x0019 }
        r7 = r5[r3];	 Catch:{ j -> 0x0019 }
        r8 = r5[r1];	 Catch:{ j -> 0x0019 }
        r5 = r5[r0];	 Catch:{ j -> 0x0019 }
        goto L_0x0063;
    L_0x0019:
        r5 = r12.f6522a;
        r5 = r5.f6573a;
        r5 = r5 / r1;
        r6 = r12.f6522a;
        r6 = r6.f6574b;
        r6 = r6 / r1;
        r7 = new com.google.d.a.b.a$a;
        r8 = r5 + 7;
        r9 = r6 + -7;
        r7.<init>(r8, r9);
        r7 = r12.m5379a(r7, r4, r3, r2);
        r7 = r7.m5374a();
        r10 = new com.google.d.a.b.a$a;
        r6 = r6 + 7;
        r10.<init>(r8, r6);
        r8 = r12.m5379a(r10, r4, r3, r3);
        r8 = r8.m5374a();
        r10 = new com.google.d.a.b.a$a;
        r5 = r5 + -7;
        r10.<init>(r5, r6);
        r6 = r12.m5379a(r10, r4, r2, r3);
        r6 = r6.m5374a();
        r10 = new com.google.d.a.b.a$a;
        r10.<init>(r5, r9);
        r5 = r12.m5379a(r10, r4, r2, r2);
        r5 = r5.m5374a();
        r11 = r8;
        r8 = r6;
        r6 = r7;
        r7 = r11;
    L_0x0063:
        r9 = r6.f6891a;
        r10 = r5.f6891a;
        r9 = r9 + r10;
        r10 = r7.f6891a;
        r9 = r9 + r10;
        r10 = r8.f6891a;
        r9 = r9 + r10;
        r10 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r9 = r9 / r10;
        r9 = com.google.p173d.p177b.p178a.C1959a.m5388a(r9);
        r6 = r6.f6892b;
        r5 = r5.f6892b;
        r6 = r6 + r5;
        r5 = r7.f6892b;
        r6 = r6 + r5;
        r5 = r8.f6892b;
        r6 = r6 + r5;
        r6 = r6 / r10;
        r5 = com.google.p173d.p177b.p178a.C1959a.m5388a(r6);
        r6 = new com.google.d.b.a.b;	 Catch:{ j -> 0x009b }
        r7 = r12.f6522a;	 Catch:{ j -> 0x009b }
        r8 = 15;	 Catch:{ j -> 0x009b }
        r6.<init>(r7, r8, r9, r5);	 Catch:{ j -> 0x009b }
        r6 = r6.m5392a();	 Catch:{ j -> 0x009b }
        r7 = r6[r4];	 Catch:{ j -> 0x009b }
        r8 = r6[r3];	 Catch:{ j -> 0x009b }
        r1 = r6[r1];	 Catch:{ j -> 0x009b }
        r0 = r6[r0];	 Catch:{ j -> 0x009b }
        goto L_0x00d7;
    L_0x009b:
        r0 = new com.google.d.a.b.a$a;
        r1 = r9 + 7;
        r6 = r5 + -7;
        r0.<init>(r1, r6);
        r0 = r12.m5379a(r0, r4, r3, r2);
        r7 = r0.m5374a();
        r0 = new com.google.d.a.b.a$a;
        r5 = r5 + 7;
        r0.<init>(r1, r5);
        r0 = r12.m5379a(r0, r4, r3, r3);
        r8 = r0.m5374a();
        r0 = new com.google.d.a.b.a$a;
        r9 = r9 + -7;
        r0.<init>(r9, r5);
        r0 = r12.m5379a(r0, r4, r2, r3);
        r1 = r0.m5374a();
        r0 = new com.google.d.a.b.a$a;
        r0.<init>(r9, r6);
        r0 = r12.m5379a(r0, r4, r2, r2);
        r0 = r0.m5374a();
    L_0x00d7:
        r2 = r7.f6891a;
        r3 = r0.f6891a;
        r2 = r2 + r3;
        r3 = r8.f6891a;
        r2 = r2 + r3;
        r3 = r1.f6891a;
        r2 = r2 + r3;
        r2 = r2 / r10;
        r2 = com.google.p173d.p177b.p178a.C1959a.m5388a(r2);
        r3 = r7.f6892b;
        r0 = r0.f6892b;
        r3 = r3 + r0;
        r0 = r8.f6892b;
        r3 = r3 + r0;
        r0 = r1.f6892b;
        r3 = r3 + r0;
        r3 = r3 / r10;
        r0 = com.google.p173d.p177b.p178a.C1959a.m5388a(r3);
        r1 = new com.google.d.a.b.a$a;
        r1.<init>(r2, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.b.a.a():com.google.d.a.b.a$a");
    }

    private C1956a m5379a(C1956a c1956a, boolean z, int i, int i2) {
        int i3 = c1956a.f6519a + i;
        int i4 = c1956a.f6520b;
        while (true) {
            i4 += i2;
            if (m5380a(i3, i4) && this.f6522a.m5416a(i3, i4) == z) {
                i3 += i;
            } else {
                i3 -= i;
                i4 -= i2;
            }
        }
        i3 -= i;
        i4 -= i2;
        while (m5380a(i3, i4) && this.f6522a.m5416a(i3, i4) == z) {
            i3 += i;
        }
        i3 -= i;
        while (m5380a(i3, i4) && this.f6522a.m5416a(i3, i4) == z) {
            i4 += i2;
        }
        return new C1956a(i3, i4 - i2);
    }

    private boolean m5380a(int i, int i2) {
        return i >= 0 && i < this.f6522a.f6573a && i2 > 0 && i2 < this.f6522a.f6574b;
    }

    private boolean m5381a(C2049p c2049p) {
        return m5380a(C1959a.m5388a(c2049p.f6891a), C1959a.m5388a(c2049p.f6892b));
    }

    private static C2049p[] m5382a(C2049p[] c2049pArr, float f, float f2) {
        f2 /= f * 2.0f;
        float f3 = (c2049pArr[0].f6891a + c2049pArr[2].f6891a) / 2.0f;
        float f4 = (c2049pArr[0].f6892b + c2049pArr[2].f6892b) / 2.0f;
        float f5 = (c2049pArr[0].f6891a - c2049pArr[2].f6891a) * f2;
        float f6 = (c2049pArr[0].f6892b - c2049pArr[2].f6892b) * f2;
        C2049p c2049p = new C2049p(f3 + f5, f4 + f6);
        C2049p c2049p2 = new C2049p(f3 - f5, f4 - f6);
        float f7 = (c2049pArr[1].f6891a + c2049pArr[3].f6891a) / 2.0f;
        float f8 = (c2049pArr[1].f6892b + c2049pArr[3].f6892b) / 2.0f;
        f6 = (c2049pArr[1].f6891a - c2049pArr[3].f6891a) * f2;
        f2 *= c2049pArr[1].f6892b - c2049pArr[3].f6892b;
        C2049p c2049p3 = new C2049p(f7 + f6, f8 + f2);
        C2049p c2049p4 = new C2049p(f7 - f6, f8 - f2);
        return new C2049p[]{c2049p, c2049p3, c2049p2, c2049p4};
    }

    private static float m5383b(C1956a c1956a, C1956a c1956a2) {
        return C1959a.m5387a(c1956a.f6519a, c1956a.f6520b, c1956a2.f6519a, c1956a2.f6520b);
    }

    private int m5384b() {
        return this.f6523b ? (4 * this.f6524c) + 11 : this.f6524c <= 4 ? (4 * this.f6524c) + 15 : ((this.f6524c * 4) + (2 * (((this.f6524c - 4) / 8) + 1))) + 15;
    }

    public final C5599a m5385a(boolean z) {
        C1956a a = m5378a();
        int i = 1;
        this.f6526e = 1;
        C1956a c1956a = a;
        C1956a c1956a2 = c1956a;
        C1956a c1956a3 = c1956a2;
        boolean z2 = true;
        while (r0.f6526e < 9) {
            C1956a c1956a4;
            C1956a a2 = m5379a(a, z2, i, -1);
            C1956a a3 = m5379a(c1956a, z2, i, i);
            C1956a a4 = m5379a(c1956a2, z2, -1, i);
            C1956a a5 = m5379a(c1956a3, z2, -1, -1);
            if (r0.f6526e > 2) {
                double b = (double) ((C1957a.m5383b(a5, a2) * ((float) r0.f6526e)) / (C1957a.m5383b(c1956a3, a) * ((float) (r0.f6526e + 2))));
                if (b < 0.75d || b > 1.25d) {
                    break;
                }
                C1956a c1956a5 = new C1956a(a2.f6519a - 3, a2.f6520b + 3);
                C1956a c1956a6 = new C1956a(a3.f6519a - 3, a3.f6520b - 3);
                C1956a c1956a7 = new C1956a(a4.f6519a + 3, a4.f6520b - 3);
                c1956a4 = a2;
                C1956a c1956a8 = new C1956a(a5.f6519a + 3, a5.f6520b + 3);
                int a6 = m5376a(c1956a8, c1956a5);
                Object obj = (a6 != 0 && m5376a(c1956a5, c1956a6) == a6 && m5376a(c1956a6, c1956a7) == a6 && m5376a(c1956a7, c1956a8) == a6) ? 1 : null;
                if (obj == null) {
                    break;
                }
            } else {
                c1956a4 = a2;
            }
            z2 ^= 1;
            r0.f6526e++;
            c1956a3 = a5;
            c1956a = a3;
            c1956a2 = a4;
            a = c1956a4;
            i = 1;
        }
        if (r0.f6526e == 5 || r0.f6526e == 7) {
            int i2;
            r0.f6523b = r0.f6526e == 5;
            C2049p c2049p = new C2049p(((float) a.f6519a) + 0.5f, ((float) a.f6520b) - 0.5f);
            C2049p c2049p2 = new C2049p(((float) c1956a.f6519a) + 0.5f, ((float) c1956a.f6520b) + 0.5f);
            C2049p c2049p3 = new C2049p(((float) c1956a2.f6519a) - 0.5f, ((float) c1956a2.f6520b) + 0.5f);
            C2049p c2049p4 = new C2049p(((float) c1956a3.f6519a) - 0.5f, ((float) c1956a3.f6520b) - 0.5f);
            C2049p[] a7 = C1957a.m5382a(new C2049p[]{c2049p, c2049p2, c2049p3, c2049p4}, (float) ((2 * r0.f6526e) - 3), (float) (2 * r0.f6526e));
            if (z) {
                i2 = 0;
                c2049p4 = a7[0];
                a7[0] = a7[2];
                a7[2] = c2049p4;
            } else {
                i2 = 0;
            }
            if (m5381a(a7[i2]) && m5381a(a7[1]) && m5381a(a7[2])) {
                if (m5381a(a7[3])) {
                    int i3 = 2 * r0.f6526e;
                    r4 = new int[4];
                    a6 = 0;
                    r4[0] = m5377a(a7[0], a7[1], i3);
                    r4[1] = m5377a(a7[1], a7[2], i3);
                    r4[2] = m5377a(a7[2], a7[3], i3);
                    r4[3] = m5377a(a7[3], a7[0], i3);
                    int i4 = 0;
                    int i5 = i4;
                    while (i4 < 4) {
                        int i6 = r4[i4];
                        i5 = (i5 << 3) + (((i6 >> (i3 - 2)) << 1) + (i6 & 1));
                        i4++;
                    }
                    int i7 = ((i5 & 1) << 11) + (i5 >> 1);
                    for (i4 = 0; i4 < 4; i4++) {
                        if (Integer.bitCount(f6521g[i4] ^ i7) <= 2) {
                            r0.f6527f = i4;
                            long j = 0;
                            while (a6 < 4) {
                                long j2;
                                i7 = r4[(r0.f6527f + a6) % 4];
                                if (r0.f6523b) {
                                    j <<= 7;
                                    j2 = (long) ((i7 >> 1) & 127);
                                } else {
                                    j <<= 10;
                                    j2 = (long) (((i7 >> 2) & 992) + ((i7 >> 1) & 31));
                                }
                                j += j2;
                                a6++;
                            }
                            i7 = C1957a.m5375a(j, r0.f6523b);
                            if (r0.f6523b) {
                                i5 = 1;
                                r0.f6524c = (i7 >> 6) + 1;
                                i7 &= 63;
                            } else {
                                i5 = 1;
                                r0.f6524c = (i7 >> 11) + 1;
                                i7 &= 2047;
                            }
                            r0.f6525d = i7 + i5;
                            C1966b c1966b = r0.f6522a;
                            C2049p c2049p5 = a7[r0.f6527f % 4];
                            c2049p3 = a7[(r0.f6527f + i5) % 4];
                            c2049p4 = a7[(r0.f6527f + 2) % 4];
                            C2049p c2049p6 = a7[(r0.f6527f + 3) % 4];
                            C1971i a8 = C1971i.m5426a();
                            i5 = m5384b();
                            float f = ((float) i5) / 2.0f;
                            float f2 = f - ((float) r0.f6526e);
                            float f3 = f + ((float) r0.f6526e);
                            return new C5599a(a8.mo1759a(c1966b, i5, i5, f2, f2, f3, f2, f3, f3, f2, f3, c2049p5.f6891a, c2049p5.f6892b, c2049p3.f6891a, c2049p3.f6892b, c2049p4.f6891a, c2049p4.f6892b, c2049p6.f6891a, c2049p6.f6892b), C1957a.m5382a(a7, (float) (2 * r0.f6526e), (float) m5384b()), r0.f6523b, r0.f6525d, r0.f6524c);
                        }
                    }
                    throw C5629j.m12369a();
                }
            }
            throw C5629j.m12369a();
        }
        throw C5629j.m12369a();
    }
}
