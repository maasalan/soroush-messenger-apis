package com.daimajia.easing.bounce;

import com.daimajia.easing.BaseEasingMethod;

public class BounceEaseInOut extends BaseEasingMethod {
    private BounceEaseIn mBounceEaseIn;
    private BounceEaseOut mBounceEaseOut;

    public BounceEaseInOut(float f) {
        super(f);
        this.mBounceEaseIn = new BounceEaseIn(f);
        this.mBounceEaseOut = new BounceEaseOut(f);
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        return Float.valueOf((f < f4 / 2.0f ? this.mBounceEaseIn.calculate(f * 2.0f, 0.0f, f3, f4).floatValue() * 0.5f : (this.mBounceEaseOut.calculate((f * 2.0f) - f4, 0.0f, f3, f4).floatValue() * 0.5f) + (f3 * 0.5f)) + f2);
    }
}
