package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.el;

public final class C5490h extends C1808a<String> {
    public static String m11846a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) el.m4771a(new C1812i(sharedPreferences, str, str2));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str3 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return str2;
        }
    }
}
