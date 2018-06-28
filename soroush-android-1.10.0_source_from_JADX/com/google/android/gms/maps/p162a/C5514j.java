package com.google.android.gms.maps.p162a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C1644a.C5425a;

public final class C5514j extends mn implements C1850a {
    C5514j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final C1644a mo1675a(LatLng latLng, float f) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) latLng);
        f_.writeFloat(f);
        Parcel a = m5000a(9, f_);
        C1644a a2 = C5425a.m11702a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
