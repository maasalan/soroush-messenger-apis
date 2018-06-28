package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class mp {
    private static final ClassLoader f6155a = mp.class.getClassLoader();

    private mp() {
    }

    public static <T extends Parcelable> T m5004a(Parcel parcel, Creator<T> creator) {
        return parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
    }

    public static void m5005a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static void m5006a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void m5007a(Parcel parcel, boolean z) {
        parcel.writeInt(z);
    }

    public static boolean m5008a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public static void m5009b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }
}
