package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableShort extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableShort> CREATOR = new C01151();
    private short f20019a;

    static class C01151 implements Creator<ObservableShort> {
        C01151() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    public ObservableShort(short s) {
        this.f20019a = s;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20019a);
    }
}
