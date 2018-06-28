package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p158a.C1644a;

public final class ej extends mn implements eh {
    ej(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel f_ = f_();
        f_.writeString(str);
        mp.m5007a(f_, z);
        f_.writeInt(i);
        Parcel a = m5000a(2, f_);
        z = mp.m5008a(a);
        a.recycle();
        return z;
    }

    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeInt(i);
        f_.writeInt(i2);
        Parcel a = m5000a(3, f_);
        i = a.readInt();
        a.recycle();
        return i;
    }

    public final long getLongFlagValue(String str, long j, int i) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeLong(j);
        f_.writeInt(i);
        Parcel a = m5000a(4, f_);
        j = a.readLong();
        a.recycle();
        return j;
    }

    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeString(str2);
        f_.writeInt(i);
        Parcel a = m5000a(5, f_);
        str2 = a.readString();
        a.recycle();
        return str2;
    }

    public final void init(C1644a c1644a) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        m5002b(1, f_);
    }
}
