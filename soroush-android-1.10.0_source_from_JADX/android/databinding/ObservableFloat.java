package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableFloat extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableFloat> CREATOR = new C01111();
    private float f20016a;

    static class C01111 implements Creator<ObservableFloat> {
        C01111() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    public ObservableFloat(float f) {
        this.f20016a = f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f20016a);
    }
}
