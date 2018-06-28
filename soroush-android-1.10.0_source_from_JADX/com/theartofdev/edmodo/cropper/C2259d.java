package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;

final class C2259d extends Animation implements AnimationListener {
    final CropOverlayView f7516a;
    final RectF f7517b = new RectF();
    final RectF f7518c = new RectF();
    final RectF f7519d = new RectF();
    final RectF f7520e = new RectF();
    final float[] f7521f = new float[9];
    final float[] f7522g = new float[9];
    private final ImageView f7523h;
    private final RectF f7524i = new RectF();
    private final float[] f7525j = new float[9];

    public C2259d(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f7523h = imageView;
        this.f7516a = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        this.f7524i.left = this.f7519d.left + ((this.f7520e.left - this.f7519d.left) * f);
        this.f7524i.top = this.f7519d.top + ((this.f7520e.top - this.f7519d.top) * f);
        this.f7524i.right = this.f7519d.right + ((this.f7520e.right - this.f7519d.right) * f);
        this.f7524i.bottom = this.f7519d.bottom + ((this.f7520e.bottom - this.f7519d.bottom) * f);
        this.f7516a.setCropWindowRect(this.f7524i);
        this.f7524i.left = this.f7517b.left + ((this.f7518c.left - this.f7517b.left) * f);
        this.f7524i.top = this.f7517b.top + ((this.f7518c.top - this.f7517b.top) * f);
        this.f7524i.right = this.f7517b.right + ((this.f7518c.right - this.f7517b.right) * f);
        this.f7524i.bottom = this.f7517b.bottom + ((this.f7518c.bottom - this.f7517b.bottom) * f);
        this.f7516a.m6147a(this.f7524i, this.f7523h.getWidth(), this.f7523h.getHeight());
        for (int i = 0; i < this.f7525j.length; i++) {
            this.f7525j[i] = this.f7521f[i] + ((this.f7522g[i] - this.f7521f[i]) * f);
        }
        Matrix imageMatrix = this.f7523h.getImageMatrix();
        imageMatrix.setValues(this.f7525j);
        this.f7523h.setImageMatrix(imageMatrix);
        this.f7523h.invalidate();
        this.f7516a.invalidate();
    }

    public final void onAnimationEnd(Animation animation) {
        this.f7523h.clearAnimation();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
