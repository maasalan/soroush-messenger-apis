package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public final class zzah extends zzbej {
    public static final Creator<zzah> CREATOR = new C1842c();
    private PlaceEntity f18642a;
    private float f18643b;

    zzah(PlaceEntity placeEntity, float f) {
        this.f18642a = placeEntity;
        this.f18643b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah com_google_android_gms_location_places_internal_zzah = (zzah) obj;
        return this.f18642a.equals(com_google_android_gms_location_places_internal_zzah.f18642a) && this.f18643b == com_google_android_gms_location_places_internal_zzah.f18643b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18642a, Float.valueOf(this.f18643b)});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("place", this.f18642a).m4375a("likelihood", Float.valueOf(this.f18643b)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 1, this.f18642a, i);
        dm.m4726a(parcel, 2, this.f18643b);
        dm.m4742b(parcel, a);
    }
}
