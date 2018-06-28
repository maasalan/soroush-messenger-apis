package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class io implements Runnable {
    private /* synthetic */ AtomicReference f6002a;
    private /* synthetic */ zzcff f6003b;
    private /* synthetic */ il f6004c;

    io(il ilVar, AtomicReference atomicReference, zzcff com_google_android_gms_internal_zzcff) {
        this.f6004c = ilVar;
        this.f6002a = atomicReference;
        this.f6003b = com_google_android_gms_internal_zzcff;
    }

    public final void run() {
        synchronized (this.f6002a) {
            Object obj;
            try {
                fl flVar = this.f6004c.f18205b;
                if (flVar == null) {
                    this.f6004c.mo1623t().f18134a.m4846a("Failed to get app instance id");
                    this.f6002a.notify();
                    return;
                }
                this.f6002a.set(flVar.mo1640c(this.f6003b));
                String str = (String) this.f6002a.get();
                if (str != null) {
                    this.f6004c.mo1609f().m16396a(str);
                    this.f6004c.mo1624u().f18154i.m4858a(str);
                }
                this.f6004c.m16466C();
                obj = this.f6002a;
                obj.notify();
            } catch (RemoteException e) {
                try {
                    this.f6004c.mo1623t().f18134a.m4847a("Failed to get app instance id", e);
                    obj = this.f6002a;
                } catch (Throwable th) {
                    this.f6002a.notify();
                }
            }
        }
    }
}
