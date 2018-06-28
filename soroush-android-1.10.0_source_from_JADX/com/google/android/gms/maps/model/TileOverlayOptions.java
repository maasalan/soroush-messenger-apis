package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.maps.model.p163a.C1872l;
import com.google.android.gms.maps.model.p163a.C5518b;

public final class TileOverlayOptions extends zzbej {
    public static final Creator<TileOverlayOptions> CREATOR = new C1896y();
    private C1872l f18796a;
    private C1878f f18797b;
    private boolean f18798c = true;
    private float f18799d;
    private boolean f18800e = true;
    private float f18801f = 0.0f;

    TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.f18796a = C5518b.m12068a(iBinder);
        this.f18797b = this.f18796a == null ? null : new C5526x(this);
        this.f18798c = z;
        this.f18799d = f;
        this.f18800e = z2;
        this.f18801f = f2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4730a(parcel, 2, this.f18796a.asBinder());
        dm.m4735a(parcel, 3, this.f18798c);
        dm.m4726a(parcel, 4, this.f18799d);
        dm.m4735a(parcel, 5, this.f18800e);
        dm.m4726a(parcel, 6, this.f18801f);
        dm.m4742b(parcel, i);
    }
}
