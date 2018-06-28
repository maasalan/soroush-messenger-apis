package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public class StreetViewPanoramaLocation extends zzbej {
    public static final Creator<StreetViewPanoramaLocation> CREATOR = new C1893u();
    public final StreetViewPanoramaLink[] f18788a;
    public final LatLng f18789b;
    public final String f18790c;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f18788a = streetViewPanoramaLinkArr;
        this.f18789b = latLng;
        this.f18790c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f18790c.equals(streetViewPanoramaLocation.f18790c) && this.f18789b.equals(streetViewPanoramaLocation.f18789b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18789b, this.f18790c});
    }

    public String toString() {
        return aa.m4373a(this).m4375a("panoId", this.f18790c).m4375a("position", this.f18789b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4738a(parcel, 2, this.f18788a, i);
        dm.m4731a(parcel, 3, this.f18789b, i);
        dm.m4733a(parcel, 4, this.f18790c);
        dm.m4742b(parcel, a);
    }
}
