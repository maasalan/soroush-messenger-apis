package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C1742c;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.maps.model.C1874b;
import com.google.android.gms.maps.model.C1877e;
import com.google.android.gms.maps.model.p163a.C1869a;
import com.google.android.gms.maps.p162a.C1850a;
import com.google.android.gms.maps.p162a.C1857l;
import com.google.android.gms.maps.p162a.C1858m;

public final class C1863d {
    private static boolean f6313a = false;

    public static synchronized int m5214a(Context context) {
        synchronized (C1863d.class) {
            ac.m4377a((Object) context, (Object) "Context is null");
            if (f6313a) {
                return 0;
            }
            try {
                C1858m a = C1857l.m5198a(context);
                try {
                    C1860b.f6311a = (C1850a) ac.m4376a(a.mo1676a());
                    Object b = a.mo1679b();
                    if (C1874b.f6321a == null) {
                        C1874b.f6321a = (C1869a) ac.m4376a(b);
                    }
                    f6313a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new C1877e(e);
                }
            } catch (C1742c e2) {
                return e2.f5299a;
            }
        }
    }
}
