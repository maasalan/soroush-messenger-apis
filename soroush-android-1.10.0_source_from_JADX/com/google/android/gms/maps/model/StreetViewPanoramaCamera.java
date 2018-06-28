package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation.C1868a;
import java.util.Arrays;

public class StreetViewPanoramaCamera extends zzbej implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaCamera> CREATOR = new C1891s();
    public final float f18782a;
    public final float f18783b;
    public final float f18784c;
    private final StreetViewPanoramaOrientation f18785d;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("Tilt needs to be between -90 and 90 inclusive: ");
        stringBuilder.append(f2);
        ac.m4386b(z, stringBuilder.toString());
        if (((double) f) <= 0.0d) {
            f = 0.0f;
        }
        this.f18782a = f;
        this.f18783b = 0.0f + f2;
        this.f18784c = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        C1868a c1868a = new C1868a();
        c1868a.f6319b = f2;
        c1868a.f6318a = f3;
        this.f18785d = new StreetViewPanoramaOrientation(c1868a.f6319b, c1868a.f6318a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f18782a) == Float.floatToIntBits(streetViewPanoramaCamera.f18782a) && Float.floatToIntBits(this.f18783b) == Float.floatToIntBits(streetViewPanoramaCamera.f18783b) && Float.floatToIntBits(this.f18784c) == Float.floatToIntBits(streetViewPanoramaCamera.f18784c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18782a), Float.valueOf(this.f18783b), Float.valueOf(this.f18784c)});
    }

    public String toString() {
        return aa.m4373a(this).m4375a("zoom", Float.valueOf(this.f18782a)).m4375a("tilt", Float.valueOf(this.f18783b)).m4375a("bearing", Float.valueOf(this.f18784c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4726a(parcel, 2, this.f18782a);
        dm.m4726a(parcel, 3, this.f18783b);
        dm.m4726a(parcel, 4, this.f18784c);
        dm.m4742b(parcel, i);
    }
}
