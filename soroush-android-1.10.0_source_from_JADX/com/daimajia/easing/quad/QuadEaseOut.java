package com.daimajia.easing.quad;

import com.daimajia.easing.BaseEasingMethod;

public class QuadEaseOut extends BaseEasingMethod {
    public QuadEaseOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        f /= f4;
        return Float.valueOf((((-f3) * f) * (f - 2.0f)) + f2);
    }
}
