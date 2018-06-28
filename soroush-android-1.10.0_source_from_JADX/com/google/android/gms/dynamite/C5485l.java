package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C1644a.C5425a;

public final class C5485l extends mn implements C1806k {
    C5485l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int mo1581a(C1644a c1644a, String str, boolean z) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        f_.writeString(str);
        mp.m5007a(f_, z);
        Parcel a = m5000a(3, f_);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final C1644a mo1582a(C1644a c1644a, String str, int i) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        f_.writeString(str);
        f_.writeInt(i);
        Parcel a = m5000a(2, f_);
        C1644a a2 = C5425a.m11702a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
