package mobi.mmdt.ott.view.conversation.emojisticker.sticker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.felipecsl.asymmetricgridview.library.model.AsymmetricItem;

public class StickerItemViewModel implements AsymmetricItem {
    public static final Creator<StickerItemViewModel> CREATOR = new C40361();
    int f16779a;
    int f16780b;
    int f16781c;
    String f16782d;
    String f16783e;
    private int f16784f;
    private int f16785g;
    private int f16786h;
    private int f16787i;
    private int f16788j;
    private String f16789k;

    static class C40361 implements Creator<StickerItemViewModel> {
        C40361() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new StickerItemViewModel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StickerItemViewModel[i];
        }
    }

    public StickerItemViewModel(int i, int i2, int i3, String str, int i4, int i5, int i6, int i7, String str2, String str3, int i8) {
        this.f16781c = i;
        this.f16779a = i3;
        this.f16784f = i4;
        this.f16785g = i5;
        this.f16786h = i6;
        this.f16787i = i7;
        this.f16780b = i2;
        this.f16782d = str;
        this.f16789k = str2;
        this.f16783e = str3;
        this.f16788j = i8;
    }

    public StickerItemViewModel(Parcel parcel) {
        this.f16779a = parcel.readInt() + 1;
        this.f16784f = parcel.readInt();
        this.f16785g = parcel.readInt();
        this.f16786h = parcel.readInt();
        this.f16787i = parcel.readInt();
        this.f16780b = parcel.readInt();
        this.f16781c = parcel.readInt();
        this.f16782d = parcel.readString();
        this.f16789k = parcel.readString();
        this.f16783e = parcel.readString();
    }

    public final int mo2371a() {
        return this.f16785g;
    }

    public final int mo2372b() {
        return this.f16784f;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("%s: %sx%s", new Object[]{Integer.valueOf(this.f16779a - 1), Integer.valueOf(this.f16784f), Integer.valueOf(this.f16785g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16779a - 1);
        parcel.writeInt(this.f16784f);
        parcel.writeInt(this.f16785g);
        parcel.writeInt(this.f16786h);
        parcel.writeInt(this.f16787i);
        parcel.writeInt(this.f16780b);
        parcel.writeInt(this.f16781c);
        parcel.writeString(this.f16782d);
        parcel.writeString(this.f16789k);
        parcel.writeString(this.f16783e);
    }
}
