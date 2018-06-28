package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class C4898m implements C0727o, C0731s, OnItemClickListener {
    Rect f13719e;

    C4898m() {
    }

    protected static int m9520a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        int i3 = 0;
        int i4 = i3;
        View view = null;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            itemViewType = view.getMeasuredWidth();
            if (itemViewType >= i) {
                return i;
            }
            if (itemViewType > i4) {
                i4 = itemViewType;
            }
            i2++;
        }
        return i4;
    }

    protected static C0721g m9521a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0721g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0721g) listAdapter;
    }

    protected static boolean m9522b(C4890h c4890h) {
        int size = c4890h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c4890h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void mo2605a(int i);

    public abstract void mo2606a(C4890h c4890h);

    public abstract void mo2607a(View view);

    public abstract void mo2608a(OnDismissListener onDismissListener);

    public abstract void mo2609a(boolean z);

    protected boolean mo2610a() {
        return true;
    }

    public abstract void mo2611b(int i);

    public abstract void mo2612b(boolean z);

    public abstract void mo2613c(int i);

    public boolean collapseItemActionView(C4890h c4890h, C4893j c4893j) {
        return false;
    }

    public boolean expandItemActionView(C4890h c4890h, C4893j c4893j) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public void initForMenu(Context context, C4890h c4890h) {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C4898m.m9521a(listAdapter).f2384b.m9481a((MenuItem) listAdapter.getItem(i), (C0727o) this, mo2610a() ? 0 : 4);
    }
}
