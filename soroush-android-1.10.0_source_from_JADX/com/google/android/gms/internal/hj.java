package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class hj implements Callable<byte[]> {
    private /* synthetic */ zzcfx f5931a;
    private /* synthetic */ String f5932b;
    private /* synthetic */ gw f5933c;

    hj(gw gwVar, zzcfx com_google_android_gms_internal_zzcfx, String str) {
        this.f5933c = gwVar;
        this.f5931a = com_google_android_gms_internal_zzcfx;
        this.f5932b = str;
    }

    public final /* synthetic */ Object call() {
        this.f5933c.f18187a.m4924x();
        return this.f5933c.f18187a.m4902b(this.f5931a, this.f5932b);
    }
}
