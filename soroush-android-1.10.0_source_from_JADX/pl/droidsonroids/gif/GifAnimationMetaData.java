package pl.droidsonroids.gif;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.Locale;

public class GifAnimationMetaData implements Parcelable, Serializable {
    public static final Creator<GifAnimationMetaData> CREATOR = new C78361();
    private final int f24875a;
    private final int f24876b;
    private final int f24877c;
    private final int f24878d;
    private final int f24879e;

    static class C78361 implements Creator<GifAnimationMetaData> {
        C78361() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GifAnimationMetaData(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GifAnimationMetaData[i];
        }
    }

    private GifAnimationMetaData(Parcel parcel) {
        this.f24875a = parcel.readInt();
        this.f24876b = parcel.readInt();
        this.f24877c = parcel.readInt();
        this.f24878d = parcel.readInt();
        this.f24879e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String num = this.f24875a == 0 ? "Infinity" : Integer.toString(this.f24875a);
        r3 = new Object[5];
        int i = 0;
        r3[0] = Integer.valueOf(this.f24878d);
        r3[1] = Integer.valueOf(this.f24877c);
        r3[2] = Integer.valueOf(this.f24879e);
        r3[3] = num;
        r3[4] = Integer.valueOf(this.f24876b);
        num = String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", r3);
        if (this.f24879e > 1 && this.f24876b > 0) {
            i = 1;
        }
        if (i == 0) {
            return num;
        }
        StringBuilder stringBuilder = new StringBuilder("Animated ");
        stringBuilder.append(num);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24875a);
        parcel.writeInt(this.f24876b);
        parcel.writeInt(this.f24877c);
        parcel.writeInt(this.f24878d);
        parcel.writeInt(this.f24879e);
    }
}
