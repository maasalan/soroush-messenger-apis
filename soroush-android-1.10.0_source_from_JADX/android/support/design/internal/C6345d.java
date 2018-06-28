package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4893j;
import android.support.v7.view.menu.C6399u;
import android.view.SubMenu;

public final class C6345d extends C4890h {
    public C6345d(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C4893j c4893j = (C4893j) m9471a(i, i2, i3, charSequence);
        C6399u c7010f = new C7010f(this.f13649a, this, c4893j);
        c4893j.m9506a(c7010f);
        return c7010f;
    }
}
