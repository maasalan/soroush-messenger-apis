package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import java.util.Arrays;

@Deprecated
public final class zzceu extends zzbej {
    public static final Creator<zzceu> CREATOR = new em();
    private static zzceu f18511a = new zzceu("Home");
    private static zzceu f18512b = new zzceu("Work");
    private final String f18513c;

    zzceu(String str) {
        this.f18513c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzceu)) {
            return false;
        }
        return aa.m4374a(this.f18513c, ((zzceu) obj).f18513c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18513c});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("alias", this.f18513c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18513c);
        dm.m4742b(parcel, i);
    }
}
