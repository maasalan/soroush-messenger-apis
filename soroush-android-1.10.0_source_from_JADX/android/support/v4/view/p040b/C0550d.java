package android.support.v4.view.p040b;

import android.view.animation.Interpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

abstract class C0550d implements Interpolator {
    private final float[] f1844a;
    private final float f1845b = (BallPulseIndicator.SCALE / ((float) (this.f1844a.length - 1)));

    public C0550d(float[] fArr) {
        this.f1844a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= BallPulseIndicator.SCALE) {
            return BallPulseIndicator.SCALE;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f1844a.length - 1)) * f), this.f1844a.length - 2);
        return this.f1844a[min] + (((f - (((float) min) * this.f1845b)) / this.f1845b) * (this.f1844a[min + 1] - this.f1844a[min]));
    }
}
