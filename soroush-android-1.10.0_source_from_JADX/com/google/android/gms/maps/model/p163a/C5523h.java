package com.google.android.gms.maps.model.p163a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;

public final class C5523h extends mn implements C1870f {
    C5523h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    public final int mo1700a() {
        Parcel a = m5000a(18, f_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final boolean mo1701a(C1870f c1870f) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1870f);
        Parcel a = m5000a(17, f_);
        boolean a2 = mp.m5008a(a);
        a.recycle();
        return a2;
    }
}
