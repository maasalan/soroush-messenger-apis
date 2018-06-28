package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbfs extends zzbej {
    public static final Creator<zzbfs> CREATOR = new dt();
    final String f18501a;
    final zzbfl<?, ?> f18502b;
    private int f18503c;

    zzbfs(int i, String str, zzbfl<?, ?> com_google_android_gms_internal_zzbfl___) {
        this.f18503c = i;
        this.f18501a = str;
        this.f18502b = com_google_android_gms_internal_zzbfl___;
    }

    zzbfs(String str, zzbfl<?, ?> com_google_android_gms_internal_zzbfl___) {
        this.f18503c = 1;
        this.f18501a = str;
        this.f18502b = com_google_android_gms_internal_zzbfl___;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18503c);
        dm.m4733a(parcel, 2, this.f18501a);
        dm.m4731a(parcel, 3, this.f18502b, i);
        dm.m4742b(parcel, a);
    }
}
