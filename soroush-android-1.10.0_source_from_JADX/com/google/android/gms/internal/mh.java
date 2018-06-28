package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p158a.C1644a;

public final class mh extends mn implements mg {
    mh(IBinder iBinder) {
        super(iBinder, "com.google.firebase.crash.internal.IFirebaseCrashApi");
    }

    public final void mo1656a(C1644a c1644a) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        m5002b(4, f_);
    }

    public final void mo1657a(C1644a c1644a, zzdxr com_google_android_gms_internal_zzdxr) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzdxr);
        m5002b(1, f_);
    }

    public final void mo1658a(String str) {
        Parcel f_ = f_();
        f_.writeString(str);
        m5002b(6, f_);
    }

    public final void mo1659a(String str, long j, Bundle bundle) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeLong(j);
        mp.m5006a(f_, (Parcelable) bundle);
        m5002b(7, f_);
    }

    public final boolean mo1660a() {
        Parcel a = m5000a(9, f_());
        boolean a2 = mp.m5008a(a);
        a.recycle();
        return a2;
    }

    public final void mo1661b(C1644a c1644a) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        m5002b(5, f_);
    }
}
