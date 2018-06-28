package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.view.C0551b;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class C4885a implements C0442b {
    private final int f13612a;
    private final int f13613b;
    private final int f13614c;
    private final int f13615d;
    private CharSequence f13616e;
    private CharSequence f13617f;
    private Intent f13618g;
    private char f13619h;
    private int f13620i = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    private char f13621j;
    private int f13622k = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    private Drawable f13623l;
    private int f13624m = 0;
    private Context f13625n;
    private OnMenuItemClickListener f13626o;
    private CharSequence f13627p;
    private CharSequence f13628q;
    private ColorStateList f13629r = null;
    private Mode f13630s = null;
    private boolean f13631t = false;
    private boolean f13632u = false;
    private int f13633v = 16;

    public C4885a(Context context, CharSequence charSequence) {
        this.f13625n = context;
        this.f13612a = 16908332;
        this.f13613b = 0;
        this.f13614c = 0;
        this.f13615d = 0;
        this.f13616e = charSequence;
    }

    private void m9459b() {
        if (this.f13623l == null) {
            return;
        }
        if (this.f13631t || this.f13632u) {
            this.f13623l = C0429a.m896g(this.f13623l);
            this.f13623l = this.f13623l.mutate();
            if (this.f13631t) {
                C0429a.m885a(this.f13623l, this.f13629r);
            }
            if (this.f13632u) {
                C0429a.m888a(this.f13623l, this.f13630s);
            }
        }
    }

    public final C0442b mo515a(C0551b c0551b) {
        throw new UnsupportedOperationException();
    }

    public final C0442b mo516a(CharSequence charSequence) {
        this.f13627p = charSequence;
        return this;
    }

    public final C0551b mo517a() {
        return null;
    }

    public final C0442b mo518b(CharSequence charSequence) {
        this.f13628q = charSequence;
        return this;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f13622k;
    }

    public final char getAlphabeticShortcut() {
        return this.f13621j;
    }

    public final CharSequence getContentDescription() {
        return this.f13627p;
    }

    public final int getGroupId() {
        return this.f13613b;
    }

    public final Drawable getIcon() {
        return this.f13623l;
    }

    public final ColorStateList getIconTintList() {
        return this.f13629r;
    }

    public final Mode getIconTintMode() {
        return this.f13630s;
    }

    public final Intent getIntent() {
        return this.f13618g;
    }

    public final int getItemId() {
        return this.f13612a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f13620i;
    }

    public final char getNumericShortcut() {
        return this.f13619h;
    }

    public final int getOrder() {
        return this.f13615d;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f13616e;
    }

    public final CharSequence getTitleCondensed() {
        return this.f13617f != null ? this.f13617f : this.f13616e;
    }

    public final CharSequence getTooltipText() {
        return this.f13628q;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f13633v & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f13633v & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f13633v & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f13633v & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f13621j = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f13621j = Character.toLowerCase(c);
        this.f13622k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f13633v = z | (this.f13633v & -2);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f13633v = (z ? 2 : 0) | (this.f13633v & -3);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f13627p = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f13633v = (z ? 16 : 0) | (this.f13633v & -17);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f13624m = i;
        this.f13623l = C0346c.m682a(this.f13625n, i);
        m9459b();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f13623l = drawable;
        this.f13624m = 0;
        m9459b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13629r = colorStateList;
        this.f13631t = true;
        m9459b();
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f13630s = mode;
        this.f13632u = true;
        m9459b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f13618g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f13619h = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f13619h = c;
        this.f13620i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f13626o = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f13619h = c;
        this.f13621j = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f13619h = c;
        this.f13620i = KeyEvent.normalizeMetaState(i);
        this.f13621j = Character.toLowerCase(c2);
        this.f13622k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f13616e = this.f13625n.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13616e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13617f = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f13628q = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f13633v & 8;
        if (z) {
            i = 0;
        }
        this.f13633v = i2 | i;
        return this;
    }
}
