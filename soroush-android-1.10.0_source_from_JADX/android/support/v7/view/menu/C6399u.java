package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C4890h.C0722a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class C6399u extends C4890h implements SubMenu {
    public C4890h f17546l;
    private C4893j f17547m;

    public C6399u(Context context, C4890h c4890h, C4893j c4893j) {
        super(context);
        this.f17546l = c4890h;
        this.f17547m = c4893j;
    }

    public final String mo2619a() {
        int itemId = this.f17547m != null ? this.f17547m.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo2619a());
        stringBuilder.append(":");
        stringBuilder.append(itemId);
        return stringBuilder.toString();
    }

    public final void mo2620a(C0722a c0722a) {
        this.f17546l.mo2620a(c0722a);
    }

    final boolean mo2621a(C4890h c4890h, MenuItem menuItem) {
        if (!super.mo2621a(c4890h, menuItem)) {
            if (!this.f17546l.mo2621a(c4890h, menuItem)) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo2622a(C4893j c4893j) {
        return this.f17546l.mo2622a(c4893j);
    }

    public final boolean mo2623b() {
        return this.f17546l.mo2623b();
    }

    public final boolean mo2624b(C4893j c4893j) {
        return this.f17546l.mo2624b(c4893j);
    }

    public final boolean mo2625c() {
        return this.f17546l.mo2625c();
    }

    public MenuItem getItem() {
        return this.f17547m;
    }

    public final C4890h mo2626k() {
        return this.f17546l.mo2626k();
    }

    public SubMenu setHeaderIcon(int i) {
        super.m9473a(0, null, i, null, null);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m9473a(0, null, 0, drawable, null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.m9473a(i, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m9473a(0, charSequence, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.m9473a(0, null, 0, null, view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f17547m.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f17547m.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f17546l.setQwertyMode(z);
    }
}
