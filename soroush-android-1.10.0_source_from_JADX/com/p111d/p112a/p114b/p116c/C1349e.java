package com.p111d.p112a.p114b.p116c;

import com.p111d.p112a.p114b.p120g.C1369b;
import com.p111d.p112a.p114b.p120g.C1373i;
import com.p111d.p112a.p114b.p539a.C6464a;
import java.lang.ref.SoftReference;

public final class C1349e {
    protected static final ThreadLocal<SoftReference<C1349e>> f4197a = new ThreadLocal();
    private static final char[] f4198e = C1345a.m3186g();
    private static final byte[] f4199f = C1345a.m3187h();
    protected C1373i f4200b;
    protected C1369b f4201c;
    protected final char[] f4202d = new char[6];

    public C1349e() {
        this.f4202d[0] = '\\';
        this.f4202d[2] = '0';
        this.f4202d[3] = '0';
    }

    private static int m3215a(int i, int i2) {
        if (i2 >= C6464a.SURR2_FIRST) {
            if (i2 <= C6464a.SURR2_LAST) {
                return (65536 + ((i - C6464a.SURR1_FIRST) << 10)) + (i2 - C6464a.SURR2_FIRST);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Broken surrogate pair: first char 0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append(", second 0x");
        stringBuilder.append(Integer.toHexString(i2));
        stringBuilder.append("; illegal combination");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static C1349e m3216a() {
        SoftReference softReference = (SoftReference) f4197a.get();
        C1349e c1349e = softReference == null ? null : (C1349e) softReference.get();
        if (c1349e != null) {
            return c1349e;
        }
        c1349e = new C1349e();
        f4197a.set(new SoftReference(c1349e));
        return c1349e;
    }

    private static void m3217a(int i) {
        throw new IllegalArgumentException(C1355l.m3253a(i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final char[] m3218a(java.lang.String r13) {
        /*
        r12 = this;
        r0 = r12.f4200b;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = new com.d.a.b.g.i;
        r1 = 0;
        r0.<init>(r1);
        r12.f4200b = r0;
    L_0x000c:
        r1 = r0.m3341i();
        r2 = com.p111d.p112a.p114b.p116c.C1345a.m3185f();
        r3 = 0;
        r4 = r2.length;
        r5 = r13.length();
        r7 = r1;
        r1 = r3;
        r6 = r1;
    L_0x001d:
        if (r1 >= r5) goto L_0x008b;
    L_0x001f:
        r8 = r13.charAt(r1);
        if (r8 >= r4) goto L_0x0078;
    L_0x0025:
        r9 = r2[r8];
        if (r9 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0078;
    L_0x002a:
        r8 = r1 + 1;
        r1 = r13.charAt(r1);
        r9 = r2[r1];
        r10 = 1;
        if (r9 >= 0) goto L_0x004f;
    L_0x0035:
        r9 = r12.f4202d;
        r11 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r9[r10] = r11;
        r10 = f4198e;
        r11 = r1 >> 4;
        r10 = r10[r11];
        r11 = 4;
        r9[r11] = r10;
        r10 = 5;
        r11 = f4198e;
        r1 = r1 & 15;
        r1 = r11[r1];
        r9[r10] = r1;
        r1 = 6;
        goto L_0x0055;
    L_0x004f:
        r1 = r12.f4202d;
        r9 = (char) r9;
        r1[r10] = r9;
        r1 = 2;
    L_0x0055:
        r9 = r6 + r1;
        r10 = r7.length;
        if (r9 <= r10) goto L_0x0070;
    L_0x005a:
        r9 = r7.length;
        r9 = r9 - r6;
        if (r9 <= 0) goto L_0x0063;
    L_0x005e:
        r10 = r12.f4202d;
        java.lang.System.arraycopy(r10, r3, r7, r6, r9);
    L_0x0063:
        r7 = r0.m3342j();
        r6 = r1 - r9;
        r1 = r12.f4202d;
        java.lang.System.arraycopy(r1, r9, r7, r3, r6);
        r1 = r8;
        goto L_0x001d;
    L_0x0070:
        r10 = r12.f4202d;
        java.lang.System.arraycopy(r10, r3, r7, r6, r1);
        r1 = r8;
        r6 = r9;
        goto L_0x001d;
    L_0x0078:
        r9 = r7.length;
        if (r6 < r9) goto L_0x0080;
    L_0x007b:
        r7 = r0.m3342j();
        r6 = r3;
    L_0x0080:
        r9 = r6 + 1;
        r7[r6] = r8;
        r1 = r1 + 1;
        if (r1 >= r5) goto L_0x008a;
    L_0x0088:
        r6 = r9;
        goto L_0x001f;
    L_0x008a:
        r6 = r9;
    L_0x008b:
        r0.f4340i = r6;
        r13 = r0.m3339g();
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.e.a(java.lang.String):char[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] m3219b(java.lang.String r12) {
        /*
        r11 = this;
        r0 = r11.f4201c;
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x0005:
        r0 = new com.d.a.b.g.b;
        r0.<init>(r1);
        r11.f4201c = r0;
    L_0x000c:
        r2 = r12.length();
        r3 = r0.m3323c();
        r4 = r1;
        r5 = r3;
        r3 = r4;
    L_0x0017:
        if (r3 >= r2) goto L_0x0143;
    L_0x0019:
        r6 = com.p111d.p112a.p114b.p116c.C1345a.m3185f();
    L_0x001d:
        r7 = r12.charAt(r3);
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r7 > r8) goto L_0x0040;
    L_0x0025:
        r9 = r6[r7];
        if (r9 != 0) goto L_0x0040;
    L_0x0029:
        r8 = r5.length;
        if (r4 < r8) goto L_0x0032;
    L_0x002c:
        r4 = r0.m3324d();
        r5 = r4;
        r4 = r1;
    L_0x0032:
        r8 = r4 + 1;
        r7 = (byte) r7;
        r5[r4] = r7;
        r3 = r3 + 1;
        if (r3 >= r2) goto L_0x003d;
    L_0x003b:
        r4 = r8;
        goto L_0x001d;
    L_0x003d:
        r4 = r8;
        goto L_0x0143;
    L_0x0040:
        r7 = r5.length;
        if (r4 < r7) goto L_0x0048;
    L_0x0043:
        r5 = r0.m3324d();
        r4 = r1;
    L_0x0048:
        r7 = r3 + 1;
        r3 = r12.charAt(r3);
        if (r3 > r8) goto L_0x009e;
    L_0x0050:
        r5 = r6[r3];
        r0.f4326c = r4;
        r4 = 92;
        r0.m3319a(r4);
        if (r5 >= 0) goto L_0x0093;
    L_0x005b:
        r4 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r0.m3319a(r4);
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r3 <= r4) goto L_0x007b;
    L_0x0064:
        r4 = r3 >> 8;
        r5 = f4199f;
        r6 = r4 >> 4;
        r5 = r5[r6];
        r0.m3319a(r5);
        r5 = f4199f;
        r4 = r4 & 15;
        r4 = r5[r4];
        r0.m3319a(r4);
        r3 = r3 & 255;
        goto L_0x0083;
    L_0x007b:
        r4 = 48;
        r0.m3319a(r4);
        r0.m3319a(r4);
    L_0x0083:
        r4 = f4199f;
        r5 = r3 >> 4;
        r4 = r4[r5];
        r0.m3319a(r4);
        r4 = f4199f;
        r3 = r3 & 15;
        r3 = r4[r3];
        goto L_0x0094;
    L_0x0093:
        r3 = (byte) r5;
    L_0x0094:
        r0.m3319a(r3);
        r4 = r0.f4326c;
        r5 = r0.f4325b;
    L_0x009b:
        r3 = r7;
        goto L_0x0017;
    L_0x009e:
        r6 = 2047; // 0x7ff float:2.868E-42 double:1.0114E-320;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 > r6) goto L_0x00b4;
    L_0x00a4:
        r6 = r4 + 1;
        r9 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r10 = r3 >> 6;
        r9 = r9 | r10;
        r9 = (byte) r9;
        r5[r4] = r9;
        r3 = r3 & 63;
        r3 = r3 | r8;
        r4 = r6;
        goto L_0x0132;
    L_0x00b4:
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r3 < r6) goto L_0x0113;
    L_0x00b9:
        r6 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r3 <= r6) goto L_0x00bf;
    L_0x00be:
        goto L_0x0113;
    L_0x00bf:
        r6 = 56319; // 0xdbff float:7.892E-41 double:2.78253E-319;
        if (r3 <= r6) goto L_0x00c7;
    L_0x00c4:
        com.p111d.p112a.p114b.p116c.C1349e.m3217a(r3);
    L_0x00c7:
        if (r7 < r2) goto L_0x00cc;
    L_0x00c9:
        com.p111d.p112a.p114b.p116c.C1349e.m3217a(r3);
    L_0x00cc:
        r6 = r7 + 1;
        r7 = r12.charAt(r7);
        r3 = com.p111d.p112a.p114b.p116c.C1349e.m3215a(r3, r7);
        r7 = 1114111; // 0x10ffff float:1.561202E-39 double:5.50444E-318;
        if (r3 <= r7) goto L_0x00de;
    L_0x00db:
        com.p111d.p112a.p114b.p116c.C1349e.m3217a(r3);
    L_0x00de:
        r7 = r4 + 1;
        r9 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r10 = r3 >> 18;
        r9 = r9 | r10;
        r9 = (byte) r9;
        r5[r4] = r9;
        r4 = r5.length;
        if (r7 < r4) goto L_0x00f0;
    L_0x00eb:
        r5 = r0.m3324d();
        r7 = r1;
    L_0x00f0:
        r4 = r7 + 1;
        r9 = r3 >> 12;
        r9 = r9 & 63;
        r9 = r9 | r8;
        r9 = (byte) r9;
        r5[r7] = r9;
        r7 = r5.length;
        if (r4 < r7) goto L_0x0103;
    L_0x00fd:
        r4 = r0.m3324d();
        r5 = r4;
        r4 = r1;
    L_0x0103:
        r7 = r4 + 1;
        r9 = r3 >> 6;
        r9 = r9 & 63;
        r9 = r9 | r8;
        r9 = (byte) r9;
        r5[r4] = r9;
        r3 = r3 & 63;
        r3 = r3 | r8;
        r4 = r7;
        r7 = r6;
        goto L_0x0132;
    L_0x0113:
        r6 = r4 + 1;
        r9 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r10 = r3 >> 12;
        r9 = r9 | r10;
        r9 = (byte) r9;
        r5[r4] = r9;
        r4 = r5.length;
        if (r6 < r4) goto L_0x0125;
    L_0x0120:
        r5 = r0.m3324d();
        r6 = r1;
    L_0x0125:
        r4 = r6 + 1;
        r9 = r3 >> 6;
        r9 = r9 & 63;
        r9 = r9 | r8;
        r9 = (byte) r9;
        r5[r6] = r9;
        r3 = r3 & 63;
        r3 = r3 | r8;
    L_0x0132:
        r6 = r5.length;
        if (r4 < r6) goto L_0x013b;
    L_0x0135:
        r4 = r0.m3324d();
        r5 = r4;
        r4 = r1;
    L_0x013b:
        r6 = r4 + 1;
        r3 = (byte) r3;
        r5[r4] = r3;
        r4 = r6;
        goto L_0x009b;
    L_0x0143:
        r12 = r11.f4201c;
        r12 = r12.m3325d(r4);
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.e.b(java.lang.String):byte[]");
    }

    public final byte[] m3220c(String str) {
        C1369b c1369b = this.f4201c;
        if (c1369b == null) {
            c1369b = new C1369b((byte) 0);
            this.f4201c = c1369b;
        }
        int length = str.length();
        byte[] c = c1369b.m3323c();
        byte[] bArr = c;
        int length2 = c.length;
        int i = 0;
        int i2 = i;
        loop0:
        while (i < length) {
            int i3;
            int i4 = i + 1;
            i = str.charAt(i);
            while (i <= 127) {
                if (i2 >= length2) {
                    byte[] d = c1369b.m3324d();
                    length2 = d.length;
                    bArr = d;
                    i2 = 0;
                }
                i3 = i2 + 1;
                bArr[i2] = (byte) i;
                if (i4 >= length) {
                    i2 = i3;
                    break loop0;
                }
                i = i4 + 1;
                char charAt = str.charAt(i4);
                i4 = i;
                char c2 = charAt;
                i2 = i3;
            }
            if (i2 >= length2) {
                bArr = c1369b.m3324d();
                length2 = bArr.length;
                i2 = 0;
            }
            if (i < 2048) {
                i3 = i2 + 1;
                bArr[i2] = (byte) (192 | (i >> 6));
                i2 = i3;
            } else {
                if (i >= C6464a.SURR1_FIRST) {
                    if (i <= C6464a.SURR2_LAST) {
                        if (i > C6464a.SURR1_LAST) {
                            C1349e.m3217a(i);
                        }
                        if (i4 >= length) {
                            C1349e.m3217a(i);
                        }
                        i3 = i4 + 1;
                        i = C1349e.m3215a(i, str.charAt(i4));
                        if (i > 1114111) {
                            C1349e.m3217a(i);
                        }
                        i4 = i2 + 1;
                        bArr[i2] = (byte) (240 | (i >> 18));
                        if (i4 >= length2) {
                            bArr = c1369b.m3324d();
                            length2 = bArr.length;
                            i4 = 0;
                        }
                        i2 = i4 + 1;
                        bArr[i4] = (byte) (((i >> 12) & 63) | 128);
                        if (i2 >= length2) {
                            d = c1369b.m3324d();
                            length2 = d.length;
                            bArr = d;
                            i2 = 0;
                        }
                        i4 = i2 + 1;
                        bArr[i2] = (byte) (((i >> 6) & 63) | 128);
                        i2 = i4;
                        i4 = i3;
                    }
                }
                i3 = i2 + 1;
                bArr[i2] = (byte) (224 | (i >> 12));
                if (i3 >= length2) {
                    bArr = c1369b.m3324d();
                    i3 = 0;
                    length2 = bArr.length;
                }
                i2 = i3 + 1;
                bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            }
            if (i2 >= length2) {
                d = c1369b.m3324d();
                length2 = d.length;
                bArr = d;
                i2 = 0;
            }
            i3 = i2 + 1;
            bArr[i2] = (byte) ((i & 63) | 128);
            i = i4;
            i2 = i3;
        }
        return this.f4201c.m3325d(i2);
    }
}
