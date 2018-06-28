package com.google.android.gms.internal;

import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C5495d extends C1672p<C5495d> {
    public Map<Integer, Double> f15219a = new HashMap(4);

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        ((C5495d) c1672p).f15219a.putAll(this.f15219a);
    }

    public final String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f15219a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder stringBuilder = new StringBuilder(6 + String.valueOf(valueOf).length());
            stringBuilder.append("metric");
            stringBuilder.append(valueOf);
            hashMap.put(stringBuilder.toString(), entry.getValue());
        }
        return C1672p.m4264a((Object) hashMap);
    }
}
