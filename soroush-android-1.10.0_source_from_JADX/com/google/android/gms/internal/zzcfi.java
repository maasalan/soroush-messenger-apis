package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ac;

public final class zzcfi extends zzbej {
    public static final Creator<zzcfi> CREATOR = new ev();
    public String f18532a;
    public String f18533b;
    public zzckk f18534c;
    public long f18535d;
    public boolean f18536e;
    public String f18537f;
    public zzcfx f18538g;
    public long f18539h;
    public zzcfx f18540i;
    public long f18541j;
    public zzcfx f18542k;
    private int f18543l;

    zzcfi(int i, String str, String str2, zzckk com_google_android_gms_internal_zzckk, long j, boolean z, String str3, zzcfx com_google_android_gms_internal_zzcfx, long j2, zzcfx com_google_android_gms_internal_zzcfx2, long j3, zzcfx com_google_android_gms_internal_zzcfx3) {
        this.f18543l = i;
        this.f18532a = str;
        this.f18533b = str2;
        this.f18534c = com_google_android_gms_internal_zzckk;
        this.f18535d = j;
        this.f18536e = z;
        this.f18537f = str3;
        this.f18538g = com_google_android_gms_internal_zzcfx;
        this.f18539h = j2;
        this.f18540i = com_google_android_gms_internal_zzcfx2;
        this.f18541j = j3;
        this.f18542k = com_google_android_gms_internal_zzcfx3;
    }

    zzcfi(zzcfi com_google_android_gms_internal_zzcfi) {
        this.f18543l = 1;
        ac.m4376a((Object) com_google_android_gms_internal_zzcfi);
        this.f18532a = com_google_android_gms_internal_zzcfi.f18532a;
        this.f18533b = com_google_android_gms_internal_zzcfi.f18533b;
        this.f18534c = com_google_android_gms_internal_zzcfi.f18534c;
        this.f18535d = com_google_android_gms_internal_zzcfi.f18535d;
        this.f18536e = com_google_android_gms_internal_zzcfi.f18536e;
        this.f18537f = com_google_android_gms_internal_zzcfi.f18537f;
        this.f18538g = com_google_android_gms_internal_zzcfi.f18538g;
        this.f18539h = com_google_android_gms_internal_zzcfi.f18539h;
        this.f18540i = com_google_android_gms_internal_zzcfi.f18540i;
        this.f18541j = com_google_android_gms_internal_zzcfi.f18541j;
        this.f18542k = com_google_android_gms_internal_zzcfi.f18542k;
    }

    zzcfi(String str, String str2, zzckk com_google_android_gms_internal_zzckk, long j, boolean z, String str3, zzcfx com_google_android_gms_internal_zzcfx, long j2, zzcfx com_google_android_gms_internal_zzcfx2, long j3, zzcfx com_google_android_gms_internal_zzcfx3) {
        this.f18543l = 1;
        this.f18532a = str;
        this.f18533b = str2;
        this.f18534c = com_google_android_gms_internal_zzckk;
        this.f18535d = j;
        this.f18536e = z;
        this.f18537f = str3;
        this.f18538g = com_google_android_gms_internal_zzcfx;
        this.f18539h = j2;
        this.f18540i = com_google_android_gms_internal_zzcfx2;
        this.f18541j = j3;
        this.f18542k = com_google_android_gms_internal_zzcfx3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18543l);
        dm.m4733a(parcel, 2, this.f18532a);
        dm.m4733a(parcel, 3, this.f18533b);
        dm.m4731a(parcel, 4, this.f18534c, i);
        dm.m4728a(parcel, 5, this.f18535d);
        dm.m4735a(parcel, 6, this.f18536e);
        dm.m4733a(parcel, 7, this.f18537f);
        dm.m4731a(parcel, 8, this.f18538g, i);
        dm.m4728a(parcel, 9, this.f18539h);
        dm.m4731a(parcel, 10, this.f18540i, i);
        dm.m4728a(parcel, 11, this.f18541j);
        dm.m4731a(parcel, 12, this.f18542k, i);
        dm.m4742b(parcel, a);
    }
}
