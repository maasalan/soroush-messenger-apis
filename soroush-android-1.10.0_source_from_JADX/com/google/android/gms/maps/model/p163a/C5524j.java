package com.google.android.gms.maps.model.p163a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mo;

public abstract class C5524j extends mo implements C1871i {
    public static C1871i m12076a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof C1871i ? (C1871i) queryLocalInterface : new C5525k(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
