package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions extends zzbej {
    public static final Creator<PolylineOptions> CREATOR = new C1890r();
    private final List<LatLng> f18771a;
    private float f18772b;
    private int f18773c;
    private float f18774d;
    private boolean f18775e;
    private boolean f18776f;
    private boolean f18777g;
    private Cap f18778h;
    private Cap f18779i;
    private int f18780j;
    private List<PatternItem> f18781k;

    public PolylineOptions() {
        this.f18772b = 10.0f;
        this.f18773c = -16777216;
        this.f18774d = 0.0f;
        this.f18775e = true;
        this.f18776f = false;
        this.f18777g = false;
        this.f18778h = new ButtCap();
        this.f18779i = new ButtCap();
        this.f18780j = 0;
        this.f18781k = null;
        this.f18771a = new ArrayList();
    }

    PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List<PatternItem> list2) {
        this.f18772b = 10.0f;
        this.f18773c = -16777216;
        this.f18774d = 0.0f;
        this.f18775e = true;
        this.f18776f = false;
        this.f18777g = false;
        this.f18778h = new ButtCap();
        this.f18779i = new ButtCap();
        this.f18780j = 0;
        this.f18781k = null;
        this.f18771a = list;
        this.f18772b = f;
        this.f18773c = i;
        this.f18774d = f2;
        this.f18775e = z;
        this.f18776f = z2;
        this.f18777g = z3;
        if (cap != null) {
            this.f18778h = cap;
        }
        if (cap2 != null) {
            this.f18779i = cap2;
        }
        this.f18780j = i2;
        this.f18781k = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4745c(parcel, 2, this.f18771a);
        dm.m4726a(parcel, 3, this.f18772b);
        dm.m4743b(parcel, 4, this.f18773c);
        dm.m4726a(parcel, 5, this.f18774d);
        dm.m4735a(parcel, 6, this.f18775e);
        dm.m4735a(parcel, 7, this.f18776f);
        dm.m4735a(parcel, 8, this.f18777g);
        dm.m4731a(parcel, 9, this.f18778h, i);
        dm.m4731a(parcel, 10, this.f18779i, i);
        dm.m4743b(parcel, 11, this.f18780j);
        dm.m4745c(parcel, 12, this.f18781k);
        dm.m4742b(parcel, a);
    }
}
