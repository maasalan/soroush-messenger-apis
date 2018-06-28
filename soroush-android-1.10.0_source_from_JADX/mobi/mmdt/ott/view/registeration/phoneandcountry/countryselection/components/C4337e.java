package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.util.SparseArray;
import android.view.View;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b;

public final class C4337e {
    public final Recycler f12173a;
    final State f12174b;
    public final SparseArray<View> f12175c;
    public final boolean f12176d;

    public static class C4336a {
        public final View f12171a;
        public final boolean f12172b;

        public C4336a(View view, boolean z) {
            this.f12171a = view;
            this.f12172b = z;
        }

        public final C6250b m8091a() {
            return (C6250b) this.f12171a.getLayoutParams();
        }
    }

    public C4337e(LayoutManager layoutManager, Recycler recycler, State state) {
        this.f12175c = new SparseArray(layoutManager.getChildCount());
        this.f12174b = state;
        this.f12173a = recycler;
        this.f12176d = layoutManager.getLayoutDirection() == 0;
    }

    public final void m8092a(int i) {
        this.f12175c.remove(i);
    }

    public final void m8093a(int i, View view) {
        this.f12175c.put(i, view);
    }

    public final View m8094b(int i) {
        return (View) this.f12175c.get(i);
    }

    public final C4336a m8095c(int i) {
        View b = m8094b(i);
        boolean z = b != null;
        if (b == null) {
            b = this.f12173a.getViewForPosition(i);
        }
        return new C4336a(b, z);
    }
}
