package com.google.firebase.iid;

import android.content.Intent;

final class C2072h implements Runnable {
    private /* synthetic */ Intent f6975a;
    private /* synthetic */ Intent f6976b;
    private /* synthetic */ C2071g f6977c;

    C2072h(C2071g c2071g, Intent intent, Intent intent2) {
        this.f6977c = c2071g;
        this.f6975a = intent;
        this.f6976b = intent2;
    }

    public final void run() {
        this.f6977c.mo1776b(this.f6975a);
        this.f6977c.m5659d(this.f6976b);
    }
}
