package com.google.android.gms.common.internal;

import android.accounts.Account;

public final class C6578a extends C5468m {
    public static android.accounts.Account m15908a(com.google.android.gms.common.internal.C1763l r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r3 == 0) goto L_0x001f;
    L_0x0002:
        r0 = android.os.Binder.clearCallingIdentity();
        r3 = r3.mo1570a();	 Catch:{ RemoteException -> 0x0010 }
        android.os.Binder.restoreCallingIdentity(r0);
        return r3;
    L_0x000e:
        r3 = move-exception;
        goto L_0x001b;
    L_0x0010:
        r3 = "AccountAccessor";	 Catch:{ all -> 0x000e }
        r2 = "Remote account accessor probably died";	 Catch:{ all -> 0x000e }
        android.util.Log.w(r3, r2);	 Catch:{ all -> 0x000e }
        android.os.Binder.restoreCallingIdentity(r0);
        goto L_0x001f;
    L_0x001b:
        android.os.Binder.restoreCallingIdentity(r0);
        throw r3;
    L_0x001f:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.a.a(com.google.android.gms.common.internal.l):android.accounts.Account");
    }

    public final Account mo1570a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
