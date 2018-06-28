package com.google.p173d.p180c.p181a;

import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.C1969e;
import com.google.p173d.p177b.p179b.C1962a;
import com.google.p173d.p177b.p179b.C1964c;
import com.google.p173d.p180c.p181a.C1983e.C1981a;
import com.google.p173d.p180c.p181a.C1983e.C1982b;

public final class C1980d {
    private final C1964c f6656a = new C1964c(C1962a.f6560f);

    private void m5448a(byte[] r6, int r7) {
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
        r5 = this;
        r0 = 0;
        r1 = r6.length;
        r2 = new int[r1];
        r3 = r0;
    L_0x0005:
        if (r3 >= r1) goto L_0x0010;
    L_0x0007:
        r4 = r6[r3];
        r4 = r4 & 255;
        r2[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0005;
    L_0x0010:
        r1 = r5.f6656a;	 Catch:{ d -> 0x0022 }
        r3 = r6.length;	 Catch:{ d -> 0x0022 }
        r3 = r3 - r7;	 Catch:{ d -> 0x0022 }
        r1.m5413a(r2, r3);	 Catch:{ d -> 0x0022 }
    L_0x0017:
        if (r0 >= r7) goto L_0x0021;
    L_0x0019:
        r1 = r2[r0];
        r1 = (byte) r1;
        r6[r0] = r1;
        r0 = r0 + 1;
        goto L_0x0017;
    L_0x0021:
        return;
    L_0x0022:
        r6 = com.google.p173d.C5605d.m12328a();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.a.d.a(byte[], int):void");
    }

    public final C1969e m5449a(C1966b c1966b) {
        int i;
        int i2;
        C1975a c1975a = new C1975a(c1966b);
        C1983e c1983e = c1975a.f6639c;
        byte[] bArr = new byte[c1975a.f6639c.f6668g];
        int i3 = c1975a.f6637a.f6574b;
        int i4 = c1975a.f6637a.f6573a;
        int i5 = 0;
        int i6 = 0;
        int i7 = i6;
        int i8 = i7;
        int i9 = i8;
        int i10 = i9;
        int i11 = i10;
        int i12 = 4;
        while (true) {
            int i13;
            int i14;
            if (i12 == i3 && i6 == 0 && i7 == 0) {
                i7 = i8 + 1;
                i14 = i3 - 1;
                int a = c1975a.m5436a(i14, i5, i3, i4) << 1;
                if (c1975a.m5436a(i14, 1, i3, i4)) {
                    a |= 1;
                }
                a <<= 1;
                if (c1975a.m5436a(i14, 2, i3, i4)) {
                    a |= 1;
                }
                i14 = a << 1;
                if (c1975a.m5436a(i5, i4 - 2, i3, i4)) {
                    i14 |= 1;
                }
                i14 <<= 1;
                i = i4 - 1;
                if (c1975a.m5436a(i5, i, i3, i4)) {
                    i14 |= 1;
                }
                i14 <<= 1;
                if (c1975a.m5436a(1, i, i3, i4)) {
                    i14 |= 1;
                }
                i14 <<= 1;
                if (c1975a.m5436a(2, i, i3, i4)) {
                    i14 |= 1;
                }
                i5 = i14 << 1;
                if (c1975a.m5436a(3, i, i3, i4)) {
                    i5 |= 1;
                }
                bArr[i8] = (byte) i5;
                i12 -= 2;
                i6 += 2;
                i = 1;
                i13 = i;
                i8 = i7;
            } else {
                i5 = i3 - 2;
                if (i12 == i5 && i6 == 0 && (i4 & 3) != 0 && r11 == 0) {
                    i9 = i8 + 1;
                    i14 = c1975a.m5436a(i3 - 3, 0, i3, i4) << 1;
                    if (c1975a.m5436a(i5, 0, i3, i4)) {
                        i14 |= 1;
                    }
                    i5 = i14 << 1;
                    if (c1975a.m5436a(i3 - 1, 0, i3, i4)) {
                        i5 |= 1;
                    }
                    i5 <<= 1;
                    if (c1975a.m5436a(0, i4 - 4, i3, i4)) {
                        i5 |= 1;
                    }
                    i5 <<= 1;
                    if (c1975a.m5436a(0, i4 - 3, i3, i4)) {
                        i5 |= 1;
                    }
                    i5 <<= 1;
                    if (c1975a.m5436a(0, i4 - 2, i3, i4)) {
                        i5 |= 1;
                    }
                    i5 <<= 1;
                    i14 = i4 - 1;
                    if (c1975a.m5436a(0, i14, i3, i4)) {
                        i5 |= 1;
                    }
                    i5 <<= 1;
                    if (c1975a.m5436a(1, i14, i3, i4)) {
                        i5 |= 1;
                    }
                    bArr[i8] = (byte) i5;
                    i12 -= 2;
                    i6 += 2;
                    i = 1;
                    i13 = i7;
                    i8 = i9;
                    i9 = i;
                } else if (i12 == i3 + 4 && i6 == 2 && (i4 & 7) == 0 && r12 == 0) {
                    i5 = i8 + 1;
                    i10 = i3 - 1;
                    i14 = c1975a.m5436a(i10, 0, i3, i4) << 1;
                    i = i4 - 1;
                    if (c1975a.m5436a(i10, i, i3, i4)) {
                        i14 |= 1;
                    }
                    i10 = i14 << 1;
                    i14 = i4 - 3;
                    if (c1975a.m5436a(0, i14, i3, i4)) {
                        i10 |= 1;
                    }
                    i10 <<= 1;
                    i2 = i4 - 2;
                    int i15 = i5;
                    if (c1975a.m5436a(0, i2, i3, i4)) {
                        i10 |= 1;
                    }
                    i13 = i7;
                    i10 <<= 1;
                    if (c1975a.m5436a(0, i, i3, i4)) {
                        i10 |= 1;
                    }
                    i5 = i10 << 1;
                    if (c1975a.m5436a(1, i14, i3, i4)) {
                        i5 |= 1;
                    }
                    i5 <<= 1;
                    if (c1975a.m5436a(1, i2, i3, i4)) {
                        i5 |= 1;
                    }
                    i2 = i5 << 1;
                    if (c1975a.m5436a(1, i, i3, i4)) {
                        i2 |= 1;
                    }
                    bArr[i8] = (byte) i2;
                    i12 -= 2;
                    i6 += 2;
                    i8 = i15;
                    i10 = 1;
                    i = 1;
                } else {
                    i13 = i7;
                    if (i12 == i5 && i6 == 0) {
                        if ((i4 & 7) == 4 && r13 == 0) {
                            i2 = i8 + 1;
                            i = 1;
                            i11 = c1975a.m5436a(i3 - 3, 0, i3, i4) << 1;
                            if (c1975a.m5436a(i5, 0, i3, i4)) {
                                i11 |= 1;
                            }
                            i5 = i11 << 1;
                            if (c1975a.m5436a(i3 - 1, 0, i3, i4)) {
                                i5 |= 1;
                            }
                            i5 <<= 1;
                            if (c1975a.m5436a(0, i4 - 2, i3, i4)) {
                                i5 |= 1;
                            }
                            i5 <<= 1;
                            i11 = i4 - 1;
                            if (c1975a.m5436a(0, i11, i3, i4)) {
                                i5 |= 1;
                            }
                            i5 <<= 1;
                            if (c1975a.m5436a(1, i11, i3, i4)) {
                                i5 |= 1;
                            }
                            i5 <<= 1;
                            if (c1975a.m5436a(2, i11, i3, i4)) {
                                i5 |= 1;
                            }
                            i5 <<= 1;
                            if (c1975a.m5436a(3, i11, i3, i4)) {
                                i5 |= 1;
                            }
                            bArr[i8] = (byte) i5;
                            i12 -= 2;
                            i6 += 2;
                            i8 = i2;
                            i11 = 1;
                        }
                    }
                    i = 1;
                    do {
                        if (i12 < i3 && i6 >= 0 && !c1975a.f6638b.m5416a(i6, i12)) {
                            i2 = i8 + 1;
                            bArr[i8] = (byte) c1975a.m5437b(i12, i6, i3, i4);
                            i8 = i2;
                        }
                        i12 -= 2;
                        i6 += 2;
                        if (i12 < 0) {
                            break;
                        }
                    } while (i6 < i4);
                    i12++;
                    i6 += 3;
                    do {
                        if (i12 >= 0 && i6 < i4 && !c1975a.f6638b.m5416a(i6, i12)) {
                            i2 = i8 + 1;
                            bArr[i8] = (byte) c1975a.m5437b(i12, i6, i3, i4);
                            i8 = i2;
                        }
                        i12 += 2;
                        i6 -= 2;
                        if (i12 >= i3) {
                            break;
                        }
                    } while (i6 >= 0);
                    i12 += 3;
                    i6++;
                }
            }
            if (i12 >= i3 && r8 >= i4) {
                break;
            }
            C1980d c1980d = this;
            i5 = 0;
            i7 = i13;
        }
        if (i8 != c1975a.f6639c.f6668g) {
            throw C5615f.m12347a();
        }
        C1982b c1982b = c1983e.f6667f;
        C1981a[] c1981aArr = c1982b.f6660b;
        i5 = 0;
        for (C1981a c1981a : c1981aArr) {
            i5 += c1981a.f6657a;
        }
        C1976b[] c1976bArr = new C1976b[i5];
        i2 = c1981aArr.length;
        i5 = 0;
        i12 = 0;
        while (i5 < i2) {
            C1981a c1981a2 = c1981aArr[i5];
            i7 = i12;
            i12 = 0;
            while (i12 < c1981a2.f6657a) {
                i8 = c1981a2.f6658b;
                i10 = i7 + 1;
                c1976bArr[i7] = new C1976b(i8, new byte[(c1982b.f6659a + i8)]);
                i12++;
                i7 = i10;
            }
            i5++;
            i12 = i7;
        }
        i3 = c1976bArr[0].f6641b.length - c1982b.f6659a;
        int i16 = i3 - 1;
        i2 = 0;
        i5 = 0;
        while (i2 < i16) {
            i6 = i5;
            i5 = 0;
            while (i5 < i12) {
                i8 = i6 + 1;
                c1976bArr[i5].f6641b[i2] = bArr[i6];
                i5++;
                i6 = i8;
            }
            i2++;
            i5 = i6;
        }
        if (c1983e.f6662a != 24) {
            i = 0;
        }
        int i17 = i != 0 ? 8 : i12;
        i2 = 0;
        while (i2 < i17) {
            i7 = i5 + 1;
            c1976bArr[i2].f6641b[i16] = bArr[i5];
            i2++;
            i5 = i7;
        }
        i16 = c1976bArr[0].f6641b.length;
        while (i3 < i16) {
            i17 = 0;
            while (i17 < i12) {
                i6 = i != 0 ? (i17 + 8) % i12 : i17;
                i7 = (i == 0 || i6 <= 7) ? i3 : i3 - 1;
                i8 = i5 + 1;
                c1976bArr[i6].f6641b[i7] = bArr[i5];
                i17++;
                i5 = i8;
            }
            i3++;
        }
        if (i5 != bArr.length) {
            throw new IllegalArgumentException();
        }
        i17 = 0;
        int i18 = i17;
        while (i17 < c1976bArr.length) {
            i18 += c1976bArr[i17].f6640a;
            i17++;
        }
        byte[] bArr2 = new byte[i18];
        i17 = c1976bArr.length;
        for (i18 = 0; i18 < i17; i18++) {
            C1976b c1976b = c1976bArr[i18];
            byte[] bArr3 = c1976b.f6641b;
            i3 = c1976b.f6640a;
            m5448a(bArr3, i3);
            for (i12 = 0; i12 < i3; i12++) {
                bArr2[(i12 * i17) + i18] = bArr3[i12];
            }
        }
        c1980d = this;
        return C1979c.m5441a(bArr2);
    }
}
