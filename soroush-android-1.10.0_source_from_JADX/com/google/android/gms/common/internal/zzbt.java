package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class zzbt extends zzbej {
    public static final Creator<zzbt> CREATOR = new ae();
    public ConnectionResult f18041a;
    private int f18042b;
    private IBinder f18043c;
    private boolean f18044d;
    private boolean f18045e;

    zzbt(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f18042b = i;
        this.f18043c = iBinder;
        this.f18041a = connectionResult;
        this.f18044d = z;
        this.f18045e = z2;
    }

    public final C1763l m15918a() {
        IBinder iBinder = this.f18043c;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof C1763l ? (C1763l) queryLocalInterface : new C5469n(iBinder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbt)) {
            return false;
        }
        zzbt com_google_android_gms_common_internal_zzbt = (zzbt) obj;
        return this.f18041a.equals(com_google_android_gms_common_internal_zzbt.f18041a) && m15918a().equals(com_google_android_gms_common_internal_zzbt.m15918a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18042b);
        dm.m4730a(parcel, 2, this.f18043c);
        dm.m4731a(parcel, 3, this.f18041a, i);
        dm.m4735a(parcel, 4, this.f18044d);
        dm.m4735a(parcel, 5, this.f18045e);
        dm.m4742b(parcel, a);
    }
}
