package com.google.p173d.p189f.p190a;

import com.google.p173d.C5615f;
import com.google.p173d.p189f.C2025c;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IMediaPlayer;

final class C2017e {
    private static final char[] f6771a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] f6772b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final Charset f6773c = Charset.forName("ISO-8859-1");
    private static final BigInteger[] f6774d;

    static /* synthetic */ class C20151 {
        static final /* synthetic */ int[] f6763a = new int[C2016a.m5507a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = com.google.p173d.p189f.p190a.C2017e.C2016a.m5507a();
            r0 = r0.length;
            r0 = new int[r0];
            f6763a = r0;
            r0 = 1;
            r1 = f6763a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6764a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f6763a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6765b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f6763a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6766c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f6763a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6767d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f6763a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6768e;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r3 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            r1 = f6763a;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6769f;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r0 = 6;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.a.e.1.<clinit>():void");
        }
    }

    private enum C2016a {
        ;
        
        public static final int f6764a = 1;
        public static final int f6765b = 2;
        public static final int f6766c = 3;
        public static final int f6767d = 4;
        public static final int f6768e = 5;
        public static final int f6769f = 6;

        static {
            f6770g = new int[]{f6764a, f6765b, f6766c, f6767d, f6768e, f6769f};
        }

        public static int[] m5507a() {
            return (int[]) f6770g.clone();
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f6774d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f6774d[1] = valueOf;
        for (int i = 2; i < f6774d.length; i++) {
            f6774d[i] = f6774d[i - 1].multiply(valueOf);
        }
    }

    private static int m5508a(int i, int[] iArr, Charset charset, int i2, StringBuilder stringBuilder) {
        int i3;
        int i4 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 922;
        int i6 = 923;
        int i7 = 928;
        int i8 = IMediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT;
        long j = 900;
        int i9;
        int i10;
        if (i4 == 901) {
            int i11;
            int[] iArr2 = new int[6];
            int i12 = i2 + 1;
            int i13 = iArr[i2];
            int i14 = 0;
            i3 = i12;
            long j2 = 0;
            i12 = i14;
            while (i3 < iArr[0] && r19 == 0) {
                i9 = i14 + 1;
                iArr2[i14] = i13;
                long j3 = (j2 * j) + ((long) i13);
                i10 = i3 + 1;
                i3 = iArr[i3];
                if (!(i3 == 900 || i3 == 901 || i3 == 902 || i3 == 924 || i3 == 928 || i3 == r6)) {
                    if (i3 != i5) {
                        if (i9 % 5 != 0 || i9 <= 0) {
                            i14 = i9;
                            j2 = j3;
                            i5 = 922;
                            i6 = 923;
                            i13 = i3;
                            i3 = i10;
                            j = 900;
                        } else {
                            i9 = 0;
                            while (i9 < 6) {
                                byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i9) * 8))));
                                i9++;
                                i5 = 922;
                                i6 = 923;
                            }
                            i13 = i3;
                            i3 = i10;
                            i14 = 0;
                            j = 900;
                            j2 = 0;
                        }
                    }
                }
                i5 = i10 - 1;
                i14 = i9;
                j2 = j3;
                i12 = 1;
                i6 = 923;
                j = 900;
                i13 = i3;
                i3 = i5;
                i5 = 922;
            }
            if (i3 != iArr[0] || i13 >= IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                iArr2[i14] = i13;
            }
            for (i9 = 0; i9 < i11; i9++) {
                byteArrayOutputStream.write((byte) iArr2[i9]);
            }
        } else if (i4 == 924) {
            i3 = i2;
            i4 = 0;
            i9 = i4;
            long j4 = 0;
            while (i3 < iArr[0] && r0 == 0) {
                Object obj;
                Object obj2;
                i10 = i3 + 1;
                i3 = iArr[i3];
                if (i3 < IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR) {
                    i9++;
                    i3 = i10;
                    j4 = (j4 * 900) + ((long) i3);
                    obj = 924;
                } else {
                    if (i3 == IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR || i3 == IMediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE || i3 == r8) {
                        obj = 924;
                    } else {
                        obj = 924;
                        if (!(i3 == 924 || i3 == r7)) {
                            if (i3 != 923) {
                                if (i3 == 922) {
                                    i3 = i10 - 1;
                                    i4 = 1;
                                } else {
                                    i3 = i10;
                                }
                            }
                            i3 = i10 - 1;
                            i4 = 1;
                        }
                    }
                    i3 = i10 - 1;
                    i4 = 1;
                }
                if (i9 % 5 != 0 || i9 <= 0) {
                    obj2 = 6;
                } else {
                    obj2 = 6;
                    for (i9 = 0; i9 < 6; i9++) {
                        byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i9) * 8))));
                    }
                    i9 = 0;
                    j4 = 0;
                }
                Object obj3 = obj2;
                Object obj4 = obj;
                i7 = 928;
                i8 = IMediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT;
            }
        } else {
            i3 = i2;
        }
        stringBuilder.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    private static int m5509a(int[] iArr, int i, C2025c c2025c) {
        if (i + 2 > iArr[0]) {
            throw C5615f.m12347a();
        }
        int[] iArr2 = new int[2];
        int i2 = i;
        i = 0;
        while (i < 2) {
            iArr2[i] = iArr[i2];
            i++;
            i2++;
        }
        c2025c.f6792a = Integer.parseInt(C2017e.m5512a(iArr2, 2));
        StringBuilder stringBuilder = new StringBuilder();
        int a = C2017e.m5510a(iArr, i2, stringBuilder);
        c2025c.f6793b = stringBuilder.toString();
        if (iArr[a] == 923) {
            a++;
            int[] iArr3 = new int[(iArr[0] - a)];
            int i3 = 0;
            int i4 = i3;
            while (a < iArr[0] && r2 == 0) {
                int i5 = a + 1;
                a = iArr[a];
                if (a < 900) {
                    int i6 = i4 + 1;
                    iArr3[i4] = a;
                    a = i5;
                    i4 = i6;
                } else if (a != 922) {
                    throw C5615f.m12347a();
                } else {
                    c2025c.f6795d = true;
                    a = i5 + 1;
                    i3 = true;
                }
            }
            c2025c.f6794c = Arrays.copyOf(iArr3, i4);
            return a;
        }
        if (iArr[a] == 922) {
            c2025c.f6795d = true;
            a++;
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m5510a(int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
        r2 = r19;
        r3 = 0;
        r4 = r17[r3];
        r4 = r4 - r18;
        r5 = 1;
        r4 = r4 << r5;
        r4 = new int[r4];
        r6 = r17[r3];
        r6 = r6 - r18;
        r6 = r6 << r5;
        r6 = new int[r6];
        r1 = r18;
        r7 = r3;
        r8 = r7;
    L_0x0016:
        r9 = r17[r3];
        r10 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        r11 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r1 >= r9) goto L_0x0056;
    L_0x001e:
        if (r7 != 0) goto L_0x0056;
    L_0x0020:
        r9 = r1 + 1;
        r1 = r17[r1];
        if (r1 >= r11) goto L_0x0034;
    L_0x0026:
        r10 = r1 / 30;
        r4[r8] = r10;
        r10 = r8 + 1;
        r1 = r1 % 30;
        r4[r10] = r1;
        r8 = r8 + 2;
    L_0x0032:
        r1 = r9;
        goto L_0x0016;
    L_0x0034:
        if (r1 == r10) goto L_0x004b;
    L_0x0036:
        r10 = 928; // 0x3a0 float:1.3E-42 double:4.585E-321;
        if (r1 == r10) goto L_0x0047;
    L_0x003a:
        switch(r1) {
            case 900: goto L_0x0041;
            case 901: goto L_0x0047;
            case 902: goto L_0x0047;
            default: goto L_0x003d;
        };
    L_0x003d:
        switch(r1) {
            case 922: goto L_0x0047;
            case 923: goto L_0x0047;
            case 924: goto L_0x0047;
            default: goto L_0x0040;
        };
    L_0x0040:
        goto L_0x0032;
    L_0x0041:
        r1 = r8 + 1;
        r4[r8] = r11;
        r8 = r1;
        goto L_0x0032;
    L_0x0047:
        r1 = r9 + -1;
        r7 = r5;
        goto L_0x0016;
    L_0x004b:
        r4[r8] = r10;
        r1 = r9 + 1;
        r9 = r17[r9];
        r6[r8] = r9;
        r8 = r8 + 1;
        goto L_0x0016;
    L_0x0056:
        r0 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6764a;
        r5 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6764a;
        r7 = r5;
        r5 = r0;
        r0 = r3;
    L_0x005d:
        if (r0 >= r8) goto L_0x0125;
    L_0x005f:
        r9 = r4[r0];
        r12 = com.google.p173d.p189f.p190a.C2017e.C20151.f6763a;
        r13 = r5 + -1;
        r12 = r12[r13];
        r13 = 28;
        r14 = 27;
        r3 = 26;
        r15 = 29;
        switch(r12) {
            case 1: goto L_0x00f8;
            case 2: goto L_0x00dc;
            case 3: goto L_0x00b7;
            case 4: goto L_0x009d;
            case 5: goto L_0x008a;
            case 6: goto L_0x0074;
            default: goto L_0x0072;
        };
    L_0x0072:
        goto L_0x011a;
    L_0x0074:
        if (r9 >= r15) goto L_0x007b;
    L_0x0076:
        r3 = f6771a;
        r3 = r3[r9];
        goto L_0x008f;
    L_0x007b:
        if (r9 != r15) goto L_0x007e;
    L_0x007d:
        goto L_0x00a7;
    L_0x007e:
        if (r9 != r10) goto L_0x0087;
    L_0x0080:
        r3 = r6[r0];
        r3 = (char) r3;
        r2.append(r3);
        goto L_0x009a;
    L_0x0087:
        if (r9 != r11) goto L_0x009a;
    L_0x0089:
        goto L_0x00a7;
    L_0x008a:
        if (r9 >= r3) goto L_0x0092;
    L_0x008c:
        r9 = r9 + 65;
        r3 = (char) r9;
    L_0x008f:
        r5 = r7;
        goto L_0x011b;
    L_0x0092:
        if (r9 != r3) goto L_0x0097;
    L_0x0094:
        r5 = r7;
        goto L_0x0100;
    L_0x0097:
        if (r9 != r11) goto L_0x009a;
    L_0x0099:
        goto L_0x00a7;
    L_0x009a:
        r5 = r7;
        goto L_0x011a;
    L_0x009d:
        if (r9 >= r15) goto L_0x00a5;
    L_0x009f:
        r3 = f6771a;
        r3 = r3[r9];
        goto L_0x011b;
    L_0x00a5:
        if (r9 != r15) goto L_0x00aa;
    L_0x00a7:
        r3 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6764a;
        goto L_0x00c5;
    L_0x00aa:
        if (r9 != r10) goto L_0x00b4;
    L_0x00ac:
        r3 = r6[r0];
    L_0x00ae:
        r3 = (char) r3;
        r2.append(r3);
        goto L_0x011a;
    L_0x00b4:
        if (r9 != r11) goto L_0x011a;
    L_0x00b6:
        goto L_0x00a7;
    L_0x00b7:
        r12 = 25;
        if (r9 >= r12) goto L_0x00c1;
    L_0x00bb:
        r3 = f6772b;
        r3 = r3[r9];
        goto L_0x011b;
    L_0x00c1:
        if (r9 != r12) goto L_0x00c8;
    L_0x00c3:
        r3 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6767d;
    L_0x00c5:
        r5 = r3;
        goto L_0x011a;
    L_0x00c8:
        if (r9 != r3) goto L_0x00cb;
    L_0x00ca:
        goto L_0x0100;
    L_0x00cb:
        if (r9 != r14) goto L_0x00ce;
    L_0x00cd:
        goto L_0x0105;
    L_0x00ce:
        if (r9 != r13) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00a7;
    L_0x00d1:
        if (r9 != r15) goto L_0x00d4;
    L_0x00d3:
        goto L_0x010f;
    L_0x00d4:
        if (r9 != r10) goto L_0x00d9;
    L_0x00d6:
        r3 = r6[r0];
        goto L_0x00ae;
    L_0x00d9:
        if (r9 != r11) goto L_0x011a;
    L_0x00db:
        goto L_0x00a7;
    L_0x00dc:
        if (r9 >= r3) goto L_0x00e1;
    L_0x00de:
        r9 = r9 + 97;
        goto L_0x00fc;
    L_0x00e1:
        if (r9 != r3) goto L_0x00e4;
    L_0x00e3:
        goto L_0x0100;
    L_0x00e4:
        if (r9 != r14) goto L_0x00ea;
    L_0x00e6:
        r3 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6768e;
    L_0x00e8:
        r7 = r5;
        goto L_0x00c5;
    L_0x00ea:
        if (r9 != r13) goto L_0x00ed;
    L_0x00ec:
        goto L_0x010a;
    L_0x00ed:
        if (r9 != r15) goto L_0x00f0;
    L_0x00ef:
        goto L_0x010f;
    L_0x00f0:
        if (r9 != r10) goto L_0x00f5;
    L_0x00f2:
        r3 = r6[r0];
        goto L_0x00ae;
    L_0x00f5:
        if (r9 != r11) goto L_0x011a;
    L_0x00f7:
        goto L_0x00a7;
    L_0x00f8:
        if (r9 >= r3) goto L_0x00fe;
    L_0x00fa:
        r9 = r9 + 65;
    L_0x00fc:
        r3 = (char) r9;
        goto L_0x011b;
    L_0x00fe:
        if (r9 != r3) goto L_0x0103;
    L_0x0100:
        r3 = 32;
        goto L_0x011b;
    L_0x0103:
        if (r9 != r14) goto L_0x0108;
    L_0x0105:
        r3 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6765b;
        goto L_0x00c5;
    L_0x0108:
        if (r9 != r13) goto L_0x010d;
    L_0x010a:
        r3 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6766c;
        goto L_0x00c5;
    L_0x010d:
        if (r9 != r15) goto L_0x0112;
    L_0x010f:
        r3 = com.google.p173d.p189f.p190a.C2017e.C2016a.f6769f;
        goto L_0x00e8;
    L_0x0112:
        if (r9 != r10) goto L_0x0117;
    L_0x0114:
        r3 = r6[r0];
        goto L_0x00ae;
    L_0x0117:
        if (r9 != r11) goto L_0x011a;
    L_0x0119:
        goto L_0x00a7;
    L_0x011a:
        r3 = 0;
    L_0x011b:
        if (r3 == 0) goto L_0x0120;
    L_0x011d:
        r2.append(r3);
    L_0x0120:
        r0 = r0 + 1;
        r3 = 0;
        goto L_0x005d;
    L_0x0125:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.a.e.a(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.p173d.p177b.C1969e m5511a(int[] r7, java.lang.String r8) {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = 2;
        r2 = 1;
        r3 = r7.length;
        r3 = r3 << r2;
        r0.<init>(r3);
        r3 = f6773c;
        r2 = r7[r2];
        r4 = new com.google.d.f.c;
        r4.<init>();
    L_0x0012:
        r5 = 0;
        r5 = r7[r5];
        if (r1 >= r5) goto L_0x006d;
    L_0x0017:
        r5 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r2 == r5) goto L_0x0054;
    L_0x001b:
        switch(r2) {
            case 900: goto L_0x0023;
            case 901: goto L_0x004f;
            case 902: goto L_0x004a;
            default: goto L_0x001e;
        };
    L_0x001e:
        switch(r2) {
            case 922: goto L_0x0045;
            case 923: goto L_0x0045;
            case 924: goto L_0x004f;
            case 925: goto L_0x0042;
            case 926: goto L_0x003f;
            case 927: goto L_0x002d;
            case 928: goto L_0x0028;
            default: goto L_0x0021;
        };
    L_0x0021:
        r1 = r1 + -1;
    L_0x0023:
        r1 = com.google.p173d.p189f.p190a.C2017e.m5510a(r7, r1, r0);
        goto L_0x005d;
    L_0x0028:
        r1 = com.google.p173d.p189f.p190a.C2017e.m5509a(r7, r1, r4);
        goto L_0x005d;
    L_0x002d:
        r2 = r1 + 1;
        r1 = r7[r1];
        r1 = com.google.p173d.p177b.C1968d.m5425a(r1);
        r1 = r1.name();
        r1 = java.nio.charset.Charset.forName(r1);
        r3 = r1;
        goto L_0x005c;
    L_0x003f:
        r1 = r1 + 2;
        goto L_0x005d;
    L_0x0042:
        r1 = r1 + 1;
        goto L_0x005d;
    L_0x0045:
        r7 = com.google.p173d.C5615f.m12347a();
        throw r7;
    L_0x004a:
        r1 = com.google.p173d.p189f.p190a.C2017e.m5513b(r7, r1, r0);
        goto L_0x005d;
    L_0x004f:
        r1 = com.google.p173d.p189f.p190a.C2017e.m5508a(r2, r7, r3, r1, r0);
        goto L_0x005d;
    L_0x0054:
        r2 = r1 + 1;
        r1 = r7[r1];
        r1 = (char) r1;
        r0.append(r1);
    L_0x005c:
        r1 = r2;
    L_0x005d:
        r2 = r7.length;
        if (r1 >= r2) goto L_0x0068;
    L_0x0060:
        r2 = r1 + 1;
        r1 = r7[r1];
        r6 = r2;
        r2 = r1;
        r1 = r6;
        goto L_0x0012;
    L_0x0068:
        r7 = com.google.p173d.C5615f.m12347a();
        throw r7;
    L_0x006d:
        r7 = r0.length();
        if (r7 != 0) goto L_0x0078;
    L_0x0073:
        r7 = com.google.p173d.C5615f.m12347a();
        throw r7;
    L_0x0078:
        r7 = new com.google.d.b.e;
        r0 = r0.toString();
        r1 = 0;
        r7.<init>(r1, r0, r1, r8);
        r7.f6619h = r4;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.a.e.a(int[], java.lang.String):com.google.d.b.e");
    }

    private static String m5512a(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f6774d[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C5615f.m12347a();
    }

    private static int m5513b(int[] iArr, int i, StringBuilder stringBuilder) {
        int[] iArr2 = new int[15];
        int i2 = 0;
        int i3 = i2;
        while (i < iArr[0] && r2 == 0) {
            int i4 = i + 1;
            i = iArr[i];
            if (i4 == iArr[0]) {
                i2 = 1;
            }
            if (i < 900) {
                iArr2[i3] = i;
                i3++;
            } else if (i == 900 || i == 901 || i == 924 || i == 928 || i == 923 || i == 922) {
                i4--;
                i2 = 1;
            }
            if ((i3 % 15 == 0 || i == 902 || r2 != 0) && i3 > 0) {
                stringBuilder.append(C2017e.m5512a(iArr2, i3));
                i3 = 0;
            }
            i = i4;
        }
        return i;
    }
}
