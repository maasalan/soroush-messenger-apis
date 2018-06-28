package org.jivesoftware.smack.util.stringencoder;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import org.jivesoftware.smack.util.StringUtils;

public class Base32 {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ2345678";
    private static final StringEncoder base32Stringencoder = new C79021();

    static class C79021 implements StringEncoder {
        C79021() {
        }

        public final String decode(String str) {
            return Base32.decode(str);
        }

        public final String encode(String str) {
            return Base32.encode(str);
        }
    }

    public static java.lang.String decode(java.lang.String r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r2 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00e8 }
        r3 = r19;	 Catch:{ UnsupportedEncodingException -> 0x00e8 }
        r2 = r3.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x00e8 }
        r3 = 0;
        r4 = r3;
    L_0x000f:
        r5 = r2.length;
        if (r4 >= r5) goto L_0x0026;
    L_0x0012:
        r5 = r2[r4];
        r5 = (char) r5;
        r6 = java.lang.Character.isWhitespace(r5);
        if (r6 != 0) goto L_0x0023;
    L_0x001b:
        r5 = java.lang.Character.toUpperCase(r5);
        r5 = (byte) r5;
        r1.write(r5);
    L_0x0023:
        r4 = r4 + 1;
        goto L_0x000f;
    L_0x0026:
        r2 = r1.size();
        r4 = 8;
        r2 = r2 % r4;
        r5 = 56;
        if (r2 == 0) goto L_0x0035;
    L_0x0031:
        r1.write(r5);
        goto L_0x0026;
    L_0x0035:
        r2 = r1.toByteArray();
        r1.reset();
        r6 = new java.io.DataOutputStream;
        r6.<init>(r1);
        r7 = r3;
    L_0x0042:
        r8 = r2.length;
        r8 = r8 / r4;
        if (r7 >= r8) goto L_0x00d4;
    L_0x0046:
        r8 = new short[r4];
        r9 = 5;
        r10 = new int[r9];
        r11 = r3;
        r12 = r4;
    L_0x004d:
        r13 = 0;
        if (r11 >= r4) goto L_0x006d;
    L_0x0050:
        r14 = r7 * 8;
        r14 = r14 + r11;
        r15 = r2[r14];
        r15 = (char) r15;
        if (r15 == r5) goto L_0x006d;
    L_0x0058:
        r15 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ2345678";
        r14 = r2[r14];
        r14 = r15.indexOf(r14);
        r14 = (short) r14;
        r8[r11] = r14;
        r14 = r8[r11];
        if (r14 >= 0) goto L_0x0068;
    L_0x0067:
        return r13;
    L_0x0068:
        r12 = r12 + -1;
        r11 = r11 + 1;
        goto L_0x004d;
    L_0x006d:
        r11 = paddingToLen(r12);
        if (r11 >= 0) goto L_0x0074;
    L_0x0073:
        return r13;
    L_0x0074:
        r12 = r8[r3];
        r13 = 3;
        r12 = r12 << r13;
        r14 = 1;
        r15 = r8[r14];
        r16 = 2;
        r15 = r15 >> 2;
        r12 = r12 | r15;
        r10[r3] = r12;
        r12 = r8[r14];
        r12 = r12 & r13;
        r15 = 6;
        r12 = r12 << r15;
        r17 = r8[r16];
        r17 = r17 << 1;
        r12 = r12 | r17;
        r17 = r8[r13];
        r18 = 4;
        r17 = r17 >> 4;
        r12 = r12 | r17;
        r10[r14] = r12;
        r12 = r8[r13];
        r12 = r12 & 15;
        r12 = r12 << 4;
        r17 = r8[r18];
        r14 = r17 >> 1;
        r14 = r14 & 15;
        r12 = r12 | r14;
        r10[r16] = r12;
        r12 = r8[r18];
        r14 = 7;
        r12 = r12 << r14;
        r17 = r8[r9];
        r16 = r17 << 2;
        r12 = r12 | r16;
        r16 = r8[r15];
        r16 = r16 >> 3;
        r12 = r12 | r16;
        r10[r13] = r12;
        r12 = r8[r15];
        r12 = r12 & r14;
        r9 = r12 << 5;
        r8 = r8[r14];
        r8 = r8 | r9;
        r10[r18] = r8;
        r8 = r3;
    L_0x00c3:
        if (r8 >= r11) goto L_0x00d0;
    L_0x00c5:
        r9 = r10[r8];	 Catch:{ IOException -> 0x00d0 }
        r9 = r9 & 255;	 Catch:{ IOException -> 0x00d0 }
        r9 = (byte) r9;	 Catch:{ IOException -> 0x00d0 }
        r6.writeByte(r9);	 Catch:{ IOException -> 0x00d0 }
        r8 = r8 + 1;
        goto L_0x00c3;
    L_0x00d0:
        r7 = r7 + 1;
        goto L_0x0042;
    L_0x00d4:
        r2 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x00e0 }
        r1 = r1.toByteArray();	 Catch:{ UnsupportedEncodingException -> 0x00e0 }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00e0 }
        r2.<init>(r1, r3);	 Catch:{ UnsupportedEncodingException -> 0x00e0 }
        return r2;
    L_0x00e0:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.AssertionError;
        r2.<init>(r1);
        throw r2;
    L_0x00e8:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.AssertionError;
        r2.<init>(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.stringencoder.Base32.decode(java.lang.String):java.lang.String");
    }

    public static String encode(String str) {
        try {
            byte[] bytes = str.getBytes(StringUtils.UTF8);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < (bytes.length + 4) / 5; i++) {
                int i2;
                short[] sArr = new short[5];
                int[] iArr = new int[8];
                int i3 = 5;
                for (i2 = 0; i2 < 5; i2++) {
                    int i4 = (i * 5) + i2;
                    if (i4 < bytes.length) {
                        sArr[i2] = (short) (bytes[i4] & 255);
                    } else {
                        sArr[i2] = (short) 0;
                        i3--;
                    }
                }
                i2 = lenToPadding(i3);
                iArr[0] = (byte) ((sArr[0] >> 3) & 31);
                iArr[1] = (byte) (((sArr[0] & 7) << 2) | ((sArr[1] >> 6) & 3));
                iArr[2] = (byte) ((sArr[1] >> 1) & 31);
                iArr[3] = (byte) (((sArr[1] & 1) << 4) | ((sArr[2] >> 4) & 15));
                iArr[4] = (byte) (((sArr[2] & 15) << 1) | ((sArr[3] >> 7) & 1));
                iArr[5] = (byte) ((sArr[3] >> 2) & 31);
                iArr[6] = (byte) (((sArr[4] >> 5) & 7) | ((sArr[3] & 3) << 3));
                iArr[7] = (byte) (sArr[4] & 31);
                for (int i5 = 0; i5 < 8 - i2; i5++) {
                    byteArrayOutputStream.write(ALPHABET.charAt(iArr[i5]));
                }
            }
            try {
                return new String(byteArrayOutputStream.toByteArray(), StringUtils.UTF8);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static StringEncoder getStringEncoder() {
        return base32Stringencoder;
    }

    private static int lenToPadding(int i) {
        switch (i) {
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 1;
            case 5:
                return 0;
            default:
                return -1;
        }
    }

    private static int paddingToLen(int i) {
        switch (i) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 3:
                return 3;
            case 4:
                return 2;
            case 6:
                return 1;
            default:
                return -1;
        }
    }
}
