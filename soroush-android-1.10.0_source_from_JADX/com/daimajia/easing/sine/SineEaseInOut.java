package com.daimajia.easing.sine;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class SineEaseInOut extends BaseEasingMethod {
    public SineEaseInOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        return Float.valueOf((((-f3) / 2.0f) * (((float) Math.cos((3.141592653589793d * ((double) f)) / ((double) f4))) - BallPulseIndicator.SCALE)) + f2);
    }
}
