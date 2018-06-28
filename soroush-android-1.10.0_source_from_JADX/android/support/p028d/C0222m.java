package android.support.p028d;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

final class C0222m<T> extends Property<T, Float> {
    private final Property<T, PointF> f864a;
    private final PathMeasure f865b;
    private final float f866c;
    private final float[] f867d = new float[2];
    private final PointF f868e = new PointF();
    private float f869f;

    C0222m(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f864a = property;
        this.f865b = new PathMeasure(path, false);
        this.f866c = this.f865b.getLength();
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.f869f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.f869f = f.floatValue();
        this.f865b.getPosTan(this.f866c * f.floatValue(), this.f867d, null);
        this.f868e.x = this.f867d[0];
        this.f868e.y = this.f867d[1];
        this.f864a.set(obj, this.f868e);
    }
}
