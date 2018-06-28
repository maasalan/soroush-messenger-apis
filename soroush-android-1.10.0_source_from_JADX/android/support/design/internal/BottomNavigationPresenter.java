package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p028d.C0235w;
import android.support.v7.view.menu.C0727o;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4893j;
import android.support.v7.view.menu.C6399u;
import android.view.MenuItem;
import android.view.ViewGroup;

public final class BottomNavigationPresenter implements C0727o {
    boolean f12971a;
    private C4890h f12972b;
    private C4722b f12973c;
    private int f12974d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C02501();
        int f926a;

        static class C02501 implements Creator<SavedState> {
            C02501() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f926a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f926a);
        }
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
        return this.f12974d;
    }

    public final void initForMenu(Context context, C4890h c4890h) {
        this.f12973c.initialize(this.f12972b);
        this.f12972b = c4890h;
    }

    public final void onCloseMenu(C4890h c4890h, boolean z) {
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            C4722b c4722b = this.f12973c;
            int i = ((SavedState) parcelable).f926a;
            int size = c4722b.f12997f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = c4722b.f12997f.getItem(i2);
                if (i == item.getItemId()) {
                    c4722b.f12994c = i;
                    c4722b.f12995d = i2;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState();
        savedState.f926a = this.f12973c.getSelectedItemId();
        return savedState;
    }

    public final boolean onSubMenuSelected(C6399u c6399u) {
        return false;
    }

    public final void setCallback(C0726a c0726a) {
    }

    public final void updateMenuView(boolean z) {
        if (!this.f12971a) {
            if (z) {
                this.f12973c.m8708a();
                return;
            }
            ViewGroup viewGroup = this.f12973c;
            int size = viewGroup.f12997f.size();
            if (size != viewGroup.f12993b.length) {
                viewGroup.m8708a();
                return;
            }
            int i = viewGroup.f12994c;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = viewGroup.f12997f.getItem(i2);
                if (item.isChecked()) {
                    viewGroup.f12994c = item.getItemId();
                    viewGroup.f12995d = i2;
                }
            }
            if (i != viewGroup.f12994c) {
                C0235w.m465a(viewGroup, viewGroup.f12992a);
            }
            for (i = 0; i < size; i++) {
                viewGroup.f12996e.f12971a = true;
                viewGroup.f12993b[i].mo128a((C4893j) viewGroup.f12997f.getItem(i));
                viewGroup.f12996e.f12971a = false;
            }
        }
    }
}
