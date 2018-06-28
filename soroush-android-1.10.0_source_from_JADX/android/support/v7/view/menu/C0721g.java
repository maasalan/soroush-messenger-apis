package android.support.v7.view.menu;

import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.view.menu.C0729p.C0728a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class C0721g extends BaseAdapter {
    static final int f2383a = C0641g.abc_popup_menu_item_layout;
    public C4890h f2384b;
    boolean f2385c;
    private int f2386d = -1;
    private final boolean f2387e;
    private final LayoutInflater f2388f;

    public C0721g(C4890h c4890h, LayoutInflater layoutInflater, boolean z) {
        this.f2387e = z;
        this.f2388f = layoutInflater;
        this.f2384b = c4890h;
        m1732a();
    }

    private void m1732a() {
        C4893j c4893j = this.f2384b.f13658j;
        if (c4893j != null) {
            ArrayList j = this.f2384b.m9496j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C4893j) j.get(i)) == c4893j) {
                    this.f2386d = i;
                    return;
                }
            }
        }
        this.f2386d = -1;
    }

    public final C4893j m1733a(int i) {
        ArrayList j = this.f2387e ? this.f2384b.m9496j() : this.f2384b.m9494h();
        if (this.f2386d >= 0 && i >= this.f2386d) {
            i++;
        }
        return (C4893j) j.get(i);
    }

    public final int getCount() {
        ArrayList j = this.f2387e ? this.f2384b.m9496j() : this.f2384b.m9494h();
        return this.f2386d < 0 ? j.size() : j.size() - 1;
    }

    public final /* synthetic */ Object getItem(int i) {
        return m1733a(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2388f.inflate(f2383a, viewGroup, false);
        }
        C0728a c0728a = (C0728a) view;
        if (this.f2385c) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        c0728a.mo128a(m1733a(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        m1732a();
        super.notifyDataSetChanged();
    }
}
