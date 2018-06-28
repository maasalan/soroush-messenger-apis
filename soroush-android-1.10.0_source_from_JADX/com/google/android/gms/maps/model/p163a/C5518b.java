package com.google.android.gms.maps.model.p163a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mo;
import com.google.android.gms.internal.mp;

public abstract class C5518b extends mo implements C1872l {
    public static C1872l m12068a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof C1872l ? (C1872l) queryLocalInterface : new C5519c(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable a = mo1697a(parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        mp.m5009b(parcel2, a);
        return true;
    }
}
