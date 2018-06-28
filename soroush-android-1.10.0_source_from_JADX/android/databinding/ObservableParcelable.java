package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableParcelable<T extends Parcelable> extends C7009i<T> implements Parcelable, Serializable {
    public static final Creator<ObservableParcelable> CREATOR = new C01141();

    static class C01141 implements Creator<ObservableParcelable> {
        C01141() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f20020a, 0);
    }
}
