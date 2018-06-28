package com.daimajia.easing.expo;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ExpoEaseInOut extends BaseEasingMethod {
    public ExpoEaseInOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        if (f == 0.0f) {
            return Float.valueOf(f2);
        }
        if (f == f4) {
            return Float.valueOf(f2 + f3);
        }
        f /= f4 / 2.0f;
        return f < BallPulseIndicator.SCALE ? Float.valueOf(((f3 / 2.0f) * ((float) Math.pow(2.0d, (double) (10.0f * (f - BallPulseIndicator.SCALE))))) + f2) : Float.valueOf(((f3 / 2.0f) * ((-((float) Math.pow(2.0d, (double) (-10.0f * (f - BallPulseIndicator.SCALE))))) + 2.0f)) + f2);
    }
}
