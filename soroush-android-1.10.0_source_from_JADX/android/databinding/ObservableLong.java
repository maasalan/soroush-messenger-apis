package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableLong extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableLong> CREATOR = new C01131();
    private long f20018a;

    static class C01131 implements Creator<ObservableLong> {
        C01131() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    public ObservableLong(long j) {
        this.f20018a = j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f20018a);
    }
}
