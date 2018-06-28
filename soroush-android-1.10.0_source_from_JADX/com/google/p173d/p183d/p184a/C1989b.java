package com.google.p173d.p183d.p184a;

import com.google.p173d.p177b.C1969e;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1989b {
    private static final String[] f6678a = new String[]{"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    private static int m5458a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        int i2 = i;
        while (i < bArr2.length) {
            int i3 = bArr2[i] - 1;
            i2 += (((1 << (5 - (i3 % 6))) & bArr[i3 / 6]) == 0 ? 0 : 1) << ((bArr2.length - i) - 1);
            i++;
        }
        return i2;
    }

    public static C1969e m5459a(byte[] bArr, int i) {
        int i2;
        StringBuilder stringBuilder = new StringBuilder(IjkMediaMeta.FF_PROFILE_H264_HIGH_444);
        switch (i) {
            case 2:
            case 3:
                String format;
                if (i == 2) {
                    format = new DecimalFormat("0000000000".substring(0, C1989b.m5458a(bArr, new byte[]{(byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 31, (byte) 32}))).format((long) C1989b.m5458a(bArr, new byte[]{(byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 1, (byte) 2}));
                } else {
                    format = String.valueOf(new char[]{f6678a[0].charAt(C1989b.m5458a(bArr, new byte[]{(byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 31, (byte) 32})), f6678a[0].charAt(C1989b.m5458a(bArr, new byte[]{(byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 25, (byte) 26})), f6678a[0].charAt(C1989b.m5458a(bArr, new byte[]{(byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 19, (byte) 20})), f6678a[0].charAt(C1989b.m5458a(bArr, new byte[]{(byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 13, (byte) 14})), f6678a[0].charAt(C1989b.m5458a(bArr, new byte[]{(byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 7, (byte) 8})), f6678a[0].charAt(C1989b.m5458a(bArr, new byte[]{(byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 1, (byte) 2}))});
                }
                NumberFormat decimalFormat = new DecimalFormat("000");
                String format2 = decimalFormat.format((long) C1989b.m5458a(bArr, new byte[]{(byte) 53, (byte) 54, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 37, (byte) 38}));
                String format3 = decimalFormat.format((long) C1989b.m5458a(bArr, new byte[]{(byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 49, (byte) 50, (byte) 51, (byte) 52}));
                stringBuilder.append(C1989b.m5460a(bArr, 10, 84));
                if (!stringBuilder.toString().startsWith("[)>\u001e01\u001d")) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(format);
                    stringBuilder2.append('\u001d');
                    stringBuilder2.append(format2);
                    stringBuilder2.append('\u001d');
                    stringBuilder2.append(format3);
                    stringBuilder2.append('\u001d');
                    stringBuilder.insert(0, stringBuilder2.toString());
                    break;
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(format);
                stringBuilder3.append('\u001d');
                stringBuilder3.append(format2);
                stringBuilder3.append('\u001d');
                stringBuilder3.append(format3);
                stringBuilder3.append('\u001d');
                stringBuilder.insert(9, stringBuilder3.toString());
                break;
            case 4:
                i2 = 93;
                break;
            case 5:
                i2 = 77;
                break;
            default:
                break;
        }
        stringBuilder.append(C1989b.m5460a(bArr, 1, i2));
        return new C1969e(bArr, stringBuilder.toString(), null, String.valueOf(i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m5460a(byte[] r12, int r13, int r14) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 0;
        r2 = -1;
        r3 = r13;
        r4 = r1;
        r6 = r4;
        r5 = r2;
    L_0x000b:
        r7 = r13 + r14;
        r8 = 1;
        if (r3 >= r7) goto L_0x0069;
    L_0x0010:
        r7 = f6678a;
        r7 = r7[r4];
        r9 = r12[r3];
        r7 = r7.charAt(r9);
        switch(r7) {
            case 65520: goto L_0x0059;
            case 65521: goto L_0x0059;
            case 65522: goto L_0x0059;
            case 65523: goto L_0x0059;
            case 65524: goto L_0x0059;
            case 65525: goto L_0x0055;
            case 65526: goto L_0x0053;
            case 65527: goto L_0x0050;
            case 65528: goto L_0x004d;
            case 65529: goto L_0x0051;
            case 65530: goto L_0x001d;
            case 65531: goto L_0x0021;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0.append(r7);
        goto L_0x0061;
    L_0x0021:
        r3 = r3 + 1;
        r7 = r12[r3];
        r7 = r7 << 24;
        r3 = r3 + r8;
        r9 = r12[r3];
        r9 = r9 << 18;
        r7 = r7 + r9;
        r3 = r3 + r8;
        r9 = r12[r3];
        r9 = r9 << 12;
        r7 = r7 + r9;
        r3 = r3 + r8;
        r9 = r12[r3];
        r9 = r9 << 6;
        r7 = r7 + r9;
        r3 = r3 + r8;
        r9 = r12[r3];
        r7 = r7 + r9;
        r9 = new java.text.DecimalFormat;
        r10 = "000000000";
        r9.<init>(r10);
        r10 = (long) r7;
        r7 = r9.format(r10);
        r0.append(r7);
        goto L_0x0061;
    L_0x004d:
        r5 = r2;
        r4 = r8;
        goto L_0x0061;
    L_0x0050:
        r4 = r1;
    L_0x0051:
        r5 = r2;
        goto L_0x0061;
    L_0x0053:
        r5 = 3;
        goto L_0x0056;
    L_0x0055:
        r5 = 2;
    L_0x0056:
        r6 = r4;
        r4 = r1;
        goto L_0x0061;
    L_0x0059:
        r5 = 65520; // 0xfff0 float:9.1813E-41 double:3.2371E-319;
        r5 = r7 - r5;
        r6 = r4;
        r4 = r5;
        r5 = r8;
    L_0x0061:
        r7 = r5 + -1;
        if (r5 != 0) goto L_0x0066;
    L_0x0065:
        r4 = r6;
    L_0x0066:
        r3 = r3 + r8;
        r5 = r7;
        goto L_0x000b;
    L_0x0069:
        r12 = r0.length();
        if (r12 <= 0) goto L_0x0086;
    L_0x006f:
        r12 = r0.length();
        r12 = r12 - r8;
        r12 = r0.charAt(r12);
        r13 = 65532; // 0xfffc float:9.183E-41 double:3.2377E-319;
        if (r12 != r13) goto L_0x0086;
    L_0x007d:
        r12 = r0.length();
        r12 = r12 - r8;
        r0.setLength(r12);
        goto L_0x0069;
    L_0x0086:
        r12 = r0.toString();
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.d.a.b.a(byte[], int, int):java.lang.String");
    }
}
