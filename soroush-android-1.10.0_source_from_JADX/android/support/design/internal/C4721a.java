package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.design.C0249a.C0241d;
import android.support.design.C0249a.C0242e;
import android.support.design.C0249a.C0243f;
import android.support.design.C0249a.C0245h;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.C0566o;
import android.support.v4.view.C0571r;
import android.support.v7.view.menu.C0729p.C0728a;
import android.support.v7.view.menu.C4893j;
import android.support.v7.widget.TooltipCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C4721a extends FrameLayout implements C0728a {
    private static final int[] f12980a = new int[]{16842912};
    private final int f12981b;
    private final int f12982c;
    private final float f12983d;
    private final float f12984e;
    private boolean f12985f;
    private ImageView f12986g;
    private final TextView f12987h;
    private final TextView f12988i;
    private int f12989j;
    private C4893j f12990k;
    private ColorStateList f12991l;

    public C4721a(Context context) {
        this(context, (byte) 0);
    }

    private C4721a(Context context, byte b) {
        this(context, '\u0000');
    }

    private C4721a(Context context, char c) {
        super(context, null, 0);
        this.f12989j = -1;
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0241d.design_bottom_navigation_text_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0241d.design_bottom_navigation_active_text_size);
        this.f12981b = resources.getDimensionPixelSize(C0241d.design_bottom_navigation_margin);
        this.f12982c = dimensionPixelSize - dimensionPixelSize2;
        float f = (float) dimensionPixelSize2;
        float f2 = (float) dimensionPixelSize;
        this.f12983d = (BallPulseIndicator.SCALE * f) / f2;
        this.f12984e = (BallPulseIndicator.SCALE * f2) / f;
        LayoutInflater.from(context).inflate(C0245h.design_bottom_navigation_item, this, true);
        setBackgroundResource(C0242e.design_bottom_navigation_item_background);
        this.f12986g = (ImageView) findViewById(C0243f.icon);
        this.f12987h = (TextView) findViewById(C0243f.smallLabel);
        this.f12988i = (TextView) findViewById(C0243f.largeLabel);
    }

    public final void mo128a(C4893j c4893j) {
        this.f12990k = c4893j;
        setCheckable(c4893j.isCheckable());
        setChecked(c4893j.isChecked());
        setEnabled(c4893j.isEnabled());
        setIcon(c4893j.getIcon());
        setTitle(c4893j.getTitle());
        setId(c4893j.getItemId());
        setContentDescription(c4893j.getContentDescription());
        TooltipCompat.setTooltipText(this, c4893j.getTooltipText());
    }

    public final boolean mo129a() {
        return false;
    }

    public final C4893j getItemData() {
        return this.f12990k;
    }

    public final int getItemPosition() {
        return this.f12989j;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f12990k != null && this.f12990k.isCheckable() && this.f12990k.isChecked()) {
            C4721a.mergeDrawableStates(onCreateDrawableState, f12980a);
        }
        return onCreateDrawableState;
    }

    public final void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public final void setChecked(boolean z) {
        this.f12988i.setPivotX((float) (this.f12988i.getWidth() / 2));
        this.f12988i.setPivotY((float) this.f12988i.getBaseline());
        this.f12987h.setPivotX((float) (this.f12987h.getWidth() / 2));
        this.f12987h.setPivotY((float) this.f12987h.getBaseline());
        LayoutParams layoutParams;
        if (this.f12985f) {
            if (z) {
                layoutParams = (LayoutParams) this.f12986g.getLayoutParams();
                layoutParams.gravity = 49;
                layoutParams.topMargin = this.f12981b;
                this.f12986g.setLayoutParams(layoutParams);
                this.f12988i.setVisibility(0);
                this.f12988i.setScaleX(BallPulseIndicator.SCALE);
                this.f12988i.setScaleY(BallPulseIndicator.SCALE);
            } else {
                layoutParams = (LayoutParams) this.f12986g.getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.topMargin = this.f12981b;
                this.f12986g.setLayoutParams(layoutParams);
                this.f12988i.setVisibility(4);
                this.f12988i.setScaleX(0.5f);
                this.f12988i.setScaleY(0.5f);
            }
            this.f12987h.setVisibility(4);
        } else if (z) {
            layoutParams = (LayoutParams) this.f12986g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f12981b + this.f12982c;
            this.f12986g.setLayoutParams(layoutParams);
            this.f12988i.setVisibility(0);
            this.f12987h.setVisibility(4);
            this.f12988i.setScaleX(BallPulseIndicator.SCALE);
            this.f12988i.setScaleY(BallPulseIndicator.SCALE);
            this.f12987h.setScaleX(this.f12983d);
            this.f12987h.setScaleY(this.f12983d);
        } else {
            layoutParams = (LayoutParams) this.f12986g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f12981b;
            this.f12986g.setLayoutParams(layoutParams);
            this.f12988i.setVisibility(4);
            this.f12987h.setVisibility(0);
            this.f12988i.setScaleX(this.f12984e);
            this.f12988i.setScaleY(this.f12984e);
            this.f12987h.setScaleX(BallPulseIndicator.SCALE);
            this.f12987h.setScaleY(BallPulseIndicator.SCALE);
        }
        refreshDrawableState();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f12987h.setEnabled(z);
        this.f12988i.setEnabled(z);
        this.f12986g.setEnabled(z);
        C0571r.m1342a((View) this, z ? C0566o.m1271a(getContext()) : null);
    }

    public final void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0429a.m896g(drawable).mutate();
            C0429a.m885a(drawable, this.f12991l);
        }
        this.f12986g.setImageDrawable(drawable);
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        this.f12991l = colorStateList;
        if (this.f12990k != null) {
            setIcon(this.f12990k.getIcon());
        }
    }

    public final void setItemBackground(int i) {
        C0571r.m1339a((View) this, i == 0 ? null : C0346c.m682a(getContext(), i));
    }

    public final void setItemPosition(int i) {
        this.f12989j = i;
    }

    public final void setShiftingMode(boolean z) {
        this.f12985f = z;
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.f12987h.setTextColor(colorStateList);
        this.f12988i.setTextColor(colorStateList);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f12987h.setText(charSequence);
        this.f12988i.setText(charSequence);
    }
}
