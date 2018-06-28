package com.google.firebase.crash;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.C1786e;
import com.google.android.gms.internal.ek;
import com.google.android.gms.internal.mg;
import com.google.android.gms.internal.mi;
import com.google.android.gms.internal.mj;
import com.google.android.gms.internal.mm;
import com.google.firebase.C2053a;

public final class C2061c {
    String f6928a = null;
    final C2053a f6929b;
    final Context f6930c;

    C2061c(C2053a c2053a) {
        this.f6930c = c2053a.m5597a();
        this.f6929b = c2053a;
    }

    public final mg m5604a() {
        Throwable e;
        mm.m4999a(this.f6930c);
        if (((Boolean) ek.m4769b().m4767a(mm.f6139a)).booleanValue()) {
            mg b;
            try {
                mi.m4995a().f6137a = this.f6930c;
                b = mi.m4995a().m4996b();
                try {
                    String valueOf = String.valueOf(mi.m4995a());
                    StringBuilder stringBuilder = new StringBuilder(33 + String.valueOf(valueOf).length());
                    stringBuilder.append("FirebaseCrash reporting loaded - ");
                    stringBuilder.append(valueOf);
                    Log.i("FirebaseCrash", stringBuilder.toString());
                    return b;
                } catch (mj e2) {
                    e = e2;
                    Log.e("FirebaseCrash", "Failed to load crash reporting", e);
                    C1786e.m4522a(this.f6930c, e);
                    return b;
                }
            } catch (Throwable e3) {
                e = e3;
                b = null;
                Log.e("FirebaseCrash", "Failed to load crash reporting", e);
                C1786e.m4522a(this.f6930c, e);
                return b;
            }
        }
        Log.w("FirebaseCrash", "Crash reporting is disabled");
        return null;
    }
}
