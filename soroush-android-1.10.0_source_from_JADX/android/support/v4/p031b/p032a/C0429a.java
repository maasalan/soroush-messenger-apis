package android.support.v4.p031b.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class C0429a {
    static final C0428e f1536a;

    static class C0428e {
        C0428e() {
        }

        public int mo281a(Drawable drawable) {
            return 0;
        }

        public void mo3281a(Drawable drawable, float f, float f2) {
        }

        public void mo3282a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        public void mo3283a(Drawable drawable, ColorStateList colorStateList) {
            if (drawable instanceof C0432f) {
                ((C0432f) drawable).setTintList(colorStateList);
            }
        }

        public void mo3284a(Drawable drawable, Theme theme) {
        }

        public void mo3285a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }

        public void mo3286a(Drawable drawable, Mode mode) {
            if (drawable instanceof C0432f) {
                ((C0432f) drawable).setTintMode(mode);
            }
        }

        public void mo2544a(Drawable drawable, boolean z) {
        }

        public boolean mo282a(Drawable drawable, int i) {
            return false;
        }

        public void mo3287b(Drawable drawable, int i) {
            if (drawable instanceof C0432f) {
                ((C0432f) drawable).setTint(i);
            }
        }

        public boolean mo2545b(Drawable drawable) {
            return false;
        }

        public Drawable mo2546c(Drawable drawable) {
            return !(drawable instanceof C0432f) ? new C4799c(drawable) : drawable;
        }

        public int mo2547d(Drawable drawable) {
            return 0;
        }

        public boolean mo3288e(Drawable drawable) {
            return false;
        }

        public ColorFilter mo3289f(Drawable drawable) {
            return null;
        }

        public void mo3290g(Drawable drawable) {
            drawable.clearColorFilter();
        }
    }

    static class C4797a extends C0428e {
        private static Method f13371a;
        private static boolean f13372b;
        private static Method f13373c;
        private static boolean f13374d;

        C4797a() {
        }

        public int mo281a(Drawable drawable) {
            if (!f13374d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f13373c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("DrawableCompatApi17", "Failed to retrieve getLayoutDirection() method", e);
                }
                f13374d = true;
            }
            if (f13373c != null) {
                try {
                    return ((Integer) f13373c.invoke(drawable, new Object[0])).intValue();
                } catch (Throwable e2) {
                    Log.i("DrawableCompatApi17", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f13373c = null;
                }
            }
            return 0;
        }

        public boolean mo282a(Drawable drawable, int i) {
            if (!f13372b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f13371a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f13372b = true;
            }
            if (f13371a != null) {
                try {
                    f13371a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Throwable e2) {
                    Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f13371a = null;
                }
            }
            return false;
        }
    }

    static class C6361b extends C4797a {
        C6361b() {
        }

        public final void mo2544a(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }

        public final boolean mo2545b(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public Drawable mo2546c(Drawable drawable) {
            return !(drawable instanceof C0432f) ? new C6362d(drawable) : drawable;
        }

        public final int mo2547d(Drawable drawable) {
            return drawable.getAlpha();
        }
    }

    static class C7014c extends C6361b {
        C7014c() {
        }

        public final void mo3281a(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        public final void mo3282a(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        public final void mo3283a(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public final void mo3284a(Drawable drawable, Theme theme) {
            drawable.applyTheme(theme);
        }

        public final void mo3285a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public final void mo3286a(Drawable drawable, Mode mode) {
            drawable.setTintMode(mode);
        }

        public final void mo3287b(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        public Drawable mo2546c(Drawable drawable) {
            return !(drawable instanceof C0432f) ? new C7015e(drawable) : drawable;
        }

        public final boolean mo3288e(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public final ColorFilter mo3289f(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public void mo3290g(Drawable drawable) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                drawable = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof C0430b) {
                drawable = ((C0430b) drawable).mo284a();
            } else {
                if (drawable instanceof DrawableContainer) {
                    DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                    if (drawableContainerState != null) {
                        int childCount = drawableContainerState.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            Drawable child = drawableContainerState.getChild(i);
                            if (child != null) {
                                mo3290g(child);
                            }
                        }
                    }
                }
                return;
            }
            mo3290g(drawable);
        }
    }

    static class C7251d extends C7014c {
        C7251d() {
        }

        public final int mo281a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public final boolean mo282a(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        public final Drawable mo2546c(Drawable drawable) {
            return drawable;
        }

        public final void mo3290g(Drawable drawable) {
            drawable.clearColorFilter();
        }
    }

    static {
        C0428e c7251d = VERSION.SDK_INT >= 23 ? new C7251d() : VERSION.SDK_INT >= 21 ? new C7014c() : VERSION.SDK_INT >= 19 ? new C6361b() : VERSION.SDK_INT >= 17 ? new C4797a() : new C0428e();
        f1536a = c7251d;
    }

    public static void m881a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void m882a(Drawable drawable, float f, float f2) {
        f1536a.mo3281a(drawable, f, f2);
    }

    public static void m883a(Drawable drawable, int i) {
        f1536a.mo3287b(drawable, i);
    }

    public static void m884a(Drawable drawable, int i, int i2, int i3, int i4) {
        f1536a.mo3282a(drawable, i, i2, i3, i4);
    }

    public static void m885a(Drawable drawable, ColorStateList colorStateList) {
        f1536a.mo3283a(drawable, colorStateList);
    }

    public static void m886a(Drawable drawable, Theme theme) {
        f1536a.mo3284a(drawable, theme);
    }

    public static void m887a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        f1536a.mo3285a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static void m888a(Drawable drawable, Mode mode) {
        f1536a.mo3286a(drawable, mode);
    }

    public static void m889a(Drawable drawable, boolean z) {
        f1536a.mo2544a(drawable, z);
    }

    public static boolean m890b(Drawable drawable) {
        return f1536a.mo2545b(drawable);
    }

    public static boolean m891b(Drawable drawable, int i) {
        return f1536a.mo282a(drawable, i);
    }

    public static int m892c(Drawable drawable) {
        return f1536a.mo2547d(drawable);
    }

    public static boolean m893d(Drawable drawable) {
        return f1536a.mo3288e(drawable);
    }

    public static ColorFilter m894e(Drawable drawable) {
        return f1536a.mo3289f(drawable);
    }

    public static void m895f(Drawable drawable) {
        f1536a.mo3290g(drawable);
    }

    public static Drawable m896g(Drawable drawable) {
        return f1536a.mo2546c(drawable);
    }

    public static <T extends Drawable> T m897h(Drawable drawable) {
        return drawable instanceof C0430b ? ((C0430b) drawable).mo284a() : drawable;
    }

    public static int m898i(Drawable drawable) {
        return f1536a.mo281a(drawable);
    }
}
