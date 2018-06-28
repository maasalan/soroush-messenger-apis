package com.google.android.gms.internal;

import com.google.android.gms.analytics.C1672p;
import com.google.android.gms.analytics.p159a.C1657a;
import com.google.android.gms.analytics.p159a.C1658b;
import com.google.android.gms.analytics.p159a.C1659c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C5498g extends C1672p<C5498g> {
    public final List<C1657a> f15231a = new ArrayList();
    public final List<C1659c> f15232b = new ArrayList();
    public final Map<String, List<C1657a>> f15233c = new HashMap();
    public C1658b f15234d;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5498g c5498g = (C5498g) c1672p;
        c5498g.f15231a.addAll(this.f15231a);
        c5498g.f15232b.addAll(this.f15232b);
        for (Entry entry : this.f15233c.entrySet()) {
            String str = (String) entry.getKey();
            for (C1657a c1657a : (List) entry.getValue()) {
                if (c1657a != null) {
                    Object obj = str == null ? "" : str;
                    if (!c5498g.f15233c.containsKey(obj)) {
                        c5498g.f15233c.put(obj, new ArrayList());
                    }
                    ((List) c5498g.f15233c.get(obj)).add(c1657a);
                }
            }
        }
        if (this.f15234d != null) {
            c5498g.f15234d = this.f15234d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        if (!this.f15231a.isEmpty()) {
            hashMap.put("products", this.f15231a);
        }
        if (!this.f15232b.isEmpty()) {
            hashMap.put("promotions", this.f15232b);
        }
        if (!this.f15233c.isEmpty()) {
            hashMap.put("impressions", this.f15233c);
        }
        hashMap.put("productAction", this.f15234d);
        return C1672p.m4264a((Object) hashMap);
    }
}
