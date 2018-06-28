package com.cocosw.bottomsheet;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Comparator;

final class C1298f extends BaseAdapter {
    SparseArray<C1297a> f4070a = new SparseArray();
    C1297a[] f4071b = new C1297a[0];
    int f4072c;
    int f4073d;
    int f4074e;
    int f4075f;
    int f4076g;
    GridView f4077h;
    private boolean f4078i = true;
    private int f4079j;
    private LayoutInflater f4080k;
    private ListAdapter f4081l;
    private Context f4082m;
    private View f4083n;
    private int f4084o;
    private int f4085p;
    private int f4086q;
    private int f4087r;
    private int f4088s;

    class C12951 extends DataSetObserver {
        final /* synthetic */ C1298f f4064a;

        C12951(C1298f c1298f) {
            this.f4064a = c1298f;
        }

        public final void onChanged() {
            this.f4064a.f4078i = this.f4064a.f4081l.isEmpty() ^ 1;
            this.f4064a.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            this.f4064a.f4078i = false;
            this.f4064a.notifyDataSetInvalidated();
        }
    }

    class C12962 implements Comparator<C1297a> {
        final /* synthetic */ C1298f f4065a;

        C12962(C1298f c1298f) {
            this.f4065a = c1298f;
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C1297a c1297a = (C1297a) obj;
            C1297a c1297a2 = (C1297a) obj2;
            return c1297a.f4066a == c1297a2.f4066a ? 0 : c1297a.f4066a < c1297a2.f4066a ? -1 : 1;
        }
    }

    public static class C1297a {
        int f4066a;
        int f4067b;
        CharSequence f4068c;
        int f4069d = 0;

        public C1297a(int i, CharSequence charSequence) {
            this.f4066a = i;
            this.f4068c = charSequence;
        }
    }

    public C1298f(Context context, BaseAdapter baseAdapter, int i, int i2, int i3) {
        this.f4080k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f4079j = i;
        this.f4087r = i2;
        this.f4088s = i3;
        this.f4081l = baseAdapter;
        this.f4082m = context;
        this.f4081l.registerDataSetObserver(new C12951(this));
    }

    private int m3070a(int i) {
        if (m3074b(i)) {
            return -1;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f4070a.size() && ((C1297a) this.f4070a.valueAt(i2)).f4067b <= i) {
            i3--;
            i2++;
        }
        return i + i3;
    }

    private int m3073b() {
        if (this.f4084o > 0) {
            return this.f4084o;
        }
        if (this.f4073d != this.f4077h.getWidth()) {
            this.f4074e = this.f4077h.getStretchMode();
            this.f4073d = ((PinnedSectionGridView) this.f4077h).getAvailableWidth() - (this.f4077h.getPaddingLeft() + this.f4077h.getPaddingRight());
            this.f4072c = ((PinnedSectionGridView) this.f4077h).getNumColumns();
            this.f4075f = ((PinnedSectionGridView) this.f4077h).getColumnWidth();
            this.f4076g = ((PinnedSectionGridView) this.f4077h).getHorizontalSpacing();
        }
        int i = (this.f4073d - (this.f4072c * this.f4075f)) - ((this.f4072c - 1) * this.f4076g);
        switch (this.f4074e) {
            case 0:
                this.f4073d -= i;
                this.f4085p = this.f4075f;
                break;
            case 1:
                int i2;
                this.f4085p = this.f4075f;
                if (this.f4072c > 1) {
                    i2 = this.f4076g;
                    i /= this.f4072c - 1;
                } else {
                    i2 = this.f4076g;
                }
                this.f4086q = i2 + i;
                break;
            case 2:
                this.f4085p = this.f4075f + (i / this.f4072c);
                break;
            case 3:
                this.f4085p = this.f4075f;
                this.f4086q = this.f4076g;
                this.f4073d = (this.f4073d - i) + (2 * this.f4086q);
                break;
            default:
                break;
        }
        this.f4086q = this.f4076g;
        this.f4084o = this.f4073d + ((this.f4072c - 1) * (this.f4085p + this.f4086q));
        return this.f4084o;
    }

    private boolean m3074b(int i) {
        return this.f4070a.get(i) != null;
    }

