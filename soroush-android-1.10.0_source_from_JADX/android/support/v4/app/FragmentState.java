package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new C03681();
    final String f1370a;
    final int f1371b;
    final boolean f1372c;
    final int f1373d;
    final int f1374e;
    final String f1375f;
    final boolean f1376g;
    final boolean f1377h;
    final Bundle f1378i;
    final boolean f1379j;
    Bundle f1380k;
    Fragment f1381l;

    static class C03681 implements Creator<FragmentState> {
        C03681() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Parcel parcel) {
        this.f1370a = parcel.readString();
        this.f1371b = parcel.readInt();
        boolean z = false;
        this.f1372c = parcel.readInt() != 0;
        this.f1373d = parcel.readInt();
        this.f1374e = parcel.readInt();
        this.f1375f = parcel.readString();
        this.f1376g = parcel.readInt() != 0;
        this.f1377h = parcel.readInt() != 0;
        this.f1378i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f1379j = z;
        this.f1380k = parcel.readBundle();
    }

    public FragmentState(Fragment fragment) {
        this.f1370a = fragment.getClass().getName();
        this.f1371b = fragment.f13202n;
        this.f1372c = fragment.f13210v;
        this.f1373d = fragment.f13178F;
        this.f1374e = fragment.f13179G;
        this.f1375f = fragment.f13180H;
        this.f1376g = fragment.f13183K;
        this.f1377h = fragment.f13182J;
        this.f1378i = fragment.f13204p;
        this.f1379j = fragment.f13181I;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1370a);
        parcel.writeInt(this.f1371b);
        parcel.writeInt(this.f1372c);
        parcel.writeInt(this.f1373d);
        parcel.writeInt(this.f1374e);
        parcel.writeString(this.f1375f);
        parcel.writeInt(this.f1376g);
        parcel.writeInt(this.f1377h);
        parcel.writeBundle(this.f1378i);
        parcel.writeInt(this.f1379j);
        parcel.writeBundle(this.f1380k);
    }
}
