package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public final class VisibleRegion extends zzbej {
    public static final Creator<VisibleRegion> CREATOR = new C1897z();
    public final LatLng f18802a;
    public final LatLng f18803b;
    public final LatLng f18804c;
    public final LatLng f18805d;
    public final LatLngBounds f18806e;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f18802a = latLng;
        this.f18803b = latLng2;
        this.f18804c = latLng3;
        this.f18805d = latLng4;
        this.f18806e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f18802a.equals(visibleRegion.f18802a) && this.f18803b.equals(visibleRegion.f18803b) && this.f18804c.equals(visibleRegion.f18804c) && this.f18805d.equals(visibleRegion.f18805d) && this.f18806e.equals(visibleRegion.f18806e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18802a, this.f18803b, this.f18804c, this.f18805d, this.f18806e});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("nearLeft", this.f18802a).m4375a("nearRight", this.f18803b).m4375a("farLeft", this.f18804c).m4375a("farRight", this.f18805d).m4375a("latLngBounds", this.f18806e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18802a, i);
        dm.m4731a(parcel, 3, this.f18803b, i);
        dm.m4731a(parcel, 4, this.f18804c, i);
        dm.m4731a(parcel, 5, this.f18805d, i);
        dm.m4731a(parcel, 6, this.f18806e, i);
        dm.m4742b(parcel, a);
    }
}
