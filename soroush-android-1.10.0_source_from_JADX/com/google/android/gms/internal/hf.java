package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class hf implements Callable<List<zzcfi>> {
    private /* synthetic */ String f5919a;
    private /* synthetic */ String f5920b;
    private /* synthetic */ String f5921c;
    private /* synthetic */ gw f5922d;

    hf(gw gwVar, String str, String str2, String str3) {
        this.f5922d = gwVar;
        this.f5919a = str;
        this.f5920b = str2;
        this.f5921c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f5922d.f18187a.m4924x();
        return this.f5922d.f18187a.m4912k().m16079b(this.f5919a, this.f5920b, this.f5921c);
    }
}
