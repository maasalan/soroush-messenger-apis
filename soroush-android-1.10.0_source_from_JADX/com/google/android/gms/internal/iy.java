package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class iy implements Runnable {
    private /* synthetic */ AtomicReference f6040a;
    private /* synthetic */ zzcff f6041b;
    private /* synthetic */ boolean f6042c;
    private /* synthetic */ il f6043d;

    iy(il ilVar, AtomicReference atomicReference, zzcff com_google_android_gms_internal_zzcff, boolean z) {
        this.f6043d = ilVar;
        this.f6040a = atomicReference;
        this.f6041b = com_google_android_gms_internal_zzcff;
        this.f6042c = z;
    }

    public final void run() {
        synchronized (this.f6040a) {
            Object obj;
            try {
                fl flVar = this.f6043d.f18205b;
                if (flVar == null) {
                    this.f6043d.mo1623t().f18134a.m4846a("Failed to get user properties");
                    this.f6040a.notify();
                    return;
                }
                this.f6040a.set(flVar.mo1626a(this.f6041b, this.f6042c));
                this.f6043d.m16466C();
                obj = this.f6040a;
                obj.notify();
            } catch (RemoteException e) {
                try {
                    this.f6043d.mo1623t().f18134a.m4847a("Failed to get user properties", e);
                    obj = this.f6040a;
                } catch (Throwable th) {
                    this.f6040a.notify();
                }
            }
        }
    }
}
