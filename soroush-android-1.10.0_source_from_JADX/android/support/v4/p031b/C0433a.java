package android.support.v4.p031b;

import android.graphics.Color;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0433a {
    private static final ThreadLocal<double[]> f1541a = new ThreadLocal();

    private static double m901a(int i) {
        double[] dArr = (double[]) f1541a.get();
        if (dArr == null) {
            dArr = new double[3];
            f1541a.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d;
        double d2 = ((double) red) / 255.0d;
        d2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) green) / 255.0d;
        if (d3 < 0.04045d) {
            d3 /= 12.92d;
            d = 2.4d;
        } else {
            d = 2.4d;
            d3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        }
        double d4 = ((double) blue) / 255.0d;
        d4 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, d);
        dArr[0] = (((0.4124d * d2) + (0.3576d * d3)) + (0.1805d * d4)) * 100.0d;
        dArr[1] = (((0.2126d * d2) + (0.7152d * d3)) + (0.0722d * d4)) * 100.0d;
        dArr[2] = (((d2 * 0.0193d) + (d3 * 0.1192d)) + (d4 * 0.9505d)) * 100.0d;
        return dArr[1] / 100.0d;
    }

    private static float m902a(float f, float f2) {
        return f < 0.0f ? 0.0f : f > f2 ? f2 : f;
    }

    public static int m903a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, C0433a.m905a(Color.red(i), alpha2, Color.red(i2), alpha, i3), C0433a.m905a(Color.green(i), alpha2, Color.green(i2), alpha, i3), C0433a.m905a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int m904a(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            StringBuilder stringBuilder = new StringBuilder("background can not be translucent: #");
            stringBuilder.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        double d = (double) f;
        if (C0433a.m909c(C0433a.m908b(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 <= 10 && i3 - i5 > 1) {
            int i6 = (i5 + i3) / 2;
            if (C0433a.m909c(C0433a.m908b(i, i6), i2) < d) {
                i5 = i6;
            } else {
                i3 = i6;
            }
            i4++;
        }
        return i3;
    }

    private static int m905a(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? 0 : (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static void m906a(int i, int i2, int i3, float[] fArr) {
        float f = ((float) i) / 255.0f;
        float f2 = ((float) i2) / 255.0f;
        float f3 = ((float) i3) / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min = Math.min(f, Math.min(f2, f3));
        float f4 = max - min;
        float f5 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = f;
        } else {
            f = max == f ? ((f2 - f3) / f4) % 6.0f : max == f2 ? ((f3 - f) / f4) + 2.0f : ((f - f2) / f4) + 4.0f;
            f2 = f4 / (BallPulseIndicator.SCALE - Math.abs((2.0f * f5) - BallPulseIndicator.SCALE));
        }
        f = (f * 60.0f) % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        fArr[0] = C0433a.m902a(f, 360.0f);
        fArr[1] = C0433a.m902a(f2, (float) BallPulseIndicator.SCALE);
        fArr[2] = C0433a.m902a(f5, (float) BallPulseIndicator.SCALE);
    }

    public static void m907a(int i, float[] fArr) {
        C0433a.m906a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static int m908b(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= 255) {
                return (i & 16777215) | (i2 << 24);
            }
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    private static double m909c(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            StringBuilder stringBuilder = new StringBuilder("background can not be translucent: #");
            stringBuilder.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (Color.alpha(i) < 255) {
            i = C0433a.m903a(i, i2);
        }
        double a = C0433a.m901a(i) + 0.05d;
        double a2 = C0433a.m901a(i2) + 0.05d;
        return Math.max(a, a2) / Math.min(a, a2);
    }
}
