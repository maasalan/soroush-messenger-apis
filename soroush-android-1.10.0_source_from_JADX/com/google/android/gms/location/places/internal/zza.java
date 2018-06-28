package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zza extends zzbej {
    public static final Creator<zza> CREATOR = new C1847j();
    private static final List<zzb> f18627a = Collections.emptyList();
    private String f18628b;
    private String f18629c;
    private List<Integer> f18630d;
    private List<zzb> f18631e;
    private int f18632f;
    private String f18633g;
    private List<zzb> f18634h;
    private String f18635i;
    private List<zzb> f18636j;

    zza(String str, List<Integer> list, int i, String str2, List<zzb> list2, String str3, List<zzb> list3, String str4, List<zzb> list4) {
        this.f18629c = str;
        this.f18630d = list;
        this.f18632f = i;
        this.f18628b = str2;
        this.f18631e = list2;
        this.f18633g = str3;
        this.f18634h = list3;
        this.f18635i = str4;
        this.f18636j = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza com_google_android_gms_location_places_internal_zza = (zza) obj;
        return aa.m4374a(this.f18629c, com_google_android_gms_location_places_internal_zza.f18629c) && aa.m4374a(this.f18630d, com_google_android_gms_location_places_internal_zza.f18630d) && aa.m4374a(Integer.valueOf(this.f18632f), Integer.valueOf(com_google_android_gms_location_places_internal_zza.f18632f)) && aa.m4374a(this.f18628b, com_google_android_gms_location_places_internal_zza.f18628b) && aa.m4374a(this.f18631e, com_google_android_gms_location_places_internal_zza.f18631e) && aa.m4374a(this.f18633g, com_google_android_gms_location_places_internal_zza.f18633g) && aa.m4374a(this.f18634h, com_google_android_gms_location_places_internal_zza.f18634h) && aa.m4374a(this.f18635i, com_google_android_gms_location_places_internal_zza.f18635i) && aa.m4374a(this.f18636j, com_google_android_gms_location_places_internal_zza.f18636j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18629c, this.f18630d, Integer.valueOf(this.f18632f), this.f18628b, this.f18631e, this.f18633g, this.f18634h, this.f18635i, this.f18636j});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("placeId", this.f18629c).m4375a("placeTypes", this.f18630d).m4375a("fullText", this.f18628b).m4375a("fullTextMatchedSubstrings", this.f18631e).m4375a("primaryText", this.f18633g).m4375a("primaryTextMatchedSubstrings", this.f18634h).m4375a("secondaryText", this.f18635i).m4375a("secondaryTextMatchedSubstrings", this.f18636j).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18628b);
        dm.m4733a(parcel, 2, this.f18629c);
        dm.m4734a(parcel, 3, this.f18630d);
        dm.m4745c(parcel, 4, this.f18631e);
        dm.m4743b(parcel, 5, this.f18632f);
        dm.m4733a(parcel, 6, this.f18633g);
        dm.m4745c(parcel, 7, this.f18634h);
        dm.m4733a(parcel, 8, this.f18635i);
        dm.m4745c(parcel, 9, this.f18636j);
        dm.m4742b(parcel, i);
    }
}
