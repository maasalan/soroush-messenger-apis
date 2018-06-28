package com.p111d.p112a.p114b;

import com.p111d.p112a.p114b.p120g.C1369b;
import java.io.Serializable;
import java.util.Arrays;

public final class C1341a implements Serializable {
    protected final String f4160a;
    protected final transient boolean f4161b;
    protected final transient char f4162c;
    protected final transient int f4163d;
    private final transient int[] f4164e;
    private final transient char[] f4165f;
    private final transient byte[] f4166g;

    public C1341a(C1341a c1341a, String str) {
        this(c1341a, str, c1341a.f4161b, c1341a.f4162c, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public C1341a(C1341a c1341a, String str, boolean z, char c, int i) {
        this.f4164e = new int[128];
        this.f4165f = new char[64];
        this.f4166g = new byte[64];
        this.f4160a = str;
        Object obj = c1341a.f4166g;
        System.arraycopy(obj, 0, this.f4166g, 0, obj.length);
        obj = c1341a.f4165f;
        System.arraycopy(obj, 0, this.f4165f, 0, obj.length);
        Object obj2 = c1341a.f4164e;
        System.arraycopy(obj2, 0, this.f4164e, 0, obj2.length);
        this.f4161b = z;
        this.f4162c = c;
        this.f4163d = i;
    }

    public C1341a(String str, String str2, boolean z, char c, int i) {
        this.f4164e = new int[128];
        this.f4165f = new char[64];
        this.f4166g = new byte[64];
        this.f4160a = str;
        this.f4161b = z;
        this.f4162c = c;
        this.f4163d = i;
        int length = str2.length();
        if (length != 64) {
            StringBuilder stringBuilder = new StringBuilder("Base64Alphabet length must be exactly 64 (was ");
            stringBuilder.append(length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i2 = 0;
        str2.getChars(0, length, this.f4165f, 0);
        Arrays.fill(this.f4164e, -1);
        while (i2 < length) {
            char c2 = this.f4165f[i2];
            this.f4166g[i2] = (byte) c2;
            this.f4164e[c2] = i2;
            i2++;
        }
        if (z) {
            this.f4164e[c] = -2;
        }
    }

    private void m3159a(char c, int i, String str) {
        String stringBuilder;
        StringBuilder stringBuilder2;
        if (c <= ' ') {
            StringBuilder stringBuilder3 = new StringBuilder("Illegal white space character (code 0x");
            stringBuilder3.append(Integer.toHexString(c));
            stringBuilder3.append(") as character #");
            stringBuilder3.append(i + 1);
            stringBuilder3.append(" of 4-char base64 unit: can only used between units");
            stringBuilder = stringBuilder3.toString();
        } else if (m3168a(c)) {
            StringBuilder stringBuilder4 = new StringBuilder("Unexpected padding character ('");
            stringBuilder4.append(this.f4162c);
            stringBuilder4.append("') as character #");
            stringBuilder4.append(i + 1);
            stringBuilder4.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            stringBuilder = stringBuilder4.toString();
        } else {
            if (Character.isDefined(c)) {
                if (!Character.isISOControl(c)) {
                    stringBuilder2 = new StringBuilder("Illegal character '");
                    stringBuilder2.append(c);
                    stringBuilder2.append("' (code 0x");
                    stringBuilder2.append(Integer.toHexString(c));
                    stringBuilder2.append(") in base64 content");
                    stringBuilder = stringBuilder2.toString();
                }
            }
            stringBuilder2 = new StringBuilder("Illegal character (code 0x");
            stringBuilder2.append(Integer.toHexString(c));
            stringBuilder2.append(") in base64 content");
            stringBuilder = stringBuilder2.toString();
        }
        if (str != null) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(stringBuilder);
            stringBuilder2.append(": ");
            stringBuilder2.append(str);
            stringBuilder = stringBuilder2.toString();
        }
        throw new IllegalArgumentException(stringBuilder);
    }

    private static void m3160d() {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    public final int m3161a(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        bArr[i3] = this.f4166g[(i >> 18) & 63];
        i3 = i4 + 1;
        bArr[i4] = this.f4166g[(i >> 12) & 63];
        if (this.f4161b) {
            byte b = (byte) this.f4162c;
            int i5 = i3 + 1;
            bArr[i3] = i2 == 2 ? this.f4166g[(i >> 6) & 63] : b;
            i3 = i5 + 1;
            bArr[i5] = b;
            return i3;
        }
        if (i2 == 2) {
            i2 = i3 + 1;
            bArr[i3] = this.f4166g[(i >> 6) & 63];
            i3 = i2;
        }
        return i3;
    }

    public final int m3162a(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        cArr[i3] = this.f4165f[(i >> 18) & 63];
        i3 = i4 + 1;
        cArr[i4] = this.f4165f[(i >> 12) & 63];
        if (this.f4161b) {
            i4 = i3 + 1;
            cArr[i3] = i2 == 2 ? this.f4165f[(i >> 6) & 63] : this.f4162c;
            i3 = i4 + 1;
            cArr[i4] = this.f4162c;
            return i3;
        }
        if (i2 == 2) {
            i2 = i3 + 1;
            cArr[i3] = this.f4165f[(i >> 6) & 63];
            i3 = i2;
        }
        return i3;
    }

    public final int m3163a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = this.f4166g[(i >> 18) & 63];
        i2 = i3 + 1;
        bArr[i3] = this.f4166g[(i >> 12) & 63];
        i3 = i2 + 1;
        bArr[i2] = this.f4166g[(i >> 6) & 63];
        i2 = i3 + 1;
        bArr[i3] = this.f4166g[i & 63];
        return i2;
    }

    public final int m3164a(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        cArr[i2] = this.f4165f[(i >> 18) & 63];
        i2 = i3 + 1;
        cArr[i3] = this.f4165f[(i >> 12) & 63];
        i3 = i2 + 1;
        cArr[i2] = this.f4165f[(i >> 6) & 63];
        i2 = i3 + 1;
        cArr[i3] = this.f4165f[i & 63];
        return i2;
    }

    public final String m3165a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder stringBuilder = new StringBuilder(((length >> 2) + length) + (length >> 3));
        if (z) {
            stringBuilder.append('\"');
        }
        int i = this.f4163d >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            i4 = i5 + 1;
            i2 = (((bArr[i2] << 8) | (bArr[i4] & 255)) << 8) | (bArr[i5] & 255);
            stringBuilder.append(this.f4165f[(i2 >> 18) & 63]);
            stringBuilder.append(this.f4165f[(i2 >> 12) & 63]);
            stringBuilder.append(this.f4165f[(i2 >> 6) & 63]);
            stringBuilder.append(this.f4165f[i2 & 63]);
            i--;
            if (i <= 0) {
                stringBuilder.append('\\');
                stringBuilder.append('n');
                i = this.f4163d >> 2;
            }
            i2 = i4;
        }
        length -= i2;
        if (length > 0) {
            char c;
            i = i2 + 1;
            i2 = bArr[i2] << 16;
            if (length == 2) {
                i2 |= (bArr[i] & 255) << 8;
            }
            stringBuilder.append(this.f4165f[(i2 >> 18) & 63]);
            stringBuilder.append(this.f4165f[(i2 >> 12) & 63]);
            if (this.f4161b) {
                stringBuilder.append(length == 2 ? this.f4165f[(i2 >> 6) & 63] : this.f4162c);
                c = this.f4162c;
            } else if (length == 2) {
                c = this.f4165f[(i2 >> 6) & 63];
            }
            stringBuilder.append(c);
        }
        if (z) {
            stringBuilder.append('\"');
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m3166a(java.lang.String r11, com.p111d.p112a.p114b.p120g.C1369b r12) {
        /*
        r10 = this;
        r0 = r11.length();
        r1 = 0;
        r2 = r1;
    L_0x0006:
        if (r2 >= r0) goto L_0x00be;
    L_0x0008:
        r3 = r2 + 1;
        r2 = r11.charAt(r2);
        if (r3 >= r0) goto L_0x00be;
    L_0x0010:
        r4 = 32;
        if (r2 <= r4) goto L_0x00bb;
    L_0x0014:
        r4 = r10.m3172b(r2);
        r5 = 0;
        if (r4 >= 0) goto L_0x001e;
    L_0x001b:
        r10.m3159a(r2, r1, r5);
    L_0x001e:
        if (r3 < r0) goto L_0x0023;
    L_0x0020:
        com.p111d.p112a.p114b.C1341a.m3160d();
    L_0x0023:
        r2 = r3 + 1;
        r3 = r11.charAt(r3);
        r6 = r10.m3172b(r3);
        if (r6 >= 0) goto L_0x0033;
    L_0x002f:
        r7 = 1;
        r10.m3159a(r3, r7, r5);
    L_0x0033:
        r3 = r4 << 6;
        r3 = r3 | r6;
        if (r2 < r0) goto L_0x0045;
    L_0x0038:
        r4 = r10.f4161b;
        if (r4 != 0) goto L_0x0042;
    L_0x003c:
        r11 = r3 >> 4;
        r12.m3319a(r11);
        return;
    L_0x0042:
        com.p111d.p112a.p114b.C1341a.m3160d();
    L_0x0045:
        r4 = r2 + 1;
        r2 = r11.charAt(r2);
        r6 = r10.m3172b(r2);
        r7 = 3;
        r8 = -2;
        r9 = 2;
        if (r6 >= 0) goto L_0x0089;
    L_0x0054:
        if (r6 == r8) goto L_0x0059;
    L_0x0056:
        r10.m3159a(r2, r9, r5);
    L_0x0059:
        if (r4 < r0) goto L_0x005e;
    L_0x005b:
        com.p111d.p112a.p114b.C1341a.m3160d();
    L_0x005e:
        r2 = r4 + 1;
        r4 = r11.charAt(r4);
        r5 = r10.m3168a(r4);
        if (r5 != 0) goto L_0x0082;
    L_0x006a:
        r5 = new java.lang.StringBuilder;
        r6 = "expected padding character '";
        r5.<init>(r6);
        r6 = r10.f4162c;
        r5.append(r6);
        r6 = "'";
        r5.append(r6);
        r5 = r5.toString();
        r10.m3159a(r4, r7, r5);
    L_0x0082:
        r3 = r3 >> 4;
        r12.m3319a(r3);
        goto L_0x0006;
    L_0x0089:
        r2 = r3 << 6;
        r2 = r2 | r6;
        if (r4 < r0) goto L_0x009b;
    L_0x008e:
        r3 = r10.f4161b;
        if (r3 != 0) goto L_0x0098;
    L_0x0092:
        r11 = r2 >> 2;
        r12.m3320b(r11);
        return;
    L_0x0098:
        com.p111d.p112a.p114b.C1341a.m3160d();
    L_0x009b:
        r3 = r4 + 1;
        r4 = r11.charAt(r4);
        r6 = r10.m3172b(r4);
        if (r6 >= 0) goto L_0x00b2;
    L_0x00a7:
        if (r6 == r8) goto L_0x00ac;
    L_0x00a9:
        r10.m3159a(r4, r7, r5);
    L_0x00ac:
        r2 = r2 >> 2;
        r12.m3320b(r2);
        goto L_0x00b8;
    L_0x00b2:
        r2 = r2 << 6;
        r2 = r2 | r6;
        r12.m3322c(r2);
    L_0x00b8:
        r2 = r3;
        goto L_0x0006;
    L_0x00bb:
        r2 = r3;
        goto L_0x0008;
    L_0x00be:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.a.a(java.lang.String, com.d.a.b.g.b):void");
    }

    public final boolean m3167a() {
        return this.f4161b;
    }

    public final boolean m3168a(char c) {
        return c == this.f4162c;
    }

    public final boolean m3169a(int i) {
        return i == this.f4162c;
    }

    public final byte[] m3170a(String str) {
        C1369b c1369b = new C1369b();
        m3166a(str, c1369b);
        return c1369b.m3321b();
    }

    public final char m3171b() {
        return this.f4162c;
    }

    public final int m3172b(char c) {
        return c <= '' ? this.f4164e[c] : -1;
    }

    public final int m3173b(int i) {
        return i <= 127 ? this.f4164e[i] : -1;
    }

    public final int m3174c() {
        return this.f4163d;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f4160a.hashCode();
    }

    public final String toString() {
        return this.f4160a;
    }
}
