package android.support.p028d;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

final class C4714j implements C0220k {
    C4714j() {
    }

    public final <T> ObjectAnimator mo99a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, null, path);
    }
}
