package com.google.android.gms.internal;

import android.content.ComponentName;

final class jb implements Runnable {
    private /* synthetic */ ComponentName f6046a;
    private /* synthetic */ iz f6047b;

    jb(iz izVar, ComponentName componentName) {
        this.f6047b = izVar;
        this.f6046a = componentName;
    }

    public final void run() {
        il.m16462a(this.f6047b.f15254c, this.f6046a);
    }
}
