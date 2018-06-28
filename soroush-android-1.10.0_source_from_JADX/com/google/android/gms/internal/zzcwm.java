package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzbr;

public final class zzcwm extends zzbej {
    public static final Creator<zzcwm> CREATOR = new lw();
    private int f18574a;
    private zzbr f18575b;

    zzcwm(int i, zzbr com_google_android_gms_common_internal_zzbr) {
        this.f18574a = i;
        this.f18575b = com_google_android_gms_common_internal_zzbr;
    }

    public zzcwm(zzbr com_google_android_gms_common_internal_zzbr) {
        this(1, com_google_android_gms_common_internal_zzbr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18574a);
        dm.m4731a(parcel, 2, this.f18575b, i);
        dm.m4742b(parcel, a);
    }
}
