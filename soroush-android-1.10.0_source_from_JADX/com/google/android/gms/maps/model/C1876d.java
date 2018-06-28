package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.maps.model.p163a.C1871i;

public final class C1876d {
    private final C1871i f6323a;

    public C1876d(C1871i c1871i) {
        this.f6323a = (C1871i) ac.m4376a((Object) c1871i);
    }

    public final void m5228a() {
        try {
            this.f6323a.mo1702a();
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final String m5229b() {
        try {
            return this.f6323a.mo1704b();
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1876d)) {
            return false;
        }
        try {
            return this.f6323a.mo1703a(((C1876d) obj).f6323a);
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f6323a.mo1705c();
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }
}
