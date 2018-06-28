package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;

public final class bg<V> {
    final V f5585a;
    private final dc<V> f5586b;

    bg(dc<V> dcVar, V v) {
        ac.m4376a((Object) dcVar);
        this.f5586b = dcVar;
        this.f5585a = v;
    }

    static bg<Integer> m4607a(String str, int i, int i2) {
        return new bg(dc.m4689a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    static bg<Long> m4608a(String str, long j, long j2) {
        return new bg(dc.m4690a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    static bg<String> m4609a(String str, String str2, String str3) {
        return new bg(dc.m4691a(str, str3), str2);
    }

    static bg<Boolean> m4610a(String str, boolean z, boolean z2) {
        return new bg(dc.m4692a(str, z2), Boolean.valueOf(z));
    }
}
