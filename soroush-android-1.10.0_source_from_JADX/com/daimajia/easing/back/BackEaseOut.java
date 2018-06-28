package com.daimajia.easing.back;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class BackEaseOut extends BaseEasingMethod {
    private float f17808s;

    public BackEaseOut(float f) {
        super(f);
        this.f17808s = 1.70158f;
    }

    public BackEaseOut(float f, float f2) {
        this(f);
        this.f17808s = f2;
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f = (f / f4) - BallPulseIndicator.SCALE;
        return Float.valueOf((f3 * (((f * f) * (((this.f17808s + BallPulseIndicator.SCALE) * f) + this.f17808s)) + BallPulseIndicator.SCALE)) + f2);
    }
}
