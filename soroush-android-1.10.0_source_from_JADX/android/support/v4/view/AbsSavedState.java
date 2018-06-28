package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new C05142();
    public static final AbsSavedState EMPTY_STATE = new C48241();
    private final Parcelable mSuperState;

    static class C05142 implements ClassLoaderCreator<AbsSavedState> {
        C05142() {
        }

        private static AbsSavedState m1122a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return C05142.m1122a(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return C05142.m1122a(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    static class C48241 extends AbsSavedState {
        C48241() {
            super();
        }
    }

    private AbsSavedState() {
        this.mSuperState = null;
    }

    protected AbsSavedState(Parcel parcel) {
        this(parcel, null);
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = EMPTY_STATE;
        }
        this.mSuperState = readParcelable;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == EMPTY_STATE) {
            parcelable = null;
        }
        this.mSuperState = parcelable;
    }

    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}
