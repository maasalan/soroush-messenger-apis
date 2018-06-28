package com.google.p173d.p193g.p194a;

import com.google.p173d.C2007e;
import com.google.p173d.C5605d;
import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.C1969e;
import com.google.p173d.p177b.p179b.C1962a;
import com.google.p173d.p177b.p179b.C1964c;
import java.util.Map;

public final class C2030e {
    private final C1964c f6812a = new C1964c(C1962a.f6559e);

    private C1969e m5548a(C2026a c2026a, Map<C2007e, ?> map) {
        int i;
        int i2;
        C2026a c2026a2 = c2026a;
        C2037j b = c2026a.m5538b();
        C2031f c2031f = c2026a.m5537a().f6821a;
        C2032g a = c2026a.m5537a();
        C2037j b2 = c2026a.m5538b();
        C2028c c2028c = C2028c.values()[a.f6822b];
        int i3 = c2026a2.f6796a.f6574b;
        c2028c.m5539a(c2026a2.f6796a, i3);
        int a2 = b2.m5561a();
        C1966b c1966b = new C1966b(a2);
        int i4 = 0;
        c1966b.m5415a(0, 0, 9, 9);
        int i5 = a2 - 8;
        c1966b.m5415a(i5, 0, 8, 9);
        c1966b.m5415a(0, i5, 9, 8);
        i5 = b2.f6844b.length;
        int i6 = 0;
        while (true) {
            int i7 = 2;
            if (i6 >= i5) {
                break;
            }
            i = b2.f6844b[i6] - 2;
            i2 = 0;
            while (i2 < i5) {
                if (!((i6 == 0 && (i2 == 0 || i2 == i5 - 1)) || (i6 == i5 - 1 && i2 == 0))) {
                    c1966b.m5415a(b2.f6844b[i2] - 2, i, 5, 5);
                }
                i2++;
            }
            i6++;
        }
        i5 = a2 - 17;
        int i8 = 6;
        c1966b.m5415a(6, 9, 1, i5);
        c1966b.m5415a(9, 6, i5, 1);
        if (b2.f6843a > 6) {
            a2 -= 11;
            c1966b.m5415a(a2, 0, 3, 6);
            c1966b.m5415a(0, a2, 6, 3);
        }
        byte[] bArr = new byte[b2.f6846d];
        int i9 = i3 - 1;
        i5 = i9;
        i = 0;
        int i10 = i;
        int i11 = i10;
        i2 = 1;
        while (i5 > 0) {
            if (i5 == i8) {
                i5--;
            }
            int i12 = i11;
            i11 = i10;
            i10 = i;
            i = i4;
            while (i < i3) {
                i8 = i2 != 0 ? i9 - i : i;
                int i13 = i11;
                i11 = i10;
                i10 = i4;
                for (i7 = 
/*
Method generation error in method: com.google.d.g.a.e.a(com.google.d.g.a.a, java.util.Map):com.google.d.b.e
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r12_2 'i7' int) = (r12_1 'i7' int), (r12_9 'i7' int) binds: {(r12_1 'i7' int)=B:22:0x0097, (r12_9 'i7' int)=B:41:0x00e4} in method: com.google.d.g.a.e.a(com.google.d.g.a.a, java.util.Map):com.google.d.b.e
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:217)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:217)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 25 more

*/

                private void m5549a(byte[] r6, int r7) {
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
                    r1 = r5.f6812a;	 Catch:{ d -> 0x0022 }
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
                    throw new UnsupportedOperationException("Method not decompiled: com.google.d.g.a.e.a(byte[], int):void");
                }

                public final C1969e m5550a(C1966b c1966b, Map<C2007e, ?> map) {
                    C5615f e;
                    C5605d c5605d;
                    int i;
                    int i2;
                    int i3;
                    C1969e a;
                    C2026a c2026a = new C2026a(c1966b);
                    try {
                        return m5548a(c2026a, (Map) map);
                    } catch (C5615f e2) {
                        e = e2;
                        c5605d = null;
                        try {
                            if (c2026a.f6798c != null) {
                                C2028c.values()[c2026a.f6798c.f6822b].m5539a(c2026a.f6796a, c2026a.f6796a.f6574b);
                            }
                            c2026a.f6797b = null;
                            c2026a.f6798c = null;
                            c2026a.f6799d = true;
                            c2026a.m5538b();
                            c2026a.m5537a();
                            i = 0;
                            while (i < c2026a.f6796a.f6573a) {
                                i2 = i + 1;
                                for (i3 = i2; i3 < c2026a.f6796a.f6574b; i3++) {
                                    if (c2026a.f6796a.m5416a(i, i3) != c2026a.f6796a.m5416a(i3, i)) {
                                        c2026a.f6796a.m5422c(i3, i);
                                        c2026a.f6796a.m5422c(i, i3);
                                    }
                                }
                                i = i2;
                            }
                            a = m5548a(c2026a, (Map) map);
                            a.f6619h = new C2034i();
                            return a;
                        } catch (C5615f e3) {
                            if (e != null) {
                                throw e;
                            } else if (c5605d == null) {
                                throw e3;
                            } else {
                                throw c5605d;
                            }
                        }
                    } catch (C5605d e4) {
                        c5605d = e4;
                        e = null;
                        if (c2026a.f6798c != null) {
                            C2028c.values()[c2026a.f6798c.f6822b].m5539a(c2026a.f6796a, c2026a.f6796a.f6574b);
                        }
                        c2026a.f6797b = null;
                        c2026a.f6798c = null;
                        c2026a.f6799d = true;
                        c2026a.m5538b();
                        c2026a.m5537a();
                        i = 0;
                        while (i < c2026a.f6796a.f6573a) {
                            i2 = i + 1;
                            for (i3 = i2; i3 < c2026a.f6796a.f6574b; i3++) {
                                if (c2026a.f6796a.m5416a(i, i3) != c2026a.f6796a.m5416a(i3, i)) {
                                    c2026a.f6796a.m5422c(i3, i);
                                    c2026a.f6796a.m5422c(i, i3);
                                }
                            }
                            i = i2;
                        }
                        a = m5548a(c2026a, (Map) map);
                        a.f6619h = new C2034i();
                        return a;
                    }
                }
            }
