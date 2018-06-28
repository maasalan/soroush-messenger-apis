package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p033c.p034a.C4805c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class C7026v extends C6397r implements SubMenu {
    C7026v(Context context, C4805c c4805c) {
        super(context, c4805c);
    }

    public final void clearHeader() {
        ((C4805c) this.d).clearHeader();
    }

    public final MenuItem getItem() {
        return m9464a(((C4805c) this.d).getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        ((C4805c) this.d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((C4805c) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        ((C4805c) this.d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((C4805c) this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((C4805c) this.d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        ((C4805c) this.d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((C4805c) this.d).setIcon(drawable);
        return this;
    }
}
