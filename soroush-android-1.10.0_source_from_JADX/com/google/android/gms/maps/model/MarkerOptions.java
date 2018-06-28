package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.p158a.C1644a.C5425a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class MarkerOptions extends zzbej {
    public static final Creator<MarkerOptions> CREATOR = new C1886n();
    public String f18740a;
    public C1873a f18741b;
    private LatLng f18742c;
    private String f18743d;
    private float f18744e = 0.5f;
    private float f18745f = BallPulseIndicator.SCALE;
    private boolean f18746g;
    private boolean f18747h = true;
    private boolean f18748i = false;
    private float f18749j = 0.0f;
    private float f18750k = 0.5f;
    private float f18751l = 0.0f;
    private float f18752m = BallPulseIndicator.SCALE;
    private float f18753n;

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f18742c = latLng;
        this.f18740a = str;
        this.f18743d = str2;
        if (iBinder == null) {
            r0.f18741b = null;
        } else {
            r0.f18741b = new C1873a(C5425a.m11702a(iBinder));
        }
        r0.f18744e = f;
        r0.f18745f = f2;
        r0.f18746g = z;
        r0.f18747h = z2;
        r0.f18748i = z3;
        r0.f18749j = f3;
        r0.f18750k = f4;
        r0.f18751l = f5;
        r0.f18752m = f6;
        r0.f18753n = f7;
    }

    public final MarkerOptions m16883a(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f18742c = latLng;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18742c, i);
        dm.m4733a(parcel, 3, this.f18740a);
        dm.m4733a(parcel, 4, this.f18743d);
        dm.m4730a(parcel, 5, this.f18741b == null ? null : this.f18741b.f6320a.asBinder());
        dm.m4726a(parcel, 6, this.f18744e);
        dm.m4726a(parcel, 7, this.f18745f);
        dm.m4735a(parcel, 8, this.f18746g);
        dm.m4735a(parcel, 9, this.f18747h);
        dm.m4735a(parcel, 10, this.f18748i);
        dm.m4726a(parcel, 11, this.f18749j);
        dm.m4726a(parcel, 12, this.f18750k);
        dm.m4726a(parcel, 13, this.f18751l);
        dm.m4726a(parcel, 14, this.f18752m);
        dm.m4726a(parcel, 15, this.f18753n);
        dm.m4742b(parcel, a);
    }
}
