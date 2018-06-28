package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class iw implements Runnable {
    private /* synthetic */ AtomicReference f6029a;
    private /* synthetic */ String f6030b;
    private /* synthetic */ String f6031c;
    private /* synthetic */ String f6032d;
    private /* synthetic */ boolean f6033e;
    private /* synthetic */ zzcff f6034f;
    private /* synthetic */ il f6035g;

    iw(il ilVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzcff com_google_android_gms_internal_zzcff) {
        this.f6035g = ilVar;
        this.f6029a = atomicReference;
        this.f6030b = str;
        this.f6031c = str2;
        this.f6032d = str3;
        this.f6033e = z;
        this.f6034f = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        synchronized (this.f6029a) {
            Object a;
            try {
                fl flVar = this.f6035g.f18205b;
                if (flVar == null) {
                    this.f6035g.mo1623t().f18134a.m4849a("Failed to get user properties", ft.m16220a(this.f6030b), this.f6031c, this.f6032d);
                    this.f6029a.set(Collections.emptyList());
                    this.f6029a.notify();
                    return;
                }
                AtomicReference atomicReference;
                if (TextUtils.isEmpty(this.f6030b)) {
                    atomicReference = this.f6029a;
                    a = flVar.mo1630a(this.f6031c, this.f6032d, this.f6033e, this.f6034f);
                } else {
                    atomicReference = this.f6029a;
                    a = flVar.mo1629a(this.f6030b, this.f6031c, this.f6032d, this.f6033e);
                }
                atomicReference.set(a);
                this.f6035g.m16466C();
                a = this.f6029a;
                a.notify();
            } catch (RemoteException e) {
                try {
                    this.f6035g.mo1623t().f18134a.m4849a("Failed to get user properties", ft.m16220a(this.f6030b), this.f6031c, e);
                    this.f6029a.set(Collections.emptyList());
                    a = this.f6029a;
                } catch (Throwable th) {
                    this.f6029a.notify();
                }
            }
        }
    }
}
