package com.p111d.p112a.p114b.p116c;

import java.util.Arrays;

public final class C1345a {
    private static final char[] f4177a;
    private static final byte[] f4178b;
    private static final int[] f4179c;
    private static final int[] f4180d;
    private static final int[] f4181e;
    private static final int[] f4182f;
    private static final int[] f4183g;
    private static final int[] f4184h;
    private static final int[] f4185i;
    private static final int[] f4186j;

    static {
        int i;
        int i2;
        int i3;
        char[] toCharArray = "0123456789ABCDEF".toCharArray();
        f4177a = toCharArray;
        int i4 = 0;
        int length = toCharArray.length;
        f4178b = new byte[length];
        for (i = 0; i < length; i++) {
            f4178b[i] = (byte) f4177a[i];
        }
        int[] iArr = new int[256];
        for (i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f4179c = iArr;
        Object obj = new int[256];
        System.arraycopy(f4179c, 0, obj, 0, 256);
        for (i3 = 128; i3 < 256; i3++) {
            int i5 = (i3 & 224) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
            obj[i3] = i5;
        }
        f4180d = obj;
        iArr = new int[256];
        Arrays.fill(iArr, -1);
        for (i3 = 33; i3 < 256; i3++) {
            if (Character.isJavaIdentifierPart((char) i3)) {
                iArr[i3] = 0;
            }
        }
        iArr[64] = 0;
        iArr[35] = 0;
        iArr[42] = 0;
        iArr[45] = 0;
        iArr[43] = 0;
        f4181e = iArr;
        obj = new int[256];
        System.arraycopy(f4181e, 0, obj, 0, 256);
        Arrays.fill(obj, 128, 128, 0);
        f4182f = obj;
        obj = new int[256];
        System.arraycopy(f4180d, 128, obj, 128, 128);
        Arrays.fill(obj, 0, 32, -1);
        obj[9] = null;
        obj[10] = 10;
        obj[13] = 13;
        obj[42] = 42;
        f4183g = obj;
        Object obj2 = new int[256];
        System.arraycopy(f4180d, 128, obj2, 128, 128);
        Arrays.fill(obj2, 0, 32, -1);
        obj2[32] = 1;
        obj2[9] = 1;
        obj2[10] = 10;
        obj2[13] = 13;
        obj2[47] = 47;
        obj2[35] = 35;
        f4184h = obj2;
        int[] iArr2 = new int[128];
        for (i = 0; i < 32; i++) {
            iArr2[i] = -1;
        }
        iArr2[34] = 34;
        iArr2[92] = 92;
        iArr2[8] = 98;
        iArr2[9] = 116;
        iArr2[12] = 102;
        iArr2[10] = 110;
        iArr2[13] = 114;
        f4185i = iArr2;
        iArr2 = new int[128];
        f4186j = iArr2;
        Arrays.fill(iArr2, -1);
        for (length = 0; length < 10; length++) {
            f4186j[48 + length] = length;
        }
        while (i4 < 6) {
            i2 = 10 + i4;
            f4186j[97 + i4] = i2;
            f4186j[65 + i4] = i2;
            i4++;
        }
    }

    public static int m3178a(int i) {
        return i > 127 ? -1 : f4186j[i];
    }

    public static void m3179a(StringBuilder stringBuilder, String str) {
        int[] iArr = f4185i;
        char length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt < length) {
                if (iArr[charAt] != 0) {
                    stringBuilder.append('\\');
                    int i2 = iArr[charAt];
                    if (i2 < 0) {
                        stringBuilder.append('u');
                        stringBuilder.append('0');
                        stringBuilder.append('0');
                        stringBuilder.append(f4177a[charAt >> 4]);
                        charAt = f4177a[charAt & 15];
                    } else {
                        charAt = (char) i2;
                    }
                }
            }
            stringBuilder.append(charAt);
        }
    }

    public static int[] m3180a() {
        return f4179c;
    }

    public static int[] m3181b() {
        return f4180d;
    }

    public static int[] m3182c() {
        return f4181e;
    }

    public static int[] m3183d() {
        return f4182f;
    }

    public static int[] m3184e() {
        return f4183g;
    }

    public static int[] m3185f() {
        return f4185i;
    }

    public static char[] m3186g() {
        return (char[]) f4177a.clone();
    }

    public static byte[] m3187h() {
        return (byte[]) f4178b.clone();
    }
}
