package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.util.Log;

final class lc extends ky<String> {
    lc(le leVar, String str) {
        super(leVar, str);
    }

    private final String m11996b(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.c, null);
        } catch (Throwable e) {
            String str = "PhenotypeFlag";
            String str2 = "Invalid string value in SharedPreferences for ";
            String valueOf = String.valueOf(this.c);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return null;
        }
    }

    public final /* synthetic */ Object mo1650a(SharedPreferences sharedPreferences) {
        return m11996b(sharedPreferences);
    }

    public final /* synthetic */ Object mo1651a(String str) {
        return str;
    }
}
