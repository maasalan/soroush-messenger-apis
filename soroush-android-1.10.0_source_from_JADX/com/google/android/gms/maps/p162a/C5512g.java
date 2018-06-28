package com.google.android.gms.maps.p162a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mo;

public abstract class C5512g extends mo implements C1854f {
    public C5512g() {
        attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        C1851b c1851b;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c1851b = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            c1851b = queryLocalInterface instanceof C1851b ? (C1851b) queryLocalInterface : new C5516o(readStrongBinder);
        }
        mo3061a(c1851b);
        parcel2.writeNoException();
        return true;
    }
}
