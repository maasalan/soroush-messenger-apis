package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.p158a.C1644a.C5425a;

public final class GroundOverlayOptions extends zzbej {
    public static final Creator<GroundOverlayOptions> CREATOR = new C1882j();
    private C1873a f18722a;
    private LatLng f18723b;
    private float f18724c;
    private float f18725d;
    private LatLngBounds f18726e;
    private float f18727f;
    private float f18728g;
    private boolean f18729h = true;
    private float f18730i = 0.0f;
    private float f18731j = 0.5f;
    private float f18732k = 0.5f;
    private boolean f18733l = false;

    GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f18722a = new C1873a(C5425a.m11702a(iBinder));
        this.f18723b = latLng;
        this.f18724c = f;
        this.f18725d = f2;
        this.f18726e = latLngBounds;
        this.f18727f = f3;
        this.f18728g = f4;
        this.f18729h = z;
        this.f18730i = f5;
        this.f18731j = f6;
        this.f18732k = f7;
        this.f18733l = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4730a(parcel, 2, this.f18722a.f6320a.asBinder());
        dm.m4731a(parcel, 3, this.f18723b, i);
        dm.m4726a(parcel, 4, this.f18724c);
        dm.m4726a(parcel, 5, this.f18725d);
        dm.m4731a(parcel, 6, this.f18726e, i);
        dm.m4726a(parcel, 7, this.f18727f);
        dm.m4726a(parcel, 8, this.f18728g);
        dm.m4735a(parcel, 9, this.f18729h);
        dm.m4726a(parcel, 10, this.f18730i);
        dm.m4726a(parcel, 11, this.f18731j);
        dm.m4726a(parcel, 12, this.f18732k);
        dm.m4735a(parcel, 13, this.f18733l);
        dm.m4742b(parcel, a);
    }
}
