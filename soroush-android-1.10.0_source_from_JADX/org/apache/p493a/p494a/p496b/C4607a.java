package org.apache.p493a.p494a.p496b;

public final class C4607a {
    private static final byte[] f12649a = new byte[]{(byte) 13, (byte) 10};
    private static final byte[] f12650b = new byte[0];
    private static final byte[] f12651c = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
    private static final byte[] f12652d = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
    private static final byte[] f12653e = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 62, (byte) -1, (byte) 62, (byte) -1, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 63, (byte) -1, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51};
    private final byte[] f12654f;
    private final int f12655g;
    private final byte[] f12656h;
    private final int f12657i;
    private final int f12658j;
    private byte[] f12659k;
    private int f12660l;
    private int f12661m;
    private int f12662n;
    private int f12663o;
    private boolean f12664p;
    private int f12665q;

    public C4607a() {
        this((byte) 0);
    }

    private C4607a(byte b) {
        this(76, f12649a);
    }

    private C4607a(int i, byte[] bArr) {
        Object obj;
        if (bArr == null) {
            obj = f12650b;
            i = 0;
        }
        int i2 = 4;
        this.f12655g = i > 0 ? (i / 4) * 4 : 0;
        this.f12656h = new byte[obj.length];
        System.arraycopy(obj, 0, this.f12656h, 0, obj.length);
        if (i > 0) {
            i2 = 4 + obj.length;
        }
        this.f12658j = i2;
        this.f12657i = this.f12658j - 1;
        if (C4607a.m8348b(obj)) {
            String c = C4607a.m8349c(obj);
            StringBuilder stringBuilder = new StringBuilder("lineSeperator must not contain base64 characters: [");
            stringBuilder.append(c);
            stringBuilder.append("]");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f12654f = f12651c;
    }

    private static long m8344a(byte[] bArr, int i, byte[] bArr2) {
        i = (i / 4) * 4;
        long length = (long) ((bArr.length * 4) / 3);
        long j = length % 4;
        long j2 = j != 0 ? length + (4 - j) : length;
        if (i > 0) {
            long j3 = (long) i;
            length = j2 + ((j2 / j3) * ((long) bArr2.length));
            if ((j2 % j3 == 0 ? 1 : null) == null) {
                return length + ((long) bArr2.length);
            }
            j2 = length;
        }
        return j2;
    }

    private void m8345a() {
        if (this.f12659k == null) {
            this.f12659k = new byte[8192];
            this.f12660l = 0;
            this.f12661m = 0;
            return;
        }
        Object obj = new byte[(this.f12659k.length * 2)];
        System.arraycopy(this.f12659k, 0, obj, 0, this.f12659k.length);
        this.f12659k = obj;
    }

    private void m8346a(byte[] bArr, int i, int i2) {
        if (!this.f12664p) {
            if (i2 < 0) {
                this.f12664p = true;
                if (this.f12659k == null || this.f12659k.length - this.f12660l < this.f12658j) {
                    m8345a();
                }
                switch (this.f12663o) {
                    case 1:
                        bArr = this.f12659k;
                        i2 = this.f12660l;
                        this.f12660l = i2 + 1;
                        bArr[i2] = this.f12654f[(this.f12665q >> 2) & 63];
                        bArr = this.f12659k;
                        i2 = this.f12660l;
                        this.f12660l = i2 + 1;
                        bArr[i2] = this.f12654f[(this.f12665q << 4) & 63];
                        if (this.f12654f == f12651c) {
                            bArr = this.f12659k;
                            i2 = this.f12660l;
                            this.f12660l = i2 + 1;
                            bArr[i2] = (byte) 61;
                            bArr = this.f12659k;
                            i2 = this.f12660l;
                            this.f12660l = i2 + 1;
                            bArr[i2] = (byte) 61;
                            break;
                        }
                        break;
                    case 2:
                        bArr = this.f12659k;
                        i2 = this.f12660l;
                        this.f12660l = i2 + 1;
                        bArr[i2] = this.f12654f[(this.f12665q >> 10) & 63];
                        bArr = this.f12659k;
                        i2 = this.f12660l;
                        this.f12660l = i2 + 1;
                        bArr[i2] = this.f12654f[(this.f12665q >> 4) & 63];
                        bArr = this.f12659k;
                        i2 = this.f12660l;
                        this.f12660l = i2 + 1;
                        bArr[i2] = this.f12654f[(this.f12665q << 2) & 63];
                        if (this.f12654f == f12651c) {
                            bArr = this.f12659k;
                            i2 = this.f12660l;
                            this.f12660l = i2 + 1;
                            bArr[i2] = (byte) 61;
                            break;
                        }
                        break;
                    default:
                        break;
                }
                if (this.f12655g > 0 && this.f12660l > 0) {
                    System.arraycopy(this.f12656h, 0, this.f12659k, this.f12660l, this.f12656h.length);
                    this.f12660l += this.f12656h.length;
                    return;
                }
            }
            int i3 = i;
            i = 0;
            while (i < i2) {
                if (this.f12659k == null || this.f12659k.length - this.f12660l < this.f12658j) {
                    m8345a();
                }
                int i4 = this.f12663o + 1;
                this.f12663o = i4;
                this.f12663o = i4 % 3;
                i4 = i3 + 1;
                i3 = bArr[i3];
                if (i3 < 0) {
                    i3 += 256;
                }
                this.f12665q = (this.f12665q << 8) + i3;
                if (this.f12663o == 0) {
                    byte[] bArr2 = this.f12659k;
                    int i5 = this.f12660l;
                    this.f12660l = i5 + 1;
                    bArr2[i5] = this.f12654f[(this.f12665q >> 18) & 63];
                    bArr2 = this.f12659k;
                    i5 = this.f12660l;
                    this.f12660l = i5 + 1;
                    bArr2[i5] = this.f12654f[(this.f12665q >> 12) & 63];
                    bArr2 = this.f12659k;
                    i5 = this.f12660l;
                    this.f12660l = i5 + 1;
                    bArr2[i5] = this.f12654f[(this.f12665q >> 6) & 63];
                    bArr2 = this.f12659k;
                    i5 = this.f12660l;
                    this.f12660l = i5 + 1;
                    bArr2[i5] = this.f12654f[this.f12665q & 63];
                    this.f12662n += 4;
                    if (this.f12655g > 0 && this.f12655g <= this.f12662n) {
                        System.arraycopy(this.f12656h, 0, this.f12659k, this.f12660l, this.f12656h.length);
                        this.f12660l += this.f12656h.length;
                        this.f12662n = 0;
                    }
                }
                i++;
                i3 = i4;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m8347a(byte[] r6) {
        /*
        if (r6 == 0) goto L_0x00af;
    L_0x0002:
        r0 = r6.length;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r6;
    L_0x0006:
        r0 = f12650b;
        r1 = 0;
        r2 = org.apache.p493a.p494a.p496b.C4607a.m8344a(r6, r1, r0);
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x002d;
    L_0x0014:
        r6 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Input array too big, the output array would be bigger (";
        r0.<init>(r1);
        r0.append(r2);
        r1 = ") than the specified maxium size of 2147483647";
        r0.append(r1);
        r0 = r0.toString();
        r6.<init>(r0);
        throw r6;
    L_0x002d:
        r0 = new org.apache.a.a.b.a;
        r2 = f12649a;
        r0.<init>(r1, r2);
        r2 = 0;
        r0.f12659k = r2;
        r0.f12660l = r1;
        r0.f12661m = r1;
        r0.f12662n = r1;
        r0.f12663o = r1;
        r0.f12664p = r1;
        if (r6 == 0) goto L_0x00af;
    L_0x0043:
        r3 = r6.length;
        if (r3 != 0) goto L_0x0047;
    L_0x0046:
        return r6;
    L_0x0047:
        r3 = r0.f12655g;
        r4 = r0.f12656h;
        r3 = org.apache.p493a.p494a.p496b.C4607a.m8344a(r6, r3, r4);
        r3 = (int) r3;
        r3 = new byte[r3];
        r4 = r3.length;
        r5 = r3.length;
        if (r5 != r4) goto L_0x005c;
    L_0x0056:
        r0.f12659k = r3;
        r0.f12660l = r1;
        r0.f12661m = r1;
    L_0x005c:
        r4 = r6.length;
        r0.m8346a(r6, r1, r4);
        r4 = -1;
        r0.m8346a(r6, r1, r4);
        r6 = r0.f12659k;
        if (r6 == r3) goto L_0x0094;
    L_0x0068:
        r6 = r3.length;
        r4 = r0.f12659k;
        if (r4 == 0) goto L_0x0094;
    L_0x006d:
        r4 = r0.f12659k;
        if (r4 == 0) goto L_0x0077;
    L_0x0071:
        r4 = r0.f12660l;
        r5 = r0.f12661m;
        r4 = r4 - r5;
        goto L_0x0078;
    L_0x0077:
        r4 = r1;
    L_0x0078:
        r6 = java.lang.Math.min(r4, r6);
        r4 = r0.f12659k;
        if (r4 == r3) goto L_0x0092;
    L_0x0080:
        r4 = r0.f12659k;
        r5 = r0.f12661m;
        java.lang.System.arraycopy(r4, r5, r3, r1, r6);
        r4 = r0.f12661m;
        r4 = r4 + r6;
        r0.f12661m = r4;
        r6 = r0.f12661m;
        r4 = r0.f12660l;
        if (r6 < r4) goto L_0x0094;
    L_0x0092:
        r0.f12659k = r2;
    L_0x0094:
        r6 = r0.f12654f;
        r2 = f12652d;
        if (r6 != r2) goto L_0x009c;
    L_0x009a:
        r6 = 1;
        goto L_0x009d;
    L_0x009c:
        r6 = r1;
    L_0x009d:
        if (r6 == 0) goto L_0x00ae;
    L_0x009f:
        r6 = r0.f12660l;
        r2 = r3.length;
        if (r6 >= r2) goto L_0x00ae;
    L_0x00a4:
        r6 = r0.f12660l;
        r6 = new byte[r6];
        r0 = r0.f12660l;
        java.lang.System.arraycopy(r3, r1, r6, r1, r0);
        return r6;
    L_0x00ae:
        r6 = r3;
    L_0x00af:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.a.a.b.a.a(byte[]):byte[]");
    }

    private static boolean m8348b(byte[] bArr) {
        for (byte b : bArr) {
            boolean z;
            if (b != (byte) 61) {
                if (b < (byte) 0 || b >= f12653e.length || f12653e[b] == (byte) -1) {
                    z = false;
                    if (z) {
                        return true;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static String m8349c(byte[] bArr) {
        try {
            return new String(bArr, "UTF8");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
