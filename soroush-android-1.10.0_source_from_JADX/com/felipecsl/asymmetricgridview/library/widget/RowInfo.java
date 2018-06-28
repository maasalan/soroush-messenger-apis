package com.felipecsl.asymmetricgridview.library.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.felipecsl.asymmetricgridview.library.model.AsymmetricItem;
import java.util.ArrayList;
import java.util.List;

class RowInfo<T extends AsymmetricItem> implements Parcelable {
    public static final Creator<RowInfo> CREATOR = new C16031();
    final List<T> f4976a;
    final int f4977b;
    private final float f4978c;

    static class C16031 implements Creator<RowInfo> {
        C16031() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RowInfo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RowInfo[i];
        }
    }

    public RowInfo(int i, List<T> list, float f) {
        this.f4977b = i;
        this.f4976a = list;
        this.f4978c = f;
    }

    public RowInfo(Parcel parcel) {
        this.f4977b = parcel.readInt();
        this.f4978c = parcel.readFloat();
        int readInt = parcel.readInt();
        this.f4976a = new ArrayList();
        ClassLoader classLoader = AsymmetricItem.class.getClassLoader();
        for (int i = 0; i < readInt; i++) {
            this.f4976a.add((AsymmetricItem) parcel.readParcelable(classLoader));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4977b);
        parcel.writeFloat(this.f4978c);
        parcel.writeInt(this.f4976a.size());
        for (int i2 = 0; i2 < this.f4976a.size(); i2++) {
            parcel.writeParcelable((Parcelable) this.f4976a.get(i2), 0);
        }
    }
}
