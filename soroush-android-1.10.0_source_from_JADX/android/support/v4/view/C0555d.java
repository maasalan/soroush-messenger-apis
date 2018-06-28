package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

public final class C0555d {
    public static int m1224a(int i, int i2) {
        return VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }

    public static void m1225a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }
}
