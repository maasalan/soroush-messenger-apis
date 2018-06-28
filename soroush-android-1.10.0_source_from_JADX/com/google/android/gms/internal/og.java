package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.jivesoftware.smack.util.StringUtils;

public final class og {
    protected static final Charset f6251a = Charset.forName(StringUtils.UTF8);
    public static final Object f6252b = new Object();
    private static Charset f6253c = Charset.forName("ISO-8859-1");

    public static int m5109a(int[] iArr) {
        if (iArr != null) {
            if (iArr.length != 0) {
                return Arrays.hashCode(iArr);
            }
        }
        return 0;
    }

    public static int m5110a(long[] jArr) {
        if (jArr != null) {
            if (jArr.length != 0) {
                return Arrays.hashCode(jArr);
            }
        }
        return 0;
    }

    public static int m5111a(Object[] objArr) {
        int i = 0;
        int length = objArr == null ? 0 : objArr.length;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (obj != null) {
                i2 = (i2 * 31) + obj.hashCode();
            }
            i++;
        }
        return i2;
    }

    public static int m5112a(byte[][] bArr) {
        int i = 0;
        int length = bArr == null ? 0 : bArr.length;
        int i2 = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (bArr2 != null) {
                i2 = (i2 * 31) + Arrays.hashCode(bArr2);
            }
            i++;
        }
        return i2;
    }

    public static void m5113a(oc ocVar, oc ocVar2) {
        if (ocVar.f15301H != null) {
            ocVar2.f15301H = (oe) ocVar.f15301H.clone();
        }
    }

    public static boolean m5114a(int[] iArr, int[] iArr2) {
        if (iArr != null) {
            if (iArr.length != 0) {
                return Arrays.equals(iArr, iArr2);
            }
        }
        if (iArr2 != null) {
            if (iArr2.length != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean m5115a(long[] jArr, long[] jArr2) {
        if (jArr != null) {
            if (jArr.length != 0) {
                return Arrays.equals(jArr, jArr2);
            }
        }
        if (jArr2 != null) {
            if (jArr2.length != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean m5116a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = i;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length;
                boolean z2 = i2 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    public static boolean m5117a(byte[][] bArr, byte[][] bArr2) {
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i = 0;
        int i2 = i;
        while (true) {
            if (i >= length || bArr[i] != null) {
                while (i2 < length2 && bArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length;
                boolean z2 = i2 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !Arrays.equals(bArr[i], bArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }
}
