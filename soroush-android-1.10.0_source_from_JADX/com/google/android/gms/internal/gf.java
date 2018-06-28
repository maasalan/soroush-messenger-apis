package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.ac;

public final class gf {
    private final String f5820a;
    private final long f5821b;
    private boolean f5822c;
    private long f5823d;
    private /* synthetic */ gd f5824e;

    public gf(gd gdVar, String str, long j) {
        this.f5824e = gdVar;
        ac.m4378a(str);
        this.f5820a = str;
        this.f5821b = j;
    }

    public final long m4854a() {
        if (!this.f5822c) {
            this.f5822c = true;
            this.f5823d = this.f5824e.m16276D().getLong(this.f5820a, this.f5821b);
        }
        return this.f5823d;
    }

    public final void m4855a(long j) {
        Editor edit = this.f5824e.m16276D().edit();
        edit.putLong(this.f5820a, j);
        edit.apply();
        this.f5823d = j;
    }
}
