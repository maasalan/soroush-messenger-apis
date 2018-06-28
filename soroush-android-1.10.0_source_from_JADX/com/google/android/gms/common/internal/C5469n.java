package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;

public final class C5469n extends mn implements C1763l {
    C5469n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account mo1570a() {
        Parcel a = m5000a(2, f_());
        Account account = (Account) mp.m5004a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
