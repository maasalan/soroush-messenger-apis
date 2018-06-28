package android.support.p028d;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C4713i implements C0220k {
    C4713i() {
    }

    public final <T> ObjectAnimator mo99a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new C0222m(property, path), new float[]{0.0f, BallPulseIndicator.SCALE});
    }
}
