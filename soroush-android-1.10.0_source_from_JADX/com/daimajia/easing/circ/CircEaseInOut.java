package com.daimajia.easing.circ;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class CircEaseInOut extends BaseEasingMethod {
    public CircEaseInOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4 / 2.0f;
        if (f < BallPulseIndicator.SCALE) {
            f3 = (-f3) / 2.0f;
            f = ((float) Math.sqrt((double) (BallPulseIndicator.SCALE - (f * f)))) - BallPulseIndicator.SCALE;
        } else {
            f3 /= 2.0f;
            f -= 2.0f;
            f = ((float) Math.sqrt((double) (BallPulseIndicator.SCALE - (f * f)))) + BallPulseIndicator.SCALE;
        }
        return Float.valueOf((f3 * f) + f2);
    }
}
