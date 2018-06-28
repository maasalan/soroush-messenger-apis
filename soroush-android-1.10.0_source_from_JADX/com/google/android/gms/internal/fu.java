package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;

final class fu implements Runnable {
    private /* synthetic */ String f5790a;
    private /* synthetic */ ft f5791b;

    fu(ft ftVar, String str) {
        this.f5791b = ftVar;
        this.f5790a = str;
    }

    public final void run() {
        hq d = this.f5791b.s.m4905d();
        if (d.m11974K()) {
            gg ggVar = d.f18147b;
            String str = this.f5790a;
            ggVar.f5828d.mo1606c();
            if (ggVar.m4857b() == 0) {
                ggVar.m4856a();
            }
            if (str == null) {
                str = "";
            }
            long j = ggVar.f5828d.m16276D().getLong(ggVar.f5825a, 0);
            if (j <= 0) {
                Editor edit = ggVar.f5828d.m16276D().edit();
                edit.putString(ggVar.f5826b, str);
                edit.putLong(ggVar.f5825a, 1);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            Object obj = (ggVar.f5828d.mo1619p().m16641z().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j2 ? 1 : null;
            Editor edit2 = ggVar.f5828d.m16276D().edit();
            if (obj != null) {
                edit2.putString(ggVar.f5826b, str);
            }
            edit2.putLong(ggVar.f5825a, j2);
            edit2.apply();
            return;
        }
        this.f5791b.m16225a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
