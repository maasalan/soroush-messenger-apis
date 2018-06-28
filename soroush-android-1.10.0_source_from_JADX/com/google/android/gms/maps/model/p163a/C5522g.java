package com.google.android.gms.maps.model.p163a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mo;

public abstract class C5522g extends mo implements C1870f {
    public static C1870f m12073a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof C1870f ? (C1870f) queryLocalInterface : new C5523h(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
