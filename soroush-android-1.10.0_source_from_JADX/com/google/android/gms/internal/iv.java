package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class iv implements Runnable {
    private /* synthetic */ AtomicReference f6023a;
    private /* synthetic */ String f6024b;
    private /* synthetic */ String f6025c;
    private /* synthetic */ String f6026d;
    private /* synthetic */ zzcff f6027e;
    private /* synthetic */ il f6028f;

    iv(il ilVar, AtomicReference atomicReference, String str, String str2, String str3, zzcff com_google_android_gms_internal_zzcff) {
        this.f6028f = ilVar;
        this.f6023a = atomicReference;
        this.f6024b = str;
        this.f6025c = str2;
        this.f6026d = str3;
        this.f6027e = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        synchronized (this.f6023a) {
            Object a;
            try {
                fl flVar = this.f6028f.f18205b;
                if (flVar == null) {
                    this.f6028f.mo1623t().f18134a.m4849a("Failed to get conditional properties", ft.m16220a(this.f6024b), this.f6025c, this.f6026d);
                    this.f6023a.set(Collections.emptyList());
                    this.f6023a.notify();
                    return;
                }
                AtomicReference atomicReference;
                if (TextUtils.isEmpty(this.f6024b)) {
                    atomicReference = this.f6023a;
                    a = flVar.mo1627a(this.f6025c, this.f6026d, this.f6027e);
                } else {
                    atomicReference = this.f6023a;
                    a = flVar.mo1628a(this.f6024b, this.f6025c, this.f6026d);
                }
                atomicReference.set(a);
                this.f6028f.m16466C();
                a = this.f6023a;
                a.notify();
            } catch (RemoteException e) {
                try {
                    this.f6028f.mo1623t().f18134a.m4849a("Failed to get conditional properties", ft.m16220a(this.f6024b), this.f6025c, e);
                    this.f6023a.set(Collections.emptyList());
                    a = this.f6023a;
                } catch (Throwable th) {
                    this.f6023a.notify();
                }
            }
        }
    }
}
