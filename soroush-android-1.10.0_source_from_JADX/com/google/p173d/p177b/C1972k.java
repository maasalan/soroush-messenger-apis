package com.google.p173d.p177b;

import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C1972k {
    final float f6625a;
    final float f6626b;
    final float f6627c;
    final float f6628d;
    final float f6629e;
    final float f6630f;
    final float f6631g;
    final float f6632h;
    final float f6633i;

    private C1972k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f6625a = f;
        this.f6626b = f4;
        this.f6627c = f7;
        this.f6628d = f2;
        this.f6629e = f5;
        this.f6630f = f8;
        this.f6631g = f3;
        this.f6632h = f6;
        this.f6633i = f9;
    }

    private static C1972k m5429a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C1972k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, BallPulseIndicator.SCALE);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        f9 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C1972k((f3 - f) + (f16 * f3), (f9 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f9 * f8), f2, f16, f9, BallPulseIndicator.SCALE);
    }

    public static C1972k m5430a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        C1972k a = C1972k.m5429a(f, f2, f3, f4, f5, f6, f7, f8);
        C1972k c1972k = new C1972k((a.f6629e * a.f6633i) - (a.f6630f * a.f6632h), (a.f6630f * a.f6631g) - (a.f6628d * a.f6633i), (a.f6628d * a.f6632h) - (a.f6629e * a.f6631g), (a.f6627c * a.f6632h) - (a.f6626b * a.f6633i), (a.f6625a * a.f6633i) - (a.f6627c * a.f6631g), (a.f6626b * a.f6631g) - (a.f6625a * a.f6632h), (a.f6626b * a.f6630f) - (a.f6627c * a.f6629e), (a.f6627c * a.f6628d) - (a.f6625a * a.f6630f), (a.f6625a * a.f6629e) - (a.f6626b * a.f6628d));
        a = C1972k.m5429a(f9, f10, f11, f12, f13, f14, f15, f16);
        return new C1972k((a.f6631g * c1972k.f6627c) + ((a.f6625a * c1972k.f6625a) + (a.f6628d * c1972k.f6626b)), (a.f6631g * c1972k.f6630f) + ((a.f6625a * c1972k.f6628d) + (a.f6628d * c1972k.f6629e)), (a.f6631g * c1972k.f6633i) + ((a.f6625a * c1972k.f6631g) + (a.f6628d * c1972k.f6632h)), (a.f6632h * c1972k.f6627c) + ((a.f6626b * c1972k.f6625a) + (a.f6629e * c1972k.f6626b)), (a.f6632h * c1972k.f6630f) + ((a.f6626b * c1972k.f6628d) + (a.f6629e * c1972k.f6629e)), (a.f6632h * c1972k.f6633i) + ((a.f6626b * c1972k.f6631g) + (a.f6629e * c1972k.f6632h)), (a.f6633i * c1972k.f6627c) + ((a.f6627c * c1972k.f6625a) + (a.f6630f * c1972k.f6626b)), (a.f6633i * c1972k.f6630f) + ((a.f6627c * c1972k.f6628d) + (a.f6630f * c1972k.f6629e)), ((a.f6627c * c1972k.f6631g) + (a.f6630f * c1972k.f6632h)) + (a.f6633i * c1972k.f6633i));
    }
}
