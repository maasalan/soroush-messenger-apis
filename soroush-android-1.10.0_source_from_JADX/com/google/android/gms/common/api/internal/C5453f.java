package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C1709b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p160b.C1693e;

abstract class C5453f<T> extends C1721a {
    protected final C1693e<T> f15133a;

    public C5453f(C1693e<T> c1693e) {
        super(4);
        this.f15133a = c1693e;
    }

    public void mo1549a(Status status) {
        this.f15133a.m4298b(new C1709b(status));
    }

    public void mo1550a(C1722b c1722b, boolean z) {
    }

    public final void mo1551a(C6575i<?> c6575i) {
        try {
            mo3009b(c6575i);
        } catch (RemoteException e) {
            mo1549a(C1721a.m4318a(e));
            throw e;
        } catch (RemoteException e2) {
            mo1549a(C1721a.m4318a(e2));
        }
    }

    protected abstract void mo3009b(C6575i<?> c6575i);
}
