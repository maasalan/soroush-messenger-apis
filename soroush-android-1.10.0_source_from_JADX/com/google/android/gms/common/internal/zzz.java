package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C1771k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class zzz extends zzbej {
    public static final Creator<zzz> CREATOR = new C1757b();
    String f18050a;
    IBinder f18051b;
    Scope[] f18052c;
    Bundle f18053d;
    Account f18054e;
    zzc[] f18055f;
    private int f18056g;
    private int f18057h;
    private int f18058i;

    public zzz(int i) {
        this.f18056g = 3;
        this.f18058i = C1771k.f5418b;
        this.f18057h = i;
    }

    zzz(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] com_google_android_gms_common_zzcArr) {
        this.f18056g = i;
        this.f18057h = i2;
        this.f18058i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f18050a = "com.google.android.gms";
        } else {
            this.f18050a = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                C1763l c5469n;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    c5469n = queryLocalInterface instanceof C1763l ? (C1763l) queryLocalInterface : new C5469n(iBinder);
                }
                account2 = C6578a.m15908a(c5469n);
            }
            this.f18054e = account2;
        } else {
            this.f18051b = iBinder;
            this.f18054e = account;
        }
        this.f18052c = scopeArr;
        this.f18053d = bundle;
        this.f18055f = com_google_android_gms_common_zzcArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18056g);
        dm.m4743b(parcel, 2, this.f18057h);
        dm.m4743b(parcel, 3, this.f18058i);
        dm.m4733a(parcel, 4, this.f18050a);
        dm.m4730a(parcel, 5, this.f18051b);
        dm.m4738a(parcel, 6, this.f18052c, i);
        dm.m4729a(parcel, 7, this.f18053d);
        dm.m4731a(parcel, 8, this.f18054e, i);
        dm.m4738a(parcel, 10, this.f18055f, i);
        dm.m4742b(parcel, a);
    }
}
