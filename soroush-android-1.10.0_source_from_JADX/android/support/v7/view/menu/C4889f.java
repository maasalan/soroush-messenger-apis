package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C0729p.C0728a;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class C4889f implements C0727o, OnItemClickListener {
    Context f13638a;
    public LayoutInflater f13639b;
    C4890h f13640c;
    public ExpandedMenuView f13641d;
    int f13642e;
    int f13643f;
    int f13644g;
    public C0720a f13645h;
    private C0726a f13646i;
    private int f13647j;

    private class C0720a extends BaseAdapter {
        final /* synthetic */ C4889f f2381a;
        private int f2382b = -1;

        public C0720a(C4889f c4889f) {
            this.f2381a = c4889f;
            m1730a();
        }

        private void m1730a() {
            C4893j c4893j = this.f2381a.f13640c.f13658j;
            if (c4893j != null) {
                ArrayList j = this.f2381a.f13640c.m9496j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (((C4893j) j.get(i)) == c4893j) {
                        this.f2382b = i;
                        return;
                    }
                }
            }
            this.f2382b = -1;
        }

        public final C4893j m1731a(int i) {
            ArrayList j = this.f2381a.f13640c.m9496j();
            i += this.f2381a.f13642e;
            if (this.f2382b >= 0 && i >= this.f2382b) {
                i++;
            }
            return (C4893j) j.get(i);
        }

        public final int getCount() {
            int size = this.f2381a.f13640c.m9496j().size() - this.f2381a.f13642e;
            return this.f2382b < 0 ? size : size - 1;
        }

        public final /* synthetic */ Object getItem(int i) {
            return m1731a(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f2381a.f13639b.inflate(this.f2381a.f13644g, viewGroup, false);
            }
            ((C0728a) view).mo128a(m1731a(i));
            return view;
        }

        public final void notifyDataSetChanged() {
            m1730a();
            super.notifyDataSetChanged();
        }
    }

    private C4889f(int i) {
        this.f13644g = i;
        this.f13643f = 0;
    }

    public C4889f(Context context, int i) {
        this(i);
        this.f13638a = context;
        this.f13639b = LayoutInflater.from(this.f13638a);
    }

    public final ListAdapter m9466a() {
        if (this.f13645h == null) {
            this.f13645h = new C0720a(this);
        }
        return this.f13645h;
    }

    public final boolean collapseItemActionView(C4890h c4890h, C4893j c4893j) {
        return false;
    }

    public final boolean expandItemActionView(C4890h c4890h, C4893j c4893j) {
        return false;
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final int getId() {
        return this.f13647j;
    }

    public final void initForMenu(Context context, C4890h c4890h) {
        if (this.f13643f != 0) {
            this.f13638a = new ContextThemeWrapper(context, this.f13643f);
        } else {
            if (this.f13638a != null) {
                this.f13638a = context;
                if (this.f13639b == null) {
                }
            }
            this.f13640c = c4890h;
            if (this.f13645h != null) {
                this.f13645h.notifyDataSetChanged();
            }
        }
        this.f13639b = LayoutInflater.from(this.f13638a);
        this.f13640c = c4890h;
        if (this.f13645h != null) {
            this.f13645h.notifyDataSetChanged();
        }
    }

    public final void onCloseMenu(C4890h c4890h, boolean z) {
        if (this.f13646i != null) {
            this.f13646i.onCloseMenu(c4890h, z);
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f13640c.m9481a(this.f13645h.m1731a(i), (C0727o) this, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f13641d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final Parcelable onSaveInstanceState() {
        if (this.f13641d == null) {
            return null;
        }
        Parcelable bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        if (this.f13641d != null) {
            this.f13641d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final boolean onSubMenuSelected(C6399u c6399u) {
        if (!c6399u.hasVisibleItems()) {
            return false;
        }
        C4891i c4891i = new C4891i(c6399u);
        C4890h c4890h = c4891i.f13674a;
        C0663a c0663a = new C0663a(c4890h.f13649a);
        c4891i.f13676c = new C4889f(c0663a.f2211a.f2119a, C0641g.abc_list_menu_item_layout);
        c4891i.f13676c.setCallback(c4891i);
        c4891i.f13674a.m9476a(c4891i.f13676c);
        c0663a.f2211a.f2138t = c4891i.f13676c.m9466a();
        c0663a.f2211a.f2139u = c4891i;
        View view = c4890h.f13656h;
        if (view != null) {
            c0663a.f2211a.f2125g = view;
        } else {
            c0663a.f2211a.f2122d = c4890h.f13655g;
            c0663a.m1608a(c4890h.f13654f);
        }
        c0663a.f2211a.f2136r = c4891i;
        c4891i.f13675b = c0663a.m1612a();
        c4891i.f13675b.setOnDismissListener(c4891i);
        LayoutParams attributes = c4891i.f13675b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        c4891i.f13675b.show();
        if (this.f13646i != null) {
            this.f13646i.onOpenSubMenu(c6399u);
        }
        return true;
    }

    public final void setCallback(C0726a c0726a) {
        this.f13646i = c0726a;
    }

    public final void updateMenuView(boolean z) {
        if (this.f13645h != null) {
            this.f13645h.notifyDataSetChanged();
        }
    }
}
