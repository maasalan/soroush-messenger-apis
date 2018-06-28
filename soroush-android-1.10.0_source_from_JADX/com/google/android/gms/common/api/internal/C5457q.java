package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C1708a.C1705c;
import com.google.android.gms.common.api.C1717f;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.Status;

public final class C5457q<A extends an<? extends C1720i, C1705c>> extends C1721a {
    private A f15142a;

    public C5457q(A a) {
        super(2);
        this.f15142a = a;
    }

    public final void mo1549a(Status status) {
        this.f15142a.m15881b(status);
    }

    public final void mo1550a(C1722b c1722b, boolean z) {
        C1717f c1717f = this.f15142a;
        c1722b.f5256a.put(c1717f, Boolean.valueOf(z));
        c1717f.mo1547a(new C5451c(c1722b, c1717f));
    }

    public final void mo1551a(C6575i<?> c6575i) {
        an anVar = this.f15142a;
        try {
            anVar.mo3411a(c6575i.f17990a);
        } catch (RemoteException e) {
            anVar.m15879a(e);
            throw e;
        } catch (RemoteException e2) {
            anVar.m15879a(e2);
        }
    }
}
