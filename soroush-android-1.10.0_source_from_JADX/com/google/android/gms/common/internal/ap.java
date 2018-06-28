package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class ap extends C5472t {
    private ai f18029a;
    private final int f18030b;

    public ap(ai aiVar, int i) {
        this.f18029a = aiVar;
        this.f18030b = i;
    }

    public final void mo3018a() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void mo3019a(int i, IBinder iBinder, Bundle bundle) {
        ac.m4377a(this.f18029a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.f18029a.m4410a(i, iBinder, bundle, this.f18030b);
        this.f18029a = null;
    }
}
