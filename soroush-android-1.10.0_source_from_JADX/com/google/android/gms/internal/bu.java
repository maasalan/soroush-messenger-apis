package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.ac;

public final class bu {
    final long f5609a;
    /* synthetic */ bt f5610b;
    private final String f5611c;

    private bu(bt btVar, String str, long j) {
        this.f5610b = btVar;
        ac.m4378a(str);
        ac.m4385b(j > 0);
        this.f5611c = str;
        this.f5609a = j;
    }

    private final String m4627e() {
        return String.valueOf(this.f5611c).concat(":start");
    }

    final void m4628a() {
        long a = this.f5610b.f6279f.f6285c.mo1575a();
        Editor edit = this.f5610b.f18098a.edit();
        edit.remove(m4630c());
        edit.remove(m4631d());
        edit.putLong(m4627e(), a);
        edit.commit();
    }

    final long m4629b() {
        return this.f5610b.f18098a.getLong(m4627e(), 0);
    }

    final String m4630c() {
        return String.valueOf(this.f5611c).concat(":count");
    }

    final String m4631d() {
        return String.valueOf(this.f5611c).concat(":value");
    }
}
