package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class lu extends mn implements lt {
    lu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void mo1652a(zzcwm com_google_android_gms_internal_zzcwm, lr lrVar) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcwm);
        mp.m5005a(f_, (IInterface) lrVar);
        m5002b(12, f_);
    }
}
