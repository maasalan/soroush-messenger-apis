package com.p085c.p086a;

import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public enum C1237f {
    LOW(0.5f),
    NORMAL(BallPulseIndicator.SCALE),
    HIGH(1.5f);
    
    public float f3899d;

    private C1237f(float f) {
        this.f3899d = f;
    }
}
