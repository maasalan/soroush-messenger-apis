package com.felipecsl.asymmetricgridview.library.widget;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C1605a extends Animation {
    public static final boolean f4986a = (VERSION.SDK_INT < 11);
    private static final WeakHashMap<View, C1605a> f4987g = new WeakHashMap();
    final WeakReference<View> f4988b;
    float f4989c = BallPulseIndicator.SCALE;
    float f4990d;
    final RectF f4991e = new RectF();
    final RectF f4992f = new RectF();
    private float f4993h = BallPulseIndicator.SCALE;
    private float f4994i = BallPulseIndicator.SCALE;
    private float f4995j;
    private final Matrix f4996k = new Matrix();

    private C1605a(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f4988b = new WeakReference(view);
    }

    public static C1605a m4140a(View view) {
        C1605a c1605a = (C1605a) f4987g.get(view);
        if (c1605a != null) {
            return c1605a;
        }
        c1605a = new C1605a(view);
        f4987g.put(view, c1605a);
        return c1605a;
    }

    private void m4141a(Matrix matrix, View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float f = this.f4993h;
        float f2 = this.f4994i;
        if (!(f == BallPulseIndicator.SCALE && f2 == BallPulseIndicator.SCALE)) {
            float f3 = ((f * width) - width) / 2.0f;
            float f4 = ((f2 * height) - height) / 2.0f;
            matrix.postScale(f, f2);
            matrix.postTranslate(-f3, -f4);
        }
        matrix.postTranslate(this.f4990d, this.f4995j);
    }

    final void m4142a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = this.f4996k;
        matrix.reset();
        m4141a(matrix, view);
        this.f4996k.mapRect(rectF);
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        if (rectF.right < rectF.left) {
            float f = rectF.right;
            rectF.right = rectF.left;
            rectF.left = f;
        }
        if (rectF.bottom < rectF.top) {
            f = rectF.top;
            rectF.top = rectF.bottom;
            rectF.bottom = f;
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f4988b.get();
        if (view != null) {
            transformation.setAlpha(this.f4989c);
            m4141a(transformation.getMatrix(), view);
        }
    }

    public final void reset() {
    }
}
