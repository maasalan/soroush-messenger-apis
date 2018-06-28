package com.google.p173d.p185e;

final class C2006o {
    private static final int[] f6718a = new int[]{1, 1, 2};
    private final C2004m f6719b = new C2004m();
    private final C2005n f6720c = new C2005n();

    C2006o() {
    }

    final com.google.p173d.C2047n m5483a(int r19, com.google.p173d.p177b.C1961a r20, int r21) {
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
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = f6718a;
        r4 = 0;
        r5 = r21;
        r3 = com.google.p173d.p185e.C6605p.m16927a(r2, r5, r4, r3);
        r5 = r0.f6720c;	 Catch:{ m -> 0x0170 }
        r6 = r5.f6717c;	 Catch:{ m -> 0x0170 }
        r6.setLength(r4);	 Catch:{ m -> 0x0170 }
        r5 = r5.f6716b;	 Catch:{ m -> 0x0170 }
        r5[r4] = r4;	 Catch:{ m -> 0x0170 }
        r7 = 1;	 Catch:{ m -> 0x0170 }
        r5[r7] = r4;	 Catch:{ m -> 0x0170 }
        r8 = 2;	 Catch:{ m -> 0x0170 }
        r5[r8] = r4;	 Catch:{ m -> 0x0170 }
        r9 = 3;	 Catch:{ m -> 0x0170 }
        r5[r9] = r4;	 Catch:{ m -> 0x0170 }
        r10 = r2.f6554b;	 Catch:{ m -> 0x0170 }
        r11 = r3[r7];	 Catch:{ m -> 0x0170 }
        r13 = r4;	 Catch:{ m -> 0x0170 }
        r12 = r11;	 Catch:{ m -> 0x0170 }
        r11 = r13;	 Catch:{ m -> 0x0170 }
    L_0x002a:
        r14 = 5;	 Catch:{ m -> 0x0170 }
        r15 = 48;	 Catch:{ m -> 0x0170 }
        r8 = 10;	 Catch:{ m -> 0x0170 }
        if (r11 >= r14) goto L_0x0069;	 Catch:{ m -> 0x0170 }
    L_0x0031:
        if (r12 >= r10) goto L_0x0069;	 Catch:{ m -> 0x0170 }
    L_0x0033:
        r14 = com.google.p173d.p185e.C6605p.f18843f;	 Catch:{ m -> 0x0170 }
        r14 = com.google.p173d.p185e.C6605p.m16925a(r2, r5, r12, r14);	 Catch:{ m -> 0x0170 }
        r16 = r14 % 10;	 Catch:{ m -> 0x0170 }
        r15 = r15 + r16;	 Catch:{ m -> 0x0170 }
        r15 = (char) r15;	 Catch:{ m -> 0x0170 }
        r6.append(r15);	 Catch:{ m -> 0x0170 }
        r15 = r5.length;	 Catch:{ m -> 0x0170 }
        r17 = r12;	 Catch:{ m -> 0x0170 }
        r12 = r4;	 Catch:{ m -> 0x0170 }
        r4 = r17;	 Catch:{ m -> 0x0170 }
    L_0x0047:
        if (r12 >= r15) goto L_0x0050;	 Catch:{ m -> 0x0170 }
    L_0x0049:
        r16 = r5[r12];	 Catch:{ m -> 0x0170 }
        r4 = r4 + r16;	 Catch:{ m -> 0x0170 }
        r12 = r12 + 1;	 Catch:{ m -> 0x0170 }
        goto L_0x0047;	 Catch:{ m -> 0x0170 }
    L_0x0050:
        r12 = 4;	 Catch:{ m -> 0x0170 }
        if (r14 < r8) goto L_0x0059;	 Catch:{ m -> 0x0170 }
    L_0x0053:
        r8 = 4 - r11;	 Catch:{ m -> 0x0170 }
        r8 = r7 << r8;	 Catch:{ m -> 0x0170 }
        r8 = r8 | r13;	 Catch:{ m -> 0x0170 }
        r13 = r8;	 Catch:{ m -> 0x0170 }
    L_0x0059:
        if (r11 == r12) goto L_0x0063;	 Catch:{ m -> 0x0170 }
    L_0x005b:
        r4 = r2.m5398c(r4);	 Catch:{ m -> 0x0170 }
        r4 = r2.m5399d(r4);	 Catch:{ m -> 0x0170 }
    L_0x0063:
        r12 = r4;	 Catch:{ m -> 0x0170 }
        r11 = r11 + 1;	 Catch:{ m -> 0x0170 }
        r4 = 0;	 Catch:{ m -> 0x0170 }
        r8 = 2;	 Catch:{ m -> 0x0170 }
        goto L_0x002a;	 Catch:{ m -> 0x0170 }
    L_0x0069:
        r4 = r6.length();	 Catch:{ m -> 0x0170 }
        if (r4 == r14) goto L_0x0074;	 Catch:{ m -> 0x0170 }
    L_0x006f:
        r4 = com.google.p173d.C5629j.m12369a();	 Catch:{ m -> 0x0170 }
        throw r4;	 Catch:{ m -> 0x0170 }
    L_0x0074:
        r4 = 0;	 Catch:{ m -> 0x0170 }
    L_0x0075:
        if (r4 >= r8) goto L_0x016b;	 Catch:{ m -> 0x0170 }
    L_0x0077:
        r5 = com.google.p173d.p185e.C2005n.f6715a;	 Catch:{ m -> 0x0170 }
        r5 = r5[r4];	 Catch:{ m -> 0x0170 }
        if (r13 != r5) goto L_0x0165;	 Catch:{ m -> 0x0170 }
    L_0x007d:
        r5 = r6.toString();	 Catch:{ m -> 0x0170 }
        r10 = r5.length();	 Catch:{ m -> 0x0170 }
        r11 = r10 + -2;	 Catch:{ m -> 0x0170 }
        r13 = 0;	 Catch:{ m -> 0x0170 }
    L_0x0088:
        if (r11 < 0) goto L_0x0095;	 Catch:{ m -> 0x0170 }
    L_0x008a:
        r16 = r5.charAt(r11);	 Catch:{ m -> 0x0170 }
        r16 = r16 + -48;	 Catch:{ m -> 0x0170 }
        r13 = r13 + r16;	 Catch:{ m -> 0x0170 }
        r11 = r11 + -2;	 Catch:{ m -> 0x0170 }
        goto L_0x0088;	 Catch:{ m -> 0x0170 }
    L_0x0095:
        r13 = r13 * r9;	 Catch:{ m -> 0x0170 }
        r10 = r10 - r7;	 Catch:{ m -> 0x0170 }
    L_0x0097:
        if (r10 < 0) goto L_0x00a2;	 Catch:{ m -> 0x0170 }
    L_0x0099:
        r11 = r5.charAt(r10);	 Catch:{ m -> 0x0170 }
        r11 = r11 - r15;	 Catch:{ m -> 0x0170 }
        r13 = r13 + r11;	 Catch:{ m -> 0x0170 }
        r10 = r10 + -2;	 Catch:{ m -> 0x0170 }
        goto L_0x0097;	 Catch:{ m -> 0x0170 }
    L_0x00a2:
        r13 = r13 * r9;	 Catch:{ m -> 0x0170 }
        r13 = r13 % r8;	 Catch:{ m -> 0x0170 }
        if (r13 == r4) goto L_0x00ab;	 Catch:{ m -> 0x0170 }
    L_0x00a6:
        r4 = com.google.p173d.C5629j.m12369a();	 Catch:{ m -> 0x0170 }
        throw r4;	 Catch:{ m -> 0x0170 }
    L_0x00ab:
        r4 = r6.toString();	 Catch:{ m -> 0x0170 }
        r5 = r4.length();	 Catch:{ m -> 0x0170 }
        r6 = 0;	 Catch:{ m -> 0x0170 }
        if (r5 == r14) goto L_0x00b9;	 Catch:{ m -> 0x0170 }
    L_0x00b6:
        r8 = r6;	 Catch:{ m -> 0x0170 }
        goto L_0x013b;	 Catch:{ m -> 0x0170 }
    L_0x00b9:
        r5 = 0;	 Catch:{ m -> 0x0170 }
        r9 = r4.charAt(r5);	 Catch:{ m -> 0x0170 }
        if (r9 == r15) goto L_0x00ee;	 Catch:{ m -> 0x0170 }
    L_0x00c0:
        r5 = 53;	 Catch:{ m -> 0x0170 }
        if (r9 == r5) goto L_0x00eb;	 Catch:{ m -> 0x0170 }
    L_0x00c4:
        r5 = 57;	 Catch:{ m -> 0x0170 }
        if (r9 == r5) goto L_0x00cb;	 Catch:{ m -> 0x0170 }
    L_0x00c8:
        r5 = "";	 Catch:{ m -> 0x0170 }
        goto L_0x00f0;	 Catch:{ m -> 0x0170 }
    L_0x00cb:
        r5 = "90000";	 Catch:{ m -> 0x0170 }
        r5 = r5.equals(r4);	 Catch:{ m -> 0x0170 }
        if (r5 == 0) goto L_0x00d5;	 Catch:{ m -> 0x0170 }
    L_0x00d3:
        r5 = r6;	 Catch:{ m -> 0x0170 }
        goto L_0x012c;	 Catch:{ m -> 0x0170 }
    L_0x00d5:
        r5 = "99991";	 Catch:{ m -> 0x0170 }
        r5 = r5.equals(r4);	 Catch:{ m -> 0x0170 }
        if (r5 == 0) goto L_0x00e0;	 Catch:{ m -> 0x0170 }
    L_0x00dd:
        r5 = "0.00";	 Catch:{ m -> 0x0170 }
        goto L_0x012c;	 Catch:{ m -> 0x0170 }
    L_0x00e0:
        r5 = "99990";	 Catch:{ m -> 0x0170 }
        r5 = r5.equals(r4);	 Catch:{ m -> 0x0170 }
        if (r5 == 0) goto L_0x00c8;	 Catch:{ m -> 0x0170 }
    L_0x00e8:
        r5 = "Used";	 Catch:{ m -> 0x0170 }
        goto L_0x012c;	 Catch:{ m -> 0x0170 }
    L_0x00eb:
        r5 = "$";	 Catch:{ m -> 0x0170 }
        goto L_0x00f0;	 Catch:{ m -> 0x0170 }
    L_0x00ee:
        r5 = "£";	 Catch:{ m -> 0x0170 }
    L_0x00f0:
        r9 = r4.substring(r7);	 Catch:{ m -> 0x0170 }
        r9 = java.lang.Integer.parseInt(r9);	 Catch:{ m -> 0x0170 }
        r10 = r9 / 100;	 Catch:{ m -> 0x0170 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ m -> 0x0170 }
        r9 = r9 % 100;	 Catch:{ m -> 0x0170 }
        if (r9 >= r8) goto L_0x0111;	 Catch:{ m -> 0x0170 }
    L_0x0102:
        r8 = new java.lang.StringBuilder;	 Catch:{ m -> 0x0170 }
        r11 = "0";	 Catch:{ m -> 0x0170 }
        r8.<init>(r11);	 Catch:{ m -> 0x0170 }
        r8.append(r9);	 Catch:{ m -> 0x0170 }
        r8 = r8.toString();	 Catch:{ m -> 0x0170 }
        goto L_0x0115;	 Catch:{ m -> 0x0170 }
    L_0x0111:
        r8 = java.lang.String.valueOf(r9);	 Catch:{ m -> 0x0170 }
    L_0x0115:
        r9 = new java.lang.StringBuilder;	 Catch:{ m -> 0x0170 }
        r9.<init>();	 Catch:{ m -> 0x0170 }
        r9.append(r5);	 Catch:{ m -> 0x0170 }
        r9.append(r10);	 Catch:{ m -> 0x0170 }
        r5 = 46;	 Catch:{ m -> 0x0170 }
        r9.append(r5);	 Catch:{ m -> 0x0170 }
        r9.append(r8);	 Catch:{ m -> 0x0170 }
        r5 = r9.toString();	 Catch:{ m -> 0x0170 }
    L_0x012c:
        if (r5 != 0) goto L_0x012f;	 Catch:{ m -> 0x0170 }
    L_0x012e:
        goto L_0x00b6;	 Catch:{ m -> 0x0170 }
    L_0x012f:
        r8 = new java.util.EnumMap;	 Catch:{ m -> 0x0170 }
        r9 = com.google.p173d.C2048o.class;	 Catch:{ m -> 0x0170 }
        r8.<init>(r9);	 Catch:{ m -> 0x0170 }
        r9 = com.google.p173d.C2048o.SUGGESTED_PRICE;	 Catch:{ m -> 0x0170 }
        r8.put(r9, r5);	 Catch:{ m -> 0x0170 }
    L_0x013b:
        r5 = new com.google.d.n;	 Catch:{ m -> 0x0170 }
        r10 = 2;	 Catch:{ m -> 0x0170 }
        r9 = new com.google.p173d.C2049p[r10];	 Catch:{ m -> 0x0170 }
        r10 = new com.google.d.p;	 Catch:{ m -> 0x0170 }
        r11 = 0;	 Catch:{ m -> 0x0170 }
        r13 = r3[r11];	 Catch:{ m -> 0x0170 }
        r14 = r3[r7];	 Catch:{ m -> 0x0170 }
        r13 = r13 + r14;	 Catch:{ m -> 0x0170 }
        r13 = (float) r13;	 Catch:{ m -> 0x0170 }
        r14 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ m -> 0x0170 }
        r13 = r13 / r14;	 Catch:{ m -> 0x0170 }
        r14 = (float) r1;	 Catch:{ m -> 0x0170 }
        r10.<init>(r13, r14);	 Catch:{ m -> 0x0170 }
        r9[r11] = r10;	 Catch:{ m -> 0x0170 }
        r10 = new com.google.d.p;	 Catch:{ m -> 0x0170 }
        r11 = (float) r12;	 Catch:{ m -> 0x0170 }
        r10.<init>(r11, r14);	 Catch:{ m -> 0x0170 }
        r9[r7] = r10;	 Catch:{ m -> 0x0170 }
        r7 = com.google.p173d.C1958a.UPC_EAN_EXTENSION;	 Catch:{ m -> 0x0170 }
        r5.<init>(r4, r6, r9, r7);	 Catch:{ m -> 0x0170 }
        if (r8 == 0) goto L_0x0164;	 Catch:{ m -> 0x0170 }
    L_0x0161:
        r5.m5582a(r8);	 Catch:{ m -> 0x0170 }
    L_0x0164:
        return r5;	 Catch:{ m -> 0x0170 }
    L_0x0165:
        r10 = 2;	 Catch:{ m -> 0x0170 }
        r11 = 0;	 Catch:{ m -> 0x0170 }
        r4 = r4 + 1;	 Catch:{ m -> 0x0170 }
        goto L_0x0075;	 Catch:{ m -> 0x0170 }
    L_0x016b:
        r4 = com.google.p173d.C5629j.m12369a();	 Catch:{ m -> 0x0170 }
        throw r4;	 Catch:{ m -> 0x0170 }
    L_0x0170:
        r4 = r0.f6719b;
        r1 = r4.m5482a(r1, r2, r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.o.a(int, com.google.d.b.a, int):com.google.d.n");
    }
}
