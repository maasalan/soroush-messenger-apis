package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;

final class ca {
    long f5619a;
    private final C1785d f5620b;

    public ca(C1785d c1785d) {
        ac.m4376a((Object) c1785d);
        this.f5620b = c1785d;
    }

    public ca(C1785d c1785d, long j) {
        ac.m4376a((Object) c1785d);
        this.f5620b = c1785d;
        this.f5619a = j;
    }

    public final void m4641a() {
        this.f5619a = this.f5620b.mo1576b();
    }

    public final boolean m4642a(long j) {
        return this.f5619a == 0 || this.f5620b.mo1576b() - this.f5619a > j;
    }
}
