package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzdxr extends zzbej {
    public static final Creator<zzdxr> CREATOR = new mf();
    private String f18579a;
    private String f18580b;

    public zzdxr(String str, String str2) {
        this.f18579a = str;
        this.f18580b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 2, this.f18579a);
        dm.m4733a(parcel, 3, this.f18580b);
        dm.m4742b(parcel, i);
    }
}
