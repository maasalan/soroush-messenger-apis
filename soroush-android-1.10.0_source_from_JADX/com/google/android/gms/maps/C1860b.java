package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.maps.model.C1877e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.p162a.C1850a;

public final class C1860b {
    static C1850a f6311a;

    public static C1859a m5207a(LatLng latLng, float f) {
        try {
            return new C1859a(((C1850a) ac.m4377a(f6311a, (Object) "CameraUpdateFactory is not initialized")).mo1675a(latLng, f));
        } catch (RemoteException e) {
            throw new C1877e(e);
        }
    }
}
