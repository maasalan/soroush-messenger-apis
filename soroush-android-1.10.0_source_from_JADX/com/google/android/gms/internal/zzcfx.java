package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ac;

public final class zzcfx extends zzbej {
    public static final Creator<zzcfx> CREATOR = new fi();
    public final String f18545a;
    public final zzcfu f18546b;
    public final String f18547c;
    public final long f18548d;

    zzcfx(zzcfx com_google_android_gms_internal_zzcfx, long j) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcfx);
        this.f18545a = com_google_android_gms_internal_zzcfx.f18545a;
        this.f18546b = com_google_android_gms_internal_zzcfx.f18546b;
        this.f18547c = com_google_android_gms_internal_zzcfx.f18547c;
        this.f18548d = j;
    }

    public zzcfx(String str, zzcfu com_google_android_gms_internal_zzcfu, String str2, long j) {
        this.f18545a = str;
        this.f18546b = com_google_android_gms_internal_zzcfu;
        this.f18547c = str2;
        this.f18548d = j;
    }

    public final String toString() {
        String str = this.f18547c;
        String str2 = this.f18545a;
        String valueOf = String.valueOf(this.f18546b);
        StringBuilder stringBuilder = new StringBuilder(((21 + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("origin=");
        stringBuilder.append(str);
        stringBuilder.append(",name=");
        stringBuilder.append(str2);
        stringBuilder.append(",params=");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 2, this.f18545a);
        dm.m4731a(parcel, 3, this.f18546b, i);
        dm.m4733a(parcel, 4, this.f18547c);
        dm.m4728a(parcel, 5, this.f18548d);
        dm.m4742b(parcel, a);
    }
}
