package lecho.lib.hellocharts.p225h;

import android.graphics.Color;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C2429b {
    public static final int f8040a = Color.parseColor("#DFDFDF");
    public static final int f8041b = Color.parseColor("#DDDDDD");
    public static final int f8042c = Color.parseColor("#33B5E5");
    public static final int f8043d = Color.parseColor("#AA66CC");
    public static final int f8044e = Color.parseColor("#99CC00");
    public static final int f8045f = Color.parseColor("#FFBB33");
    public static final int f8046g = Color.parseColor("#FF4444");
    public static final int[] f8047h = new int[]{f8042c, f8043d, f8044e, f8045f, f8046g};
    private static int f8048i;

    public static int m6640a(float f, int i) {
        return i == 0 ? 0 : (int) ((((float) i) * f) + 0.5f);
    }

    public static int m6641a(int i) {
        r0 = new float[3];
        int alpha = Color.alpha(i);
        Color.colorToHSV(i, r0);
        r0[1] = Math.min(r0[1] * 1.1f, BallPulseIndicator.SCALE);
        r0[2] = r0[2] * 0.9f;
        i = Color.HSVToColor(r0);
        return Color.argb(alpha, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int m6642b(float f, int i) {
        return i == 0 ? 0 : (int) ((((float) i) * f) + 0.5f);
    }
}
