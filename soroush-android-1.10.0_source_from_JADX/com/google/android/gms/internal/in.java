package com.google.android.gms.internal;

import android.os.RemoteException;

final class in implements Runnable {
    private /* synthetic */ zzcff f6000a;
    private /* synthetic */ il f6001b;

    in(il ilVar, zzcff com_google_android_gms_internal_zzcff) {
        this.f6001b = ilVar;
        this.f6000a = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        fl flVar = this.f6001b.f18205b;
        if (flVar == null) {
            this.f6001b.mo1623t().f18134a.m4846a("Failed to reset data on the service; null service");
            return;
        }
        try {
            flVar.mo1641d(this.f6000a);
        } catch (RemoteException e) {
            this.f6001b.mo1623t().f18134a.m4847a("Failed to reset data on the service", e);
        }
        this.f6001b.m16466C();
    }
}
