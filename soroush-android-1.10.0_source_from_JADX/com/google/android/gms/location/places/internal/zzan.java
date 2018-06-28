package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class zzan extends zzbej {
    public static final Creator<zzan> CREATOR = new C1848k();
    private int f18651a;
    private int f18652b;

    zzan(int i, int i2) {
        this.f18651a = i;
        this.f18652b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18651a);
        dm.m4743b(parcel, 2, this.f18652b);
        dm.m4742b(parcel, i);
    }
}
