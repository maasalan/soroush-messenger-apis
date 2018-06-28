package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableByte extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableByte> CREATOR = new C01081();
    private byte f20013a;

    static class C01081 implements Creator<ObservableByte> {
        C01081() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    public ObservableByte(byte b) {
        this.f20013a = b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f20013a);
    }
}
