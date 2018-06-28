package com.google.android.gms.internal;

import android.content.Intent;

final class jr extends fb {
    private /* synthetic */ jq f15265a;

    jr(jq jqVar, gr grVar) {
        this.f15265a = jqVar;
        super(grVar);
    }

    public final void mo1648a() {
        this.f15265a.m16558y();
        this.f15265a.mo1623t().f18140g.m4846a("Sending upload intent from DelayedRunnable");
        Intent className = new Intent().setClassName(this.f15265a.mo1615l(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        this.f15265a.mo1615l().sendBroadcast(className);
    }
}
