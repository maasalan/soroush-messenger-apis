package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbfe extends zzbej {
    public static final Creator<zzbfe> CREATOR = new dn();
    final zzbfg f18474a;
    private int f18475b;

    zzbfe(int i, zzbfg com_google_android_gms_internal_zzbfg) {
        this.f18475b = i;
        this.f18474a = com_google_android_gms_internal_zzbfg;
    }

    private zzbfe(zzbfg com_google_android_gms_internal_zzbfg) {
        this.f18475b = 1;
        this.f18474a = com_google_android_gms_internal_zzbfg;
    }

    public static zzbfe m16819a(dr<?, ?> drVar) {
        if (drVar instanceof zzbfg) {
            return new zzbfe((zzbfg) drVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18475b);
        dm.m4731a(parcel, 2, this.f18474a, i);
        dm.m4742b(parcel, a);
    }
}
