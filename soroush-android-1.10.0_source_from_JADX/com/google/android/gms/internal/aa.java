package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class aa {
    final long f5506a = 0;
    final String f5507b;
    final String f5508c;
    final boolean f5509d;
    long f5510e;
    final Map<String, String> f5511f;

    public aa(String str, String str2, boolean z, long j, Map<String, String> map) {
        ac.m4378a(str);
        ac.m4378a(str2);
        this.f5507b = str;
        this.f5508c = str2;
        this.f5509d = z;
        this.f5510e = j;
        this.f5511f = map != null ? new HashMap(map) : Collections.emptyMap();
    }
}
