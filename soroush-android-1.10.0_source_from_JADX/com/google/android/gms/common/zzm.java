package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.C5470q;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C6566m;

public final class zzm extends zzbej {
    public static final Creator<zzm> CREATOR = new C1774s();
    private final String f18062a;
    private final C6580m f18063b;
    private final boolean f18064c;

    zzm(String str, IBinder iBinder, boolean z) {
        this.f18062a = str;
        this.f18063b = m15927a(iBinder);
        this.f18064c = z;
    }

    zzm(String str, C6580m c6580m, boolean z) {
        this.f18062a = str;
        this.f18063b = c6580m;
        this.f18064c = z;
    }

    private static C6580m m15927a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            C1644a a = C5470q.m11820a(iBinder).mo1571a();
            byte[] bArr = a == null ? null : (byte[]) C6566m.m15849a(a);
            if (bArr != null) {
                return new C7139n(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (Throwable e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18062a);
        if (this.f18063b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = this.f18063b.asBinder();
        }
        dm.m4730a(parcel, 2, iBinder);
        dm.m4735a(parcel, 3, this.f18064c);
        dm.m4742b(parcel, i);
    }
}
