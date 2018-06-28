package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C5301g.C1368a;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p116c.C1345a;
import com.p111d.p112a.p114b.p116c.C1346b;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p116c.C1352h;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class C7263j extends C7042c {
    protected static final char[] f20994g = C1345a.m3186g();
    protected final Writer f20995h;
    protected char[] f20996i;
    protected int f20997j;
    protected int f20998k;
    protected int f20999l = this.f20996i.length;
    protected char[] f21000m;
    protected C1382p f21001n;

    public C7263j(C1347c c1347c, int i, C5304n c5304n, Writer writer) {
        super(c1347c, i, c5304n);
        this.f20995h = writer;
        this.f20996i = c1347c.m3211i();
    }

    private static int m19343a(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr[i4] = bArr[i];
            i4 = i5;
            i = i6;
        }
        i = Math.min(i3, bArr.length);
        do {
            i2 = i - i4;
            if (i2 == 0) {
                break;
            }
            i2 = inputStream.read(bArr, i4, i2);
            if (i2 < 0) {
                return i4;
            }
            i4 += i2;
        } while (i4 < 3);
        return i4;
    }

    private int m19344a(char[] cArr, int i, int i2, char c, int i3) {
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                cArr = this.f21000m;
                if (cArr == null) {
                    cArr = m19350b();
                }
                cArr[1] = (char) i3;
                this.f20995h.write(cArr, 0, 2);
                return i;
            }
            i -= 2;
            cArr[i] = '\\';
            cArr[i + 1] = (char) i3;
            return i;
        } else if (i3 == -2) {
            String value;
            if (this.f21001n == null) {
                value = this.e.m3189b().getValue();
            } else {
                value = this.f21001n.getValue();
                this.f21001n = null;
            }
            i3 = value.length();
            if (i < i3 || i >= i2) {
                this.f20995h.write(value);
                return i;
            }
            i -= i3;
            value.getChars(0, i3, cArr, i);
            return i;
        } else if (i <= 5 || i >= i2) {
            cArr = this.f21000m;
            if (cArr == null) {
                cArr = m19350b();
            }
            this.f20997j = this.f20998k;
            if (c > 'ÿ') {
                i3 = (c >> 8) & 255;
                r8 = c & 255;
                cArr[10] = f20994g[i3 >> 4];
                cArr[11] = f20994g[i3 & 15];
                cArr[12] = f20994g[r8 >> 4];
                cArr[13] = f20994g[r8 & 15];
                this.f20995h.write(cArr, 8, 6);
                return i;
            }
            cArr[6] = f20994g[c >> 4];
            cArr[7] = f20994g[c & 15];
            this.f20995h.write(cArr, 2, 6);
            return i;
        } else {
            i -= 6;
            i2 = i + 1;
            cArr[i] = '\\';
            i = i2 + 1;
            cArr[i2] = 'u';
            if (c > 'ÿ') {
                i2 = (c >> 8) & 255;
                i3 = i + 1;
                cArr[i] = f20994g[i2 >> 4];
                i = i3 + 1;
                cArr[i3] = f20994g[i2 & 15];
                r8 = (char) (c & 255);
            } else {
                i2 = i + 1;
                cArr[i] = '0';
                i = i2 + 1;
                cArr[i2] = '0';
            }
            i2 = i + 1;
            cArr[i] = f20994g[r8 >> 4];
            cArr[i2] = f20994g[r8 & 15];
            return i2 - 5;
        }
    }

    private final void m19345a() {
        if (this.f20998k + 4 >= this.f20999l) {
            m19351c();
        }
        int i = this.f20998k;
        char[] cArr = this.f20996i;
        cArr[i] = 'n';
        i++;
        cArr[i] = 'u';
        i++;
        cArr[i] = 'l';
        i++;
        cArr[i] = 'l';
        this.f20998k = i + 1;
    }

    private void m19346a(char c, int i) {
        int i2;
        int i3;
        if (i >= 0) {
            if (this.f20998k >= 2) {
                i2 = this.f20998k - 2;
                this.f20997j = i2;
                i3 = i2 + 1;
                this.f20996i[i2] = '\\';
                this.f20996i[i3] = (char) i;
                return;
            }
            char[] cArr = this.f21000m;
            if (cArr == null) {
                cArr = m19350b();
            }
            this.f20997j = this.f20998k;
            cArr[1] = (char) i;
            this.f20995h.write(cArr, 0, 2);
        } else if (i == -2) {
            String value;
            if (this.f21001n == null) {
                value = this.e.m3189b().getValue();
            } else {
                value = this.f21001n.getValue();
                this.f21001n = null;
            }
            i = value.length();
            if (this.f20998k >= i) {
                r1 = this.f20998k - i;
                this.f20997j = r1;
                value.getChars(0, i, this.f20996i, r1);
                return;
            }
            this.f20997j = this.f20998k;
            this.f20995h.write(value);
        } else if (this.f20998k >= 6) {
            r7 = this.f20996i;
            i3 = this.f20998k - 6;
            this.f20997j = i3;
            r7[i3] = '\\';
            i3++;
            r7[i3] = 'u';
            if (c > 'ÿ') {
                int i4 = (c >> 8) & 255;
                i3++;
                r7[i3] = f20994g[i4 >> 4];
                i3++;
                r7[i3] = f20994g[i4 & 15];
                i2 = (char) (c & 255);
            } else {
                i3++;
                r7[i3] = '0';
                i3++;
                r7[i3] = '0';
            }
            i3++;
            r7[i3] = f20994g[i2 >> 4];
            r7[i3 + 1] = f20994g[i2 & 15];
        } else {
            r7 = this.f21000m;
            if (r7 == null) {
                r7 = m19350b();
            }
            this.f20997j = this.f20998k;
            if (c > 'ÿ') {
                r1 = (c >> 8) & 255;
                i2 = c & 255;
                r7[10] = f20994g[r1 >> 4];
                r7[11] = f20994g[r1 & 15];
                r7[12] = f20994g[i2 >> 4];
                r7[13] = f20994g[i2 & 15];
                this.f20995h.write(r7, 8, 6);
                return;
            }
            r7[6] = f20994g[c >> 4];
            r7[7] = f20994g[c & 15];
            this.f20995h.write(r7, 2, 6);
        }
    }

    private void m19347a(String str) {
        int i = this.f20999l - this.f20998k;
        str.getChars(0, i, this.f20996i, this.f20998k);
        this.f20998k += i;
        m19351c();
        int length = str.length() - i;
        while (length > this.f20999l) {
            int i2 = this.f20999l;
            int i3 = i + i2;
            str.getChars(i, i3, this.f20996i, 0);
            this.f20997j = 0;
            this.f20998k = i2;
            m19351c();
            length -= i2;
            i = i3;
        }
        str.getChars(i, i + length, this.f20996i, 0);
        this.f20997j = 0;
        this.f20998k = length;
    }

    private void m19348b(char c, int i) {
        int i2;
        if (i >= 0) {
            if (this.f20998k + 2 > this.f20999l) {
                m19351c();
            }
            char[] cArr = this.f20996i;
            int i3 = this.f20998k;
            this.f20998k = i3 + 1;
            cArr[i3] = '\\';
            cArr = this.f20996i;
            i2 = this.f20998k;
            this.f20998k = i2 + 1;
            cArr[i2] = (char) i;
        } else if (i != -2) {
            int i4;
            if (this.f20998k + 5 >= this.f20999l) {
                m19351c();
            }
            i = this.f20998k;
            char[] cArr2 = this.f20996i;
            int i5 = i + 1;
            cArr2[i] = '\\';
            i = i5 + 1;
            cArr2[i5] = 'u';
            if (c > 'ÿ') {
                i2 = 255 & (c >> 8);
                i5 = i + 1;
                cArr2[i] = f20994g[i2 >> 4];
                i = i5 + 1;
                cArr2[i5] = f20994g[i2 & 15];
                i4 = (char) (c & 255);
            } else {
                i2 = i + 1;
                cArr2[i] = '0';
                i = i2 + 1;
                cArr2[i2] = '0';
            }
            i2 = i + 1;
            cArr2[i] = f20994g[i4 >> 4];
            i = i2 + 1;
            cArr2[i2] = f20994g[i4 & 15];
            this.f20998k = i;
        } else {
            String value;
            if (this.f21001n == null) {
                value = this.e.m3189b().getValue();
            } else {
                value = this.f21001n.getValue();
                this.f21001n = null;
            }
            i = value.length();
            if (this.f20998k + i > this.f20999l) {
                m19351c();
                if (i > this.f20999l) {
                    this.f20995h.write(value);
                    return;
                }
            }
            value.getChars(0, i, this.f20996i, this.f20998k);
            this.f20998k += i;
        }
    }

    private void m19349b(String str) {
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = this.f20996i;
        int i = this.f20998k;
        this.f20998k = i + 1;
        cArr[i] = '\"';
        writeRaw(str);
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr2 = this.f20996i;
        int i2 = this.f20998k;
        this.f20998k = i2 + 1;
        cArr2[i2] = '\"';
    }

    private char[] m19350b() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.f21000m = cArr;
        return cArr;
    }

    private void m19351c() {
        int i = this.f20998k - this.f20997j;
        if (i > 0) {
            int i2 = this.f20997j;
            this.f20997j = 0;
            this.f20998k = 0;
            this.f20995h.write(this.f20996i, i2, i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19352c(java.lang.String r18) {
        /*
        r17 = this;
        r6 = r17;
        r7 = r18;
        r0 = r18.length();
        r1 = r6.f20999l;
        r11 = 0;
        if (r0 <= r1) goto L_0x0106;
    L_0x000d:
        r17.m19351c();
        r12 = r18.length();
        r0 = r11;
    L_0x0015:
        r1 = r6.f20999l;
        r2 = r0 + r1;
        if (r2 <= r12) goto L_0x001d;
    L_0x001b:
        r1 = r12 - r0;
    L_0x001d:
        r13 = r1;
        r14 = r0 + r13;
        r1 = r6.f20996i;
        r7.getChars(r0, r14, r1, r11);
        r0 = r6.e;
        if (r0 == 0) goto L_0x0089;
    L_0x0029:
        r15 = r6.c;
        r0 = r6.d;
        if (r0 > 0) goto L_0x0033;
    L_0x002f:
        r5 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        goto L_0x0036;
    L_0x0033:
        r0 = r6.d;
        r5 = r0;
    L_0x0036:
        r0 = r15.length;
        r1 = r5 + 1;
        r4 = java.lang.Math.min(r0, r1);
        r3 = r6.e;
        r0 = r11;
        r1 = r0;
        r2 = r1;
    L_0x0042:
        if (r0 >= r13) goto L_0x00ff;
    L_0x0044:
        r8 = r6.f20996i;
        r8 = r8[r0];
        if (r8 >= r4) goto L_0x0050;
    L_0x004a:
        r2 = r15[r8];
        if (r2 == 0) goto L_0x005e;
    L_0x004e:
        r9 = r2;
        goto L_0x0063;
    L_0x0050:
        if (r8 <= r5) goto L_0x0054;
    L_0x0052:
        r9 = -1;
        goto L_0x0063;
    L_0x0054:
        r9 = r3.m3189b();
        r6.f21001n = r9;
        if (r9 == 0) goto L_0x005e;
    L_0x005c:
        r9 = -2;
        goto L_0x0063;
    L_0x005e:
        r0 = r0 + 1;
        if (r0 < r13) goto L_0x0044;
    L_0x0062:
        goto L_0x004e;
    L_0x0063:
        r2 = r0 - r1;
        if (r2 <= 0) goto L_0x0070;
    L_0x0067:
        r10 = r6.f20995h;
        r11 = r6.f20996i;
        r10.write(r11, r1, r2);
        if (r0 >= r13) goto L_0x00ff;
    L_0x0070:
        r10 = r0 + 1;
        r1 = r6.f20996i;
        r0 = r6;
        r2 = r10;
        r11 = r3;
        r3 = r13;
        r16 = r4;
        r4 = r8;
        r8 = r5;
        r5 = r9;
        r1 = r0.m19344a(r1, r2, r3, r4, r5);
        r5 = r8;
        r2 = r9;
        r0 = r10;
        r3 = r11;
        r4 = r16;
        r11 = 0;
        goto L_0x0042;
    L_0x0089:
        r0 = r6.d;
        if (r0 == 0) goto L_0x00ce;
    L_0x008d:
        r8 = r6.d;
        r9 = r6.c;
        r0 = r9.length;
        r1 = r8 + 1;
        r10 = java.lang.Math.min(r0, r1);
        r0 = 0;
        r1 = 0;
        r2 = 0;
    L_0x009b:
        if (r0 >= r13) goto L_0x00ff;
    L_0x009d:
        r3 = r6.f20996i;
        r4 = r3[r0];
        if (r4 >= r10) goto L_0x00a9;
    L_0x00a3:
        r2 = r9[r4];
        if (r2 == 0) goto L_0x00ad;
    L_0x00a7:
        r11 = r2;
        goto L_0x00b2;
    L_0x00a9:
        if (r4 <= r8) goto L_0x00ad;
    L_0x00ab:
        r11 = -1;
        goto L_0x00b2;
    L_0x00ad:
        r0 = r0 + 1;
        if (r0 < r13) goto L_0x009d;
    L_0x00b1:
        goto L_0x00a7;
    L_0x00b2:
        r2 = r0 - r1;
        if (r2 <= 0) goto L_0x00bf;
    L_0x00b6:
        r3 = r6.f20995h;
        r5 = r6.f20996i;
        r3.write(r5, r1, r2);
        if (r0 >= r13) goto L_0x00ff;
    L_0x00bf:
        r15 = r0 + 1;
        r1 = r6.f20996i;
        r0 = r6;
        r2 = r15;
        r3 = r13;
        r5 = r11;
        r1 = r0.m19344a(r1, r2, r3, r4, r5);
        r2 = r11;
        r0 = r15;
        goto L_0x009b;
    L_0x00ce:
        r8 = r6.c;
        r9 = r8.length;
        r0 = 0;
        r1 = 0;
    L_0x00d3:
        if (r0 >= r13) goto L_0x00ff;
    L_0x00d5:
        r2 = r6.f20996i;
        r4 = r2[r0];
        if (r4 >= r9) goto L_0x00df;
    L_0x00db:
        r2 = r8[r4];
        if (r2 != 0) goto L_0x00e3;
    L_0x00df:
        r0 = r0 + 1;
        if (r0 < r13) goto L_0x00d5;
    L_0x00e3:
        r2 = r0 - r1;
        if (r2 <= 0) goto L_0x00f0;
    L_0x00e7:
        r3 = r6.f20995h;
        r5 = r6.f20996i;
        r3.write(r5, r1, r2);
        if (r0 >= r13) goto L_0x00ff;
    L_0x00f0:
        r10 = r0 + 1;
        r1 = r6.f20996i;
        r5 = r8[r4];
        r0 = r6;
        r2 = r10;
        r3 = r13;
        r1 = r0.m19344a(r1, r2, r3, r4, r5);
        r0 = r10;
        goto L_0x00d3;
    L_0x00ff:
        if (r14 < r12) goto L_0x0102;
    L_0x0101:
        return;
    L_0x0102:
        r0 = r14;
        r11 = 0;
        goto L_0x0015;
    L_0x0106:
        r1 = r6.f20998k;
        r1 = r1 + r0;
        r2 = r6.f20999l;
        if (r1 <= r2) goto L_0x0110;
    L_0x010d:
        r17.m19351c();
    L_0x0110:
        r1 = r6.f20996i;
        r2 = r6.f20998k;
        r3 = 0;
        r7.getChars(r3, r0, r1, r2);
        r1 = r6.e;
        if (r1 == 0) goto L_0x0175;
    L_0x011c:
        r1 = r6.f20998k;
        r1 = r1 + r0;
        r0 = r6.c;
        r2 = r6.d;
        if (r2 > 0) goto L_0x0129;
    L_0x0125:
        r9 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        goto L_0x012b;
    L_0x0129:
        r9 = r6.d;
    L_0x012b:
        r2 = r0.length;
        r3 = r9 + 1;
        r2 = java.lang.Math.min(r2, r3);
        r3 = r6.e;
    L_0x0134:
        r4 = r6.f20998k;
        if (r4 >= r1) goto L_0x0174;
    L_0x0138:
        r4 = r6.f20996i;
        r5 = r6.f20998k;
        r4 = r4[r5];
        if (r4 >= r2) goto L_0x0145;
    L_0x0140:
        r8 = r0[r4];
        if (r8 == 0) goto L_0x016c;
    L_0x0144:
        goto L_0x0152;
    L_0x0145:
        if (r4 <= r9) goto L_0x0149;
    L_0x0147:
        r8 = -1;
        goto L_0x0152;
    L_0x0149:
        r5 = r3.m3189b();
        r6.f21001n = r5;
        if (r5 == 0) goto L_0x016c;
    L_0x0151:
        r8 = -2;
    L_0x0152:
        r5 = r6.f20998k;
        r7 = r6.f20997j;
        r5 = r5 - r7;
        if (r5 <= 0) goto L_0x0162;
    L_0x0159:
        r7 = r6.f20995h;
        r10 = r6.f20996i;
        r11 = r6.f20997j;
        r7.write(r10, r11, r5);
    L_0x0162:
        r5 = r6.f20998k;
        r5 = r5 + 1;
        r6.f20998k = r5;
        r6.m19346a(r4, r8);
        goto L_0x0134;
    L_0x016c:
        r4 = r6.f20998k;
        r4 = r4 + 1;
        r6.f20998k = r4;
        if (r4 < r1) goto L_0x0138;
    L_0x0174:
        return;
    L_0x0175:
        r1 = r6.d;
        if (r1 == 0) goto L_0x01be;
    L_0x0179:
        r1 = r6.d;
        r2 = r6.f20998k;
        r2 = r2 + r0;
        r0 = r6.c;
        r3 = r0.length;
        r4 = r1 + 1;
        r3 = java.lang.Math.min(r3, r4);
    L_0x0187:
        r4 = r6.f20998k;
        if (r4 >= r2) goto L_0x01bd;
    L_0x018b:
        r4 = r6.f20996i;
        r5 = r6.f20998k;
        r4 = r4[r5];
        if (r4 >= r3) goto L_0x0198;
    L_0x0193:
        r10 = r0[r4];
        if (r10 == 0) goto L_0x01b5;
    L_0x0197:
        goto L_0x019b;
    L_0x0198:
        if (r4 <= r1) goto L_0x01b5;
    L_0x019a:
        r10 = -1;
    L_0x019b:
        r5 = r6.f20998k;
        r7 = r6.f20997j;
        r5 = r5 - r7;
        if (r5 <= 0) goto L_0x01ab;
    L_0x01a2:
        r7 = r6.f20995h;
        r8 = r6.f20996i;
        r9 = r6.f20997j;
        r7.write(r8, r9, r5);
    L_0x01ab:
        r5 = r6.f20998k;
        r5 = r5 + 1;
        r6.f20998k = r5;
        r6.m19346a(r4, r10);
        goto L_0x0187;
    L_0x01b5:
        r4 = r6.f20998k;
        r4 = r4 + 1;
        r6.f20998k = r4;
        if (r4 < r2) goto L_0x018b;
    L_0x01bd:
        return;
    L_0x01be:
        r1 = r6.f20998k;
        r1 = r1 + r0;
        r0 = r6.c;
        r2 = r0.length;
    L_0x01c4:
        r3 = r6.f20998k;
        if (r3 >= r1) goto L_0x01fe;
    L_0x01c8:
        r3 = r6.f20996i;
        r4 = r6.f20998k;
        r3 = r3[r4];
        if (r3 >= r2) goto L_0x01f5;
    L_0x01d0:
        r3 = r0[r3];
        if (r3 != 0) goto L_0x01d5;
    L_0x01d4:
        goto L_0x01f5;
    L_0x01d5:
        r3 = r6.f20998k;
        r4 = r6.f20997j;
        r3 = r3 - r4;
        if (r3 <= 0) goto L_0x01e5;
    L_0x01dc:
        r4 = r6.f20995h;
        r5 = r6.f20996i;
        r7 = r6.f20997j;
        r4.write(r5, r7, r3);
    L_0x01e5:
        r3 = r6.f20996i;
        r4 = r6.f20998k;
        r5 = r4 + 1;
        r6.f20998k = r5;
        r3 = r3[r4];
        r4 = r0[r3];
        r6.m19346a(r3, r4);
        goto L_0x01c4;
    L_0x01f5:
        r3 = r6.f20998k;
        r3 = r3 + 1;
        r6.f20998k = r3;
        if (r3 >= r1) goto L_0x01fe;
    L_0x01fd:
        goto L_0x01c8;
    L_0x01fe:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.j.c(java.lang.String):void");
    }

    protected final void _releaseBuffers() {
        char[] cArr = this.f20996i;
        if (cArr != null) {
            this.f20996i = null;
            this.b.m3201b(cArr);
        }
    }

    protected final void _verifyValueWrite(String str) {
        int n;
        if (this._cfgPrettyPrinter != null) {
            n = this._writeContext.m11006n();
            if (n == 5) {
                StringBuilder stringBuilder = new StringBuilder("Can not ");
                stringBuilder.append(str);
                stringBuilder.append(", expecting field name");
                _reportError(stringBuilder.toString());
            }
            switch (n) {
                case 0:
                    if (this._writeContext.m3357b()) {
                        this._cfgPrettyPrinter.mo1294g(this);
                        return;
                    }
                    if (this._writeContext.m3359d()) {
                        this._cfgPrettyPrinter.mo1295h(this);
                    }
                    return;
                case 1:
                    this._cfgPrettyPrinter.mo1293f(this);
                    return;
                case 2:
                    this._cfgPrettyPrinter.mo1291d(this);
                    return;
                case 3:
                    this._cfgPrettyPrinter.mo1286a(this);
                    return;
                default:
                    _throwInternal();
                    return;
            }
        }
        char c;
        n = this._writeContext.m11006n();
        if (n == 5) {
            stringBuilder = new StringBuilder("Can not ");
            stringBuilder.append(str);
            stringBuilder.append(", expecting field name");
            _reportError(stringBuilder.toString());
        }
        switch (n) {
            case 1:
                c = ',';
                break;
            case 2:
                c = ':';
                break;
            case 3:
                if (this.f != null) {
                    writeRaw(this.f.getValue());
                }
                return;
            default:
                return;
        }
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        this.f20996i[this.f20998k] = c;
        this.f20998k++;
    }

    public final void close() {
        super.close();
        if (this.f20996i != null && isEnabled(C1368a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C1379l outputContext = getOutputContext();
                if (!outputContext.m3357b()) {
                    if (!outputContext.m3359d()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        m19351c();
        this.f20997j = 0;
        this.f20998k = 0;
        if (this.f20995h != null) {
            if (!this.b.m3205c()) {
                if (!isEnabled(C1368a.AUTO_CLOSE_TARGET)) {
                    if (isEnabled(C1368a.FLUSH_PASSED_TO_STREAM)) {
                        this.f20995h.flush();
                    }
                }
            }
            this.f20995h.close();
        }
        _releaseBuffers();
    }

    public final void flush() {
        m19351c();
        if (this.f20995h != null && isEnabled(C1368a.FLUSH_PASSED_TO_STREAM)) {
            this.f20995h.flush();
        }
    }

    public final int getOutputBuffered() {
        return Math.max(0, this.f20998k - this.f20997j);
    }

    public final Object getOutputTarget() {
        return this.f20995h;
    }

    public final int writeBinary(C1341a c1341a, InputStream inputStream, int i) {
        int i2;
        int i3;
        C1341a c1341a2 = c1341a;
        InputStream inputStream2 = inputStream;
        int i4 = i;
        _verifyValueWrite("write a binary value");
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = r1.f20996i;
        int i5 = r1.f20998k;
        r1.f20998k = i5 + 1;
        cArr[i5] = '\"';
        byte[] g = r1.b.m3209g();
        int i6 = 3;
        int i7 = 2;
        int i8 = 0;
        int i9 = 1;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i4 < 0) {
            try {
                i4 = r1.f20999l - 6;
                i10 = 0;
                i2 = i10;
                int c = c1341a.m3174c() >> 2;
                i11 = -3;
                i12 = i2;
                while (true) {
                    if (i12 > i11) {
                        i12 = C7263j.m19343a(inputStream2, g, i12, i10, g.length);
                        if (i12 < 3) {
                            break;
                        }
                        i11 = i12 - 3;
                        i10 = i12;
                        i12 = i8;
                    }
                    if (r1.f20998k > i4) {
                        m19351c();
                    }
                    i13 = i12 + 1;
                    i12 = g[i12] << 8;
                    int i14 = i13 + 1;
                    i12 = i14 + 1;
                    i2 += 3;
                    r1.f20998k = c1341a2.m3164a((((g[i13] & 255) | i12) << 8) | (g[i14] & 255), r1.f20996i, r1.f20998k);
                    c--;
                    if (c <= 0) {
                        char[] cArr2 = r1.f20996i;
                        i8 = r1.f20998k;
                        r1.f20998k = i8 + 1;
                        cArr2[i8] = '\\';
                        cArr2 = r1.f20996i;
                        i8 = r1.f20998k;
                        r1.f20998k = i8 + 1;
                        cArr2[i8] = 'n';
                        c = c1341a.m3174c() >> 2;
                    }
                    i8 = 0;
                    i9 = 1;
                }
                if (i12 > 0) {
                    if (r1.f20998k > i4) {
                        m19351c();
                    }
                    i3 = g[i8] << 16;
                    if (i9 < i12) {
                        i3 |= (g[i9] & 255) << 8;
                    } else {
                        i7 = i9;
                    }
                    i2 += i7;
                    r1.f20998k = c1341a2.m3162a(i3, i7, r1.f20996i, r1.f20998k);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                r1.b.m3203c(g);
            }
        } else {
            i13 = r1.f20999l - 6;
            i9 = -3;
            i10 = c1341a.m3174c() >> 2;
            i8 = 0;
            i11 = 0;
            i12 = i4;
            while (i12 > i7) {
                char c2;
                if (i8 > i9) {
                    i11 = C7263j.m19343a(inputStream2, g, i8, i11, i12);
                    if (i11 < i6) {
                        i6 = i7;
                        i8 = 0;
                        break;
                    }
                    i9 = i11 - 3;
                    i8 = 0;
                }
                if (r1.f20998k > i13) {
                    m19351c();
                }
                i6 = i8 + 1;
                i8 = g[i8] << 8;
                i2 = i6 + 1;
                i8 = i2 + 1;
                i12 -= 3;
                r1.f20998k = c1341a2.m3164a((((g[i6] & 255) | i8) << 8) | (g[i2] & 255), r1.f20996i, r1.f20998k);
                i10--;
                if (i10 <= 0) {
                    char[] cArr3 = r1.f20996i;
                    i6 = r1.f20998k;
                    r1.f20998k = i6 + 1;
                    cArr3[i6] = '\\';
                    cArr3 = r1.f20996i;
                    i6 = r1.f20998k;
                    r1.f20998k = i6 + 1;
                    c2 = 'n';
                    cArr3[i6] = 'n';
                    i6 = 2;
                    i10 = c1341a.m3174c() >> 2;
                } else {
                    i6 = 2;
                    c2 = 'n';
                }
                char c3 = c2;
                i7 = i6;
                i6 = 3;
            }
            i6 = i7;
            if (i12 > 0) {
                i3 = C7263j.m19343a(inputStream2, g, i8, i11, i12);
                if (i3 > 0) {
                    if (r1.f20998k > i13) {
                        m19351c();
                    }
                    i5 = g[0] << 16;
                    if (1 < i3) {
                        i5 |= (g[1] & 255) << 8;
                    } else {
                        i6 = 1;
                    }
                    r1.f20998k = c1341a2.m3162a(i5, i6, r1.f20996i, r1.f20998k);
                    i12 -= i6;
                }
            }
            if (i12 > 0) {
                StringBuilder stringBuilder = new StringBuilder("Too few bytes available: missing ");
                stringBuilder.append(i12);
                stringBuilder.append(" bytes (out of ");
                stringBuilder.append(i4);
                stringBuilder.append(")");
                _reportError(stringBuilder.toString());
            }
            i2 = i4;
        }
        r1.b.m3203c(g);
        if (r1.f20998k >= r1.f20999l) {
            m19351c();
        }
        char[] cArr4 = r1.f20996i;
        i3 = r1.f20998k;
        r1.f20998k = i3 + 1;
        cArr4[i3] = '\"';
        return i2;
    }

    public final void writeBinary(C1341a c1341a, byte[] bArr, int i, int i2) {
        _verifyValueWrite("write a binary value");
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = this.f20996i;
        int i3 = this.f20998k;
        this.f20998k = i3 + 1;
        cArr[i3] = '\"';
        i2 += i;
        int i4 = i2 - 3;
        i3 = this.f20999l - 6;
        int c = c1341a.m3174c() >> 2;
        while (i <= i4) {
            if (this.f20998k > i3) {
                m19351c();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            i5 = i6 + 1;
            this.f20998k = c1341a.m3164a((((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f20996i, this.f20998k);
            c--;
            if (c <= 0) {
                char[] cArr2 = this.f20996i;
                c = this.f20998k;
                this.f20998k = c + 1;
                cArr2[c] = '\\';
                cArr2 = this.f20996i;
                c = this.f20998k;
                this.f20998k = c + 1;
                cArr2[c] = 'n';
                c = c1341a.m3174c() >> 2;
            }
            i = i5;
        }
        i2 -= i;
        if (i2 > 0) {
            if (this.f20998k > i3) {
                m19351c();
            }
            i4 = i + 1;
            i = bArr[i] << 16;
            if (i2 == 2) {
                i |= (bArr[i4] & 255) << 8;
            }
            this.f20998k = c1341a.m3162a(i, i2, this.f20996i, this.f20998k);
        }
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr3 = this.f20996i;
        int i7 = this.f20998k;
        this.f20998k = i7 + 1;
        cArr3[i7] = '\"';
    }

    public final void writeBoolean(boolean z) {
        _verifyValueWrite("write a boolean value");
        if (this.f20998k + 5 >= this.f20999l) {
            m19351c();
        }
        int i = this.f20998k;
        char[] cArr = this.f20996i;
        if (z) {
            cArr[i] = 't';
            i++;
            cArr[i] = 'r';
            i++;
            cArr[i] = 'u';
            i++;
            cArr[i] = 'e';
        } else {
            cArr[i] = 'f';
            i++;
            cArr[i] = 'a';
            i++;
            cArr[i] = 'l';
            i++;
            cArr[i] = 's';
            i++;
            cArr[i] = 'e';
        }
        this.f20998k = i + 1;
    }

    public final void writeEndArray() {
        if (!this._writeContext.m3357b()) {
            StringBuilder stringBuilder = new StringBuilder("Current context not an ARRAY but ");
            stringBuilder.append(this._writeContext.m3360e());
            _reportError(stringBuilder.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1289b(this, this._writeContext.m3361f());
        } else {
            if (this.f20998k >= this.f20999l) {
                m19351c();
            }
            char[] cArr = this.f20996i;
            int i = this.f20998k;
            this.f20998k = i + 1;
            cArr[i] = ']';
        }
        this._writeContext = this._writeContext.m11004l();
    }

    public final void writeEndObject() {
        if (!this._writeContext.m3359d()) {
            StringBuilder stringBuilder = new StringBuilder("Current context not an object but ");
            stringBuilder.append(this._writeContext.m3360e());
            _reportError(stringBuilder.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1287a(this, this._writeContext.m3361f());
        } else {
            if (this.f20998k >= this.f20999l) {
                m19351c();
            }
            char[] cArr = this.f20996i;
            int i = this.f20998k;
            this.f20998k = i + 1;
            cArr[i] = '}';
        }
        this._writeContext = this._writeContext.m11004l();
    }

    public final void writeFieldName(C1382p c1382p) {
        int a = this._writeContext.m10996a(c1382p.getValue());
        if (a == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        a = a == 1 ? 1 : 0;
        char[] asQuotedChars;
        if (this._cfgPrettyPrinter != null) {
            if (a != 0) {
                this._cfgPrettyPrinter.mo1290c(this);
            } else {
                this._cfgPrettyPrinter.mo1295h(this);
            }
            asQuotedChars = c1382p.asQuotedChars();
            if (isEnabled(C1368a.QUOTE_FIELD_NAMES)) {
                if (this.f20998k >= this.f20999l) {
                    m19351c();
                }
                char[] cArr = this.f20996i;
                int i = this.f20998k;
                this.f20998k = i + 1;
                cArr[i] = '\"';
                writeRaw(asQuotedChars, 0, asQuotedChars.length);
                if (this.f20998k >= this.f20999l) {
                    m19351c();
                }
                asQuotedChars = this.f20996i;
                a = this.f20998k;
                this.f20998k = a + 1;
                asQuotedChars[a] = '\"';
                return;
            }
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        if (this.f20998k + 1 >= this.f20999l) {
            m19351c();
        }
        if (a != 0) {
            cArr = this.f20996i;
            int i2 = this.f20998k;
            this.f20998k = i2 + 1;
            cArr[i2] = ',';
        }
        asQuotedChars = c1382p.asQuotedChars();
        if (isEnabled(C1368a.QUOTE_FIELD_NAMES)) {
            cArr = this.f20996i;
            i2 = this.f20998k;
            this.f20998k = i2 + 1;
            cArr[i2] = '\"';
            a = asQuotedChars.length;
            if ((this.f20998k + a) + 1 >= this.f20999l) {
                writeRaw(asQuotedChars, 0, a);
                if (this.f20998k >= this.f20999l) {
                    m19351c();
                }
                asQuotedChars = this.f20996i;
                a = this.f20998k;
                this.f20998k = a + 1;
                asQuotedChars[a] = '\"';
                return;
            }
            System.arraycopy(asQuotedChars, 0, this.f20996i, this.f20998k, a);
            this.f20998k += a;
            asQuotedChars = this.f20996i;
            a = this.f20998k;
            this.f20998k = a + 1;
            asQuotedChars[a] = '\"';
            return;
        }
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
    }

    public final void writeFieldName(String str) {
        int a = this._writeContext.m10996a(str);
        if (a == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        a = a == 1 ? 1 : 0;
        if (this._cfgPrettyPrinter != null) {
            if (a != 0) {
                this._cfgPrettyPrinter.mo1290c(this);
            } else {
                this._cfgPrettyPrinter.mo1295h(this);
            }
            if (isEnabled(C1368a.QUOTE_FIELD_NAMES)) {
                if (this.f20998k >= this.f20999l) {
                    m19351c();
                }
                char[] cArr = this.f20996i;
                int i = this.f20998k;
                this.f20998k = i + 1;
                cArr[i] = '\"';
                m19352c(str);
                if (this.f20998k >= this.f20999l) {
                    m19351c();
                }
                char[] cArr2 = this.f20996i;
                a = this.f20998k;
                this.f20998k = a + 1;
                cArr2[a] = '\"';
                return;
            }
            m19352c(str);
            return;
        }
        if (this.f20998k + 1 >= this.f20999l) {
            m19351c();
        }
        if (a != 0) {
            cArr = this.f20996i;
            i = this.f20998k;
            this.f20998k = i + 1;
            cArr[i] = ',';
        }
        if (isEnabled(C1368a.QUOTE_FIELD_NAMES)) {
            cArr = this.f20996i;
            i = this.f20998k;
            this.f20998k = i + 1;
            cArr[i] = '\"';
            m19352c(str);
            if (this.f20998k >= this.f20999l) {
                m19351c();
            }
            cArr2 = this.f20996i;
            a = this.f20998k;
            this.f20998k = a + 1;
            cArr2[a] = '\"';
            return;
        }
        m19352c(str);
    }

    public final void writeNull() {
        _verifyValueWrite("write a null");
        m19345a();
    }

    public final void writeNumber(double d) {
        if (!this._cfgNumbersAsStrings) {
            if (isEnabled(C1368a.QUOTE_NON_NUMERIC_NUMBERS)) {
                if (!Double.isNaN(d)) {
                    if (Double.isInfinite(d)) {
                    }
                }
            }
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d));
            return;
        }
        writeString(String.valueOf(d));
    }

    public final void writeNumber(float f) {
        if (!this._cfgNumbersAsStrings) {
            if (isEnabled(C1368a.QUOTE_NON_NUMERIC_NUMBERS)) {
                if (!Float.isNaN(f)) {
                    if (Float.isInfinite(f)) {
                    }
                }
            }
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f));
            return;
        }
        writeString(String.valueOf(f));
    }

    public final void writeNumber(int i) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            if (this.f20998k + 13 >= this.f20999l) {
                m19351c();
            }
            char[] cArr = this.f20996i;
            int i2 = this.f20998k;
            this.f20998k = i2 + 1;
            cArr[i2] = '\"';
            this.f20998k = C1352h.m3237a(i, this.f20996i, this.f20998k);
            char[] cArr2 = this.f20996i;
            int i3 = this.f20998k;
            this.f20998k = i3 + 1;
            cArr2[i3] = '\"';
            return;
        }
        if (this.f20998k + 11 >= this.f20999l) {
            m19351c();
        }
        this.f20998k = C1352h.m3237a(i, this.f20996i, this.f20998k);
    }

    public final void writeNumber(long j) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            if (this.f20998k + 23 >= this.f20999l) {
                m19351c();
            }
            char[] cArr = this.f20996i;
            int i = this.f20998k;
            this.f20998k = i + 1;
            cArr[i] = '\"';
            this.f20998k = C1352h.m3239a(j, this.f20996i, this.f20998k);
            char[] cArr2 = this.f20996i;
            int i2 = this.f20998k;
            this.f20998k = i2 + 1;
            cArr2[i2] = '\"';
            return;
        }
        if (this.f20998k + 21 >= this.f20999l) {
            m19351c();
        }
        this.f20998k = C1352h.m3239a(j, this.f20996i, this.f20998k);
    }

    public final void writeNumber(String str) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            m19349b(str);
        } else {
            writeRaw(str);
        }
    }

    public final void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            m19345a();
        } else if (this._cfgNumbersAsStrings) {
            m19349b(isEnabled(C1368a.WRITE_BIGDECIMAL_AS_PLAIN) ? bigDecimal.toPlainString() : bigDecimal.toString());
        } else {
            writeRaw(isEnabled(C1368a.WRITE_BIGDECIMAL_AS_PLAIN) ? bigDecimal.toPlainString() : bigDecimal.toString());
        }
    }

    public final void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            m19345a();
        } else if (this._cfgNumbersAsStrings) {
            m19349b(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public final void writeNumber(short s) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            if (this.f20998k + 8 >= this.f20999l) {
                m19351c();
            }
            char[] cArr = this.f20996i;
            int i = this.f20998k;
            this.f20998k = i + 1;
            cArr[i] = '\"';
            this.f20998k = C1352h.m3237a((int) s, this.f20996i, this.f20998k);
            char[] cArr2 = this.f20996i;
            int i2 = this.f20998k;
            this.f20998k = i2 + 1;
            cArr2[i2] = '\"';
            return;
        }
        if (this.f20998k + 6 >= this.f20999l) {
            m19351c();
        }
        this.f20998k = C1352h.m3237a((int) s, this.f20996i, this.f20998k);
    }

    public final void writeRaw(char c) {
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = this.f20996i;
        int i = this.f20998k;
        this.f20998k = i + 1;
        cArr[i] = c;
    }

    public final void writeRaw(C1382p c1382p) {
        writeRaw(c1382p.getValue());
    }

    public final void writeRaw(String str) {
        int length = str.length();
        int i = this.f20999l - this.f20998k;
        if (i == 0) {
            m19351c();
            i = this.f20999l - this.f20998k;
        }
        if (i >= length) {
            str.getChars(0, length, this.f20996i, this.f20998k);
            this.f20998k += length;
            return;
        }
        m19347a(str);
    }

    public final void writeRaw(String str, int i, int i2) {
        int i3 = this.f20999l - this.f20998k;
        if (i3 < i2) {
            m19351c();
            i3 = this.f20999l - this.f20998k;
        }
        if (i3 >= i2) {
            str.getChars(i, i + i2, this.f20996i, this.f20998k);
            this.f20998k += i2;
            return;
        }
        m19347a(str.substring(i, i2 + i));
    }

    public final void writeRaw(char[] cArr, int i, int i2) {
        if (i2 < 32) {
            if (i2 > this.f20999l - this.f20998k) {
                m19351c();
            }
            System.arraycopy(cArr, i, this.f20996i, this.f20998k, i2);
            this.f20998k += i2;
            return;
        }
        m19351c();
        this.f20995h.write(cArr, i, i2);
    }

    public final void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public final void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.m11001i();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1292e(this);
            return;
        }
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = this.f20996i;
        int i = this.f20998k;
        this.f20998k = i + 1;
        cArr[i] = '[';
    }

    public final void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.m11002j();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1288b(this);
            return;
        }
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = this.f20996i;
        int i = this.f20998k;
        this.f20998k = i + 1;
        cArr[i] = '{';
    }

    public final void writeString(C1382p c1382p) {
        _verifyValueWrite("write a string");
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = this.f20996i;
        int i = this.f20998k;
        this.f20998k = i + 1;
        cArr[i] = '\"';
        Object asQuotedChars = c1382p.asQuotedChars();
        i = asQuotedChars.length;
        if (i < 32) {
            if (i > this.f20999l - this.f20998k) {
                m19351c();
            }
            System.arraycopy(asQuotedChars, 0, this.f20996i, this.f20998k, i);
            this.f20998k += i;
        } else {
            m19351c();
            this.f20995h.write(asQuotedChars, 0, i);
        }
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr2 = this.f20996i;
        int i2 = this.f20998k;
        this.f20998k = i2 + 1;
        cArr2[i2] = '\"';
    }

    public final void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            m19345a();
            return;
        }
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr = this.f20996i;
        int i = this.f20998k;
        this.f20998k = i + 1;
        cArr[i] = '\"';
        m19352c(str);
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr2 = this.f20996i;
        int i2 = this.f20998k;
        this.f20998k = i2 + 1;
        cArr2[i2] = '\"';
    }

    public final void writeString(char[] cArr, int i, int i2) {
        int i3;
        Object obj = cArr;
        _verifyValueWrite("write a string");
        if (this.f20998k >= this.f20999l) {
            m19351c();
        }
        char[] cArr2 = r0.f20996i;
        int i4 = r0.f20998k;
        r0.f20998k = i4 + 1;
        cArr2[i4] = '\"';
        int i5 = 0;
        int i6;
        int[] iArr;
        char c;
        int i7;
        if (r0.e == null) {
            if (r0.d == 0) {
                i6 = i2 + i;
                iArr = r0.c;
                char length = iArr.length;
                i3 = i;
                while (i3 < i6) {
                    i5 = i3;
                    do {
                        c = obj[i5];
                        if (c < length && iArr[c] != 0) {
                            break;
                        }
                        i5++;
                    } while (i5 < i6);
                    int i8 = i5 - i3;
                    if (i8 < 32) {
                        if (r0.f20998k + i8 > r0.f20999l) {
                            m19351c();
                        }
                        if (i8 > 0) {
                            System.arraycopy(obj, i3, r0.f20996i, r0.f20998k, i8);
                            r0.f20998k += i8;
                        }
                    } else {
                        m19351c();
                        r0.f20995h.write(obj, i3, i8);
                    }
                    if (i5 >= i6) {
                        break;
                    }
                    i3 = i5 + 1;
                    char c2 = obj[i5];
                    m19348b(c2, iArr[c2]);
                }
            } else {
                char c3 = r0.d;
                i6 = i2 + i;
                int[] iArr2 = r0.c;
                c = Math.min(iArr2.length, c3 + 1);
                i3 = i;
                while (i3 < i6) {
                    char c4;
                    int i9 = i5;
                    i5 = i3;
                    do {
                        c4 = obj[i5];
                        if (c4 >= c) {
                            if (c4 > c3) {
                                i9 = -1;
                                break;
                            }
                        }
                        i9 = iArr2[c4];
                        if (i9 != 0) {
                            break;
                        }
                        i5++;
                    } while (i5 < i6);
                    i7 = i5 - i3;
                    if (i7 < 32) {
                        if (r0.f20998k + i7 > r0.f20999l) {
                            m19351c();
                        }
                        if (i7 > 0) {
                            System.arraycopy(obj, i3, r0.f20996i, r0.f20998k, i7);
                            r0.f20998k += i7;
                        }
                    } else {
                        m19351c();
                        r0.f20995h.write(obj, i3, i7);
                    }
                    if (i5 >= i6) {
                        break;
                    }
                    i3 = i5 + 1;
                    m19348b(c4, i9);
                    i5 = i9;
                }
            }
        } else {
            i6 = i2 + i;
            iArr = r0.c;
            c = r0.d <= 0 ? '￿' : r0.d;
            char min = Math.min(iArr.length, c + 1);
            C1346b c1346b = r0.e;
            i3 = i;
            while (i3 < i6) {
                char c5;
                i7 = i5;
                i5 = i3;
                do {
                    c5 = obj[i5];
                    if (c5 >= min) {
                        if (c5 <= c) {
                            C1382p b = c1346b.m3189b();
                            r0.f21001n = b;
                            if (b != null) {
                                i7 = -2;
                                break;
                            }
                        }
                        i7 = -1;
                        break;
                    }
                    i7 = iArr[c5];
                    if (i7 != 0) {
                        break;
                    }
                    i5++;
                } while (i5 < i6);
                int i10 = i5 - i3;
                if (i10 < 32) {
                    if (r0.f20998k + i10 > r0.f20999l) {
                        m19351c();
                    }
                    if (i10 > 0) {
                        System.arraycopy(obj, i3, r0.f20996i, r0.f20998k, i10);
                        r0.f20998k += i10;
                    }
                } else {
                    m19351c();
                    r0.f20995h.write(obj, i3, i10);
                }
                if (i5 >= i6) {
                    break;
                }
                i3 = i5 + 1;
                m19348b(c5, i7);
                i5 = i7;
            }
        }
        if (r0.f20998k >= r0.f20999l) {
            m19351c();
        }
        char[] cArr3 = r0.f20996i;
        i3 = r0.f20998k;
        r0.f20998k = i3 + 1;
        cArr3[i3] = '\"';
    }

    public final void writeUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }
}
