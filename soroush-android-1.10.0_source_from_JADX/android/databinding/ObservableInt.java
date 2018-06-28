package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableInt extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableInt> CREATOR = new C01121();
    private int f20017a;

    static class C01121 implements Creator<ObservableInt> {
        C01121() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    public ObservableInt(int i) {
        this.f20017a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20017a);
    }
}
