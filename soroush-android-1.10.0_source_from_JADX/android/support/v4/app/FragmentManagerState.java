package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new C03671();
    FragmentState[] f1365a;
    int[] f1366b;
    BackStackState[] f1367c;
    int f1368d = -1;
    int f1369e;

    static class C03671 implements Creator<FragmentManagerState> {
        C03671() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1365a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f1366b = parcel.createIntArray();
        this.f1367c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1368d = parcel.readInt();
        this.f1369e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1365a, i);
        parcel.writeIntArray(this.f1366b);
        parcel.writeTypedArray(this.f1367c, i);
        parcel.writeInt(this.f1368d);
        parcel.writeInt(this.f1369e);
    }
}
