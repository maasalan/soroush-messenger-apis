package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1786e;
import com.google.android.gms.dynamite.DynamiteModule;

public final class mi {
    private static mi f6136b;
    public Context f6137a;

    private mi() {
    }

    public static synchronized mi m4995a() {
        mi miVar;
        synchronized (mi.class) {
            if (f6136b == null) {
                f6136b = new mi();
            }
            miVar = f6136b;
        }
        return miVar;
    }

    public final mg m4996b() {
        try {
            Object a = DynamiteModule.m4558a(this.f6137a, DynamiteModule.f5477b, "com.google.android.gms.crash");
            ac.m4376a(a);
            IBinder a2 = a.m4567a("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl");
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
            return queryLocalInterface instanceof mg ? (mg) queryLocalInterface : new mh(a2);
        } catch (Throwable e) {
            C1786e.m4522a(this.f6137a, e);
            throw new mj(e);
        }
    }
}
