package com.daimajia.easing.bounce;

import com.daimajia.easing.BaseEasingMethod;

public class BounceEaseOut extends BaseEasingMethod {
    public BounceEaseOut(float f) {
        super(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        float f5;
        f /= f4;
        if (f < 0.36363637f) {
            f5 = (7.5625f * f) * f;
        } else {
            if (f < 0.72727275f) {
                f -= 0.54545456f;
                f5 = (7.5625f * f) * f;
                f = 0.75f;
            } else if (((double) f) < 0.9090909090909091d) {
                f -= 0.8181818f;
                f5 = (7.5625f * f) * f;
                f = 0.9375f;
            } else {
                f -= 0.95454544f;
                f5 = (7.5625f * f) * f;
                f = 0.984375f;
            }
            f5 += f;
        }
        return Float.valueOf((f3 * f5) + f2);
    }
}
