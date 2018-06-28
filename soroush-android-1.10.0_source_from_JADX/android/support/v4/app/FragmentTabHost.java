package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public final class FragmentTabHost extends TabHost implements OnTabChangeListener {
    private final ArrayList<C0370a> f1387a;
    private Context f1388b;
    private C0390k f1389c;
    private int f1390d;
    private OnTabChangeListener f1391e;
    private C0370a f1392f;
    private boolean f1393g;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C03691();
        String f1382a;

        static class C03691 implements Creator<SavedState> {
            C03691() {
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
            this.f1382a = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("FragmentTabHost.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" curTab=");
            stringBuilder.append(this.f1382a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1382a);
        }
    }

    static final class C0370a {
        final String f1383a;
        final Class<?> f1384b;
        final Bundle f1385c;
        Fragment f1386d;
    }

    private C0401p m722a(String str, C0401p c0401p) {
        C0370a c0370a;
        int size = this.f1387a.size();
        for (int i = 0; i < size; i++) {
            c0370a = (C0370a) this.f1387a.get(i);
            if (c0370a.f1383a.equals(str)) {
                break;
            }
        }
        c0370a = null;
        if (this.f1392f != c0370a) {
            if (c0401p == null) {
                c0401p = this.f1389c.mo254a();
            }
            if (!(this.f1392f == null || this.f1392f.f1386d == null)) {
                c0401p.mo240b(this.f1392f.f1386d);
            }
            if (c0370a != null) {
                if (c0370a.f1386d == null) {
                    c0370a.f1386d = Fragment.m8850a(this.f1388b, c0370a.f1384b.getName(), c0370a.f1385c);
                    c0401p.mo235a(this.f1390d, c0370a.f1386d, c0370a.f1383a);
                } else {
                    c0401p.mo243c(c0370a.f1386d);
                }
            }
            this.f1392f = c0370a;
        }
        return c0401p;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1387a.size();
        C0401p c0401p = null;
        for (int i = 0; i < size; i++) {
            C0370a c0370a = (C0370a) this.f1387a.get(i);
            c0370a.f1386d = this.f1389c.mo253a(c0370a.f1383a);
            if (!(c0370a.f1386d == null || c0370a.f1386d.f13182J)) {
                if (c0370a.f1383a.equals(currentTabTag)) {
                    this.f1392f = c0370a;
                } else {
                    if (c0401p == null) {
                        c0401p = this.f1389c.mo254a();
                    }
                    c0401p.mo240b(c0370a.f1386d);
                }
            }
        }
        this.f1393g = true;
        C0401p a = m722a(currentTabTag, c0401p);
        if (a != null) {
            a.mo242c();
            this.f1389c.mo259b();
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1393g = false;
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setCurrentTabByTag(savedState.f1382a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1382a = getCurrentTabTag();
        return savedState;
    }

    public final void onTabChanged(String str) {
        if (this.f1393g) {
            C0401p a = m722a(str, null);
            if (a != null) {
                a.mo242c();
            }
        }
        if (this.f1391e != null) {
            this.f1391e.onTabChanged(str);
        }
    }

    public final void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f1391e = onTabChangeListener;
    }

    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
