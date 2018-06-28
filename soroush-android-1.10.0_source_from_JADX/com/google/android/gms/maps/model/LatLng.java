package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class LatLng extends zzbej implements ReflectedParcelable {
    public static final Creator<LatLng> CREATOR = new C1884l();
    public final double f18734a;
    public final double f18735b;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            d2 = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f18735b = d2;
        this.f18734a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f18734a) == Double.doubleToLongBits(latLng.f18734a) && Double.doubleToLongBits(this.f18735b) == Double.doubleToLongBits(latLng.f18735b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f18734a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f18735b);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d = this.f18734a;
        double d2 = this.f18735b;
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("lat/lng: (");
        stringBuilder.append(d);
        stringBuilder.append(",");
        stringBuilder.append(d2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4725a(parcel, 2, this.f18734a);
        dm.m4725a(parcel, 3, this.f18735b);
        dm.m4742b(parcel, i);
    }
}
