package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import java.util.Arrays;
import java.util.List;

@Deprecated
public final class zzcew extends zzbej {
    public static final Creator<zzcew> CREATOR = new en();
    private final String f18514a;
    private final String f18515b;
    private final List<zzceu> f18516c;

    zzcew(String str, String str2, List<zzceu> list) {
        this.f18514a = str;
        this.f18515b = str2;
        this.f18516c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcew)) {
            return false;
        }
        zzcew com_google_android_gms_internal_zzcew = (zzcew) obj;
        return this.f18514a.equals(com_google_android_gms_internal_zzcew.f18514a) && this.f18515b.equals(com_google_android_gms_internal_zzcew.f18515b) && this.f18516c.equals(com_google_android_gms_internal_zzcew.f18516c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18514a, this.f18515b, this.f18516c});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("accountName", this.f18514a).m4375a("placeId", this.f18515b).m4375a("placeAliases", this.f18516c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18514a);
        dm.m4733a(parcel, 2, this.f18515b);
        dm.m4745c(parcel, 6, this.f18516c);
        dm.m4742b(parcel, i);
    }
}
