package com.daimajia.easing.back;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class BackEaseInOut extends BaseEasingMethod {
    private float f17807s;

    public BackEaseInOut(float f) {
        super(f);
        this.f17807s = 1.70158f;
    }

    public BackEaseInOut(float f, float f2) {
        this(f);
        this.f17807s = f2;
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4 / 2.0f;
        float f5;
        if (f < BallPulseIndicator.SCALE) {
            f3 /= 2.0f;
            float f6 = f * f;
            f5 = (float) (((double) this.f17807s) * 1.525d);
            this.f17807s = f5;
            f3 *= f6 * (((f5 + BallPulseIndicator.SCALE) * f) - this.f17807s);
        } else {
            f3 /= 2.0f;
            f -= 2.0f;
            f5 = f * f;
            float f7 = (float) (((double) this.f17807s) * 1.525d);
            this.f17807s = f7;
            f3 *= (f5 * (((f7 + BallPulseIndicator.SCALE) * f) + this.f17807s)) + 2.0f;
        }
        return Float.valueOf(f3 + f2);
    }
}
