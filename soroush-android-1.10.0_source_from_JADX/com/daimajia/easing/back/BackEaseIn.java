package com.daimajia.easing.back;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class BackEaseIn extends BaseEasingMethod {
    private float f17806s;

    public BackEaseIn(float f) {
        super(f);
        this.f17806s = 1.70158f;
    }

    public BackEaseIn(float f, float f2) {
        this(f);
        this.f17806s = f2;
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4;
        return Float.valueOf((((f3 * f) * f) * (((this.f17806s + BallPulseIndicator.SCALE) * f) - this.f17806s)) + f2);
    }
}
