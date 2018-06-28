package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class C5473v implements C1767u {
    private final IBinder f15166a;

    C5473v(IBinder iBinder) {
        this.f15166a = iBinder;
    }

    public final void mo1573a(C1766s c1766s, zzz com_google_android_gms_common_internal_zzz) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(c1766s.asBinder());
            obtain.writeInt(1);
            com_google_android_gms_common_internal_zzz.writeToParcel(obtain, 0);
            this.f15166a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f15166a;
    }
}
