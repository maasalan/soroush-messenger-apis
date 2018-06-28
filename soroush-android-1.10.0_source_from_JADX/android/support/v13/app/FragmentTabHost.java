package android.support.v13.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
    private final ArrayList<C0337a> f1286a;
    private Context f1287b;
    private FragmentManager f1288c;
    private int f1289d;
    private OnTabChangeListener f1290e;
    private C0337a f1291f;
    private boolean f1292g;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C03361();
        String f1281a;

        static class C03361 implements Creator<SavedState> {
            C03361() {
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
            this.f1281a = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("FragmentTabHost.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" curTab=");
            stringBuilder.append(this.f1281a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1281a);
        }
    }

    static final class C0337a {
        final String f1282a;
        final Class<?> f1283b;
        final Bundle f1284c;
        Fragment f1285d;
    }

    private FragmentTransaction m661a(String str, FragmentTransaction fragmentTransaction) {
        C0337a c0337a = null;
        for (int i = 0; i < this.f1286a.size(); i++) {
            C0337a c0337a2 = (C0337a) this.f1286a.get(i);
            if (c0337a2.f1282a.equals(str)) {
                c0337a = c0337a2;
            }
        }
        if (c0337a == null) {
            StringBuilder stringBuilder = new StringBuilder("No tab known for tag ");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (this.f1291f != c0337a) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f1288c.beginTransaction();
            }
            if (!(this.f1291f == null || this.f1291f.f1285d == null)) {
                fragmentTransaction.detach(this.f1291f.f1285d);
            }
            if (c0337a != null) {
                if (c0337a.f1285d == null) {
                    c0337a.f1285d = Fragment.instantiate(this.f1287b, c0337a.f1283b.getName(), c0337a.f1284c);
                    fragmentTransaction.add(this.f1289d, c0337a.f1285d, c0337a.f1282a);
                } else {
                    fragmentTransaction.attach(c0337a.f1285d);
                }
            }
            this.f1291f = c0337a;
        }
        return fragmentTransaction;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < this.f1286a.size(); i++) {
            C0337a c0337a = (C0337a) this.f1286a.get(i);
            c0337a.f1285d = this.f1288c.findFragmentByTag(c0337a.f1282a);
            if (!(c0337a.f1285d == null || c0337a.f1285d.isDetached())) {
                if (c0337a.f1282a.equals(currentTabTag)) {
                    this.f1291f = c0337a;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f1288c.beginTransaction();
                    }
                    fragmentTransaction.detach(c0337a.f1285d);
                }
            }
        }
        this.f1292g = true;
        FragmentTransaction a = m661a(currentTabTag, fragmentTransaction);
        if (a != null) {
            a.commit();
            this.f1288c.executePendingTransactions();
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1292g = false;
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setCurrentTabByTag(savedState.f1281a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1281a = getCurrentTabTag();
        return savedState;
    }

    public final void onTabChanged(String str) {
        if (this.f1292g) {
            FragmentTransaction a = m661a(str, null);
            if (a != null) {
                a.commit();
            }
        }
        if (this.f1290e != null) {
            this.f1290e.onTabChanged(str);
        }
    }

    public final void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f1290e = onTabChangeListener;
    }

    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
