package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import com.google.android.gms.measurement.AppMeasurement.C1901g;

public final class eq implements Runnable {
    private /* synthetic */ String f5684a;
    private /* synthetic */ long f5685b;
    private /* synthetic */ eo f5686c;

    public eq(eo eoVar, String str, long j) {
        this.f5686c = eoVar;
        this.f5684a = str;
        this.f5685b = j;
    }

    public final void run() {
        hp hpVar = this.f5686c;
        String str = this.f5684a;
        long j = this.f5685b;
        hpVar.mo1606c();
        ac.m4378a(str);
        Integer num = (Integer) hpVar.f15222b.get(str);
        if (num != null) {
            C1901g y = hpVar.mo1613j().m16458y();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                hpVar.f15222b.remove(str);
                Long l = (Long) hpVar.f15221a.get(str);
                if (l == null) {
                    hpVar.mo1623t().f18134a.m4846a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    hpVar.f15221a.remove(str);
                    hpVar.m11891a(str, longValue, y);
                }
                if (hpVar.f15222b.isEmpty()) {
                    if (hpVar.f15223c == 0) {
                        hpVar.mo1623t().f18134a.m4846a("First ad exposure time was never set");
                        return;
                    } else {
                        hpVar.m11890a(j - hpVar.f15223c, y);
                        hpVar.f15223c = 0;
                    }
                }
                return;
            }
            hpVar.f15222b.put(str, Integer.valueOf(intValue));
            return;
        }
        hpVar.mo1623t().f18134a.m4847a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
