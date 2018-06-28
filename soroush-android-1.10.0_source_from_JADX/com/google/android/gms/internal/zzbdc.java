package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzbdc extends zzbej {
    public static final Creator<zzbdc> CREATOR = new cn();
    private boolean f18452a;
    private long f18453b;

    public zzbdc(boolean z, long j) {
        this.f18452a = z;
        this.f18453b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbdc) {
            zzbdc com_google_android_gms_internal_zzbdc = (zzbdc) obj;
            return this.f18452a == com_google_android_gms_internal_zzbdc.f18452a && this.f18453b == com_google_android_gms_internal_zzbdc.f18453b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18452a), Long.valueOf(this.f18453b)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        stringBuilder.append(this.f18452a);
        stringBuilder.append(",collectForDebugExpiryTimeMillis: ");
        stringBuilder.append(this.f18453b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4735a(parcel, 1, this.f18452a);
        dm.m4728a(parcel, 2, this.f18453b);
        dm.m4742b(parcel, i);
    }
}
