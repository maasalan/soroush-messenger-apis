package com.google.android.gms.analytics.p159a;

import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C1659c {
    private Map<String, String> f5133a = new HashMap();

    public final Map<String, String> m4250a(String str) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.f5133a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public final String toString() {
        return C1672p.m4266a(this.f5133a);
    }
}
