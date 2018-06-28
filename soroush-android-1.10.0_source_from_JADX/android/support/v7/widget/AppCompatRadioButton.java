package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.C0629n;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p043c.p044a.C0683b;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class AppCompatRadioButton extends RadioButton implements C0629n {
    private final AppCompatCompoundButtonHelper mCompoundButtonHelper;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0635a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mCompoundButtonHelper = new AppCompatCompoundButtonHelper(this);
        this.mCompoundButtonHelper.loadFromAttributes(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.mCompoundButtonHelper != null ? this.mCompoundButtonHelper.getCompoundPaddingLeft(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        return this.mCompoundButtonHelper != null ? this.mCompoundButtonHelper.getSupportButtonTintList() : null;
    }

    public Mode getSupportButtonTintMode() {
        return this.mCompoundButtonHelper != null ? this.mCompoundButtonHelper.getSupportButtonTintMode() : null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0683b.m1656b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.mCompoundButtonHelper != null) {
            this.mCompoundButtonHelper.onSetButtonDrawable();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.mCompoundButtonHelper != null) {
            this.mCompoundButtonHelper.setSupportButtonTintList(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.mCompoundButtonHelper != null) {
            this.mCompoundButtonHelper.setSupportButtonTintMode(mode);
        }
    }
}
