package com.google.android.gms.internal;

import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C5494c extends C1672p<C5494c> {
    public Map<Integer, String> f15204a = new HashMap(4);

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        ((C5494c) c1672p).f15204a.putAll(this.f15204a);
    }

    public final String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f15204a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder stringBuilder = new StringBuilder(9 + String.valueOf(valueOf).length());
            stringBuilder.append("dimension");
            stringBuilder.append(valueOf);
            hashMap.put(stringBuilder.toString(), entry.getValue());
        }
        return C1672p.m4264a((Object) hashMap);
    }
}
