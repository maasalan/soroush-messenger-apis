package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class it implements Runnable {
    private /* synthetic */ boolean f6011a = true;
    private /* synthetic */ boolean f6012b;
    private /* synthetic */ zzcfx f6013c;
    private /* synthetic */ zzcff f6014d;
    private /* synthetic */ String f6015e;
    private /* synthetic */ il f6016f;

    it(il ilVar, boolean z, zzcfx com_google_android_gms_internal_zzcfx, zzcff com_google_android_gms_internal_zzcff, String str) {
        this.f6016f = ilVar;
        this.f6012b = z;
        this.f6013c = com_google_android_gms_internal_zzcfx;
        this.f6014d = com_google_android_gms_internal_zzcff;
        this.f6015e = str;
    }

    public final void run() {
        fl flVar = this.f6016f.f18205b;
        if (flVar == null) {
            this.f6016f.mo1623t().f18134a.m4846a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f6011a) {
            this.f6016f.m16472a(flVar, this.f6012b ? null : this.f6013c, this.f6014d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6015e)) {
                    flVar.mo1635a(this.f6013c, this.f6014d);
                } else {
                    flVar.mo1636a(this.f6013c, this.f6015e, this.f6016f.mo1623t().m16250y());
                }
            } catch (RemoteException e) {
                this.f6016f.mo1623t().f18134a.m4847a("Failed to send event to the service", e);
            }
        }
        this.f6016f.m16466C();
    }
}
