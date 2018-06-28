package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.widget.C0615d;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.p043c.p044a.C0683b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final CompoundButton mView;

    interface DirectSetButtonDrawableInterface {
        void setButtonDrawable(Drawable drawable);
    }

    AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    void applyButtonTint() {
        Drawable a = C0615d.m1497a(this.mView);
        if (a == null) {
            return;
        }
        if (this.mHasButtonTint || this.mHasButtonTintMode) {
            a = C0429a.m896g(a).mutate();
            if (this.mHasButtonTint) {
                C0429a.m885a(a, this.mButtonTintList);
            }
            if (this.mHasButtonTintMode) {
                C0429a.m888a(a, this.mButtonTintMode);
            }
            if (a.isStateful()) {
                a.setState(this.mView.getDrawableState());
            }
            this.mView.setButtonDrawable(a);
        }
    }

    int getCompoundPaddingLeft(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0615d.m1497a(this.mView);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, C0644j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0644j.CompoundButton_android_button)) {
                i = obtainStyledAttributes.getResourceId(C0644j.CompoundButton_android_button, 0);
                if (i != 0) {
                    this.mView.setButtonDrawable(C0683b.m1656b(this.mView.getContext(), i));
                }
            }
            if (obtainStyledAttributes.hasValue(C0644j.CompoundButton_buttonTint)) {
                C0615d.m1498a(this.mView, obtainStyledAttributes.getColorStateList(C0644j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0644j.CompoundButton_buttonTintMode)) {
                C0615d.m1499a(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0644j.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyButtonTint();
    }

    void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    void setSupportButtonTintMode(Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }
}
