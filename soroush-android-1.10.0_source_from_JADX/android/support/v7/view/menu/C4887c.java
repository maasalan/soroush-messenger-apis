package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.p033c.p034a.C4805c;
import android.support.v4.p038g.C4813a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class C4887c<T> extends C0715d<T> {
    final Context f13634a;
    Map<C0442b, MenuItem> f13635b;
    Map<C4805c, SubMenu> f13636c;

    C4887c(Context context, T t) {
        super(t);
        this.f13634a = context;
    }

    final MenuItem m9464a(MenuItem menuItem) {
        if (!(menuItem instanceof C0442b)) {
            return menuItem;
        }
        C0442b c0442b = (C0442b) menuItem;
        if (this.f13635b == null) {
            this.f13635b = new C4813a();
        }
        menuItem = (MenuItem) this.f13635b.get(menuItem);
        if (menuItem != null) {
            return menuItem;
        }
        menuItem = C0730q.m1737a(this.f13634a, c0442b);
        this.f13635b.put(c0442b, menuItem);
        return menuItem;
    }

    final SubMenu m9465a(SubMenu subMenu) {
        if (!(subMenu instanceof C4805c)) {
            return subMenu;
        }
        C4805c c4805c = (C4805c) subMenu;
        if (this.f13636c == null) {
            this.f13636c = new C4813a();
        }
        SubMenu subMenu2 = (SubMenu) this.f13636c.get(c4805c);
        if (subMenu2 == null) {
            C7026v c7026v = new C7026v(this.f13634a, c4805c);
            this.f13636c.put(c4805c, c7026v);
            subMenu2 = c7026v;
        }
        return subMenu2;
    }
}
