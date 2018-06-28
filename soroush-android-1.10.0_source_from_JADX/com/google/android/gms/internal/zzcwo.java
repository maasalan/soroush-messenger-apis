package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbt;

public final class zzcwo extends zzbej {
    public static final Creator<zzcwo> CREATOR = new lx();
    public final ConnectionResult f18576a;
    public final zzbt f18577b;
    private int f18578c;

    public zzcwo() {
        this(new ConnectionResult(8, null));
    }

    zzcwo(int i, ConnectionResult connectionResult, zzbt com_google_android_gms_common_internal_zzbt) {
        this.f18578c = i;
        this.f18576a = connectionResult;
        this.f18577b = com_google_android_gms_common_internal_zzbt;
    }

    private zzcwo(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18578c);
        dm.m4731a(parcel, 2, this.f18576a, i);
        dm.m4731a(parcel, 3, this.f18577b, i);
        dm.m4742b(parcel, a);
    }
}
