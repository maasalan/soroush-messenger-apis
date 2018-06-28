package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.el;

public final class C5488d extends C1808a<Integer> {
    public static Integer m11844a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) el.m4771a(new C1810e(sharedPreferences, str, num));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return num;
        }
    }
}
