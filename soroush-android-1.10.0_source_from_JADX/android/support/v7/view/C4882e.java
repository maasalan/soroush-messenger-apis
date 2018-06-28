package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.C0705b.C0704a;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class C4882e extends C0705b implements C0722a {
    private Context f13582a;
    private ActionBarContextView f13583b;
    private C0704a f13584e;
    private WeakReference<View> f13585f;
    private boolean f13586g;
    private boolean f13587h;
    private C4890h f13588i;

    public C4882e(Context context, ActionBarContextView actionBarContextView, C0704a c0704a, boolean z) {
        this.f13582a = context;
        this.f13583b = actionBarContextView;
        this.f13584e = c0704a;
        C4890h c4890h = new C4890h(actionBarContextView.getContext());
        this.f13588i = c4890h;
        this.f13588i.mo2620a((C0722a) this);
        this.f13587h = z;
    }

    public final MenuInflater mo490a() {
        return new C0711g(this.f13583b.getContext());
    }

    public final void mo491a(int i) {
        mo497b(this.f13582a.getString(i));
    }

    public final void mo492a(View view) {
        this.f13583b.setCustomView(view);
        this.f13585f = view != null ? new WeakReference(view) : null;
    }

    public final void mo493a(CharSequence charSequence) {
        this.f13583b.setSubtitle(charSequence);
    }

    public final void mo494a(boolean z) {
        super.mo494a(z);
        this.f13583b.setTitleOptional(z);
    }

    public final Menu mo495b() {
        return this.f13588i;
    }

    public final void mo496b(int i) {
        mo493a(this.f13582a.getString(i));
    }

    public final void mo497b(CharSequence charSequence) {
        this.f13583b.setTitle(charSequence);
    }

    public final void mo498c() {
        if (!this.f13586g) {
            this.f13586g = true;
            this.f13583b.sendAccessibilityEvent(32);
            this.f13584e.mo446a(this);
        }
    }

    public final void mo499d() {
        this.f13584e.mo449b(this, this.f13588i);
    }

    public final CharSequence mo500f() {
        return this.f13583b.getTitle();
    }

    public final CharSequence mo501g() {
        return this.f13583b.getSubtitle();
    }

    public final boolean mo502h() {
        return this.f13583b.isTitleOptional();
    }

    public final View mo503i() {
        return this.f13585f != null ? (View) this.f13585f.get() : null;
    }

    public final boolean onMenuItemSelected(C4890h c4890h, MenuItem menuItem) {
        return this.f13584e.mo448a((C0705b) this, menuItem);
    }

    public final void onMenuModeChange(C4890h c4890h) {
        mo499d();
        this.f13583b.showOverflowMenu();
    }
}
