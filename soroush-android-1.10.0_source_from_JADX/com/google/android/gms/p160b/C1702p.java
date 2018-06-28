package com.google.android.gms.p160b;

import java.util.concurrent.Callable;

public final class C1702p implements Runnable {
    private /* synthetic */ C5442o f5206a;
    private /* synthetic */ Callable f5207b;

    public C1702p(C5442o c5442o, Callable callable) {
        this.f5206a = c5442o;
        this.f5207b = callable;
    }

    public final void run() {
        try {
            this.f5206a.m11744a(this.f5207b.call());
        } catch (Exception e) {
            this.f5206a.m11743a(e);
        }
    }
}
