package com.felipecsl.asymmetricgridview.library.widget;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p029a.C0346c;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.felipecsl.asymmetricgridview.library.C1587a;
import com.felipecsl.asymmetricgridview.library.C1597b;
import com.felipecsl.asymmetricgridview.library.C1597b.C15904;
import com.felipecsl.asymmetricgridview.library.C1597b.C1595d;
import com.felipecsl.asymmetricgridview.library.C1599c.C1598a;
import com.felipecsl.asymmetricgridview.library.model.AsymmetricItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public abstract class C5395b<T extends AsymmetricItem> extends BaseAdapter implements OnClickListener, OnLongClickListener, C1587a {
    protected final AsymmetricGridView f15011a;
    protected final Context f15012b;
    protected final List<T> f15013c;
    private Map<Integer, RowInfo<T>> f15014d = new HashMap();
    private final ViewPool<C5396d> f15015e;
    private final ViewPool<View> f15016f = new ViewPool();
    private C5394a f15017g;

    class C5394a extends C1597b<List<T>, Void, List<RowInfo<T>>> {
        final /* synthetic */ C5395b f15010g;

        C5394a(C5395b c5395b) {
            this.f15010g = c5395b;
        }

        @SafeVarargs
        protected final /* synthetic */ Object mo1501a(Object[] objArr) {
            List list = ((List[]) objArr)[0];
            List arrayList = new ArrayList();
            while (!list.isEmpty()) {
                RowInfo a = C5395b.m11651a(this.f15010g, list);
                List<AsymmetricItem> list2 = a.f4976a;
                if (list2.isEmpty()) {
                    break;
                }
                for (AsymmetricItem remove : list2) {
                    list.remove(remove);
                }
                arrayList.add(a);
            }
            return arrayList;
        }

        protected final /* synthetic */ void mo1502a(Object obj) {
            for (RowInfo put : (List) obj) {
                this.f15010g.f15014d.put(Integer.valueOf(this.f15010g.m11658c()), put);
            }
            this.f15010g.notifyDataSetChanged();
        }
    }

    public C5395b(Context context, AsymmetricGridView asymmetricGridView, List<T> list) {
        this.f15015e = new ViewPool(new C5397e(context));
        this.f15013c = list;
        this.f15012b = context;
        this.f15011a = asymmetricGridView;
    }

    static /* synthetic */ RowInfo m11651a(C5395b c5395b, List list) {
        float numColumns = (float) c5395b.f15011a.getNumColumns();
        List arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        float f = numColumns;
        while (f > 0.0f && i2 < list.size()) {
            int i3 = i2 + 1;
            AsymmetricItem asymmetricItem = (AsymmetricItem) list.get(i2);
            float b = (float) (asymmetricItem.mo2372b() * asymmetricItem.mo2371a());
            if (i < asymmetricItem.mo2372b()) {
                arrayList.clear();
                i = asymmetricItem.mo2372b();
                f = ((float) asymmetricItem.mo2372b()) * numColumns;
                i2 = 0;
            } else {
                if (f < b) {
                    if (!c5395b.f15011a.m4135b()) {
                        break;
                    }
                }
                f -= b;
                arrayList.add(asymmetricItem);
                i2 = i3;
            }
        }
        return new RowInfo(i, arrayList, f);
    }

    public abstract View mo3232a(int i, View view, ViewGroup viewGroup);

    public final void mo1503a() {
        if (this.f15017g != null) {
            C1597b c1597b = this.f15017g;
            c1597b.f4954f.set(true);
            c1597b.f4952d.cancel(true);
        }
        this.f15015e.m4139b();
        this.f15016f.m4139b();
        this.f15014d.clear();
        new ArrayList().addAll(this.f15013c);
        this.f15017g = new C5394a(this);
        C1597b c1597b2 = this.f15017g;
        List[] listArr = new List[]{r0};
        Executor executor = C1597b.f4943b;
        if (c1597b2.f4953e != C1595d.f4937a) {
            switch (C15904.f4930a[c1597b2.f4953e - 1]) {
                case 1:
                    throw new IllegalStateException("Cannot execute task: the task is already running AsymmetricGridView.");
                case 2:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    break;
            }
        }
        c1597b2.f4953e = C1595d.f4938b;
        c1597b2.f4951c.f4941b = listArr;
        executor.execute(c1597b2.f4952d);
    }

    public final void mo1504a(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            int i = bundle.getInt("totalItems");
            List arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                StringBuilder stringBuilder = new StringBuilder("item_");
                stringBuilder.append(i2);
                arrayList.add((AsymmetricItem) bundle.getParcelable(stringBuilder.toString()));
            }
            m11656a(arrayList);
        }
    }

    public final void m11656a(List<T> list) {
        this.f15015e.m4139b();
        this.f15016f.m4139b();
        this.f15013c.clear();
        this.f15013c.addAll(list);
        mo1503a();
        notifyDataSetChanged();
    }

    public final Parcelable mo1505b() {
        Parcelable bundle = new Bundle();
        bundle.putInt("totalItems", this.f15013c.size());
        for (int i = 0; i < this.f15013c.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder("item_");
            stringBuilder.append(i);
            bundle.putParcelable(stringBuilder.toString(), (Parcelable) this.f15013c.get(i));
        }
        return bundle;
    }

    public final int m11658c() {
        return this.f15014d.size();
    }

    public int getCount() {
        return m11658c();
    }

    public /* synthetic */ Object getItem(int i) {
        return (AsymmetricItem) this.f15013c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        C5396d c5396d;
        int i3;
        RowInfo rowInfo;
        List arrayList;
        int i4;
        int i5;
        AsymmetricItem asymmetricItem;
        LinearLayout linearLayout;
        Context context;
        C5395b c5395b = this;
        View view2 = view;
        int i6 = -2;
        int i7 = -1;
        int i8 = 2;
        if (view2 != null) {
            if (view2 instanceof C5396d) {
                view2 = (C5396d) view2;
                for (i2 = 0; i2 < view2.getChildCount(); i2++) {
                    c5396d = (C5396d) view2.getChildAt(i2);
                    c5395b.f15015e.m4138a(c5396d);
                    for (i3 = 0; i3 < c5396d.getChildCount(); i3++) {
                        c5395b.f15016f.m4138a(c5396d.getChildAt(i3));
                    }
                    c5396d.removeAllViews();
                }
                view2.removeAllViews();
                rowInfo = (RowInfo) c5395b.f15014d.get(Integer.valueOf(i));
                arrayList = new ArrayList();
                arrayList.addAll(rowInfo.f4976a);
                i4 = 0;
                i5 = rowInfo.f4977b;
                i3 = i4;
                while (!arrayList.isEmpty() && i3 < c5395b.f15011a.getNumColumns()) {
                    asymmetricItem = (AsymmetricItem) arrayList.get(i4);
                    if (i5 != 0) {
                        i3++;
                        i5 = rowInfo.f4977b;
                        i4 = 0;
                    } else {
                        if (i5 >= asymmetricItem.mo2372b()) {
                            ViewGroup viewGroup2 = viewGroup;
                            if (i4 < arrayList.size() - 1) {
                                break;
                            }
                            i4++;
                        } else {
                            arrayList.remove(asymmetricItem);
                            i4 = c5395b.f15013c.indexOf(asymmetricItem);
                            linearLayout = (C5396d) view2.getChildAt(i3);
                            if (linearLayout == null) {
                                linearLayout = (C5396d) c5395b.f15015e.m4137a();
                                linearLayout.setOrientation(1);
                                linearLayout.setShowDividers(i8);
                                linearLayout.setDividerDrawable(C0346c.m682a(c5395b.f15012b, C1598a.item_divider_vertical));
                                linearLayout.setLayoutParams(new LayoutParams(i6, i7));
                                view2.addView(linearLayout);
                            }
                            View a = mo3232a(i4, c5395b.f15016f.m4137a(), viewGroup);
                            a.setTag(asymmetricItem);
                            a.setOnClickListener(c5395b);
                            a.setOnLongClickListener(c5395b);
                            i5 -= asymmetricItem.mo2372b();
                            int a2 = asymmetricItem.mo2371a();
                            i6 = (c5395b.f15011a.getColumnWidth() * a2) + ((a2 - 1) * c5395b.f15011a.getRequestedHorizontalSpacing());
                            context = c5395b.f15012b;
                            if (context != null) {
                                i7 = 0;
                            } else {
                                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                                i7 = displayMetrics.widthPixels;
                            }
                            i6 = Math.min(i6, i7);
                            i7 = asymmetricItem.mo2372b();
                            a.setLayoutParams(new LinearLayout.LayoutParams(i6, (c5395b.f15011a.getColumnWidth() * i7) + ((i7 - 1) * c5395b.f15011a.getDividerHeight())));
                            linearLayout.addView(a);
                            i4 = 0;
                        }
                        i6 = -2;
                        i7 = -1;
                        i8 = 2;
                    }
                }
                return view2;
            }
        }
        view2 = new C5396d(c5395b.f15012b);
        view2.setShowDividers(2);
        view2.setDividerDrawable(C0346c.m682a(c5395b.f15012b, C1598a.item_divider_horizontal));
        view2.setLayoutParams(new LayoutParams(-1, -2));
        for (i2 = 0; i2 < view2.getChildCount(); i2++) {
            c5396d = (C5396d) view2.getChildAt(i2);
            c5395b.f15015e.m4138a(c5396d);
            for (i3 = 0; i3 < c5396d.getChildCount(); i3++) {
                c5395b.f15016f.m4138a(c5396d.getChildAt(i3));
            }
            c5396d.removeAllViews();
        }
        view2.removeAllViews();
        rowInfo = (RowInfo) c5395b.f15014d.get(Integer.valueOf(i));
        arrayList = new ArrayList();
        arrayList.addAll(rowInfo.f4976a);
        i4 = 0;
        i5 = rowInfo.f4977b;
        i3 = i4;
        while (!arrayList.isEmpty()) {
            asymmetricItem = (AsymmetricItem) arrayList.get(i4);
            if (i5 != 0) {
                if (i5 >= asymmetricItem.mo2372b()) {
                    ViewGroup viewGroup22 = viewGroup;
                    if (i4 < arrayList.size() - 1) {
                        break;
                    }
                    i4++;
                } else {
                    arrayList.remove(asymmetricItem);
                    i4 = c5395b.f15013c.indexOf(asymmetricItem);
                    linearLayout = (C5396d) view2.getChildAt(i3);
                    if (linearLayout == null) {
                        linearLayout = (C5396d) c5395b.f15015e.m4137a();
                        linearLayout.setOrientation(1);
                        linearLayout.setShowDividers(i8);
                        linearLayout.setDividerDrawable(C0346c.m682a(c5395b.f15012b, C1598a.item_divider_vertical));
                        linearLayout.setLayoutParams(new LayoutParams(i6, i7));
                        view2.addView(linearLayout);
                    }
                    View a3 = mo3232a(i4, c5395b.f15016f.m4137a(), viewGroup);
                    a3.setTag(asymmetricItem);
                    a3.setOnClickListener(c5395b);
                    a3.setOnLongClickListener(c5395b);
                    i5 -= asymmetricItem.mo2372b();
                    int a22 = asymmetricItem.mo2371a();
                    i6 = (c5395b.f15011a.getColumnWidth() * a22) + ((a22 - 1) * c5395b.f15011a.getRequestedHorizontalSpacing());
                    context = c5395b.f15012b;
                    if (context != null) {
                        WindowManager windowManager2 = (WindowManager) context.getSystemService("window");
                        DisplayMetrics displayMetrics2 = new DisplayMetrics();
                        windowManager2.getDefaultDisplay().getMetrics(displayMetrics2);
                        i7 = displayMetrics2.widthPixels;
                    } else {
                        i7 = 0;
                    }
                    i6 = Math.min(i6, i7);
                    i7 = asymmetricItem.mo2372b();
                    a3.setLayoutParams(new LinearLayout.LayoutParams(i6, (c5395b.f15011a.getColumnWidth() * i7) + ((i7 - 1) * c5395b.f15011a.getDividerHeight())));
                    linearLayout.addView(a3);
                    i4 = 0;
                }
                i6 = -2;
                i7 = -1;
                i8 = 2;
            } else {
                i3++;
                i5 = rowInfo.f4977b;
                i4 = 0;
            }
        }
        return view2;
    }

    public void onClick(View view) {
        this.f15011a.m4134a(this.f15013c.indexOf((AsymmetricItem) view.getTag()), view);
    }

    public boolean onLongClick(View view) {
        return this.f15011a.m4136b(this.f15013c.indexOf((AsymmetricItem) view.getTag()), view);
    }
}
