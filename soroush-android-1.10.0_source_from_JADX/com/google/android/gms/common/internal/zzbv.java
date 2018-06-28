package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class zzbv extends zzbej {
    public static final Creator<zzbv> CREATOR = new af();
    private int f18046a;
    private final int f18047b;
    private final int f18048c;
    @Deprecated
    private final Scope[] f18049d;

    zzbv(int i, int i2, int i3, Scope[] scopeArr) {
        this.f18046a = i;
        this.f18047b = i2;
        this.f18048c = i3;
        this.f18049d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18046a);
        dm.m4743b(parcel, 2, this.f18047b);
        dm.m4743b(parcel, 3, this.f18048c);
        dm.m4738a(parcel, 4, this.f18049d, i);
        dm.m4742b(parcel, a);
    }
}
