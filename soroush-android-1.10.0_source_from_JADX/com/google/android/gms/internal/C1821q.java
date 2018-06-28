package com.google.android.gms.internal;

public final class C1821q implements Runnable {
    private /* synthetic */ String f6271a;
    private /* synthetic */ Runnable f6272b;
    private /* synthetic */ C6582o f6273c;

    public C1821q(C6582o c6582o, String str, Runnable runnable) {
        this.f6273c = c6582o;
        this.f6271a = str;
        this.f6272b = runnable;
    }

    public final void run() {
        this.f6273c.f18396a.m15971a(this.f6271a);
        if (this.f6272b != null) {
            this.f6272b.run();
        }
    }
}
