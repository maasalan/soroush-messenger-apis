package com.google.android.gms.maps.p162a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C1644a.C5425a;

public final class C5517p extends mn implements C1852c {
    C5517p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    public final C1644a mo1685a(C1644a c1644a, C1644a c1644a2, Bundle bundle) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        mp.m5005a(f_, (IInterface) c1644a2);
        mp.m5006a(f_, (Parcelable) bundle);
        Parcel a = m5000a(4, f_);
        c1644a2 = C5425a.m11702a(a.readStrongBinder());
        a.recycle();
        return c1644a2;
    }

    public final void mo1686a() {
        m5002b(5, f_());
    }

    public final void mo1687a(Bundle bundle) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) bundle);
        m5002b(3, f_);
    }

    public final void mo1688a(C1644a c1644a, GoogleMapOptions googleMapOptions, Bundle bundle) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        mp.m5006a(f_, (Parcelable) googleMapOptions);
        mp.m5006a(f_, (Parcelable) bundle);
        m5002b(2, f_);
    }

    public final void mo1689a(C1854f c1854f) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1854f);
        m5002b(12, f_);
    }

    public final void mo1690b() {
        m5002b(6, f_());
    }

    public final void mo1691b(Bundle bundle) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) bundle);
        f_ = m5000a(10, f_);
        if (f_.readInt() != 0) {
            bundle.readFromParcel(f_);
        }
        f_.recycle();
    }

    public final void mo1692c() {
        m5002b(7, f_());
    }

    public final void mo1693d() {
        m5002b(8, f_());
    }

    public final void mo1694e() {
        m5002b(9, f_());
    }

    public final void mo1695f() {
        m5002b(15, f_());
    }

    public final void mo1696g() {
        m5002b(16, f_());
    }
}
