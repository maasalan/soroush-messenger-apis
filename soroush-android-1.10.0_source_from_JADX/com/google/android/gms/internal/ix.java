package com.google.android.gms.internal;

final class ix implements Runnable {
    private /* synthetic */ boolean f6036a;
    private /* synthetic */ zzckk f6037b;
    private /* synthetic */ zzcff f6038c;
    private /* synthetic */ il f6039d;

    ix(il ilVar, boolean z, zzckk com_google_android_gms_internal_zzckk, zzcff com_google_android_gms_internal_zzcff) {
        this.f6039d = ilVar;
        this.f6036a = z;
        this.f6037b = com_google_android_gms_internal_zzckk;
        this.f6038c = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        fl flVar = this.f6039d.f18205b;
        if (flVar == null) {
            this.f6039d.mo1623t().f18134a.m4846a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f6039d.m16472a(flVar, this.f6036a ? null : this.f6037b, this.f6038c);
        this.f6039d.m16466C();
    }
}
