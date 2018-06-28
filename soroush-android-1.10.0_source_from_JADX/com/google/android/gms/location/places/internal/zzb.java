package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

public final class zzb extends zzbej {
    public static final Creator<zzb> CREATOR = new C1846i();
    final int f18667a;
    final int f18668b;

    public zzb(int i, int i2) {
        this.f18667a = i;
        this.f18668b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb com_google_android_gms_location_places_internal_zzb = (zzb) obj;
        return aa.m4374a(Integer.valueOf(this.f18667a), Integer.valueOf(com_google_android_gms_location_places_internal_zzb.f18667a)) && aa.m4374a(Integer.valueOf(this.f18668b), Integer.valueOf(com_google_android_gms_location_places_internal_zzb.f18668b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18667a), Integer.valueOf(this.f18668b)});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a(OnNativeInvokeListener.ARG_OFFSET, Integer.valueOf(this.f18667a)).m4375a("length", Integer.valueOf(this.f18668b)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18667a);
        dm.m4743b(parcel, 2, this.f18668b);
        dm.m4742b(parcel, i);
    }
}
