package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableDouble extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableDouble> CREATOR = new C01101();
    private double f20015a;

    static class C01101 implements Creator<ObservableDouble> {
        C01101() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    public ObservableDouble(double d) {
        this.f20015a = d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f20015a);
    }
}
