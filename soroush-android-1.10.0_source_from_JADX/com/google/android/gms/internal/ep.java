package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;

public final class ep implements Runnable {
    private /* synthetic */ String f5681a;
    private /* synthetic */ long f5682b;
    private /* synthetic */ eo f5683c;

    public ep(eo eoVar, String str, long j) {
        this.f5683c = eoVar;
        this.f5681a = str;
        this.f5682b = j;
    }

    public final void run() {
        hp hpVar = this.f5683c;
        String str = this.f5681a;
        long j = this.f5682b;
        hpVar.mo1606c();
        ac.m4378a(str);
        if (hpVar.f15222b.isEmpty()) {
            hpVar.f15223c = j;
        }
        Integer num = (Integer) hpVar.f15222b.get(str);
        if (num != null) {
            hpVar.f15222b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (hpVar.f15222b.size() >= 100) {
            hpVar.mo1623t().f18136c.m4846a("Too many ads visible");
        } else {
            hpVar.f15222b.put(str, Integer.valueOf(1));
            hpVar.f15221a.put(str, Long.valueOf(j));
        }
    }
}
