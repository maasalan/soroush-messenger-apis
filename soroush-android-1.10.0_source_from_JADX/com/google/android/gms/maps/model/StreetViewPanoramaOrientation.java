package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public class StreetViewPanoramaOrientation extends zzbej {
    public static final Creator<StreetViewPanoramaOrientation> CREATOR = new C1894v();
    public final float f18791a;
    public final float f18792b;

    public static final class C1868a {
        public float f6318a;
        public float f6319b;
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("Tilt needs to be between -90 and 90 inclusive: ");
        stringBuilder.append(f);
        ac.m4386b(z, stringBuilder.toString());
        this.f18791a = f + 0.0f;
        if (((double) f2) <= 0.0d) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.f18792b = f2 % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f18791a) == Float.floatToIntBits(streetViewPanoramaOrientation.f18791a) && Float.floatToIntBits(this.f18792b) == Float.floatToIntBits(streetViewPanoramaOrientation.f18792b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18791a), Float.valueOf(this.f18792b)});
    }

    public String toString() {
        return aa.m4373a(this).m4375a("tilt", Float.valueOf(this.f18791a)).m4375a("bearing", Float.valueOf(this.f18792b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4726a(parcel, 2, this.f18791a);
        dm.m4726a(parcel, 3, this.f18792b);
        dm.m4742b(parcel, i);
    }
}
