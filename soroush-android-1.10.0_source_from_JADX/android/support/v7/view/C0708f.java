package android.support.v7.view;

import android.content.Context;
import android.support.v4.p033c.p034a.C0441a;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.p038g.C0482m;
import android.support.v7.view.C0705b.C0704a;
import android.support.v7.view.menu.C0730q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public final class C0708f extends ActionMode {
    final Context f2321a;
    final C0705b f2322b;

    public static class C4883a implements C0704a {
        final Callback f13589a;
        final Context f13590b;
        final ArrayList<C0708f> f13591c = new ArrayList();
        final C0482m<Menu, Menu> f13592d = new C0482m();

        public C4883a(Context context, Callback callback) {
            this.f13590b = context;
            this.f13589a = callback;
        }

        private Menu m9449a(Menu menu) {
            Menu menu2 = (Menu) this.f13592d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = C0730q.m1736a(this.f13590b, (C0441a) menu);
            this.f13592d.put(menu, menu2);
            return menu2;
        }

        public final void mo446a(C0705b c0705b) {
            this.f13589a.onDestroyActionMode(m9453b(c0705b));
        }

        public final boolean mo447a(C0705b c0705b, Menu menu) {
            return this.f13589a.onCreateActionMode(m9453b(c0705b), m9449a(menu));
        }

        public final boolean mo448a(C0705b c0705b, MenuItem menuItem) {
            return this.f13589a.onActionItemClicked(m9453b(c0705b), C0730q.m1737a(this.f13590b, (C0442b) menuItem));
        }

        public final ActionMode m9453b(C0705b c0705b) {
            int size = this.f13591c.size();
            for (int i = 0; i < size; i++) {
                C0708f c0708f = (C0708f) this.f13591c.get(i);
                if (c0708f != null && c0708f.f2322b == c0705b) {
                    return c0708f;
                }
            }
            ActionMode c0708f2 = new C0708f(this.f13590b, c0705b);
            this.f13591c.add(c0708f2);
            return c0708f2;
        }

        public final boolean mo449b(C0705b c0705b, Menu menu) {
            return this.f13589a.onPrepareActionMode(m9453b(c0705b), m9449a(menu));
        }
    }

    public C0708f(Context context, C0705b c0705b) {
        this.f2321a = context;
        this.f2322b = c0705b;
    }

    public final void finish() {
        this.f2322b.mo498c();
    }

    public final View getCustomView() {
        return this.f2322b.mo503i();
    }

    public final Menu getMenu() {
        return C0730q.m1736a(this.f2321a, (C0441a) this.f2322b.mo495b());
    }

    public final MenuInflater getMenuInflater() {
        return this.f2322b.mo490a();
    }

    public final CharSequence getSubtitle() {
        return this.f2322b.mo501g();
    }

    public final Object getTag() {
        return this.f2322b.f2314c;
    }

    public final CharSequence getTitle() {
        return this.f2322b.mo500f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f2322b.f2315d;
    }

    public final void invalidate() {
        this.f2322b.mo499d();
    }

    public final boolean isTitleOptional() {
        return this.f2322b.mo502h();
    }

    public final void setCustomView(View view) {
        this.f2322b.mo492a(view);
    }

    public final void setSubtitle(int i) {
        this.f2322b.mo496b(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f2322b.mo493a(charSequence);
    }

    public final void setTag(Object obj) {
        this.f2322b.f2314c = obj;
    }

    public final void setTitle(int i) {
        this.f2322b.mo491a(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f2322b.mo497b(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f2322b.mo494a(z);
    }
}
