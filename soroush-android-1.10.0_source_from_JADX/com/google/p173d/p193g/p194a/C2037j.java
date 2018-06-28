package com.google.p173d.p193g.p194a;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2037j {
    private static final int[] f6841e = new int[]{31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    private static final C2037j[] f6842f = C2037j.m5559b();
    final int f6843a;
    public final int[] f6844b;
    final C2036b[] f6845c;
    final int f6846d;

    public static final class C2035a {
        final int f6837a;
        final int f6838b;

        C2035a(int i, int i2) {
            this.f6837a = i;
            this.f6838b = i2;
        }
    }

    public static final class C2036b {
        final int f6839a;
        final C2035a[] f6840b;

        C2036b(int i, C2035a... c2035aArr) {
            this.f6839a = i;
            this.f6840b = c2035aArr;
        }
    }

    private C2037j(int i, int[] iArr, C2036b... c2036bArr) {
        this.f6843a = i;
        this.f6844b = iArr;
        this.f6845c = c2036bArr;
        i = 0;
        int i2 = c2036bArr[0].f6839a;
        C2035a[] c2035aArr = c2036bArr[0].f6840b;
        int length = c2035aArr.length;
        int i3 = 0;
        while (i < length) {
            C2035a c2035a = c2035aArr[i];
            i3 += c2035a.f6837a * (c2035a.f6838b + i2);
            i++;
        }
        this.f6846d = i3;
    }

    public static com.google.p173d.p193g.p194a.C2037j m5557a(int r2) {
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
        r0 = r2 % 4;
        r1 = 1;
        if (r0 == r1) goto L_0x000a;
    L_0x0005:
        r2 = com.google.p173d.C5615f.m12347a();
        throw r2;
    L_0x000a:
        r2 = r2 + -17;
        r2 = r2 / 4;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r2 = com.google.p173d.p193g.p194a.C2037j.m5558b(r2);	 Catch:{ IllegalArgumentException -> 0x0013 }
        return r2;
    L_0x0013:
        r2 = com.google.p173d.C5615f.m12347a();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.g.a.j.a(int):com.google.d.g.a.j");
    }

    public static C2037j m5558b(int i) {
        if (i > 0) {
            if (i <= 40) {
                return f6842f[i - 1];
            }
        }
        throw new IllegalArgumentException();
    }

    private static C2037j[] m5559b() {
        r0 = new C2037j[40];
        int[] iArr = new int[0];
        C2036b[] c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(7, new C2035a(1, 19));
        c2036bArr[1] = new C2036b(10, new C2035a(1, 16));
        c2036bArr[2] = new C2036b(13, new C2035a(1, 13));
        c2036bArr[3] = new C2036b(17, new C2035a(1, 9));
        r0[0] = new C2037j(1, iArr, c2036bArr);
        iArr = new int[]{6, 18};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(10, new C2035a(1, 34));
        c2036bArr[1] = new C2036b(16, new C2035a(1, 28));
        c2036bArr[2] = new C2036b(22, new C2035a(1, 22));
        c2036bArr[3] = new C2036b(28, new C2035a(1, 16));
        r0[1] = new C2037j(2, iArr, c2036bArr);
        iArr = new int[]{6, 22};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(15, new C2035a(1, 55));
        c2036bArr[1] = new C2036b(26, new C2035a(1, 44));
        c2036bArr[2] = new C2036b(18, new C2035a(2, 17));
        c2036bArr[3] = new C2036b(22, new C2035a(2, 13));
        r0[2] = new C2037j(3, iArr, c2036bArr);
        iArr = new int[]{6, 26};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(20, new C2035a(1, 80));
        c2036bArr[1] = new C2036b(18, new C2035a(2, 32));
        c2036bArr[2] = new C2036b(26, new C2035a(2, 24));
        c2036bArr[3] = new C2036b(16, new C2035a(4, 9));
        r0[3] = new C2037j(4, iArr, c2036bArr);
        iArr = new int[]{6, 30};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(26, new C2035a(1, 108));
        c2036bArr[1] = new C2036b(24, new C2035a(2, 43));
        c2036bArr[2] = new C2036b(18, new C2035a(2, 15), new C2035a(2, 16));
        c2036bArr[3] = new C2036b(22, new C2035a(2, 11), new C2035a(2, 12));
        r0[4] = new C2037j(5, iArr, c2036bArr);
        iArr = new int[]{6, 34};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(18, new C2035a(2, 68));
        c2036bArr[1] = new C2036b(16, new C2035a(4, 27));
        c2036bArr[2] = new C2036b(24, new C2035a(4, 19));
        c2036bArr[3] = new C2036b(28, new C2035a(4, 15));
        r0[5] = new C2037j(6, iArr, c2036bArr);
        iArr = new int[]{6, 22, 38};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(20, new C2035a(2, 78));
        c2036bArr[1] = new C2036b(18, new C2035a(4, 31));
        c2036bArr[2] = new C2036b(18, new C2035a(2, 14), new C2035a(4, 15));
        c2036bArr[3] = new C2036b(26, new C2035a(4, 13), new C2035a(1, 14));
        r0[6] = new C2037j(7, iArr, c2036bArr);
        iArr = new int[]{6, 24, 42};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(24, new C2035a(2, 97));
        c2036bArr[1] = new C2036b(22, new C2035a(2, 38), new C2035a(2, 39));
        c2036bArr[2] = new C2036b(22, new C2035a(4, 18), new C2035a(2, 19));
        c2036bArr[3] = new C2036b(26, new C2035a(4, 14), new C2035a(2, 15));
        r0[7] = new C2037j(8, iArr, c2036bArr);
        iArr = new int[]{6, 26, 46};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(30, new C2035a(2, 116));
        c2036bArr[1] = new C2036b(22, new C2035a(3, 36), new C2035a(2, 37));
        c2036bArr[2] = new C2036b(20, new C2035a(4, 16), new C2035a(4, 17));
        c2036bArr[3] = new C2036b(24, new C2035a(4, 12), new C2035a(4, 13));
        r0[8] = new C2037j(9, iArr, c2036bArr);
        iArr = new int[]{6, 28, 50};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(18, new C2035a(2, 68), new C2035a(2, 69));
        c2036bArr[1] = new C2036b(26, new C2035a(4, 43), new C2035a(1, 44));
        c2036bArr[2] = new C2036b(24, new C2035a(6, 19), new C2035a(2, 20));
        c2036bArr[3] = new C2036b(28, new C2035a(6, 15), new C2035a(2, 16));
        r0[9] = new C2037j(10, iArr, c2036bArr);
        iArr = new int[]{6, 30, 54};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(20, new C2035a(4, 81));
        c2036bArr[1] = new C2036b(30, new C2035a(1, 50), new C2035a(4, 51));
        c2036bArr[2] = new C2036b(28, new C2035a(4, 22), new C2035a(4, 23));
        c2036bArr[3] = new C2036b(24, new C2035a(3, 12), new C2035a(8, 13));
        r0[10] = new C2037j(11, iArr, c2036bArr);
        iArr = new int[]{6, 32, 58};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(24, new C2035a(2, 92), new C2035a(2, 93));
        c2036bArr[1] = new C2036b(22, new C2035a(6, 36), new C2035a(2, 37));
        c2036bArr[2] = new C2036b(26, new C2035a(4, 20), new C2035a(6, 21));
        c2036bArr[3] = new C2036b(28, new C2035a(7, 14), new C2035a(4, 15));
        r0[11] = new C2037j(12, iArr, c2036bArr);
        iArr = new int[]{6, 34, 62};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(26, new C2035a(4, 107));
        c2036bArr[1] = new C2036b(22, new C2035a(8, 37), new C2035a(1, 38));
        c2036bArr[2] = new C2036b(24, new C2035a(8, 20), new C2035a(4, 21));
        c2036bArr[3] = new C2036b(22, new C2035a(12, 11), new C2035a(4, 12));
        r0[12] = new C2037j(13, iArr, c2036bArr);
        iArr = new int[]{6, 26, 46, 66};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(30, new C2035a(3, 115), new C2035a(1, 116));
        c2036bArr[1] = new C2036b(24, new C2035a(4, 40), new C2035a(5, 41));
        c2036bArr[2] = new C2036b(20, new C2035a(11, 16), new C2035a(5, 17));
        c2036bArr[3] = new C2036b(24, new C2035a(11, 12), new C2035a(5, 13));
        r0[13] = new C2037j(14, iArr, c2036bArr);
        iArr = new int[]{6, 26, 48, 70};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(22, new C2035a(5, 87), new C2035a(1, 88));
        c2036bArr[1] = new C2036b(24, new C2035a(5, 41), new C2035a(5, 42));
        c2036bArr[2] = new C2036b(30, new C2035a(5, 24), new C2035a(7, 25));
        c2036bArr[3] = new C2036b(24, new C2035a(11, 12), new C2035a(7, 13));
        r0[14] = new C2037j(15, iArr, c2036bArr);
        iArr = new int[]{6, 26, 50, 74};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(24, new C2035a(5, 98), new C2035a(1, 99));
        c2036bArr[1] = new C2036b(28, new C2035a(7, 45), new C2035a(3, 46));
        c2036bArr[2] = new C2036b(24, new C2035a(15, 19), new C2035a(2, 20));
        c2036bArr[3] = new C2036b(30, new C2035a(3, 15), new C2035a(13, 16));
        r0[15] = new C2037j(16, iArr, c2036bArr);
        iArr = new int[]{6, 30, 54, 78};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(28, new C2035a(1, 107), new C2035a(5, 108));
        c2036bArr[1] = new C2036b(28, new C2035a(10, 46), new C2035a(1, 47));
        c2036bArr[2] = new C2036b(28, new C2035a(1, 22), new C2035a(15, 23));
        c2036bArr[3] = new C2036b(28, new C2035a(2, 14), new C2035a(17, 15));
        r0[16] = new C2037j(17, iArr, c2036bArr);
        iArr = new int[]{6, 30, 56, 82};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(30, new C2035a(5, 120), new C2035a(1, 121));
        c2036bArr[1] = new C2036b(26, new C2035a(9, 43), new C2035a(4, 44));
        c2036bArr[2] = new C2036b(28, new C2035a(17, 22), new C2035a(1, 23));
        c2036bArr[3] = new C2036b(28, new C2035a(2, 14), new C2035a(19, 15));
        r0[17] = new C2037j(18, iArr, c2036bArr);
        iArr = new int[]{6, 30, 58, 86};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(28, new C2035a(3, 113), new C2035a(4, 114));
        c2036bArr[1] = new C2036b(26, new C2035a(3, 44), new C2035a(11, 45));
        c2036bArr[2] = new C2036b(26, new C2035a(17, 21), new C2035a(4, 22));
        c2036bArr[3] = new C2036b(26, new C2035a(9, 13), new C2035a(16, 14));
        r0[18] = new C2037j(19, iArr, c2036bArr);
        iArr = new int[]{6, 34, 62, 90};
        c2036bArr = new C2036b[4];
        c2036bArr[0] = new C2036b(28, new C2035a(3, 107), new C2035a(5, 108));
        c2036bArr[1] = new C2036b(26, new C2035a(3, 41), new C2035a(13, 42));
        c2036bArr[2] = new C2036b(30, new C2035a(15, 24), new C2035a(5, 25));
        c2036bArr[3] = new C2036b(28, new C2035a(15, 15), new C2035a(10, 16));
        r0[19] = new C2037j(20, iArr, c2036bArr);
        int[] iArr2 = new int[]{6, 28, 50, 72, 94};
        r3 = new C2036b[4];
        r3[0] = new C2036b(28, new C2035a(4, 116), new C2035a(4, 117));
        r3[1] = new C2036b(26, new C2035a(17, 42));
        r3[2] = new C2036b(28, new C2035a(17, 22), new C2035a(6, 23));
        r3[3] = new C2036b(30, new C2035a(19, 16), new C2035a(6, 17));
        r0[20] = new C2037j(21, iArr2, r3);
        iArr2 = new int[]{6, 26, 50, 74, 98};
        r3 = new C2036b[4];
        r3[0] = new C2036b(28, new C2035a(2, 111), new C2035a(7, 112));
        r3[1] = new C2036b(28, new C2035a(17, 46));
        r3[2] = new C2036b(30, new C2035a(7, 24), new C2035a(16, 25));
        r3[3] = new C2036b(24, new C2035a(34, 13));
        r0[21] = new C2037j(22, iArr2, r3);
        iArr2 = new int[]{6, 30, 54, 78, 102};
        r6 = new C2036b[4];
        r6[0] = new C2036b(30, new C2035a(4, 121), new C2035a(5, IjkMediaMeta.FF_PROFILE_H264_HIGH_422));
        r6[1] = new C2036b(28, new C2035a(4, 47), new C2035a(14, 48));
        r6[2] = new C2036b(30, new C2035a(11, 24), new C2035a(14, 25));
        r6[3] = new C2036b(30, new C2035a(16, 15), new C2035a(14, 16));
        r0[22] = new C2037j(23, iArr2, r6);
        iArr2 = new int[]{6, 28, 54, 80, 106};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(6, 117), new C2035a(4, 118));
        r3[1] = new C2036b(28, new C2035a(6, 45), new C2035a(14, 46));
        r3[2] = new C2036b(30, new C2035a(11, 24), new C2035a(16, 25));
        r3[3] = new C2036b(30, new C2035a(30, 16), new C2035a(2, 17));
        r0[23] = new C2037j(24, iArr2, r3);
        iArr2 = new int[]{6, 32, 58, 84, 110};
        r3 = new C2036b[4];
        r3[0] = new C2036b(26, new C2035a(8, 106), new C2035a(4, 107));
        r3[1] = new C2036b(28, new C2035a(8, 47), new C2035a(13, 48));
        r3[2] = new C2036b(30, new C2035a(7, 24), new C2035a(22, 25));
        r3[3] = new C2036b(30, new C2035a(22, 15), new C2035a(13, 16));
        r0[24] = new C2037j(25, iArr2, r3);
        iArr2 = new int[]{6, 30, 58, 86, 114};
        r3 = new C2036b[4];
        r3[0] = new C2036b(28, new C2035a(10, 114), new C2035a(2, 115));
        r3[1] = new C2036b(28, new C2035a(19, 46), new C2035a(4, 47));
        r3[2] = new C2036b(28, new C2035a(28, 22), new C2035a(6, 23));
        r3[3] = new C2036b(30, new C2035a(33, 16), new C2035a(4, 17));
        r0[25] = new C2037j(26, iArr2, r3);
        iArr2 = new int[]{6, 34, 62, 90, 118};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(8, IjkMediaMeta.FF_PROFILE_H264_HIGH_422), new C2035a(4, 123));
        r3[1] = new C2036b(28, new C2035a(22, 45), new C2035a(3, 46));
        r3[2] = new C2036b(30, new C2035a(8, 23), new C2035a(26, 24));
        r3[3] = new C2036b(30, new C2035a(12, 15), new C2035a(28, 16));
        r0[26] = new C2037j(27, iArr2, r3);
        iArr2 = new int[]{6, 26, 50, 74, 98, IjkMediaMeta.FF_PROFILE_H264_HIGH_422};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(3, 117), new C2035a(10, 118));
        r3[1] = new C2036b(28, new C2035a(3, 45), new C2035a(23, 46));
        r3[2] = new C2036b(30, new C2035a(4, 24), new C2035a(31, 25));
        r3[3] = new C2036b(30, new C2035a(11, 15), new C2035a(31, 16));
        r0[27] = new C2037j(28, iArr2, r3);
        iArr2 = new int[]{6, 30, 54, 78, 102, 126};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(7, 116), new C2035a(7, 117));
        r3[1] = new C2036b(28, new C2035a(21, 45), new C2035a(7, 46));
        r3[2] = new C2036b(30, new C2035a(1, 23), new C2035a(37, 24));
        r3[3] = new C2036b(30, new C2035a(19, 15), new C2035a(26, 16));
        r0[28] = new C2037j(29, iArr2, r3);
        iArr2 = new int[]{6, 26, 52, 78, 104, 130};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(5, 115), new C2035a(10, 116));
        r3[1] = new C2036b(28, new C2035a(19, 47), new C2035a(10, 48));
        r3[2] = new C2036b(30, new C2035a(15, 24), new C2035a(25, 25));
        r3[3] = new C2036b(30, new C2035a(23, 15), new C2035a(25, 16));
        r0[29] = new C2037j(30, iArr2, r3);
        iArr2 = new int[]{6, 30, 56, 82, 108, 134};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(13, 115), new C2035a(3, 116));
        r3[1] = new C2036b(28, new C2035a(2, 46), new C2035a(29, 47));
        r3[2] = new C2036b(30, new C2035a(42, 24), new C2035a(1, 25));
        r3[3] = new C2036b(30, new C2035a(23, 15), new C2035a(28, 16));
        r0[30] = new C2037j(31, iArr2, r3);
        iArr2 = new int[]{6, 34, 60, 86, 112, 138};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(17, 115));
        r3[1] = new C2036b(28, new C2035a(10, 46), new C2035a(23, 47));
        r3[2] = new C2036b(30, new C2035a(10, 24), new C2035a(35, 25));
        r3[3] = new C2036b(30, new C2035a(19, 15), new C2035a(35, 16));
        r0[31] = new C2037j(32, iArr2, r3);
        iArr2 = new int[]{6, 30, 58, 86, 114, 142};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(17, 115), new C2035a(1, 116));
        r3[1] = new C2036b(28, new C2035a(14, 46), new C2035a(21, 47));
        r3[2] = new C2036b(30, new C2035a(29, 24), new C2035a(19, 25));
        r3[3] = new C2036b(30, new C2035a(11, 15), new C2035a(46, 16));
        r0[32] = new C2037j(33, iArr2, r3);
        iArr2 = new int[]{6, 34, 62, 90, 118, 146};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(13, 115), new C2035a(6, 116));
        r3[1] = new C2036b(28, new C2035a(14, 46), new C2035a(23, 47));
        r3[2] = new C2036b(30, new C2035a(44, 24), new C2035a(7, 25));
        r3[3] = new C2036b(30, new C2035a(59, 16), new C2035a(1, 17));
        r0[33] = new C2037j(34, iArr2, r3);
        iArr2 = new int[]{6, 30, 54, 78, 102, 126, 150};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(12, 121), new C2035a(7, IjkMediaMeta.FF_PROFILE_H264_HIGH_422));
        r3[1] = new C2036b(28, new C2035a(12, 47), new C2035a(26, 48));
        r3[2] = new C2036b(30, new C2035a(39, 24), new C2035a(14, 25));
        r3[3] = new C2036b(30, new C2035a(22, 15), new C2035a(41, 16));
        r0[34] = new C2037j(35, iArr2, r3);
        iArr2 = new int[]{6, 24, 50, 76, 102, 128, 154};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(6, 121), new C2035a(14, IjkMediaMeta.FF_PROFILE_H264_HIGH_422));
        r3[1] = new C2036b(28, new C2035a(6, 47), new C2035a(34, 48));
        r3[2] = new C2036b(30, new C2035a(46, 24), new C2035a(10, 25));
        r3[3] = new C2036b(30, new C2035a(2, 15), new C2035a(64, 16));
        r0[35] = new C2037j(36, iArr2, r3);
        iArr2 = new int[]{6, 28, 54, 80, 106, 132, 158};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(17, IjkMediaMeta.FF_PROFILE_H264_HIGH_422), new C2035a(4, 123));
        r3[1] = new C2036b(28, new C2035a(29, 46), new C2035a(14, 47));
        r3[2] = new C2036b(30, new C2035a(49, 24), new C2035a(10, 25));
        r3[3] = new C2036b(30, new C2035a(24, 15), new C2035a(46, 16));
        r0[36] = new C2037j(37, iArr2, r3);
        iArr2 = new int[]{6, 32, 58, 84, 110, 136, 162};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(4, IjkMediaMeta.FF_PROFILE_H264_HIGH_422), new C2035a(18, 123));
        r3[1] = new C2036b(28, new C2035a(13, 46), new C2035a(32, 47));
        r3[2] = new C2036b(30, new C2035a(48, 24), new C2035a(14, 25));
        r3[3] = new C2036b(30, new C2035a(42, 15), new C2035a(32, 16));
        r0[37] = new C2037j(38, iArr2, r3);
        iArr2 = new int[]{6, 26, 54, 82, 110, 138, 166};
        r3 = new C2036b[4];
        r3[0] = new C2036b(30, new C2035a(20, 117), new C2035a(4, 118));
        r3[1] = new C2036b(28, new C2035a(40, 47), new C2035a(7, 48));
        r3[2] = new C2036b(30, new C2035a(43, 24), new C2035a(22, 25));
        r3[3] = new C2036b(30, new C2035a(10, 15), new C2035a(67, 16));
        r0[38] = new C2037j(39, iArr2, r3);
        iArr = new int[]{6, 30, 58, 86, 114, 142, 170};
        r4 = new C2036b[4];
        r4[0] = new C2036b(30, new C2035a(19, 118), new C2035a(6, 119));
        r4[1] = new C2036b(28, new C2035a(18, 47), new C2035a(31, 48));
        r4[2] = new C2036b(30, new C2035a(34, 24), new C2035a(34, 25));
        r4[3] = new C2036b(30, new C2035a(20, 15), new C2035a(61, 16));
        r0[39] = new C2037j(40, iArr, r4);
        return r0;
    }

    static C2037j m5560c(int i) {
        int i2 = 0;
        int i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i4 = 0;
        while (i2 < f6841e.length) {
            int i5 = f6841e[i2];
            if (i5 == i) {
                return C2037j.m5558b(i2 + 7);
            }
            i5 = C2032g.m5552a(i, i5);
            if (i5 < i3) {
                i4 = i2 + 7;
                i3 = i5;
            }
            i2++;
        }
        return i3 <= 3 ? C2037j.m5558b(i4) : null;
    }

    public final int m5561a() {
        return 17 + (4 * this.f6843a);
    }

    public final String toString() {
        return String.valueOf(this.f6843a);
    }
}
