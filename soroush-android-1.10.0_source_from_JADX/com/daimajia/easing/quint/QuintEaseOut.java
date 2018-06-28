package com.daimajia.easing.quint;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class QuintEaseOut extends BaseEasingMethod {
    public QuintEaseOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f = (f / f4) - BallPulseIndicator.SCALE;
        return Float.valueOf((f3 * (((((f * f) * f) * f) * f) + BallPulseIndicator.SCALE)) + f2);
    }
}
