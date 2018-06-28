package com.google.android.gms.internal;

import android.os.RemoteException;

final class is implements Runnable {
    private /* synthetic */ zzcff f6009a;
    private /* synthetic */ il f6010b;

    is(il ilVar, zzcff com_google_android_gms_internal_zzcff) {
        this.f6010b = ilVar;
        this.f6009a = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        fl flVar = this.f6010b.f18205b;
        if (flVar == null) {
            this.f6010b.mo1623t().f18134a.m4846a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            flVar.mo1639b(this.f6009a);
            this.f6010b.m16466C();
        } catch (RemoteException e) {
            this.f6010b.mo1623t().f18134a.m4847a("Failed to send measurementEnabled to the service", e);
        }
    }
}
