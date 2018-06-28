package android.support.p028d;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

final class C0219h {
    private static final C0220k f863a = (VERSION.SDK_INT >= 21 ? new C4714j() : new C4713i());

    static <T> ObjectAnimator m423a(T t, Property<T, PointF> property, Path path) {
        return f863a.mo99a(t, property, path);
    }
}
