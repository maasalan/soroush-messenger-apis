package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C2260e {
    final RectF f7526a = new RectF();
    float f7527b;
    float f7528c;
    float f7529d;
    float f7530e;
    float f7531f;
    float f7532g;
    float f7533h;
    float f7534i;
    float f7535j = BallPulseIndicator.SCALE;
    float f7536k = BallPulseIndicator.SCALE;
    private final RectF f7537l = new RectF();

    C2260e() {
    }

    static boolean m6165a(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    static boolean m6166a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    static boolean m6167b(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    static boolean m6168c(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    public final RectF m6169a() {
        this.f7537l.set(this.f7526a);
        return this.f7537l;
    }

    public final void m6170a(RectF rectF) {
        this.f7526a.set(rectF);
    }

    public final float m6171b() {
        return Math.max(this.f7527b, this.f7531f / this.f7535j);
    }

    public final float m6172c() {
        return Math.max(this.f7528c, this.f7532g / this.f7536k);
    }

    public final float m6173d() {
        return Math.min(this.f7529d, this.f7533h / this.f7535j);
    }

    public final float m6174e() {
        return Math.min(this.f7530e, this.f7534i / this.f7536k);
    }

    public final boolean m6175f() {
        return this.f7526a.width() >= 100.0f && this.f7526a.height() >= 100.0f;
    }

    final boolean m6176g() {
        return !m6175f();
    }
}
