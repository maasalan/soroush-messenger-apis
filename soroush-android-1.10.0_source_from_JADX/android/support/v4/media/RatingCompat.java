package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C04901();
    private final int f1681a;
    private final float f1682b;

    static class C04901 implements Creator<RatingCompat> {
        C04901() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f1681a = i;
        this.f1682b = f;
    }

    public final int describeContents() {
        return this.f1681a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Rating:style=");
        stringBuilder.append(this.f1681a);
        stringBuilder.append(" rating=");
        stringBuilder.append(this.f1682b < 0.0f ? "unrated" : String.valueOf(this.f1682b));
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1681a);
        parcel.writeFloat(this.f1682b);
    }
}
