package com.google.android.gms.common.api.internal;

import android.os.Build.VERSION;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

public abstract class C1721a {
    private int f5232a;

    public C1721a(int i) {
        this.f5232a = i;
    }

    static /* synthetic */ Status m4318a(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        if ((VERSION.SDK_INT >= 15 ? 1 : null) != null && (remoteException instanceof TransactionTooLargeException)) {
            stringBuilder.append("TransactionTooLargeException: ");
        }
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(8, stringBuilder.toString());
    }

    public abstract void mo1549a(Status status);

    public abstract void mo1550a(C1722b c1722b, boolean z);

    public abstract void mo1551a(C6575i<?> c6575i);
}
