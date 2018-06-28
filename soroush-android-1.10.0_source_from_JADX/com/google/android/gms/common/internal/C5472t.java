package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.mo;
import com.google.android.gms.internal.mp;

public abstract class C5472t extends mo implements C1766s {
    public C5472t() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo3019a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) mp.m5004a(parcel, Bundle.CREATOR));
                break;
            case 2:
                parcel.readInt();
                mp.m5004a(parcel, Bundle.CREATOR);
                mo3018a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
