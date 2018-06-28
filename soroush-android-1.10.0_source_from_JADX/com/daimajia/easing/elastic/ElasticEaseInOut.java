package com.daimajia.easing.elastic;

import com.daimajia.easing.BaseEasingMethod;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ElasticEaseInOut extends BaseEasingMethod {
    public ElasticEaseInOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        if (f == 0.0f) {
            return Float.valueOf(f2);
        }
        f /= f4 / 2.0f;
        if (f == 2.0f) {
            return Float.valueOf(f2 + f3);
        }
        float f5 = 0.45000002f * f4;
        float f6 = f5 / 4.0f;
        if (f < BallPulseIndicator.SCALE) {
            f -= BallPulseIndicator.SCALE;
            return Float.valueOf((-0.5f * ((f3 * ((float) Math.pow(2.0d, (double) (10.0f * f)))) * ((float) Math.sin((double) ((((f * f4) - f6) * 6.2831855f) / f5))))) + f2);
        }
        f -= BallPulseIndicator.SCALE;
        return Float.valueOf(((((((float) Math.pow(2.0d, (double) (-10.0f * f))) * f3) * ((float) Math.sin((double) ((((f * f4) - f6) * 6.2831855f) / f5)))) * 0.5f) + f3) + f2);
    }
}
