package android.support.p028d;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C4715o implements C0224q {
    C4715o() {
    }

    public final PropertyValuesHolder mo100a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new C0222m(property, path), new float[]{0.0f, BallPulseIndicator.SCALE});
    }
}
