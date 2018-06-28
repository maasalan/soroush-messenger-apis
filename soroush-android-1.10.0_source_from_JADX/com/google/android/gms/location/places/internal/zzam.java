package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Collections;
import java.util.List;

public final class zzam extends zzbej {
    public static final Creator<zzam> CREATOR = new C1844e();
    private List<zzan> f18649a;
    private List<zzao> f18650b;

    zzam(List<zzan> list, List<zzao> list2) {
        this.f18649a = Collections.unmodifiableList(list);
        this.f18650b = Collections.unmodifiableList(list2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4745c(parcel, 1, this.f18649a);
        dm.m4745c(parcel, 2, this.f18650b);
        dm.m4742b(parcel, i);
    }
}
