package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0249a.C0241d;
import android.support.design.C0249a.C0245h;
import android.support.v4.view.C0571r;
import android.support.v7.view.menu.C0727o;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4893j;
import android.support.v7.view.menu.C6399u;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public final class C4729e implements C0727o {
    public NavigationMenuView f13023a;
    public LinearLayout f13024b;
    C4890h f13025c;
    public int f13026d;
    public C4724b f13027e;
    public LayoutInflater f13028f;
    int f13029g;
    boolean f13030h;
    public ColorStateList f13031i;
    public ColorStateList f13032j;
    public Drawable f13033k;
    public int f13034l;
    int f13035m;
    final OnClickListener f13036n = new C02521(this);
    private C0726a f13037o;

    class C02521 implements OnClickListener {
        final /* synthetic */ C4729e f927a;

        C02521(C4729e c4729e) {
            this.f927a = c4729e;
        }

        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            this.f927a.m8716a(true);
            MenuItem itemData = navigationMenuItemView.getItemData();
            boolean a = this.f927a.f13025c.m9481a(itemData, this.f927a, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                this.f927a.f13027e.m8711a(itemData);
            }
            this.f927a.m8716a(false);
            this.f927a.updateMenuView(false);
        }
    }

    private interface C0253d {
    }

    private class C4724b extends Adapter<C4728j> {
        final ArrayList<C0253d> f13015a = new ArrayList();
        boolean f13016b;
        final /* synthetic */ C4729e f13017c;
        private C4893j f13018d;

        public C4724b(C4729e c4729e) {
            this.f13017c = c4729e;
            m8710a();
        }

        private void m8709a(int i, int i2) {
            while (i < i2) {
                ((C4727f) this.f13015a.get(i)).f13022b = true;
                i++;
            }
        }

        final void m8710a() {
            if (!this.f13016b) {
                boolean z = true;
                r0.f13016b = true;
                r0.f13015a.clear();
                r0.f13015a.add(new C4725c());
                int size = r0.f13017c.f13025c.m9494h().size();
                int i = -1;
                int i2 = 0;
                boolean z2 = i2;
                int i3 = z2;
                while (i2 < size) {
                    C4893j c4893j = (C4893j) r0.f13017c.f13025c.m9494h().get(i2);
                    if (c4893j.isChecked()) {
                        m8711a(c4893j);
                    }
                    if (c4893j.isCheckable()) {
                        c4893j.m9507a(false);
                    }
                    if (c4893j.hasSubMenu()) {
                        SubMenu subMenu = c4893j.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                r0.f13015a.add(new C4726e(r0.f13017c.f13035m, 0));
                            }
                            r0.f13015a.add(new C4727f(c4893j));
                            int size2 = r0.f13015a.size();
                            int size3 = subMenu.size();
                            int i4 = 0;
                            int i5 = i4;
                            while (i4 < size3) {
                                C4893j c4893j2 = (C4893j) subMenu.getItem(i4);
                                if (c4893j2.isVisible()) {
                                    if (i5 == 0 && c4893j2.getIcon() != null) {
                                        i5 = z;
                                    }
                                    if (c4893j2.isCheckable()) {
                                        c4893j2.m9507a(false);
                                    }
                                    if (c4893j.isChecked()) {
                                        m8711a(c4893j);
                                    }
                                    r0.f13015a.add(new C4727f(c4893j2));
                                }
                                i4++;
                                z = true;
                            }
                            if (i5 != 0) {
                                m8709a(size2, r0.f13015a.size());
                            }
                        }
                    } else {
                        int groupId = c4893j.getGroupId();
                        if (groupId != i) {
                            i3 = r0.f13015a.size();
                            boolean z3 = c4893j.getIcon() != null;
                            if (i2 != 0) {
                                i3++;
                                r0.f13015a.add(new C4726e(r0.f13017c.f13035m, r0.f13017c.f13035m));
                            }
                            z2 = z3;
                        } else if (!(z2 || c4893j.getIcon() == null)) {
                            m8709a(i3, r0.f13015a.size());
                            z2 = true;
                        }
                        C4727f c4727f = new C4727f(c4893j);
                        c4727f.f13022b = z2;
                        r0.f13015a.add(c4727f);
                        i = groupId;
                    }
                    i2++;
                    z = true;
                }
                r0.f13016b = false;
            }
        }

        public final void m8711a(C4893j c4893j) {
            if (this.f13018d != c4893j && c4893j.isCheckable()) {
                if (this.f13018d != null) {
                    this.f13018d.setChecked(false);
                }
                this.f13018d = c4893j;
                c4893j.setChecked(true);
            }
        }

        public final Bundle m8712b() {
            Bundle bundle = new Bundle();
            if (this.f13018d != null) {
                bundle.putInt("android:menu:checked", this.f13018d.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f13015a.size();
            for (int i = 0; i < size; i++) {
                C0253d c0253d = (C0253d) this.f13015a.get(i);
                if (c0253d instanceof C4727f) {
                    C4893j c4893j = ((C4727f) c0253d).f13021a;
                    View actionView = c4893j != null ? c4893j.getActionView() : null;
                    if (actionView != null) {
                        SparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(c4893j.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public final int getItemCount() {
            return this.f13015a.size();
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            C0253d c0253d = (C0253d) this.f13015a.get(i);
            if (c0253d instanceof C4726e) {
                return 2;
            }
            if (c0253d instanceof C4725c) {
                return 3;
            }
            if (c0253d instanceof C4727f) {
                return ((C4727f) c0253d).f13021a.hasSubMenu() ? 1 : 0;
            } else {
                throw new RuntimeException("Unknown item type.");
            }
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            C4728j c4728j = (C4728j) viewHolder;
            switch (getItemViewType(i)) {
                case 0:
                    View view = (NavigationMenuItemView) c4728j.itemView;
                    view.setIconTintList(this.f13017c.f13032j);
                    if (this.f13017c.f13030h) {
                        view.setTextAppearance(this.f13017c.f13029g);
                    }
                    if (this.f13017c.f13031i != null) {
                        view.setTextColor(this.f13017c.f13031i);
                    }
                    C0571r.m1339a(view, this.f13017c.f13033k != null ? this.f13017c.f13033k.getConstantState().newDrawable() : null);
                    C4727f c4727f = (C4727f) this.f13015a.get(i);
                    view.setNeedsEmptyIcon(c4727f.f13022b);
                    view.mo128a(c4727f.f13021a);
                    return;
                case 1:
                    ((TextView) c4728j.itemView).setText(((C4727f) this.f13015a.get(i)).f13021a.getTitle());
                    return;
                case 2:
                    C4726e c4726e = (C4726e) this.f13015a.get(i);
                    c4728j.itemView.setPadding(0, c4726e.f13019a, 0, c4726e.f13020b);
                    return;
                default:
                    return;
            }
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C6347g(this.f13017c.f13028f, viewGroup, this.f13017c.f13036n);
                case 1:
                    return new C6349i(this.f13017c.f13028f, viewGroup);
                case 2:
                    return new C6348h(this.f13017c.f13028f, viewGroup);
                case 3:
                    return new C6346a(this.f13017c.f13024b);
                default:
                    return null;
            }
        }

        public final /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
            C4728j c4728j = (C4728j) viewHolder;
            if (c4728j instanceof C6347g) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) c4728j.itemView;
                if (navigationMenuItemView.f17341e != null) {
                    navigationMenuItemView.f17341e.removeAllViews();
                }
                navigationMenuItemView.f17340d.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    private static class C4725c implements C0253d {
        C4725c() {
        }
    }

    private static class C4726e implements C0253d {
        final int f13019a;
        final int f13020b;

        public C4726e(int i, int i2) {
            this.f13019a = i;
            this.f13020b = i2;
        }
    }

    private static class C4727f implements C0253d {
        final C4893j f13021a;
        boolean f13022b;

        C4727f(C4893j c4893j) {
            this.f13021a = c4893j;
        }
    }

    private static abstract class C4728j extends ViewHolder {
        public C4728j(View view) {
            super(view);
        }
    }

    private static class C6346a extends C4728j {
        public C6346a(View view) {
            super(view);
        }
    }

    private static class C6347g extends C4728j {
        public C6347g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0245h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class C6348h extends C4728j {
        public C6348h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0245h.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class C6349i extends C4728j {
        public C6349i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0245h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public final void m8713a(int i) {
        this.f13029g = i;
        this.f13030h = true;
        updateMenuView(false);
    }

    public final void m8714a(ColorStateList colorStateList) {
        this.f13032j = colorStateList;
        updateMenuView(false);
    }

    public final void m8715a(Drawable drawable) {
        this.f13033k = drawable;
        updateMenuView(false);
    }

    public final void m8716a(boolean z) {
        if (this.f13027e != null) {
            this.f13027e.f13016b = z;
        }
    }

    public final void m8717b(ColorStateList colorStateList) {
        this.f13031i = colorStateList;
        updateMenuView(false);
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
        return this.f13026d;
    }

    public final void initForMenu(Context context, C4890h c4890h) {
        this.f13028f = LayoutInflater.from(context);
        this.f13025c = c4890h;
        this.f13035m = context.getResources().getDimensionPixelOffset(C0241d.design_navigation_separator_vertical_padding);
    }

    public final void onCloseMenu(C4890h c4890h, boolean z) {
        if (this.f13037o != null) {
            this.f13037o.onCloseMenu(c4890h, z);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f13023a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C4724b c4724b = this.f13027e;
                int i = 0;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    c4724b.f13016b = true;
                    int size = c4724b.f13015a.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C0253d c0253d = (C0253d) c4724b.f13015a.get(i3);
                        if (c0253d instanceof C4727f) {
                            C4893j c4893j = ((C4727f) c0253d).f13021a;
                            if (c4893j != null && c4893j.getItemId() == i2) {
                                c4724b.m8711a(c4893j);
                                break;
                            }
                        }
                    }
                    c4724b.f13016b = false;
                    c4724b.m8710a();
                }
                sparseParcelableArray = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray != null) {
                    i2 = c4724b.f13015a.size();
                    while (i < i2) {
                        C0253d c0253d2 = (C0253d) c4724b.f13015a.get(i);
                        if (c0253d2 instanceof C4727f) {
                            C4893j c4893j2 = ((C4727f) c0253d2).f13021a;
                            if (c4893j2 != null) {
                                View actionView = c4893j2.getActionView();
                                if (actionView != null) {
                                    ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(c4893j2.getItemId());
                                    if (parcelableSparseArray != null) {
                                        actionView.restoreHierarchyState(parcelableSparseArray);
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f13024b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Parcelable bundle = new Bundle();
        if (this.f13023a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f13023a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f13027e != null) {
            bundle.putBundle("android:menu:adapter", this.f13027e.m8712b());
        }
        if (this.f13024b != null) {
            sparseArray = new SparseArray();
            this.f13024b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray);
        }
        return bundle;
    }

    public final boolean onSubMenuSelected(C6399u c6399u) {
        return false;
    }

    public final void setCallback(C0726a c0726a) {
        this.f13037o = c0726a;
    }

    public final void updateMenuView(boolean z) {
        if (this.f13027e != null) {
            C4724b c4724b = this.f13027e;
            c4724b.m8710a();
            c4724b.notifyDataSetChanged();
        }
    }
}
