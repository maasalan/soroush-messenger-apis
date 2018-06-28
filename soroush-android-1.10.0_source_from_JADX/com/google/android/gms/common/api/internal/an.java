package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C1708a;
import com.google.android.gms.common.api.C1708a.C1705c;
import com.google.android.gms.common.api.C1708a.C1706d;
import com.google.android.gms.common.api.C1715e;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ac;

public abstract class an<R extends C1720i, A extends C1705c> extends as<R> {
    private final C1706d<A> f17987c;
    private final C1708a<?> f17988d;

    protected an(C1708a<?> c1708a, C1715e c1715e) {
        super((C1715e) ac.m4377a((Object) c1715e, (Object) "GoogleApiClient must not be null"));
        if (c1708a.f5212b != null) {
            this.f17987c = c1708a.f5212b;
            this.f17988d = c1708a;
            return;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    final void m15879a(RemoteException remoteException) {
        m15881b(new Status(remoteException.getLocalizedMessage()));
    }

    public abstract void mo3411a(A a);

    public final void m15881b(Status status) {
        ac.m4386b(status.m15872b() ^ 1, "Failed result must not be success");
        m11770a(mo3008a(status));
    }
}
