package com.google.android.gms.maps.p162a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.maps.model.p163a.C1869a;
import com.google.android.gms.maps.model.p163a.C5520d;
import com.google.android.gms.p158a.C1644a;

public final class C5515n extends mn implements C1858m {
    C5515n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final C1850a mo1676a() {
        C1850a c1850a;
        Parcel a = m5000a(4, f_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            c1850a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            c1850a = queryLocalInterface instanceof C1850a ? (C1850a) queryLocalInterface : new C5514j(readStrongBinder);
        }
        a.recycle();
        return c1850a;
    }

    public final C1852c mo1677a(C1644a c1644a) {
        C1852c c1852c;
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        Parcel a = m5000a(2, f_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            c1852c = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            c1852c = queryLocalInterface instanceof C1852c ? (C1852c) queryLocalInterface : new C5517p(readStrongBinder);
        }
        a.recycle();
        return c1852c;
    }

    public final void mo1678a(C1644a c1644a, int i) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        f_.writeInt(i);
        m5002b(6, f_);
    }

    public final C1869a mo1679b() {
        Parcel a = m5000a(5, f_());
        C1869a a2 = C5520d.m12070a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
