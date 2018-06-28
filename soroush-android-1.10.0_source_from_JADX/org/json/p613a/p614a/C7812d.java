package org.json.p613a.p614a;

import java.io.Reader;

final class C7812d {
    private static final int[] f24849l = new int[]{0, 0, 1, 1};
    private static final char[] f24850m;
    private static final int[] f24851n;
    private static final int[] f24852o;
    private static final int[] f24853p = new int[]{2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final String[] f24854q = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
    private static final int[] f24855r;
    Reader f24856a = null;
    int f24857b = 0;
    int f24858c;
    int f24859d;
    int f24860e;
    int f24861f;
    int f24862g;
    int f24863h;
    int f24864i;
    boolean f24865j = true;
    boolean f24866k;
    private int f24867s;
    private char[] f24868t = new char[16384];
    private StringBuffer f24869u = new StringBuffer();

    static {
        int i;
        int i2;
        String str = "\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000";
        char[] cArr = new char[65536];
        int i3 = 0;
        int i4 = 0;
        int i5 = i4;
        while (i4 < 90) {
            int i6;
            i = i4 + 1;
            i4 = str.charAt(i4);
            i2 = i + 1;
            char charAt = str.charAt(i);
            while (true) {
                i6 = i5 + 1;
                cArr[i5] = charAt;
                i4--;
                if (i4 <= 0) {
                    break;
                }
                i5 = i6;
            }
            i4 = i2;
            i5 = i6;
        }
        f24850m = cArr;
        int[] iArr = new int[45];
        String str2 = "\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018";
        i5 = str2.length();
        i = 0;
        i2 = i;
        while (i < i5) {
            int i7;
            i6 = i + 1;
            i = str2.charAt(i);
            int i8 = i6 + 1;
            char charAt2 = str2.charAt(i6);
            while (true) {
                i7 = i2 + 1;
                iArr[i2] = charAt2;
                i--;
                if (i <= 0) {
                    break;
                }
                i2 = i7;
            }
            i = i8;
            i2 = i7;
        }
        f24851n = iArr;
        iArr = new int[45];
        str2 = "\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006";
        i5 = str2.length();
        i = 0;
        i2 = i;
        while (i < i5) {
            i6 = i + 1;
            i8 = i2 + 1;
            i7 = i6 + 1;
            iArr[i2] = (str2.charAt(i) << 16) | str2.charAt(i6);
            i2 = i8;
            i = i7;
        }
        f24852o = iArr;
        int[] iArr2 = new int[45];
        String str3 = "\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t";
        i4 = str3.length();
        i5 = 0;
        while (i3 < i4) {
            i = i3 + 1;
            i3 = str3.charAt(i3);
            i2 = i + 1;
            charAt = str3.charAt(i);
            while (true) {
                i6 = i5 + 1;
                iArr2[i5] = charAt;
                i3--;
                if (i3 <= 0) {
                    break;
                }
                i5 = i6;
            }
            i3 = i2;
            i5 = i6;
        }
        f24855r = iArr2;
    }

    C7812d() {
    }

    private String m22087b() {
        return new String(this.f24868t, this.f24860e, this.f24858c - this.f24860e);
    }

    public final org.json.p613a.p614a.C7813e m22088a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r18 = this;
        r1 = r18;
        r2 = r1.f24861f;
        r3 = r1.f24868t;
        r4 = f24850m;
        r5 = f24853p;
        r6 = f24852o;
        r7 = f24855r;
    L_0x000e:
        r8 = r1.f24858c;
        r9 = r1.f24863h;
        r10 = r1.f24860e;
        r10 = r8 - r10;
        r9 = r9 + r10;
        r1.f24863h = r9;
        r1.f24860e = r8;
        r1.f24859d = r8;
        r9 = f24849l;
        r10 = r1.f24857b;
        r9 = r9[r10];
        r1.f24867s = r9;
        r9 = -1;
        r10 = r3;
        r3 = r8;
        r11 = r9;
    L_0x0029:
        r13 = 2;
        r14 = 1;
        r15 = 0;
        if (r8 < r2) goto L_0x00b6;
    L_0x002e:
        r12 = r1.f24866k;
        if (r12 == 0) goto L_0x0035;
    L_0x0032:
        r8 = r9;
        goto L_0x00e0;
    L_0x0035:
        r1.f24859d = r8;
        r1.f24858c = r3;
        r2 = r1.f24860e;
        if (r2 <= 0) goto L_0x0062;
    L_0x003d:
        r2 = r1.f24868t;
        r3 = r1.f24860e;
        r8 = r1.f24868t;
        r10 = r1.f24861f;
        r12 = r1.f24860e;
        r10 = r10 - r12;
        java.lang.System.arraycopy(r2, r3, r8, r15, r10);
        r2 = r1.f24861f;
        r3 = r1.f24860e;
        r2 = r2 - r3;
        r1.f24861f = r2;
        r2 = r1.f24859d;
        r3 = r1.f24860e;
        r2 = r2 - r3;
        r1.f24859d = r2;
        r2 = r1.f24858c;
        r3 = r1.f24860e;
        r2 = r2 - r3;
        r1.f24858c = r2;
        r1.f24860e = r15;
    L_0x0062:
        r2 = r1.f24859d;
        r3 = r1.f24868t;
        r3 = r3.length;
        if (r2 < r3) goto L_0x0078;
    L_0x0069:
        r2 = r1.f24859d;
        r2 = r2 * r13;
        r2 = new char[r2];
        r3 = r1.f24868t;
        r8 = r1.f24868t;
        r8 = r8.length;
        java.lang.System.arraycopy(r3, r15, r2, r15, r8);
        r1.f24868t = r2;
    L_0x0078:
        r2 = r1.f24856a;
        r3 = r1.f24868t;
        r8 = r1.f24861f;
        r10 = r1.f24868t;
        r10 = r10.length;
        r12 = r1.f24861f;
        r10 = r10 - r12;
        r2 = r2.read(r3, r8, r10);
        if (r2 <= 0) goto L_0x0091;
    L_0x008a:
        r3 = r1.f24861f;
        r3 = r3 + r2;
        r1.f24861f = r3;
    L_0x008f:
        r2 = r15;
        goto L_0x00a8;
    L_0x0091:
        if (r2 != 0) goto L_0x00a7;
    L_0x0093:
        r2 = r1.f24856a;
        r2 = r2.read();
        if (r2 == r9) goto L_0x00a7;
    L_0x009b:
        r3 = r1.f24868t;
        r8 = r1.f24861f;
        r10 = r8 + 1;
        r1.f24861f = r10;
        r2 = (char) r2;
        r3[r8] = r2;
        goto L_0x008f;
    L_0x00a7:
        r2 = r14;
    L_0x00a8:
        r8 = r1.f24859d;
        r3 = r1.f24858c;
        r10 = r1.f24868t;
        r12 = r1.f24861f;
        if (r2 == 0) goto L_0x00b5;
    L_0x00b2:
        r8 = r9;
        r2 = r12;
        goto L_0x00e0;
    L_0x00b5:
        r2 = r12;
    L_0x00b6:
        r12 = r8 + 1;
        r8 = r10[r8];
        r15 = r1.f24867s;
        r15 = r6[r15];
        r16 = r4[r8];
        r15 = r15 + r16;
        r15 = r5[r15];
        if (r15 == r9) goto L_0x00e0;
    L_0x00c6:
        r1.f24867s = r15;
        r15 = r1.f24867s;
        r15 = r7[r15];
        r9 = r15 & 1;
        if (r9 != r14) goto L_0x00dc;
    L_0x00d0:
        r11 = r1.f24867s;
        r3 = r15 & 8;
        r9 = 8;
        if (r3 == r9) goto L_0x00da;
    L_0x00d8:
        r3 = r12;
        goto L_0x00dc;
    L_0x00da:
        r3 = r12;
        goto L_0x00e0;
    L_0x00dc:
        r8 = r12;
        r9 = -1;
        goto L_0x0029;
    L_0x00e0:
        r1.f24858c = r3;
        if (r11 >= 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00e9;
    L_0x00e5:
        r3 = f24851n;
        r11 = r3[r11];
    L_0x00e9:
        r3 = 0;
        switch(r11) {
            case 1: goto L_0x01cb;
            case 2: goto L_0x01bc;
            case 3: goto L_0x01b9;
            case 4: goto L_0x01ab;
            case 5: goto L_0x01a5;
            case 6: goto L_0x019f;
            case 7: goto L_0x0198;
            case 8: goto L_0x0191;
            case 9: goto L_0x018a;
            case 10: goto L_0x0183;
            case 11: goto L_0x0179;
            case 12: goto L_0x0174;
            case 13: goto L_0x0165;
            case 14: goto L_0x0160;
            case 15: goto L_0x015b;
            case 16: goto L_0x0156;
            case 17: goto L_0x0151;
            case 18: goto L_0x014c;
            case 19: goto L_0x0147;
            case 20: goto L_0x013e;
            case 21: goto L_0x012f;
            case 22: goto L_0x0128;
            case 23: goto L_0x0119;
            case 24: goto L_0x00f9;
            case 25: goto L_0x01b9;
            case 26: goto L_0x01b9;
            case 27: goto L_0x01b9;
            case 28: goto L_0x01b9;
            case 29: goto L_0x01b9;
            case 30: goto L_0x01b9;
            case 31: goto L_0x01b9;
            case 32: goto L_0x01b9;
            case 33: goto L_0x01b9;
            case 34: goto L_0x01b9;
            case 35: goto L_0x01b9;
            case 36: goto L_0x01b9;
            case 37: goto L_0x01b9;
            case 38: goto L_0x01b9;
            case 39: goto L_0x01b9;
            case 40: goto L_0x01b9;
            case 41: goto L_0x01b9;
            case 42: goto L_0x01b9;
            case 43: goto L_0x01b9;
            case 44: goto L_0x01b9;
            case 45: goto L_0x01b9;
            case 46: goto L_0x01b9;
            case 47: goto L_0x01b9;
            case 48: goto L_0x01b9;
            default: goto L_0x00ed;
        };
    L_0x00ed:
        r2 = -1;
        if (r8 != r2) goto L_0x01e0;
    L_0x00f0:
        r2 = r1.f24860e;
        r4 = r1.f24859d;
        if (r2 != r4) goto L_0x01e0;
    L_0x00f6:
        r1.f24866k = r14;
        return r3;
    L_0x00f9:
        r3 = r18.m22087b();	 Catch:{ Exception -> 0x010f }
        r3 = r3.substring(r13);	 Catch:{ Exception -> 0x010f }
        r8 = 16;	 Catch:{ Exception -> 0x010f }
        r3 = java.lang.Integer.parseInt(r3, r8);	 Catch:{ Exception -> 0x010f }
        r8 = r1.f24869u;	 Catch:{ Exception -> 0x010f }
        r3 = (char) r3;	 Catch:{ Exception -> 0x010f }
        r8.append(r3);	 Catch:{ Exception -> 0x010f }
        goto L_0x01b9;
    L_0x010f:
        r0 = move-exception;
        r2 = r0;
        r3 = new org.json.a.a.c;
        r4 = r1.f24863h;
        r3.<init>(r4, r13, r2);
        throw r3;
    L_0x0119:
        r2 = r18.m22087b();
        r2 = java.lang.Boolean.valueOf(r2);
        r3 = new org.json.a.a.e;
        r4 = 0;
        r3.<init>(r4, r2);
        return r3;
    L_0x0128:
        r4 = 0;
        r2 = new org.json.a.a.e;
        r2.<init>(r4, r3);
        return r2;
    L_0x012f:
        r4 = 0;
        r2 = r18.m22087b();
        r2 = java.lang.Double.valueOf(r2);
        r3 = new org.json.a.a.e;
        r3.<init>(r4, r2);
        return r3;
    L_0x013e:
        r3 = r1.f24869u;
        r8 = 9;
    L_0x0142:
        r3.append(r8);
        goto L_0x01b9;
    L_0x0147:
        r3 = r1.f24869u;
        r8 = 13;
        goto L_0x0142;
    L_0x014c:
        r3 = r1.f24869u;
        r8 = 10;
        goto L_0x0142;
    L_0x0151:
        r3 = r1.f24869u;
        r8 = 12;
        goto L_0x0142;
    L_0x0156:
        r3 = r1.f24869u;
        r8 = 8;
        goto L_0x0142;
    L_0x015b:
        r3 = r1.f24869u;
        r8 = 47;
        goto L_0x0142;
    L_0x0160:
        r3 = r1.f24869u;
        r8 = 34;
        goto L_0x0142;
    L_0x0165:
        r3 = 0;
        r1.f24857b = r3;
        r2 = new org.json.a.a.e;
        r4 = r1.f24869u;
        r4 = r4.toString();
        r2.<init>(r3, r4);
        return r2;
    L_0x0174:
        r3 = r1.f24869u;
        r8 = 92;
        goto L_0x0142;
    L_0x0179:
        r3 = r1.f24869u;
        r8 = r18.m22087b();
        r3.append(r8);
        goto L_0x01b9;
    L_0x0183:
        r2 = new org.json.a.a.e;
        r4 = 6;
        r2.<init>(r4, r3);
        return r2;
    L_0x018a:
        r2 = new org.json.a.a.e;
        r4 = 5;
        r2.<init>(r4, r3);
        return r2;
    L_0x0191:
        r2 = new org.json.a.a.e;
        r4 = 4;
        r2.<init>(r4, r3);
        return r2;
    L_0x0198:
        r2 = new org.json.a.a.e;
        r4 = 3;
        r2.<init>(r4, r3);
        return r2;
    L_0x019f:
        r2 = new org.json.a.a.e;
        r2.<init>(r13, r3);
        return r2;
    L_0x01a5:
        r2 = new org.json.a.a.e;
        r2.<init>(r14, r3);
        return r2;
    L_0x01ab:
        r3 = r1.f24869u;
        r8 = r1.f24869u;
        r8 = r8.length();
        r9 = 0;
        r3.delete(r9, r8);
        r1.f24857b = r13;
    L_0x01b9:
        r3 = r10;
        goto L_0x000e;
    L_0x01bc:
        r9 = 0;
        r2 = r18.m22087b();
        r2 = java.lang.Long.valueOf(r2);
        r3 = new org.json.a.a.e;
        r3.<init>(r9, r2);
        return r3;
    L_0x01cb:
        r9 = 0;
        r2 = new org.json.a.a.c;
        r3 = r1.f24863h;
        r4 = new java.lang.Character;
        r5 = r1.f24868t;
        r6 = r1.f24860e;
        r6 = r6 + r9;
        r5 = r5[r6];
        r4.<init>(r5);
        r2.<init>(r3, r9, r4);
        throw r2;
    L_0x01e0:
        r2 = f24854q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01e5 }
        r2 = r2[r14];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01e5 }
        goto L_0x01ea;
    L_0x01e5:
        r2 = f24854q;
        r3 = 0;
        r2 = r2[r3];
    L_0x01ea:
        r3 = new java.lang.Error;
        r3.<init>(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.a.a.d.a():org.json.a.a.e");
    }
}
