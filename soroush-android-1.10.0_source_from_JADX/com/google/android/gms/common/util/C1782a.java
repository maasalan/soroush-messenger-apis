package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.aa;
import java.lang.reflect.Array;
import java.util.Arrays;

public final class C1782a {
    public static void m4509a(StringBuilder stringBuilder, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Double.toString(dArr[i]));
        }
    }

    public static void m4510a(StringBuilder stringBuilder, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Float.toString(fArr[i]));
        }
    }

    public static void m4511a(StringBuilder stringBuilder, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Long.toString(jArr[i]));
        }
    }

    public static <T> void m4512a(StringBuilder stringBuilder, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(tArr[i].toString());
        }
    }

    public static void m4513a(StringBuilder stringBuilder, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append("\"");
            stringBuilder.append(strArr[i]);
            stringBuilder.append("\"");
        }
    }

    public static void m4514a(StringBuilder stringBuilder, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Boolean.toString(zArr[i]));
        }
    }

    public static <T> T[] m4515a(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        int length = tArr.length;
        int i = 0;
        int i2 = i;
        while (i < length) {
            Object obj = tArr[i];
            if (!aa.m4374a(tArr2[0], obj)) {
                int i3 = i2 + 1;
                tArr3[i2] = obj;
                i2 = i3;
            }
            i++;
        }
        if (tArr3 == null) {
            return null;
        }
        if (i2 != tArr3.length) {
            tArr3 = Arrays.copyOf(tArr3, i2);
        }
        return tArr3;
    }
}
