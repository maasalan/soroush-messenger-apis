package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class C0615d {
    private static final C0614c f2043a;

    static class C0614c {
        private static Field f2041a;
        private static boolean f2042b;

        C0614c() {
        }

        public Drawable mo2575a(CompoundButton compoundButton) {
            if (!f2042b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f2041a = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f2042b = true;
            }
            if (f2041a != null) {
                try {
                    return (Drawable) f2041a.get(compoundButton);
                } catch (Throwable e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    f2041a = null;
                }
            }
            return null;
        }

        public void mo425a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof C0629n) {
                ((C0629n) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        public void mo426a(CompoundButton compoundButton, Mode mode) {
            if (compoundButton instanceof C0629n) {
                ((C0629n) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static class C4853a extends C0614c {
        C4853a() {
        }

        public final void mo425a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        public final void mo426a(CompoundButton compoundButton, Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    static class C6381b extends C4853a {
        C6381b() {
        }

        public final Drawable mo2575a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    static {
        C0614c c6381b = VERSION.SDK_INT >= 23 ? new C6381b() : VERSION.SDK_INT >= 21 ? new C4853a() : new C0614c();
        f2043a = c6381b;
    }

    public static Drawable m1497a(CompoundButton compoundButton) {
        return f2043a.mo2575a(compoundButton);
    }

    public static void m1498a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f2043a.mo425a(compoundButton, colorStateList);
    }

    public static void m1499a(CompoundButton compoundButton, Mode mode) {
        f2043a.mo426a(compoundButton, mode);
    }
}