    public final void m3075a() {
        this.f4070a.clear();
        m3073b();
        Arrays.sort(this.f4071b, new C12962(this));
        int i = 0;
        int i2 = i;
        while (i < this.f4071b.length) {
            C1297a c1297a = this.f4071b[i];
            int i3 = i2;
            for (i2 = 0; i2 < this.f4072c - 1; i2++) {
                C1297a c1297a2 = new C1297a(c1297a.f4066a, c1297a.f4068c);
                c1297a2.f4069d = 2;
                c1297a2.f4067b = c1297a2.f4066a + i3;
                this.f4070a.append(c1297a2.f4067b, c1297a2);
                i3++;
            }
            C1297a c1297a3 = new C1297a(c1297a.f4066a, c1297a.f4068c);
            c1297a3.f4069d = 1;
            c1297a3.f4067b = c1297a3.f4066a + i3;
            this.f4070a.append(c1297a3.f4067b, c1297a3);
            i3++;
            if (i < this.f4071b.length - 1) {
                i2 = this.f4071b[i + 1].f4066a;
                int i4 = this.f4072c - ((i2 - c1297a.f4066a) % this.f4072c);
                if (this.f4072c != i4) {
                    int i5 = i3;
                    for (i3 = 0; i3 < i4; i3++) {
                        C1297a c1297a4 = new C1297a(c1297a.f4066a, c1297a.f4068c);
                        c1297a4.f4069d = 0;
                        c1297a4.f4067b = i2 + i5;
                        this.f4070a.append(c1297a4.f4067b, c1297a4);
                        i5++;
                    }
                    i2 = i5;
                    i++;
                }
            }
            i2 = i3;
            i++;
        }
        notifyDataSetChanged();
    }

    public final boolean areAllItemsEnabled() {
        return this.f4081l.areAllItemsEnabled();
    }

    public final int getCount() {
        return this.f4078i ? this.f4081l.getCount() + this.f4070a.size() : 0;
    }

    public final Object getItem(int i) {
        return m3074b(i) ? this.f4070a.get(i) : this.f4081l.getItem(m3070a(i));
    }

    public final long getItemId(int i) {
        return m3074b(i) ? (long) (ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f4070a.indexOfKey(i)) : this.f4081l.getItemId(m3070a(i));
    }

    public final int getItemViewType(int i) {
        return m3074b(i) ? getViewTypeCount() - 1 : this.f4081l.getItemViewType(m3070a(i));
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (m3074b(i)) {
            HeaderLayout headerLayout;
            View view2;
            if (view != null) {
                if (view.findViewById(this.f4087r) == null) {
                }
                switch (((C1297a) this.f4070a.get(i)).f4069d) {
                    case 1:
                        headerLayout = (HeaderLayout) view.findViewById(this.f4087r);
                        if (!TextUtils.isEmpty(((C1297a) this.f4070a.get(i)).f4068c)) {
                            ((TextView) view.findViewById(this.f4088s)).setText(((C1297a) this.f4070a.get(i)).f4068c);
                        }
                        headerLayout.setHeaderWidth(m3073b());
                        return view;
                    case 2:
                        headerLayout = (HeaderLayout) view.findViewById(this.f4087r);
                        if (!TextUtils.isEmpty(((C1297a) this.f4070a.get(i)).f4068c)) {
                            ((TextView) view.findViewById(this.f4088s)).setText(((C1297a) this.f4070a.get(i)).f4068c);
                        }
                        headerLayout.setHeaderWidth(0);
                        return view;
                    default:
                        view2 = this.f4083n;
                        view = new C1288d(this.f4082m);
                        view.f4063a = view2;
                        return view;
                }
            }
            view = this.f4080k.inflate(this.f4079j, viewGroup, false);
            switch (((C1297a) this.f4070a.get(i)).f4069d) {
                case 1:
                    headerLayout = (HeaderLayout) view.findViewById(this.f4087r);
                    if (TextUtils.isEmpty(((C1297a) this.f4070a.get(i)).f4068c)) {
                        ((TextView) view.findViewById(this.f4088s)).setText(((C1297a) this.f4070a.get(i)).f4068c);
                    }
                    headerLayout.setHeaderWidth(m3073b());
                    return view;
                case 2:
                    headerLayout = (HeaderLayout) view.findViewById(this.f4087r);
                    if (TextUtils.isEmpty(((C1297a) this.f4070a.get(i)).f4068c)) {
                        ((TextView) view.findViewById(this.f4088s)).setText(((C1297a) this.f4070a.get(i)).f4068c);
                    }
                    headerLayout.setHeaderWidth(0);
                    return view;
                default:
                    view2 = this.f4083n;
                    view = new C1288d(this.f4082m);
                    view.f4063a = view2;
                    return view;
            }
        }
        view = this.f4081l.getView(m3070a(i), view, viewGroup);
        this.f4083n = view;
        return view;
    }

    public final int getViewTypeCount() {
        return this.f4081l.getViewTypeCount() + 1;
    }

    public final boolean hasStableIds() {
        return this.f4081l.hasStableIds();
    }

    public final boolean isEmpty() {
        return this.f4081l.isEmpty();
    }

    public final boolean isEnabled(int i) {
        return m3074b(i) ? false : this.f4081l.isEnabled(m3070a(i));
    }
}
