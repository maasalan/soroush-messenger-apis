package android.support.design.widget;

import android.support.v4.view.p040b.C4834a;
import android.support.v4.view.p040b.C4835b;
import android.support.v4.view.p040b.C4836c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

final class C0296a {
    static final Interpolator f1123a = new LinearInterpolator();
    static final Interpolator f1124b = new C4835b();
    static final Interpolator f1125c = new C4834a();
    static final Interpolator f1126d = new C4836c();
    static final Interpolator f1127e = new DecelerateInterpolator();

    static float m564a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    static int m565a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
