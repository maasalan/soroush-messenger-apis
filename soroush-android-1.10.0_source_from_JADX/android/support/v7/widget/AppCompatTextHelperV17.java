package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p041a.C0645a.C0644j;
import android.util.AttributeSet;
import android.widget.TextView;

class AppCompatTextHelperV17 extends AppCompatTextHelper {
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableStartTint;

    AppCompatTextHelperV17(TextView textView) {
        super(textView);
    }

    void applyCompoundDrawablesTints() {
        super.applyCompoundDrawablesTints();
        if (this.mDrawableStartTint != null || this.mDrawableEndTint != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
        }
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        super.loadFromAttributes(attributeSet, i);
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0644j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C0644j.AppCompatTextHelper_android_drawableStart)) {
            this.mDrawableStartTint = AppCompatTextHelper.createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(C0644j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C0644j.AppCompatTextHelper_android_drawableEnd)) {
            this.mDrawableEndTint = AppCompatTextHelper.createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(C0644j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
