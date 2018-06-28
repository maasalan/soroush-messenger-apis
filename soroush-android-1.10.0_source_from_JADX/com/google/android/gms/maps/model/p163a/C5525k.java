package com.google.android.gms.maps.model.p163a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;

public final class C5525k extends mn implements C1871i {
    C5525k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final void mo1702a() {
        m5002b(1, f_());
    }

    public final boolean mo1703a(C1871i c1871i) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1871i);
        Parcel a = m5000a(16, f_);
        boolean a2 = mp.m5008a(a);
        a.recycle();
        return a2;
    }

    public final String mo1704b() {
        Parcel a = m5000a(2, f_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final int mo1705c() {
        Parcel a = m5000a(17, f_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
