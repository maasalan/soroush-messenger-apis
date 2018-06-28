package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement.C1901g;

final class iq implements Runnable {
    private /* synthetic */ C1901g f6007a;
    private /* synthetic */ il f6008b;

    iq(il ilVar, C1901g c1901g) {
        this.f6008b = ilVar;
        this.f6007a = c1901g;
    }

    public final void run() {
        fl flVar = this.f6008b.f18205b;
        if (flVar == null) {
            this.f6008b.mo1623t().f18134a.m4846a("Failed to send current screen to service");
            return;
        }
        try {
            long j;
            String str;
            String str2;
            String packageName;
            if (this.f6007a == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f6008b.mo1615l().getPackageName();
            } else {
                j = this.f6007a.f6327d;
                str = this.f6007a.f6325b;
                str2 = this.f6007a.f6326c;
                packageName = this.f6008b.mo1615l().getPackageName();
            }
            flVar.mo1631a(j, str, str2, packageName);
            this.f6008b.m16466C();
        } catch (RemoteException e) {
            this.f6008b.mo1623t().f18134a.m4847a("Failed to send current screen to the service", e);
        }
    }
}
