package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.List;

public final class CircleOptions extends zzbej {
    public static final Creator<CircleOptions> CREATOR = new C1881i();
    public LatLng f18713a = null;
    public int f18714b = -16777216;
    public int f18715c = 0;
    private double f18716d = 0.0d;
    private float f18717e = 10.0f;
    private float f18718f = 0.0f;
    private boolean f18719g = true;
    private boolean f18720h = false;
    private List<PatternItem> f18721i = null;

    CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List<PatternItem> list) {
        this.f18713a = latLng;
        this.f18716d = d;
        this.f18717e = f;
        this.f18714b = i;
        this.f18715c = i2;
        this.f18718f = f2;
        this.f18719g = z;
        this.f18720h = z2;
        this.f18721i = list;
    }

    public final CircleOptions m16881a() {
        this.f18716d = 80.0d;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18713a, i);
        dm.m4725a(parcel, 3, this.f18716d);
        dm.m4726a(parcel, 4, this.f18717e);
        dm.m4743b(parcel, 5, this.f18714b);
        dm.m4743b(parcel, 6, this.f18715c);
        dm.m4726a(parcel, 7, this.f18718f);
        dm.m4735a(parcel, 8, this.f18719g);
        dm.m4735a(parcel, 9, this.f18720h);
        dm.m4745c(parcel, 10, this.f18721i);
        dm.m4742b(parcel, a);
    }
}
