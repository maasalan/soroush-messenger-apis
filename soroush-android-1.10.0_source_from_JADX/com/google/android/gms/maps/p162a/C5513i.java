package com.google.android.gms.maps.p162a;

import android.os.Parcel;
import com.google.android.gms.internal.mo;
import com.google.android.gms.internal.mp;
import com.google.android.gms.maps.model.p163a.C5524j;

public abstract class C5513i extends mo implements C1855h {
    public C5513i() {
        attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        boolean a = mo3062a(C5524j.m12076a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        mp.m5007a(parcel2, a);
        return true;
    }
}
