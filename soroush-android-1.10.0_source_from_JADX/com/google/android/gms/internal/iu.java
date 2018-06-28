package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class iu implements Runnable {
    private /* synthetic */ boolean f6017a = true;
    private /* synthetic */ boolean f6018b;
    private /* synthetic */ zzcfi f6019c;
    private /* synthetic */ zzcff f6020d;
    private /* synthetic */ zzcfi f6021e;
    private /* synthetic */ il f6022f;

    iu(il ilVar, boolean z, zzcfi com_google_android_gms_internal_zzcfi, zzcff com_google_android_gms_internal_zzcff, zzcfi com_google_android_gms_internal_zzcfi2) {
        this.f6022f = ilVar;
        this.f6018b = z;
        this.f6019c = com_google_android_gms_internal_zzcfi;
        this.f6020d = com_google_android_gms_internal_zzcff;
        this.f6021e = com_google_android_gms_internal_zzcfi2;
    }

    public final void run() {
        fl flVar = this.f6022f.f18205b;
        if (flVar == null) {
            this.f6022f.mo1623t().f18134a.m4846a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f6017a) {
            this.f6022f.m16472a(flVar, this.f6018b ? null : this.f6019c, this.f6020d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6021e.f18532a)) {
                    flVar.mo1634a(this.f6019c, this.f6020d);
                } else {
                    flVar.mo1633a(this.f6019c);
                }
            } catch (RemoteException e) {
                this.f6022f.mo1623t().f18134a.m4847a("Failed to send conditional user property to the service", e);
            }
        }
        this.f6022f.m16466C();
    }
}
