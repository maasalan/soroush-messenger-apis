package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class zzbr extends zzbej {
    public static final Creator<zzbr> CREATOR = new ad();
    private int f18037a;
    private final Account f18038b;
    private final int f18039c;
    private final GoogleSignInAccount f18040d;

    zzbr(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f18037a = i;
        this.f18038b = account;
        this.f18039c = i2;
        this.f18040d = googleSignInAccount;
    }

    public zzbr(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18037a);
        dm.m4731a(parcel, 2, this.f18038b, i);
        dm.m4743b(parcel, 3, this.f18039c);
        dm.m4731a(parcel, 4, this.f18040d, i);
        dm.m4742b(parcel, a);
    }
}
