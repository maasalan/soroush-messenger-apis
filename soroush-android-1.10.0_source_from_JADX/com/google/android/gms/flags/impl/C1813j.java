package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.el;

public final class C1813j {
    private static SharedPreferences f5504a;

    public static SharedPreferences m4573a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f5504a == null) {
                f5504a = (SharedPreferences) el.m4771a(new C1814k(context));
            }
            sharedPreferences = f5504a;
        }
        return sharedPreferences;
    }
}
