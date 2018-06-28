package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0249a.C0245h;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.design.internal.C0254g;
import android.support.design.internal.C4729e;
import android.support.design.internal.C4729e.C4724b;
import android.support.design.internal.C6345d;
import android.support.design.internal.NavigationMenuView;
import android.support.v4.p029a.C0346c;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0582z;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.view.C0711g;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.support.v7.view.menu.C4893j;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class NavigationView extends C0254g {
    private static final int[] f13093d = new int[]{16842912};
    private static final int[] f13094e = new int[]{-16842910};
    C0278a f13095c;
    private final C6345d f13096f;
    private final C4729e f13097g;
    private int f13098h;
    private MenuInflater f13099i;

    public interface C0278a {
        boolean m509a();
    }

    class C47391 implements C0722a {
        final /* synthetic */ NavigationView f13091a;

        C47391(NavigationView navigationView) {
            this.f13091a = navigationView;
        }

        public final boolean onMenuItemSelected(C4890h c4890h, MenuItem menuItem) {
            return this.f13091a.f13095c != null && this.f13091a.f13095c.m509a();
        }

        public final void onMenuModeChange(C4890h c4890h) {
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02771();
        public Bundle f13092a;

        static class C02771 implements ClassLoaderCreator<SavedState> {
            C02771() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13092a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f13092a);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        boolean z;
        super(context, attributeSet, i);
        this.f13097g = new C4729e();
        C0330t.m650a(context);
        this.f13096f = new C6345d(context);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0248k.NavigationView, i, C0247j.Widget_Design_NavigationView);
        C0571r.m1339a((View) this, obtainStyledAttributes.getDrawable(C0248k.NavigationView_android_background));
        if (obtainStyledAttributes.hasValue(C0248k.NavigationView_elevation)) {
            C0571r.m1372i(this, (float) obtainStyledAttributes.getDimensionPixelSize(C0248k.NavigationView_elevation, 0));
        }
        C0571r.m1354b((View) this, obtainStyledAttributes.getBoolean(C0248k.NavigationView_android_fitsSystemWindows, false));
        this.f13098h = obtainStyledAttributes.getDimensionPixelSize(C0248k.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateList = obtainStyledAttributes.hasValue(C0248k.NavigationView_itemIconTint) ? obtainStyledAttributes.getColorStateList(C0248k.NavigationView_itemIconTint) : m8767b(16842808);
        if (obtainStyledAttributes.hasValue(C0248k.NavigationView_itemTextAppearance)) {
            resourceId = obtainStyledAttributes.getResourceId(C0248k.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            resourceId = z;
        }
        ColorStateList colorStateList2 = null;
        if (obtainStyledAttributes.hasValue(C0248k.NavigationView_itemTextColor)) {
            colorStateList2 = obtainStyledAttributes.getColorStateList(C0248k.NavigationView_itemTextColor);
        }
        if (!z && r4 == null) {
            colorStateList2 = m8767b(16842806);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(C0248k.NavigationView_itemBackground);
        this.f13096f.mo2620a(new C47391(this));
        this.f13097g.f13026d = 1;
        this.f13097g.initForMenu(context, this.f13096f);
        this.f13097g.m8714a(colorStateList);
        if (z) {
            this.f13097g.m8713a(resourceId);
        }
        this.f13097g.m8717b(colorStateList2);
        this.f13097g.m8715a(drawable);
        this.f13096f.m9476a(this.f13097g);
        C4729e c4729e = this.f13097g;
        if (c4729e.f13023a == null) {
            c4729e.f13023a = (NavigationMenuView) c4729e.f13028f.inflate(C0245h.design_navigation_menu, this, false);
            if (c4729e.f13027e == null) {
                c4729e.f13027e = new C4724b(c4729e);
            }
            c4729e.f13024b = (LinearLayout) c4729e.f13028f.inflate(C0245h.design_navigation_item_header, c4729e.f13023a, false);
            c4729e.f13023a.setAdapter(c4729e.f13027e);
        }
        addView(c4729e.f13023a);
        if (obtainStyledAttributes.hasValue(C0248k.NavigationView_menu)) {
            int resourceId2 = obtainStyledAttributes.getResourceId(C0248k.NavigationView_menu, 0);
            this.f13097g.m8716a(true);
            getMenuInflater().inflate(resourceId2, this.f13096f);
            this.f13097g.m8716a(false);
            this.f13097g.updateMenuView(false);
        }
        if (obtainStyledAttributes.hasValue(C0248k.NavigationView_headerLayout)) {
            m8768a(obtainStyledAttributes.getResourceId(C0248k.NavigationView_headerLayout, 0));
        }
        obtainStyledAttributes.recycle();
    }

    private ColorStateList m8767b(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0683b.m1655a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0635a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f13094e, f13093d, EMPTY_STATE_SET}, new int[]{a.getColorForState(f13094e, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f13099i == null) {
            this.f13099i = new C0711g(getContext());
        }
        return this.f13099i;
    }

    public final View m8768a(int i) {
        C4729e c4729e = this.f13097g;
        View inflate = c4729e.f13028f.inflate(i, c4729e.f13024b, false);
        c4729e.f13024b.addView(inflate);
        c4729e.f13023a.setPadding(0, 0, 0, c4729e.f13023a.getPaddingBottom());
        return inflate;
    }

    protected final void mo169a(C0582z c0582z) {
        C4729e c4729e = this.f13097g;
        int b = c0582z.m1428b();
        if (c4729e.f13034l != b) {
            c4729e.f13034l = b;
            if (c4729e.f13024b.getChildCount() == 0) {
                c4729e.f13023a.setPadding(0, c4729e.f13034l, 0, c4729e.f13023a.getPaddingBottom());
            }
        }
        C0571r.m1350b(c4729e.f13024b, c0582z);
    }

    public int getHeaderCount() {
        return this.f13097g.f13024b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f13097g.f13033k;
    }

    public ColorStateList getItemIconTintList() {
        return this.f13097g.f13032j;
    }

    public ColorStateList getItemTextColor() {
        return this.f13097g.f13031i;
    }

    public Menu getMenu() {
        return this.f13096f;
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = Math.min(MeasureSpec.getSize(i), this.f13098h);
        } else if (mode != 0) {
            super.onMeasure(i, i2);
        } else {
            i = this.f13098h;
        }
        i = MeasureSpec.makeMeasureSpec(i, 1073741824);
        super.onMeasure(i, i2);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f13096f.m9482b(savedState.f13092a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13092a = new Bundle();
        this.f13096f.m9474a(savedState.f13092a);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f13096f.findItem(i);
        if (findItem != null) {
            this.f13097g.f13027e.m8711a((C4893j) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f13097g.m8715a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0346c.m682a(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f13097g.m8714a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f13097g.m8713a(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f13097g.m8717b(colorStateList);
    }

    public void setNavigationItemSelectedListener(C0278a c0278a) {
        this.f13095c = c0278a;
    }
}
