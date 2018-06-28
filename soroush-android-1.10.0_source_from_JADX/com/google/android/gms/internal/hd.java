package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class hd implements Callable<List<jt>> {
    private /* synthetic */ String f5911a;
    private /* synthetic */ String f5912b;
    private /* synthetic */ String f5913c;
    private /* synthetic */ gw f5914d;

    hd(gw gwVar, String str, String str2, String str3) {
        this.f5914d = gwVar;
        this.f5911a = str;
        this.f5912b = str2;
        this.f5913c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f5914d.f18187a.m4924x();
        return this.f5914d.f18187a.m4912k().m16069a(this.f5911a, this.f5912b, this.f5913c);
    }
}
