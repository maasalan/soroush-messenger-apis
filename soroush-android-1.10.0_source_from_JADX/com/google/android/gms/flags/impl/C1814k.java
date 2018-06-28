package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1814k implements Callable<SharedPreferences> {
    private /* synthetic */ Context f5505a;

    C1814k(Context context) {
        this.f5505a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f5505a.getSharedPreferences("google_sdk_flags", 0);
    }
}
