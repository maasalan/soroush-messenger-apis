package android.support.design.internal;

import android.content.res.ColorStateList;
import android.support.p028d.C4719y;
import android.support.v4.p038g.C0480k.C0479a;
import android.support.v4.view.C0571r;
import android.support.v7.view.menu.C0729p;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4893j;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public final class C4722b extends ViewGroup implements C0729p {
    final C4719y f12992a;
    C4721a[] f12993b;
    int f12994c;
    int f12995d;
    BottomNavigationPresenter f12996e;
    C4890h f12997f;
    private final int f12998g;
    private final int f12999h;
    private final int f13000i;
    private final int f13001j;
    private final OnClickListener f13002k;
    private final C0479a<C4721a> f13003l;
    private boolean f13004m;
    private ColorStateList f13005n;
    private ColorStateList f13006o;
    private int f13007p;
    private int[] f13008q;

    private C4721a getNewItem() {
        C4721a c4721a = (C4721a) this.f13003l.mo308a();
        return c4721a == null ? new C4721a(getContext()) : c4721a;
    }

    public final void m8708a() {
        removeAllViews();
        if (this.f12993b != null) {
            for (Object a : this.f12993b) {
                this.f13003l.mo309a(a);
            }
        }
        if (this.f12997f.size() == 0) {
            this.f12994c = 0;
            this.f12995d = 0;
            this.f12993b = null;
            return;
        }
        this.f12993b = new C4721a[this.f12997f.size()];
        this.f13004m = this.f12997f.size() > 3;
        for (int i = 0; i < this.f12997f.size(); i++) {
            this.f12996e.f12971a = true;
            this.f12997f.getItem(i).setCheckable(true);
            this.f12996e.f12971a = false;
            View newItem = getNewItem();
            this.f12993b[i] = newItem;
            newItem.setIconTintList(this.f13005n);
            newItem.setTextColor(this.f13006o);
            newItem.setItemBackground(this.f13007p);
            newItem.setShiftingMode(this.f13004m);
            newItem.mo128a((C4893j) this.f12997f.getItem(i));
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f13002k);
            addView(newItem);
        }
        this.f12995d = Math.min(this.f12997f.size() - 1, this.f12995d);
        this.f12997f.getItem(this.f12995d).setChecked(true);
    }

    public final ColorStateList getIconTintList() {
        return this.f13005n;
    }

    public final int getItemBackgroundRes() {
        return this.f13007p;
    }

    public final ColorStateList getItemTextColor() {
        return this.f13006o;
    }

    public final int getSelectedItemId() {
        return this.f12994c;
    }

    public final int getWindowAnimations() {
        return 0;
    }

    public final void initialize(C4890h c4890h) {
        this.f12997f = c4890h;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i3 -= i;
        i4 -= i2;
        i2 = 0;
        int i5 = i2;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                if (C0571r.m1369h(this) == 1) {
                    int i6 = i3 - i5;
                    childAt.layout(i6 - childAt.getMeasuredWidth(), 0, i6, i4);
                } else {
                    childAt.layout(i5, 0, childAt.getMeasuredWidth() + i5, i4);
                }
                i5 += childAt.getMeasuredWidth();
            }
            i2++;
        }
    }

    protected final void onMeasure(int i, int i2) {
        int i3;
        i = MeasureSpec.getSize(i);
        i2 = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f13001j, 1073741824);
        int min;
        if (this.f13004m) {
            i3 = i2 - 1;
            min = Math.min(i - (this.f12999h * i3), this.f13000i);
            i -= min;
            int min2 = Math.min(i / i3, this.f12998g);
            i3 = i - (i3 * min2);
            i = 0;
            while (i < i2) {
                this.f13008q[i] = i == this.f12995d ? min : min2;
                if (i3 > 0) {
                    int[] iArr = this.f13008q;
                    iArr[i] = iArr[i] + 1;
                    i3--;
                }
                i++;
            }
        } else {
            i3 = Math.min(i / (i2 == 0 ? 1 : i2), this.f13000i);
            min = i - (i3 * i2);
            for (i = 0; i < i2; i++) {
                this.f13008q[i] = i3;
                if (min > 0) {
                    int[] iArr2 = this.f13008q;
                    iArr2[i] = iArr2[i] + 1;
                    min--;
                }
            }
        }
        i = 0;
        i3 = i;
        while (i < i2) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f13008q[i], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i3 += childAt.getMeasuredWidth();
            }
            i++;
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, MeasureSpec.makeMeasureSpec(i3, 1073741824), 0), View.resolveSizeAndState(this.f13001j, makeMeasureSpec, 0));
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        this.f13005n = colorStateList;
        if (this.f12993b != null) {
            for (C4721a iconTintList : this.f12993b) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public final void setItemBackgroundRes(int i) {
        this.f13007p = i;
        if (this.f12993b != null) {
            for (C4721a itemBackground : this.f12993b) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public final void setItemTextColor(ColorStateList colorStateList) {
        this.f13006o = colorStateList;
        if (this.f12993b != null) {
            for (C4721a textColor : this.f12993b) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public final void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f12996e = bottomNavigationPresenter;
    }
}
