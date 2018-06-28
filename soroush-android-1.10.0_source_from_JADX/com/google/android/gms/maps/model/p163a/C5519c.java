package com.google.android.gms.maps.model.p163a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.maps.model.Tile;

public final class C5519c extends mn implements C1872l {
    C5519c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public final Tile mo1697a(int i, int i2, int i3) {
        Parcel f_ = f_();
        f_.writeInt(i);
        f_.writeInt(i2);
        f_.writeInt(i3);
        Parcel a = m5000a(1, f_);
        Tile tile = (Tile) mp.m5004a(a, Tile.CREATOR);
        a.recycle();
        return tile;
    }
}
