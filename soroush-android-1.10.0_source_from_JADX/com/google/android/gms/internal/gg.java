package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.ac;

public final class gg {
    final String f5825a;
    final String f5826b;
    final long f5827c;
    /* synthetic */ gd f5828d;
    private String f5829e;

    private gg(gd gdVar, String str, long j) {
        this.f5828d = gdVar;
        ac.m4378a(str);
        ac.m4385b(j > 0);
        this.f5829e = String.valueOf(str).concat(":start");
        this.f5825a = String.valueOf(str).concat(":count");
        this.f5826b = String.valueOf(str).concat(":value");
        this.f5827c = j;
    }

    final void m4856a() {
        this.f5828d.mo1606c();
        long a = this.f5828d.mo1614k().mo1575a();
        Editor edit = this.f5828d.m16276D().edit();
        edit.remove(this.f5825a);
        edit.remove(this.f5826b);
        edit.putLong(this.f5829e, a);
        edit.apply();
    }

    final long m4857b() {
        return this.f5828d.m16276D().getLong(this.f5829e, 0);
    }
}
