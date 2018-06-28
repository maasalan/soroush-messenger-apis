package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzm;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.p158a.C1644a;

public final class C5475y extends mn implements C1768w {
    C5475y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean mo1574a(zzm com_google_android_gms_common_zzm, C1644a c1644a) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_common_zzm);
        mp.m5005a(f_, (IInterface) c1644a);
        Parcel a = m5000a(5, f_);
        boolean a2 = mp.m5008a(a);
        a.recycle();
        return a2;
    }
}
