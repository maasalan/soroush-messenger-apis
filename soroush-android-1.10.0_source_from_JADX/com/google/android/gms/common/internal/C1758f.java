package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

public abstract class C1758f {
    private static final Object f5394a = new Object();
    private static C1758f f5395b;

    public static C1758f m4448a(Context context) {
        synchronized (f5394a) {
            if (f5395b == null) {
                f5395b = new C5467h(context.getApplicationContext());
            }
        }
        return f5395b;
    }

    public final void m4449a(String str, String str2, int i, ServiceConnection serviceConnection) {
        mo1569b(new C1759g(str, str2, i), serviceConnection);
    }

    protected abstract boolean mo1568a(C1759g c1759g, ServiceConnection serviceConnection);

    protected abstract void mo1569b(C1759g c1759g, ServiceConnection serviceConnection);
}
