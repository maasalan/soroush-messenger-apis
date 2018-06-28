package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

public final class at extends aj {
    private /* synthetic */ ai f18033a;

    public at(ai aiVar, int i) {
        this.f18033a = aiVar;
        super(aiVar, i, null);
    }

    protected final void mo3020a(ConnectionResult connectionResult) {
        this.f18033a.f5348e.mo1554a(connectionResult);
        this.f18033a.m4411a(connectionResult);
    }

    protected final boolean mo3021a() {
        this.f18033a.f5348e.mo1554a(ConnectionResult.f17968a);
        return true;
    }
}
