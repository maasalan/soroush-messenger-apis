package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1810e implements Callable<Integer> {
    private /* synthetic */ SharedPreferences f5495a;
    private /* synthetic */ String f5496b;
    private /* synthetic */ Integer f5497c;

    C1810e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f5495a = sharedPreferences;
        this.f5496b = str;
        this.f5497c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f5495a.getInt(this.f5496b, this.f5497c.intValue()));
    }
}
