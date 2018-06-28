package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbfh extends zzbej {
    public static final Creator<zzbfh> CREATOR = new dp();
    final String f18480a;
    final int f18481b;
    private int f18482c;

    zzbfh(int i, String str, int i2) {
        this.f18482c = i;
        this.f18480a = str;
        this.f18481b = i2;
    }

    zzbfh(String str, int i) {
        this.f18482c = 1;
        this.f18480a = str;
        this.f18481b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18482c);
        dm.m4733a(parcel, 2, this.f18480a);
        dm.m4743b(parcel, 3, this.f18481b);
        dm.m4742b(parcel, i);
    }
}
