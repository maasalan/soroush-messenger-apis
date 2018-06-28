package com.google.android.gms.analytics.p159a;

import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C1658b {
    private Map<String, String> f5132a;

    public final Map<String, String> m4249a() {
        return new HashMap(this.f5132a);
    }

    public final String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f5132a.entrySet()) {
            Object substring;
            if (((String) entry.getKey()).startsWith("&")) {
                substring = ((String) entry.getKey()).substring(1);
            } else {
                String str = (String) entry.getKey();
            }
            hashMap.put(substring, (String) entry.getValue());
        }
        return C1672p.m4266a(hashMap);
    }
}
