package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4337e.C4336a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b;

public abstract class C4339h {
    protected LayoutManager f12189b;

    public C4339h(LayoutManager layoutManager) {
        this.f12189b = layoutManager;
    }

    public static int m8097a(int i, SparseArray<Boolean> sparseArray) {
        int i2 = i;
        i = 0;
        int i3 = i;
        while (i < sparseArray.size()) {
            if (((Boolean) sparseArray.get(i2, Boolean.valueOf(false))).booleanValue()) {
                i++;
            } else {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    public static int m8098b(int i, SparseArray<Boolean> sparseArray) {
        int i2 = i;
        i = 0;
        int i3 = i;
        while (i < sparseArray.size()) {
            if (((Boolean) sparseArray.get(i2, Boolean.valueOf(false))).booleanValue()) {
                i++;
            } else {
                i3++;
            }
            i2--;
        }
        return i3;
    }

    public final int m8099a(int i) {
        int i2 = 0;
        while (i2 < this.f12189b.getChildCount()) {
            View childAt = this.f12189b.getChildAt(i2);
            C6250b c6250b = (C6250b) childAt.getLayoutParams();
            if (c6250b.m14533a() != i) {
                break;
            } else if (!c6250b.f16983c) {
                return this.f12189b.getDecoratedTop(childAt);
            } else {
                i2++;
            }
        }
        return 0;
    }

    public int mo2417a(int i, int i2, int i3) {
        while (i2 >= 0) {
            View childAt = this.f12189b.getChildAt(i2);
            C6250b c6250b = (C6250b) childAt.getLayoutParams();
            if (c6250b.m14533a() != i) {
                break;
            } else if (!c6250b.f16983c) {
                return this.f12189b.getDecoratedBottom(childAt);
            } else {
                i2--;
            }
        }
        return i3;
    }

    public abstract int mo2418a(int i, int i2, int i3, C4338g c4338g, C4337e c4337e);

    public abstract int mo2419a(int i, View view, C4338g c4338g, C4337e c4337e);

    public abstract int mo2420a(int i, C4338g c4338g, C4337e c4337e);

    protected final int m8104a(C4336a c4336a, int i, int i2, C4337e c4337e) {
        i2 = i2 == C4329a.f12155a ? 0 : this.f12189b.getChildCount();
        c4337e.m8092a(i);
        this.f12189b.addView(c4336a.f12171a, i2);
        return i2;
    }

    public final View m8105a(int i, boolean z) {
        int childCount = this.f12189b.getChildCount();
        int i2 = 0;
        View view = null;
        while (i2 < childCount) {
            View childAt = this.f12189b.getChildAt(i2);
            C6250b c6250b = (C6250b) childAt.getLayoutParams();
            if (i != c6250b.m14533a()) {
                return view;
            }
            if (!c6250b.f16983c || !z) {
                return childAt;
            }
            i2++;
            view = childAt;
        }
        return view;
    }

    public C6250b mo2421a(Context context, AttributeSet attributeSet) {
        return new C6250b(context, attributeSet);
    }

    public C6250b mo2422a(C6250b c6250b) {
        return c6250b;
    }

    public C4339h mo2423a(C4338g c4338g) {
        return this;
    }

    public abstract int mo2424b(int i, int i2, int i3, C4338g c4338g, C4337e c4337e);

    public abstract int mo2425b(int i, View view, C4338g c4338g, C4337e c4337e);

    public final View m8111b(int i) {
        int childCount = this.f12189b.getChildCount() - 1;
        View view = null;
        while (childCount >= 0) {
            View childAt = this.f12189b.getChildAt(childCount);
            C6250b c6250b = (C6250b) childAt.getLayoutParams();
            if (i != c6250b.m14533a()) {
                return view;
            }
            if (!c6250b.f16983c) {
                return childAt;
            }
            childCount--;
            view = childAt;
        }
        return view;
    }
}
