package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class MapStyleOptions extends zzbej {
    public static final Creator<MapStyleOptions> CREATOR = new C1885m();
    private static final String f18738a = "MapStyleOptions";
    private String f18739b;

    public MapStyleOptions(String str) {
        this.f18739b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 2, this.f18739b);
        dm.m4742b(parcel, i);
    }
}
