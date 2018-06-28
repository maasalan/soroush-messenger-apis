package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class zzn extends zzbej {
    public static final Creator<zzn> CREATOR = new C1686a();
    public int f17964a;
    private int f17965b;
    private Bundle f17966c;

    zzn(int i, int i2, Bundle bundle) {
        this.f17965b = i;
        this.f17964a = i2;
        this.f17966c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f17965b);
        dm.m4743b(parcel, 2, this.f17964a);
        dm.m4729a(parcel, 3, this.f17966c);
        dm.m4742b(parcel, i);
    }
}
