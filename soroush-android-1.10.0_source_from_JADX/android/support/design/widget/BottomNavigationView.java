package android.support.design.widget;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.C4722b;
import android.support.v4.view.AbsSavedState;
import android.support.v7.view.C0711g;
import android.support.v7.view.menu.C4890h;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

public final class BottomNavigationView extends FrameLayout {
    private static final int[] f946a = new int[]{16842912};
    private static final int[] f947b = new int[]{-16842910};
    private final C4890h f948c;
    private final C4722b f949d;
    private final BottomNavigationPresenter f950e;
    private MenuInflater f951f;
    private C0262b f952g;
    private C0261a f953h;

    public interface C0261a {
    }

    public interface C0262b {
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02601();
        Bundle f13043a;

        static class C02601 implements ClassLoaderCreator<SavedState> {
            C02601() {
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
            this.f13043a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f13043a);
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f951f == null) {
            this.f951f = new C0711g(getContext());
        }
        return this.f951f;
    }

    public final int getItemBackgroundResource() {
        return this.f949d.getItemBackgroundRes();
    }

    public final ColorStateList getItemIconTintList() {
        return this.f949d.getIconTintList();
    }

    public final ColorStateList getItemTextColor() {
        return this.f949d.getItemTextColor();
    }

    public final int getMaxItemCount() {
        return 5;
    }

    public final Menu getMenu() {
        return this.f948c;
    }

    public final int getSelectedItemId() {
        return this.f949d.getSelectedItemId();
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f948c.m9482b(savedState.f13043a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13043a = new Bundle();
        this.f948c.m9474a(savedState.f13043a);
        return savedState;
    }

    public final void setItemBackgroundResource(int i) {
        this.f949d.setItemBackgroundRes(i);
    }

    public final void setItemIconTintList(ColorStateList colorStateList) {
        this.f949d.setIconTintList(colorStateList);
    }

    public final void setItemTextColor(ColorStateList colorStateList) {
        this.f949d.setItemTextColor(colorStateList);
    }

    public final void setOnNavigationItemReselectedListener(C0261a c0261a) {
        this.f953h = c0261a;
    }

    public final void setOnNavigationItemSelectedListener(C0262b c0262b) {
        this.f952g = c0262b;
    }

    public final void setSelectedItemId(int i) {
        MenuItem findItem = this.f948c.findItem(i);
        if (findItem != null && !this.f948c.m9481a(findItem, this.f950e, 0)) {
            findItem.setChecked(true);
        }
    }
}
