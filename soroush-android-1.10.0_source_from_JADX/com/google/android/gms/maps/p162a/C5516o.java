package com.google.android.gms.maps.p162a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.p163a.C1870f;
import com.google.android.gms.maps.model.p163a.C1871i;
import com.google.android.gms.maps.model.p163a.C5522g;
import com.google.android.gms.maps.model.p163a.C5524j;
import com.google.android.gms.p158a.C1644a;

public final class C5516o extends mn implements C1851b {
    C5516o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final C1870f mo1680a(CircleOptions circleOptions) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) circleOptions);
        Parcel a = m5000a(35, f_);
        C1870f a2 = C5522g.m12073a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C1871i mo1681a(MarkerOptions markerOptions) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) markerOptions);
        Parcel a = m5000a(11, f_);
        C1871i a2 = C5524j.m12076a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void mo1682a() {
        Parcel f_ = f_();
        mp.m5007a(f_, true);
        m5002b(22, f_);
    }

    public final void mo1683a(C1644a c1644a) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        m5002b(4, f_);
    }

    public final void mo1684a(C1855h c1855h) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1855h);
        m5002b(30, f_);
    }
}
