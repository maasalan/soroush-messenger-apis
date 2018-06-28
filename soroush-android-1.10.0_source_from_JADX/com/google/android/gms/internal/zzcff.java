package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;

public final class zzcff extends zzbej {
    public static final Creator<zzcff> CREATOR = new et();
    public final String f18517a;
    public final String f18518b;
    public final String f18519c;
    public final String f18520d;
    public final long f18521e;
    public final long f18522f;
    public final String f18523g;
    public final boolean f18524h;
    public final boolean f18525i;
    public final long f18526j;
    public final String f18527k;
    public final long f18528l;
    public final long f18529m;
    public final int f18530n;
    public final boolean f18531o;

    zzcff(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3) {
        ac.m4378a(str);
        this.f18517a = str;
        r0.f18518b = TextUtils.isEmpty(str2) ? null : str2;
        r0.f18519c = str3;
        r0.f18526j = j;
        r0.f18520d = str4;
        r0.f18521e = j2;
        r0.f18522f = j3;
        r0.f18523g = str5;
        r0.f18524h = z;
        r0.f18525i = z2;
        r0.f18527k = str6;
        r0.f18528l = j4;
        r0.f18529m = j5;
        r0.f18530n = i;
        r0.f18531o = z3;
    }

    zzcff(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3) {
        this.f18517a = str;
        this.f18518b = str2;
        this.f18519c = str3;
        this.f18526j = j3;
        this.f18520d = str4;
        this.f18521e = j;
        this.f18522f = j2;
        this.f18523g = str5;
        this.f18524h = z;
        this.f18525i = z2;
        this.f18527k = str6;
        this.f18528l = j4;
        this.f18529m = j5;
        this.f18530n = i;
        this.f18531o = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 2, this.f18517a);
        dm.m4733a(parcel, 3, this.f18518b);
        dm.m4733a(parcel, 4, this.f18519c);
        dm.m4733a(parcel, 5, this.f18520d);
        dm.m4728a(parcel, 6, this.f18521e);
        dm.m4728a(parcel, 7, this.f18522f);
        dm.m4733a(parcel, 8, this.f18523g);
        dm.m4735a(parcel, 9, this.f18524h);
        dm.m4735a(parcel, 10, this.f18525i);
        dm.m4728a(parcel, 11, this.f18526j);
        dm.m4733a(parcel, 12, this.f18527k);
        dm.m4728a(parcel, 13, this.f18528l);
        dm.m4728a(parcel, 14, this.f18529m);
        dm.m4743b(parcel, 15, this.f18530n);
        dm.m4735a(parcel, 16, this.f18531o);
        dm.m4742b(parcel, i);
    }
}
