package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.maps.model.p163a.C1870f;

public final class C1875c {
    private final C1870f f6322a;

    public C1875c(C1870f c1870f) {
        this.f6322a = (C1870f) ac.m4376a((Object) c1870f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1875c)) {
            return false;
        }
        try {
            return this.f6322a.mo1701a(((C1875c) obj).f6322a);
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f6322a.mo1700a();
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }
}
