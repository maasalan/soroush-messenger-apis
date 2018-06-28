package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.crash.FirebaseCrash.C2058a;

public final class mc extends mb {
    private final String f15285c;
    private final long f15286d;
    private final Bundle f15287e;

    public mc(Context context, C2058a c2058a, String str, long j, Bundle bundle) {
        super(context, c2058a);
        this.f15285c = str;
        this.f15286d = j;
        this.f15287e = bundle;
    }

    protected final String mo1653a() {
        return "Failed to log analytics event";
    }

    protected final void mo1654a(mg mgVar) {
        mgVar.mo1659a(this.f15285c, this.f15286d, this.f15287e);
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
