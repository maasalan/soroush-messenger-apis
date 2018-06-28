package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.analytics.C1677r;

public final class bt extends C5506v {
    SharedPreferences f18098a;
    final bu f18099b = new bu(this, "monitoring", ((Long) bf.f5545D.f5585a).longValue());
    private long f18100c;
    private long f18101d = -1;

    protected bt(C1827x c1827x) {
        super(c1827x);
    }

    public final void m16008a(String str) {
        C1677r.m4275b();
        m12037k();
        Editor edit = this.f18098a.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            m5153e("Failed to commit campaign data");
        }
    }

    public final long m16009b() {
        C1677r.m4275b();
        m12037k();
        if (this.f18100c == 0) {
            long j = this.f18098a.getLong("first_run", 0);
            if (j == 0) {
                j = this.f6279f.f6285c.mo1575a();
                Editor edit = this.f18098a.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    m5153e("Failed to commit first run time");
                }
            }
            this.f18100c = j;
        }
        return this.f18100c;
    }

    public final ca m16010c() {
        return new ca(this.f6279f.f6285c, m16009b());
    }

    protected final void c_() {
        this.f18098a = this.f6279f.f6283a.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long m16011d() {
        C1677r.m4275b();
        m12037k();
        if (this.f18101d == -1) {
            this.f18101d = this.f18098a.getLong("last_dispatch", 0);
        }
        return this.f18101d;
    }

    public final void m16012e() {
        C1677r.m4275b();
        m12037k();
        long a = this.f6279f.f6285c.mo1575a();
        Editor edit = this.f18098a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f18101d = a;
    }

    public final String m16013f() {
        C1677r.m4275b();
        m12037k();
        Object string = this.f18098a.getString("installation_campaign", null);
        return TextUtils.isEmpty(string) ? null : string;
    }
}
