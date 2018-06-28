package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class PointOfInterest extends zzbej {
    public static final Creator<PointOfInterest> CREATOR = new C1888p();
    public final LatLng f18757a;
    public final String f18758b;
    public final String f18759c;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f18757a = latLng;
        this.f18758b = str;
        this.f18759c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18757a, i);
        dm.m4733a(parcel, 3, this.f18758b);
        dm.m4733a(parcel, 4, this.f18759c);
        dm.m4742b(parcel, a);
    }
}
