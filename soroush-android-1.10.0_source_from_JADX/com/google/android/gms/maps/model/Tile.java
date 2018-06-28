package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class Tile extends zzbej {
    public static final Creator<Tile> CREATOR = new C1895w();
    public final int f18793a;
    public final int f18794b;
    public final byte[] f18795c;

    public Tile(int i, int i2, byte[] bArr) {
        this.f18793a = i;
        this.f18794b = i2;
        this.f18795c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 2, this.f18793a);
        dm.m4743b(parcel, 3, this.f18794b);
        dm.m4736a(parcel, 4, this.f18795c);
        dm.m4742b(parcel, i);
    }
}
