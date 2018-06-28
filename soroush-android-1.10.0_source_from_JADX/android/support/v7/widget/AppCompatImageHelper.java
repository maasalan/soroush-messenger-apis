package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.C0623h;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.p043c.p044a.C0683b;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageHelper {
    private TintInfo mImageTint;
    private TintInfo mInternalImageTint;
    private TintInfo mTmpInfo;
    private final ImageView mView;

    public AppCompatImageHelper(ImageView imageView) {
        this.mView = imageView;
    }

    private boolean applyFrameworkTintUsingColorFilter(Drawable drawable) {
        if (this.mTmpInfo == null) {
            this.mTmpInfo = new TintInfo();
        }
        TintInfo tintInfo = this.mTmpInfo;
        tintInfo.clear();
        ColorStateList a = C0623h.m1510a(this.mView);
        if (a != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = a;
        }
        Mode b = C0623h.m1513b(this.mView);
        if (b != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = b;
        }
        if (!tintInfo.mHasTintList) {
            if (!tintInfo.mHasTintMode) {
                return false;
            }
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        return true;
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        int i = VERSION.SDK_INT;
        return i > 21 ? this.mInternalImageTint != null : i == 21;
    }

    void applySupportImageTint() {
        Drawable drawable = this.mView.getDrawable();
        if (drawable != null) {
            DrawableUtils.fixDrawable(drawable);
        }
        if (drawable != null && (!shouldApplyFrameworkTintUsingColorFilter() || !applyFrameworkTintUsingColorFilter(drawable))) {
            if (this.mImageTint != null) {
                AppCompatDrawableManager.tintDrawable(drawable, this.mImageTint, this.mView.getDrawableState());
                return;
            }
            if (this.mInternalImageTint != null) {
                AppCompatDrawableManager.tintDrawable(drawable, this.mInternalImageTint, this.mView.getDrawableState());
            }
        }
    }

    ColorStateList getSupportImageTintList() {
        return this.mImageTint != null ? this.mImageTint.mTintList : null;
    }

    Mode getSupportImageTintMode() {
        return this.mImageTint != null ? this.mImageTint.mTintMode : null;
    }

    boolean hasOverlappingRendering() {
        return VERSION.SDK_INT < 21 || !(this.mView.getBackground() instanceof RippleDrawable);
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, C0644j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.mView.getDrawable();
            if (drawable == null) {
                int resourceId = obtainStyledAttributes.getResourceId(C0644j.AppCompatImageView_srcCompat, -1);
                if (resourceId != -1) {
                    drawable = C0683b.m1656b(this.mView.getContext(), resourceId);
                    if (drawable != null) {
                        this.mView.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            if (obtainStyledAttributes.hasValue(C0644j.AppCompatImageView_tint)) {
                C0623h.m1511a(this.mView, obtainStyledAttributes.getColorStateList(C0644j.AppCompatImageView_tint));
            }
            if (obtainStyledAttributes.hasValue(C0644j.AppCompatImageView_tintMode)) {
                C0623h.m1512a(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0644j.AppCompatImageView_tintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            Drawable b = C0683b.m1656b(this.mView.getContext(), i);
            if (b != null) {
                DrawableUtils.fixDrawable(b);
            }
            this.mView.setImageDrawable(b);
        } else {
            this.mView.setImageDrawable(null);
        }
        applySupportImageTint();
    }

    void setInternalImageTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.mInternalImageTint == null) {
                this.mInternalImageTint = new TintInfo();
            }
            this.mInternalImageTint.mTintList = colorStateList;
            this.mInternalImageTint.mHasTintList = true;
        } else {
            this.mInternalImageTint = null;
        }
        applySupportImageTint();
    }

    void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.mImageTint == null) {
            this.mImageTint = new TintInfo();
        }
        this.mImageTint.mTintList = colorStateList;
        this.mImageTint.mHasTintList = true;
        applySupportImageTint();
    }

    void setSupportImageTintMode(Mode mode) {
        if (this.mImageTint == null) {
            this.mImageTint = new TintInfo();
        }
        this.mImageTint.mTintMode = mode;
        this.mImageTint.mHasTintMode = true;
        applySupportImageTint();
    }
}
