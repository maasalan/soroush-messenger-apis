package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C1644a.C5425a;

public final class C5471r extends mn implements C1765p {
    C5471r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final C1644a mo1571a() {
        Parcel a = m5000a(1, f_());
        C1644a a2 = C5425a.m11702a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int mo1572b() {
        Parcel a = m5000a(2, f_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
