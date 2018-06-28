package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.v4.p033c.p034a.C0442b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class C0559f {
    static final C0558c f1851a = (VERSION.SDK_INT >= 26 ? new C6375a() : new C4840b());

    interface C0558c {
        void mo401a(MenuItem menuItem, char c, int i);

        void mo402a(MenuItem menuItem, ColorStateList colorStateList);

        void mo403a(MenuItem menuItem, Mode mode);

        void mo404a(MenuItem menuItem, CharSequence charSequence);

        void mo405b(MenuItem menuItem, char c, int i);

        void mo406b(MenuItem menuItem, CharSequence charSequence);
    }

    static class C4840b implements C0558c {
        C4840b() {
        }

        public void mo401a(MenuItem menuItem, char c, int i) {
        }

        public void mo402a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        public void mo403a(MenuItem menuItem, Mode mode) {
        }

        public void mo404a(MenuItem menuItem, CharSequence charSequence) {
        }

        public void mo405b(MenuItem menuItem, char c, int i) {
        }

        public void mo406b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    static class C6375a extends C4840b {
        C6375a() {
        }

        public final void mo401a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        public final void mo402a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        public final void mo403a(MenuItem menuItem, Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        public final void mo404a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        public final void mo405b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        public final void mo406b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem m1235a(MenuItem menuItem, C0551b c0551b) {
        if (menuItem instanceof C0442b) {
            return ((C0442b) menuItem).mo515a(c0551b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static View m1236a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static void m1237a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0442b) {
            ((C0442b) menuItem).setNumericShortcut(c, i);
        } else {
            f1851a.mo405b(menuItem, c, i);
        }
    }

    public static void m1238a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0442b) {
            ((C0442b) menuItem).setIconTintList(colorStateList);
        } else {
            f1851a.mo402a(menuItem, colorStateList);
        }
    }

    public static void m1239a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0442b) {
            ((C0442b) menuItem).setIconTintMode(mode);
        } else {
            f1851a.mo403a(menuItem, mode);
        }
    }

    public static void m1240a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0442b) {
            ((C0442b) menuItem).mo516a(charSequence);
        } else {
            f1851a.mo404a(menuItem, charSequence);
        }
    }

    public static void m1241b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0442b) {
            ((C0442b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1851a.mo401a(menuItem, c, i);
        }
    }

    public static void m1242b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0442b) {
            ((C0442b) menuItem).mo518b(charSequence);
        } else {
            f1851a.mo406b(menuItem, charSequence);
        }
    }
}
