package com.daimajia.easing.quint;

import com.daimajia.easing.BaseEasingMethod;

public class QuintEaseIn extends BaseEasingMethod {
    public QuintEaseIn(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4;
        return Float.valueOf((((((f3 * f) * f) * f) * f) * f) + f2);
    }
}
