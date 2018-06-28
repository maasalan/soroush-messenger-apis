package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class cy extends mn implements cx {
    cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void mo1596a(cv cvVar, zzbde com_google_android_gms_internal_zzbde) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) cvVar);
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzbde);
        m5001a(f_);
    }
}
