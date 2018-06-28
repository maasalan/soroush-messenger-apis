package com.google.firebase.perf.network;

import android.support.annotation.Keep;
import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.mv;
import com.google.android.gms.internal.zzevc;
import java.io.IOException;
import p056c.C0925e;
import p056c.C0926f;
import p056c.C0949t;
import p056c.C0952v;
import p056c.aa;
import p056c.ac;
import p056c.ad;

public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void m5746a(ac acVar, ms msVar, long j, long j2) {
        aa aaVar = acVar.f2819a;
        if (aaVar != null) {
            msVar.m16712a(aaVar.f2801a.m2368a().toString());
            msVar.m16715b(aaVar.f2802b);
            if (aaVar.f2804d != null) {
                long b = aaVar.f2804d.mo1000b();
                if (b != -1) {
                    msVar.m16711a(b);
                }
            }
            ad adVar = acVar.f2825g;
            if (adVar != null) {
                long b2 = adVar.mo958b();
                if (b2 != -1) {
                    msVar.m16714b(b2);
                }
                C0952v a = adVar.mo957a();
                if (a != null) {
                    msVar.m16717c(a.toString());
                }
            }
            msVar.m16710a(acVar.f2821c);
            msVar.m16716c(j);
            msVar.m16719e(j2);
            msVar.m16713a();
        }
    }

    @Keep
    public static void enqueue(C0925e c0925e, C0926f c0926f) {
        zzevc com_google_android_gms_internal_zzevc = new zzevc();
        C0926f c0926f2 = c0926f;
        c0925e.mo1019a(new C5636g(c0926f2, mv.m5020a(), com_google_android_gms_internal_zzevc, com_google_android_gms_internal_zzevc.f6304a));
    }

    @Keep
    public static ac execute(C0925e c0925e) {
        ms a = ms.m16709a(mv.m5020a());
        zzevc com_google_android_gms_internal_zzevc = new zzevc();
        long j = com_google_android_gms_internal_zzevc.f6304a;
        try {
            ac b = c0925e.mo1020b();
            m5746a(b, a, j, com_google_android_gms_internal_zzevc.m5170b());
            return b;
        } catch (IOException e) {
            aa a2 = c0925e.mo1018a();
            if (a2 != null) {
                C0949t c0949t = a2.f2801a;
                if (c0949t != null) {
                    a.m16712a(c0949t.m2368a().toString());
                }
                if (a2.f2802b != null) {
                    a.m16715b(a2.f2802b);
                }
            }
            a.m16716c(j);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }
}
