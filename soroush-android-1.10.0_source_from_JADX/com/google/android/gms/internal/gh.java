package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.ac;

public final class gh {
    final String f5830a;
    boolean f5831b;
    String f5832c;
    /* synthetic */ gd f5833d;
    private final String f5834e = null;

    public gh(gd gdVar, String str) {
        this.f5833d = gdVar;
        ac.m4378a(str);
        this.f5830a = str;
    }

    public final void m4858a(String str) {
        if (!ju.m16578b(str, this.f5832c)) {
            Editor edit = this.f5833d.m16276D().edit();
            edit.putString(this.f5830a, str);
            edit.apply();
            this.f5832c = str;
        }
    }
}
