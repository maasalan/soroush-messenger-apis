package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

final class aq implements Runnable {
    final /* synthetic */ ao f5253a;
    private final ap f5254b;

    aq(ao aoVar, ap apVar) {
        this.f5253a = aoVar;
        this.f5254b = apVar;
    }

    public final void run() {
        if (this.f5253a.f15108b) {
            ConnectionResult connectionResult = this.f5254b.f5252b;
            if (connectionResult.m15869a()) {
                GoogleApiActivity.m4305a(this.f5253a.m4317a(), connectionResult.f17970c, this.f5254b.f5251a, false);
            } else if (this.f5253a.f15110d.mo1559a(connectionResult.f17969b)) {
                C5458b.m11791a(this.f5253a.m4317a(), this.f5253a.a, connectionResult.f17969b, this.f5253a);
            } else if (connectionResult.f17969b == 18) {
                C5458b.m11788a(this.f5253a.m4317a().getApplicationContext(), new ar(this, C5458b.m11786a(this.f5253a.m4317a(), this.f5253a)));
            } else {
                this.f5253a.mo3010a(connectionResult, this.f5254b.f5251a);
            }
        }
    }
}
