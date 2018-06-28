package com.daimajia.easing.expo;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ExpoEaseIn extends BaseEasingMethod {
    public ExpoEaseIn(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        if (f != 0.0f) {
            f2 += f3 * ((float) Math.pow(2.0d, (double) (10.0f * ((f / f4) - BallPulseIndicator.SCALE))));
        }
        return Float.valueOf(f2);
    }
}
