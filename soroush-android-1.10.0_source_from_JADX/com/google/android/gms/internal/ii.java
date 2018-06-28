package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement.C1901g;

final class ii implements Runnable {
    private /* synthetic */ boolean f5994a;
    private /* synthetic */ C1901g f5995b;
    private /* synthetic */ ik f5996c;
    private /* synthetic */ ih f5997d;

    ii(ih ihVar, boolean z, C1901g c1901g, ik ikVar) {
        this.f5997d = ihVar;
        this.f5994a = z;
        this.f5995b = c1901g;
        this.f5996c = ikVar;
    }

    public final void run() {
        Object obj;
        Bundle bundle;
        if (this.f5994a && this.f5997d.f18195a != null) {
            ih.m16430a(this.f5997d, this.f5997d.f18195a);
        }
        if (this.f5995b != null && this.f5995b.f6327d == this.f5996c.d && ju.m16578b(this.f5995b.f6326c, this.f5996c.c)) {
            if (ju.m16578b(this.f5995b.f6325b, this.f5996c.b)) {
                obj = null;
                if (obj != null) {
                    bundle = new Bundle();
                    ih.m16431a(this.f5996c, bundle);
                    if (this.f5995b != null) {
                        if (this.f5995b.f6325b != null) {
                            bundle.putString("_pn", this.f5995b.f6325b);
                        }
                        bundle.putString("_pc", this.f5995b.f6326c);
                        bundle.putLong("_pi", this.f5995b.f6327d);
                    }
                    this.f5997d.mo1609f().m16397a("auto", "_vs", bundle);
                }
                this.f5997d.f18195a = this.f5996c;
                this.f5997d.mo1612i().m16476a(this.f5996c);
            }
        }
        obj = 1;
        if (obj != null) {
            bundle = new Bundle();
            ih.m16431a(this.f5996c, bundle);
            if (this.f5995b != null) {
                if (this.f5995b.f6325b != null) {
                    bundle.putString("_pn", this.f5995b.f6325b);
                }
                bundle.putString("_pc", this.f5995b.f6326c);
                bundle.putLong("_pi", this.f5995b.f6327d);
            }
            this.f5997d.mo1609f().m16397a("auto", "_vs", bundle);
        }
        this.f5997d.f18195a = this.f5996c;
        this.f5997d.mo1612i().m16476a(this.f5996c);
    }
}
