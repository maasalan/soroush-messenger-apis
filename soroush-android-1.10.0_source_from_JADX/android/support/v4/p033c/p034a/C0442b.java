package android.support.v4.p033c.p034a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.C0551b;
import android.view.MenuItem;
import android.view.View;

public interface C0442b extends MenuItem {
    C0442b mo515a(C0551b c0551b);

    C0442b mo516a(CharSequence charSequence);

    C0551b mo517a();

    C0442b mo518b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
