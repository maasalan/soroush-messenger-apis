package android.support.p028d;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

final class C0223n {
    private static final C0224q f870a = (VERSION.SDK_INT >= 21 ? new C4716p() : new C4715o());

    static PropertyValuesHolder m426a(Property<?, PointF> property, Path path) {
        return f870a.mo100a(property, path);
    }
}
