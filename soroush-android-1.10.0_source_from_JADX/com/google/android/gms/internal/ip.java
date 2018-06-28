package com.google.android.gms.internal;

import android.os.RemoteException;

final class ip implements Runnable {
    private /* synthetic */ zzcff f6005a;
    private /* synthetic */ il f6006b;

    ip(il ilVar, zzcff com_google_android_gms_internal_zzcff) {
        this.f6006b = ilVar;
        this.f6005a = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        fl flVar = this.f6006b.f18205b;
        if (flVar == null) {
            this.f6006b.mo1623t().f18134a.m4846a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            flVar.mo1632a(this.f6005a);
            this.f6006b.m16472a(flVar, null, this.f6005a);
            this.f6006b.m16466C();
        } catch (RemoteException e) {
            this.f6006b.mo1623t().f18134a.m4847a("Failed to send app launch to the service", e);
        }
    }
}
