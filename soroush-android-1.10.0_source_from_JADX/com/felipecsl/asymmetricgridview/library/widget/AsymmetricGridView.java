package com.felipecsl.asymmetricgridview.library.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.WrapperListAdapter;
import com.felipecsl.asymmetricgridview.library.C1587a;
import com.felipecsl.asymmetricgridview.library.C1600d;

public final class AsymmetricGridView extends ListView {
    protected int f4967a = 2;
    protected int f4968b;
    protected int f4969c;
    protected int f4970d;
    protected boolean f4971e;
    protected boolean f4972f;
    protected C1587a f4973g;
    protected OnItemClickListener f4974h;
    protected OnItemLongClickListener f4975i;

    class C16011 implements OnGlobalLayoutListener {
        final /* synthetic */ AsymmetricGridView f4956a;

        C16011(AsymmetricGridView asymmetricGridView) {
            this.f4956a = asymmetricGridView;
        }

        public final void onGlobalLayout() {
            this.f4956a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            this.f4956a.m4133a();
            if (this.f4956a.f4973g != null) {
                this.f4956a.f4973g.mo1503a();
            }
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C16021();
        int f4957a;
        int f4958b;
        int f4959c;
        int f4960d;
        int f4961e;
        int f4962f;
        boolean f4963g;
        boolean f4964h;
        Parcelable f4965i;
        ClassLoader f4966j;

        static class C16021 implements Creator<SavedState> {
            C16021() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4957a = parcel.readInt();
            this.f4958b = parcel.readInt();
            this.f4959c = parcel.readInt();
            this.f4960d = parcel.readInt();
            this.f4961e = parcel.readInt();
            this.f4962f = parcel.readInt();
            boolean z = false;
            this.f4963g = parcel.readByte() == (byte) 1;
            if (parcel.readByte() == (byte) 1) {
                z = true;
            }
            this.f4964h = z;
            this.f4965i = parcel.readParcelable(this.f4966j);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4957a);
            parcel.writeInt(this.f4958b);
            parcel.writeInt(this.f4959c);
            parcel.writeInt(this.f4960d);
            parcel.writeInt(this.f4961e);
            parcel.writeInt(this.f4962f);
            parcel.writeByte((byte) this.f4963g);
            parcel.writeByte((byte) this.f4964h);
            parcel.writeParcelable(this.f4965i, i);
        }
    }

    public AsymmetricGridView(Context context) {
        super(context);
        setSelector(17170445);
        this.f4968b = C1600d.m4130a(context, 5.0f);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C16011(this));
        }
    }

    public final int m4133a() {
        int availableSpace = this.f4969c > 0 ? (getAvailableSpace() + this.f4968b) / (this.f4969c + this.f4968b) : this.f4970d > 0 ? this.f4970d : 2;
        if (availableSpace <= 0) {
            availableSpace = 1;
        }
        this.f4967a = availableSpace;
        return availableSpace;
    }

    protected final void m4134a(int i, View view) {
        if (this.f4974h != null) {
            this.f4974h.onItemClick(this, view, i, (long) view.getId());
        }
    }

    public final boolean m4135b() {
        return this.f4971e;
    }

    protected final boolean m4136b(int i, View view) {
        if (this.f4975i != null) {
            if (this.f4975i.onItemLongClick(this, view, i, (long) view.getId())) {
                return true;
            }
        }
        return false;
    }

    public final int getAvailableSpace() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final int getColumnWidth() {
        return (getAvailableSpace() - ((this.f4967a - 1) * this.f4968b)) / this.f4967a;
    }

    public final int getNumColumns() {
        return this.f4967a;
    }

    public final int getRequestedHorizontalSpacing() {
        return this.f4968b;
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m4133a();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f4971e = savedState.f4964h;
            this.f4972f = savedState.f4963g;
            this.f4967a = savedState.f4957a;
            this.f4970d = savedState.f4959c;
            this.f4969c = savedState.f4958b;
            this.f4968b = savedState.f4961e;
            if (this.f4973g != null) {
                this.f4973g.mo1504a(savedState.f4965i);
            }
            setSelectionFromTop(20, 0);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4964h = this.f4971e;
        savedState.f4963g = this.f4972f;
        savedState.f4957a = this.f4967a;
        savedState.f4959c = this.f4970d;
        savedState.f4958b = this.f4969c;
        savedState.f4961e = this.f4968b;
        if (this.f4973g != null) {
            savedState.f4965i = this.f4973g.mo1505b();
        }
        return savedState;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof WrapperListAdapter) {
            listAdapter = ((WrapperListAdapter) listAdapter).getWrappedAdapter();
            if (!(listAdapter instanceof C1587a)) {
                throw new UnsupportedOperationException("Wrapped adapter must implement AsymmetricGridViewAdapterContract");
            }
        } else if (!(listAdapter instanceof C1587a)) {
            throw new UnsupportedOperationException("Adapter must implement AsymmetricGridViewAdapterContract");
        }
        this.f4973g = (C1587a) listAdapter;
        super.setAdapter(listAdapter);
        this.f4973g.mo1503a();
    }

    public final void setAllowReordering(boolean z) {
        this.f4971e = z;
        if (this.f4973g != null) {
            this.f4973g.mo1503a();
        }
    }

    public final void setDebugging(boolean z) {
        this.f4972f = z;
    }

    public final void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.f4974h = onItemClickListener;
    }

    public final void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.f4975i = onItemLongClickListener;
    }

    public final void setRequestedColumnCount(int i) {
        this.f4970d = i;
    }

    public final void setRequestedColumnWidth(int i) {
        this.f4969c = i;
    }

    public final void setRequestedHorizontalSpacing(int i) {
        this.f4968b = i;
    }
}
