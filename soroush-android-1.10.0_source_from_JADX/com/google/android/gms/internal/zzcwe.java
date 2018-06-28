package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.Status;

public final class zzcwe extends zzbej implements C1720i {
    public static final Creator<zzcwe> CREATOR = new lp();
    private int f18571a;
    private int f18572b;
    private Intent f18573c;

    public zzcwe() {
        this((byte) 0);
    }

    private zzcwe(byte b) {
        this(2, 0, null);
    }

    zzcwe(int i, int i2, Intent intent) {
        this.f18571a = i;
        this.f18572b = i2;
        this.f18573c = intent;
    }

    public final Status mo3007a() {
        return this.f18572b == 0 ? Status.f17975a : Status.f17979e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18571a);
        dm.m4743b(parcel, 2, this.f18572b);
        dm.m4731a(parcel, 3, this.f18573c, i);
        dm.m4742b(parcel, a);
    }
}
