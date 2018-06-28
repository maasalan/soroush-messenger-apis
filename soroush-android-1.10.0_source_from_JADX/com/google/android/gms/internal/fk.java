package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;

public final class fk<V> {
    final V f5786a;
    final String f5787b;
    private final dc<V> f5788c;

    private fk(String str, dc<V> dcVar, V v) {
        ac.m4376a((Object) dcVar);
        this.f5788c = dcVar;
        this.f5786a = v;
        this.f5787b = str;
    }

    static fk<Integer> m4825a(String str, int i, int i2) {
        return new fk(str, dc.m4689a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    static fk<Long> m4826a(String str, long j, long j2) {
        return new fk(str, dc.m4690a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    static fk<String> m4827a(String str, String str2, String str3) {
        return new fk(str, dc.m4691a(str, str3), str2);
    }

    static fk<Boolean> m4828a(String str, boolean z, boolean z2) {
        return new fk(str, dc.m4692a(str, z2), Boolean.valueOf(z));
    }

    public final V m4829a(V v) {
        return v != null ? v : this.f5786a;
    }
}
