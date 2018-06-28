package com.daimajia.easing.quad;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class QuadEaseInOut extends BaseEasingMethod {
    public QuadEaseInOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4 / 2.0f;
        if (f < BallPulseIndicator.SCALE) {
            f3 = (f3 / 2.0f) * f;
        } else {
            f3 = (-f3) / 2.0f;
            f -= BallPulseIndicator.SCALE;
            f = (f * (f - 2.0f)) - BallPulseIndicator.SCALE;
        }
        return Float.valueOf((f3 * f) + f2);
    }
}
