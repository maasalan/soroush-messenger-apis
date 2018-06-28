package com.google.firebase.perf.metrics;

import com.google.android.gms.internal.nt;
import com.google.android.gms.internal.nu;
import com.google.android.gms.internal.nv;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class C2101d {
    private final Trace f7067a;

    C2101d(Trace trace) {
        this.f7067a = trace;
    }

    final nt m5737a() {
        nt ntVar = new nt();
        ntVar.f18383a = this.f7067a.f18852a;
        ntVar.f18384b = Long.valueOf(this.f7067a.f18856g.f6304a);
        ntVar.f18385c = Long.valueOf(this.f7067a.f18856g.m5168a(this.f7067a.f18857h));
        Map map = this.f7067a.f18854c;
        int i = 0;
        if (!map.isEmpty()) {
            ntVar.f18386d = new nu[map.size()];
            int i2 = 0;
            for (String str : map.keySet()) {
                String str2;
                zza com_google_firebase_perf_metrics_zza = (zza) map.get(str2);
                nu nuVar = new nu();
                nuVar.f18391a = str2;
                nuVar.f18392b = Long.valueOf(com_google_firebase_perf_metrics_zza.f7069a);
                int i3 = i2 + 1;
                ntVar.f18386d[i2] = nuVar;
                i2 = i3;
            }
        }
        List<Trace> list = this.f7067a.f18853b;
        if (!list.isEmpty()) {
            ntVar.f18387e = new nt[list.size()];
            int i4 = 0;
            for (Trace c2101d : list) {
                i3 = i4 + 1;
                ntVar.f18387e[i4] = new C2101d(c2101d).m5737a();
                i4 = i3;
            }
        }
        Map hashMap = new HashMap(this.f7067a.f18855d);
        if (!hashMap.isEmpty()) {
            ntVar.f18388f = new nv[hashMap.size()];
            for (String str3 : hashMap.keySet()) {
                str2 = (String) hashMap.get(str3);
                nv nvVar = new nv();
                nvVar.f18394a = str3;
                nvVar.f18395b = str2;
                int i5 = i + 1;
                ntVar.f18388f[i] = nvVar;
                i = i5;
            }
        }
        return ntVar;
    }
}
