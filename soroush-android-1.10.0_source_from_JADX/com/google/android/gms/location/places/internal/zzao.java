package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Collections;
import java.util.List;

public final class zzao extends zzbej {
    public static final Creator<zzao> CREATOR = new C1849l();
    private int f18653a;
    private int f18654b;
    private int f18655c;
    private int f18656d;
    private int f18657e;
    private int f18658f;
    private List<zzan> f18659g;

    zzao(int i, int i2, int i3, int i4, int i5, int i6, List<zzan> list) {
        this.f18653a = i;
        this.f18654b = i2;
        this.f18655c = i3;
        this.f18656d = i4;
        this.f18657e = i5;
        this.f18658f = i6;
        this.f18659g = Collections.unmodifiableList(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18653a);
        dm.m4743b(parcel, 2, this.f18654b);
        dm.m4743b(parcel, 3, this.f18655c);
        dm.m4743b(parcel, 4, this.f18656d);
        dm.m4743b(parcel, 5, this.f18657e);
        dm.m4743b(parcel, 6, this.f18658f);
        dm.m4745c(parcel, 7, this.f18659g);
        dm.m4742b(parcel, i);
    }
}
