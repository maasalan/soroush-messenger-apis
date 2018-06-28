package com.google.firebase.perf.network;

import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.mv;
import com.google.android.gms.internal.zzevc;
import java.io.IOException;
import p056c.C0925e;
import p056c.C0926f;
import p056c.C0949t;
import p056c.aa;
import p056c.ac;

public final class C5636g implements C0926f {
    private final C0926f f15499a;
    private final ms f15500b;
    private final long f15501c;
    private final zzevc f15502d;

    public C5636g(C0926f c0926f, mv mvVar, zzevc com_google_android_gms_internal_zzevc, long j) {
        this.f15499a = c0926f;
        this.f15500b = ms.m16709a(mvVar);
        this.f15501c = j;
        this.f15502d = com_google_android_gms_internal_zzevc;
    }

    public final void mo1782a(C0925e c0925e, ac acVar) {
        ac acVar2 = acVar;
        FirebasePerfOkHttpClient.m5746a(acVar2, this.f15500b, this.f15501c, this.f15502d.m5170b());
        this.f15499a.mo1782a(c0925e, acVar);
    }

    public final void mo1783a(C0925e c0925e, IOException iOException) {
        aa a = c0925e.mo1018a();
        if (a != null) {
            C0949t c0949t = a.f2801a;
            if (c0949t != null) {
                this.f15500b.m16712a(c0949t.m2368a().toString());
            }
            if (a.f2802b != null) {
                this.f15500b.m16715b(a.f2802b);
            }
        }
        this.f15500b.m16716c(this.f15501c);
        this.f15500b.m16719e(this.f15502d.m5170b());
        C2108h.m5793a(this.f15500b);
        this.f15499a.mo1783a(c0925e, iOException);
    }
}
