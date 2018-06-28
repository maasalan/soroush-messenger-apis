package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class zzc extends zzbej {
    public static final Creator<zzc> CREATOR = new C1770j();
    private String f18060a;
    private int f18061b;

    public zzc(String str, int i) {
        this.f18060a = str;
        this.f18061b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18060a);
        dm.m4743b(parcel, 2, this.f18061b);
        dm.m4742b(parcel, i);
    }
}
