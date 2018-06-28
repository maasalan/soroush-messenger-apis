package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.maps.model.p163a.C1869a;

public final class C1874b {
    public static C1869a f6321a;

    public static C1873a m5225a() {
        try {
            return new C1873a(C1874b.m5227b().mo1698a());
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    public static C1873a m5226a(Bitmap bitmap) {
        try {
            return new C1873a(C1874b.m5227b().mo1699a(bitmap));
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }

    private static C1869a m5227b() {
        return (C1869a) ac.m4377a(f6321a, (Object) "IBitmapDescriptorFactory is not initialized");
    }
}
