package com.daimajia.easing.circ;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class CircEaseIn extends BaseEasingMethod {
    public CircEaseIn(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4;
        return Float.valueOf(((-f3) * (((float) Math.sqrt((double) (BallPulseIndicator.SCALE - (f * f)))) - BallPulseIndicator.SCALE)) + f2);
    }
}
