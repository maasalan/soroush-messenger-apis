package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.view.C0551b;
import android.support.v7.view.C0706c;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class C6395k extends C4887c<C0442b> implements MenuItem {
    public Method f17523e;

    class C4894a extends C0551b {
        final ActionProvider f13714a;
        final /* synthetic */ C6395k f13715b;

        public C4894a(C6395k c6395k, Context context, ActionProvider actionProvider) {
            this.f13715b = c6395k;
            super(context);
            this.f13714a = actionProvider;
        }

        public boolean hasSubMenu() {
            return this.f13714a.hasSubMenu();
        }

        public View onCreateActionView() {
            return this.f13714a.onCreateActionView();
        }

        public boolean onPerformDefaultAction() {
            return this.f13714a.onPerformDefaultAction();
        }

        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f13714a.onPrepareSubMenu(this.f13715b.m9465a(subMenu));
        }
    }

    static class C4895b extends FrameLayout implements C0706c {
        final CollapsibleActionView f13716a;

        C4895b(View view) {
            super(view.getContext());
            this.f13716a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f13716a.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f13716a.onActionViewExpanded();
        }
    }

    private class C4896c extends C0715d<OnActionExpandListener> implements OnActionExpandListener {
        final /* synthetic */ C6395k f13717a;

        C4896c(C6395k c6395k, OnActionExpandListener onActionExpandListener) {
            this.f13717a = c6395k;
            super(onActionExpandListener);
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.d).onMenuItemActionCollapse(this.f13717a.m9464a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.d).onMenuItemActionExpand(this.f13717a.m9464a(menuItem));
        }
    }

    private class C4897d extends C0715d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        final /* synthetic */ C6395k f13718a;

        C4897d(C6395k c6395k, OnMenuItemClickListener onMenuItemClickListener) {
            this.f13718a = c6395k;
            super(onMenuItemClickListener);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.d).onMenuItemClick(this.f13718a.m9464a(menuItem));
        }
    }

    C6395k(Context context, C0442b c0442b) {
        super(context, c0442b);
    }

    C4894a mo3306a(ActionProvider actionProvider) {
        return new C4894a(this, this.a, actionProvider);
    }

    public boolean collapseActionView() {
        return ((C0442b) this.d).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0442b) this.d).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0551b a = ((C0442b) this.d).mo517a();
        return a instanceof C4894a ? ((C4894a) a).f13714a : null;
    }

    public View getActionView() {
        View actionView = ((C0442b) this.d).getActionView();
        return actionView instanceof C4895b ? (View) ((C4895b) actionView).f13716a : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0442b) this.d).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0442b) this.d).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0442b) this.d).getContentDescription();
    }

    public int getGroupId() {
        return ((C0442b) this.d).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0442b) this.d).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0442b) this.d).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0442b) this.d).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0442b) this.d).getIntent();
    }

    public int getItemId() {
        return ((C0442b) this.d).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0442b) this.d).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0442b) this.d).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0442b) this.d).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0442b) this.d).getOrder();
    }

    public SubMenu getSubMenu() {
        return m9465a(((C0442b) this.d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0442b) this.d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0442b) this.d).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0442b) this.d).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0442b) this.d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0442b) this.d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0442b) this.d).isCheckable();
    }

    public boolean isChecked() {
        return ((C0442b) this.d).isChecked();
    }

    public boolean isEnabled() {
        return ((C0442b) this.d).isEnabled();
    }

    public boolean isVisible() {
        return ((C0442b) this.d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0442b) this.d).mo515a(actionProvider != null ? mo3306a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0442b) this.d).setActionView(i);
        View actionView = ((C0442b) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0442b) this.d).setActionView(new C4895b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C4895b(view);
        }
        ((C0442b) this.d).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0442b) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0442b) this.d).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0442b) this.d).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0442b) this.d).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0442b) this.d).mo516a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0442b) this.d).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0442b) this.d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0442b) this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0442b) this.d).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0442b) this.d).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0442b) this.d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0442b) this.d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0442b) this.d).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0442b) this.d).setOnActionExpandListener(onActionExpandListener != null ? new C4896c(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0442b) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C4897d(this, onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0442b) this.d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0442b) this.d).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0442b) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0442b) this.d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0442b) this.d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0442b) this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0442b) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0442b) this.d).mo518b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0442b) this.d).setVisible(z);
    }
}
