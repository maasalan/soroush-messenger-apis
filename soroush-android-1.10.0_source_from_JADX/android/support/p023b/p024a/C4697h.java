package android.support.p023b.p024a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p031b.p032a.C0432f;

abstract class C4697h extends Drawable implements C0432f {
    Drawable f12899b;

    C4697h() {
    }

    public void applyTheme(Theme theme) {
        if (this.f12899b != null) {
            C0429a.m886a(this.f12899b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f12899b != null) {
            this.f12899b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        return this.f12899b != null ? C0429a.m894e(this.f12899b) : null;
    }

    public Drawable getCurrent() {
        return this.f12899b != null ? this.f12899b.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f12899b != null ? this.f12899b.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f12899b != null ? this.f12899b.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f12899b != null ? this.f12899b.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f12899b != null ? this.f12899b.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f12899b != null ? this.f12899b.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f12899b != null) {
            C0429a.m881a(this.f12899b);
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f12899b != null) {
            this.f12899b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f12899b != null ? this.f12899b.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f12899b != null) {
            this.f12899b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f12899b != null) {
            this.f12899b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f12899b != null) {
            this.f12899b.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f12899b != null) {
            C0429a.m882a(this.f12899b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f12899b != null) {
            C0429a.m884a(this.f12899b, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f12899b != null ? this.f12899b.setState(iArr) : super.setState(iArr);
    }
}
