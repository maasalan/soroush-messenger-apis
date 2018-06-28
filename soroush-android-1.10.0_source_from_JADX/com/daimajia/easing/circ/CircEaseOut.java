package com.daimajia.easing.circ;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class CircEaseOut extends BaseEasingMethod {
    public CircEaseOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f = (f / f4) - BallPulseIndicator.SCALE;
        return Float.valueOf((f3 * ((float) Math.sqrt((double) (BallPulseIndicator.SCALE - (f * f))))) + f2);
    }
}
