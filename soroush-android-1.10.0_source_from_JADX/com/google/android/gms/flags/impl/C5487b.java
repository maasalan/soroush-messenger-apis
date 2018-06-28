package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.el;

public final class C5487b extends C1808a<Boolean> {
    public static Boolean m11843a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) el.m4771a(new C1809c(sharedPreferences, str, bool));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return bool;
        }
    }
}
