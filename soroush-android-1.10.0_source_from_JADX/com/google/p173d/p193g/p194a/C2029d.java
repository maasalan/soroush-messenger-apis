package com.google.p173d.p193g.p194a;

import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1967c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

final class C2029d {
    private static final char[] f6811a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    private static char m5541a(int i) {
        if (i < f6811a.length) {
            return f6811a[i];
        }
        throw C5615f.m12347a();
    }

    static com.google.p173d.p177b.C1969e m5542a(byte[] r18, com.google.p173d.p193g.p194a.C2037j r19, com.google.p173d.p193g.p194a.C2031f r20, java.util.Map<com.google.p173d.C2007e, ?> r21) {
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
        r0 = r19;
        r7 = new com.google.d.b.c;
        r8 = r18;
        r7.<init>(r8);
        r9 = new java.lang.StringBuilder;
        r1 = 50;
        r9.<init>(r1);
        r10 = new java.util.ArrayList;
        r11 = 1;
        r10.<init>(r11);
        r1 = 0;
        r2 = -1;
        r12 = 0;
        r13 = r1;
        r15 = r2;
        r16 = r15;
        r14 = r12;
    L_0x001e:
        r1 = r7.m5423a();	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2 = 4;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r1 >= r2) goto L_0x0029;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0025:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6823a;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0027:
        r6 = r1;	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x0032;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0029:
        r1 = r7.m5424a(r2);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r1 = com.google.p173d.p193g.p194a.C2033h.m5555a(r1);	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x0027;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0032:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6823a;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 == r1) goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0036:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6830h;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 == r1) goto L_0x00e8;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x003a:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6831i;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 != r1) goto L_0x0040;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x003e:
        goto L_0x00e8;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0040:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6826d;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r3 = 16;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r4 = 8;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 != r1) goto L_0x0061;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0048:
        r1 = r7.m5423a();	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r1 >= r3) goto L_0x0053;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x004e:
        r0 = com.google.p173d.C5615f.m12347a();	 Catch:{ IllegalArgumentException -> 0x0112 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0053:
        r1 = r7.m5424a(r4);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2 = r7.m5424a(r4);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r15 = r1;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r16 = r2;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x005e:
        r11 = r6;	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x00ea;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0061:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6828f;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 != r1) goto L_0x009d;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0065:
        r1 = r7.m5424a(r4);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2 = r1 & 128;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r2 != 0) goto L_0x0070;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x006d:
        r1 = r1 & 127;	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x008d;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0070:
        r2 = r1 & 192;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r2 != r5) goto L_0x007f;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0076:
        r2 = r7.m5424a(r4);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r1 = r1 & 63;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r1 = r1 << r4;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x007d:
        r1 = r1 | r2;	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x008d;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x007f:
        r2 = r1 & 224;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r4 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r2 != r4) goto L_0x0098;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0085:
        r2 = r7.m5424a(r3);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r1 = r1 & 31;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r1 = r1 << r3;	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x007d;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x008d:
        r14 = com.google.p173d.p177b.C1968d.m5425a(r1);	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r14 != 0) goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0093:
        r0 = com.google.p173d.C5615f.m12347a();	 Catch:{ IllegalArgumentException -> 0x0112 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0098:
        r0 = com.google.p173d.C5615f.m12347a();	 Catch:{ IllegalArgumentException -> 0x0112 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x009d:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6832j;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 != r1) goto L_0x00b3;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00a1:
        r1 = r7.m5424a(r2);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2 = r6.m5556a(r0);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2 = r7.m5424a(r2);	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r1 != r11) goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00af:
        com.google.p173d.p193g.p194a.C2029d.m5543a(r7, r9, r2);	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00b3:
        r1 = r6.m5556a(r0);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r3 = r7.m5424a(r1);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r1 = com.google.p173d.p193g.p194a.C2033h.f6824b;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 != r1) goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00bf:
        com.google.p173d.p193g.p194a.C2029d.m5547c(r7, r9, r3);	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00c3:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6825c;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 != r1) goto L_0x00cb;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00c7:
        com.google.p173d.p193g.p194a.C2029d.m5545a(r7, r9, r3, r13);	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00cb:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6827e;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r6 != r1) goto L_0x00da;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00cf:
        r1 = r7;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2 = r9;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r4 = r14;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r5 = r10;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r11 = r6;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r6 = r21;	 Catch:{ IllegalArgumentException -> 0x0112 }
        com.google.p173d.p193g.p194a.C2029d.m5544a(r1, r2, r3, r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x00ea;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00da:
        r11 = r6;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r1 = com.google.p173d.p193g.p194a.C2033h.f6829g;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r11 != r1) goto L_0x00e3;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00df:
        com.google.p173d.p193g.p194a.C2029d.m5546b(r7, r9, r3);	 Catch:{ IllegalArgumentException -> 0x0112 }
        goto L_0x00ea;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00e3:
        r0 = com.google.p173d.C5615f.m12347a();	 Catch:{ IllegalArgumentException -> 0x0112 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00e8:
        r11 = r6;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r13 = 1;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x00ea:
        r1 = com.google.p173d.p193g.p194a.C2033h.f6823a;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r11 != r1) goto L_0x010f;
    L_0x00ee:
        r7 = new com.google.d.b.e;
        r2 = r9.toString();
        r0 = r10.isEmpty();
        if (r0 == 0) goto L_0x00fc;
    L_0x00fa:
        r3 = r12;
        goto L_0x00fd;
    L_0x00fc:
        r3 = r10;
    L_0x00fd:
        if (r20 != 0) goto L_0x0101;
    L_0x00ff:
        r4 = r12;
        goto L_0x0106;
    L_0x0101:
        r0 = r20.toString();
        r4 = r0;
    L_0x0106:
        r0 = r7;
        r1 = r8;
        r5 = r15;
        r6 = r16;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r7;
    L_0x010f:
        r11 = 1;
        goto L_0x001e;
    L_0x0112:
        r0 = com.google.p173d.C5615f.m12347a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.g.a.d.a(byte[], com.google.d.g.a.j, com.google.d.g.a.f, java.util.Map):com.google.d.b.e");
    }

    private static void m5543a(com.google.p173d.p177b.C1967c r5, java.lang.StringBuilder r6, int r7) {
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
        r0 = r7 * 13;
        r1 = r5.m5423a();
        if (r0 <= r1) goto L_0x000d;
    L_0x0008:
        r5 = com.google.p173d.C5615f.m12347a();
        throw r5;
    L_0x000d:
        r0 = 2;
        r1 = r0 * r7;
        r1 = new byte[r1];
        r2 = 0;
    L_0x0013:
        if (r7 <= 0) goto L_0x003d;
    L_0x0015:
        r3 = 13;
        r3 = r5.m5424a(r3);
        r4 = r3 / 96;
        r4 = r4 << 8;
        r3 = r3 % 96;
        r3 = r3 | r4;
        r4 = 959; // 0x3bf float:1.344E-42 double:4.74E-321;
        if (r3 >= r4) goto L_0x002b;
    L_0x0026:
        r4 = 41377; // 0xa1a1 float:5.7982E-41 double:2.0443E-319;
    L_0x0029:
        r3 = r3 + r4;
        goto L_0x002f;
    L_0x002b:
        r4 = 42657; // 0xa6a1 float:5.9775E-41 double:2.10754E-319;
        goto L_0x0029;
    L_0x002f:
        r4 = r3 >> 8;
        r4 = (byte) r4;
        r1[r2] = r4;
        r4 = r2 + 1;
        r3 = (byte) r3;
        r1[r4] = r3;
        r2 = r2 + r0;
        r7 = r7 + -1;
        goto L_0x0013;
    L_0x003d:
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        r7 = "GB2312";	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        r5.<init>(r1, r7);	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        r6.append(r5);	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        return;
    L_0x0048:
        r5 = com.google.p173d.C5615f.m12347a();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.g.a.d.a(com.google.d.b.c, java.lang.StringBuilder, int):void");
    }

    private static void m5544a(com.google.p173d.p177b.C1967c r3, java.lang.StringBuilder r4, int r5, com.google.p173d.p177b.C1968d r6, java.util.Collection<byte[]> r7, java.util.Map<com.google.p173d.C2007e, ?> r8) {
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
        r0 = r5 << 3;
        r1 = r3.m5423a();
        if (r0 <= r1) goto L_0x000d;
    L_0x0008:
        r3 = com.google.p173d.C5615f.m12347a();
        throw r3;
    L_0x000d:
        r0 = new byte[r5];
        r1 = 0;
    L_0x0010:
        if (r1 >= r5) goto L_0x001e;
    L_0x0012:
        r2 = 8;
        r2 = r3.m5424a(r2);
        r2 = (byte) r2;
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L_0x0010;
    L_0x001e:
        if (r6 != 0) goto L_0x0025;
    L_0x0020:
        r3 = com.google.p173d.p177b.C1973l.m5431a(r0, r8);
        goto L_0x0029;
    L_0x0025:
        r3 = r6.name();
    L_0x0029:
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0035 }
        r5.<init>(r0, r3);	 Catch:{ UnsupportedEncodingException -> 0x0035 }
        r4.append(r5);	 Catch:{ UnsupportedEncodingException -> 0x0035 }
        r7.add(r0);
        return;
    L_0x0035:
        r3 = com.google.p173d.C5615f.m12347a();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.g.a.d.a(com.google.d.b.c, java.lang.StringBuilder, int, com.google.d.b.d, java.util.Collection, java.util.Map):void");
    }

    private static void m5545a(C1967c c1967c, StringBuilder stringBuilder, int i, boolean z) {
        while (i > 1) {
            if (c1967c.m5423a() < 11) {
                throw C5615f.m12347a();
            }
            int a = c1967c.m5424a(11);
            stringBuilder.append(C2029d.m5541a(a / 45));
            stringBuilder.append(C2029d.m5541a(a % 45));
            i -= 2;
        }
        if (i == 1) {
            if (c1967c.m5423a() < 6) {
                throw C5615f.m12347a();
            }
            stringBuilder.append(C2029d.m5541a(c1967c.m5424a(6)));
        }
        if (z) {
            for (int length = stringBuilder.length(); length < stringBuilder.length(); length++) {
                if (stringBuilder.charAt(length) == '%') {
                    if (length < stringBuilder.length() - 1) {
                        int i2 = length + 1;
                        if (stringBuilder.charAt(i2) == '%') {
                            stringBuilder.deleteCharAt(i2);
                        }
                    }
                    stringBuilder.setCharAt(length, '\u001d');
                }
            }
        }
    }

    private static void m5546b(com.google.p173d.p177b.C1967c r5, java.lang.StringBuilder r6, int r7) {
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
        r0 = r7 * 13;
        r1 = r5.m5423a();
        if (r0 <= r1) goto L_0x000d;
    L_0x0008:
        r5 = com.google.p173d.C5615f.m12347a();
        throw r5;
    L_0x000d:
        r0 = 2;
        r1 = r0 * r7;
        r1 = new byte[r1];
        r2 = 0;
    L_0x0013:
        if (r7 <= 0) goto L_0x003d;
    L_0x0015:
        r3 = 13;
        r3 = r5.m5424a(r3);
        r4 = r3 / 192;
        r4 = r4 << 8;
        r3 = r3 % 192;
        r3 = r3 | r4;
        r4 = 7936; // 0x1f00 float:1.1121E-41 double:3.921E-320;
        if (r3 >= r4) goto L_0x002b;
    L_0x0026:
        r4 = 33088; // 0x8140 float:4.6366E-41 double:1.63476E-319;
    L_0x0029:
        r3 = r3 + r4;
        goto L_0x002f;
    L_0x002b:
        r4 = 49472; // 0xc140 float:6.9325E-41 double:2.44424E-319;
        goto L_0x0029;
    L_0x002f:
        r4 = r3 >> 8;
        r4 = (byte) r4;
        r1[r2] = r4;
        r4 = r2 + 1;
        r3 = (byte) r3;
        r1[r4] = r3;
        r2 = r2 + r0;
        r7 = r7 + -1;
        goto L_0x0013;
    L_0x003d:
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        r7 = "SJIS";	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        r5.<init>(r1, r7);	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        r6.append(r5);	 Catch:{ UnsupportedEncodingException -> 0x0048 }
        return;
    L_0x0048:
        r5 = com.google.p173d.C5615f.m12347a();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.g.a.d.b(com.google.d.b.c, java.lang.StringBuilder, int):void");
    }

    private static void m5547c(C1967c c1967c, StringBuilder stringBuilder, int i) {
        while (i >= 3) {
            if (c1967c.m5423a() < 10) {
                throw C5615f.m12347a();
            }
            int a = c1967c.m5424a(10);
            if (a >= IjkMediaCodecInfo.RANK_MAX) {
                throw C5615f.m12347a();
            }
            stringBuilder.append(C2029d.m5541a(a / 100));
            stringBuilder.append(C2029d.m5541a((a / 10) % 10));
            stringBuilder.append(C2029d.m5541a(a % 10));
            i -= 3;
        }
        int a2;
        if (i != 2) {
            if (i == 1) {
                if (c1967c.m5423a() < 4) {
                    throw C5615f.m12347a();
                }
                a2 = c1967c.m5424a(4);
                if (a2 >= 10) {
                    throw C5615f.m12347a();
                }
                stringBuilder.append(C2029d.m5541a(a2));
            }
        } else if (c1967c.m5423a() < 7) {
            throw C5615f.m12347a();
        } else {
            a2 = c1967c.m5424a(7);
            if (a2 >= 100) {
                throw C5615f.m12347a();
            }
            stringBuilder.append(C2029d.m5541a(a2 / 10));
            stringBuilder.append(C2029d.m5541a(a2 % 10));
        }
    }
}
