package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class ny extends mn implements nw {
    ny(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String mo1665a() {
        Parcel a = m5000a(1, f_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean mo1666b() {
        Parcel f_ = f_();
        mp.m5007a(f_, true);
        f_ = m5000a(2, f_);
        boolean a = mp.m5008a(f_);
        f_.recycle();
        return a;
    }
}
