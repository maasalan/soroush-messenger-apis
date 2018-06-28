package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.maps.model.C1875c;
import com.google.android.gms.maps.model.C1876d;
import com.google.android.gms.maps.model.C1877e;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.p163a.C1871i;
import com.google.android.gms.maps.p162a.C1851b;

public final class C1862c {
    private final C1851b f6312a;

    public interface C1861a {
        boolean mo2205a(C1876d c1876d);
    }

    public C1862c(C1851b c1851b) {
        this.f6312a = (C1851b) ac.m4376a((Object) c1851b);
    }

    public final C1875c m5209a(CircleOptions circleOptions) {
        try {
            return new C1875c(this.f6312a.mo1680a(circleOptions));
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final C1876d m5210a(MarkerOptions markerOptions) {
        try {
            C1871i a = this.f6312a.mo1681a(markerOptions);
            return a != null ? new C1876d(a) : null;
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final void m5211a() {
        try {
            this.f6312a.mo1682a();
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final void m5212a(C1859a c1859a) {
        try {
            this.f6312a.mo1683a(c1859a.f6310a);
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public final void m5213a(C1861a c1861a) {
        try {
            this.f6312a.mo1684a(new C6586i(c1861a));
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }
}
