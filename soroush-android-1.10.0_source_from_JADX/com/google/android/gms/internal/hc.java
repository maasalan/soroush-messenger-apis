package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class hc implements Callable<List<jt>> {
    private /* synthetic */ zzcff f5907a;
    private /* synthetic */ String f5908b;
    private /* synthetic */ String f5909c;
    private /* synthetic */ gw f5910d;

    hc(gw gwVar, zzcff com_google_android_gms_internal_zzcff, String str, String str2) {
        this.f5910d = gwVar;
        this.f5907a = com_google_android_gms_internal_zzcff;
        this.f5908b = str;
        this.f5909c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f5910d.f18187a.m4924x();
        return this.f5910d.f18187a.m4912k().m16069a(this.f5907a.f18517a, this.f5908b, this.f5909c);
    }
}
