package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C1780t;

final class C1655d {
    private SharedPreferences f5129a;

    C1655d(Context context) {
        try {
            context = C1780t.m4501h(context);
            this.f5129a = context == null ? null : context.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f5129a = null;
        }
    }

    final String m4244a(String str, String str2) {
        try {
            return this.f5129a == null ? str2 : this.f5129a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    final boolean m4245a(String str) {
        try {
            return this.f5129a == null ? false : this.f5129a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    final float m4246b(String str) {
        try {
            return this.f5129a == null ? 0.0f : this.f5129a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }
}
