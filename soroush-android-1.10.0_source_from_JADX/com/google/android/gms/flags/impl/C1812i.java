package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1812i implements Callable<String> {
    private /* synthetic */ SharedPreferences f5501a;
    private /* synthetic */ String f5502b;
    private /* synthetic */ String f5503c;

    C1812i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f5501a = sharedPreferences;
        this.f5502b = str;
        this.f5503c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f5501a.getString(this.f5502b, this.f5503c);
    }
}
