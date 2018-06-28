package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableBoolean extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableBoolean> CREATOR = new C01071();
    private boolean f20012a;

    static class C01071 implements Creator<ObservableBoolean> {
        C01071() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    public ObservableBoolean(boolean z) {
        this.f20012a = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20012a);
    }
}
