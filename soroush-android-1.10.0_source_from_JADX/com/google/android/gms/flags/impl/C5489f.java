package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.el;

public final class C5489f extends C1808a<Long> {
    public static Long m11845a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) el.m4771a(new C1811g(sharedPreferences, str, l));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return l;
        }
    }
}
