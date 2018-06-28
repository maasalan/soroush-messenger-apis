package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.view.C0551b;
import android.support.v4.view.C0551b.C4835b;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.view.menu.C0729p.C0728a;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class C4893j implements C0442b {
    static String f13679f;
    static String f13680g;
    static String f13681h;
    static String f13682i;
    private ColorStateList f13683A = null;
    private Mode f13684B = null;
    private boolean f13685C = false;
    private boolean f13686D = false;
    private boolean f13687E = false;
    private int f13688F = 16;
    private View f13689G;
    private OnActionExpandListener f13690H;
    private boolean f13691I = false;
    final int f13692a;
    C4890h f13693b;
    int f13694c = 0;
    public C0551b f13695d;
    ContextMenuInfo f13696e;
    private final int f13697j;
    private final int f13698k;
    private final int f13699l;
    private CharSequence f13700m;
    private CharSequence f13701n;
    private Intent f13702o;
    private char f13703p;
    private int f13704q = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    private char f13705r;
    private int f13706s = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    private Drawable f13707t;
    private int f13708u = 0;
    private C6399u f13709v;
    private Runnable f13710w;
    private OnMenuItemClickListener f13711x;
    private CharSequence f13712y;
    private CharSequence f13713z;

    class C48921 implements C4835b {
        final /* synthetic */ C4893j f13678a;

        C48921(C4893j c4893j) {
            this.f13678a = c4893j;
        }

        public final void mo540a() {
            this.f13678a.f13693b.m9492f();
        }
    }

    C4893j(C4890h c4890h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f13693b = c4890h;
        this.f13697j = i2;
        this.f13698k = i;
        this.f13699l = i3;
        this.f13692a = i4;
        this.f13700m = charSequence;
        this.f13694c = i5;
    }

    private Drawable m9499a(Drawable drawable) {
        if (drawable != null && this.f13687E && (this.f13685C || this.f13686D)) {
            drawable = C0429a.m896g(drawable).mutate();
            if (this.f13685C) {
                C0429a.m885a(drawable, this.f13683A);
            }
            if (this.f13686D) {
                C0429a.m888a(drawable, this.f13684B);
            }
            this.f13687E = false;
        }
        return drawable;
    }

    private C0442b m9500a(View view) {
        this.f13689G = view;
        this.f13695d = null;
        if (view != null && view.getId() == -1 && this.f13697j > 0) {
            view.setId(this.f13697j);
        }
        this.f13693b.m9493g();
        return this;
    }

    private void m9501e(boolean z) {
        int i = this.f13688F;
        this.f13688F = (z ? 2 : 0) | (this.f13688F & -3);
        if (i != this.f13688F) {
            this.f13693b.mo3264a(false);
        }
    }

    public final C0442b mo515a(C0551b c0551b) {
        if (this.f13695d != null) {
            this.f13695d.reset();
        }
        this.f13689G = null;
        this.f13695d = c0551b;
        this.f13693b.mo3264a(true);
        if (this.f13695d != null) {
            this.f13695d.setVisibilityListener(new C48921(this));
        }
        return this;
    }

    public final C0442b mo516a(CharSequence charSequence) {
        this.f13712y = charSequence;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final C0551b mo517a() {
        return this.f13695d;
    }

    final CharSequence m9505a(C0728a c0728a) {
        return (c0728a == null || !c0728a.mo129a()) ? getTitle() : getTitleCondensed();
    }

    public final void m9506a(C6399u c6399u) {
        this.f13709v = c6399u;
        c6399u.setHeaderTitle(getTitle());
    }

    public final void m9507a(boolean z) {
        this.f13688F = (z ? 4 : 0) | (this.f13688F & -5);
    }

    public final C0442b mo518b(CharSequence charSequence) {
        this.f13713z = charSequence;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final boolean m9509b() {
        if ((this.f13711x != null && this.f13711x.onMenuItemClick(this)) || this.f13693b.mo2621a(this.f13693b, (MenuItem) this)) {
            return true;
        }
        if (this.f13710w != null) {
            this.f13710w.run();
            return true;
        }
        if (this.f13702o != null) {
            try {
                this.f13693b.f13649a.startActivity(this.f13702o);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f13695d != null && this.f13695d.onPerformDefaultAction();
    }

    final boolean m9510b(boolean z) {
        int i = this.f13688F;
        this.f13688F = (z ? 0 : 8) | (this.f13688F & -9);
        return i != this.f13688F;
    }

    final char m9511c() {
        return this.f13693b.mo2623b() ? this.f13705r : this.f13703p;
    }

    public final void m9512c(boolean z) {
        this.f13688F = z ? this.f13688F | 32 : this.f13688F & -33;
    }

    public final boolean collapseActionView() {
        if ((this.f13694c & 8) == 0) {
            return false;
        }
        if (this.f13689G == null) {
            return true;
        }
        if (this.f13690H != null) {
            if (!this.f13690H.onMenuItemActionCollapse(this)) {
                return false;
            }
        }
        return this.f13693b.mo2624b(this);
    }

    public final void m9513d(boolean z) {
        this.f13691I = z;
        this.f13693b.mo3264a(false);
    }

    final boolean m9514d() {
        return this.f13693b.mo2625c() && m9511c() != '\u0000';
    }

    public final boolean m9515e() {
        return (this.f13688F & 4) != 0;
    }

    public final boolean expandActionView() {
        if (!m9519i()) {
            return false;
        }
        if (this.f13690H != null) {
            if (!this.f13690H.onMenuItemActionExpand(this)) {
                return false;
            }
        }
        return this.f13693b.mo2622a(this);
    }

    public final boolean m9516f() {
        return (this.f13688F & 32) == 32;
    }

    public final boolean m9517g() {
        return (this.f13694c & 1) == 1;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        if (this.f13689G != null) {
            return this.f13689G;
        }
        if (this.f13695d == null) {
            return null;
        }
        this.f13689G = this.f13695d.onCreateActionView(this);
        return this.f13689G;
    }

    public final int getAlphabeticModifiers() {
        return this.f13706s;
    }

    public final char getAlphabeticShortcut() {
        return this.f13705r;
    }

    public final CharSequence getContentDescription() {
        return this.f13712y;
    }

    public final int getGroupId() {
        return this.f13698k;
    }

    public final Drawable getIcon() {
        Drawable drawable;
        if (this.f13707t != null) {
            drawable = this.f13707t;
        } else if (this.f13708u == 0) {
            return null;
        } else {
            drawable = C0683b.m1656b(this.f13693b.f13649a, this.f13708u);
            this.f13708u = 0;
            this.f13707t = drawable;
        }
        return m9499a(drawable);
    }

    public final ColorStateList getIconTintList() {
        return this.f13683A;
    }

    public final Mode getIconTintMode() {
        return this.f13684B;
    }

    public final Intent getIntent() {
        return this.f13702o;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f13697j;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.f13696e;
    }

    public final int getNumericModifiers() {
        return this.f13704q;
    }

    public final char getNumericShortcut() {
        return this.f13703p;
    }

    public final int getOrder() {
        return this.f13699l;
    }

    public final SubMenu getSubMenu() {
        return this.f13709v;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f13700m;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13701n != null ? this.f13701n : this.f13700m;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final CharSequence getTooltipText() {
        return this.f13713z;
    }

    public final boolean m9518h() {
        return (this.f13694c & 2) == 2;
    }

    public final boolean hasSubMenu() {
        return this.f13709v != null;
    }

    public final boolean m9519i() {
        if ((this.f13694c & 8) != 0) {
            if (this.f13689G == null && this.f13695d != null) {
                this.f13689G = this.f13695d.onCreateActionView(this);
            }
            if (this.f13689G != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f13691I;
    }

    public final boolean isCheckable() {
        return (this.f13688F & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f13688F & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f13688F & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f13695d == null || !this.f13695d.overridesItemVisibility()) ? (this.f13688F & 8) == 0 : (this.f13688F & 8) == 0 && this.f13695d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f13693b.f13649a;
        m9500a(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        return m9500a(view);
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f13705r == c) {
            return this;
        }
        this.f13705r = Character.toLowerCase(c);
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f13705r == c && this.f13706s == i) {
            return this;
        }
        this.f13705r = Character.toLowerCase(c);
        this.f13706s = KeyEvent.normalizeMetaState(i);
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f13688F;
        this.f13688F = z | (this.f13688F & -2);
        if (i != this.f13688F) {
            this.f13693b.mo3264a(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f13688F & 4) != 0) {
            C4890h c4890h = this.f13693b;
            int groupId = getGroupId();
            int size = c4890h.f13651c.size();
            c4890h.m9489d();
            for (int i = 0; i < size; i++) {
                C4893j c4893j = (C4893j) c4890h.f13651c.get(i);
                if (c4893j.getGroupId() == groupId && c4893j.m9515e() && c4893j.isCheckable()) {
                    c4893j.m9501e(c4893j == this);
                }
            }
            c4890h.m9491e();
            return this;
        }
        m9501e(z);
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo516a(charSequence);
    }

    public final MenuItem setEnabled(boolean z) {
        this.f13688F = z ? this.f13688F | 16 : this.f13688F & -17;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f13707t = null;
        this.f13708u = i;
        this.f13687E = true;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f13708u = 0;
        this.f13707t = drawable;
        this.f13687E = true;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13683A = colorStateList;
        this.f13685C = true;
        this.f13687E = true;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f13684B = mode;
        this.f13686D = true;
        this.f13687E = true;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f13702o = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f13703p == c) {
            return this;
        }
        this.f13703p = c;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f13703p == c && this.f13704q == i) {
            return this;
        }
        this.f13703p = c;
        this.f13704q = KeyEvent.normalizeMetaState(i);
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f13690H = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f13711x = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f13703p = c;
        this.f13705r = Character.toLowerCase(c2);
        this.f13693b.mo3264a(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f13703p = c;
        this.f13704q = KeyEvent.normalizeMetaState(i);
        this.f13705r = Character.toLowerCase(c2);
        this.f13706s = KeyEvent.normalizeMetaState(i2);
        this.f13693b.mo3264a(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f13694c = i;
                this.f13693b.m9493g();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle(this.f13693b.f13649a.getString(i));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13700m = charSequence;
        this.f13693b.mo3264a(false);
        if (this.f13709v != null) {
            this.f13709v.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13701n = charSequence;
        this.f13693b.mo3264a(false);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo518b(charSequence);
    }

    public final MenuItem setVisible(boolean z) {
        if (m9510b(z)) {
            this.f13693b.m9492f();
        }
        return this;
    }

    public final String toString() {
        return this.f13700m != null ? this.f13700m.toString() : null;
    }
}
