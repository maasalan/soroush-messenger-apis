package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1809c implements Callable<Boolean> {
    private /* synthetic */ SharedPreferences f5492a;
    private /* synthetic */ String f5493b;
    private /* synthetic */ Boolean f5494c;

    C1809c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f5492a = sharedPreferences;
        this.f5493b = str;
        this.f5494c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f5492a.getBoolean(this.f5493b, this.f5494c.booleanValue()));
    }
}
