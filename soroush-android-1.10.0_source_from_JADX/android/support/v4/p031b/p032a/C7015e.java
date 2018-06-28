package android.support.v4.p031b.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p031b.p032a.C4799c.C0431a;
import android.util.Log;
import java.lang.reflect.Method;

final class C7015e extends C6362d {
    private static Method f20033d;

    private static class C4801a extends C0431a {
        C4801a(C0431a c0431a) {
            super(c0431a);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C7015e(this, resources);
        }
    }

    C7015e(Drawable drawable) {
        super(drawable);
        C7015e.m18111d();
    }

    C7015e(C0431a c0431a, Resources resources) {
        super(c0431a, resources);
        C7015e.m18111d();
    }

    private static void m18111d() {
        if (f20033d == null) {
            try {
                f20033d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Throwable e) {
                Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    final C0431a mo2548b() {
        return new C4801a(this.b);
    }

    protected final boolean mo3291c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        if (!((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable))) {
            if (!(drawable instanceof RippleDrawable)) {
                return false;
            }
        }
        return true;
    }

    public final Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public final void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public final void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (mo3291c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (mo3291c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (mo3291c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }
}
