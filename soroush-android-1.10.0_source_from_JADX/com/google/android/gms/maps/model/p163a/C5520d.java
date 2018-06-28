package com.google.android.gms.maps.model.p163a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mo;

public abstract class C5520d extends mo implements C1869a {
    public static C1869a m12070a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof C1869a ? (C1869a) queryLocalInterface : new C5521e(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
