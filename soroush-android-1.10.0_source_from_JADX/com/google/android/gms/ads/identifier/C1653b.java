package com.google.android.gms.ads.identifier;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

public class C1653b {
    private static C1653b f5124b;
    final Context f5125a;

    private C1653b(Context context) {
        this.f5125a = context;
    }

    public static C1653b m4242a(Context context) {
        C1653b c1653b;
        synchronized (C1653b.class) {
            if (f5124b == null) {
                f5124b = new C1653b(context);
            }
            c1653b = f5124b;
        }
        return c1653b;
    }

    final void m4243a(Info info, boolean z, long j) {
        if (Math.random() <= ((double) new C1655d(this.f5125a).m4246b("gads:ad_id_use_shared_preference:ping_ratio"))) {
            new Thread(new C1654c(info, z, j)).start();
        }
    }
}
