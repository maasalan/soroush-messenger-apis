package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.p158a.C6566m;
import com.google.firebase.crash.FirebaseCrash.C2058a;

public final class md extends mb {
    private final Throwable f15288c;
    private final ml f15289d;

    public md(Context context, C2058a c2058a, Throwable th, ml mlVar) {
        super(context, c2058a);
        this.f15288c = th;
        this.f15289d = mlVar;
    }

    protected final String mo1653a() {
        return "Failed to report caught exception";
    }

    protected final void mo1654a(mg mgVar) {
        if (this.f15289d != null) {
            this.f15289d.m4998a(false, System.currentTimeMillis());
        }
        mgVar.mo1656a(C6566m.m15848a(this.f15288c));
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
