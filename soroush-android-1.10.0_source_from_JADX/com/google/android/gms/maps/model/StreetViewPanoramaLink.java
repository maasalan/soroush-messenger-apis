package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public class StreetViewPanoramaLink extends zzbej {
    public static final Creator<StreetViewPanoramaLink> CREATOR = new C1892t();
    public final String f18786a;
    public final float f18787b;

    public StreetViewPanoramaLink(String str, float f) {
        this.f18786a = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.f18787b = f % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f18786a.equals(streetViewPanoramaLink.f18786a) && Float.floatToIntBits(this.f18787b) == Float.floatToIntBits(streetViewPanoramaLink.f18787b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18786a, Float.valueOf(this.f18787b)});
    }

    public String toString() {
        return aa.m4373a(this).m4375a("panoId", this.f18786a).m4375a("bearing", Float.valueOf(this.f18787b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 2, this.f18786a);
        dm.m4726a(parcel, 3, this.f18787b);
        dm.m4742b(parcel, i);
    }
}
