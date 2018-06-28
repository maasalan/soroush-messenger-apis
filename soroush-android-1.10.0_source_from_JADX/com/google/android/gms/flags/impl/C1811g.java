package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1811g implements Callable<Long> {
    private /* synthetic */ SharedPreferences f5498a;
    private /* synthetic */ String f5499b;
    private /* synthetic */ Long f5500c;

    C1811g(SharedPreferences sharedPreferences, String str, Long l) {
        this.f5498a = sharedPreferences;
        this.f5499b = str;
        this.f5500c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f5498a.getLong(this.f5499b, this.f5500c.longValue()));
    }
}
