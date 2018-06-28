package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mo;
import com.google.android.gms.internal.mp;

public abstract class C5470q extends mo implements C1765p {
    public C5470q() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    public static C1765p m11820a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C1765p ? (C1765p) queryLocalInterface : new C5471r(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface a = mo1571a();
                parcel2.writeNoException();
                mp.m5005a(parcel2, a);
                return true;
            case 2:
                i = mo1572b();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            default:
                return false;
        }
    }
}
