package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;

final class gx implements Runnable {
    private /* synthetic */ zzcff f5895a;
    private /* synthetic */ gw f5896b;

    gx(gw gwVar, zzcff com_google_android_gms_internal_zzcff) {
        this.f5896b = gwVar;
        this.f5895a = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        this.f5896b.f18187a.m4924x();
        gr a = this.f5896b.f18187a;
        zzcff com_google_android_gms_internal_zzcff = this.f5895a;
        a.m4907f().mo1606c();
        a.m4888a();
        ac.m4378a(com_google_android_gms_internal_zzcff.f18517a);
        a.m4904c(com_google_android_gms_internal_zzcff);
    }
}
