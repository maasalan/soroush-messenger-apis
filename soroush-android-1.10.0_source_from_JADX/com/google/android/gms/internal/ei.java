package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p158a.C1644a.C5425a;

public abstract class ei extends mo implements eh {
    public ei() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    public static eh asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof eh ? (eh) queryLocalInterface : new ej(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                init(C5425a.m11702a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), mp.m5008a(parcel), parcel.readInt());
                parcel2.writeNoException();
                mp.m5007a(parcel2, booleanFlagValue);
                return true;
            case 3:
                i = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            case 4:
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
                return true;
            case 5:
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
                return true;
            default:
                return false;
        }
    }
}
