package com.daimajia.easing.elastic;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ElasticEaseIn extends BaseEasingMethod {
    public ElasticEaseIn(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        if (f == 0.0f) {
            return Float.valueOf(f2);
        }
        f /= f4;
        if (f == BallPulseIndicator.SCALE) {
            return Float.valueOf(f2 + f3);
        }
        float f5 = 0.3f * f4;
        f -= BallPulseIndicator.SCALE;
        return Float.valueOf((-((f3 * ((float) Math.pow(2.0d, (double) (10.0f * f)))) * ((float) Math.sin((double) ((((f * f4) - (f5 / 4.0f)) * 6.2831855f) / f5))))) + f2);
    }
}
