package android.support.v4.p031b.p032a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p031b.p032a.C4799c.C0431a;

class C6362d extends C4799c {

    private static class C4800a extends C0431a {
        C4800a(C0431a c0431a) {
            super(c0431a);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C6362d(this, resources);
        }
    }

    C6362d(Drawable drawable) {
        super(drawable);
    }

    C6362d(C0431a c0431a, Resources resources) {
        super(c0431a, resources);
    }

    C0431a mo2548b() {
        return new C4800a(this.b);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }
}
