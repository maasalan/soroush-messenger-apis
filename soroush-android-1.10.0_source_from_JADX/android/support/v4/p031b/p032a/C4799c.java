package android.support.v4.p031b.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class C4799c extends Drawable implements Callback, C0430b, C0432f {
    static final Mode f13375a = Mode.SRC_IN;
    C0431a f13376b;
    Drawable f13377c;
    private int f13378d;
    private Mode f13379e;
    private boolean f13380f;
    private boolean f13381g;

    protected static abstract class C0431a extends ConstantState {
        int f1537a;
        ConstantState f1538b;
        ColorStateList f1539c = null;
        Mode f1540d = C4799c.f13375a;

        C0431a(C0431a c0431a) {
            if (c0431a != null) {
                this.f1537a = c0431a.f1537a;
                this.f1538b = c0431a.f1538b;
                this.f1539c = c0431a.f1539c;
                this.f1540d = c0431a.f1540d;
            }
        }

        public int getChangingConfigurations() {
            return this.f1537a | (this.f1538b != null ? this.f1538b.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    private static class C4798b extends C0431a {
        C4798b(C0431a c0431a) {
            super(c0431a);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C4799c(this, resources);
        }
    }

    C4799c(Drawable drawable) {
        this.f13376b = mo2548b();
        mo285a(drawable);
    }

    C4799c(C0431a c0431a, Resources resources) {
        this.f13376b = c0431a;
        if (this.f13376b != null && this.f13376b.f1538b != null) {
            mo285a(this.f13376b.f1538b.newDrawable(resources));
        }
    }

    private boolean m9158a(int[] iArr) {
        if (!mo3291c()) {
            return false;
        }
        ColorStateList colorStateList = this.f13376b.f1539c;
        Mode mode = this.f13376b.f1540d;
        if (colorStateList == null || mode == null) {
            this.f13380f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f13380f && colorForState == this.f13378d && mode == this.f13379e)) {
                setColorFilter(colorForState, mode);
                this.f13378d = colorForState;
                this.f13379e = mode;
                this.f13380f = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable mo284a() {
        return this.f13377c;
    }

    public final void mo285a(Drawable drawable) {
        if (this.f13377c != null) {
            this.f13377c.setCallback(null);
        }
        this.f13377c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f13376b != null) {
                this.f13376b.f1538b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    C0431a mo2548b() {
        return new C4798b(this.f13376b);
    }

    protected boolean mo3291c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f13377c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | (this.f13376b != null ? this.f13376b.getChangingConfigurations() : 0)) | this.f13377c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (this.f13376b != null) {
            if ((this.f13376b.f1538b != null ? 1 : null) != null) {
                this.f13376b.f1537a = getChangingConfigurations();
                return this.f13376b;
            }
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f13377c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f13377c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f13377c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f13377c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f13377c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f13377c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f13377c.getPadding(rect);
    }

    public int[] getState() {
        return this.f13377c.getState();
    }

    public Region getTransparentRegion() {
        return this.f13377c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo3291c() || this.f13376b == null) ? null : this.f13376b.f1539c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f13377c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f13377c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f13381g && super.mutate() == this) {
            this.f13376b = mo2548b();
            if (this.f13377c != null) {
                this.f13377c.mutate();
            }
            if (this.f13376b != null) {
                this.f13376b.f1538b = this.f13377c != null ? this.f13377c.getConstantState() : null;
            }
            this.f13381g = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f13377c != null) {
            this.f13377c.setBounds(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f13377c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f13377c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f13377c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f13377c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f13377c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f13377c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f13377c.setState(iArr);
        if (!m9158a(iArr)) {
            if (!state) {
                return false;
            }
        }
        return true;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f13376b.f1539c = colorStateList;
        m9158a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f13376b.f1540d = mode;
        m9158a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            if (!this.f13377c.setVisible(z, z2)) {
                return false;
            }
        }
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
