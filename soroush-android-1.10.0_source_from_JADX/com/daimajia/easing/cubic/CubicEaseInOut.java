package com.daimajia.easing.cubic;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class CubicEaseInOut extends BaseEasingMethod {
    public CubicEaseInOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4 / 2.0f;
        if (f < BallPulseIndicator.SCALE) {
            f3 = (((f3 / 2.0f) * f) * f) * f;
        } else {
            f -= 2.0f;
            f3 = (f3 / 2.0f) * (((f * f) * f) + 2.0f);
        }
        return Float.valueOf(f3 + f2);
    }
}
