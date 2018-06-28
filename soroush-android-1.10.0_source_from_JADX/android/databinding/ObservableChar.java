package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableChar extends C6333b implements Parcelable, Serializable {
    public static final Creator<ObservableChar> CREATOR = new C01091();
    private char f20014a;

    static class C01091 implements Creator<ObservableChar> {
        C01091() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    public ObservableChar(char c) {
        this.f20014a = c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20014a);
    }
}
