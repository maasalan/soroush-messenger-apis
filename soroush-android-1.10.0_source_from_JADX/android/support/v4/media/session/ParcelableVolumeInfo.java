package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C04971();
    public int f1702a;
    public int f1703b;
    public int f1704c;
    public int f1705d;
    public int f1706e;

    static class C04971 implements Creator<ParcelableVolumeInfo> {
        C04971() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1702a = parcel.readInt();
        this.f1704c = parcel.readInt();
        this.f1705d = parcel.readInt();
        this.f1706e = parcel.readInt();
        this.f1703b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1702a);
        parcel.writeInt(this.f1704c);
        parcel.writeInt(this.f1705d);
        parcel.writeInt(this.f1706e);
        parcel.writeInt(this.f1703b);
    }
}
