package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.p162a.C1853e;

public final class StreetViewPanoramaOptions extends zzbej implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaOptions> CREATOR = new C1866g();
    private StreetViewPanoramaCamera f18691a;
    private String f18692b;
    private LatLng f18693c;
    private Integer f18694d;
    private Boolean f18695e = Boolean.valueOf(true);
    private Boolean f18696f = Boolean.valueOf(true);
    private Boolean f18697g = Boolean.valueOf(true);
    private Boolean f18698h = Boolean.valueOf(true);
    private Boolean f18699i;

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f18691a = streetViewPanoramaCamera;
        this.f18693c = latLng;
        this.f18694d = num;
        this.f18692b = str;
        this.f18695e = C1853e.m5192a(b);
        this.f18696f = C1853e.m5192a(b2);
        this.f18697g = C1853e.m5192a(b3);
        this.f18698h = C1853e.m5192a(b4);
        this.f18699i = C1853e.m5192a(b5);
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("PanoramaId", this.f18692b).m4375a("Position", this.f18693c).m4375a("Radius", this.f18694d).m4375a("StreetViewPanoramaCamera", this.f18691a).m4375a("UserNavigationEnabled", this.f18695e).m4375a("ZoomGesturesEnabled", this.f18696f).m4375a("PanningGesturesEnabled", this.f18697g).m4375a("StreetNamesEnabled", this.f18698h).m4375a("UseViewLifecycleInFragment", this.f18699i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18691a, i);
        dm.m4733a(parcel, 3, this.f18692b);
        dm.m4731a(parcel, 4, this.f18693c, i);
        Integer num = this.f18694d;
        if (num != null) {
            dm.m4727a(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        dm.m4724a(parcel, 6, C1853e.m5191a(this.f18695e));
        dm.m4724a(parcel, 7, C1853e.m5191a(this.f18696f));
        dm.m4724a(parcel, 8, C1853e.m5191a(this.f18697g));
        dm.m4724a(parcel, 9, C1853e.m5191a(this.f18698h));
        dm.m4724a(parcel, 10, C1853e.m5191a(this.f18699i));
        dm.m4742b(parcel, a);
    }
}
