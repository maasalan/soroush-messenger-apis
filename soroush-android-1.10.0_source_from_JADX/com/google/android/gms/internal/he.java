package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class he implements Callable<List<zzcfi>> {
    private /* synthetic */ zzcff f5915a;
    private /* synthetic */ String f5916b;
    private /* synthetic */ String f5917c;
    private /* synthetic */ gw f5918d;

    he(gw gwVar, zzcff com_google_android_gms_internal_zzcff, String str, String str2) {
        this.f5918d = gwVar;
        this.f5915a = com_google_android_gms_internal_zzcff;
        this.f5916b = str;
        this.f5917c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f5918d.f18187a.m4924x();
        return this.f5918d.f18187a.m4912k().m16079b(this.f5915a.f18517a, this.f5916b, this.f5917c);
    }
}
