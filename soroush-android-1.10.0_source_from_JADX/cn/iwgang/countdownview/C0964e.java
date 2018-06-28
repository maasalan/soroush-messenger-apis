package cn.iwgang.countdownview;

import android.content.Context;

final class C0964e {
    public static float m2418a(Context context) {
        return 12.0f * context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int m2419a(Context context, float f) {
        return f <= 0.0f ? 0 : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String m2420a(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        StringBuilder stringBuilder = new StringBuilder("0");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static String m2421b(int i) {
        if (i > 99) {
            i /= 10;
        } else if (i <= 9) {
            StringBuilder stringBuilder = new StringBuilder("0");
            stringBuilder.append(i);
            return stringBuilder.toString();
        }
        return String.valueOf(i);
    }
}
