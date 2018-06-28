package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import java.util.List;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;

@Deprecated
public final class zzak extends zzbej {
    public static final Creator<zzak> CREATOR = new C1843d();
    private String f18644a;
    private String f18645b;
    private String f18646c;
    private String f18647d;
    private List<String> f18648e;

    public zzak(String str, String str2, String str3, String str4, List<String> list) {
        this.f18644a = str;
        this.f18645b = str2;
        this.f18646c = str3;
        this.f18647d = str4;
        this.f18648e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak com_google_android_gms_location_places_internal_zzak = (zzak) obj;
        return aa.m4374a(this.f18644a, com_google_android_gms_location_places_internal_zzak.f18644a) && aa.m4374a(this.f18645b, com_google_android_gms_location_places_internal_zzak.f18645b) && aa.m4374a(this.f18646c, com_google_android_gms_location_places_internal_zzak.f18646c) && aa.m4374a(this.f18647d, com_google_android_gms_location_places_internal_zzak.f18647d) && aa.m4374a(this.f18648e, com_google_android_gms_location_places_internal_zzak.f18648e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18644a, this.f18645b, this.f18646c, this.f18647d});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("name", this.f18644a).m4375a(Address.ELEMENT, this.f18645b).m4375a("internationalPhoneNumber", this.f18646c).m4375a("regularOpenHours", this.f18647d).m4375a("attributions", this.f18648e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18644a);
        dm.m4733a(parcel, 2, this.f18645b);
        dm.m4733a(parcel, 3, this.f18646c);
        dm.m4733a(parcel, 4, this.f18647d);
        dm.m4744b(parcel, 5, this.f18648e);
        dm.m4742b(parcel, i);
    }
}
