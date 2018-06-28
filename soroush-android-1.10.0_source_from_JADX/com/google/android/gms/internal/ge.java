package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.ac;

public final class ge {
    final String f5815a;
    final boolean f5816b = true;
    boolean f5817c;
    boolean f5818d;
    /* synthetic */ gd f5819e;

    public ge(gd gdVar, String str) {
        this.f5819e = gdVar;
        ac.m4378a(str);
        this.f5815a = str;
    }

    public final void m4853a(boolean z) {
        Editor edit = this.f5819e.m16276D().edit();
        edit.putBoolean(this.f5815a, z);
        edit.apply();
        this.f5818d = z;
    }
}
