package com.cocosw.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.p029a.C0346c;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.view.C0551b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class C5287b implements C0442b {
    int f14663a = 16;
    private final int f14664b;
    private final int f14665c;
    private final int f14666d;
    private final int f14667e;
    private CharSequence f14668f;
    private CharSequence f14669g;
    private Intent f14670h;
    private char f14671i;
    private char f14672j;
    private Drawable f14673k;
    private int f14674l = 0;
    private Context f14675m;
    private OnMenuItemClickListener f14676n;

    public C5287b(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.f14675m = context;
        this.f14664b = i2;
        this.f14665c = i;
        this.f14666d = 0;
        this.f14667e = i3;
        this.f14668f = charSequence;
    }

    public final C0442b mo515a(C0551b c0551b) {
        throw new UnsupportedOperationException();
    }

    public final C0551b mo517a() {
        return null;
    }

    public final boolean m10970b() {
        if (this.f14676n != null && this.f14676n.onMenuItemClick(this)) {
            return true;
        }
        if (this.f14670h == null) {
            return false;
        }
        this.f14675m.startActivity(this.f14670h);
        return true;
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

    public final char getAlphabeticShortcut() {
        return this.f14672j;
    }

    public final int getGroupId() {
        return this.f14665c;
    }

    public final Drawable getIcon() {
        return this.f14673k;
    }

    public final Intent getIntent() {
        return this.f14670h;
    }

    public final int getItemId() {
        return this.f14664b;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final char getNumericShortcut() {
        return this.f14671i;
    }

    public final int getOrder() {
        return this.f14667e;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f14668f;
    }

    public final CharSequence getTitleCondensed() {
        return this.f14669g != null ? this.f14669g : this.f14668f;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f14663a & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f14663a & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f14663a & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f14663a & 8) == 0;
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
        this.f14672j = c;
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f14663a = z | (this.f14663a & -2);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f14663a = (z ? 2 : 0) | (this.f14663a & -3);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f14663a = (z ? 16 : 0) | (this.f14663a & -17);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f14674l = i;
        if (i > 0) {
            this.f14673k = C0346c.m682a(this.f14675m, i);
        }
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f14673k = drawable;
        this.f14674l = 0;
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f14670h = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f14671i = c;
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f14676n = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f14671i = c;
        this.f14672j = c2;
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f14668f = this.f14675m.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14668f = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14669g = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f14663a & 8;
        if (z) {
            i = 0;
        }
        this.f14663a = i2 | i;
        return this;
    }
}
