package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import java.util.Locale;

public final class zzat extends zzbej {
    public static final Creator<zzat> CREATOR = new C1845g();
    private static zzat f18660a = new zzat("com.google.android.gms", Locale.getDefault());
    private String f18661b;
    private String f18662c;
    private String f18663d;
    private String f18664e;
    private int f18665f;
    private int f18666g;

    public zzat(String str, String str2, String str3, String str4, int i, int i2) {
        this.f18661b = str;
        this.f18662c = str2;
        this.f18663d = str3;
        this.f18664e = str4;
        this.f18665f = i;
        this.f18666g = i2;
    }

    private zzat(String str, Locale locale) {
        this(str, locale.toString(), null, null, C5458b.f15143a, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzat)) {
            return false;
        }
        zzat com_google_android_gms_location_places_internal_zzat = (zzat) obj;
        return this.f18665f == com_google_android_gms_location_places_internal_zzat.f18665f && this.f18666g == com_google_android_gms_location_places_internal_zzat.f18666g && this.f18662c.equals(com_google_android_gms_location_places_internal_zzat.f18662c) && this.f18661b.equals(com_google_android_gms_location_places_internal_zzat.f18661b) && aa.m4374a(this.f18663d, com_google_android_gms_location_places_internal_zzat.f18663d) && aa.m4374a(this.f18664e, com_google_android_gms_location_places_internal_zzat.f18664e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18661b, this.f18662c, this.f18663d, this.f18664e, Integer.valueOf(this.f18665f), Integer.valueOf(this.f18666g)});
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return aa.m4373a(this).m4375a("clientPackageName", this.f18661b).m4375a("locale", this.f18662c).m4375a("accountName", this.f18663d).m4375a("gCoreClientName", this.f18664e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18661b);
        dm.m4733a(parcel, 2, this.f18662c);
        dm.m4733a(parcel, 3, this.f18663d);
        dm.m4733a(parcel, 4, this.f18664e);
        dm.m4743b(parcel, 6, this.f18665f);
        dm.m4743b(parcel, 7, this.f18666g);
        dm.m4742b(parcel, i);
    }
}
